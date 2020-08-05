import java.awt.*;
import javax.swing.*;

// Important note:
//    You are not expected to read and understand this code
//    when it is first presented in week 2. Providing the 
//    source code is just the safest and easiest way to make 
//    some class-specific functionality available to all the 
//    students, regardless of the version of the compiler 
//    being used. Providing compiled code would necessatate
//    having different versions for each version of the compiler.

/**
 * NscWindow is the primary top-level container
 * for NscLibrary. It presents a window on the screen.
 */
public class NscWindow extends JFrame {
    
    /**
     * The zero-parameter constructor for NscWindow.
     * This creates a component at location (25, 25) (the
     * upper-left corner of the container), of size 300 x 400.
     */
    public NscWindow() {
        this(25, 25, 400, 300);
    }
    
    /**
     * The four-parameter constructor for NscWindow.
     * This creates a window at the given location and
     * of the given size. 
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the content pane.
     * @param h The height of the content pane.
     */
    public NscWindow(int x, int y, int w, int h) {
        setSize(w, h);
        setLocation(x, y);
        setVisible(true);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    /**
     * Add the given component to the content pane of this window.
     * This method will make the component appear "on top" of any 
     * components already added to the current window. This method 
     * returns a reference to the newly added component.
     * 
     * @param c The component to be added.
     * @return  The newly added component.
     */
    public Component add(Component c) {
        getContentPane().add(c, 0);
        return c;
    }
    
    /**
     * Set the size of the component.
     * @param w The desired width.
     * @param h The desired height.
     */
    public void setSize(int w, int h) { 
        super.setSize(w, h); 
    }
    /**
     * Get the width of the component.
     * @return The current height of the component.
     */
    public int getWidth() { 
        return super.getWidth(); 
    }
    /**
     * Get the height of the component.
     * @return The current width of the component.
     */
    public int getHeight() { 
        return super.getHeight(); 
    }
    /**
     * Set the size of the component.
     * @param d The desired dimensions.
     */
    public void setSize(Dimension d) { 
        super.setSize(d); 
    }
    /**
     * Get the size of the component.
     * @return The current size of the component.
     */
    public Dimension getSize() { 
        return super.getSize(); 
    }
    
    /**
     * Set the location of the component.
     * @param x The x-coordinate for the component, upper-left corner.
     * @param y The y-coordinate for the component, upper-left corner.
     */
    public void setLocation(int x, int y) { 
        super.setLocation(x, y); 
    }
    /**
     * Get the x-coordinate of the component (upper-left corner).
     * @return The x-coordinate of the component.
     */
    public int getX() { 
        return super.getX(); 
    }
    /**
     * Get the y-coordinate of the component (upper-left corner).
     * @return The y-coordinate of the component.
     */
    public int getY() { 
        return super.getY(); 
    }
    /**
     * Set the location of the component.
     * @param p The desired location, upper-left corner.
     */
    public void setLocation(Point p) {
        super.setLocation(p); 
    }
    /**
     * Get the location of the component.
     * @return The current location of the upper-left corner of the component.
     */
    public Point getLocation() { 
        return super.getLocation(); 
    }
    
    /**
     * Get the content pane (central working area) of the window.
     * @return The content pane.
     */
    public Container getContentPane() { 
        return super.getContentPane(); 
    }
    
    /**
     * Set the title for the window.
     * @param s The desired title for the window.
     */
    public void setTitle(String s) { 
        super.setTitle(s); 
    }
    /**
     * Get the title of the window.
     * @return The current title of the window.
     */
    public String getTitle() { 
        return super.getTitle(); 
    }
    
    /**
     * Request that the window be brought to the front of the stack
     * of windows.
     */
    public void toFront() { 
        super.toFront();
    }
    
    /**
     * Request that the window render (repaint) itself.
     */
    public void repaint() { 
        super.repaint(); 
    }
    
}

/**
 * NscComponent is the basis for the shapes in 
 * NscLibrary. It is a simple container/component
 * based on the java.awt.Container class.
 */
class NscComponent extends Container {
    
    private boolean filled;
    
    /**
     * The zero-parameter constructor for NscComponent.
     * This creates a component at location (0, 0) (the
     * upper-left corner of the container), of size 25 x 25.
     * The component is not filled, with a line color
     * (foreground) of black, and a fill color (background)
     * of white.
     */
    public NscComponent() {
        this(0, 0, 25, 25);
    }
    
