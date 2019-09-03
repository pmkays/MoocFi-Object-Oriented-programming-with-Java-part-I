
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        boolean match = false; 
        String booleanResult = ""; 
        
        while(!match)
        {
            System.out.println("Type the password: ");
            String passwordCompare = reader.nextLine(); 
            
            match = (password.equals(passwordCompare));
            booleanResult = match ? "Right!" : "Wrong!";
            
            System.out.println(booleanResult);
        }
        
        System.out.println("The secret is: asdhjgaskas!");
    }
}
