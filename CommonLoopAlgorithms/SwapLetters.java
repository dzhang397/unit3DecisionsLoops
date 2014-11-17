import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class SwapLetters
{
    /**
     * Computes the index of the first space (' ') in the specified string
     */
    public static void main(String[] args)
    {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scan.next();
        
        Random rand = new Random();
        
        int a = rand.nextInt(str.length() - 1) + 1;
        int b = rand.nextInt(str.length() - 1) + 1;
        
        while(a >= b){
        b = rand.nextInt(str.length() - 1) + 1;
    }

        System.out.println(str.substring(0, a - 1) + str.substring(b-1, b) + str.substring(a, b -1) + str.substring(a - 1, a) + str.substring(b, str.length()));
    }
}