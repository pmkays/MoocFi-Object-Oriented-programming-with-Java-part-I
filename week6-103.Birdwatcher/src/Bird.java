/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class Bird 
{
    
    private String name;
    private String latinName; 
    private int observed;
    
    public Bird(String name, String latinName)
    {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0; 
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setObserved(int observed)
    {
        this.observed = observed;
    }
    
    public int getObserved()
    {
        return this.observed; 
    }
    
    public String toString()
    {
        return String.format("%s (%s): %d observations", this.name, this.latinName, this.observed);
    }
    
}
