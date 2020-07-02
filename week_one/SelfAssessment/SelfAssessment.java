// Justin Clark
// SA 1: Basic Programming Competence

// The SelfAssessment class implements an application that
// shows the competence of Justin Clark's programming background
// by meeting the program requriements for this excerise :)
// and simply prints out a value of 132.
public class SelfAssessment {

    // entry point for the application and invokes all other methods
    public static void main(String[] args) {

        // declares an array of integers and allocates memory for 15 integers
        int[] integerArray = new int[15]; 

        // initializes loop at 0; 
        // terminates loop if is reached 15; 
        // increments once each loop
        for (int i = 0; i < 15; i++) {
            // adds 5 to the value of the current array position
            integerArray[i] = i + 5;
        }

        // prints the result of the method call to the helper function
        System.out.println(helper(integerArray));
    }

    // helper method of type int, takes an array of integers and returns an integer
    public static int helper(int[] arrayToTraverse) {
        
        // declares integer variable to store sum, initialized with value of 0
        int sumOfValues = 0;

        // loop through (traverse) array using length to know when to terminate
        for (int i = 0; i < arrayToTraverse.length; i++) {
        
            // declare integer variable to store current value in array
            int currentValue = arrayToTraverse[i];
            
            // determine if current value is odd (divide by 2 check remainder's not 0)
            if (currentValue % 2 != 0) {
                // add current value of array to sum variable
                sumOfValues += currentValue;
            } 
            // if it's not odd, then it's even... now we check if it's a multiple of 3
            // (divide by 3 check remainder is 0)
            else if (currentValue % 3 == 0) {
                // again add the current value of array to sum variable
                sumOfValues += currentValue;
            }

        }

        // return the value of the sum variable to the calling method
        return sumOfValues;
    }
}
