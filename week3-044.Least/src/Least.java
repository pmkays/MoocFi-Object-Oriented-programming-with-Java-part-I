
public class Least {

    public static int least(int number1, int number2) 
    {
        int least = number1; 
        if (number2<number1)
        {
            least = number2;
        }
        return least;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
