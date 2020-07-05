public class CallCounter {

    public static void main(String[] args) {
        
        Counter counter = new Counter();

        System.out.println(counter.currentCount());

        counter.incrementCount();
        counter.incrementCount();
        counter.incrementCount();
        counter.incrementCount();
        counter.incrementCount();
        counter.incrementCount();

        System.out.println(counter.currentCount());
    }
}