import java.util.Random;
import java.lang.Math;


public class DrunkardsWalk
{
    public static void main(String[] args)
    {
        Random randgen = new Random();
        int x = 0;
        int y = 0;
        int newx = 0;
        
        for(int i = 0; i < 1000; i++)
        {
            x = newx;
            x += randgen.nextInt(3) - 1;
                if(x == newx)
                {
                    y += randgen.nextInt(3) - 1;
                }
        }
        
        System.out.println("Drunkard's Position: " + "(" + x + ", " + y + ")");
    }
}
 