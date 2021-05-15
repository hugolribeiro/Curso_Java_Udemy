import java.util.Scanner;

/*
Make a program to read an integer number, after that says if this number is negative or not.

Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

@ Programmer: Hugo Leça Ribeiro
 */
public class Ex01 {
    public static void main(String[] args){
        int number;
        System.out.print("Input an integer number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number < 0){
            System.out.println("The number " + number + " is a negative number");
        }
        else{
            System.out.println("The number " + number + " isn't a negative number");
        }
        sc.close();
    }
}
