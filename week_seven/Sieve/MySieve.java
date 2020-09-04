// import code resources
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * The MySieve class provides a method that generates
 * a list of prime numbers.
 * 
 * @author Justin Clark
 * @version PA 7: MySieve (version 0.1)
 * Grading: Standard Level
 */
public class MySieve implements Sieve {

    /**
     * Create a list of all the potential prime numbers (from 2 up to N).
     * @param n The upper bound integer.
     * @return An ArrayList of all the prime numbers from 1 to the upper bound.
     */
    public List<Integer> getPrimes(int n) {
        
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

}