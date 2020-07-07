// import the colors
import java.awt.Color;

/**
 * Justin Clark
 * PA 2: Draw Tic-Tac-Toe Boards
 * 
 * This class creates Tic-Tac-Toe boards in a Java window.
 */
public class TicTacToe {

    // instance variable to hold the window object
    private NscWindow win;

    /**
     * Constructor...
     */
    TicTacToe() {
        // creates the window object
        win = new NscWindow(10, 10, 300, 330);
        win.setTitle("Tic-Tac-Toe Boards");



        /********************************************************************************************************************************************************************************************************************** *
        
        
        Update the constructor to call your overload for rotation for at least one of the tic-tac-toe boards.

        
        *************************************************************************************************************************************************************************************************************************/
    }

    /**
     * This method draws a Tic Tac Toe Board with specified coordinates
     * 
     * @param x This is the x-coordinate.
     * @param y This is the y-coordinate.
     */
    public void drawTicTacToeBoards(int x, int y) {

        // creates vertical line objects
        NscLine verticalLine1 = new NscLine(x+30, y+0, x+30, y+90);
        NscLine verticalLine2 = new NscLine(x+60, y+0, x+60, y+90);

        // creates horizontal line objects
        NscLine horizontalLine1 = new NscLine(x+0, y+30, x+90, y+30);
        NscLine horizontalLine2 = new NscLine(x+0, y+60, x+90, y+60);

        // adds vertical lines to the window
        win.add(verticalLine1);
        win.add(verticalLine2);

        // adds horizontal lines to the window
        win.add(horizontalLine1);
        win.add(horizontalLine2);

        // ensure we repaint the window
        win.repaint();
    }

    /**
     * This method is a method overload of drawTicTacToeBoards().
     * In this version we pass in a color.
     * 
     * @param x This is the x-coordinate..
     * @param y This is the y-coordinate.
     * @param color This is the color we paint the lines.
     */
    public void drawTicTacToeBoards(int x, int y, Color color) {

        // creates vertical line objects
        NscLine verticalLine1 = new NscLine(x+30, y+0, x+30, y+90);
        NscLine verticalLine2 = new NscLine(x+60, y+0, x+60, y+90);

        // creates horizontal line objects
        NscLine horizontalLine1 = new NscLine(x+0, y+30, x+90, y+30);
        NscLine horizontalLine2 = new NscLine(x+0, y+60, x+90, y+60);

        // paint all the lines the passed in color
        verticalLine1.setForeground(color);
        verticalLine2.setForeground(color);
        horizontalLine1.setForeground(color);
        horizontalLine2.setForeground(color);

        // adds vertical lines to the window
        win.add(verticalLine1);
        win.add(verticalLine2);

        // adds horizontal lines to the window
        win.add(horizontalLine1);
        win.add(horizontalLine2);

        // ensure we repaint the window
        win.repaint();
    }

    /**
     * This method is a method overload of drawTicTacToeBoards().
     * In this version we pass in the line width.
     * 
     * @param x This is the x-coordinate.
     * @param y This is the y-coordinate.
     * @param lineWidth This is the width we make the lines.
     */
    public void drawTicTacToeBoards(int x, int y, int lineWidth) {

        // creates vertical line objects
        drawLine(x+30, y+0, x+30, y+90, 5, "yAxis");
        drawLine(x+60, y+0, x+60, y+90, 5, "yAxis");

        // creates horizontal line objects
        drawLine(x+0, y+30, x+90, y+30, 5, "xAxis");
        drawLine(x+0, y+60, x+90, y+60, 5, "xAxis");
    }

