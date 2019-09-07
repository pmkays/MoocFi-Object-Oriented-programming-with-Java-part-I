
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) 
    {
        //outer loop is how many rows
        for(int i = 0; i < array.length; i++)
        {
            int j = 0; 
            //prints how many stars per line
            while(j < array[i])
            {
                System.out.print("*");
                j++;
            }
            //starts a new line
            System.out.println();
        }
    }
}
