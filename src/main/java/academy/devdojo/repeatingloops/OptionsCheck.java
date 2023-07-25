package academy.devdojo.repeatingloops;

import java.util.Scanner;

public class OptionsCheck {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("-  Digite uma opção  -");
            System.out.println("1 - Calcular imposto");
            System.out.println("2 - Depositar salário");
            System.out.println("3 - Sair");
            opcao = teclado.nextInt();
        }
        System.out.println("Saiu do menu");
    }
}
