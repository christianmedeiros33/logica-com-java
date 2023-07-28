package academy.devdojo.repeatingloops;

import java.util.Scanner;

public class PasswordConfirmation {
    public static void main(String[] args) {

        final String username = "1234";
        final String password = "1234";
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("Digite seu login.");
            String inputUsername = scanner.nextLine();
            System.out.println("Digite sua senha.");
            String inputPassword = scanner.nextLine();
            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("acesso concedido");
                break;
            }
            System.out.println("Acesso negado");
        }
    }
}
