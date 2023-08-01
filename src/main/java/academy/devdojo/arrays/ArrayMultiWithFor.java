package academy.devdojo.arrays;

import java.util.Scanner;

public class ArrayMultiWithFor {
    public static void main(String[] args) {
        int [][] multiComFor = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < multiComFor.length; i++) {
            for (int j = 0; j < multiComFor[i].length; j++) {
                System.out.println("Digite o numero para posição" + "[" + i + "] [" + j + "] = " );
                multiComFor[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < multiComFor.length; i++) {
            for (int j = 0; j < multiComFor[i].length; j++) {
                System.out.println("[" + i + "] [" + j + "] = " + multiComFor[i][j]);
            }
        }

    }
}
