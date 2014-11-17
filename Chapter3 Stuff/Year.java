
import java.util.Scanner;

public class Year
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("What year is it? ");
      int year = in.nextInt();
      
      if(year % 4 == 0){
          if(year % 100 != 0){
              System.out.println("It's a leap year!");
            }
          else{
              System.out.println("It is not a leap year");
            }
        }
      else{
          System.out.println("It is not a leap year");
        }
    }
}