    /**
     * This a Private helper method that draws multiple lines by 
     * recursively calling itself.
     * 
     * @param x1 The starting point on the x-axis (from the left).
     * @param y1 The starting point on the y-axis (from the top).
     * @param x2 The end point on the x-axis (to the right).
     * @param y2 The end point on the y-axis (to the bottom).
     * @param count The amount of times to be recursively called.
     * @param axis The axis in which the line will be drawn.
     */
    private void drawLine(int x1, int y1, int x2, int y2, int count, String axis) {

        // we need to draw a line if the count is greater than 0.
        if (count > 0) {
            
            // we need to vertical line on the y-axis
            if (axis == "yAxis") {
                // To draw new line along the y-axis we must 
                // increase the starting point on the x-axis. 
                NscLine newLine = new NscLine(x1+count, y1, x2+count, y2);

                // add the new line to the window
                win.add(newLine);
            } 
            // we need to draw a line on the x-axis
            else if (axis == "xAxis") {
                // To draw new line along the x-axis we must 
                // increase the starting point on the y-axis.
                NscLine newLine = new NscLine(x1, y1+count, x2, y2+count);

                // add the new line to the window
                win.add(newLine);
            }
            
            // ensure we repaint the window
            win.repaint();

            // Recursively call this method with decreasing count (count - 1).
            drawLine(x1, y1, x2, y2, count-1, axis);
        }
    }

    /**
     * This method is a method overload of drawTicTacToeBoards().
     * In this version we pass in a rotation amount.
     * 
     * @param x This is the x-coordinate.
     * @param y This is the y-coordinate.
     * @param rotate This is the rotation amount.
     */
    public void drawTicTacToeBoards(int x, int y, double rotate) {

        // creates vertical line objects
        drawRotatedLine(x+30, y+0, x+30, y+90, rotate);
        drawRotatedLine(x+60, y+0, x+60, y+90, rotate);

        // creates horizontal line objects
        drawRotatedLine(x+0, y+30, x+90, y+30, rotate);
        drawRotatedLine(x+0, y+60, x+90, y+60, rotate);


    }

    private void drawRotatedLine(int x, int y, int x1, int y1, double rotate) {

        // System.out.println(x1andy1[0] + ", " + x1andy1[1]);
        int[] points1 = findRotationPoints(x, y, rotate);
        int[] points2 = findRotationPoints(x1, y1, rotate);

        NscLine rotatedLine = new NscLine(points1[0], points1[1], points2[0], points2[1]);

        // adds vertical lines to the window
        win.add(rotatedLine);

        // ensure we repaint the window
        win.repaint();

    }


    /**
     * This a Private helper method that find x1 and y1 rotation points for any given x and y points.
     * 
     * @param x The x coordinate.
     * @param y The y coordinate.
     * @param radians The amount of rotation.
     */
    private int[] findRotationPoints(int x , int y, double radians) {

        // theta is the degrees (radians to rotate)
        double TH = Math.toRadians(radians);

        // center point is (45, 45) "(a, b)"
        int a = 45;
        int b = 45;
        
        // find the radius
        double rSquared = Math.pow((x-a),2) + Math.pow((y-b),2);

        // get the omega value
        double OM = Math.atan2(y - b, x - a);

        // radius is the square root of rSquared
        double r = Math.sqrt(rSquared);

        // get x1
        double x1;
        x1 = r * (Math.cos(TH)*Math.cos(OM) - Math.sin(TH)*Math.sin(OM)) + a;
        System.out.println("x1="+x1);

        // get y1
        double y1;
        y1 = r * (Math.sin(TH)*Math.cos(OM) + Math.cos(TH)*Math.sin(OM)) + b;
        System.out.println("y1="+y1);

        System.out.println("-----------------------");

        return new int[] {(int)x1, (int)y1};
    }

    /**
     * Application method...
     * @param args
     */
    public static void main(String[] args) {

        TicTacToe ticTacToe = new TicTacToe();


        ticTacToe.drawTicTacToeBoards(40, 40);

        ticTacToe.drawTicTacToeBoards(170, 40, Color.red);

        ticTacToe.drawTicTacToeBoards(40, 170, 5);

        ticTacToe.drawTicTacToeBoards(170, 170, 45.0);

        

    }


}