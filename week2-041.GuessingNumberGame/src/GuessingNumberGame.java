
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int counter = 0; 
        int numberDrawn = drawNumber();
        int guess = 0; 

            while (guess != numberDrawn)
            {
                System.out.println("Guess a number: ");
                guess = reader.nextInt(); 
                counter++; 
                if(guess < numberDrawn)
                {
                    System.out.println("The number is greater, guesses made: " + counter);
                }
                else if (guess > numberDrawn)
                {
                    System.out.println("The number is lesser, guesses made: " + counter);
                }
                
                if(guess == numberDrawn)
                {
                    break;
                }
            } 
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
