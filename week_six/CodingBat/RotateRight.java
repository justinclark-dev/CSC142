public class RotateRight {

    /**
     * Given an array of ints and an integer n, return an array
     * with the elements "rotated right" by n elements, so {1, 2, 3}
     * rotated right by 1 yields {3, 1, 2}. The array will have at
     * least n elements within it.
     */
    public static int[] rotateRight(int[] list, int n) {

      int len = list.length;
      
      for (int i = 0; i < n; i++) {
    
        int last = list[len-1];
    
        for (int j = len - 1; j >= 0; j--) {
          
          if (j == 0) {
            list[j]=last;
          } else {
            list[j] = list[j-1];
          }
          
        }
        
      }
    
      return list;
      
    }

    private void testAns(int[] a, String l) {
      if (a.length == 0) {
        System.out.println(l + ": []");
      } else {
        System.out.print(l+": ");
        System.out.print("["+a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(","+a[i]);
        }
        System.out.print("]\n");
      }
    }
    public static void main(String[] args) {

        RotateRight test = new RotateRight();

        int[] a = {1, 2, 3};        // 1
        int[] b = {1, 2, 3, 4, 5};  // 3
        int[] c = {1, 2, 3, 4};     // 2
        int[] d = {1, 2, 3, 4};     // 3
        int[] e = {1, 2, 3, 4, 5};  // 2
        int[] f = {1, 2, 3};        // 0
        int[] g = {2, 4, 6, 8};     // 2
        int[] h = {7, 0, 0};        // 2
        int[] i = {1, 3, 5, 7, 9};  // 0
        int[] j = {1, 3, 5, 7, 9};  // 4
        int[] k = {1, 2, 3};        // 3
        int[] l = {};               // 0
        int[] m = {1, 2};           // 1
        int[] n = {5};              // 0
        int[] o = {5};              // 1

        test.testAns(test.rotateRight(a,1),"a");
        test.testAns(test.rotateRight(b,3),"b");
        test.testAns(test.rotateRight(c,2),"c");
        test.testAns(test.rotateRight(d,3),"d");
        test.testAns(test.rotateRight(e,2),"e");
        test.testAns(test.rotateRight(f,0),"f");
        test.testAns(test.rotateRight(g,2),"g");
        test.testAns(test.rotateRight(h,2),"h");
        test.testAns(test.rotateRight(i,0),"i");
        test.testAns(test.rotateRight(j,4),"j");
        test.testAns(test.rotateRight(k,3),"k");
        test.testAns(test.rotateRight(l,0),"l");
        test.testAns(test.rotateRight(m,1),"m");
        test.testAns(test.rotateRight(n,0),"n");
        test.testAns(test.rotateRight(o,1),"o");
  
    }
}
