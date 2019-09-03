
public class Main {

    public static void main(String[] args) {
//        Counter c = new Counter(2, true);
//        c.decrease();
//        c.decrease();
//        c.decrease();  
//        System.out.println(c.value());

        Counter c = new Counter(900, false);
        c.decrease(-55);
        System.out.println(c.value());
        
//        Counter c = new Counter(2, true);
//        c.decrease(4);
//        System.out.println(c.value());
    }
}
