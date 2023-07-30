package academy.devdojo.arrays;

import java.util.Scanner;

public class arraysWithFor {
    public static void main(String[] args) {

        double[] notes = new double[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notes[i] = scanner.nextDouble();
        }

        double average = 0;

        for (int i = 0; i < notes.length; i++) {
            average = average + notes[i];
            System.out.println("\nNota " + (i + 1) + ": " + notes[i]);
        }

        average = average / notes.length;
        System.out.println("\nMedia notas: " + average);
    }
}