    /**
     * The four-parameter constructor for NscComponent.
     * This creates a component at the given location and
     * of the given size. The component is not filled, with 
     * a line color (foreground) of black, and a fill 
     * color (background) of white.
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the component.
     * @param h The height of the component.
     */
    public NscComponent(int x, int y, int w, int h) {
        // set "default" characteristics
        setBounds(x, y, w, h);
        setForeground(Color.black);
        setBackground(Color.red);
        filled = false;
        setLayout(null);
    }
    
    /**
     * Add the given component to this container. This method
     * will make the component appear "on top" of any components
     * already added to the current container. This method returns
     * a reference to the newly added component.
     * 
     * @param c The component to be added.
     * @return  The newly added component.
     */
    public Component add(Component c) {
        add(c, 0);
        return c;
    }
    
    /**
     * Set the filled status of the component.
     * 
     * @param b The new value for the filled property.
     */
    public void setFilled(boolean b) {
        filled = b;
    }
    /**
     * Get the filled status of the component.
     * 
     * @return  The value of the filled property.
     */
    public boolean isFilled() {
        return filled;
    }
    
    /** 
     * Set the background (fill) color for the component.
     * @param c The desired background color.
     */
    public void setBackground(Color c) { 
        super.setBackground(c); 
    }
    /**
     * Get the background (fill) color for the component.
     * @return The current background color.
     */
    public Color getBackground() { 
        return super.getBackground(); 
    }
    /** 
     * Set the foreground (line) color for the component.
     * @param c The desired foreground color.
     */
    public void setForeground(Color c) { 
        super.setForeground(c); 
    }
    /**
     * Get the foreground (line) color for the component.
     * @return The current foreground color.
     */
    public Color getForeground() { 
        return super.getForeground(); 
    }
    
    /**
     * Set the size of the component.
     * @param w The desired width.
     * @param h The desired height.
     */
    public void setSize(int w, int h) { 
        super.setSize(w, h); 
    }
    /**
     * Get the width of the component.
     * @return The current width of the component.
     */
    public int getWidth() { 
        return super.getWidth(); 
    }
    /**
     * Get the height of the component.
     * @return The current height of the component.
     */
    public int getHeight() { 
        return super.getHeight(); 
    }
    /**
     * Set the size of the component.
     * @param d The desired dimensions.
     */
    public void setSize(Dimension d) { 
        super.setSize(d); 
    }
    /**
     * Get the size of the component.
     * @return The current size of the component.
     */
    public Dimension getSize() { 
        return super.getSize(); 
    }
    
    /**
     * Set the location of the component.
     * @param x The x-coordinate for the component, upper-left corner.
     * @param y The y-coordinate for the component, upper-left corner.
     */
    public void setLocation(int x, int y) { 
        super.setLocation(x, y); 
    }
    /**
     * Get the x-coordinate of the component (upper-left corner).
     * @return The x-coordinate of the component.
     */
    public int getX() { 
        return super.getX(); 
    }
    /**
     * Get the y-coordinate of the component (upper-left corner).
     * @return The y-coordinate of the component.
     */
    public int getY() { 
        return super.getY(); 
    }
    /**
     * Set the location of the component.
     * @param p The desired location, upper-left corner.
     */
    public void setLocation(Point p) { 
        super.setLocation(p); 
    }
    /**
     * Get the location of the component.
     * @return The current location of the upper-left corner of the component.
     */
    public Point getLocation() { 
        return super.getLocation(); 
    }
    
    /**
     * Request that the component render (repaint) itself.
     */
    public void repaint() { 
        super.repaint(); 
    }
    
}

/**
 * NscRectangle is the simplest graphic component 
 * in NscLibrary. It is described by the coordinates
 * of the upper-left corner (x, y) and its size
 * (width, height).
 * <blockquote>
 * <img src="images/rectangle.png" alt="rectangle">
 * </blockquote>
 */
class NscRectangle extends NscComponent {
    
    /**
     * The zero-parameter constructor for NscRectangle.
     * This creates a component at location (0, 0) (the
     * upper-left corner of the container), of size 25 x 25.
     * The component is not filled, with a line color
     * (foreground) of black, and a fill color (background)
     * of white.
     */
    public NscRectangle() {
        super(0, 0, 25, 25);
    }
    
