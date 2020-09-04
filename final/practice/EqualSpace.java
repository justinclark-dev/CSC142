public class EqualSpace {
    
    /**
     * This method takes three parameters: 
     * an int (n) and two doubles (lo, hi). 
     * The method returns an array of n double 
     * values where the values between the 
     * endpoints (lo and hi), are evenly space.
     * 
     * @param n The length of the array returned.
     * @param lo The lowest endpoint.
     * @param hi The highest endpoint.
     * @return Array of n double values.
     */
    public static double[] equalSpace(int n, double lo, double hi) {

        double spacer = (hi - lo) / (n - 1);

        double[] nums = new double[n];
        
        nums[0] = lo;
        for (int i = 1; i < n; i++) {
            nums[i] = lo+=spacer;
        }

        return nums;
    }

    public static void printArray(double[] nums) {

        System.out.print("{"+ nums[0]);

        for (int i = 1; i < nums.length; i++) {
            System.out.print(" : "+nums[i]);
        }

        System.out.print("}");
    }

    public static void main(String[] args) {
        
        EqualSpace app = new EqualSpace();

        int n = 3;
        double lo = 5.0;
        double hi = 1.0;

       // assuming both methods are static
       printArray(equalSpace(3, 5.0, 1.0));
    }
}