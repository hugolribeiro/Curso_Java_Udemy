import java.util.Scanner;

/*
Reads the initial hour and the final hour of a game.
After that, calculate the duration of the game, knowing the game can start at one day and finish in another day.
The minimum duration is equal to 1 hour and the maximum is equal to 24 hours.

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

@ Programmer: Hugo Leça Ribeiro
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialHour, finishHour, duration;
        System.out.print("Initial hour: ");
        initialHour = sc.nextInt();
        System.out.print("Finished hour: ");
        finishHour = sc.nextInt();
        if (finishHour > initialHour){
            duration = finishHour - initialHour;
        }
        else{
            duration = finishHour + 24 - initialHour;
        }
        System.out.println("The game lasted " + duration + " hours");

        sc.close();
    }
}
