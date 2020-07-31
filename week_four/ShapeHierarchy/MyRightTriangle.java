/**
 * This class represents a Right Triangle.
 * A Right Triangle's area and perimeter 
 * can be derived from our knowledge
 * of what an Isosceles Triangle is, 
 * therefore we will inherit from that
 * as our base class.
 * 
 * @author Justin Clark
 * @version 0.1
 */
public class MyRightTriangle extends MyIsoscelesTriangle {
    
    /**
     * MyRightTriangle constructor.
     * 
     * @param h The height of the triangle.
     * @param w The width of the triangle.
     */
    public MyRightTriangle(int h, int w) {
        // call the constructor in MyIsoscelesTriangle
        super(h, w);
    }

    /**
     * This overrides the getPerimeter() method
     * inherited from MyIsoscelesTriangle.
     * It calls the calcHypotenuse() method in
     * MyIsoscelesTriangle and passes in 
     * the width, and height, as arguments,
     * then adds the hypotenuse, width, and height.
     * 
     * @return The approximate perimeter of the triangle as double.
     */
    @Override
    public double getPerimeter() {
        // calculate the approximate perimeter
        return super.calcHypotenuse(width, height) + width + height;
    }
    
    /**
     * This overrides the getName() method  
     * inherited from MyIsoscelesTriangle.
     * 
     * @return The type for right triangle as String.
     */
    @Override
    public String getName() {
        return "right triangle";
    }
    
}