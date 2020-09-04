// import code resources
import java.util.Iterator;
import java.util.List;

/**
 * The SieveDriver class provides methods for
 * working with lists of prime numbers.
 * 
 * @author Daniel Jinguji
 * @author Justin Clark
 * @version PA 7: SieveDriver (version 0.2)
 * Grading: Standard Level
 */
public class SieveDriver extends SieveDriverBase {
    
    /**
     * The zero-parameter constructor initializes 
     * the inherited field theSieve from the 
     * parent class.
     */
    public SieveDriver() {

        // Instantiate your Sieve implementation and 
        // bind it to theSieve field in SieveDriverBase
        theSieve = new MySieve();
    }

    /**
     * This method overrides getNumber from the
     * parent class and provides implementation
     * for handling errors.
     * 
     * @return The integer received from the console.
     */
    @Override
    public int getNumber() {
        
        // print a section header
        String errMsg = "The upper bound must be a positive integer.";
        
        // initialize the upper bound
        int n = -1;

        // loop until user enters a valid entry
        do {

            // prompt user for input
            System.out.print("Please enter the upper bound (0 to exit): ");

            // ensure we get an integer value
            if (scan.hasNextInt()) {

                // get input stream from user and save as our upper bound
                n = scan.nextInt();

                // handle negative values, display error
                if (n < 0) System.out.println(errMsg);

                // 1 is not prime, so don't allow it
                if (n == 1) {
                    
                    // warn the user
                    System.out.println("1 is not prime, must be 2 or greater.");

                    // reset upper bound
                    n = -1;
                }

            } else {
                // handle non-integer values
                
                // display error
                System.out.println(errMsg);

                // dump the existing token in the scanner
                scan.next();
            }

        } while (n < 0);

        // return the upper bound number
        return n;
    }

    /**
     * This method override drives our application.
     */
    @Override
    public void go() {
        
        // create a list to hold our primes
        List<Integer> primes;

        // the upper bound of our primes
        int n;

        // allow for graceful exit of the program 
        do {
            
            // assign the upper bound value from  getNumber
            n = this.getNumber();

            // here's our exit point (user enters 0)
            if (n == 0) break;

            // call the method to generate list of primes, bind to theSieve
            primes = theSieve.getPrimes(n);

            // call method to print out the list of primes
            printPrimes(n, primes);

        } while (n != 0);
    }

    /**
     * This method override provides a means of 
     * neatly printing all our primes into 
     * right-aligned columns.
     * 
     * @param bound The upper bound integer.
     * @param list The list of all the primes.
     */
    @Override
    public void printPrimes(int bound, List<Integer> list) {
       
        // print output header
        System.out.println("The primes up to "+ bound +" are:");

        // get length of highest output number to create dynamic column widths
        String digits = ((Integer)bound).toString();
        int columnWidth = digits.length()+1;
        
        // keeps track of the current column to print a prime
        int columnIndex = 1;

        // get a count of all the prime to calculate percent of primes
        int countOfPrimes = 0;

        // use Iterator interface to get values from list
        Iterator<Integer> listIterator = list.iterator();

        // loop through list iterator to get each prime
        while (listIterator.hasNext()) {
            
            // create evenly spaced columns to display the primes
            String primeStr = String.format("%"+ columnWidth +"d", listIterator.next());

            // list 12 primes (columns) per line
            System.out.print(primeStr);
            if (columnIndex == 12) {
                System.out.print("\n");
                columnIndex = 0;
            }

            // increment our prime count
            countOfPrimes++;

            // increment the column
            columnIndex++;
        }
 
        // this value shall be rounded to the nearest integer value.
        int countOfNums = 0;
        for (int i = 0; i <= bound; i++) {
            countOfNums = i;
        }

        // calculate and format the percent of primes (round to nearest integer value)
        double percent = Math.round((double)countOfPrimes / (double)countOfNums * 100);
        String formattedPercent = String.format("%.0f", percent); 

        // print out percentage of numbers between 1 and N that are prime
        System.out.println("\n"+ formattedPercent +
                           "% of the numbers between 1 and "+ bound +" are prime.");

        // create a visual break
        System.out.println();
    }
    
    /**
     * The application method simply calls
     * the driver method go().
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        
        // start the program
        new SieveDriver().go();        
    }

}
