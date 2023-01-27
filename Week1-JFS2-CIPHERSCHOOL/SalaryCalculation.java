import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        
        System.out.println("Enter basic pay");
        double basicpay = sc.nextFloat();
        double hra = 0,da = 0;

        if(basicpay>=5000){
            hra = 0.1*basicpay;
            da = 0.2*basicpay;
        }
        else{
            hra = 0.2*basicpay;
            da= 0.2*basicpay;;
        }
        System.out.println(hra+""+da);
        System.out.println(basicpay+""+da);
    }
}
}