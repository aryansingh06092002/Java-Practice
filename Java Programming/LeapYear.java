import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int leap_year = sc.nextInt();

        if (leap_year % 4 == 0 && leap_year % 100 != 0 || leap_year % 400 == 0){
            System.out.println("Yes ! this is Leap Year");
        }else System.out.println("This is Not Leap Year");
    }
}