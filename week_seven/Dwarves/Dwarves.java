// import code resources
import java.util.ArrayList;
import java.util.Iterator;

/**
 * The Dwarves class demonstrates different 
 * ways of working with the items stored in 
 * an ArrayList. 
 * 
 * @author Daniel Jinguji
 * @author Justin Clark
 * @version LA 10: Dwarves (version 0.2)
 * Grading: Plus Level
 */
public class Dwarves {
    
    // The collection to hold the names
    private ArrayList<String> dwarves;
    
    /**
     * Zero parameter constructor to initialize our dwarves list.
     */
    public Dwarves() {
        dwarves = new ArrayList<String>();
    }
    
    /**
     * Add the names of the dwarves to the collection.
     */
    public void addNames() {
        add("Doc");
        add("Grumpy");
        add("Happy");
        add("Sleepy");
        add("Bashful");
        add("Sneezy");
        add("Dopey");
    }
    
    /**
     * Add a single name to the collection.
     * @param name The name to be added.
     */
    public void add(String name) {

        // add name to the list
        dwarves.add(name);

        // visit each index in the dwarves list
        for (int firstIndex = 0; firstIndex < dwarves.size(); firstIndex++) {

            // initialize a second index based off the first
            int secondIndex = firstIndex;

            // the item that we will swap
            String swapItem = dwarves.get(secondIndex);

            // work backwards checking each item to the left
            while (secondIndex > 0 && swapItem.compareTo(dwarves.get(secondIndex-1)) < 0) {

                // the swap item is lower alphabetically so swap it to the left
                dwarves.set(secondIndex, dwarves.get(secondIndex-1));

                // decrease the second index
                secondIndex--;
                
            }

            // we didn't find a lower one so swap item stays
            dwarves.set(secondIndex, swapItem);
        }

    }


    /**
     * A simple method to print out the contents of
     * the collection, using the get method.
     */
    public void print() {
        System.out.println("Print out the list using the get method:");
        for (int i = 0; i < dwarves.size(); i++) {
            String name = dwarves.get(i);
            System.out.print(name + " ");
        }
        System.out.println();
    }
    
    /**
     * A second method to print out the contents of
     * the collection, using an explicit Iterator object.
     */
    public void print2() {
        System.out.println("Print out the list using an Iterator object:");
        Iterator<String> it = dwarves.iterator();
        while (it.hasNext()) {           
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
    
    /**
     * A third method to print out the contents of
     * the collection, using an implicit Iterator,
     * the for-each loop.
     */
    public void print3() {
        System.out.println("Print out the list using for-each (implicit Iterator)");
        for (String name : dwarves) {           
            System.out.print(name + " ");
        }
        System.out.println();
    }
    
    /**
     * The application method.
     * @param args Command-line parameters.
     */
    public static void main(String[] args) {
        // instantiate the Dwarves class
        Dwarves theGuys = new Dwarves();
        theGuys.addNames();
        theGuys.print();
        theGuys.print2();
        theGuys.print3();
    }
    
}

