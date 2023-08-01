package academy.devdojo.arrays;

public class ArrayMulti {
    public static void main(String[] args) {
        int[][] arrayMult = new int[2][3];

        arrayMult[0][0] = 22;
        arrayMult[0][1] = 25;
        arrayMult[1][2] = 28;

        System.out.println(arrayMult[0][0]);
        System.out.println(arrayMult[0][1]);
        System.out.println(arrayMult[1][2]);
    }
}
