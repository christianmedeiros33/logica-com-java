package academy.devdojo.conditionsstructures;

import java.util.Scanner;

public class Enlistment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu sexo? DIGITE: M (masculino) ou  F (feminino): ");
        String sex = input.next();

        System.out.println("Qual sua idade?");
        int age = input.nextInt();

        if (sex.equalsIgnoreCase("M") && age >= 18) {
            System.out.println("Alistamento obrigatorio.");
        } else if (sex.equalsIgnoreCase("M") && age < 18) {
            System.out.println("Alistamento não permitido.");
        } else {
            System.out.println("Sexo inválido!");
        }

        if (sex.equalsIgnoreCase("F") && age >= 18) {
            System.out.println("Deseja se alistar? DIGITE: S (sim) ou N (não)");
            String enlistment = input.next();
            if (enlistment.equalsIgnoreCase("S")) {
                System.out.println("Alistamento concluido.");
            } else {
                System.out.println("Alistamento cancelado.");
            }
        }
    }
}


