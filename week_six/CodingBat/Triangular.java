public class Triangular {

    /**
     * Given n>=0, create an array with the pattern 
     * {1,     1, 2,     1, 2, 3,     ... 1, 2, 3 .. n} 
     * (spaces added to show the grouping). Note that 
     * the length of the array will be 1 + 2 + 3 ... + n, 
     * which is known to sum to exactly n*(n + 1)/2.
     */
    public static int[] triangular(int n) {

      int[] nums = new int[n*(n + 1)/2];
      
      int incrementer = 1;
      int count = 0;
      for (int i = 0; i < n; i++) {
        for (int k = 1; k < incrementer+1; k++) {
          nums[count] = k;
          count++;
        }
        incrementer++;       
      }
    
      return nums;

    }

    public static void main(String[] args) {

      Triangular test = new Triangular();

        int a = 4;

        int[] b = test.triangular(a);
        
        System.out.print("[" + b[0]);
        for (int i = 1; i < b.length; i++) {
          System.err.print("," + b[i]);
        }
        System.out.print("]");

    }
}
