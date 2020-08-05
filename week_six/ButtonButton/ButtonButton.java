// import code resources
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;

/**
 * This class demonstrates a simple use case for 
 * using Java UI buttons that are event driven by
 * having the program cycle through and array of 
 * colors, forwards and backwards, changing the 
 * color of the oval displayed in the window.
 * 
 * @author Justin Clark
 * @version LA 9: ButtonButton, Updated (Version 0.1)
 * Grading: Plus Level
 */
public class ButtonButton implements ActionListener {

    /**
     *  Field for holding reference to the window.
     */
    private NscWindow win;
    /**
     * Field for holding reference to the oval.
     */
    private NscEllipse oval;
    /**
     * Field for holding reference to the previous color button.
     */
    private JButton btnPrevious;
    /** 
     * Field for holding reference to the next color button. 
     */
    private JButton btnNext;
    /**
     * Field for holding reference to the array of colors.
     */
    private Color[] colors;
    /**
     * Field for holding reference to the 
     * current index of the color of the oval.
     */
    private int currentColorIndex;

    /**
     * This is the zero parameter constructor
     * that initializes all of the fields for
     * this program.
     */
    public ButtonButton() {

        // create the window object
        win = new NscWindow();
        win.setTitle("ButtonButton");

        // create the array of colors
        colors = new Color[6];
        colors[0] = Color.red;
        colors[1] = Color.yellow;
        colors[2] =  Color.green;
        colors[3] =  Color.cyan;
        colors[4] =  Color.blue;
        colors[5] =  Color.magenta;

        // set the current color to blue
        currentColorIndex = 4;

        // create the oval object
        oval = new NscEllipse(100, 70, 200, 150);
        oval.setFilled(true);
        oval.setBackground(colors[currentColorIndex]);
        win.add(oval);

        // create the previous color button
        btnPrevious = new JButton("Prev Color");
        btnPrevious.setSize(120, 35);
        btnPrevious.setLocation(60, 10);
        btnPrevious.addActionListener(this);
        win.add(btnPrevious);

        // create the next color button
        btnNext = new JButton("Next Color");
        btnNext.setSize(120, 35);
        btnNext.setLocation(220, 10);
        btnNext.addActionListener(this);
        win.add(btnNext);
       
        // repaint the window for good measure
        win.repaint();

    }

    /**
     * The method from ActionListener.
     * 
     * @param e The action that triggered this handler.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        // create a reference to the current button that triggered an event
        JButton btn;
        btn = (JButton) e.getSource();     
        
        // handle cycling through the previous colors
        if (btn.getText().equals("Prev Color")) {
            // current index is at beginning of array
            if (currentColorIndex == 0) {
                // cycle to the end
                currentColorIndex = colors.length - 1;
            } else {
                // decrease to get previous color
                currentColorIndex--;
            }
        }
        // handle cycling through the next colors 
        else if (btn.getText().equals("Next Color")) {
            // if current index is at end of array
            if (currentColorIndex == colors.length - 1) {
                // cycle back to beginning
                currentColorIndex = 0;
            } else {
                // increase to get next color
                currentColorIndex++;
            }
        }
        
        // set the color using the new index of the array
        oval.setBackground(colors[currentColorIndex]);
        
        // need to repaint the window for changes to propagate
        win.repaint();
    }

    /**
     * The application method initiates our program.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {

        // instantiate a new object of this class
        new ButtonButton();
    }
}