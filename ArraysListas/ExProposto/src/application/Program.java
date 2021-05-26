package application;

import entities.enums.Employee;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int amountEmployees, employeeId;
        String employeeName;
        double employeeIncome;
        System.out.print("How many employees will be registered? ");
        amountEmployees = sc.nextInt();
        System.out.println();
        List<Employee> employees = new ArrayList<>();
        for (int index=0; index < amountEmployees; index ++){
            System.out.println("Employee #" + (index+1) + ":");
            System.out.print("Id: ");
            employeeId = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            employeeName = sc.nextLine();
            System.out.print("Salary: ");
            employeeIncome = sc.nextDouble();
            Employee actualEmployee = new Employee(employeeId, employeeName, employeeIncome);
            employees.add(actualEmployee);
            System.out.println();
        }
        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalaryIncrease = sc.nextInt();

        Employee emp = employees.stream().filter(x -> x.getId() == idSalaryIncrease).findFirst().orElse(null);

        // if (pos == null)
        if (emp == null){
            System.out.println("This id dows not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentageSalaryIncrease = sc.nextDouble();
            emp.increaseIncome(percentageSalaryIncrease);
        }
        System.out.println("\nList of employees: ");
        for (Employee employee : employees){
            System.out.println(employee.getId() +
                             ", " + employee.getName() +
                             ", " + employee.getIncome());
        }
        sc.close();
    }
}
