import java.util.Scanner;

public class multiplication{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number :");
//        float a = ab.nextFloat();
//        System.out.println("Enter Second Number :");
//        float b = ab.nextFloat();
//        float multiplication = a*b;
//        System.out.println("Multiplication of Two Floating Number is :" + multiplication);
        System.out.print("Enter a Number : ");
        int N = sc.nextInt();
        int a = 1;
        int sum = 0;
        for(a = 1; a<=10; a++){
            sum += N*a;
            System.out.println(N +" X " + a +" = " +N*a);
        }System.out.println("Sum of Multiplication of "+N +" = "+sum);
        sc.close();
    }
}