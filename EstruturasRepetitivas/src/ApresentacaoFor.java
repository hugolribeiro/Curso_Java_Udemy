import java.util.Scanner;

public class ApresentacaoFor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int repeatedTimes = sc.nextInt();
         int sum = 0;
         for (int index = 0; index < repeatedTimes; index ++){
             int number = sc.nextInt();
             sum += number;
         }
        System.out.println(sum);

         sc.close();
    }
}
