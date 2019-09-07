
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class Distribution 
{
//    ArrayList<Integer> scores = new ArrayList<Integer>();
    private int counter1 = 0;
    private int counter2 = 0;
    private int counter3 = 0;
    private int counter4 = 0;
    private int counter5 = 0;
    private int counter0 = 0; 
    private int[] totals = new int[6]; 
    public void calculateScores(Scanner reader)
    {
        System.out.println("Type exam scores, -1 completes: ");
        while (true)
        {
            int points = reader.nextInt();
            
            if(points == -1)
            {
                break;
            }
            
//            scores.add(points);
            this.determineGrade(points);
            this.addCounter(counter5, counter4, counter3, counter2, counter1, counter0);
            
        }
    }
    
    public void determineGrade(int points)
    { 
        if (points > 0 && points <= 29)
        {
            counter0++;
        }
        if(points >= 30 && points <= 34)
        {
            counter1++; 
        }
        else if(points >= 35 && points <= 39)
        {
            counter2++; 
        }
        else if(points >= 40 && points <= 44)
        {
            counter3++; 
        }
        else if(points >= 45 && points <= 49)
        {
            counter4++; 
        }
        else if(points >= 50 && points <= 60)
        {
            counter5++; 
        }
    }
    
    public void addCounter(int counter5, int counter4, int counter3, int counter2, int counter1, int counter0)
    {
    	totals[0] = counter5;
    	totals[1] = counter4;
    	totals[2] = counter3;
    	totals[3] = counter2;
    	totals[4] = counter1;
    	totals[5] = counter0;
    }
    
    public void printVisual()
    {
        int index = 0;
        System.out.println("Grade distribution: ");
        for(int i = 5; i >=0; i--)
        {
            System.out.print(i +": ");
            int j = 0;
            while(j <totals[index])
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            if(index < totals.length)
            {
                index++;
            }
        }
        System.out.println("Acceptance percentage: " + this.percentage());	
    }
    
    public double percentage()
    {
    	int total = 0; 
    	for(int i = 0; i< totals.length; i++)
    	{
    		total+= totals[i];
    	}
    	
    	int accepted = total - counter0; 
    	
    	return  100*accepted/(double)total;
    }
    
}
