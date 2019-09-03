import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true)
        {
            System.out.println("Type a word: ");
            String word = reader.nextLine(); 
            words.add(word); 
            if(word.isEmpty())
            {
                break; 
            }
        }
        Collections.reverse(words);
        for(String text : words)
        {
             System.out.println(text);
        }
    }
}
