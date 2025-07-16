import java.util.Scanner;
public class PracticeSetCh05 {
    public static void main(String[] args) {
        // Question 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number : ");
        int N = sc.nextInt();
        int b = 1;
        int factorial = 1;
//        int sum = 0;
//        while (b<=N){
//            if (b % 2 == 0){
//                sum = sum + b;
//                System.out.println(b);
//            }b++;
//        }
//        System.out.println("Sum of Even Numbers is : "+sum);

        //Question 3
//        while (b > 0){
//            System.out.println(N +" X " + b + " = " +N*b);
//            b--;
//        }
        // Question 4 (Factorial)
        for (b=1; b<=N; b++){
            factorial *= b;
        }  System.out.println(factorial);
    }
}
