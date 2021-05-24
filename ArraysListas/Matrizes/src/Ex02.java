import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz
de M linhas por N colunas contendo números inteiros, podendo haver repetições.
Em seguida, ler um número inteiro X que pertence à Matriz.
Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver,
conforme exemplo.
 */
public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int lines, columns;
        System.out.print("Amount of lines: ");
        lines = sc.nextInt();
        System.out.print("Amount of columns: ");
        columns = sc.nextInt();
        int[][] matrixNumbers = new int[lines][columns];

        for (int line=0; line < lines; line ++){
            for (int column=0; column < columns; column ++){
                matrixNumbers[line][column] =  sc.nextInt();
            }
            sc.nextLine();
        }
        for (int line=0; line < lines; line ++){
            for (int column=0; column < columns; column ++){
                System.out.print(matrixNumbers[line][column] + " ");
            }
            System.out.println();
        }
        System.out.print("\nInput a number X: ");
        int numberToFind = sc.nextInt();
        for (int line=0; line < lines; line ++){
            for (int column=0; column < columns; column ++){
                if (matrixNumbers[line][column] == numberToFind){
                    System.out.println("\nPosition: " + line + ", " + column + ":");
                    if (column > 0){
                        System.out.println("Left: " + matrixNumbers[line][column-1]);
                    }
                    if (line > 0){
                        System.out.println("Up: " + matrixNumbers[line-1][column]);
                    }
                    if (column < (columns-1)){
                        System.out.println("Right: " + matrixNumbers[line][column+1]);
                    }
                    if (line < lines-1){
                        System.out.println("Down: " + matrixNumbers[line+1][column]);
                    }
                }
            }
        }

        sc.close();
    }
}
