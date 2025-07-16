
import java.util.Scanner;

public class PracticeSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();

        System.out.print("Enter your Favourite Language :");
        String language = sc.nextLine();

        System.out.print("Enter your College Name :");
        String college = sc.nextLine();

        System.out.printf("------------------------------------------------");
        System.out.printf("\t PERSONAL INTRODUCTION \t");
        System.out.println("------------------------------------------------");

        System.out.printf("Name : %s \n" , name);

        System.out.printf("Language : %s \n", language.toLowerCase());

        System.out.printf("College : %s \n", college.trim());
        System.out.println();
        System.out.println("Message : \"Hello " + name + ",\n Welcome to the World of "+ language.toUpperCase()+ "!\"");
        System.out.println("----------------------------------------------------");
        sc.close();
    }
}
