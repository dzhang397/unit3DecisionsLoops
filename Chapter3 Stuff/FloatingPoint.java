import java.util.Scanner;

public class FloatingPoint
{
    public static void main(String[] args)
    {
        final double EPSILON = 1e-14;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a floating point number: ");
        double num = in.nextDouble();
        while(true){
            System.out.print("Enter a floating point number: ");
            num = in.nextDouble();
            if(num - 0 < EPSILON){
                System.out.println("It's a zero.");
            }
            else if(num > 0 && num < 1.0){
                System.out.println("It's postive.");
            }
            else if(num > 0 && num > 100000){
                System.out.println("It's postive.");
            }
            else{
                System.out.println("It's negative.");
            }
        }
    }
}
