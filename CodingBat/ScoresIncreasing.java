public class ScoresIncreasing {

    public static boolean scoresIncreasing(int[] scores) {
  
        int last = scores[0];
        
        boolean increasing = false;
        
        for (int i = 0; i < scores.length; i++) {
          
          if (scores[i] < last) {
            return false;
          } else {
            increasing = true;
          }
          last = scores[i];
        }
        
        System.out.println(increasing);
        return increasing;
        
      }

      public static void main(String[] args) {

        int[] a = {1, 3, 4};
        int[] b = {1, 3, 2};
        int[] c = {1, 1, 4};
        int[] d = {1, 1, 2, 4, 4, 7};
        int[] e = {1, 1, 2, 4, 3, 7};
        int[] f = {-5, 4, 11};
        scoresIncreasing(a);// → true	true	OK	
        scoresIncreasing(b);// → false	true	X	
        scoresIncreasing(c);// → true	true	OK	
        scoresIncreasing(d);// → true	true	OK	
        scoresIncreasing(e);// → false	true	X	
        scoresIncreasing(f);// → true	true	OK

      }
}