/**
 * This is the base class for the class hierarchy for
 * Inheritance discussion.
 * 
 * @author Dan Jinguji
 * @author Justin Clark
 * @version 0.3
 */
public class MyShape {
    
    // These dimensions are protected. That means
    // that the subclasses can access them. They 
    // have also been marked with the final modifier 
    // which means that their values cannot be changed
    // after the constructor is done. This is ok, 
    // since the subclasses shouldn't modify them.
    /**
     * The height of the shape.
     */
    protected final int height;
    /**
     * The width of the shape.
     */
    protected final int width;
    
    /**
     * Constructor MyShape.
     * 
     * @param h The height of the shape.
     * @param w The width of the shape.
     */
    public MyShape(int h, int w) {
        // initialize instance variables
        height = h;
        width = w;
    }
    
    /**
     * Retrieve the height of the shape.
     * 
     * @return The height of the shape as int.
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Retrieve the width of the shape.
     * 
     * @return The width of the shape as int.
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * A placeholder method to calculate the area.
     *  
     * @return The area of the shape as double.
     */
    public double getArea() {
        // placeholder code
        return 0;
    }
    
    /**
     * A placeholder method to calculate the perimeter.
     *  
     * @return The perimeter of the shape as double.
     */
    public double getPerimeter() {
        // placeholder code
        return 0;
    }
    
    /**
     * A placeholder method to name the shape.
     * 
     * @return The type for the shape as String.
     */
    public String getName() {
        return "shape";
    }

    /**
     * This method takes a value as double and
     * returns the value formatted as a String
     * with three decimals.
     * 
     * @param val The value to format.
     * 
     * @return The formatted value as String.
     */
    public String toString(double val) {
        return String.format("%.3f", val);
    }

}
