import java.util.Scanner;

/*
Make a program that reads the number of an employee, your worked hours, the value per worked hour.
Calculate the employee's income.
Show the employee's income with 2 decimal point.

 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeNumber, workedHours;
        double valueHour, income;
        System.out.print("Employee's number: ");
        employeeNumber = sc.nextInt();
        System.out.print("Worked hours: ");
        workedHours = sc.nextInt();
        System.out.print("Value per hour: ");
        valueHour = sc.nextDouble();
        income = workedHours * valueHour;
        System.out.println("Number: " + employeeNumber);
        System.out.printf("Income: U$ %.2f%n", income);
    }
}
