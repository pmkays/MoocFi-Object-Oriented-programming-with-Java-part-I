
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int year = reader.nextInt(); 
        
        boolean leapYear = (year%4 == 0 && (year%100 != 0 || year%400 == 0));
        
        if (leapYear)
        {
            System.out.println("The year is a leap year.");
        }
        else
        {
            System.out.println("The year is not a leap year.");
        }
    }
}
