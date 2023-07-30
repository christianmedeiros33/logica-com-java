package academy.devdojo.arrays;

import java.util.Scanner;

public class arrayWithSingleFor {
    public static void main(String[] args) {

        double[] notes = new double[4];
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notes[i] = scanner.nextDouble();
            sum += notes[i];
        }

        double average = sum / notes.length;
        System.out.println("media das notas: " + average);
    }
}
