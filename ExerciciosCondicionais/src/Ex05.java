import java.util.Scanner;

/*
By according of the table below, write a program that reads the item code and the amount of this item.
Next to it, calculate and show the value of de bill to pay.

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

Code                ESPECIFICATION       PRICE
1                   HOT-DOG               R$ 4.00
2                   X-SALAD               R$ 4.50
3                   X-BACON               R$ 5.00
4                   TOASTED BREAD         R$ 2.00
5                   SODA                  R$ 1.50


@ Programmer: Hugo Leça Ribeiro
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code, amount;
        double total = 0;
        System.out.print("Code: ");
        code = sc.nextInt();
        System.out.print("Amount: ");
        amount = sc.nextInt();
        switch (code) {
            case 1 -> total = 4 * amount;
            case 2 -> total = 4.5 * amount;
            case 3 -> total = 5 * amount;
            case 4 -> total = 2 * amount;
            case 5 -> total = 1.5 * amount;
        }
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
