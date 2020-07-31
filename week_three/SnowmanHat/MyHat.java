// Imports the Colors
import java.awt.Color;

// Justin Clark
// LA 5: Snowman's Hat
// Grading: Check Level

/**
 * This class creates a reusable component 
 * that draws graphic of a baseball hat 
 * with ability to set a location.
 * 
 * @author Justin Clark
 * @version 1.0
 */
public class MyHat extends NscComponent {

    // these are the hat's components
    private NscComponent body;
    private NscComponent brim;
    private NscComponent brimHide;

    /**
     * This is the 'default' constructor for MyHat.
     * Sets the default location of (50, 25) for the hat.
     */
    public MyHat() {
        this(50, 25);
    }

    /**
     * Creates a 'one-size-fits-all' blue 
     * baseball cap with the letter "F".
     * 
     * @param x The x-coordinate of the baseball cap.
     * @param y The y-coordinate of the baseball cap.
     */
    public MyHat(int x, int y) {
        
        // create the underlying NscComponent
        super(x, y, 65, 30);

        // create the body of the hat
        body = new NscEllipse(0, 0, 50, 50);
        this.colorShape(body, Color.blue, true);

        // create the letter "F" for Frosty
        drawLine(20,7,11,2, Color.white);
        drawLine(20,12,7,2, Color.white);
        drawLine(20,7,2,14, Color.white);

        // create the brim of the hat
        brim = new NscEllipse(10, 20, 50, 50);
        this.colorShape(brim, Color.black, true);

        // create the illusion of depth of the brim
        brimHide = new NscEllipse(20, 25, 40, 45);
        this.colorShape(brimHide, Color.white, true);  
    }

    // helper function that colors a shape
    private void colorShape(NscComponent comp, Color c, boolean filled) {
        comp.setFilled(filled);
        comp.setBackground(c);
        comp.setForeground(c);
        this.add(comp);
    }

    // helper function draws lines for the letter "F"
    private void drawLine(int x, int y, int w, int h, Color c) {
        NscComponent line = new NscRectangle(x, y, w, h);
        line.setFilled(true);
        line.setBackground(c);
        line.setForeground(c);
        body.add(line);
    }

}