    /**
     * The four-parameter constructor for NscRectangle.
     * This creates a component at the given location and
     * of the given size. The component is not filled, with 
     * a line color (foreground) of black, and a fill 
     * color (background) of white.
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the component.
     * @param h The height of the component.
     */
    public NscRectangle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    
    /**
     * Rendering instructions for the object
     * 
     * @param g The Graphics object to update the display.
     */
    public void paint(Graphics g) {
        if(isFilled())
        {
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        g.setColor(getForeground());
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        super.paint(g);
    }
}

/**
 * NscEllipse is one of the simple graphic
 * components in NscLibrary. It presents an ellipse
 * inscribed within a bounding rectangle. The bounds 
 * of the component describe the bounding rectangle.
 * That is, by the coordinates
 * of the upper-left corner (x, y) and its size
 * (width, height).
 * <blockquote>
 * <img src="images/ellipse.png" alt="ellipse">
 * </blockquote>
 */
class NscEllipse extends NscComponent {
    
    /**
     * The zero-parameter constructor for NscEllipse.
     * This creates a component at location (0, 0) (the
     * upper-left corner of the container), of size 25 x 25.
     * The component is not filled, with a line color
     * (foreground) of black, and a fill color (background)
     * of white.
     */
    public NscEllipse() {
        super(0, 0, 25, 25);
    }
    
    /**
     * The four-parameter constructor for NscEllipse.
     * This creates a component at the given location and
     * of the given size. The component is not filled, with 
     * a line color (foreground) of black, and a fill 
     * color (background) of white.
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the component.
     * @param h The height of the component.
     */
    public NscEllipse(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    
    /**
     * Rendering instructions for the object
     * 
     * @param g The Graphics object to update the display.
     */
    public void paint(Graphics g) {
        if(isFilled())
        {
            g.setColor(getBackground());
            g.fillOval(0, 0, getWidth(), getHeight());
        }
        g.setColor(getForeground());
        g.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
        super.paint(g);
    }
}

/**
 * NscDiamond is one of the simple graphic
 * components in NscLibrary. It presents a rhombus
 * inscribed within a bounding rectangle. The bounds 
 * of the component describe the bounding rectangle.
 * The rhombus intersects the midpoints of each side
 * of the bounding rectangle.
 * <blockquote>
 * <img src="images/diamond.png" alt="diamond">
 * </blockquote>
 */
class NscDiamond extends NscComponent {
    
    /**
     * The zero-parameter constructor for NscDiamond.
     * This creates a component at location (0, 0) (the
     * upper-left corner of the container), of size 25 x 25.
     * The component is not filled, with a line color
     * (foreground) of black, and a fill color (background)
     * of white.
     */
    public NscDiamond() {
        super(0, 0, 25, 25);
    }
    
    /**
     * The four-parameter constructor for NscDiamond.
     * This creates a component at the given location and
     * of the given size. The component is not filled, with 
     * a line color (foreground) of black, and a fill 
     * color (background) of white.
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the component.
     * @param h The height of the component.
     */
    public NscDiamond(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    
    /**
     * Rendering instructions for the object
     * 
     * @param g The Graphics object to update the display.
     */
    public void paint(Graphics g) {
        int h = getHeight();
        int w = getWidth();
        int h2 = getHeight() / 2;
        int w2 = getWidth() / 2;
        if(isFilled())
        {
            g.setColor(getBackground());
            g.fillPolygon(new int[] {0, w2, w, w2},
                          new int[] {h2, 0, h2, h}, 
                          4);
        }
        g.setColor(getForeground());
        g.drawPolygon(new int[] {0, w2, w - 1, w2},
                      new int[] {h2, 0, h2, h - 1}, 
                      4);
        super.paint(g);
    }
}

/**
 * NscUpTriangle is one of the simple graphic
 * components in NscLibrary. It presents a triangle
 * inscribed within a bounding rectangle. The bounds 
 * of the component describe the bounding rectangle.
 * One side of this isosceles triangle is the bottom 
 * of the bounding rectangle.
 * <blockquote>
 * <img src="images/uptriangle.png" alt="up triangle">
 * </blockquote>
 */
class NscUpTriangle extends NscComponent {
    
    /**
     * The zero-parameter constructor for NscUpTriangle.
     * This creates a component at location (0, 0) (the
     * upper-left corner of the container), of size 25 x 25.
     * The component is not filled, with a line color
     * (foreground) of black, and a fill color (background)
     * of white.
     */
    public NscUpTriangle() {
        super(0, 0, 25, 25);
    }
    
