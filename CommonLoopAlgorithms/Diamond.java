import java.util.Scanner;

public class Diamond
{
    /**
     * Counts the number of spaces (' ') in the specified string.
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int sidelength = scan.nextInt();
        
        String spaces = "";
        
        for(int i = 0; i <= sidelength; i++)
        {
           spaces += " ";
        }
        
        String asterisks = "*";

        
        System.out.println(spaces + asterisks + spaces);
        for(int count = 0; count < sidelength; count++)
        {
            spaces = spaces.substring(0, spaces.length() - 1);
            asterisks += "**";
            
            System.out.println(spaces + asterisks + spaces);

        }
        
        
        for(int count2 = 0; count2 <= sidelength - 1; count2
        ++)
        {
           spaces += " ";
           asterisks = asterisks.substring(0, asterisks.length() - 2);
           System.out.println(spaces + asterisks + spaces);
        }

    }
}
        