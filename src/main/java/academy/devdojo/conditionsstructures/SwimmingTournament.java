package academy.devdojo.conditionsstructures;

import java.util.Scanner;

public class SwimmingTournament {
    public static void main(String[] args) {
        Scanner person = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String name = person.next();
        System.out.println("Qual sua idade? ");
        int age = person.nextInt();
        if (age < 11) {
            System.out.println(name + " participará da categoria Infantil");
        } else if (age >= 11 && age <= 15) {
            System.out.println(name + " participará da categoria Juvenil");
        } else if (age >= 16 && age <= 19) {
            System.out.println(name + " participará da categoria Pré-adulto");
        } else {
            System.out.println(name + " participará da categoria Adulto");
        }
    }
}
