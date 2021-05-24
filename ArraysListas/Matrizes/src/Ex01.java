/*
Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
Em seguida, mostrar a diagonal principal e a quantidade de valores negativos na matriz.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Amount lines and columns: ");
        int matrixGrid = sc.nextInt();
        int[][] matrixNumbers = new int[matrixGrid][matrixGrid];
        int amountNegative = 0;
        for (int line=0; line < matrixGrid; line ++){
            for (int column=0; column < matrixGrid; column ++){
                System.out.print("Line " + line + "   Column " + column + ": ");
                matrixNumbers[line][column] = sc.nextInt();
            }
        }
        for (int line=0; line < matrixGrid; line++){
            for (int column=0; column < matrixGrid; column ++){
                if (line == column){
                    System.out.print(matrixNumbers[line][column] + " ");
                }
                if (matrixNumbers[line][column] < 0){
                    amountNegative += 1;
                }
            }
        }
        System.out.println("\nAmount of negatives numbers: " + amountNegative);
        sc.close();
    }
}
