import java.util.Scanner;

/*
Read an integer value X (1 <= X <= 1000).
After that, show the odd numbers between 1 to X, one value per line, including the X value.

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.

@ Programmer: Hugo Leça Ribeiro
 */
public class ForEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int actualNumber=1; actualNumber <= number; actualNumber += 2){
            System.out.println(actualNumber);
        }
        sc.close();
    }
}
