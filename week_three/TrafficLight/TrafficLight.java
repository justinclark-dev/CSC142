import java.awt.Color;

/**
 * Sample solution for Learning Activity: Traffic Light.
 * This example has been altered for the refactoring demo.
 *
 * @author Dan Jinguji
 * @version Refactoring demo
 */
public class TrafficLight {

    // a field for the window, a shared resource
    private NscWindow win;

    /**
     * The constructor which draws the traffic light.
     */
    public TrafficLight() {

        // Create the window
        win = new NscWindow(10, 10, 140, 330);

        // Background rectangle
        NscRectangle background = new NscRectangle(20, 20, 90, 250);
        
        // color the background
        colorBackground(background, Color.lightGray);

        // Create the red light
        createOneLight(30, Color.red);

        // Create the yellow light
        createOneLight(110, Color.yellow);

        // Create the green light
        // Create a new color for the light,
        Color darkerGreen = new Color(0, 127, 0);
        createOneLight(190, darkerGreen);

        // repaint the window, just to be safe
        win.repaint();
    }

    // helper method to draw a light
    private void createOneLight(int yCoord, Color color) {
        // Create the light
        NscEllipse light = new NscEllipse(30, yCoord, 70, 70);
        // Color the light
        colorBackground(light, color);
    }

    private void colorBackground(NscComponent comp, Color color) {
        // set the fill color
        comp.setFilled(true);
        comp.setBackground(color);
        comp.setForeground(color);
        // Add the light to the window
        win.add(comp);
    }

    /**
     * The application method to draw the window
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        new TrafficLight();
        
    }

}