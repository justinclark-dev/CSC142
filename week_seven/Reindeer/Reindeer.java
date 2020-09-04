import java.util.Iterator;

/**
 * This is the starting point code for Lab: Reindeer.
 */
public class Reindeer {
    
    // The reindeer
    private java.util.Collection<String> reindeer;
    
    /**
     * Constructor, which you will write
     */
    public Reindeer() {
        reindeer = new java.util.ArrayList<String>();
    }
    
    /**
     * Add the names of the reindeer to the collection.
     */
    public void addReindeer() {
        reindeer.add("Dasher");
        reindeer.add("Dancer");
        reindeer.add("Prancer");
        reindeer.add("Vixen");
        reindeer.add("Comet");
        reindeer.add("Cupid");
        reindeer.add("Dunder");
        reindeer.add("Blixem");
    }
    
    /**
     * A simple method to print out the contents of
     * the collection.
     */
    public void print() {
        Iterator<String> collectionIterator = reindeer.iterator();
        while (collectionIterator.hasNext()) {
            System.out.print(collectionIterator.next() + " ");
        }
        System.out.println();
    }
    
    /**
     * The application method, which you will write
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        
        Reindeer app = new Reindeer();

        System.out.println("Using an ArrayList...");
        app.addReindeer();
        app.print();

        System.out.println("Using a LinkedList...");
        app.reindeer = new java.util.LinkedList();
        app.addReindeer();
        app.print();

        System.out.println("Adding again...");
        app.addReindeer();
        app.print();

        System.out.println("Using a hashed data structure...");
        app.reindeer = new java.util.HashSet<String>();
        app.addReindeer();
        app.print();

        System.out.println("Adding again...");
        app.addReindeer();
        app.print();
    }
    
}

/*

1. Give the code for the field declaration after you specified 
   the type parameter for ArrayList.
        private java.util.ArrayList<String> reindeer;

2. Give the code for the instantiation of the field from the 
   constructor. This should be the version with no warning messages.
        reindeer = new ArrayList<String>();

3. Give the source code line from main where you instantiate the 
   LinkedList object.
        app.reindeer = new java.util.LinkedList();

4. Is there any difference in behavior between the ArrayList and 
   the LinkedList?
        No.  There is no difference in the behavior between the 
        ArrayList and the LinkedList.

5. Briefly describe the behavior of the updated application. This 
   response should include a comment on the number of items in the list.
        The application added the reindeer names again, now there are 16 
        reindeer names.

6. Give the source code line from main where you instantiate the HashSet 
   object.
        app.reindeer = new java.util.HashSet<String>();

7. Is there any difference in behavior between the ArrayList and the 
   HashSet?
        No, there is not yet any difference in behavior between the ArrayList 
        and the HashSet.

8. How does the behavior of the List and Set differ? This response should 
   include a comment on the number of items in the list vs. the set.
        The List allows duplicates while the Set does not allow duplicates, 
        therefore the names are not added again and the set remains with 8 
        unique reindeer names.

9. Give the new implementation for the print method. The answer shall 
   include the complete method.
         // A simple method to print out the contents of
         // the collection.
         //
        public void print() {
            Iterator<String> collectionIterator = reindeer.iterator();
            while (collectionIterator.hasNext()) {
                System.out.print(collectionIterator.next() + " ");
            }
            System.out.println();
        }

 */