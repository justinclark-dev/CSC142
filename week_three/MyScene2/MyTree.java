// import colors
import java.awt.Color;

// Justin Clark
// PA 3: MyScene (MyTree Class)
// Challenge Level

/**
 * The MyTree class creates a reusable software 
 * component used to create tree graphics.
 * 
 * @author Justin Clark
 * @version MyTree 1.0.0
 */
public class MyTree extends NscComponent implements CommonMethods {
    
    // member fields to store tree component objects
    private NscEllipse leafs2;
    private NscEllipse leafs3;
    private NscEllipse leafs1;
    private NscEllipse leafs4;
    private NscComponent trunk;

    /**
     * Constructor for objects of class MyTree.
     * This creates a MyTree object at the specified
     * location with a default green color.
     * 
     * @param x The x-coordinate for the object.
     * @param y The y-coordinate for the object.
     */
    public MyTree(int x, int y) {
        // pass default color to overloaded constructor
        this(x, y, Color.green);
    }

    /**
     * Overloaded constructor for objects of class MyTree.
     * This creates a MyTree object at the specified location,
     * and allows us to set a specified tree color.
     * 
     * @param x The x-coordinate for the house.
     * @param y The y-coordinate for the house.
     * @param color The color for the walls of the house.
     */
    public MyTree(int x, int y, Color color) {
        // pass location and size to superclass constructor
        super(x, y, 110, 215);

        // create trunk object
        trunk = new NscRectangle(49, 124, 13, 91);
        colorObject(trunk, new Color(149, 99, 57), true);

        // create leaf objects
        leafs1 = new NscEllipse(25, 0, 60, 127);
        leafs2 = new NscEllipse(0, 5, 60, 122);
        leafs3 = new NscEllipse(50, 5, 60, 122);
        leafs4 = new NscEllipse(25, 1, 60, 124);
        colorObject(leafs2, color, true);
        colorObject(leafs3, color, true);
        colorObject(leafs1, color, true);
        colorObject(leafs4, color, false);

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
    public void colorObject(NscComponent comp, Color color, boolean outline) {
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
     * ratio of the MyTree object with a custom
     * height and width.
     * 
     * @param w The width to set.
     * @param h The height to set.
     */
    public void setSize(int w, int h) {
    
        // set the size on the parent object, NscComponent
        super.setSize(w, h); 

        // constants for the original width and height
        final int W = 110;
        final int H = 215;

        // get new width and height proportions
        int leafs1Width = calcProportion(60, W, w);
        int leafs1Height = calcProportion(127, H, h);
        int leafs2Width = calcProportion(60, W, w);
        int leafs2Height = calcProportion(122, H, h);
        int leafs3Width = calcProportion(60, W, w);
        int leafs3Height = calcProportion(122, H, h);
        int leafs4Width = calcProportion(60, W, w);
        int leafs4Height = calcProportion(124, H, h);
        int trunkWidth = calcProportion(13, W, w);
        int trunkHeight = calcProportion(91, H, h);

        // set the new size on all the components of the tree
        leafs1.setSize(leafs1Width, leafs1Height);
        leafs2.setSize(leafs2Width, leafs2Height);
        leafs3.setSize(leafs3Width, leafs3Height);
        leafs4.setSize(leafs4Width, leafs4Height);
        trunk.setSize(trunkWidth, trunkHeight);

        // get new x and y coordinates based on new proportions
        int leafs1X = calcProportion(25, W, w);
        int leafs1Y = 0;
        int leafs2X = 0;
        int leafs2Y = calcProportion(5, H, h);
        int leafs3X = calcProportion(50, W, w);
        int leafs3Y = calcProportion(5, H, h);
        int leafs4X = calcProportion(25, W, w);
        int leafs4Y = calcProportion(1, H, h);
        int trunkX = calcProportion(49, W, w);
        int trunkY = calcProportion(124, H, h);

        // set all the tree components proportionately 
        leafs1.setLocation(leafs1X, leafs1Y);
        leafs2.setLocation(leafs2X, leafs2Y);
        leafs3.setLocation(leafs3X, leafs3Y);
        leafs4.setLocation(leafs4X, leafs4Y);
        trunk.setLocation(trunkX, trunkY);
        
    }

    /**
     * Changes the color of the tree.
     * 
     * @param c The color for the leaves of the tree.
     */
    public void setColor(java.awt.Color c) {
        leafs1.setBackground(c);
        leafs2.setBackground(c);
        leafs3.setBackground(c);
        leafs4.setBackground(c);
        leafs4.setForeground(c);

        // request repaint of component
        repaint();
    }
    
    /**
     * Retrieves the color of the tree.
     * 
     * @return The color of the leaves of the tree.
     */
    public java.awt.Color getColor() {
        return leafs1.getBackground();
    }

    /**
     * The application method allows us to test 
     * the bounds of a tree object with 3 different
     * sizes.  It is only called when running this 
     * file directly.  It is not utilized when 
     * MyTree is instantiated from an outside class.
     * 
     * @param args Command-line arguments passed
     * in as parameters.
     */
    public static void main(String[] args) {

        // Test the bounds of a smaller size tree
        MyTree testLargerSize = new MyTree(10, 10);
        testLargerSize.setSize(75, 150);
        new TestComponent(testLargerSize);

        // Test the bounds of a default size tree
        MyTree testDefaultSize = new MyTree(10, 10);
        new TestComponent(testDefaultSize);

        // Test the bounds of a larger size tree
        MyTree testSmallerSize = new MyTree(10, 10);
        testSmallerSize.setSize(300, 300);
        new TestComponent(testSmallerSize);

    }

}