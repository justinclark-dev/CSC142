// import code resources
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The MySieve class provides a method that generates
 * a list of prime numbers.
 * 
 * @author Justin Clark
 * @version PA 7: SieveMeasure (version 0.1)
 * Grading: Challenge Level
 */
public class SieveMeasure {

    /**
     * Implementation of java.util.List using ArrayList that 
     * uses the get() and remove() methods of java.util.List.
     * Create a list of all the potential prime numbers (from 2 up to N).
     * @param n The upper bound integer.
     * @return An ArrayList of all the prime numbers from 1 to the upper bound.
     */
    public static List<Integer> getPrimesArrayListUtilList(int n) {
        
        // We're including all the numbers between 2 and N because 
        // anyone of them might be a prime.
        // We're excluding one (1) because it's not a prime.
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            numberList.add(i-2, i);
        }

        // Create a list of the prime numbers that we have found.
        // This list starts out empty.
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        // Loop as long as currentPrime is less than some limit M. 
        // Limit M is the square root of N (the upper bound).
        // Take the lowest (first) number in numberList. This is a 
        // prime number. Let's call it currentPrime.
        int currentPrime;
        do {
            
            // Get the currentPrime and add to primeList.
            currentPrime = numberList.get(0);
            primeList.add(currentPrime);

            // Remove all the numbers in numberList that 
            // are evenly divisible by currentPrime.
            for (int i = 0; i < numberList.size(); i++) {            
                int primeCandidate = numberList.get(i);
                if (primeCandidate % currentPrime == 0) {
                    numberList.remove(i);
                }
            }
        } while (currentPrime <= Math.sqrt(n));

        // All the rest of the values in numberList   
        // are also prime. Move them to primeList.
        primeList.addAll(numberList);

        // Return the List of primes
        return primeList;
    }

    /**
     * Implementation of java.util.List using ArrayList that 
     * uses the next() and remove() methods of java.util.Iterator.
     * Create a list of all the potential prime numbers (from 2 up to N).
     * @param n The upper bound integer.
     * @return An ArrayList of all the prime numbers from 1 to the upper bound.
     */
    public static List<Integer> getPrimesArrayListUtilIterator(int n) {
        
        // We're including all the numbers between 2 and N because 
        // anyone of them might be a prime.
        // We're excluding one (1) because it's not a prime.
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            numberList.add(i-2, i);
        }

        // Create a list of the prime numbers that we have found.
        // This list starts out empty.
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        // Loop as long as currentPrime is less than some limit M. 
        // Limit M is the square root of N (the upper bound).
        // Take the lowest (first) number in numberList. This is a 
        // prime number. Let's call it currentPrime.
        //////////int currentPrime = 2;

        // use Iterator interface to get values from list
        Iterator<Integer> listIterator = numberList.iterator();

        // // loop through list iterator to get each prime
        // do {
        //     // Get the currentPrime and add to primeList.
        //     currentPrime = listIterator.next();
        //     primeList.add(currentPrime);

            
        //     // Remove all the numbers in numberList that 
        //     // are evenly divisible by currentPrime.
        //     while (listIterator.hasNext()) {            
        //         int primeCandidate = listIterator.next();
        //         if (primeCandidate % currentPrime == 0) {
        //             listIterator.remove();         
        //         }
        //     }
        // } while (listIterator.hasNext() && currentPrime <= Math.sqrt(n));

        // while (listIterator.hasNext()) {

        //     // Get the currentPrime and add to primeList.
        //     currentPrime = listIterator.next();
        //     primeList.add(currentPrime);

        //     do {

        //     } ( currentPrime <= Math.sqrt(n));
            
        // }


// Loop:
// Take the lowest (first) number in numberList. This is a prime number. Let's call it currentPrime.
// Add currentPrime to primeList.
// Remove all the numbers in numberList that are evenly divisible by currentPrime.
// Go back to Loop as long as currentPrime is less than some limit M.
// All the rest of the values in numberList are also prime. Move them to primeList.
int currentPrime;
do {

    currentPrime = listIterator.next();
    primeList.add(currentPrime);

    System.out.println(currentPrime);

    if (currentPrime % 2 == 0) listIterator.remove();

} while (listIterator.hasNext() && currentPrime <= Math.sqrt(n));



        // All the rest of the values in numberList   
        // are also prime. Move them to primeList.
        primeList.addAll(numberList);

        // Return the List of primes
        return primeList;
    }

    public static void main(String[] args) {
        
        long start = System.nanoTime();
        List answer = getPrimesArrayListUtilIterator(10000);
        long end = System.nanoTime();
        long elapsed = (end - start) / 1000000;
        // check accuracy
        if(answer.size() == 1229) {
            //print out elapsed time
            System.out.println(elapsed);
        } else {
            //report error in algorithm
            System.out.println("not sure...");
        }

        // getPrimesArrayListUtilList(100);
        //getPrimesArrayListUtilIterator(100);
    }
}