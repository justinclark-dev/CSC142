/**
 * This class represents a basic triangle.
 * 
 * @author Justin Clark
 * @version 0.1
 */
public class MyTriangle extends MyShape {
    
    /**
     * MyTriangle constructor.
     * 
     * @param h The height of the triangle.
     * @param w The width of the triangle.
     */
    public MyTriangle(int h, int w) {
        // call the constructor in MyShape
        super(h, w);
    }
    
    /**
     * This overrides the getArea() method 
     * inherited from MyShape.
     * 
     * @return The approximate area of the triangle as double.
     */
    @Override
    public double getArea() {
        // calculate the area
        return (1.0 / 2.0) * width * height;
    }
   
    /**
     * This overrides the getName() method  
     * inherited from MyShape.
     * 
     * @return The type for triangle as string.
     */
    @Override
    public String getName() {
        return "triangle";
    }
   
}