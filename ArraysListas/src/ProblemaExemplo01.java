/*
Fazer um programa para ler um número inteiro N e a altura de N pessoas.
Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input here how many people: ");
        int n = sc.nextInt();
        float[] peopleHeight = new float[n];
        float actualHeight = 0;
        float averageHeight;
        float totalheight = 0;
        for (int index=0; index < n; index ++){
            System.out.print("Input he height of the " + (index+1) + " person: ");
            actualHeight = sc.nextFloat();
            totalheight += actualHeight;
            peopleHeight[index] = actualHeight;
        }
        averageHeight = totalheight / n;
        System.out.printf("The average of heights is: %.2f%n", averageHeight);
        sc.close();
    }
}
