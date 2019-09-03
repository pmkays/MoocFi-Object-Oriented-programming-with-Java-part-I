
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        
        System.out.println("Enter number 1");
        sum = reader.nextInt();
        
        System.out.println("Enter number 2");
        sum += reader.nextInt(); 
        
        System.out.println("Enter number 3");
        sum += reader.nextInt(); 
        
        System.out.println("Sum: " + sum);
    }
}
