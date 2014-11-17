import java.lang.Math;

public class Armstrong
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 1000; i++)
        {
            int huns = i / 100;
            int tens = (i - (100 * huns))/ 10;
            int ones = i - (100 * huns) - (10 * tens);
            
            if( Math.pow(huns, 3) + Math.pow(tens, 3) + Math.pow(ones, 3) == i)
            {
                System.out.println(i);
            }
        }
    }
}