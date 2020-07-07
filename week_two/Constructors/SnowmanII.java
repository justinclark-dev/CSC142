/**
 * This is a sample class showing how to use the Nsc graphics components.
 * 
 * @author Dan Jinguji
 * @version 1.0
 */
public class SnowmanII {
    
    /*
     * Here are some member variables. They are shared by all of the
     * members of this class. They are called "fields" by the documentation.
     */
    
    // The window to display the snowman
    private NscWindow win;
    
    // The parts of the snowman
    private NscEllipse head;
    private NscEllipse body;
    
    /**
     * This creates the window and places the snowman within it.
     */
    public void buildSnowman() {
        // create the window
        win = new NscWindow(50, 50, 160, 250);
        win.setTitle("My Snowman");
        
        // create and place the head
        head = new NscEllipse();
        head.setLocation(50, 40);
        head.setSize(50, 50);
        win.add(head);
        
        // create and place the body
        body = new NscEllipse();
        body.setLocation(25, 90);
        body.setSize(100, 100);
        win.add(body);
        
        // request a repaint of the window
        win.repaint();
    }
    
    /**
     * This method colors the head and body of the snowman.
     */
    public void colorSnowman() {
        // make them "filled" shapes
        head.setFilled(true);
        body.setFilled(true);
        
        // change the background (fill) colors
        head.setBackground(java.awt.Color.white);
        body.setBackground(java.awt.Color.white);
        
        // request a repaint of the components
        head.repaint();
        body.repaint();
    }
    
    /**
     * This method adds some buttons to the snowman.
     */
    public void addButtons() {
        // declare the buttons
        NscDiamond button1, button2, button3;
        
        // create the buttons
        button1 = new NscDiamond();
        button1.setLocation(70, 105);
        button1.setSize(10, 14);
        button1.setForeground(java.awt.Color.red);
        win.add(button1);
        
        button2 = new NscDiamond();
        button2.setLocation(70, 125);
        button2.setSize(10, 14);
        button2.setFilled(true);
        button2.setBackground(java.awt.Color.green);
        win.add(button2);
        
        button3 = new NscDiamond();
        button3.setLocation(70, 145);
        button3.setSize(10, 14);
        button3.setFilled(true);
        java.awt.Color navy = new java.awt.Color(0, 0, 128);
        button3.setForeground(navy);
        button3.setBackground(new java.awt.Color(255, 255, 255));
        win.add(button3);
        
        // request a repaint of the window
        win.repaint();
    }
    
    /**
     * This method adds the face to the snowman.
     */
    public void addFace() {
        // declare the eyes
        NscUpTriangle eye1, eye2;
        
        // create the eyes and add them
        eye1 = new NscUpTriangle(16, 19, 6, 6);
        eye1.setFilled(true);
        eye1.setBackground(java.awt.Color.black);
        head.add(eye1);
        
        eye2 = new NscUpTriangle(28, 19, 6, 6);
        eye2.setFilled(true);
        eye2.setBackground(java.awt.Color.black);
        head.add(eye2);
        
        // declare the mouth
        NscRectangle smile;
        
        // create the mouth and add it
        smile = new NscRectangle(13, 31, 4, 4);
        smile.setFilled(true);
        smile.setBackground(java.awt.Color.black);
        head.add(smile);
        
        smile = new NscRectangle(18, 33, 4, 4);
        smile.setFilled(true);
        smile.setBackground(java.awt.Color.black);
        head.add(smile);
        
        smile = new NscRectangle(23, 34, 4, 4);
        smile.setFilled(true);
        smile.setBackground(java.awt.Color.black);
        head.add(smile);
        
        smile = new NscRectangle(28, 33, 4, 4);
        smile.setFilled(true);
        smile.setBackground(java.awt.Color.black);
        head.add(smile);
        
        smile = new NscRectangle(33, 31, 4, 4);
        smile.setFilled(true);
        smile.setBackground(java.awt.Color.black);
        head.add(smile);
        
        // request a repaint of the window
        win.repaint();
    }
}

/** 

**** Put this in a .txt file per instructions ****

Justin Clark
LA 3: Constructors

**** Delete questions ****

Why do the declaration and instantiation need to come first?
1.

One of these four methods must be called first. Which one?
2.

Does the order of the _other_ method calls matter for the 
apperance of the completed snowman?
3.

Briefly state why the method you identified in 2) must be 
called first.
4.

How does adding this constructor change the behavior of the .
SnowmanII class? Explain
5.

Does this version of SnowmanII behave any differently than the
one you created for question 5? Explain.
6.

Does this version of SnowmanII behave any differently than the
one you created for question 5? Explain.
7.

Does this version of SnowmanII behave any differently thant the
on you created for question 5? Explain.
8.


*/