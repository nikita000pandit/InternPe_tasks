package InternPe;
import java.util.*;
public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                board[r][c] = ' ';
            }
            System.out.println();
        }
        System.out.println("-----Welcome to Tic-Tac-Toe Game-----");
        char[] arr={'X','0'};
        Random random = new Random();
        char player = arr[random.nextInt(arr.length)];
        boolean gameOver = false;
        System.out.print("Player " + player + ", Please enter position: ");
        while (!gameOver) {
            int row = sc.nextInt();
            int col = sc.nextInt();
               if(board[row][col]==' '){
                   board[row][col] = player;
                   System.out.println(" -------------");
                   for (int r = 0; r < board.length; r++) {
                       for (int c = 0; c < board[r].length; c++) {
                           System.out.print(" | " + board[r][c]);
                       }
                       System.out.println(" |");
                       System.out.println(" -------------");
                   }
                   boolean decide = checkWinner(board, player);
                 boolean   decide1=isBoardFull(board);
                   if (decide) {
                       System.out.println("Congratulations player " + player + " You won!!!");
                   }
                   else if(decide1)
                   {
                       System.out.println("It's a tie!");
                   }
                   else {
                           player = (player == 'X') ? '0' : 'X';
                           System.out.print("Player " + player +" turn, enter position: ");
                   }
                   if(decide==true || decide1==true){
                           System.out.print("Would You like to play game again? yes or no: ");
                           String choice=sc.next().toLowerCase();
                           if(choice.equals("yes")) {
                               for (int r = 0; r < board.length; r++) {
                                   for (int c = 0; c < board[r].length; c++) {
                                       board[r][c] = ' ';
                                   }
                               }
                               System.out.print("Player " + player +" turn, enter position: ");
                           }
                           if(choice.equals("no")) break;
                   }
               }
               else {
                   System.out.println("Invalid position. Try again.");
               }
               }
        if(gameOver==false) System.out.println("Thanks for playing Tic_Tac_Toe Game!!!");
    }
    public static boolean checkWinner(char[][] board, char player) {
        for (int r = 0; r < 3; r++) {
            if (board[r][0] == player && board[r][1] == player && board[r][2] == player)
                return true;
        }
        for (int c = 0; c < 3; c++) {
            if (board[0][c] == player && board[1][c] == player && board[2][c] == player)
                return true;
        }
        if((board[0][2]== player&& board[1][1]== player&& board[2][0]== player) || (board[0][0]== player&& board[1][1]== player&& board[2][2]== player)) return true;
        return false;
}
    public static boolean isBoardFull(char[][] board){
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}












