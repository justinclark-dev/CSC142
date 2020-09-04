import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveString {
    
    public static String removeString(String start, String target) {
  
        
        // String[] arrayStart = new String[start.length()];
        // for (int i = 0; i < start.length(); i++) {
        //     arrayStart[i] = String.valueOf(start.charAt(i));
        //     System.out.print(arrayStart[i]);
        // }

        // String[] arrayTarget = new String[target.length()];
        // for (int i = 0; i < target.length(); i++) {
        //     arrayTarget[i] = String.valueOf(target.charAt(i));
        //     System.out.print(arrayTarget[i]);
        // }

        // String[] newStrArray = new String[arrayStart.length];
        // for (int i = arrayStart.length- 1; i >= 0 ; i--) {
        //     for (int j = 0; j < arrayTarget.length; j++) {
            
        //         if (arrayStart[i].toLowerCase().equals(arrayStart[j].toLowerCase())) {
                    
        //             System.out.println(newStrArray[i]);
                    
        //             newStrArray[i]="";

                    
        //         } else {
        //             newStrArray[i]=arrayStart[i];
        //         }
        //     }
        // }

        // String newStr = "";
        // for (int i = 0; i < newStrArray.length; i++) {
        //     newStr += newStrArray[i];
        // }

        // System.out.println(newStr);
        // return newStr;
        //-----------------------------------------------------------------------------
        // List<String> arrayStart = new ArrayList<>();
        // for (int i = 0; i < start.length(); i++) {
        //     arrayStart.add(i, String.valueOf(start.charAt(i)));
        // }

        // List<String> arrayTarget = new ArrayList<>();
        // for (int i = 0; i < target.length(); i++) {
        //     arrayTarget.add(i, String.valueOf(target.charAt(i)));
        // }

        // for (Iterator<String> itr = arrayStart.iterator(); itr.hasNext();) {
        //     String ss = itr.next().toLowerCase();
        //     for (String st: arrayTarget) {
        //         st=st.toLowerCase();
        //         if (ss.equals(st)) itr.remove();
        //     }
        // }

        // String newStr = "";
        // for (String s : arrayStart) {
        //     newStr += s;
        // }

        // System.out.println(newStr);
        // return newStr;
        //-----------------------------------------------------------------------------
    
        String newStr = start.replaceAll(target, "");
        String newStr2 = newStr.replaceAll(target.toLowerCase(), "");
        String newStr3 = newStr2.replaceAll(target.toUpperCase(), "");
        
        System.out.println(newStr3);
        return newStr3;
        //-----------------------------------------------------------------------------




    }


    // public String replaceAll(String regex,
    //             String replacement) {

    //                 // Pattern.compile(regex).matcher(str).replaceAll(repl)
    //                 return "overriden";
    //             }

    public static void main(String[] args) {
        
        removeString("This is a FISH", "IS");   //"TH a FH"
        // removeString("Hello there", "lo");     //"He there"

    }

}