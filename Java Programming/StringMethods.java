import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Aryan";
        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
//         String trimmethod = "    Aryan   ";
//        System.out.println(trimmethod.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('r','p'));
        System.out.println(name.startsWith("Ar"));
        System.out.println(name.endsWith("an"));
        System.out.println(name.endsWith("xz"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ya"));
        System.out.println(name.indexOf("a", 2));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.indexOf("a", 1));
        System.out.println(name.equals("Aryan"));
        System.out.println(name.equalsIgnoreCase("Aryan"));
    }
}
