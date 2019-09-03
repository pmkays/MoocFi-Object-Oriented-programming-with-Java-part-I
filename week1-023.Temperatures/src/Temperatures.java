
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Input a floating number: ");
            double number = reader.nextDouble();
            
            if(number >= -30.0 && number <= 40 )
            {
                Graph.addNumber(number);  
            }
        }
    }
}
