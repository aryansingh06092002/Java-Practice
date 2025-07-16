import java.util.Scanner;

public class CoditionsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        if (a>0){
//            System.out.println("Number is Positive");
//        }
//        else {
//            System.out.println("Number is Negative");
//        }
//
//        if (a %3 == 0 && a%5 == 0){
//            System.out.println("Divisible by both 3 and 5");
//        }
//        else {
//            System.out.println("Not Divisible by both");
//        }
//        sc.close();
        int greatest ;
        if(a >= b && a >= c){
            greatest = a;
        } else if(b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }
        System.out.println("Greatest number is: " + greatest);
    }
}
