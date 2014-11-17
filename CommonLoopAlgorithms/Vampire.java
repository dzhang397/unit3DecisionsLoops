import java.lang.Math;

public class Vampire
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10000; i++)
        {
            for( int j = 1; j <= i; j++)
                {
                    if (i % j == 0)
                    {
                        String number = String.valueOf(i);
                        String factors = String.valueOf(j) + String.valueOf(i/j);

                        for(int k = 0; k <= factors.length(); k++)
                        {

                            while (number.indexOf( factors.substring(k, k)) != 0)
                            {
                               
                                if( number == "" )
                                {
                                    System.out.println( i + ", " + j);
                                }
                            }
                        }
                    }
                }
            }
        }
    }