import java.util.Scanner;

public class SelfPracticeCh05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        int i = 1;
        int sum = 0;
//        int factorial = 1;
//        for (i = 4; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }System.out.print("\n");

//        while (i<=a){
//            System.out.println(2*i);
//            sum = 2*i+sum  ;
//            i++;
//        }System.out.println("Sum of Even Numbers are : "+sum);

//        for(i=10; i>=1; i--){
//            System.out.println(a +" X "+ i +" = "+ i*a);
//        }sc.close();

//        for(i=1; i<=a;i++){
//            System.out.println(i);
//            factoiral =factoiral* i;
//        } System.out.println("Factoril of "+ a  +" is " + "=" + factoiral);
//        sc.close();

//        while (i<=a){
//            System.out.println(i);
//            factorial *= i;
//            i++;
//        }
//        System.out.println("Factorial of "+ a  +" is " + "=" + factorial);
//        sc.close();

//        for (i = 1; i <= 10; i++) {
//            System.out.println(i*a);
//            sum = i*a+sum;
//        }
//        System.out.println("Sum of Multiplication of "+a+" = "+ sum);

      for (i=1;i<=a;i++){

          System.out.println(2*i);
          sum = 2*i+sum;
      } System.out.println(" Sum of Even Numbers are : "+ sum);
    }
}