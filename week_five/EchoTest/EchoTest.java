// make the class available using the short name
import java.util.Scanner;

/**
 * This is a simple example of the Scanner class
 */
public class EchoTest {
    
    /**
     * The test class instantiates the Scanner and read
     * from it.
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        
        // instantiate the Scanner class
        // it will read from System.in
        Scanner in = new Scanner(System.in); 

        // prompt the user for information
        System.out.print("Enter a word, or type 0 to quit: "); 
        // read the next token (space-delimited)
        String s = in.next( ); 
        // check to see if the user signaled "done"
        while ( ! s.equals("0")) { 
            // echo the input
            System.out.println("You entered: " + s); 
            // prompt for the next input
            System.out.print("Enter another word, or type 0 to quit: "); 
            // read the next token as input
            s = in.next( ); 
        } 
        // print out a closing message
        System.out.println("Good-bye");    
    }
}