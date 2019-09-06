
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added)
    {
        int sumEuros = this.euros + added.euros; 
        int sumCents = this.cents + added.cents; 
        return new Money(sumEuros, sumCents);
    }
    
    public boolean less(Money compared)
    {
       boolean less = false; 
       if(this.euros < compared.euros)
       {
           less = true; 
       }
       
       if(this.euros == compared.euros)
       {
           less = (this.cents < compared.cents);
       }
       
       return less; 
    }
    
    public Money minus(Money decremented)
    {   int minusEuros;
        int minusCents;
        
        if(this.less(decremented))
        {
             minusEuros = 0;  
             minusCents = 0;  
        }
        else
        {
            minusEuros = this.euros -  decremented.euros; 
            minusCents = this.cents - decremented.cents; 
            if (this.cents < decremented.cents) 
            {
                minusEuros--;
                minusCents = 100 - decremented.cents;
            }
        }
        
         return new Money(minusEuros, minusCents);
    }

}
