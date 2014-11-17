import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner4
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie4 maggie = new Magpie4();
        
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        
        if (statement.indexOf("no") >= 0 || statement.indexOf("don't") >= 0)
        {
            System.out.println("Why so negative?");
        }
        else
        {
            System.out.println("Tell me something.");
        }
        
        statement = in.nextLine();
        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}
