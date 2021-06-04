package application;

import entities.Individual;
import entities.LegalPerson;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int amountTaxPayers;
        String taxPayerName;
        double taxPayerAnnualIncome;
        char taxPayerType;
        List<TaxPayer> taxPayerList = new ArrayList<TaxPayer>();
        TaxPayer actualTaxPayer;

        System.out.print("Enter the number of tax payers: ");
        amountTaxPayers = sc.nextInt();

        for (int indexTaxPayer=1; indexTaxPayer <= amountTaxPayers; indexTaxPayer++){
            System.out.println("Tax payer #" + indexTaxPayer + " data:");
            System.out.print("Individual or company (i/c)? ");
            taxPayerType = sc.next().charAt(0);
            System.out.print("Name: ");
            taxPayerName = sc.next();
            System.out.print("Anual income: ");
            taxPayerAnnualIncome = sc.nextDouble();
            sc.nextLine();
            if (taxPayerType == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                actualTaxPayer = new Individual(taxPayerName, taxPayerAnnualIncome, healthExpenditures);
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                actualTaxPayer = new LegalPerson(taxPayerName, taxPayerAnnualIncome, numberOfEmployees);
            }
            taxPayerList.add(actualTaxPayer);
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double totalTaxes = 0.0;
        for (TaxPayer txPayer : taxPayerList){
            System.out.println(txPayer.getName() + ": $ " + String.format("%.2f", txPayer.calcTaxes()));
            totalTaxes += txPayer.calcTaxes();
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
        sc.close();
    }
}
