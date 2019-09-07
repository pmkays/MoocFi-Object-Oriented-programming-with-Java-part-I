
import java.util.Arrays;


public class Main {
    public static void main(String[] args) 
    {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array) 
    {
        int smallest = array[0]; 
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] < smallest )
            {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) 
    {  
        int smallest = 0; 
        for(int i = 0; i<array.length; i++)
        {
            if(array[i]<array[smallest])
            {
                smallest = i; 
            }
        }
        return smallest;   
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) 
    {
        int smallest = index; 
        for(int i = index; i<array.length; i++)
        {
            if(array[i] < array[smallest] )
            {
                smallest = i;   
            }
        }
        return smallest;
    } 
    
    public static void swap(int[] array, int index1, int index2) 
    {
        int temp = 0; 
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;  
    }
    
    public static void sort(int[] array) 
    {
        for(int i = 0; i < array.length; i++)
        {
            int index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index); 
            System.out.println(Arrays.toString(array));
            
        }
    }
  
    
    
    

}
