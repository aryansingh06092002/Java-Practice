import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Natural Number : ");
       int N = sc.nextInt();
       int i = 1;
//       int sum = 0;
//       do {
//           System.out.println(i);
//           i++;
//       }while (i<=N);
//        for ( i = 1; i <= N; i++){
//             sum=  sum + i;
//        } System.out.println("Sum of first " + N + " natural numbers is: " + sum);
        for (i=1; i<=N;i++){
            System.out.println(i);
//            if(i==4){
//                System.out.println("Loop Will Break Here!!");
//                continue;
//            }System.out.println("Aryan Singh");
        }
    }
}
