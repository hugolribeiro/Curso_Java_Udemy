/*
Read an integer value N. This value will be the amount of integers values that will be read.
Show how many that values will be between [10 and 20] and how many will be out of this range.

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

@ Programmer: Hugo Leça Ribeiro
 */

import java.util.Scanner;

public class ForEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountNumbers = sc.nextInt();
        int in = 0, out = 0;
        for (int actualNumber = 0; actualNumber < amountNumbers; actualNumber ++){
            int value = sc.nextInt();
            if (value >= 10  && value <= 20){
                in += 1;
            }
            else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
