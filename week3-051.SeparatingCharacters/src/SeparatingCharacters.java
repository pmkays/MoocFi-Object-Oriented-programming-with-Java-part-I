
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine(); 
        int index = 0; 
        int count = 1;
        while(index <= name.length()-1 )
        {
            System.out.println(count + ". character: " + name.charAt(index));
            index++; 
            count = index + 1;
            
        }
    }
}
