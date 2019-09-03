
import java.util.Scanner;


public class TheSumBetweenTwoNumbers 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = reader.nextInt(); 
        
        System.out.println("Last: ");
        int second = reader.nextInt(); 
        
        int added = 0; 
        
        while(first <= second)
        {
            added += first; 
            first++; 
        }
        System.out.println(added);
    }
}
