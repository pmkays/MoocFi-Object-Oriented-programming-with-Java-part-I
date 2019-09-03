
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = reader.nextInt();
        
        System.out.println("Last:" );
        int second = reader.nextInt(); 
        
        while (first <= second)
        {
            System.out.println(first);
            first++; 
            
        }

    }
}
