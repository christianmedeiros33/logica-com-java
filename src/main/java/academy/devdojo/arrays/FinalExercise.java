package academy.devdojo.arrays;

public class FinalExercise {
    public static void main(String[] args) {
        int[][] multiplication = new int[3][3];
        multiplication[0][0]= 22;
        multiplication[0][1]= 11;
        multiplication[0][2]= 4;
        multiplication[1][0]= 44;
        multiplication[1][1]= 55;
        multiplication[1][2]= 9;
        multiplication[2][0]= 2;
        multiplication[2][1]= 5;
        multiplication[2][2]= 21;

        int resultMultiplication = 1;
        for (int i = 0; i < multiplication.length; i++) {
            for (int j = 0; j < multiplication[i].length; j++) {
                if (i == j){
                    resultMultiplication = resultMultiplication * multiplication[i][j];
                }
            }
        }
        System.out.println(resultMultiplication);

    }
}
