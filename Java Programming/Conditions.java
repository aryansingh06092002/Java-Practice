import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        byte age = sc.nextByte();
        if(age >= 18){
            System.out.println("You are eligible for Voting !!");
        }
        else{
            System.out.println("You are not eligible for voting !!");
        }
    }
}
