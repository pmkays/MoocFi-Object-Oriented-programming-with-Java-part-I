
import java.util.Scanner;

public class ReversingText 
{

    public static String reverse(String name) 
    {
        String reverse = ""; 
        int i = name.length()-1; 
        while(i>=0)
        {
            reverse += name.charAt(i);
            i--; 
        }
        return reverse;
    }

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println(reverse(name));
    }  
}
