
public class Main {

    public static void main(String[] args) 
    {
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
