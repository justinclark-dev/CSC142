/**
 * This program counts from 1 to 630 by 37s
 * using 3 different types of loops; 
 * a for loop, a while loop, and a do-while loop,
 * and prints the formatted results to the console.
 * 
 * @author Justin Clark
 * @version LA 6: Loops
 * Grading: Check Level
 */
public class Loops {

    /**
     * This method counts using the for loop.
     */
    public void forLoop() {

        // print a heading line this method's loop
        System.out.println("Using a for loop:");

        // plant our initial post (print 1 outside the loop)
        System.out.print(1);
        
        // initialize iterator at 38, stop if we go past 631, increment by 37
        for (int i = 38; i < 631; i += 37) {

            // add wire then the next post (print a comma the current count)
            System.out.print(", " + i);
        } 

        // print our period at the end of the line
        System.out.print(".");

        // finally, print the blank line
        System.out.println("\n");

    }

    /**
     * This method counts using the while loop.
     */
    public void whileLoop() {

        // print a heading line this method's loop
        System.out.println("Using a while loop:");

        // print 1 outside the loop
        System.out.print(1);

        // initialize iterator at 38
        int i = 38;

        // loop while iterator is less than 631
        while(i < 631) {

            // print a comma the current count
            System.out.print(", " + i);

            // increment iterator by 37
            i += 37;
        }

        // print our period at the end of the line
        System.out.print(".");

        // finally, print the blank line
        System.out.println("\n");
    }

    /** 
     * This method counts using the while loop.
     */
    public void doWhileLoop() {

        // print a heading line this method's loop
        System.out.println("Using a do-while loop:");

        // print 1 outside the loop
        System.out.print(1);

        // initialize iterator at 38
        int i = 38;

        // execute the following block, then start loop
        do {

            // print a comma the current count
            System.out.print(", " + i);

            // increment iterator by 37
            i += 37;
        } 
        // loop through the block above while iterator is less than 631 
        while (i < 631); 
        
        // print our period at the end of the line
        System.out.print(".");

        // finally, print the blank line
        System.out.println("\n");

    }

    /**
     * The application method starts our program.
     * 
     * @param args Command-lind arguments.
     */
    public static void main(String[] args) {
        
        // instantiate a new loop object to begin the fun
        Loops loop = new Loops();

        // call our our loop methods
        loop.forLoop();
        loop.whileLoop();
        loop.doWhileLoop();
        
    }
}