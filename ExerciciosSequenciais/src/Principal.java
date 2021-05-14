import java.util.Scanner;

// Make a program to read two integers values, and show at the screen the sum of them.
public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber, sum;
        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();

        sum = firstNumber + secondNumber;
        System.out.println("Soma = " + sum);
        sc.close();
    }
}
