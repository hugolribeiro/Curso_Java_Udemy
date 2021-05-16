import java.util.Scanner;

/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
(suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos
e dizer qual dos dois triângulos possui a maior área.

A fórmula para calcular a área de um triângulo a partir das medidas de seus lados
a, b e c é a seguinte (fórmula de Heron):

area = sqrt(p(p-a)(p-b)(p-c)  onde: p = (a + b + c) / 2
 */
public class TrianguloSemPOO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, c, p, area1, area2;
        System.out.println("Enter the measures of triangle X: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = (a + b + c) / 2;
        area1 = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        System.out.println("Enter the measures of triangle Y: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = (a + b + c) / 2;
        area2 = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        System.out.printf("Triangle X area: %.4f%n", area1);
        System.out.printf("Triangle Y area: %.4f%n", area2);
        if (area1 > area2){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
