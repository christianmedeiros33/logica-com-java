public class IncomeTax {
    public static void main(String[] args) {
        double salary = 4000.0D;
        if (salary <= 2112.00){
            System.out.println("isento");
        } else if (salary >= 2112.01 && salary <= 2826.65){
            System.out.println("7.5% : total a pagar de IR = r$" + (salary * 0.075));
        }  else if (salary >= 2826.66 && salary <= 3751.05){
            System.out.println("15% : total a pagar de IR = r$" + (salary * 0.15));
        }  else if (salary >= 3751.06  && salary <= 4664.68){
                System.out.println("22.5% : total a pagar de IR = r$" + (salary * 0.225));
        } else{
            System.out.println("27.5% : total a pagar de IR = r$" + (salary * 0.275));
        }
    }
}
