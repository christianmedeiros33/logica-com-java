package academy.devdojo.arrays;

import java.util.Scanner;

public class ArraysExercise {
    public static void main(String[] args) {

        int[] arrayOne = new int[3];
        int[] arrayTwo = new int[3];
        int[] arrayThree = new int[3];

        String multiplicationOfArrays = "";
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.printf("Vetor 1, posição " + i + ": ");
            arrayOne[i] = scanner.nextInt();
            System.out.printf("Vetor 2, posição " + i + ": ");
            arrayTwo[i] = scanner.nextInt();
            arrayThree[i] = arrayOne[i] * arrayTwo[i];
            multiplicationOfArrays = multiplicationOfArrays + arrayThree[i] + " ";
        }

        System.out.printf(multiplicationOfArrays);
    }
}
