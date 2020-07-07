// Imports the Colors
import java.awt.Color;

/**
 * Justin Clark
 * LA 2: Traffic Light
 * 
 * This class creates a graphic of a traffic light.
 */
public class TrafficLight {

    // Instance variables
    private NscWindow win;
    private NscRectangle lightFrame;

    /** 
     * This method draws the traffic light. 
     */
    public void drawTheLight() {

        // Creates the window object.
        win = new NscWindow(10, 10, 140, 330);

        // Sets the window title.
        win.setTitle("Traffic Light");

        // Creates a lightFrame object at given coordinates
        // and with specified size.
        lightFrame = new NscRectangle(20, 20, 90, 250);

        // Enables setting the background fill color.
        lightFrame.setFilled(true);

        // Sets the background fill color.
        lightFrame.setBackground(Color.lightGray);

        // Sets the border color.
        lightFrame.setForeground(Color.lightGray);

        // Adds the lightFrame to the window.
        win.add(lightFrame);

    }

    /**
     * This method draws the circle for the lights.
     * 
     * @param color The color of the circle.
     * @param yCoordinate The y-coordinate of the circle.
     */
    public void drawCircleForLight(Color color, int yCoordinate) {

        // Creates a circle object at given coordinates
        // and with specified size.
        // (Since we are adding the circle to the lightFrame,
        // we have no need to create an instance variable for
        // the circle, hence this local variable).
        NscEllipse circle = new NscEllipse(10, yCoordinate, 70, 70);

        // Enables setting the background fill color.
        circle.setFilled(true);

        // Sets the background fill color.
        circle.setBackground(color);

        // Sets the border color.
        circle.setForeground(color);

        // Adds the circle to the lightFrame.
        lightFrame.add(circle);
    }

    /**
     * Application method is the entry point of our application.
     */
    public static void main(String[] args) {
        
        // Creates trafficLight object
        TrafficLight trafficLight = new TrafficLight();

        // Creates custom darkGreen Color object.
        Color darkGreen = new Color(0, 128, 0);

        // Method call to draw the light.
        trafficLight.drawTheLight();

        // Method call to draw a the top red circle for the light
        // y-coordinate is 10 pixels down
        trafficLight.drawCircleForLight(Color.red, 10);

        // Method call to draw a the middle yellow circle for the light
        // y-coordinate is (10 + 70 + 10 = 90) pixels down
        trafficLight.drawCircleForLight(Color.yellow, 90);

        // Method call to draw a the top bottom green circle for the light
        // y-coordinate is (90 + 70 + 10 = 170) pixels down
        trafficLight.drawCircleForLight(darkGreen, 170);

    }
}