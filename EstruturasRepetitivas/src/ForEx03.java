import java.util.Scanner;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.

@ Programmer: Hugo Leça Ribeiro
 */
public class ForEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1, number2, number3, average;
        int amountNumbers = sc.nextInt();
        for (int index = 0; index < amountNumbers; amountNumbers ++){
            number1 = sc.nextDouble();
            number2 = sc.nextDouble();
            number3 = sc.nextDouble();
            average = (number1 * 2 + number2 * 3 + number3 * 5) / 10;
            System.out.printf("%.1f%n", average);
        }
        sc.close();
    }
}
