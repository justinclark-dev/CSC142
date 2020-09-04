// import code resources
import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * The WordCount class parses through a list
 * of files and counts all the unique words 
 * and punctuation, and then prints out the
 * a report of statistics collected for each
 * file.
 * 
 * @author Daniel Jinguji
 * @author Justin Clark
 * @version LA 12: Word Count (version 0.2)
 * Grading: Plus Level
 */
public class WordCount {

    // generic Map field to hold file statistics
    Map<String, Integer> myMap;
    
    /**
     * The zero-parameter constructor initializes
     * the Map field.
     */
    public WordCount() {
        myMap = new HashMap<String, Integer>();
    }
    
    /**
     * The tokenCount method reads a file and collects
     * statistics on all the unique occurences of 
     * words and punctuation, then displays these
     * statistics in the console.
     * 
     * @param file The name of the file to process.
     */
    public void tokenCount(String file) {
    
        // try to open the file for reading using Scanner
        try {

            // instantiates the Scanner with the file input
            Scanner scan;
            scan = new java.util.Scanner(new java.io.File(file));

            // hold the total count of tokens
            int tokenCount = 0;

            // process the file, token by token
            while(scan.hasNext()) {

                // get the current item from the Scanner
                String token = scan.next();

                // make all input lowercase to ensure uniqueness
                String strToken = token.toLowerCase();

                // check for duplicate tokens
                if (!myMap.containsKey(strToken)) {

                    // we don't have it yet, so get it
                    myMap.put(strToken, 1);

                } else {
                    // we already have this token

                    // get the old count for this token
                    int oldCount = myMap.get(strToken);

                    // save new count to Map for this token
                    myMap.put(strToken, oldCount+1);
                }
                
                // increment the token count
                tokenCount++;
            }
            
            // close the file
            scan.close();
            
            // output statistics
            System.out.println(file +": "+ tokenCount + " tokens");
            printStats();
            System.out.println();

        } catch(FileNotFoundException e) {
            // an exception (error) was caught
            
            // display user-friendly error message
            System.err.println(file + " cannot be opened");
            
        }

    }

    /**
     * The printStats method
     */
    private void printStats() {

        // set a view of the keys in the Map
        Set<String> keySet = myMap.keySet();

        // create iterator for the Map's key-value pairs
        Iterator<String> iter = keySet.iterator();

        // get all the key-value pairs
        while(iter.hasNext()) {

            // get the key
            String key = iter.next();

            // get the value for the key
            int value = myMap.get(key);

            // Only print out counts greater than two
            if (value > 2) {
                // print the key-value pairs, right align the values (counts)
                System.out.println(String.format("%5d", value) +" : "+ key);
            }
            
        }

    }
    
    /**
     * The application method starts our app by 
     * taking in a variable length of file names 
     * and processes them if they exist.
     * 
     * @param args The name(s) of the file(s) to 
     * process passed in as a command-line argument.
     */
    public static void main(String[] args) {
        
        // initialize the app
        WordCount app = new WordCount();
        
        // check that filename is provided
        if (args.length > 0) {

            // handle multiple command-line arguments
            for (String arg : args) {
                app.tokenCount(arg);
            }

        } else {
            // no file arguments were provided

            // print out an error message
            System.out.println("No filenames given on command line.");

        }

    }
    
}