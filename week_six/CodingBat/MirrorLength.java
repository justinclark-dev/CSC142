public class MirrorLength {

    /**
     * We'll say that a "mirror" section in an array 
     * is a group of contiguous elements such that 
     * somewhere in the array, the same group appears 
     * in reverse order. For example, the largest mirror 
     * section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 
     * (the {1, 2, 3} part). Return the size of the 
     * largest mirror section found in the given array.
     */
    public static int mirrorLength(int[] a) {
     
      int len = a.length;
      int max = 0;
      

      // front order
      for (int i = 0; i < len; i++) {

        int count = 0;
        // need a separate iterator to look a next index
        int ii = i;

        // reverse order
        for (int j = len - 1; j >= i; j--) {
          
          // we got a match
          if (a[ii] == a[j]) {
            // add match to the count
            count++;
            // look at next index next time around
            ii++;
          } else {

            // no match!

            // reset the count
            count = 0;
            // revert to standard index
            ii = i;
          }
          
          if (count >= max) max = count;
        }
      }

      return max;

    }

    public static void main(String[] args) {

      MirrorLength test = new MirrorLength();

        int[] a = {1, 2, 3, 8, 9, 3, 2, 1};   // 3
        int[] b = {1, 2, 1, 4};               // 3
        int[] c = {7, 1, 2, 9, 7, 2, 1};      // 2
        int[] d = {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};      // 4
        int[] e = {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25};      // 4
        int[] f = {1, 2, 3, 2, 1};      // 5
        int[] g = {1, 2, 3, 3, 8};      // 2
        int[] h = {1, 1, 1};      // 3
        int[] i = {1};      // 1
        int[] j = {};      // 0
        int[] k = {9, 1, 1, 4, 2, 1, 1, 1};      // 3
        int[] l = {5, 9, 9, 4, 5, 4, 9, 9, 2};      // 7
        int[] m = {5, 9, 9, 6, 5, 4, 9, 9, 2};      // 2

        System.out.println(test.mirrorLength(a));
        System.out.println(test.mirrorLength(b));
        System.out.println(test.mirrorLength(c));
        System.out.println(test.mirrorLength(d));
        System.out.println(test.mirrorLength(e));
        System.out.println(test.mirrorLength(f));
        System.out.println(test.mirrorLength(g));
        System.out.println(test.mirrorLength(h));
        System.out.println(test.mirrorLength(i));
        System.out.println(test.mirrorLength(j));
        System.out.println(test.mirrorLength(k));
        System.out.println(test.mirrorLength(l));
        System.out.println(test.mirrorLength(m));

    }
}
