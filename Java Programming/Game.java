import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter Your Choice (0 For Rock , 1 For Paper , 2 For Scissors) : ");
        int userchoice = sc.nextInt();
        int computerchoice = random.nextInt(3);

        String choice[] = {"Rock", "Paper", "Scissors"};
        System.out.println("You chose: " + choice[userchoice]);
        System.out.println("Computer chose: " + choice[computerchoice]);

        if (userchoice == computerchoice){
            System.out.println("Match is tie");
        }else if ((userchoice == 0 && computerchoice == 2) || (userchoice == 1 && computerchoice == 0) || (userchoice == 2 && computerchoice == 1)){
            System.out.println("Congrats!! You Win");
        } else {
            System.out.println("Computer Win");

        }


    }
}
