

import java.util.*;

public class NoneGreaterThan {
 
    /**
     * 
     * 
Given an array of integers and a max integer value, return an array of integers with the values greater than or equal to the max removed. The order of the non-target elements in the array should not change.

     * @param values
     * @param max
     * @return
     */
    public static int[] noneGreaterThan(int[] values, int max) {


       // aGrades = values.toArray(new Integer[values.size()])

        List<Integer> list = new ArrayList<Integer>(Arrays.asList((Integer)values)); 
  
        for (int n : list) {
          if (n > max) list.remove(n);
        }
        
        Integer[] arr = new Integer[list.size()]; 
        arr = list.toArray(arr);
        
        return arr;

  
        //-----------------------------------------------------------------

        // int[] nums = new int[values.length];
      
        // for (int i = 0; i < values.length; i++) {            
        //     if (values[i] < max) {
        //       nums[i] = values[i];
        //     } else {
        //         nums[i]=-1;
        //     }
        // }
        
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //   if (nums[i] > 0) {
        //     count++;
        //   }
        // }
        
        // int[] newNums = new int[count];

        // int j = 0;
        // for (int i = 0; i < nums.length; i++) {
        //   if (nums[i] > 0) {
        //       newNums[j] = nums[i];
        //       j++;
        //   }
        // }

        // return newNums;
        //-----------------------------------------------------------------------
  
        // java.util.List<Integer> list = new java.util.ArrayList<Integer>();

        // for (int i = 0; i < values.length; i++) {
        //     list.add(values[i]);
        // }

        // for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
        //     String value = iterator.next();
        //     if (value.length() > 5) {
        //         iterator.remove();
        //     }
        // }
        
        
        // for (java.util.Iterator<Integer> iter = list.iterator() ; iter.hasNextInt();) {
        //     if (iter.nextInt() >= max) list.remove(value);
        // }

        // int[] nums = new int[list.size()];

        // int i = 0;
        // for (int num : nums) {
        //     nums[i] = num;
        //     i++;
        // }

        // return nums;
    }

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 10, 2, 10, 3, 12, 4, 10};
        int[] c = {10, 12, 4, 8, 20, 30};

        noneGreaterThan(a, 3); //[1, 2]
        // noneGreaterThan(b, 5); //[1, 2, 3, 4]
        // noneGreaterThan(c, 10); //[4, 8]
    }
}