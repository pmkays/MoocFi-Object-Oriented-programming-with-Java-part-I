
public class Greatest {

    public static int greatest(int number1, int number2, int number3) 
    {
        int greatest = number3; 
        if(number2 > number3 && number2 > number1)  
        {
            greatest = number2; 
        }      
        else if(number1 > number2 && number1 > number3)
        {
            greatest = number1; 
        }
        
        return greatest;    
    }

    public static void main(String[] args) {
        int result = greatest(-5, -8, -4);
        System.out.println("Greatest: " + result);
    }
}
