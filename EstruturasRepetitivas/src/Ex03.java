import java.util.Scanner;

/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.

@ Programmer: Hugo Leça Ribeiro
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcohol = 0, gas = 0, diesel = 0;
        int fuelCode = sc.nextInt();
        while (fuelCode != 4){
            if (fuelCode == 1){
                alcohol += 1;
            }
            else if (fuelCode == 2){
                gas += 1;
            }
            else if (fuelCode == 3){
                diesel += 1;
            }
            else {
                System.out.println("Invalid number!");
            }
            fuelCode = sc.nextInt();
        }
        System.out.println("Thank you");
        System.out.println("Alcohol: " + alcohol + " customers");
        System.out.println("Gas: " + gas + " customers");
        System.out.println("Diesel: " + diesel + " customers");
        sc.close();
    }
}
