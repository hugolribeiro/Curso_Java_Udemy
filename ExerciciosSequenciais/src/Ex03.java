import java.util.Scanner;

/*
Make a program to read four integer values: A, B, C and D.
After that, calculate and show the difference of the product of A and B per product of C and D.
Formula: Difference = (A * B - C * D).
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, dif;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        dif = (a * b) - (c * d);
        System.out.println("Difference: " + dif);
        sc.close();
    }
}
