package academy.devdojo.arrays;

public class introductionArrays {
    public static void main(String[] args) {

        double nota1 = 5.5;
        double nota2 = 6.5;

        System.out.println("media: " + (nota1 + nota2) / 2);

        double[] notas = new double[4];
        notas[0] = 1.2;
        notas[1] = 5.3;
        notas[2] = 8.6;
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
    }
}
