public class CountThrees {
    
    public static int countThrees(int n) {
  
        String nString = ((Integer)n).toString();
        int count = 0;
        
        for (int i = 0; i < nString.length(); i++) {
          if (nString.charAt(i)==('3')) count++;
        
        }
        
        System.out.println(count);
        return count;
        
      }
      
      public static void main(String[] args) {
          
        countThrees(123);// → 1
        countThrees(246);// → 0
        countThrees(31323);// → 3
      }

}