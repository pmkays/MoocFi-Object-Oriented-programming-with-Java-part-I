
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = reader.nextInt(); 
        
        boolean positive = number > 0; 
        if (positive)
        {
            System.out.println("The number is positive.");
        }
        else
        {
            System.out.println("The number is not positive.");
        }
        
    }
}
