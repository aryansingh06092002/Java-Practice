import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Website : ");
        String  website = sc.next();

        if(website.endsWith(".com")){
            System.out.println("This is Commercial Website");
        } else if (website.endsWith(".org")) {
            System.out.println("This is Organisation Website");
        }else if (website.endsWith(".in")){
            System.out.println("This is Indian Website");
        }else System.out.println("Not Valid Website !!");
    }
}
