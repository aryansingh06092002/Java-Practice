import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter marks of 1st Subject :");
        float sbj1 = sc.nextFloat();
        System.out.println("Enter marks of 2nd Subject :");
        float sbj2 = sc.nextFloat();
        System.out.println("Enter marks of 3rd Subject :");
        float sbj3 = sc.nextFloat();
        System.out.println("Enter marks of 4th Subject :");
        float sbj4 = sc.nextFloat();
        System.out.println("Enter marks of 5th Subject :");
        float sbj5 = sc.nextFloat();
        float Total_Marks = sbj1 + sbj2 + sbj3 + sbj4 + sbj5 ;
        System.out.println("Total Marks of Student is :" +Total_Marks);
        float Percentage = Total_Marks / 500 * 100;
        System.out.println("Total Percentage = "+ Percentage);
    }
}