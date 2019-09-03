import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int number = reader.nextInt(); 
        
        int factorial = 1; 
        int counter = 1; 
        
        while (counter < number)
        {
            factorial = factorial * (counter + 1);
            counter++; 
        }
        System.out.println(factorial);
    }
}
