import java.util.Scanner;

/*
Make a program that repeats the read of a password until it be a valid password.
For each invalid password, write the message "Invalid Password".
When the password is valid, write the message "Access Allowed" and end the program
The correct password is: "2002"

Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

@ Programmer: Hugo Leça Ribeiro
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 2002;
        int inputtedPassword = sc.nextInt();
        while (inputtedPassword != password){
            System.out.println("Invalid Password");
            inputtedPassword = sc.nextInt();
        }
        System.out.println("Access Allowed");
    }
}
