public class HashInTheMiddle {
   
    /**
     * 
Given a string, do three hash marks "###" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "###" must differ by at most one.
     * @param args
     */
    private static boolean hashInTheMiddle(String s) {

        // System.out.println(s);
  
        // int pre = 0;
        // int post = 0;
        // boolean isHash = false;
        // int hashCount = 0;
        
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i)=='#') {
        //         isHash = true;
        //         hashCount++;
        //       } else {
        //         isHash = false;
        //       }
        //       if (!isHash && hashCount == 0) pre++;
              
        //       if (!isHash && hashCount > 0) post++;
        // }

        // System.out.println(pre);
        // System.out.println(post);

        // System.out.println(hashCount);
        
        // System.out.println((Math.abs(pre) - Math.abs(post)));


        // return (Math.abs(pre - post) <= 1);
        //str.contains("Game")

        // int halfString = (int)Math.round(s.length()/2.0);
        // System.out.println(halfString);
        // return (s.substring(halfString-2,halfString+2).contains("###"));

        int halfString = (int)Math.round(s.length()/2);

        if (s.length()>3) {
            System.out.println(s.substring(halfString-1,halfString+2));
        } else {
            System.out.println(s);
        }
        return (s.length()>3 && s.substring(halfString-1,halfString+2).contains("###"));

          
  // int halfString = s.length()/2;
  // return (s.substring(halfString-2,halfString+1).contains("###"));
  //----------------------------------------------------------------------------
  // if (s.length()%2==0) {
  //   int halfString = (int)Math.round(s.length()/2);
  //   return (
  //     s.length()>3 && s.substring(halfString-1,halfString+2).contains("###")||
  //     s.length()>3 && s.substring(halfString-1,halfString+1).contains("###")
  //   );
  // } else {
  //   int halfString = s.length()/2;
  //   return (
  //     s.length()>3 && s.substring(halfString-1,halfString+2).contains("###")||
  //     s.length()>3 && s.substring(halfString-1,halfString+1).contains("###")
  //   );
  // }
  
  //----------------------------------------------------------------------------
  
  //int halfString = (int)Math.round(s.length()/2);

  // if (s.length()>3) {
  //     System.out.println(s.substring(halfString-1,halfString+2));
  // } else {
  //     System.out.println(s);
  // }
 
  //return (s.length()>=3 && s.substring(halfString-2,halfString+2).contains("###"));
  
  //----------------------------------------------------------------------------
  
  // int halfString = s.length()/2;
  // return (s.length()>=3 && s.substring(halfString-1,halfString+2).contains("###"));
  
  //----------------------------------------------------------------------------
  // int halfString = s.length()/2;
  // if (s.length()>=3) {
    
    
  //   if (halfString % 2 == 0) {
  //     return (s.substring(halfString-1,halfString+1).contains("###"));
  //   } else {
      
  //     return (s.substring(halfString-1,halfString+2).contains("###"));
  //   }
    
  
  // } else {
  //   return false;
  // }
  
    }

    public static void main(String[] args) {
      
        System.out.println(hashInTheMiddle("aa###bb")); //  → true	true	OK	
        System.out.println(hashInTheMiddle("aaa###bb")); //  → true	true	OK	
        System.out.println(hashInTheMiddle("a###bbb")); //  → false	true	X	
        System.out.println(hashInTheMiddle("a###bbbb")); //  → false	true	X	
        System.out.println(hashInTheMiddle("aaa###b")); //  → false	false	OK	
        System.out.println(hashInTheMiddle("a#b##c###d##d")); //  → false	true	X	
        System.out.println(hashInTheMiddle("###aa###bbbb")); //  → true	true	OK	
        System.out.println(hashInTheMiddle("##########")); //  → true	true	OK	
        System.out.println(hashInTheMiddle("")); //  → false	true	X	
        System.out.println(hashInTheMiddle("#")); //  → false	true	X	
        System.out.println(hashInTheMiddle("##")); //  → false	true	X	
        System.out.println(hashInTheMiddle("###")); //  → true	true	OK	
        System.out.println(hashInTheMiddle("xyz###abce")); //  → true	true	OK	
        System.out.println(hashInTheMiddle("a###b###c###d")); //  → true	true	OK	
    }

}