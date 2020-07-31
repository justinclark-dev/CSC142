// import Scanner class
import java.util.Scanner;

/**
 * This class is a program that creates, 
 * displays, and manipulates a shopping 
 * list in the console.
 * 
 * @author Daniel Jinguji
 * @author Justin Clark
 * @version PA5: Shopping List (Version 0.2)
 * Grading: Challenge Level
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
     * Constructor for shopping list program.
     */
    public ShoppingList() {

        // initialize new scanner object
        scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        // initialize storage for list items
        list = new String[MAX_COUNT];
        count = 0;

    }
    
    /**
     * 
     */
    public void printList() {
        System.out.println("Your shopping list:");
        // print the list
        if (count > 0) {
            for(int i = 0; i < count; i++) {
                System.out.println("  "+( i + 1 )+". " + list[i]);
            }
        } else {
            System.out.println("  * No items in list.");
        }
    }
    
    /**
     * 
     * @param item
     */
    public void addToList(String item) {
        // add item to the list
        list[count] = item;
        count++;
    }
    
    /**
     * 
     */
    public void emptyList() {
        // empty the list
        list = new String[10];
        count = 0;
    }
    
    /**
     * 
     * @return
     */
    public String getInput() {
        System.out.print("Enter your item or command: ");
        return scan.next().trim();
    }
    
    /**
     * 
     */
    public void printWelcome() {
        System.out.println("Welcome to the XYZ Shopping List Program.");
    }

    /**
     * 
     */
    public void printThankYou() {
        System.out.println("Thank you for using the XYZ Shopping List Program.");
    }
    
    /**
     * 
     */
    public void printHelp() {
        System.out.println("Here are the list of commands:");
        System.out.println("  -p       : Print the list");
        System.out.println("  -e       : Empty the list");
        System.out.println("  -r n     : Remove the nth item from the list");
        System.out.println("  -r name  : Remove \"name\" from the list");
        System.out.println("  -x       : Exit the application");
        System.out.println("  -h       : Print this command list");
    }


    
    /**
     * Driver method
     */
    public void go() {
        String input;
        
        printWelcome();
        printHelp();
        input = getInput();
        while( ! input.equals("-x")) {
            switch(input) {
                case "-h":
                    printHelp();
                    break;
                case "-p":
                    printList();
                    break;
                case "-x":
                    break;
                case "-e":
                    emptyList();
                    break;
                case "-r":
                    System.out.println("removing "+ input +" from list");
                    System.out.println(input.next());
                    //System.out.println(input.next());
                    //System.out.println(input.nextInt());
                    break;
                default:
                    validateInput(input);
            }
            input = getInput();
        }
        printThankYou();
    }



    /**
     * 
     * @param input
     */
    private void validateInput(String input) {

        // we set valid flag true, and later false if any checks fail
        boolean isValid = true;

        // message to display if any validation fails
        String msg = "";

        // make sure list is not full
        if (count == MAX_COUNT) {
            isValid = false;
            // list is full, print list full message
            msg = "List is full. Item " + input + " not added to list.";
        }

        // check for duplicates
        if (hasDuplicate(input)) {
            isValid = false;
            // duplicate found, print duplicate found message
            msg = "Duplicate item " + input + " not added to list.";
        }

        // check that input is not blank
        if (input.isEmpty()) {
            isValid = false;
            msg = "Shopping list items cannot be blank.";
        }

        // check for invalid commands (must first check not empty)
        if (!input.isEmpty() && input.charAt(0)=='-') {
            isValid = false;
            msg = "Unrecognized command: " + input;
        }

        // check our valid flag
        if (isValid) {
            // the input is valid, add it to the list
            addToList(input);
        } else {
            // the input is not valid, display message to user
            System.out.println(msg);
        }

        // input now validated, return to the driver method
        return;
    }

    /**
     * This method is used for testing our program.
     */
    private void testList() {
        list[0] = "pizza";
        list[1] = "milk";
        list[2] = "bread";
        count = 3;
    }
    
    /**
     * 
     * @param item
     * @return
     */
    private boolean hasDuplicate(String item) {

        for (int i = 0; i < count; i++) {
            if (list[i].equals(item)) {
                return true;
            } 
        }
        return false;
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