/**
 * This class represents an Isosceles Triangle.
 * 
 * @author Justin Clark
 * @version 0.1
 */
public class MyIsoscelesTriangle extends MyTriangle {
    
    /**
     * MyIsoscelesTriangle constructor.
     * 
     * @param h The height of the triangle.
     * @param w The width of the triangle.
     */
    public MyIsoscelesTriangle(int h, int w) {
        // call the constructor in MyTriangle
        super(h, w);
    }

    /**
     * This is a "protected" helper method that can only 
     * be used by derived classes that extend this class. 
     * It takes in two parameters 'a' and 'b' as doubles, 
     * uses the Pythagorean Theorem to calculate the 
     * hypotenuse of a right triangle, and then returns 
     * the hypotenuse as double. 
     * Pythagorean Theorem: a^2 + b^2 = c^2
     * 
     * @param a The width of the triangle.
     * @param b The height of the triangle.
     * 
     * @return The hypotenuse as double.
     */
    protected double calcHypotenuse(double a, double b) {
        // calculate the hypotenuse
        return Math.sqrt((a * a) + (b * b));
    }
    
    /**
     * This overrides the getPerimeter() method
     * inherited from MyTriangle.
     * It calls the calcHypotenuse() method in
     * MyIsoscelesTriangle and passes in half
     * the width, and the full height, as arguments,
     * then multiplies the hypotenuse by 2, and then 
     * adds the width.
     * 
     * @return The approximate perimeter of the triangle as double.
     */
    @Override
    public double getPerimeter() {
        // calculate the perimeter
        return calcHypotenuse(width/2.0, height) * 2.0 + width;
    }
    
    /**
     * This overrides the getName() method  
     * inherited from MyTriangle.
     * 
     * @return The type for isosceles triangle as String.
     */
    @Override
    public String getName() {
        return "isosceles triangle";
    }
    
}