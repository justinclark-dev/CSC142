import java.util.Arrays;

public class ReverseElements {

    // public reverseElements(int[] a) {

    //     int[] nums = new int[a.length];

    //     System.out.print("{"+a[a.length-1]);
    //     for (int i = a.length - 2; i >= 0; i--) {
    //         System.out.print(","+a[i]);
    //     }
    //     System.out.print("}");
    // }

    public int[] reverseElements(int[] a) {

        int[] nums = new int[a.length];

        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            nums[j] = a[i];
            j++;
        }
        
        return nums;
    }

    public static void main(String[] args) {
        ReverseElements app = new ReverseElements();
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(app.reverseElements(a)));
    }

}