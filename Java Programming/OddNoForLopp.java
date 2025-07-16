import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class OddNoForLopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural Number : ");
//        int N = sc.nextInt();
//        int i = 1;
//        for (i=1 ; i<= N; i++){
//            System.out.println(2*i+1);
//        for (i=N; i >= 1; i--){
//            System.out.println(i);
//        for (i=1; i<=N; i++){
//           if (i % 2 == 0){
//               System.out.println("Even Number are : "+i);
//           }
//        }sc.close();
        int n= sc.nextInt();
        int i = 10;
        for (i= 1;i<=n;i++){
            System.out.println(i*n);
        }
    }
}
