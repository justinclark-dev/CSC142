import java.awt.Color;

// Justin Clark
// PA 2: Draw Tic-Tac-Toe Boards
// Challenge Level ++
 
/**
 * This class creates a series of four different configurable
 * Tic-Tac-Toe boards in a Java window.
 * 
 * @author Justin Clark
 * @version 1.5
 */
public class TicTacToe {

    /** 
     * instance variable to hold the window object.
     */ 
    private NscWindow win;

    /**
     * This zero-parameter constructor initializes our window 
     * and calls four public methods to draw four different 
     * versions of Tic Tac Toe Boards.
     */
    TicTacToe() {

        // creates the window and sets the title
        win = new NscWindow(10, 10, 300, 330);
        win.setTitle("Tic-Tac-Toe Boards");

        // calls the standard method for drawing a board
        drawTicTacToeBoard(40, 40);

        // calls the overloaded method for drawing a board with color
        drawTicTacToeBoard(170, 40, Color.red);

        // calls the overloaded method for drawing a board with line width
        drawTicTacToeBoard(40, 170, 5);

        // calls the overloaded method for rotation
        drawTicTacToeBoard(170, 170, 15.0);

    }

    /**
     * This method takes an x and y coordinate and draws a
     * normal Tic Tac Toe Board at the specified coordinates.
     * 
     * @param x This is the x-coordinate.
     * @param y This is the y-coordinate.
     */
    public void drawTicTacToeBoard(int x, int y) {

        // create the vertical lines and add them
        NscLine verticalLine1 = new NscLine(x+30, y+0, x+30, y+90);
        NscLine verticalLine2 = new NscLine(x+60, y+0, x+60, y+90);
        win.add(verticalLine1);
        win.add(verticalLine2);

        // create the horizontal lines and add them
        NscLine horizontalLine1 = new NscLine(x+0, y+30, x+90, y+30);
        NscLine horizontalLine2 = new NscLine(x+0, y+60, x+90, y+60);
        win.add(horizontalLine1);
        win.add(horizontalLine2);

        // ensure we repaint the window
        win.repaint();

    }

    /**
     * This method is a method overload that takes an additional 
     * parameter for a color to draw Tic Tac Toe Board at the 
     * specified coordinates.
     * 
     * @param x This is the x-coordinate.
     * @param y This is the y-coordinate.
     * @param color This is the color we render the lines.
     * 
     * @see #drawTicTacToeBoard(int x, int y)
     */
    public void drawTicTacToeBoard(int x, int y, Color color) {

        // create the vertical lines and add them
        NscLine verticalLine1 = new NscLine(x+30, y+0, x+30, y+90);
        NscLine verticalLine2 = new NscLine(x+60, y+0, x+60, y+90);
        win.add(verticalLine1);
        win.add(verticalLine2);

        // create the horizontal lines and add them
        NscLine horizontalLine1 = new NscLine(x+0, y+30, x+90, y+30);
        NscLine horizontalLine2 = new NscLine(x+0, y+60, x+90, y+60);
        win.add(horizontalLine1);
        win.add(horizontalLine2);

        // paint all the lines the color we passed in
        verticalLine1.setForeground(color);
        verticalLine2.setForeground(color);
        horizontalLine1.setForeground(color);
        horizontalLine2.setForeground(color);

        // ensure we repaint the window
        win.repaint();

    }

    /**
     * This method is a method overload that takes an additional 
     * parameter for a line width to draw a Tic Tac Toe Board at 
     * the specified coordinates.
     * 
     * @param x This is the x-coordinate.
     * @param y This is the y-coordinate.
     * @param width This is the width we make the lines.
     * 
     * @see #drawTicTacToeBoard(int x, int y)
     */
    public void drawTicTacToeBoard(int x, int y, int width) {
       
        // call helper method to find space amounts
        int space1 = calculateSquareSpaces(width)[0];
        int space2 = calculateSquareSpaces(width)[1];
        
        // create the vertical lines (with rectangles) and add them
        NscRectangle verticalLine1 = new NscRectangle(x+space1, y, width, 90);
        NscRectangle verticalLine2 = new NscRectangle(x+space2, y, width, 90);
        win.add(verticalLine1);
        win.add(verticalLine2);

        // create the horizontal lines (with rectangles) and add them
        NscRectangle horizontalLine1 = new NscRectangle(x, y+space1, 90, width);
        NscRectangle horizontalLine2 = new NscRectangle(x, y+space2, 90, width);
        win.add(horizontalLine1);
        win.add(horizontalLine2);

        // enable background color for all the lines
        verticalLine1.setFilled(true);
        verticalLine2.setFilled(true);
        horizontalLine1.setFilled(true);
        horizontalLine2.setFilled(true);
        
        // fill in the background color of all the lines
        verticalLine1.setBackground(Color.black);
        verticalLine2.setBackground(Color.black);
        horizontalLine1.setBackground(Color.black);
        horizontalLine2.setBackground(Color.black);

        // Ensure we repaint the window
        win.repaint();

    }

    /**
     * This method is a method overload that takes an additional 
     * parameter for a degrees of rotation to draw a Tic Tac Toe 
     * Board at the specified coordinates.
     * 
     * @param x This is the x-coordinate.
     * @param y This is the y-coordinate.
     * @param rotate This is the rotation amount.
     * 
     * @see #drawTicTacToeBoard(int x, int y)
     */
    public void drawTicTacToeBoard(int x, int y, double rotate) {

        // call helper method to create vertical lines
        drawRotatedLine(30, 0, 30, 90, y, rotate);
        drawRotatedLine(60, 0, 60, 90, y, rotate);

        // call helper method to create horizontal lines
        drawRotatedLine(0, 30, 90, 30, x, rotate);
        drawRotatedLine(0, 60, 90, 60, x, rotate);

    }
    
