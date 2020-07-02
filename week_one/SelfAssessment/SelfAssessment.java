// Justin Clark
// Self-Assessment Exercise: Programming Background Competence


public class SelfAssessment {
    /*
     * Write a simple program in the computer programming language of your choice. 
     * The program shall have two functions (methods): a main function and a helper function. 
     * The main function shall do the following:
     *
     *     declare an array that can hold 15 integer values
     *     use a loop to put the integer values 5,6,7, ... 18, 19 into the array
     *     pass the array to the helper function which will return an integer value
     *     print out the value returned by the helper function
     *
     * The helper function shall do the following: 
     *
     *     traverse the array values found in the array, totaling the values that are odd or a multiple of 3.
     *     return the sum of those values.
     *
     * The end result is that the program prints out the value 132. */

    public static void main(String[] args) {

        int[] integerArray = new int[15];

        for (int i = 0; i < 15; i++) {
            integerArray[i] = i + 5;
        }

        System.out.println(helper(integerArray));
    }

    public static int helper(int[] arrayToTraverse) {
        
        int sumOfOdd = 0;
        int sumOfMultipleOf3 = 0;

        for (int i = 0; i < arrayToTraverse.length; i++) {
        
            int currentValue = arrayToTraverse[i];
            
            // determine if current value is odd
            if (currentValue % 2 != 0) {
                sumOfOdd += currentValue;
            }

            // determine if current value is a multiple of 3 *AND* even
            if (currentValue % 3 == 0 && currentValue % 2 == 0) {
                sumOfMultipleOf3 += currentValue;
            }
        }

        return sumOfOdd + sumOfMultipleOf3;
    }
}
