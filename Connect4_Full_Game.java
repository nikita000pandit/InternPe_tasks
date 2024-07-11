package InternPe;
import java.util.*;
public class Connect4_Full_Game {
 static   char player;
 static int c;
   static char board[][]=new char[6][7];
  public static void main(String[] args) {
      System.out.println("----------Welcome to Connect-4-game----------");
      Scanner sc = new Scanner(System.in);
makeBoardEmpty();
      char arr[] = {'X', '0'};
      Random rand = new Random();
      player = arr[rand.nextInt(arr.length)];
      boolean gameOver = false;
      while (!gameOver) {
          System.out.print("player "+player+" enter column number(0-6): ");
          c = sc.nextInt();
          if(c<0 || c>6){
              System.out.println("Invalid column number!! please enter valid column number(0-6)");
              continue;
          }
          if (checkColumn()) {
              for (int i = 0; i < board.length; i++) {
                  for (int j = 0; j < board[i].length; j++) {
                      System.out.print(board[i][j] + " | ");
                  }
                 System.out.println();
                  System.out.println("---------------------------");
              }
              boolean decide = checkWinner();
              if (decide) {
                  System.out.println("Congratulations player " + player + " You won!!!");
                  System.out.print("Would You like to play game again (yes/no): ");
                  String Choice=sc.next().toLowerCase();
                  if(Choice.equals("yes"))  {
                      makeBoardEmpty();
                      player = arr[rand.nextInt(arr.length)];
                  }
                  if(Choice.equals("no")) break;
              } else {
                  player = (player == 'X') ? '0' : 'X';

              }
          } else {
              System.out.println("The position Which you entered is already filled!!");
          }
      }
      System.out.println("Thanks for playing Connect-4-game");
  }
public static boolean checkColumn(){
      for(int i=board.length-1;i>=0;i--){;
          if(board[i][c]==' ')
          {
              board[i][c]=player;
              return true;
          }
      }
      return false;
}
public static void makeBoardEmpty(){
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
            board[i][j] = ' ';
        }
    }
}
public static boolean checkWinner(){
    for(int r=0;r<6;r++){
        for(int c=0;c<4;c++) {
            if (board[r][c] == player && board[r][c + 1] == player && board[r][c + 2] == player && board[r][c + 3] == player) {
                return true;
            }
        }
    }
    for(int c=0;c<7;c++){
        for(int r=0;r<3;r++){
            if(board[r+0][c]==player && board[r+1][c]==player && board[r+2][c]==player && board[r+3][c]==player){
                return true;
            }
        }
    }
      for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
           if(board[i][j]==player && board[i+1][j+1]==player && board[i+2][j+2]==player  && board[i+3][j+3]==player)
               return true;
       }
    }
    for(int i=6;i>=3;i--){
        for(int j=0;i<3;j++){
            if(board[j+0][i+0]==player && board[j+1][i-1]==player && board[j+2][i-2]==player  && board[j+3][i-3]==player )
                return true;
        }
    }
    return false;
}
}

