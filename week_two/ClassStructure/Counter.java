/** 
 * A simple integer counter
 */
public class Counter {

    private int count;

    /**
     * Create a new Counter, with count initialized to 0.
     */
    public Counter() {
        count = 0;
    }

    /** 
     * The number of items counted.
     */
    public int currentCount () {
        return count;
    }

    /**
     * Increment the count by 1.
     */
    public void incrementCount() {
        count++;
    }

    /** Reset the count to 0. */
    public void reset() {
        count = 0;
    }
}
