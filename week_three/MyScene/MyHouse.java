// import colors
import java.awt.Color;

/**
 * A new graphic component. This component is used in
 * the notes to highlight the process of designing a 
 * new object and then implementing it.
 *
 * @author Dan Jinguji
 * @author Justin Clark
 * @version PA 3: MyScene (MyHouse Class)
 * Grading: Challenge Level
 */
public class MyHouse extends NscComponent {
    
    // member fields to build our MyHouse object
    /**
     * The roof of the house.
     */
    private NscUpTriangle theRoof;
    /** 
     * The walls of the house.
     */
    private NscRectangle theWalls;
    /** 
     * The door of the house. 
     */
    private NscRectangle theDoor;
   
    /**
     * Constructor for objects of class MyHouse.
     * This creates a MyHouse object at the specified
     * location with default blue color.
     * 
     * @param x The x-coordinate for the object.
     * @param y The y-coordinate for the object.
     */
    public MyHouse(int x, int y) {

        // pass default color to overloaded constructor
        this(x, y, Color.blue);

    }
    
    /**
     * Overloaded constructor for objects of class MyHouse.
     * This creates a MyHouse object at the specified
     * location, and allows us to set a color of the walls.
     * 
     * @param x The x-coordinate for the house.
     * @param y The y-coordinate for the house.
     * @param color The color for the walls of the house.
     */
    public MyHouse(int x, int y, Color color) {

        // Specify the constructor for the superclass
        super(x, y, 120, 90);
        
        // Create the roof object
        theRoof = new NscUpTriangle(0, 0, 120, 40);
        colorObject(theRoof, new Color(0x99, 0x33, 0x00), true);
        
        // Create the walls object
        theWalls = new NscRectangle(10, 40, 100, 50);
        colorObject(theWalls, color, true);
        
        // Create the door object
        theDoor = new NscRectangle(48, 50, 24, 40);
        colorObject(theDoor, new Color(0x99, 0x66, 0x33), true);

        // request repaint of component
        repaint();

    }

    /**
     * Creates NscComponent shapes and color them.
     * 
     * @param comp The NscComponent shape to create.
     * @param color The color to fill the background of the shape.
     * @param outline True leaves a default black outline, set false for no outline.
     */
    private void colorObject(NscComponent comp, Color color, boolean outline) {

        // color the component
        comp.setBackground(color);
        comp.setFilled(true);

        // make outline same color as fill
        if (!outline) comp.setForeground(color);

        // add the new component and repaint the
        add(comp);

        // request repaint of component
        repaint();

    }

    /**
     * Overrides setSize method in parent class
     * allowing client to change size and aspect
     * ratio of the MyHouse object with a custom
     * height and width.
     * 
     * @param w The width to set.
     * @param h The height to set.
     */
    public void setSize(int w, int h) {
    
        // set the size on the parent object, NscComponent
        super.setSize(w, h); 

        // constants for the original width and height
        final int W = 120;
        final int H = 90;

        // get new width and height proportions        
        int roofWidth = w;
        int roofHeight = calcProportion(40, H, h);
        int wallsWidth = calcProportion(100, W, w);
        int wallsHeight = calcProportion(50, H, h);
        int doorWidth = calcProportion(24, W, w);
        int doorHeight = calcProportion(40, H, h);

        // set the new size on all the components of the house
        theRoof.setSize(roofWidth, roofHeight);
        theWalls.setSize(wallsWidth , wallsHeight);
        theDoor.setSize(doorWidth, doorHeight);

        // get new x and y coordinates based on new proportions
        int wallsX = calcProportion(10, W, w);
        int wallsY = calcProportion(40, H, h);
        int doorX = calcProportion(48, W, w);
        int doorY = calcProportion(50, H, h);

        // set all the house components proportionately 
        theWalls.setLocation(wallsX, wallsY);
        theDoor.setLocation(doorX, doorY);

    }

    /**
     * Calculates proportion for new aspect 
     * ratio to support different tree sizes.
     * 
     * @param part The original part.
     * @param total The original total.
     * @param dimension The new dimension.
     * @return The new proportion.
     */
    private int calcProportion(double part, double total, double dimension) {

        // round to nearest integer before casting to integer for greater accuracy
        return (int)Math.round((part / total) * dimension);

    }

    /**
     * Change the color of the house
     * 
     * @param c The color for the walls of the house
     */
    public void setColor(java.awt.Color c) {

        // change the color of the house
        theWalls.setBackground(c);

        // request repaint of component
        repaint();

    }
    
    /**
     * Retrieve the color of the house
     * 
     * @return The color of the walls of the house
     */
    public java.awt.Color getColor() {

        // return the color of the house
        return theWalls.getBackground();

    }

    /**
     * The application method allows us to test 
     * the bounds of a house object with 3 different
     * sizes.  It is only called when running this 
     * file directly.  It is not utilized when 
     * MyHouse is instantiated from an outside class.
     * 
     * @param args Command-line arguments passed
     * in as parameters.
     */
    public static void main(String[] args) {

        // Test the bounds of a smaller size tree
        MyHouse testLargerSize = new MyHouse(10, 10);
        testLargerSize.setSize(75, 150);
        new TestComponent(testLargerSize);

        // Test the bounds of a default size tree
        MyHouse testDefaultSize = new MyHouse(10, 10);
        new TestComponent(testDefaultSize);

        // Test the bounds of a larger size tree
        MyHouse testSmallerSize = new MyHouse(10, 10);
        testSmallerSize.setSize(300, 300);
        new TestComponent(testSmallerSize);

    }
    
}