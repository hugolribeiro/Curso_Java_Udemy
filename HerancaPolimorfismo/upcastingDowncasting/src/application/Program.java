package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        // Um objeto da subclasse é atribuído para uma variável da superclasse
        // Será pegar um objeto do tipo businessAccount e atribuir para Account
        // Uma BusinessAccount É UMA Account

        Account acc1 = bacc;
        System.out.println(acc1.getBalance());

        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);

        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.0);


        // DOWNCASTING
        // É converter um objeto da superclasse para a subclasse

//        BusinessAccount acc4 = acc2;  Erro! Não posso converter de Account para BusinessAccount

        // Caso eu queria forçar a conversão, terei que fazer um cast manual
        BusinessAccount acc4 = (BusinessAccount) acc2;
        System.out.println(acc4.getLoanLimit());

        // Assim dá erro. SavingAccount não pode ser convertido para BusinessAccount
//        BusinessAccount acc5 = (BusinessAccount) acc3;
//        System.out.println(acc5.getLoanLimit());

        // Podemos utilizar o instanceof para checarmos antes de efetuar a operação

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }
}
