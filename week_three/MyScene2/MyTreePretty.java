// import colors
import java.awt.Color;

// Justin Clark
// PA 3: MyScene (MyTree Class)
// Grading: ********************************************* ??

/**
 * Create a tree graphic.
 */
public class MyTreePretty extends NscComponent {
    
    private Color treeColor;
    
    /////// pass color to overloaded constructor
    public MyTreePretty(int x, int y) {
        this(x, y, Color.green);
    }

    public MyTreePretty(int x, int y, Color color) {
        super(x, y, 110, 215);

        // set tree color with specified color
        treeColor = color;

        // create tree 
        createTree();
    }

    // private method to create the tree
    private void createTree() {

        // custom brown color
        Color brown = new Color(149, 99, 57);

        // trunk
        NscComponent trunk = new NscRectangle(49, 164, 13, 51);
        createShape(trunk, brown, true);

        // branches
        drawLine(50, 125, 50, 165, 10, brown);
        drawLine(25, 125, 50, 165, 10, brown);
        drawLine(75, 125, 50, 165, 10, brown);

        // branch outlines
        drawLine(49, 125, 49, 150, 1, Color.black);
        drawLine(60, 125, 60, 150, 1, Color.black);
        drawLine(24, 125, 49, 165, 1, Color.black);
        drawLine(35, 125, 50, 150, 1, Color.black);
        drawLine(85, 125, 60, 165, 1, Color.black);
        drawLine(74, 125, 60, 150, 1, Color.black);

        // leafs
        NscEllipse leafs2 = new NscEllipse(0, 5, 60, 122);
        NscEllipse leafs3 = new NscEllipse(50, 5, 60, 122);
        NscEllipse leafs = new NscEllipse(25, 0, 60, 127);
        NscEllipse leafs4 = new NscEllipse(25, 1, 60, 124);
        createShape(leafs2, treeColor, true);
        createShape(leafs3, treeColor, true);
        createShape(leafs, treeColor, true);
        createShape(leafs4, treeColor, false);

        repaint();
    }

    // private helper to create shapes
    private void createShape(NscComponent comp, Color color, boolean outline) {
        comp.setBackground(color);
        comp.setFilled(true);
        if (!outline) comp.setForeground(color);
        add(comp);
        repaint();
    }

    /**
     * This private helper method takes four end point coordinates 
     * for a line, a count for multiple lines, and an axis to draw 
     * a line on and then draws multiple lines by recursively calling 
     * itself a specified amount of times in order to give the 
     * appearance of thicker lines.
     * 
     * @param x The starting point on the x-axis (from the left).
     * @param y The starting point on the y-axis (from the top).
     * @param x1 The end point on the x-axis (to the right).
     * @param y1 The end point on the y-axis (to the bottom).
     * @param count The amount of times to be recursively called.
     */
    private void drawLine(int x, int y, int x1, int y1, int count, Color color) {

        // draw a line if count is greater than 0
        if (count > 0) {

            NscLine newLine = new NscLine(x+count, y, x1+count, y1);
            newLine.setForeground(color);
            add(newLine);
            
            // ensure we repaint the window
            repaint();

            // recursively call this method, decreasing count each time
            drawLine(x, y, x1, y1, count-1, color);

        }

    }

    /**
     * Change the color of the tree
     * 
     * @param c The color for the leaves of the tree
     */
    public void setColor(java.awt.Color c) {
        treeColor = c;
        createTree();
    }
    
    /**
     * Retrieve the color of the tree
     * 
     * @return The color of the leaves of the tree
     */
    public java.awt.Color getColor() {
        return treeColor;
    }

    public static void main(String[] args) {

        MyTree myTree = new MyTree(10, 10);
        // myTree.setSize(300, 300);
        new TestComponent(myTree);
    }

    
}