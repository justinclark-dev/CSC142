/**
 * This is a simple utility class to test the
 * MyShape hierarchy.
 * 
 * @author Dan Jinguji
 * @author Justin Clark
 * @version 0.2
 */
public class TestShapes {
    
    // This is a Scanner object to handle input  
    private java.util.Scanner scan;
    
    /**
     * This constructs the TestShapes object.
     */
    public TestShapes() {
        // Instantiate the scanner field.
        scan = new java.util.Scanner(System.in);
    }
    
    /**
     * This is the main test method. It will prompt the
     * user for information to create instances and run
     * use the getArea method.
     */
    public void test() {
        // The user's menu input
        int input;
        // The shape
        MyShape shape;
        // prompt for input
        for(input = showMenu(); input != 0; input = showMenu()) {
            // declare some variables for input
            int height, width;
            if(input == 1) {
                // create a MyRectangle
                height = getInt("Enter the height: ");
                width = getInt("Enter the width: ");
                shape = new MyRectangle(height, width);
            } else if(input == 2) {
                // create a MySquare
                height = getInt("Enter the side: ");
                shape = new MySquare(height);
            } else if(input == 3) {
                // create a MyEllipse
                height = getInt("Enter the height: ");
                width = getInt("Enter the width: ");
                shape = new MyEllipse(height, width);
            } else if(input == 4) {
                // create a MyCircle
                height = getInt("Enter the diameter: ");
                shape = new MyCircle(height);
            } else if(input == 5) {
                // create a MyTriangle
                height = getInt("Enter the height: ");
                width = getInt("Enter the base: ");
                shape = new MyTriangle(height, width);
            } else if(input == 6) {
                // create a MyRightTriangle
                height = getInt("Enter the height: ");
                width = getInt("Enter the base: ");
                shape = new MyRightTriangle(height, width);
            } else if(input == 7) {
                // create a MyIsoscelesTriangle
                height = getInt("Enter the height: ");
                width = getInt("Enter the base: ");
                shape = new MyIsoscelesTriangle(height, width);
            } else if(input == 8) {
                // create a MyRhombus
                height = getInt("Enter the height: ");
                width = getInt("Enter the base: ");
                shape = new MyRhombus(height, width);
            } else {
                // unrecognized menu option
                shape = null;
            }
            if(shape != null) {
                // output shape information
                System.out.println("You created a " + shape.getName() + 
                                   ", that is " + shape.getWidth() + " by " + 
                                   shape.getHeight() + ".");
                // output shape area
                System.out.println("  Its area is " + 
                                   shape.toString(shape.getArea()) + ".");
                // handle triangle with no perimeter
                if (shape.getName().equals("triangle")) {
                    // cannot get perimeter message 
                    System.out.println("  Cannot get perimeter of " +
                                       "non-specific triangle.");
                } else {
                    // output perimeter for everything else
                    System.out.println("  Its perimeter is " + 
                                       shape.toString(shape.getPerimeter()) + ".");
                }
            } else {
                // report the error
                System.out.println("Error in menu selection.");
            }
        }
        System.out.println("TestShapes completion.");
    }
    
    // This method displays a menu of options. It then reads
    // an integer value and returns it. 
    //
    // As you add more shapes to the application, simply remove
    // the comment markers at the beginning of the line. 
    // Changing the values associated with the various shapes
    // will result in a style deduction for changing the user
    // interface. (It messes up the testing script.)
    //
    // This is a "helper" method. It is not designed to be
    // used outside of this class. So, it is a private
    // method. JavaDoc will not create documentation for 
    // the method since no one can call it outside of this
    // class.
    private int showMenu() {
        
        // output a blank line as a separator and print menu
        System.out.println();
        System.out.println("Select from the following options:");
        System.out.println("   1. Create a MyRectangle");
        System.out.println("   2. Create a MySquare");
        System.out.println("   3. Create a MyEllipse");
        System.out.println("   4. Create a MyCircle");
        System.out.println("   5. Create a MyTriangle");
        System.out.println("   6. Create a MyRightTriangle");
        System.out.println("   7. Create a MyIsoscelesTriangle");
        System.out.println("   8. Create a MyRhombus");
        System.out.println("   0. Exit TestShapes");
        
        // get the input
        return getInt("Please enter your selection: ");
    }
    
    // This helper method uses the java.util.Scanner class to
    // read an int value. It will continue to prompt until an
    // appropriate value is entered. We will learn about the
    // Scanner class later in the quarter. This code is provided
    // to make the PA possible. Don't worry about trying to 
    // understand this code at this point.
    private int getInt(String prompt) {
        // prompt for input
        System.out.print(prompt);
        while( ! scan.hasNextInt()) {
            scan.next();
            System.out.print("Invalid input. " + prompt);
        }
        return scan.nextInt();
    }
    
    /**
     * The application method. This instantiates the class
     * and calls the test method.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        new TestShapes().test();
    }
    
}
