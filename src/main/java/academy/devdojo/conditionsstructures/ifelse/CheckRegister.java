package academy.devdojo.conditionsstructures.ifelse;

import java.util.Scanner;

public class CheckRegister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digitar seu nome: ");
        String nome = input.next();

        if (nome.equalsIgnoreCase("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("ERRO USUARIO PRIVADO.");
            
        } else {
            System.out.println(nome + ": usuario cadastrado.");
        }
    }
}
