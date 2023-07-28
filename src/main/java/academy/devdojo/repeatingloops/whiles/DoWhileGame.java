package academy.devdojo.repeatingloops.whiles;

import java.util.Scanner;

public class DoWhileGame {
    public static void main(String[] args) {
        int keepPlaying = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("PLAYER 1: Digite um numero de 1 - 10");
            int numberOne = scanner.nextInt();
            System.out.println("PLAYER 2: Digite um numero de 1 - 10");
            int numberTwo = scanner.nextInt();
            System.out.println("Acertou: " + (numberOne == numberTwo));
            System.out.println("---------------------------");
            System.out.println("Deseja continuar?");
            System.out.println("1.Sim");
            System.out.println("2.não");
            keepPlaying = scanner.nextInt();

        } while (keepPlaying == 1);
        System.out.println("Game finished...");

    }
}
