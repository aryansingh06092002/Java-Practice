import java.util.Scanner;

 class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number :");
    float a = sc.nextFloat();
        System.out.print("Enter Second number :");
    float b = sc.nextFloat();
        System.out.println("Enter Your Operator Choice :\n 1 For Addition, 2 For Subtraction ,\n 3 For Multiplication ,\n 4 For Division,\n 5 For Percentage ");
    int choice = sc.nextInt();

    switch (choice){
        case 1:
            System.out.println(a+b);
            break;
        case 2 :
            System.out.println(a-b);
            break;
        case 3 :
            System.out.println(a*b);
            break;
        case 4 :
            System.out.println(a/b);
            break;
        case 5 :
            System.out.println(a%b);
            break;
        default:
            System.out.println("Invalid");
        }
    }
}
