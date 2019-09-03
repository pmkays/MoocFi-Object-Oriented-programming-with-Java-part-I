import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random random = new Random();
    int lottery = 0; 

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while(i< 7)
        {
            int lottery = random.nextInt(39) + 1;
            if(!containsNumber(lottery))
            {
                numbers.add(lottery);
                i++; 
            }
        }
    }

    public boolean containsNumber(int number) 
    {
        boolean duplicate = false;
        if(numbers.contains(number))
        {
            duplicate = true; 
        }
        return duplicate; 
    }
}
