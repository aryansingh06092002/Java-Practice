import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter Your input 0 for Rock , 1 For Paper , 2 For Scissor:");
        int user_choice = sc.nextInt();
        int computer_choice = random.nextInt(3);

        String[] choices = {"Rock", "Paper" ,"Scissor"};
        System.out.println("You chose: " + choices[user_choice]);
        System.out.println("Computer chose: " + choices[computer_choice]);

        if(user_choice == computer_choice) {
            System.out.println("It's Draw Between You two");
        }else if ((user_choice == 0 && computer_choice == 2) ||
        (user_choice == 1 && computer_choice == 0) ||
                (user_choice == 2 && computer_choice == 1)){
            System.out.println("You Win!");
        }else {
            System.out.println("Computer Win!");
        }sc.close();
    }
}
