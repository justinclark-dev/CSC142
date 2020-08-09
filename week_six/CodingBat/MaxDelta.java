public class MaxDelta {

    /**
     * The term "delta" is the absolute difference between two adjacent
     * values in the given array. Given an array of integer values, return
     * the maximum delta value in the array. The array will have at least
     * two elements.
     */
    public static int maxDelta(int[] a) {


            int last = a[0];
            int delta = 0;
            int maxDelta = 0;

            for (int i = 0; i < a.length; i++) {
              delta = Math.abs(a[i] - last);
              if (delta > maxDelta) maxDelta = delta;
              last = a[i];
            }

            return maxDelta;

    }

    public static void main(String[] args) {

        MaxDelta test = new MaxDelta();

        int[] a = {2, 1, 3};                  //2
        int[] b = {-2, -5, 0};                //5
        int[] c = {14, 13, 17, 15, 12, 16};   //4
        int[] d = {5, 23, -3};                //26
        int[] e = {5, 5, 5, 5};               //0
        int[] f = {6, 2, 0, 4, 6};            //4
        int[] g = {23, 43, 1, 2, 6, 32};      //42
        int[] h = {5, 3, 5, 3, 5, 3};         //2

        System.out.println(test.maxDelta(a));
        System.out.println(test.maxDelta(b));
        System.out.println(test.maxDelta(c));
        System.out.println(test.maxDelta(d));
        System.out.println(test.maxDelta(e));
        System.out.println(test.maxDelta(f));
        System.out.println(test.maxDelta(g));
        System.out.println(test.maxDelta(h));

    }
}
