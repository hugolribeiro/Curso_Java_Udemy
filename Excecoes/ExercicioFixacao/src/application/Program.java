package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int accNumber;
        String accHolder;
        double accBalance;
        double withdrawLimit;


        System.out.println("Enter account data");
        System.out.print("Number: ");
        accNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.next();
        accHolder = sc.nextLine();
        System.out.print("Initial balance: ");
        accBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        withdrawLimit = sc.nextDouble();

        Account account = new Account(accNumber, accHolder, accBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amountWithdraw = sc.nextDouble();

        try{
            account.withdraw(amountWithdraw);
            System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }
}
