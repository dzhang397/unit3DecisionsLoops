import java.util.Scanner;
public class FindDuplicate
{
    /**
     * Find the maximum nimber in the specified series of numbers
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to quit)");
        
        String string = "";
        String addon;
        
        while( scan.hasNextDouble())
        {
            addon = String.valueOf(scan.nextDouble());
            
            if(string.indexOf(addon) < 0)
            {
                string = (string + "/" + addon);
            }
            else
            {
                System.out.println("Duplicate");
                System.out.println(string);
                break;
            }
        }
    }
}

            
        