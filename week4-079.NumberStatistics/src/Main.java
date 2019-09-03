import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics total = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics(); 
        System.out.println("Type numbers:");
        while(true)
        {
            int number = reader.nextInt();
            if(number == -1)
            {
                break;
            }
            total.addNumber(number);
            
            if(number%2 == 0)
            {
                even.addNumber(number);
            }
            else
            {
                odd.addNumber(number);
            }
        }
        System.out.println("sum: " + total.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
//        System.out.println(total.average());
    }
}
