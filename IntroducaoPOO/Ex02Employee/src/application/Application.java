package application;

import entities.enums.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Gross Salary: ");
        emp.setGrossSalary(sc.nextDouble());

        System.out.print("Tax: ");
        emp.setTax(sc.nextDouble());

        System.out.println("Employee: " + emp.toString());

        System.out.print("Which percentage to increase salary? ");
        emp.increaseSalary(sc.nextDouble());

        System.out.println("Updated data: " + emp.toString());

        sc.close();
    }
}
