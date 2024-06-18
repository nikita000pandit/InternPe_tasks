package InterPe;
import java.util.*;
public class GuessANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Would you like to play Game? Yes or No: ");
        String playGame=sc.nextLine().toLowerCase();
        while(playGame.equals("yes")){
            int guesses=0;
            boolean startGame=true;
            Random ran=new Random();
            int randomNumber=ran.nextInt(0,101);
            while(startGame){
                System.out.print("Enter a number between 1-100: ");
                int userGuess=sc.nextInt();
                guesses++;
                if(randomNumber==userGuess){
                    System.out.println("Congratulations! You guessed the right number.");
                    System.out.println("You attempt  total "+guesses+" guesses");
                    startGame=false;
                }
                else if(randomNumber>userGuess){
                    System.out.println("Enter a number greater than randomNumber.");
                }
                else{
                    System.out.println("Enter a number less than randomNumber.");
                }
                sc.nextLine();
            }
            System.out.print("Would you like to play game again? Yes or No:");
            playGame=sc.nextLine().toLowerCase();
        }
        System.out.println("Thanks for playing Guess a number game!!");
    }
}