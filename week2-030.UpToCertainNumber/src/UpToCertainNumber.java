import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number?");
        int number = reader.nextInt(); 
        
        int i = 1;
        
        while (i <= number)
        {
            System.out.println(i);
            i++;
        }
    }
}
