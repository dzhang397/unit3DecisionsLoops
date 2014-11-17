/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "       The quick brown fox jumped over the lazy dog.         ";
        
        System.out.println(sample.trim());
        
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        

        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
        int newTest = sample.indexOf("quick", 13);
        System.out.println(newTest);
        int newTest2 = sample.indexOf("quick");
        System.out.println(newTest2);
    }

}
