package application;

import entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.setName(sc.nextLine());
        System.out.print("First Grade: ");
        student.setFirstGrade(sc.nextDouble());
        System.out.print("Second Grade: ");
        student.setSecondGrade(sc.nextDouble());
        System.out.print("Third Grade: ");
        student.setThirdGrade(sc.nextDouble());

        System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));

        if (student.finalGrade() >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", student.missingPoints()) + " POINTS");
        }
        sc.close();
    }
}
