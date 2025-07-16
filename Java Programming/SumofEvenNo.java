import java.util.Scanner;

public class SumofEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number : ");
        int N = sc.nextInt();
        int b = 1;
        int sum = 0;
//        for(b=1; b<= N; b++){
//            if (b % 2 == 0){
//                sum = b + sum;
//                System.out.println(b);
//            }
//        }System.out.println("Sum of Even Number are : "+sum);
//        sc.close();
        while (b<=N){
            if (b % 2 == 0){
                sum = sum + b;
                System.out.println(b);
            }b++;
        }
        System.out.println("Sum of Even Numbers is : "+sum);
    }
}
