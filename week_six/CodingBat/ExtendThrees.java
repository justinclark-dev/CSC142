public class ExtendThrees {

    /**
     * Given an array of integers, return an array 
     * of the same length with all of the 10s removed. 
     * The non-10 values shall be shifted to the left 
     * as needed, and the empty spaces at the end of 
     * the array shall be filled with zero. So, 
     * {1, 10, 2, 10} yields {1, 2, 0, 0}. You may 
     * modify and return the parameter array or you 
     * may return a new array.
     */
    public static int[] extendThrees(int[] a) {

      int[] b = new int[a.length];

      int lastMult = 0;
      boolean start = false;   
      for (int i = 0; i < a.length; i++) {
        if (a[i]%3==0) {
          start = true;
          lastMult = a[i];
          b[i]=lastMult;
        } else {
          if (start == false) {
            b[i]=a[i];
          } else {
            b[i]=lastMult;
          }
        }
      }
    
      return b;

    }

    public static void main(String[] args) {

      ExtendThrees test = new ExtendThrees();

        int[] a = {10, 3, 2, 4, 21, 5};

        int[] b = new int[test.extendThrees(a).length];
        b = test.extendThrees(a);
        
        System.out.print("[" + b[0]);
        for (int i = 1; i < a.length; i++) {
          System.err.print("," + b[i]);
        }
        System.out.print("]");

    }
}
