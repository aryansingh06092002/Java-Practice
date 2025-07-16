// QUESTION 2
//Write a program to find out whether a student is pass or fail, if it requires total 40% and at least 33% in each subject to pass.Assume three Subjects and take marks as an input from the user


import java.util.Scanner;

public class PracticeSetCh4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Subject Marks :");
        float first = sc.nextFloat();
        System.out.print("Enter Second Subject Marks :");
        float second = sc.nextFloat();
        System.out.print("Enter Third Subject Marks :");
        float third = sc.nextFloat();

        float total_marks= first + second + third;
        System.out.println("Total Marks =" +total_marks);

        float percentage = total_marks/300*100;
        System.out.println("Percentage =" + percentage);

        if(percentage >= 40 && first >= 33 && second >= 33 && third >= 33 ){
            System.out.println("PASS");
        }else System.out.println("FAIL");

    }
}
