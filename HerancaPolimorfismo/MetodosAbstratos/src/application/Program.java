package application;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int amountShapes;
        char shapeType;
        Color shapeColor;
        List<Shape> shapesList = new ArrayList<Shape>();
        Shape actualShape = null;

        System.out.print("Enter the number of shapes: ");
        amountShapes = sc.nextInt();

        for (int index=1; index <= amountShapes; index ++){
            System.out.println("Shape #" + index + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            shapeType = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            shapeColor = Color.valueOf(sc.next());
            if (shapeType == 'r'){
                System.out.print("Width: ");
                double rectangleWidth = sc.nextDouble();
                System.out.print("Height: ");
                double rectangleHeight = sc.nextDouble();
                actualShape = new Rectangle(shapeColor, rectangleWidth, rectangleHeight);
            }
            else if (shapeType == 'c'){
                System.out.print("Radius: ");
                double circleRadius = sc.nextDouble();
                actualShape = new Circle(shapeColor, circleRadius);
            }
            shapesList.add(actualShape);
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape thisShape : shapesList){
            System.out.printf("%.2f%n", thisShape.area());
        }
        sc.close();
    }
}
