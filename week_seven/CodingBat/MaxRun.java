public class MaxRun {
    
    /**
     * 
Given a string, return the length of the longest "run" in the string. A run is set of characters arranged in alphabetical order.
     * @param s
     * @return
     */
    public static int maxRun(String s) {
  
        String str = "";
        String longStr = "";

        int longest = 0;
        int count = 0;


        if (s.length()>0) count = 1;

        
        for (int i = 0; i < s.length(); i++) {
            
            if (i > 0 && s.charAt(i) >= s.charAt(i-1)) {
                count++;
            } else {
                if (count > longest) {
                    longest = count;
                }
                count=1;
            }

            
        }
        System.out.println(longest);
        return (longest > 1) ? longest : count;
    }

    public static void main(String[] args) {
        
        System.out.println(maxRun("abcab")); // → 3	3	OK	
        System.out.println(maxRun("xgaeioubzqfl")); // → 5	5	OK	
        System.out.println(maxRun("zyxwv")); // → 1	1	OK	
        System.out.println(maxRun("ababababab")); // → 2	2	OK	
        System.out.println(maxRun("abcxyzklm")); // → 6	6	OK	
        System.out.println(maxRun("b")); // → 1	1	OK	
        System.out.println(maxRun("")); // → 0	0	OK	
        System.out.println(maxRun("aaa")); // → 3	3	OK	
    }
}