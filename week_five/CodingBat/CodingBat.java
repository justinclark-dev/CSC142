public class CodingBat {
    
  public static boolean threeThrees(int[] nums) {
  
    int count = 0;
    int lastValue = 0;
    
    for (int i = 0; i < nums.length; i++) {
      
      if (nums[i] == 3 && lastValue != 3) {
        count++;
      }
  
      lastValue = nums[i];
    }
    
    return (count == 3);
  
  }



    public static void main(String[] args) {
        // CodingBat test = new CodingBat();

        // int[] nums = {0, -9, -12, 6, 10, -15, 7};
        // System.out.println(test.threeThrees(nums));

        int[] nums1 = {3, 1, 3, 1, 3};// → true
        int[] nums2 = {3, 1, 3, 3};// → false
        int[] nums3 = {3, 4, 3, 3, 4};// → false

        System.out.println(threeThrees(nums1));
        System.out.println(threeThrees(nums2));
        System.out.println(threeThrees(nums3));
    }
}