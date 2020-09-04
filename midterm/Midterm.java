import java.awt.Color;
/**
 * this is
 * @version
 */

public class Midterm {
    
    // the data
    private Color theValue;

    /**
     * 
     * @param color
     */
    public Midterm(Color color) {
        theValue = color;
    }

    /**
     * 
     * @return
     */
    public Color getColor() {
        return theValue;
    }

    public Midterm makeMidterm() {
        Midterm clone = new Midterm(Color.red);
        System.out.println(clone);
        return clone;
    }

    
    // public static void main(String[] args) {
    //     //Midterm clone = new Midterm(Color.red);
    //     Midterm clone = new Midterm(Color.red);
    //     System.out.println(clone.makeMidterm());
    // }
}