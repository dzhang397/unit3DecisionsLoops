import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Substring
{
    /**
     * Computes the index of the first space (' ') in the specified string
     */
    public static void main(String[] args)
    {    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scan.next();
        
        int count = 0;
        int increment = 1;
        
        while(increment <= str.length())
        {
            while(count + increment <= str.length())
            {
                System.out.println(str.substring(count, count + increment));
                count += 1;
            }
            count = 0;
            increment++;            
        }
    }
}
        
        
        