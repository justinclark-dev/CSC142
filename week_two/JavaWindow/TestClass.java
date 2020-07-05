import java.awt.Color;



public class TestClass {

    public static void main(String[] args) {
        
        NscWindow win = new NscWindow();

        win.setSize(400, 300);
        win.setLocation(25, 25);

        NscRectangle rect;
        rect = new NscRectangle(10, 20, 200, 100);

        win.add(rect);
        win.repaint();

        rect.setSize(150, 200);
        rect.setLocation(50, 50);

        NscEllipse oval;
        oval = new NscEllipse(10, 20, 30, 40);

        win.add(oval);
        win.repaint();

        rect.add(oval);
        win.repaint();

        oval.setSize(200, 100);

        NscEllipse circle = new NscEllipse(25, 25, 100, 100);
        oval.add(circle);
        win.repaint();

        rect.setLocation(100, 150);

        oval.getLocation();

        Color navy = new Color(0, 0, 128);

        //===============================

        NscRectangle rect2;
        rect2 = new NscRectangle(10, 10, 100, 100);
        rect2.setFilled(true);
        rect2.setBackground(java.awt.Color.navy);

        /** We only use the simple name, navy, because that is 
         * 
         *
         * The variable "navy" now refers to the object that we instantiated using the "new" keyword. This new object is of type java.awt.Color its value is java.awt.Color(0, 0, 128).*/

        /** If we try to use java.awt.Color.navy, we get a compilation error because navy is not already defined */

        win.add(rect2);
        win.repaint();
    }
}

