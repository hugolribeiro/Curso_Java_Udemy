/*
Make a program that reads a number N. After that, reads N even of numbers and show the division of the first by
the second. If the second number is zero, show the mesage "Impossible division".

Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

@ Programmer: Hugo Leça Ribeiro
 */

import java.util.Scanner;

public class ForEx04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberN = sc.nextInt();
        for (int index=0; index < numberN; index++){
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            if (number2 != 0){
                double result = (double) number1 / number2;
                System.out.println(result);
            }
            else{
                System.out.println("Impossible Division");
            }
        }
        sc.close();
    }
}
