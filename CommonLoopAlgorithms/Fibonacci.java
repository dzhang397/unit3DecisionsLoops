import java.util.Scanner;
public class Fibonacci

{
    /**
     * Computes the sum and average of the specified series of numbers.
     */
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("Which fibonacci number do you want? ");
       int number = scan.nextInt();
       
       int a = 0;
       int b = 1;
       
       for(int i = 0; i < number; i++)
       {
           a += b;
           b = a - b;
        }
        
       System.out.println(a);
    }
}
       