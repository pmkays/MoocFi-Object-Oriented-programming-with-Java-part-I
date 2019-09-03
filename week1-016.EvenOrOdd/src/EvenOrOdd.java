
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int number = reader.nextInt(); 
        
       boolean even = (number%2 == 0);
       
       if(even)
       {
           System.out.println("Number " + number + " is even.");
       }
       else
       {
           System.out.println("Number " + number + " is odd.");
       }
        
        
        
        

    }
}
