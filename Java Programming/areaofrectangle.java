import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle :");
        float l = sc.nextFloat();
        System.out.println("Enter breadth of Rectangle :");
        float b = sc.nextFloat();
        float Area = l*b;
        System.out.println("Area of Rectangle is :" +Area);
        sc.close();
    }
}