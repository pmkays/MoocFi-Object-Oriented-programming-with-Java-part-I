
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
//Creates a LyyraCard for Pekka with initial balance of 20 euros
//Creates a LyyraCard for Brian with initial balance of 30 euros
//Pekka buys gourmet lunch
//Brian buys economical lunch
//cards are printed (both on their own row, starting with the name of the card owner)
//Pekka loads 20 euros
//Brian buys gourmet lunch
//cards are printed (both on their own row, starting with the name of the card owner)
//Pekka buys economical lunch
//Pekka buys economical lunch
//Brian loads 50 euros
//cards are printed (both on their own row, starting with the name of the card owner)
        
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        
        System.out.println("Pekka: " + cardPekka);  
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        
        System.out.println("Pekka: " + cardPekka);  
        System.out.println("Brian: " + cardBrian);
        
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        
        cardBrian.loadMoney(50);
        
        System.out.println("Pekka: " + cardPekka);  
        System.out.println("Brian: " + cardBrian);
        
        
        
        
    }
}
