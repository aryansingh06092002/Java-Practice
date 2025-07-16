import java.util.Scanner;

public class PracticeSetCh3 {
    public static void main(String[] args) {
        String name = "Aryan Singh";
        System.out.println(name.toLowerCase());

        System.out.println(name.replace(' ', '_'));

        System.out.println(" \"Dear " + name + ", thanks a lot\"" );

        System.out.println(name.replace("Aryan" , "Ayush"));

        System.out.println(name.indexOf(" "));

        String letter = "\tDear Aryan,\n This Java Course is nice. \n \tThanks";
        System.out.println(letter);
    }
}
