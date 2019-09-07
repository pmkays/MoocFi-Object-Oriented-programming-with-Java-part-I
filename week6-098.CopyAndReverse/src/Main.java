
import java.util.Arrays;



public class Main {

    public static void main(String[] args) 
    {
        int[] original = {1,2,3,4,5}; 
        int[] copied = copy(original);
        int[] reverseCopied = reverseCopy(original);
        
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copied));
        System.out.println(Arrays.toString(reverseCopied));
    }
    
    public static int[] copy(int[] array)
    {
        int[] copied = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            copied[i] = array[i];
        }
        return copied; 
    }
    
    public static int[] reverseCopy(int[] array)
    {
        int j = 0; 
        int[] copied = new int[array.length];
        for(int i = array.length-1; i >= 0; i--)
        {
            copied[j] = array[i]; 
            j++;
        }
        
        return copied;  
    }
    
}
