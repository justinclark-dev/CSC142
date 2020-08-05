// import Scanner class
import java.util.Scanner;

/**
 * This class is a program that creates, 
 * displays, and manipulates a shopping 
 * list in the console.
 * 
 * @author Daniel Jinguji
 * @author Justin Clark
 * @version PA 5: Shopping List (Version 0.2)
 * Grading: Standard Level
 */
public class ShoppingList {
    
    /**
     * Field for holding our scanner object.
     */
    private Scanner scan;
    /**
     * Field for holding reference to our shopping list.
     */
    private String[] list;
    /**
     * Field for holding reference to our count of items in list.
     */
    private int count;
    /**
     * Constant field for storing the maximum count allowed.
     */
    private static final int MAX_COUNT = 10;

    /** 
     * Constructor for our shopping list program.
     */
    public ShoppingList() {

        // initialize new scanner object
        scan = new Scanner(System.in);
        
        // initialize storage for list items
        list = new String[MAX_COUNT];

        // initialize count for list items
        count = 0;
    }
    
    /**
     * This method prints the current list of items.
     */
    public void printList() {

        // print header
        System.out.println("Your shopping list:");
        
        // print the list
        if (count > 0) {

            // prints each list item
            for(int i = 0; i < count; i++) {
                System.out.println("  "+ (i+1) +". " + list[i]);
            }

        } else {

            // empty list message
            System.out.println("  * No items in list.");

        }
    }
    
    /**
     * This method adds new items to the list.
     * 
     * @param item The item to add to the list.
     */
    public void addToList(String item) {

        // add item to the list
        list[count] = item;

        // update the count
        count++;
    }
    
    /**
     * This method empties the list of all items.
     */
    public void emptyList() {

        // remove each item
        for (int i = 0; i < count; i++) {
            list[i] = null;
        }

        // reset the count
        count = 0;
    }
    
    /**
     * This method prompts a user to enter an item
     * or a command and returns the input.
     * 
     * @return The input that was scanned as a String.
     */
    public String getInput() {

        // prompt user for input
        System.out.print("Enter your item or command: ");

        // allow multiple word items
        scan.useDelimiter("\n");

        // return the scanned input
        return scan.next().trim();
    }
    
    /**
     * Prints a welcome message to the user for using the program.
     */
    public void printWelcome() {
        System.out.println("Welcome to the XYZ Shopping List Program.");
    }

    /**
     * Prints a thank you message to the user for using the program.
     */
    public void printThankYou() {
        System.out.println("Thank you for using the XYZ Shopping List Program.");
    }
    
    /**
     * Prints a help menu displaying the list of commands.
     */
    public void printHelp() {
        System.out.println("Here are the list of commands:");
        System.out.println("  -p  : Print the list");
        System.out.println("  -e  : Empty the list");
        System.out.println("  -x  : Exit the application");
        System.out.println("  -h  : Print this command list");
    }

    /**
     * This method checks to see if a new item 
     * is a duplicate.  Returns true if the new
     * item is a duplicate, and false if it is not.
     * 
     * @param item The item to check.
     * 
     * @return Returns true or false.
     */
    private boolean isDuplicate(String item) {

        // check new item against all items already in list
        for (int i = 0; i < count; i++) {
            if (list[i].equals(item)) {
                // found a duplicate
                return true;
            } 
        }

        // no duplicates found
        return false;
    }

    /**
     * This method performs a series of checks to see 
     * if the input that was entered is valid.  Returns
     * true if input is valid, returns false if any
     * checks are invalidated.
     * 
     * @param input The input to check.
     * 
     * @return Returns true or false.
     */
    private boolean isValid(String input) {

        // make sure list is not full
        if (count == MAX_COUNT) {
            System.out.println("List is full. Item " + input + " not added to list.");
            return false; 
        }

        // check for duplicates
        if (isDuplicate(input)) {
            System.out.println("Duplicate item " + input + " not added to list.");
            return false;
        }

        // check that input is not blank
        if (input.isEmpty()) {
            System.out.println("Shopping list items cannot be blank.");
            return false;
        }

        // check for invalid commands (must first check not empty)
        if (!input.isEmpty() && input.charAt(0)=='-') {
            System.out.println("Unrecognized command: " + input);
            return false;
        }

        // input is valid
        return true;
    }

    /**
     * This method is used for testing our program.
     */
    private void testList() {
        
        // add 3 test items
        list[0] = "pizza";
        list[1] = "milk";
        list[2] = "bread";

        // set count for the 3 test items
        count = 3;
    }
    
    /**
     * This method is our "driver method", 
     * it manages the application.
     */
    public void go() {

        // create variable to hold our input
        String input;
        
        // print welcome message to the user
        printWelcome();

        // let the user know how to use the program
        printHelp();

        // assign input from the Scanner to the input variable
        input = getInput();

        // run the program until the user quits by entering "-x"
        while( ! input.equals("-x")) {

            // check each input
            switch(input) {
                // print the help menu
                case "-h":
                    printHelp();
                    break;
                // print the current list
                case "-p":
                    printList();
                    break;
                // exit the application
                case "-x":
                    break;
                // empty the list    
                case "-e":
                    emptyList();
                    break;
                // add validated item to the list
                default:
                    if (isValid(input)) addToList(input);
            }
            
            // get the next input
            input = getInput();
        }

        // print thank you message when application quits
        printThankYou();
    }

    /**
     * The main (application) method starts our program.
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        
        // create a new shopping list program
        ShoppingList list;        
        list = new ShoppingList();

        // begin the application
        list.go();
        
    }
    
}