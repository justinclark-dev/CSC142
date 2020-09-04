import javax.print.attribute.standard.OutputDeviceAssigned;

public class DoubleUs {

    /**
     * Return true if all the u's in the 
     * given string are doubled, that is, 
     * there is another 'u' immediately 
     * to its left or right.
     */
    public static boolean doubleUs(String s) {

      // char lastChar = ' ';
      // if (s.length() > 0) lastChar = s.charAt(0);
      
      // int count = 0;
      // boolean allDoubled = false;
      
      // for (int i = 0; i < s.length(); i++) {
        
      //   if (s.charAt(i)=='u') {
      //     count++;
      //     if (lastChar=='u') {
      //       allDoubled = true;
      //     } else if (i!=s.length()-1 && s.charAt(i+1)=='u') { 
      //       allDoubled = true;
      //     } else {
      //       allDoubled = false;
      //     }
      //     lastChar = 'u';
      //   }
      //   lastChar = s.charAt(i);
      // }
      
      // System.out.println((allDoubled && count > 1) || count == 0);
      // return ((allDoubled && count > 1) || count == 0);
      
      //------------------------------------------------------------------------


      boolean allDoubled = false;
      int len = s.length();
      int countU = 0;
      int countMatches = 0;

      for (int i = 0; i < len; i++) {
        if (s.charAt(i)=='u') countU++;
        if ((i > 0 && s.substring(i-1,i+1).contains("uu")) || 
            (i < len-1 && s.substring(i,i+2).contains("uu"))) 
        {
              // System.out.println(s.substring(i-1,i+1));
              allDoubled = true;
              countMatches++;
        }
      }
      
      // System.out.println(((allDoubled && countU > 1) || countU == 0));

      // System.out.println(countMatches == countU);
      return (countMatches == countU);

    }


    public static void main(String[] args) {

      DoubleUs test = new DoubleUs();

      // test.doubleUs("xxuuxx");      // true
      // test.doubleUs("xxuxx");       // false
      test.doubleUs("wuuw");  // false
      // test.doubleUs("uu");          // true
      // test.doubleUs("u");           // false
      // test.doubleUs("");            // true
      // test.doubleUs("wuuw");        // true
      // test.doubleUs("w");           // false
      // test.doubleUs("uwu");         // true
      // test.doubleUs("aauuuaa");     // true

    }
}