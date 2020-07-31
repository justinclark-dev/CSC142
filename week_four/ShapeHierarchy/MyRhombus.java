/**
 * This class represents a rhombus. A rhombus's area and 
 * perimeter can be derived from our knowledge of what 
 * an Isosceles Triangle is, therefore we will inherit 
 * from that as our base class.  This is because a basic 
 * (symmetrical) rhombus is basically two Isosceles 
 * Triangles connected at their bases with one flipped 
 * upside down.
 * 
 * @author Justin Clark
 * @version 0.1
 */
public class MyRhombus extends MyIsoscelesTriangle {
    
    /**
     * MyRhombus constructor.
     * 
     * @param h The height of the rhombus.
     * @param w The width of the rhombus.
     */
    public MyRhombus(int h, int w) {
        // call the constructor in MyIsoscelesTriangle
        super(h, w);
    }

    /**
     * This overrides the getPerimeter() method
     * inherited from MyIsoscelesTriangle.
     * It calls the calcHypotenuse() method in
     * MyIsoscelesTriangle and passes in half
     * the width, and half the height, as arguments,
     * then multiplies the hypotenuse by 4.
     * 
     * @return The approximate perimeter of the rhombus as double.
     */
    @Override
    public double getPerimeter() {
        // calculate the approximate perimeter of the rhombus
        return calcHypotenuse(width/2.0, height/2.0) * 4.0;
    }
    
    /**
     * This overrides the getName() method  
     * inherited from MyIsoscelesTriangle.
     * 
     * @return The type for rhombus as String.
     */
    @Override
    public String getName() {
        return "rhombus";
    }
    
}