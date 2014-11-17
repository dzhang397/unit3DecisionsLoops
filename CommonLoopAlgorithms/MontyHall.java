import java.util.Random;
import java.lang.Math;

public class MontyHall
{
    public static void main(String[] args)
    {
        Random randgen = new Random();
        
        int total = 0;
        int wins = 0;
        
        for(int i = 0; i <= 1000; i++)
        {
            int prizeLocation = randgen.nextInt(3);
            int guessLocation = randgen.nextInt(3);
            int nextDoor = randgen.nextInt(3);
 
            while(nextDoor == prizeLocation || nextDoor == guessLocation)
            {
                nextDoor = randgen.nextInt(3);
            }
        
            int nextGuess = randgen.nextInt(3);
        
            while(nextDoor == nextGuess || nextGuess == guessLocation)
            {
                nextGuess = randgen.nextInt(3);
            }
        
            if(nextGuess == prizeLocation)
            {
                wins += 1;
            }
            
            total += 1;
        }
        
        System.out.println("If you switch your guess, you win " + Math.round((double) (100*wins) / (double) total) + " percent of the time");
        
        wins = 0;
        total = 0;
        
        for(int i = 0; i <= 1000; i++)
        {
        
            int prizeLocation = randgen.nextInt(3);
            int guessLocation = randgen.nextInt(3);
            
            if(guessLocation == prizeLocation)
            {
                wins += 1;
            }
            
            total += 1;
        }
        
        System.out.println("If you do not switch your guess, you win " + Math.round((double) (100*wins) / (double) total) + " percent of the time");
    }
}
       