    /**
     * This private helper function takes a line width and returns an 
     * array of integers that are used to space the size of the 9 squares 
     * of a tic tac toe board as uniform as possible (with perfect symmetry).
     * 
     * @param width The line width of the lines for the board.
     * @return The two amounts used to space apart the board squares.
     */
    private int[] calculateSquareSpaces(int width) {

        // constants to hold the width of the board, and the count of squares across
        final double BOARD_WIDTH = 90.0;
        final double SQUARES_ACROSS = 3.0;

        // calculate the combined line width across
        int combinedLineWidth = (int)((double)width * 2.0);
        
        // calculate the space before the first point
        int space1 = (int)Math.round((BOARD_WIDTH - combinedLineWidth) / SQUARES_ACROSS);
        
        // calculate the space before the second point
        int space2 = (((int)BOARD_WIDTH - (space1*2)) - combinedLineWidth+space1+width);

        // return the two space amounts
        return new int[]{space1, space2};
    }

    /**
     * This private helper method takes four end point coordinates, an
     * offset amount, and a rotation amount and draws a single rotated line. 
     * 
     * @param x The starting point on the x-axis (from the left).
     * @param y The starting point on the y-axis (from the top).
     * @param x1 The end point on the x-axis (to the right).
     * @param y1 The end point on the y-axis (to the bottom).
     * @param offset This is how far down or to the right we move the line.
     * @param rotate This is the degrees of rotation to turn the line.
     */
    private void drawRotatedLine(int x, int y, int x1, int y1, int offset, double rotate) {

        // call helper method to get rotated end points for line
        int[] points1 = findRotationPoints(x, y, rotate);
        int[] points2 = findRotationPoints(x1, y1, rotate);

        // create line with new end points (offsetting appropriately)
        NscLine rotatedLine = new NscLine(points1[0]+offset, points1[1]+offset, points2[0]+offset, points2[1]+offset);

        // add line to the window
        win.add(rotatedLine);

        // ensure we repaint the window
        win.repaint();

    }

    /**
     * This a private helper method that takes an x and y coordinate, 
     * and a degrees of rotation to find new coordinates x1 and y1 
     * that are returned as the new rotated coordinate points.
     * 
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @param degrees The amount of rotation.
     * 
     * @return The new rotated coordinate points (x1, y1) as an array of integers.
     */
    private int[] findRotationPoints(int x , int y, double degrees) {

        // theta is the degrees converted to radians to rotate
        double theta = Math.toRadians(degrees);

        // center point "(a, b)" is (45, 45) because our rectangle is 90 in diameter
        int a = 45;
        int b = 45;
        
        // use the equation of a circle to find the radius squared
        double rSquared = Math.pow((x-a),2) + Math.pow((y-b),2);

        // get the omega value
        double omega = Math.atan2(y - b, x - a);

        // get radius by taking the square root of the radius squared
        double r = Math.sqrt(rSquared);

        // solve for x1 (this will be the rotated x-coordinate)
        double x1 = r * (cos(theta)*cos(omega) - sin(theta)*sin(omega)) + a;

        // solve for y1 (this will be the rotated y-coordinate)
        double y1 = r * (sin(theta)*cos(omega) + cos(theta)*sin(omega)) + b;

        // cast x1 and y1 as integers and return the new points as an array
        return new int[] {(int)x1, (int)y1};

    }

    /**
     * This private helper method takes a number and  
     * returns the cosine, using the Math.cos() method.
     * We are only creating this helper to make the calling 
     * method easier to read long equation declarations.
     * 
     * @param a The number (double) to get cosine for.
     * 
     * @return The cosine of the number passed in.
     */
    private double cos(double a) {
        return Math.cos(a);
    }

    /**
     * This private helper method takes a number and 
     * returns the sine, using the Math.sin() method.
     * We are only creating this helper to make the calling 
     * method easier to read long equation declarations.
     * 
     * @param a The number (double) to get sine for.
     * 
     * @return The sine of the number passed in.
     */
    private double sin(double a) {
        return Math.sin(a);
    }

    /**
     * This private helper method takes four end point coordinates 
     * for a line, a count for multiple lines, and an axis to draw 
     * a line on and then draws multiple lines by recursively calling 
     * itself a specified amount of times in order to give the 
     * appearance of thicker lines.
     * 
     * @deprecated This method will be removed in homework version 2.0.
     * 
     * @param x The starting point on the x-axis (from the left).
     * @param y The starting point on the y-axis (from the top).
     * @param x1 The end point on the x-axis (to the right).
     * @param y1 The end point on the y-axis (to the bottom).
     * @param count The amount of times to be recursively called.
     * @param axis The axis in which the line will be drawn.
     */
    @Deprecated
    private void drawLine(int x, int y, int x1, int y1, int count, String axis) {

        // draw a line if count is greater than 0
        if (count > 0) {
            
            // create a vertical line and add it
            if (axis == "yAxis") {
                NscLine newLine = new NscLine(x+count, y, x1+count, y1);
                win.add(newLine);
            } 
            // ELSE create a horizontal line and add it
            else if (axis == "xAxis") {
                NscLine newLine = new NscLine(x, y+count, x1, y1+count);
                win.add(newLine);
            }
            
            // ensure we repaint the window
            win.repaint();

            // recursively call this method, decreasing count each time
            drawLine(x, y, x1, y1, count-1, axis);

        }

    }

    /**
     * The main method starts our program by creating 
     * a new instance of our TicTacToe class.
     * 
     * @param args This is an array of command-line arguments (currently none).
     */
    public static void main(String[] args) {
        
        // creates a new TicTacToe instance
        TicTacToe ticTacToe = new TicTacToe();

    }

}