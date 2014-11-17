import java.util.Scanner;

public class Wavelength
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      while(true){
      System.out.print("Wavelength: ");
      double wavelength = in.nextDouble();
      

      if(wavelength >= 10e-1){
          System.out.println("Wave Type: Radio");
          System.out.println("Frequency: " + 300000/wavelength);
        }
      if(wavelength < 10e-1 && wavelength >= 10e-3){
          System.out.println("Wave Type: Microwave");
          System.out.println("Frequency: " + 300000/wavelength);
        }
      if(wavelength < 10e-3 && wavelength >= 7e-7){
          System.out.println("Wave Type: Infrared");
          System.out.println("Frequency: " + 300000/wavelength);
        }
      if(wavelength < 7e-7 && wavelength >= 4e-7){
          System.out.println("Wave Type: Visible");
          System.out.println("Frequency: " + 300000/wavelength);
        }
      if(wavelength < 4e-7 && wavelength >= 10e-8){
          System.out.println("Wave Type: Ultraviolet");
          System.out.println("Frequency: " + 300000/wavelength);
        }
      if(wavelength < 10e-8 && wavelength >= 10e-11){
          System.out.println("Wave Type: X-Ray");
          System.out.println("Frequency: " + 300000/wavelength);
        }
      if(wavelength < 10e-11){
          System.out.println("Wave Type: Gamma Ray");
          System.out.println("Frequency: " + 300000/wavelength);
        }
    }
    }
}