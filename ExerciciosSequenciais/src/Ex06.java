import java.util.Scanner;

/*
Make a program that reads three values with two decimal points: A, B and C.
After that, calculate and show:

a) the area of a rectangle triangle with base = A and height = C.
b) The circle area that has radius = C. PI = 3.14159
c) The trapeze area that has base A and B, and height = C
d) The square area that has side = B.
e) Rectangle area that has sides = A and B.
 */
public class Ex06 {
    public static void main(String[] args) {
        double a, b, c, triangle, circle, trapeze, square, rectangle;
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        a = sc.nextDouble();
        System.out.print("B: ");
        b = sc.nextDouble();
        System.out.print("C: ");
        c = sc.nextDouble();

        triangle = a * c / 2;
        circle = 3.14159 * c * c;
        trapeze = ((a + b) / 2) * c;
        square = b * b;
        rectangle = a * b;

        System.out.printf("Triangle: %.3f%n", triangle);
        System.out.printf("Circle: %.3f%n", circle);
        System.out.printf("Trapeze: %.3f%n", trapeze);
        System.out.printf("Square: %.3f%n", square);
        System.out.printf("Rectangle: %.3f%n", rectangle);
    }
}
