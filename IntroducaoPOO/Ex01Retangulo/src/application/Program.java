package application;

import entities.enums.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        rect.setWidth(width);
        rect.setHeight(height);
        System.out.println(rect.toString());

        sc.close();
    }

}
