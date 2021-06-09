import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args){

        method1();
        System.out.println("Fim do Programa");
    }

    public static void method1(){
        System.out.println("*****Metodo 1 start*****");
        method2();
        System.out.println("*****Metodo 1 end*****");
    }

    public static void method2(){
        System.out.println("*****Metodo 2 start*****");
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("*****Metodo 2 end*****");
    }
}
