package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int hours = 0;
        double valuePerHour;
        List<Employee> employees = new ArrayList<Employee>();
        Employee actualEmployee;

        System.out.print("Enter the number of employees: ");
        int amountEmployees = sc.nextInt();
        char outsourced;

        for (int employee = 1; employee <= amountEmployees; employee ++){
            sc.nextLine();
            System.out.println("Employee #" + employee + " data:");
            System.out.print("Outsorced (y/n)? ");
            outsourced = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Hours: ");
            hours = sc.nextInt();
            System.out.print("Value per hour: ");
            valuePerHour = sc.nextDouble();
            if (outsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                actualEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
            }
            else {
                actualEmployee = new Employee(name, hours, valuePerHour);
            }
            employees.add(actualEmployee);
        }
        System.out.println();
        System.out.println("Payments:");

        for (Employee employee : employees){
            System.out.println(employee.getName() + " - $ " + employee.payment());
        }
        sc.close();


    }
}
