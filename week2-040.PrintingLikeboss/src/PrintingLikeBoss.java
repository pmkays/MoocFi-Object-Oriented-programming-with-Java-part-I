public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) 
    {
        int i = 0; 
        while (i < amount)
        {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) 
    {
        int i = 0; 
        while (i < amount)
        {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) 
    {
        int i = 0; 
        while (i < size)
        {
            printWhitespaces(size - i - 1);
            i++;
            printStars(i); 
        }
    }

    public static void xmasTree(int height) 
    {
        int starsIncrement=1;
        int i = 1; 
        int rows = height - 1; 
        
        while (i <= height)
        {
            printWhitespaces(rows); 
            rows--; 
            printStars(starsIncrement);
            starsIncrement += 2;
            i++;
        }
        
        printWhitespaces(height - 2);
        printStars(3);
        
        printWhitespaces(height - 2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
