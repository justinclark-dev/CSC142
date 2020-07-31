// import utility classes
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class exhibits a simple example of 
 * how to interact with user input into a 
 * console program in Java using the 
 * java.util.Scanner class.
 * 
 * @author Justin Clark
 * @version LA8 - Scanner
 * Grading: Plus Level
 */
public class ScannerLab {
    
    /**
     * Field to hold reference to the Scanner object.
     */
    private Scanner scan;
    
    /**
     * The ScannerLab() constructor initializes the "scan" field.
     */
    public ScannerLab() {
        // feed keyboard input into the Scanner
        scan = new Scanner(System.in);
    }

    /**
     * This method prompts a user to enter 5 words,
     * then it displays a list of the words.
     */
    public void echoStrings() {

        // declare a String to hold the current token value
        String word;

        // declare an array of Strings
        String[] words;
        
        // create the array to hold 5 String values
        words = new String[5];

        // prompt and check for input 5 times
        for(int i = 0; i < 5; i++) {

            // prompt for the value
            System.out.print("Enter word " + i + ": ");

            // get the input value
            word = scan.next();

            // echo the input value
            System.out.println("You entered " + word);

            // store the input value into the array
            words[i] = word;
        }

        // create and initialize a counter
        String line = words[0];

        // loop through the array and concatenate the values
        // put a space between the words
        for(int i = 1; i < words.length; i++) {
            line += ", " + words[i];
        }

        // display the output
        System.out.println("The words you entered are: " + line + ".");
    }

    /**
     * This method prompts a user to enter 5 numbers,
     * then it displays a list of the numbers along
     * with the minimum and maximum values.
     */
    public void echoIntsAndTotal() {
        
        // declare a String to hold the current token value
        int inputValue;

        // declare an array of integers
        int[] nums;

        // create the array to hold 5 integer values
        nums = new int[5];

        // prompt and check for input 5 times
        for(int i = 0; i < 5; i++) {

            // prompt for the value
            System.out.print("Enter integer value " + i + ": ");

            // check if the next input value is an integer
            if (scan.hasNextInt()) {

                // we got an integer!

                // get the input value
                inputValue = scan.nextInt();

                // echo the value
                System.out.println("You entered " + inputValue);

            } else {

                // we got a bogus value!

                // set a "bogus int value" (hack to avoid exception)
                inputValue = -99;

                // echo the input value
                System.out.println("You entered a non-integer. " + 
                                   "Using -99 instead.");

                // call .next() on the scan object without 
                // saving the value to the inputValue variable
                scan.next();
            }

            // store the input value into the array
            nums[i] = inputValue;
        }

        // create and initialize a counter
        int total = 0;
        
        // loop through the array and sum the values
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        // display the output
        System.out.println("The total of your values is " + total);

        // https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
        // The *Arrays* class contains various methods for manipulating 
        // arrays.
        //
        // The *stream()* method returns a sequential IntStream with the 
        // specified range of the specified array as its source.
        //
        // The *IntStream* interface provides a sequence of primitive 
        // int-valued elements supporting sequential and parallel 
        // aggregate operations.
        //
        // The *.max()* method returns an OptionalInt describing the 
        // maximum element of this stream.
        //
        // The class *OptionalInt* is a container object which may or 
        // may not contain a int value. If a value is present, 
        // isPresent() will return true and *getAsInt()* will return 
        // the value.

        // get and display the min and max values
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        System.out.println("Maximum value entered: " + max);
        System.out.println("Minimum value entered: " + min);

        /*
        // Example for min and max without using Arrays class
        int max = 0;
        int min = 0;
        for(int i = 0; i < nums.length; i++) {
            //total += nums[i];
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        System.out.println("Maximum value entered: " + max);
        System.out.println("Minimum value entered: " + min);
        */
    }
    
    /**
     * The application method runs our program.
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        ScannerLab lab;
        lab = new ScannerLab();
        lab.echoStrings();
        lab.echoIntsAndTotal();
    }
    
}