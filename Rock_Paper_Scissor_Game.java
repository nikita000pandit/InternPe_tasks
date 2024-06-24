package InterPe;
import java.util.*;
public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Would you like to play Game? Yes or No: ");
            String playGame=sc.nextLine().toLowerCase();
            System.out.println("----Welcome to Rock_Paper_Scissor game----");
            while(playGame.equals("yes")){
                System.out.print("Enter your move (Rock/Paper/Scissor): ");
                String userChoice=sc.nextLine();
                Random rand=new Random();
                String[] arr={"Rock","Paper","Scissor"};
                String computerChoice=arr[rand.nextInt(arr.length)];
                System.out.println("userChoice: "+userChoice+" || computerChoice: "+computerChoice);
                if(userChoice.equals(computerChoice)){
                    System.out.println("Tie");
                }
                else if(userChoice.equals("Rock") && computerChoice.equals("Paper")) {
                    System.out.println("Computer Win");
                }
                else if(userChoice.equals("Paper") && computerChoice.equals("Rock")){
                    System.out.println("You Win");
                }
                else if(userChoice.equals("Paper" ) && computerChoice.equals("Scissor")){
                    System.out.println("Computer Win");
                }
                else if(userChoice.equals("Scissor") && computerChoice.equals("Paper")){
                    System.out.println("You Win");
                }
                else if(userChoice.equals("Rock") && computerChoice.equals("Scissor")){
                    System.out.println("You win");
                }
                else if(userChoice.equals("Scissor") && computerChoice.equals("Rock")){
                    System.out.println("Computer win");
                }
                else{
                    System.out.println("Please enter valid move (Rock/Paper/Scissor)");
                }
                System.out.print("Would you like to play game again? Yes or No: ");
                playGame=sc.nextLine().toLowerCase();
            }
            System.out.println("Thanks for playing Rock_Paper_Scissor game!!");
        }
}
