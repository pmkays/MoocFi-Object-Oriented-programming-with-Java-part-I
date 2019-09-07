/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
import java.util.Random; 
public class NightSky 
{
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;

    public NightSky(double density)
    {
        this(density, 20, 10);
    }
    public NightSky(int width, int height)
    {
        this(0.1, width, height);
    }
    public NightSky(double density, int width, int height)
    {
        this.width = width;
        this.height = height; 
        this.density = density;
    }
    
    public void printLine()
    {
        Random random = new Random(); 
        random.nextDouble();
        for(int j = 0; j<this.width; j++)
        {
            if(random.nextDouble() < density)
            {
                System.out.print("*");
                starsInLastPrint++; 
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    public void print()
    {
        starsInLastPrint = 0; 
        for(int i = 0; i < this.height; i++)
        {
            printLine();
        }
    }
    
    public int starsInLastPrint()
    {
        return this.starsInLastPrint; 
    }
    
}
