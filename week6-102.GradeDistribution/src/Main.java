import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Distribution run = new Distribution();
        run.calculateScores(reader);
        run.printVisual(); 
       
    }
}
