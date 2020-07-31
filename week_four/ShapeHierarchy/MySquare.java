/**
 * This class represents a simply plane geometry square.
 * It is one of the example classes in the Inheritance
 * discussion.
 * 
 * @author Dan Jinguji
 * @author Justin Clark
 * @version 0.3
 */
public class MySquare extends MyRectangle {
    
    /**
     * Constructor for MySquare.
     * 
     * @param s The length of the side.
     */
    public MySquare(int s) {
        super(s, s);
    }
    
    /**
     * Get the name of the shape type. This is a 
     * method that "replaces" the inherited one.
     * The term for this is "override".
     * 
     * @return The type for square as String.
     */
    @Override
    public String getName() {
        return "square";
    }
    
}