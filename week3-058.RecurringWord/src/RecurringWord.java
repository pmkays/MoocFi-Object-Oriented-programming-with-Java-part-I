
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord 
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String duplicate =""; 
        while(true)
        {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (!words.contains(word))
            {
                words.add(word); 
            }
            else
            {
                duplicate = word;
                break; 
            } 
        }
        System.out.println("You gave the word " + duplicate + " twice");
    }
}
