import java.util.Scanner;

public class sub {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter First Nmuber :");
         int a = sc.nextInt();
         System.out.println("Enter second Number :");
         int b = sc.nextInt();
         int sub = a-b;
         System.out.println("Subtraction of Two Number is :" +sub);
    }
}