    /**
     * The four-parameter constructor for NscUpTriangle.
     * This creates a component at the given location and
     * of the given size. The component is not filled, with 
     * a line color (foreground) of black, and a fill 
     * color (background) of white.
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the component.
     * @param h The height of the component.
     */
    public NscUpTriangle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    
    /**
     * Rendering instructions for the object
     * 
     * @param g The Graphics object to update the display.
     */
    public void paint(Graphics g) {
        int h = getHeight();
        int w = getWidth();
        int h2 = getHeight() / 2;
        int w2 = getWidth() / 2;
        if(isFilled())
        {
            g.setColor(getBackground());
            g.fillPolygon(new int[] {0, w, w2},
                          new int[] {h, h, 0},
                          3);
        }
        g.setColor(getForeground());
        g.drawPolygon(new int[] {0, w - 1, w2},
                      new int[] {h - 1, h - 1, 0},
                      3);
        super.paint(g);
    }
}

/**
 * NscDownTriangle is one of the simple graphic
 * components in NscLibrary. It presents a triangle
 * inscribed within a bounding rectangle. The bounds 
 * of the component describe the bounding rectangle.
 * One side of this isosceles triangle is the top 
 * of the bounding rectangle.
 * <blockquote>
 * <img src="images/downtriangle.png" alt="down triangle">
 * </blockquote>
 */
class NscDownTriangle extends NscComponent {
    
    /**
     * The zero-parameter constructor for NscDownTriangle.
     * This creates a component at location (0, 0) (the
     * upper-left corner of the container), of size 25 x 25.
     * The component is not filled, with a line color
     * (foreground) of black, and a fill color (background)
     * of white.
     */
    public NscDownTriangle() {
        super(0, 0, 25, 25);
    }
    
    /**
     * The four-parameter constructor for NscDownTriangle.
     * This creates a component at the given location and
     * of the given size. The component is not filled, with 
     * a line color (foreground) of black, and a fill 
     * color (background) of white.
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the component.
     * @param h The height of the component.
     */
    public NscDownTriangle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    
    /**
     * Rendering instructions for the object
     * 
     * @param g The Graphics object to update the display.
     */
    public void paint(Graphics g) {
        int h = getHeight();
        int w = getWidth();
        int h2 = getHeight() / 2;
        int w2 = getWidth() / 2;
        if(isFilled())
        {
            g.setColor(getBackground());
            g.fillPolygon(new int[] {0, w, w2},
                          new int[] {0, 0, h},
                          3);
        }
        g.setColor(getForeground());
        g.drawPolygon(new int[] {0, w - 1, w2},
                      new int[] {0, 0, h - 1},
                      3);
        super.paint(g);
    }
}

/**
 * NscLeftTriangle is one of the simple graphic
 * components in NscLibrary. It presents a triangle
 * inscribed within a bounding rectangle. The bounds 
 * of the component describe the bounding rectangle.
 * One side of this isosceles triangle is the right side 
 * of the bounding rectangle.
 * <blockquote>
 * <img src="images/lefttriangle.png" alt="left triangle">
 * </blockquote>
 */
class NscLeftTriangle extends NscComponent {
    
    /**
     * The zero-parameter constructor for NscLeftTriangle.
     * This creates a component at location (0, 0) (the
     * upper-left corner of the container), of size 25 x 25.
     * The component is not filled, with a line color
     * (foreground) of black, and a fill color (background)
     * of white.
     */
    public NscLeftTriangle() {
        super(0, 0, 25, 25);
    }
    
    /**
     * The four-parameter constructor for NscLeftTriangle.
     * This creates a component at the given location and
     * of the given size. The component is not filled, with 
     * a line color (foreground) of black, and a fill 
     * color (background) of white.
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the component.
     * @param h The height of the component.
     */
    public NscLeftTriangle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    
    /**
     * Rendering instructions for the object
     * 
     * @param g The Graphics object to update the display.
     */
    public void paint(Graphics g) {
        int h = getHeight();
        int w = getWidth();
        int h2 = getHeight() / 2;
        int w2 = getWidth() / 2;
        if(isFilled())
        {
            g.setColor(getBackground());
            g.fillPolygon(new int[] {0, w, w},
                          new int[] {h2, h, 0},
                          3);
        }
        g.setColor(getForeground());
        g.drawPolygon(new int[] {0, w - 1, w - 1},
                      new int[] {h2, h - 1, 0},
                      3);
        super.paint(g);
    }
}

/**
 * NscRightTriangle is one of the simple graphic
 * components in NscLibrary. It presents a triangle
 * inscribed within a bounding rectangle. The bounds 
 * of the component describe the bounding rectangle.
 * One side of this isosceles triangle is the left side 
 * of the bounding rectangle.
 * <blockquote>
 * <img src="images/righttriangle.png" alt="right triangle">
 * </blockquote>
 */
class NscRightTriangle extends NscComponent {
    
