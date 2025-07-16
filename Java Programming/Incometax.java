import java.util.Scanner;

public class Incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Annual Income: ₹");
        double income = sc.nextDouble();
        double tax = 0;

        if (income < 250000){
            tax = 0;
        }else if (income > 250000 && income <= 500000) {
        tax = 0.05 * (income - 250000);
        } else if (income > 500000 && income <=1000000) {
            tax = 0.05 * (500000- 250000);
            tax += 0.20 * (income - 500000);
        }else if (income > 1000000) {
            tax = 0.05 * (500000- 250000);
            tax += 0.20 * (1000000 - 500000);
            tax += 0.30 * (income -1000000);
        }
        System.out.println("Total TAX You have to Pay : " +tax);
        sc.close();
    }
}
