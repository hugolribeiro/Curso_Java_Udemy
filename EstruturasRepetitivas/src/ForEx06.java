/*
Read an integer number N and calculate all of its divisors

Ler um número inteiro N e calcular todos os seus divisores.

@Programmer: Hugo Leça Ribeiro
*/

import java.util.Scanner;

public class ForEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int divisor = 1; divisor <= number; divisor += 1){
            if (number % divisor == 0){
                System.out.println(divisor);
            }
        }
        sc.close();
    }
}
