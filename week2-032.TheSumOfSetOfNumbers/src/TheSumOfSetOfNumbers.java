
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int max = reader.nextInt(); 
        int i = 1; 
        int added = 1; 
        while (i < max)
        {
            i++;
            added += i; 
        }
        
        System.out.println("Sum is " + added);
    }
}
