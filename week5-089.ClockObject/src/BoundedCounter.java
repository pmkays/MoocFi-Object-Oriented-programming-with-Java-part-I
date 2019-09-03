
public class BoundedCounter 
{
    private int value;
    private int upperLimit;
 
    public BoundedCounter(int upperLimit) 
    {
        this.upperLimit = upperLimit; 
        this.value = 0;
    }
 
    public void next() 
    {
        if(this.value < this.upperLimit)
        {
            this.value++; 
        }
        else
        {
            this.value = 0; 
        }
    }
 
    public String toString() 
    {
        if(value<10)
        {
            return "0" + this.value;
        }
        else
        {
            return "" + this.value;
        }
    }
    
    public int getValue()
    {
        return this.value;
    }
    
    public void setValue(int value)
    {
        if (value >= 0 && value <= this.upperLimit)
        {
            this.value = value;
        }
    }
}
