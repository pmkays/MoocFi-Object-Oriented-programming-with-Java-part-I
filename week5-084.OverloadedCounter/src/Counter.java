/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class Counter 
{
    private int startingValue;
    private boolean check;
    
    public Counter(int startingValue, boolean check)
    {
        this.startingValue = startingValue;
        this.check = check; 
    }
    public Counter(int startingValue)
    {
        this(startingValue, false);
    }
    
    public Counter(boolean check)
    {
        this(0, check);
    }
    
    public Counter()
    {
        this(0, false); 
    }
    
    public int value()
    {
        return this.startingValue; 
    }
    
    public void decrease()
    {
        if (this.startingValue > 0 && this.check || !this.check)
        {
            this.startingValue--;
        }
    }
    
    public void increase()
    {
        this.startingValue++; 
    }
    
    public void decrease(int amount)
    {
        int value = this.startingValue;

        //will only decrease the amount if the check is on and total value will 
        //be greater than 0 or if there's no check. Ensures amount is not a negative 
        //number
//        if (((value -= amount) > 0 && this.check || !this.check) && amount >= 0)
//        {
//            this.startingValue -= amount; 
//        }
//        else if((value -= amount) <= 0 && this.check )
//        {
//            this.startingValue = 0; 
//        }
        
        if(amount < 0)
        {
            return; 
        }
        
        int total = this.startingValue -= amount; 
        
        if(total < 0 && this.check)
        {
            this.startingValue = 0; 
        }
    }
    
    public void increase(int amount)
    {
        if(amount > 0)
        {
            this.startingValue += amount; 
        }
    }  
}
