package academy.devdojo.repeatingloops.whiles;

import java.util.Scanner;

public class ExemploOdd {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor desejado");

        int valorFinal = entrada.nextInt();
        int i = 0;

        while (i <= valorFinal) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
    }
}

