package academy.devdojo.conditionsstructures.ifelse;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        int day = 9;

        if (day == 1) {
            System.out.println("segunda");
        } else if (day == 2) {
            System.out.println("terça");
        } else if (day == 3) {
            System.out.println("quarta");

        } else if (day == 4) {
            System.out.println("quinta");
        } else if (day == 5) {
            System.out.println("sexta");
        } else if (day == 6) {
            System.out.println("sabado");
        } else if (day == 7) {
            System.out.println("domingo");
        } else {
            System.out.println("invalido");
        }
    }
}
