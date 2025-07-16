import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number : ");
        int n = sc.nextInt();
        int a = 1;
        do {
            System.out.println(a);
            a++;
        }while (a <= n);
    }
}
