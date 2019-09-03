public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue(); //10
        counter.decrease();
        
        counter.printValue(); //9
        counter.decrease();

        counter.printValue(); //8
        counter.setInitial();
        
        counter.printValue(); //10
    }
}
