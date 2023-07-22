public class SwimmingTournament {
    public static void main(String[] args) {
        String name = "Pedro";
        int age = 19;
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
