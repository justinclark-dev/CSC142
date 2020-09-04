public class ReverseIt {
    
    /**
     * Given a string, return a copy of the string with the characters reversed.
     * @param s
     * @return
     */
    private static String reverseIt(String s) {

        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
          str += s.charAt(i);
        }
        return str;

    }

    public static void main(String[] args) {
        
        System.out.println(reverseIt("abcd")); // → "dcba"	"dcba"	OK	
        System.out.println(reverseIt("testing")); // → "gnitset"	"gnitset"	OK	
        System.out.println(reverseIt("xyz")); // → "zyx"	"zyx"	OK	
        System.out.println(reverseIt("racecar")); // → "racecar"	"racecar"	OK	
        System.out.println(reverseIt("computer")); // → "retupmoc"	"retupmoc"	OK	
        System.out.println(reverseIt("mug")); // → "gum"	"gum"	OK	
        System.out.println(reverseIt("x")); // → "x"	"x"	OK	
        System.out.println(reverseIt("st")); // → "ts"	"ts"	OK	
        System.out.println(reverseIt("cable")); // → "elbac"	"elbac"	OK	
        System.out.println(reverseIt("door")); // → "rood"	"rood"	OK	
        System.out.println(reverseIt("window")); // → "wodniw"	"wodniw"	OK	
        System.out.println(reverseIt("the end")); // → "dne eht"	"dne eht"	OK	

    }
}