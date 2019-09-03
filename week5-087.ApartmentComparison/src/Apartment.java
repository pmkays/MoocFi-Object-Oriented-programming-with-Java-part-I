
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = this.squareMeters * this.pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment)
    {
        boolean larger = false;
        if(this.squareMeters > otherApartment.squareMeters)
        {
            larger = true;
        }
        return larger;  
    }
    
    public int priceDifference(Apartment otherApartment)
    {
        int difference = this.price - otherApartment.price;
        return Math.abs(difference);
    }
    
     public boolean moreExpensiveThan(Apartment otherApartment)
     {       
        if(this.price > otherApartment.price)
        {
            return true;
        }
        return false;  
     }
}
