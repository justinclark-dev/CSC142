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
    public SnowmanII() {
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
    
  
     public static void main(String[] args) {
         SnowmanII frosty;
         frosty = new SnowmanII();
                  frosty.colorSnowman();
         frosty.addButtons();
         frosty.addFace();
     }


}



/** 

    public static void main(String[] args) {
        SnowmanII frosty;
        frosty = new SnowmanII();
        frosty.buildSnowman();
        frosty.colorSnowman();
        frosty.addButtons();
        frosty.addFace();
    }

--------------------------------------------------------------------
Justin Clark
LA 3: Constructors

1. Declaration and instantiation need to come first because this is 
   how we create a snowman object, and there must first be an object 
   before we can do anything with it.  The variable declaration creates
   a reference for the location in memory of the object, and the
   instantiation creates a new instance of a snowman object.

2. The buildSnowman() method must be called first.

3. No, the order of the other method calls do not matter.

4. The buildSnowman() method must be called first because it creates
   the window, face, and body objects which must be present in order
   for the other methods to have something to add to.

5. Adding this constructor changes the behavior of the SnowmanII class
   by the constructor automatically calling the buildSnowman() method 
   itself. Because of this, we no longer call buildSnowman() from the 
   application method.  The order of calling the other 3 methods is 
   still not important.

6. This version behaves differently because it causes a compilation 
   error: "cannot find symbol" this is because the method buildSnowman()
   no longer exists.

7. Yes, this version behaves differently because it causes another 
   compilation error: "invalid method declaration; return type 
   required".  Methods Always require a return type.  
   
8. Again we observe different behavior, this time getting the "cannot
   find symbol" compilation error again.  This time, it is because
   we changed the method name to be the same as the class name which
   causes the method to be treated as the constructor, and constructors
   cannot have a return type.

*/