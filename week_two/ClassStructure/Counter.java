/**
 * A simple integer counter.
 */
public class Counter {
    
    // This stores the current value for the counter.  
    private int count;
    
    /**
     * Create a new Counter, with count initialized to 0.
     */
    public Counter() {
        count = 0;
    }
    
    /**
     * The number of items counted.
     *
     * @return The current count.
     */
    public int getCount() {
        return count;
    }
    
    /**
     * Increment the count by 1.
     */
    public void increment() {
        count = count + 1;
    }
    
    /**
     * Increment the count by the given amount.
     *
     * @param val The amount for the increment
     */
    public void increment(int val) {
        count = count + val;
    }
    
    /**
     * Reset the count to zero.
     */
    public void reset() {
        count = 0;
    }
    
}