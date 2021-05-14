import java.util.Scanner;

/*
Make a program to read the circle radius. After show the value of this circle area with four decimal points.
Formula: area = π . radius2
π = 3.14159
 */
public class Ex02 {
    public static void main(String[] args) {
        double area, radius, PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        area = radius * radius * PI;
        System.out.printf("A = %.4f%n", area);
        sc.close();
    }
}
