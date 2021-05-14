import java.util.Scanner;

/*
Make a program that reads a piece code (1), the number of the pieces (1), the unitary value of each piece (1);
the code of piece 2, the number of pieces 2 and the unitary value of each piece 2.
Calculate and show the value to be paid.
 */
public class Ex05 {
    public static void main(String[] args) {
        int codePiece1, numberPieces1, codePiece2, numberPieces2;
        double unitaryPrice1, unitaryPrice2, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Piece1 code: ");
        codePiece1 = sc.nextInt();
        System.out.print("Number of pieces [1]: ");
        numberPieces1 = sc.nextInt();
        System.out.print("Unitary value [1]: ");
        unitaryPrice1 = sc.nextDouble();
        System.out.print("Piece2 code: ");
        codePiece2 = sc.nextInt();
        System.out.print("Number of pieces [2]: ");
        numberPieces2 = sc.nextInt();
        System.out.print("Unitary value [2]: ");
        unitaryPrice2 = sc.nextDouble();
        total = (numberPieces1 * unitaryPrice1) + (numberPieces2 * unitaryPrice2);

        System.out.printf("Value to be paid: R$ %.2f%n", total);

    }
}
