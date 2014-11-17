import java.lang.Math;
import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      
      double xval = Math.abs(xcenter1 - xcenter2);
      double yval = Math.abs(ycenter1 - ycenter2);
      double dist = Math.sqrt(Math.pow(xval, 2) + Math.pow(yval, 2));
      
      if(dist <= radius1 + radius2)
      {
          System.out.println("Circles Overlap");
        }
      else
      {
          System.out.println("Circles do not overlap");
        }

   }
}