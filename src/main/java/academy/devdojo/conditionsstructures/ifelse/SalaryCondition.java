package academy.devdojo.conditionsstructures.ifelse;

public class SalaryCondition {
    public static void main(String[] args) {

        float salary = 4600.50F;
        float result = 0F;
        String percentage = "";

        if (salary > 4500) {
            result = salary * 0.30F;
            percentage = "30%";
            System.out.println(result + " : " + percentage);

        } else {
            result = salary * 0.15F;
            percentage = "15%";

            System.out.println(result + " : " + percentage);
        }
    }
}
