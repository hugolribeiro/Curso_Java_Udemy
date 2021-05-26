package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Input here the amount of products: ");
        int amountProducts = sc.nextInt();
        double productPrice;
        String productName;
        double avgPrice = 0;
        double totalPrice = 0;
        Product[] products = new Product[amountProducts];

        for (int index=0; index < amountProducts; index++){
            sc.nextLine();
            System.out.print((index+1) + " - Product name: ");
            productName = sc.nextLine();
            System.out.print((index+1) + " - Product price: ");
            productPrice = sc.nextDouble();
            products[index] = new Product(productName, productPrice);
            totalPrice += productPrice;
        }
        avgPrice = totalPrice / amountProducts;
        System.out.println("Average price: " + avgPrice);
        sc.close();
    }
}
