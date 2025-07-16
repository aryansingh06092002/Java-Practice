import java.util.Scanner;
public class FactorialUsingLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();
        int b = 1;
        int Factorial = 1;
//        for(b =1; b<=a; b++){
//            Factorial *= b;
//        }System.out.println("Factorial of "+ a +" = " +Factorial);

//        while (b<=a){
//            Factorial *= b;
//            b++;
//        }
//        System.out.println("Factorial of "+ a +" = " +Factorial);

        do {
            Factorial *= b;
            b++;
        }while (b<=a);
        System.out.println("Factorial of "+ a +" = " +Factorial);
    }
}
