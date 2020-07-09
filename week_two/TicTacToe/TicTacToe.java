import java.awt.Color;

/**
 * Justin Clark
 * PA 2: Draw Tic-Tac-Toe Boards
 * 
 * This class creates a series of four different configurable
 * Tic-Tac-Toe boards in a Java window.
 */
public class TicTacToe {

    // instance variable to hold the window object.
    private NscWindow win;

    /**
     * This zero-parameter constructor initializes our window and
     * calls the overload method for rotation of one of the boards.
     */
    TicTacToe() {

        // creates the window and sets the title
        win = new NscWindow(10, 10, 300, 330);
        win.setTitle("Tic-Tac-Toe Boards");

        // calls the overloaded method for rotation
        drawTicTacToeBoards(170, 170, 15.0);

    }

    /**
     * This method draws a normal Tic Tac Toe Board at
     * the specified coordinates.
     * 
     * @param x This is the x-coordinate.
     * @param y This is the y-coordinate.
     */
    public void drawTicTacToeBoards(int x, int y) {

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
     */
    public void drawTicTacToeBoards(int x, int y, Color color) {

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
     * @param lineWidth This is the width we make the lines.
     */
    public void drawTicTacToeBoards(int x, int y, int lineWidth) {

        // create the vertical lines (with rectangles) and add them
        NscRectangle verticalLine1 = new NscRectangle(x+30, y, lineWidth, 90);
        NscRectangle verticalLine2 = new NscRectangle(x+60, y, lineWidth, 90);
        win.add(verticalLine1);
        win.add(verticalLine2);

        // create the horizontal lines (with rectangles) and add them
        NscRectangle horizontalLine1 = new NscRectangle(x, y+30, 90, lineWidth);
        NscRectangle horizontalLine2 = new NscRectangle(x, y+60, 90, lineWidth);
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
     */
    public void drawTicTacToeBoards(int x, int y, double rotate) {

        // call helper method to create vertical lines
        drawRotatedLine(30, 0, 30, 90, y, rotate);
        drawRotatedLine(60, 0, 60, 90, y, rotate);

        // call helper method to create horizontal lines
        drawRotatedLine(0, 30, 90, 30, x, rotate);
        drawRotatedLine(0, 60, 90, 60, x, rotate);

    }

    /**
     * This private helper method draws a single rotated line.
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
     * This a private helper method that finds x1 and y1 
     * rotation points for any given x and y points.
     * 
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @param degrees The amount of rotation.
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
        double x1 = r * (Math.cos(theta)*Math.cos(omega) - Math.sin(theta)*Math.sin(omega)) + a;

        // solve for y1 (this will be the rotated y-coordinate)
        double y1;
        y1 = r * (Math.sin(theta)*Math.cos(omega) + Math.cos(theta)*Math.sin(omega)) + b;

        // cast x1 and y1 as integers and return the new points as an array
        return new int[] {(int)x1, (int)y1};

    }

    /**
     * This private helper method draws multiple lines by 
     * recursively calling itself a specified amount of times 
     * in order to give the appearance of thicker lines.
     * 
     * @deprecated This method will be removed in homework version 2.0.
     * 
     * This is my second time writing my own recursive function,
     * so I don't want to lose the code in a random file ;)
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
     * The main method is starts our program by creating a 
     * new instance of our TicTacToe class and calls three 
     * of our four public methods. The fourth method is called 
     * by the constructor when a new instance is created.
     * 
     * @param args This is an array of command-line arguments (need to learn more).
     */
    public static void main(String[] args) {
        
        // creates a new TicTacToe instance
        TicTacToe ticTacToe = new TicTacToe();

        // calls the standard method for drawing a board
        ticTacToe.drawTicTacToeBoards(40, 40);

        // calls the overloaded method for drawing a board with color
        ticTacToe.drawTicTacToeBoards(170, 40, Color.red);

        // calls the overloaded method for drawing a board with line width
        ticTacToe.drawTicTacToeBoards(40, 170, 5);

    }

}