public class IjOrder {

    /**
     * Return true if all the u's in the 
     * given string are doubled, that is, 
     * there is another 'u' immediately 
     * to its left or right.
     */
    public static boolean ijOrder(String s) {

      boolean hasI = false;
      boolean jFollows = false;
      
      for (int i = 0; i < s.length(); i++) {
    
        if (s.charAt(i)=='i') {
          hasI = true;
        }
        if (s.charAt(i)=='j') {
          jFollows = true;
          hasI = false;
        }
          
      }
    
      return !hasI && jFollows || (!hasI && !jFollows);

    }

    public static void main(String[] args) {

      IjOrder test = new IjOrder();

      System.out.println( test.ijOrder("iij") ); // true
      System.out.println( test.ijOrder("iji") ); // false
      System.out.println( test.ijOrder("ailingjoy") ); // true
      System.out.println( test.ijOrder("icing") ); // false
      System.out.println( test.ijOrder("j") ); // true
      System.out.println( test.ijOrder("i") ); // false
      System.out.println( test.ijOrder("") ); // true
      System.out.println( test.ijOrder("ijijijiji") ); // false
      System.out.println( test.ijOrder("jijijijij") ); // true
      System.out.println( test.ijOrder("true") ); // true
      System.out.println( test.ijOrder("abcdefgijklmnopqrstuvwxyz") ); // true

    }
}