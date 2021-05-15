/*
Read a value N. Calculate and write it's factorial.

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.

@Programmer: Hugo Leça Ribeiro
*/

import java.util.Scanner;

public class ForEx05 {
    public static void main(String[] args) {
        int result=1, number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        number = sc.nextInt();
        for (int index=number; index > 0; index --){
            result *= index;
        }
        System.out.println(result);
        sc.close();
    }
}
