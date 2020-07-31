/**
 * A simple reusable component that draws a graphical top hat of a given
 * size. 
 */
public class TopHat extends NscComponent {
    
    // The pieces of the top hat
    private NscComponent brim;
    private NscComponent body;
    
    /**
     * The 'default' constructor for TopHat.
     * This creates a black hat at location (10, 10).
     */
    public TopHat() {
        this(10, 10);
    }
    
    /**
     * A constructor for TopHat. This creates a black top hat
     * of the 'standard' size, at the specified location.
     * 
     * @param x The x-coordinate for the top hat.
     * @param y The y-coordinate for the top hat.
     */
    public TopHat(int x, int y) {
        super(x, y, 70, 45);
        // create the pieces of the hat
        brim = new NscEllipse(0, 35, 70, 10);
        brim.setBackground(java.awt.Color.BLACK);
        brim.setFilled(true);
        body = new NscRectangle(15, 0, 40, 40);
        body.setBackground(java.awt.Color.BLACK);
        body.setFilled(true);
        // add the pieces to the hat
        add(brim);
        this.add(body);
    }

    public void setSize(int w, int h) {


        win.setSize(w, h);
        // brim.setSize(w, 10);
        body.setSize(w-30,h-5);

        // body.setLocation(15, 0);
    }

    public static void main(String[] args) {
        TopHat hat = new TopHat();
        new TestComponent(hat);

        hat.setSize(150, 50);

    }
}