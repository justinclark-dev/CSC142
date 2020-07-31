/**
 * This class represents a circle.
 * 
 * @author Justin Clark
 * @version 0.1
 */
public class MyCircle extends MyEllipse {
    
    /**
     * MyCircle constructor.
     * 
     * @param d The diameter of the circle.
     */
    public MyCircle(int d) {
        // call the constructor in MyEllipse
        super(d, d);
    }
    
    /**
     * This overrides the getArea() method 
     * inherited from MyEllipse.
     * 
     * @return The approximate area of the circle as double.
     */
    @Override
    public double getArea() {
        // calculate the approximate area
        return (1.0 / 4.0) * Math.PI * (width * width);
    }

    /**
     * This overrides the getPerimeter() method 
     * inherited from MyEllipse.
     * 
     * @return The approximate perimeter of the circle as double.
     */ 
    @Override
    public double getPerimeter() {
        // calculate the approximate perimeter
        return 2 * Math.PI * (width / 2.0);
    }
    
    /**
     * This overrides the getName() method 
     * inherited from MyEllipse.
     * 
     * @return The type for circle as String.
     */
    @Override
    public String getName() {
        return "circle";
    }
    
}