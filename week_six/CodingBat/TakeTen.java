public class TakeTen {

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
    public static int[] takeTen(int[] nums) {

      int[] nums2 = new int[nums.length];

      int count10 = 0;
    
      int k = 0;
      
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 10) {
          count10++;
        } else {
          nums2[k] = nums[i];
          k++;
        }
      }
    
      int start = nums.length - count10;
      for (int i = start; i < nums.length; i++) {
        nums2[i] = 0;
      }
    
      return nums2;

    }

    public static void main(String[] args) {

      TakeTen test = new TakeTen();

        int[] a = {2, 10, 10, 3};

        int[] b = new int[test.takeTen(a).length];
        b = test.takeTen(a);
        
        System.out.print("[" + b[0]);
        for (int i = 1; i < a.length; i++) {
          System.err.print("," + b[i]);
        }
        System.out.print("]");

    }
}
