import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int number = 0;
        int sum = 0; 
        int counter = 0;
        double average = 0.0; 
        int evenCounter = 0; 
        int oddCounter = 0;
        
        System.out.println("Type numbers: ");
        while(true)
        {
            number = reader.nextInt(); 
            if(number != -1)
            {
                sum += number; 
                counter++; 
            }
            
            if(number%2 == 0)
            {
                evenCounter++; 
            }
            else if (number != -1)
            {
                oddCounter++; 
            }
            
            if(number == -1)
            {
                average = sum / (double)counter;
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + counter);
                System.out.println("The average is: " + average);
                System.out.println("Even numbers: " + evenCounter);
                System.out.println("Odd numbers: " + oddCounter);
                break;
            }
        }

    }
}
