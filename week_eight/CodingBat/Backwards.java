public class Backwards {
    
    public static String[] backwards(String[] s) {
  
        // java.util.List<String> list = new java.util.ArrayList<String>();
        
        // for (int i = 0; i < s.length; i++) {
        //     list.add(s[i]);
        // }
        
        // java.util.Collections.reverse(list);

        // String[] reversedList = new String[list.size()];

        // int i = 0;
        // for (String thing : list) {
        //     reversedList[i] = thing;
        //     i++;
        // }

        // return reversedList;

        String[] reversedList = new String[s.length];

        j = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            
     
            reversedList[j] = s[i];
            j++;
        }

        return reversedList;
        
      }

      public static void main(String[] args) {
        
        String[] a = {"a", "b", "c"};
        String[] b = {"a", "e", "i", "o", "u"};
        String[] c = {"1", "2", "3", "4"};

        System.out.println(backwards(a)); // → ["c", "b", "a"]
        System.out.println(backwards(b)); // → ["u", "o", "i", "e", "a"]
        System.out.println(backwards(c)); // → ["4", "3", "2", "1"]
      }
}