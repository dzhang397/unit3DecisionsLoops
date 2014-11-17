import java.util.Scanner;
import java.lang.Math;

public class MonteCarlo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
      
        double p = 0.0;
        double q = 0.0;
        
        System.out.print("Lower Bound: ");
        double lower = scan.nextDouble();
        
        System.out.print("Upper Bound: ");
        double upper = scan.nextDouble();
        
        System.out.print("Iterations: ");
        int n = scan.nextInt();

        double xMax = Math.min(Math.abs(upper), Math.abs(lower));
        double max = 4/(1 + Math.pow(xMax, 2));
        
        for(int i = 0; i <= n; i++)
        {
            double x = Math.random() * (upper - lower) + lower;
            double y =  Math.random() * max;
            
            double function = 4/(1 + Math.pow(x, 2));
            
            if(y <= function)
            {
                p  += 1;
            }
            
            q += 1;
        }
        
        System.out.println("Area under the curve: 4 / (1 + x^2) from " + lower + " to " + upper + ": " + p*(upper - lower)*max/n);
        System.out.println("Max: " + max);
        System.out.println("Actual: " + 4 * (Math.atan(upper) - Math.atan(lower)));
    }

}
        
        
        