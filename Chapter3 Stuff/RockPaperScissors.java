import java.util.Scanner;
public class RockPaperScissors
{
     public static void main(String[] args)
    {
       int player1wins = 0;
       int player2wins = 0;
       
       Scanner scan = new Scanner(System.in);
       
       while(true){
           System.out.print("Player 1: Choose rock, scissors, or paper: ");
           String player1 = scan.next().toLowerCase();
           System.out.print("Player 2: Choose rock, scissors, or paper: ");
           String player2 = scan.next().toLowerCase(); 
           
           if(player1.equals("rock") && player2.equals("scissors")){
               System.out.println("Player 1 wins!");
               player1wins = player1wins + 1;
            }
        
            else if(player1.equals("rock") && player2.equals("paper")){
                System.out.println("Player 2 wins!");
                player2wins = player2wins + 1;
            }
        
            else if(player1.equals("scissors") && player2.equals("rock")){
                System.out.println("Player 2 wins!");
                player1wins = player1wins + 1;
            }
        
            else if(player1.equals("scissors") && player2.equals("paper")){
                System.out.println("Player 1 wins!");
                player2wins = player2wins + 1;
            }
        
            else  if(player1.equals("paper") && player2.equals("scissors")){
                System.out.println("Player 2 wins!");
                player1wins = player1wins + 1;
            }
        
            else if(player1.equals("paper") && player2.equals("rock")){
                System.out.println("Player 1 wins!");
                player2wins = player2wins + 1;
            }
            else{
                System.out.println("It's a tie!");
            }
   
           
        }
    }
}