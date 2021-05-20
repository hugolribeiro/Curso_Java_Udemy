package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int accNumber;
        String accHolderName;
        double accBalance;
        BankAccount account1;
        String initialDeposit;

        System.out.print("Enter account number: ");
        accNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        accHolderName = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        initialDeposit = sc.nextLine();
        if (initialDeposit.equals("y")){
            System.out.print("Enter initial deposit value: ");
            accBalance = sc.nextDouble();
            account1 = new BankAccount(accNumber, accHolderName, accBalance);
        }
        else {
            account1 = new BankAccount(accNumber, accHolderName);
        }
        System.out.println("\nAccount data:");
        System.out.println(account1.toString());

        System.out.print("\nEnter a deposit value: ");
        account1.makeDeposit(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account1.toString());

        System.out.print("\nEnter a withdraw value: ");
        account1.makeWithdraw(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account1.toString());

        sc.close();

    }
}
