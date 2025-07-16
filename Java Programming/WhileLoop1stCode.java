import java.util.Scanner;

public class WhileLoop1stCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Calculate it's table : ");
        int a = sc.nextInt();
        int i = 100;
        while (i<=200){
            System.out.println(i);
            i++;
        }
    }
}
