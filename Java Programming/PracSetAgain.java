import java.util.Scanner;

public class PracSetAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age :");
        String age = sc.nextLine();

        System.out.print("Enter Your College: ");
        String College = sc.nextLine();

        System.out.print("Enter Your Course :");
        String Course = sc.nextLine();

        System.out.print("Enter Your Hobby :");
        String Hobby = sc.nextLine();

        System.out.print("Enter Your Dream Job :");
        String Dream_Job = sc.nextLine();

        System.out.println("Personal Information Sheet");
        System.out.println("--------------------------------------------------");

        System.out.printf("Name : %s \n ", name);
        System.out.printf("Age : %s \n ", age);
        System.out.printf("College : %s \n ", College);
        System.out.printf("Course : %s \n ", Course);
        System.out.printf("Hobby : %s \n ", Hobby);
        System.out.printf("Dream Job : %s \n ", Dream_Job);

        System.out.println("--------------------------------------------------");

    }
}
