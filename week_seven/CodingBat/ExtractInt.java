public class ExtractInt {
    
    /**
     * 
Given a string, return the integer value constructed from the digits, 0 - 9, that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. Note: java.lang.Character.isDigit(char) tests a char value to see if it is a digit. Alternately, the char value can be checked for the range '0' .. '9'. java.lang.Integer.parseInt(str) extracts the integer value from the String representation of an integer.
     * @param str
     * @return
     */
    private static int extractInt(String str) {

        String num = "";
        for (int i = 0; i < str.length(); i++) {
          if (java.lang.Character.isDigit(str.charAt(i))) num += str.charAt(i);
        }
        return (num.equals("")) ? 0 : java.lang.Integer.parseInt(num);

    }

    public static void main(String[] args) {
        
        System.out.println(extractInt("aa1bc2d3")); // → 123	123	OK	
        System.out.println(extractInt("aa11b33")); // → 1133	1133	OK	
        System.out.println(extractInt("Chocolate")); // → 0	0	OK	
        System.out.println(extractInt("5hoco1a1e")); // → 511	511	OK	
        System.out.println(extractInt("123abc123")); // → 123123	123123	OK	
        System.out.println(extractInt("")); // → 0	0	OK	
        System.out.println(extractInt("Hello")); // → 0	0	OK	
        System.out.println(extractInt("123")); // → 123	123	OK	
        System.out.println(extractInt("X1z9b2")); // → 192	192	OK	
    }
}