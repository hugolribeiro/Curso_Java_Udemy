package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String productName;
        double productPrice;
        int amountProducts;
        List<Product> productsList = new ArrayList<Product>();
        Product actualProduct;

        System.out.print("Enter the number of products: ");
        amountProducts = sc.nextInt();

        for (int productIndex = 1; productIndex <= amountProducts; productIndex ++){
            System.out.println("Product #" + productIndex + " data:");
            sc.nextLine();
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            productName = sc.nextLine();
            System.out.print("Price: ");
            productPrice = sc.nextDouble();
            if (productType == 'i'){
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                actualProduct = new ImportedProduct(productName, productPrice, customFee);
            }
            else if (productType == 'u'){
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                actualProduct = new UsedProduct(productName, productPrice, manufactureDate);
            }
            else {
                actualProduct = new Product(productName, productPrice);
            }
            productsList.add(actualProduct);
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product thisProduct : productsList){
            System.out.println(thisProduct.priceTag());
        }

        sc.close();
    }
}
