import java.util.Scanner;

public class sumofthreenumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println("Enter Third Number :");
        int c = sc.nextInt();
        int Sum = a+b+c;
        System.out.println("Sum of three numbers is :" +Sum);
        sc.close();
    }
}