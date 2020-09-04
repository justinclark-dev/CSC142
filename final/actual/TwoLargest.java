public class TwoLargest {
    
/**
 * Retrieves two largest distinct values from a List of floats.
 * If there are two or more distinct values, the return is a two-
 * element array with the maximum as the first element and the 
 * second largest as the second element. If there are fewer than two
 * distinct values in the argument array, adjust the size of the 
 * return array accordingly.
 * @param a The List to be searched. Not changed by the method.
 * @return  The array with the two largest distinct values.
 */
public float[] twoLargest(java.util.List<Float> a) {

    java.util.Iterator<Float> iter = a.iterator();

    float large = -(Float.MAX_VALUE);
    float largest = -(Float.MAX_VALUE);

    while (iter.hasNext()) {
        float current = iter.next();
        if (current > large && large < largest) {large = current;}
        else if (current > largest) {largest = current;}
    }
        
    return (large == largest) 
        ? new float[] {largest} 
        : new float[] {largest, large};
}

public static void main(String[] args) {
    TwoLargest app = new TwoLargest();

    java.util.List<Float> vals = new java.util.ArrayList<Float>();
    vals.add(0,(float)-1.0);
    vals.add(1,(float)-2.0);
    vals.add(2,(float)-1.0);
    vals.add(3,(float)-4.0);
    vals.add(4,(float)-4.0);

    System.out.println("Largest: "+ app.twoLargest(vals)[0]);
    // System.out.println("Large: "+ app.twoLargest(vals)[1]);
}

}