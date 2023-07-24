package academy.devdojo.variables;

public class ReuseVariables {
    public static void main(String[] args) {
        double salary = 5000;
        double result = salary * 0.3;
        System.out.println(result);
        result = salary * 0.15;
        System.out.println(result);
        result = salary * 0.05;
        System.out.println(result);
        result = salary * 0.02;
        System.out.println(result);
    }
}
