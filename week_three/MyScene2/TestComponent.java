/**
 * This is a test harness for simple graphic classes.
 * 
 * @author Dan Jinguji
 * @version 0.2
 */
public class TestComponent implements java.awt.event.ComponentListener {
    
    // field to keep track of the window
    javax.swing.JFrame win;
    
    // field to keep track of the test component
    java.awt.Component testComp;
    
    /**
     * Constructor for the harness
     * 
     * @param comp The component to be tested
     */
    public TestComponent(java.awt.Component comp) {
        
        // create a window
        win = new javax.swing.JFrame("Test the Component");
        win.setLocation(10, 10);
        win.setSize(10, 10);
        win.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        
        // add the test component to the window
        win.add(comp);
        testComp = comp;
        // add spacers around the component
        win.add(new VSpacer(), java.awt.BorderLayout.NORTH);
        win.add(new VSpacer(), java.awt.BorderLayout.SOUTH);
        win.add(new HSpacer(), java.awt.BorderLayout.EAST);
        win.add(new HSpacer(), java.awt.BorderLayout.WEST);
        
        // some "magic" code to check for the margin
        comp.setPreferredSize(comp.getSize());
        win.pack();
        
        // make the window visible
        win.setVisible(true);
        win.toFront();
        
        // setup to response to component resize requests
        comp.addComponentListener(this);
    }
    
    /**
     * Listener method (handler) for resizing the component
     * @param e The event object that triggered the handler
     */
    public void componentResized(java.awt.event.ComponentEvent e) {
        // set the preferred size based on the updated size
        testComp.setPreferredSize(testComp.getSize());
        // resize the window
        win.pack();
    }
    
    /**
     * Required method because of implementing the interface.
     * Not used in this implementation
     * @param e The event object that triggered the handler
     */
    public void componentHidden(java.awt.event.ComponentEvent e) {}
    
    /**
     * Required method because of implementing the interface.
     * Not used in this implementation
     * @param e The event object that triggered the handler
     */
    public void componentMoved(java.awt.event.ComponentEvent e) {}
    
    /**
     * Required method because of implementing the interface.
     * Not used in this implementation
     * @param e The event object that triggered the handler
     */
    public void componentShown(java.awt.event.ComponentEvent e) {}
    
}

/**
 * Helper class to set up horizontal spacing
 */
class HSpacer extends java.awt.Panel {
    /**
     * Constructor sets the preferred size and background color
     */
    public HSpacer() {
        setPreferredSize(new java.awt.Dimension(75, 0));
        setBackground(java.awt.Color.gray);
    }
}

/**
 * Helper class to set up vertical spacing
 */
class VSpacer extends java.awt.Panel {
    /**
     * Constructor sets the preferred size and background color
     */
    public VSpacer() {
        setPreferredSize(new java.awt.Dimension(0, 75));
        setBackground(java.awt.Color.gray);
    }
}