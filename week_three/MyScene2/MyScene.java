// Allow short name access to java.awt.Color
import java.awt.Color;

// Justin Clark
// PA 3: MyScene (MyScene Class)
// Challenge Level

/**
 * This is the shell for assignment: MyScene.
 * This program draws a simple scene using additional
 * classes that the student creates.
 * 
 * @author Dan Jinguji
 * @author Justin Clark
 * @version Programming Assignment: MyScene 2.0.0
 */
public class MyScene extends NscWindow {
    
    // instance variables to store scene objects
    private MyHouse house1;
    private MyHouse house2;
    private MyHouse house3;
    private MyTree tree1;
    private MyTree tree2;
    private MyTree tree3;
    private MyTree tree4;
       
    /**
     * Constructor for objects of class MyScene.
     */
    public MyScene() {

        // specify the constructor for the superclass
        super(10, 10, 400, 300);

        // set characteristics for the object
        setTitle("My Scene");

        // draw the sky
        getContentPane().setBackground(new Color(0x00, 0xCC, 0xFF));
        
        // draw some grass
        NscRectangle grass = new NscRectangle(0, 100, 400, 200);
        grass.setBackground(new Color(0x00, 0x99, 0x00));
        grass.setFilled(true);
        add(grass);

        // create house objects
        house1 = new MyHouse(65, 45);
        house2 = new MyHouse(200, 45, Color.lightGray);
        house3 = new MyHouse(132, 110, Color.white);
        add(house1);
        add(house2);
        add(house3);

        // create tree objects
        tree1 = new MyTree(-25,0,new Color(0,100,0));
        tree2 = new MyTree(25, 10);
        tree3 = new MyTree(300,0,new Color(0,100,0));
        tree4 = new MyTree(250, 10);
        add(tree1);
        add(tree2);
        add(tree3);
        add(tree4);
    
        // request a re-rendering of the window
        repaint();
    }
    
    /**
     * Alter the scene, by changing colors.
     */
    public void change1() {

        // make it a dark night
        getContentPane().setBackground(new Color(20, 24, 82));

        // change the color of the houses
        house1.setColor(Color.darkGray);
        house2.setColor(Color.magenta);
        house3.setColor(Color.orange);

        // change the color of the trees
        tree1.setColor(Color.red);
        tree2.setColor(new Color(249, 166, 2));
        tree3.setColor(Color.orange);
        tree4.setColor(Color.yellow);

        // request a re-rendering of the window
        repaint();
    }
    
    /**
     * Alter the scene, by changing locations.
     */
    public void change2() {
        
        // change the location of the houses
        house1.setLocation(15, 145);
        house2.setLocation(200, 95);
        house3.setLocation(132, 80);

        // change the location of the trees
        tree1.setLocation(10, 40);
        tree2.setLocation(75, 30);
        tree3.setLocation(190,30);
        tree4.setLocation(270, 40);

        // place tree1 in front of tree2
        remove(tree1);
        add(tree1);
        
        // request a re-rendering of the window
        repaint();
    }
    
    /**
     * Alter the scene, by changing sizes.
     */
    public void change3() {
        // change the size of the houses
        house1.setSize(170, 100);
        house2.setSize(100, 110);
        house3.setSize(60, 30);

        // change the size of the trees
        tree1.setSize(90, 250);
        tree2.setSize(60, 100);
        tree3.setSize(60, 80);
        tree4.setSize(140, 190);

        // request a re-rendering of the window
        repaint();
    }
    
    /**
     * Alter the scene, restoring original settings
     */
    public void reset() {

        // redraw the sky
        getContentPane().setBackground(new Color(0x00, 0xCC, 0xFF));

        // reset the initial values for the house        
        house1.setLocation(65, 45);
        house2.setLocation(200, 45);
        house3.setLocation(132, 110);
        house1.setColor(Color.blue);
        house2.setColor(Color.lightGray);
        house3.setColor(Color.white);
        house1.setSize(120, 90);
        house2.setSize(120, 90);
        house3.setSize(120, 90);

        // reset initial values for the trees
        tree1.setLocation(-25,0);
        tree2.setLocation(25, 10);
        tree3.setLocation(300,0);
        tree4.setLocation(250, 10);
        tree1.setColor(new Color(0,100,0));
        tree2.setColor(Color.green);
        tree3.setColor(new Color(0,100,0));
        tree4.setColor(Color.green);
        tree1.setSize(110, 215);
        tree2.setSize(110, 215);
        tree3.setSize(110, 215);
        tree4.setSize(110, 215);

        // place tree2 back in front of tree1
        remove(tree2);
        add(tree2);

        // request a re-rendering of the window
        repaint();
    }
    
    /**
     * The application method, to test your code.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        
        // declare a MyScene reference
        MyScene aScene;

        // instantiate MyScene
        aScene = new MyScene();

        // pause
        javax.swing.JOptionPane.showMessageDialog(null, "Press OK to change colors");
        
        // test setColor
        aScene.change1();
        javax.swing.JOptionPane.showMessageDialog(null, "Press OK to move objects");
        
        // test setLocation
        aScene.change2();
        javax.swing.JOptionPane.showMessageDialog(null, "Press OK to resize objects");
        
        // test setSize
        aScene.change3();
        javax.swing.JOptionPane.showMessageDialog(null, "Press OK to reset scene");
        
        // reset initial values
        aScene.reset();
    }
    
}