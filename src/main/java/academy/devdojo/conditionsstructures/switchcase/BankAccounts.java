package academy.devdojo.conditionsstructures.switchcase;

import java.util.Scanner;

public class BankAccounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opção: \n 1: CONTA_POUPANÇA\n 2: CONTA_CORRENTE \n 3: CONTA_INVESTIMENTO");
        int accounts = input.nextInt();

        switch (accounts) {
            case 1 -> System.out.println("CONTA_POUPANÇA TAXA: 0.05%");
            case 2 -> System.out.println("CONTA_CORRENTE TAXA: 0.05%");
            case 3 -> System.out.println("CONTA_INVESTIMENTO TAXA: 0.05%");
            default -> System.out.println("CONTA INEXISTENTE");
        }
    }
}
