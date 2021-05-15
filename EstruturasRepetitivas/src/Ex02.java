import java.util.Scanner;

/*
Make a program to read the coordinates (x, y). For each coordinate, write the quadrant.
If someone variable is null (0) end the program without write any message.

Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

@ Programmer: Hugo Leça Ribeiro
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("First");
            }
            else if (x < 0 && y > 0){
                System.out.println("Second");
            }
            else if (x < 0 && y < 0){
                System.out.println("Third");
            }
            else {
                System.out.println("Fourth");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
