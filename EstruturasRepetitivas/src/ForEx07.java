/*
Make a program that reads an integer positive number N.
The program will show N lines. For each line, show the line number, the square and the cube of the value.

Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.

@Programmer: Hugo Leça Ribeiro
 */

import java.util.Scanner;

public class ForEx07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountLines = sc.nextInt();
        for (int actualLine = 1; actualLine <= amountLines; actualLine ++){
            System.out.printf("%d %d %d%n", actualLine, actualLine * actualLine, actualLine * actualLine * actualLine);
        }
        sc.close();
    }
}
