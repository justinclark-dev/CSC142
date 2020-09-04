public class Question1 {

    public int[] nums;

    /*
     * This method will initialize the given array object, 
     * assigning the given value to each element in the array.
     *
     * @param a The array object
     * @param v The value to assign
     */
    public void fillArray(int[] a, int v) {
        
        nums = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            nums[i] = v;
        }
    }

    public static void main(String[] args) {
       
        Question1 q = new Question1();

        
        // q.fillArray(new int[5], 1);
        int[] a = {2,2,2,2,2,2,2,2,2,2};
        q.fillArray(a, 1);
        
        for (int i = 0; i < q.nums.length; i++) {
            System.out.println(q.nums[i]);
        }
    }

    /*
     Notice this method does not specify a return. 
     Briefly explain how the updated array is made 
     available to the caller after the method is 
     called. (Target length: one or two sentences.)
     */
}