    /**
     * The zero-parameter constructor for NscRightTriangle.
     * This creates a component at location (0, 0) (the
     * upper-left corner of the container), of size 25 x 25.
     * The component is not filled, with a line color
     * (foreground) of black, and a fill color (background)
     * of white.
     */
    public NscRightTriangle() {
        super(0, 0, 25, 25);
    }
    
    /**
     * The four-parameter constructor for NscRightTriangle.
     * This creates a component at the given location and
     * of the given size. The component is not filled, with 
     * a line color (foreground) of black, and a fill 
     * color (background) of white.
     * 
     * @param x The x-coordinate for the component.
     * @param y The y-coordinate for the component.
     * @param w The width of the component.
     * @param h The height of the component.
     */
    public NscRightTriangle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    
    /**
     * Rendering instructions for the object
     * 
     * @param g The Graphics object to update the display.
     */
    public void paint(Graphics g) {
        int h = getHeight();
        int w = getWidth();
        int h2 = getHeight() / 2;
        int w2 = getWidth() / 2;
        if(isFilled())
        {
            g.setColor(getBackground());
            g.fillPolygon(new int[] {0, 0, w},
                          new int[] {h, 0, h2},
                          3);
        }
        g.setColor(getForeground());
        g.drawPolygon(new int[] {0, 0, w - 1},
                      new int[] {h - 1, 0, h2},
                      3);
        super.paint(g);
    }
}

/**
 * NscLine is one of the simple graphic components 
 * in NscLibrary. It presents a line. The endpoints
 * of the line describe a bounding rectangle for this
 * component. The endpoints giving opposite corners of
 * this bounding rectangle. Setting the size of this 
 * component therefore adjusts one or both endpoints of
 * the line.
 * <blockquote>
 * <img src="images/line.png" alt="line">
 * </blockquote>
 */
class NscLine extends Component {
    
    private boolean nw_se;
    
    /**
     * The four-parameter constructor for NscLine.
     * This creates a component with the given endpoints. 
     * The line color (foreground) is black.
     * 
     * @param x1 The x-coordinate for the first endpoint.
     * @param y1 The y-coordinate for the first endpoint.
     * @param x2 The x-coordinate for the second endpoint.
     * @param y2 The y-coordinate for the second endpoint.
     */
    public NscLine(int x1, int y1, int x2, int y2) {
        setEndPoints(x1, y1, x2, y2);
        setForeground(Color.black);
    }
    
    /**
     * Sets the endpoints for the current NscLine.
     * 
     * @param x1 The x-coordinate for the first endpoint.
     * @param y1 The y-coordinate for the first endpoint.
     * @param x2 The x-coordinate for the second endpoint.
     * @param y2 The y-coordinate for the second endpoint.
     */
    public void setEndPoints(int x1, int y1, int x2, int y2) {
        if(x1 > x2) {
            int temp = x1;
            x1 = x2;
            x2 = temp;
            temp = y1;
            y1 = y2;
            y2 = temp;
        }
        if(x1 == x2)
            x2 ++;
        if(y1 > y2) {
            int temp = y1;
            y1 = y2;
            y2 = temp;
            nw_se = false;
        } else {
            nw_se = true;
        }
        if(y1 == y2)
            y2 ++;
        setSize(x2 - x1, y2 - y1);
        setLocation(x1, y1);
    }
    
    /**
     * Rendering instructions for the object
     * 
     * @param g The Graphics object to update the display.
     */
    public void paint(Graphics g) {
        g.setColor(getForeground());
        if(nw_se)
            g.drawLine(0, 0, getWidth() - 1, getHeight() - 1);
        else
            g.drawLine(0, getHeight() - 1, getWidth() - 1, 0);
    }
}