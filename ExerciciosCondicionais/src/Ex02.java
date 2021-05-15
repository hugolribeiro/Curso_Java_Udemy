import java.util.Scanner;

/*
Make a program that reads an integer number and says if this number is even or odd.
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

@ Programmer: Hugo Leça Ribeiro
 */
public class Ex02 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input here a number: ");
        number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("The number " + number + " is an even number");
        }
        else{
            System.out.println("The number " + number + " is an odd number");
        }
        sc.close();
    }
}
