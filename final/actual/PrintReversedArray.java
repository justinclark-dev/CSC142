public class PrintReversedArray {
    
    public void printArray(int[] a) {
    
        System.out.print("(");
        if (a.length > 0) {
            System.out.print(a[0]);
            for (int i = 1; i < a.length; i++) {
                System.out.print("-"+a[i]);
            }
        }
        System.out.print(")");
    }

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
        PrintReversedArray app = new PrintReversedArray();
        int[] a = {1,2,3,4,5};
        System.out.println(java.util.Arrays.toString(app.reverseElements(a)));
      
        app.printArray(app.reverseElements(new int[] {2020,20,8}));
    }

}