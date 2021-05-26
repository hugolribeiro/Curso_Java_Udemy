import entities.enums.Triangle;

import java.util.Scanner;

public class TrianguloComPOO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p, area1, area2;
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        area1 = x.area();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        area2 = y.area();

        System.out.printf("Triangle X area: %.4f%n", area1);
        System.out.printf("Triangle Y area: %.4f%n", area2);
        if (area1 > area2){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
