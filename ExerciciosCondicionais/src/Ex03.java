import java.util.Scanner;

/*
Make a program that reads two integers numbers (A and B). After that, the program must shows an message:
"Are multiples" or "Are not multiples", saying if the values are multiples with each other.
Attention: the numbers must be able to be entered ascending or descending order.

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

@ Programmer: Hugo Leça Ribeiro
 */
public class Ex03 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        a = sc.nextInt();
        System.out.print("B: ");
        b = sc.nextInt();
        if ((a % b == 0) || (b % a == 0)){
            System.out.println("They are multiples");
        }
        else {
            System.out.println("They aren't multiples");
        }
        sc.close();
    }
}
