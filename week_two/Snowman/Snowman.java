import java.awt.Color;

/**
 * This class create a happy snowman graphic.
 */
public class Snowman {
    
    /** The show method creates the snowman. */
    public void show() {

        // window object
        NscWindow win;
        win = new NscWindow(75, 50, 160, 250);
        win.setTitle("Happy Snowman");
        
        // body object
        NscEllipse body;
        body = new NscEllipse(25, 25 + 50, 100, 100);
        body.setFilled(true);
        win.add(body);

        // head object
        NscEllipse head;
        head = new NscEllipse(75 - 25, 25, 50, 50);
        head.setFilled(true);
        win.add(head); 

        // left eye object
        NscUpTriangle leftEye;
        leftEye = new NscUpTriangle(75-10-4, 25+15, 10, 10);
        leftEye.setForeground(Color.green);
        leftEye.setFilled(true);
        leftEye.setBackground(Color.blue);
        win.add(leftEye);

        // right eye object
        NscUpTriangle rightEye;
        rightEye = new NscUpTriangle(75+4, 25+15, 10, 10);
        rightEye.setForeground(Color.green);
        rightEye.setFilled(true);
        rightEye.setBackground(Color.blue);
        win.add(rightEye);

        // this creates the circle for the mouth
        NscEllipse mouth = new NscEllipse(25/2, 25-5, 25, 25);
        mouth.setForeground(Color.red);
        head.add(mouth);

        // this hides the top of the circle to create the mouth
        NscRectangle mouthCover = new NscRectangle(25/2, 25-15, 25, 25);
        mouthCover.setForeground(Color.white); // same color as head
        mouthCover.setFilled(true);
        mouthCover.setBackground(Color.white); // same color as head
        head.add(mouthCover);

        // nose must come after the mouth to be in the front
        NscUpTriangle nose = new NscUpTriangle(25-5, 15+10+3, 10, 10);
        nose.setFilled(true);
        Color lightBlue = new Color(196, 196, 255);
        nose.setBackground(lightBlue);
        head.add(nose);

        // ensure we repaint all objects to the window
        win.repaint();

    }

    /** This is the main entry for our program. */
    public static void main(String[] args) {

        // instantiates a new snowman object
        Snowman frosty;
        frosty = new Snowman();

        // calls show method to create and show the snowman
        frosty.show();

    }

}