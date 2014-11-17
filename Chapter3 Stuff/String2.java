/*import java.util.Scanner;*/

public class String2
{
    public static void main(String[] args)
    {
        /*Scanner in = new Scanner(System.in);
      
        String word1 = in.next();
        String word2 = in.next();*/
        
        String word1 = "catalog"; 
        String word2 = "cat";
        String aaa = "aaa";
        String prefix = word1.substring(0,3);
        
        if(word1.equals(aaa)){
            System.out.println("Word 1 is lexicographically equal to aaa");
        }
        else if(word1.compareTo(aaa) > 0){
            System.out.println("Word 1 is greater than aaa");
        }
        else if(word1.compareTo(aaa) < 0){
            System.out.println("Word 1 is less than aaa");
        }
        
        if(word1.equals(word2)){
            System.out.println("Word 1 is lexicographically equal to Word 2");
        }
        else if(word1.compareTo(word2) > 0){
            System.out.println("Word 1 is greater than Word 2");
        }
        else if(word1.compareTo(word2) < 0){
            System.out.println("Word 1 is less than Word 2");
        }
        
        if(prefix.equals(word2)){
            System.out.println("Word 1 has the same three-letter prefix as Word 2");
        }
        else{
            System.out.println("Word 1 does not have the same three-letter prefix as Word 2");
        }
    }
}