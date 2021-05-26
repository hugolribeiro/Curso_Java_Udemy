package application;

import entities.RentRoom;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("How many rooms will be rented? ");
        int amountStudents = sc.nextInt();
        sc.nextLine();
        String studentName;
        String studentEmail;
        int numberRoom;
        RentRoom[] rentedRooms = new RentRoom[10];
        for (int student=0; student < amountStudents; student++){
            System.out.println("Rent #" + (student+1) + ":");
            System.out.print("Name: ");
            studentName = sc.nextLine();
            System.out.print("Email: ");
            studentEmail = sc.nextLine();
            System.out.print("Room: ");
            numberRoom = sc.nextInt();
            rentedRooms[numberRoom] = new RentRoom(studentName, studentEmail);
            sc.nextLine();
            System.out.println();
        }
        System.out.println("Busy rooms: ");
        for (int room=0; room < rentedRooms.length; room++){
            if (rentedRooms[room] != null){
                System.out.println((room) + ": " + rentedRooms[room].getNome() + ", "
                + rentedRooms[room].getEmail());
            }
        }
        sc.close();
    }
}
