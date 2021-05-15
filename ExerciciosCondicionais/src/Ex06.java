import java.util.Scanner;

/*
Make a program that reads any value and says in which range this value is in.
Ranges: [0-25] [>25-50] [>50-75] [>75-100]
If the value isn't in any range, say "Out of range"

Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

@ Programmer: Hugo Leça Ribeiro
 */
public class Ex06 {
    public static void main(String[] args) {
        double value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Value: ");
        value = sc.nextDouble();
        if (value >= 0 && value <= 25){
            System.out.println("Range [0, 25]");
        }
        else if (value > 25 && value <= 50){
            System.out.println("Range [25-50]");
        }
        else if (value > 50 && value <= 75){
            System.out.println("Range [50-75");
        }
        else if (value > 75 && value <= 100){
            System.out.println("Range [75-100]");
        }
        else{
            System.out.println("Value out of range");
        }
        sc.close();
    }
}
