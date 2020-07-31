/**
 * This class represents a basic ellipse.
 * 
 * @author Justin Clark
 * @version 0.1
 */
public class MyEllipse extends MyShape {
    
    /**
     * MyEllipse constructor.
     * 
     * @param a The major axis of the ellipse.
     * @param b The minor axis of the ellipse.
     */
    public MyEllipse(int b, int a) {
        // call the constructor in MyShape
        super(b, a);
    }
    
    /**
     * This overrides the getArea() method 
     * inherited from MyShape.
     * 
     * @return The approximate area of the ellipse as double.
     */
    @Override
    public double getArea() {
        // calculate the approximate area
        return (1.0 / 4.0) * Math.PI * height *  width;
    }

    /**
     * This overrides the getPerimeter() method
     * inherited from MyShape.
     * 
     * @return The approximate perimeter of the ellipse as double.
     */
    @Override
    public double getPerimeter() {
        // calculate the approximate perimeter
        return  (1.0 / 2.0) * Math.PI 
                * (
                    3 * (height + width) 
                    - Math.sqrt(
                        (3 * height + width) * (height + 3 * width)
                    )
                );
    }
    
    /**
     * This overrides the getName() method  
     * inherited from MyShape.
     * 
     * @return The type for ellipse as String.
     */
    @Override
    public String getName() {
        return "ellipse";
    }
    
}