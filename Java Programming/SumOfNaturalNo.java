import java.util.Scanner;
 public class SumOfNaturalNo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Natural Number : ");
         int N = sc.nextInt();
         int i = 1;
         int sum = 0;
         for ( i=1 ; i<= N; i++) {
             sum =sum + i;

//         while (i <= N){
//             sum = sum + i;
//             i++;
//         }
//         System.out.println("Sum of N numbers : "+sum);
//         sc.close();
         }System.out.println(sum);
     }
 }