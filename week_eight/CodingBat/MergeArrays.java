public class MergeArrays {
    
    public static String[] mergeArrays(String[] a, String[] b) {
                
        // int lenA = a.length;
        // int lenB = b.length;
        
        // String[] newStrArray = new String[lenA + lenB];
        
        // arraycopy​(Object src, int srcPos, Object dest, int destPos, int length)
        //      src - the source array.
        //      srcPos - starting position in the source array.
        //      dest - the destination array.
        //      destPos - starting position in the destination data.
        //      length - the number of array elements to be copied.
        // System.arraycopy(a, 0, newStrArray, 0, lenA);
        // System.arraycopy(b, 0, newStrArray, lenA, lenB);
      
        // java.util.Arrays.sort(newStrArray);
        
        //return newStrArray;

        //----------------------------------------------------------------------------------------

        int lenA = a.length;
        int lenB = b.length;
        
        String[] newStrArray = new String[lenA + lenB];

        int index = 0;
        for (int i = 0; i < lenA; i++) {
            newStrArray[index] = a[i];
            index++;
        }

        for (int i = 0; i < lenB; i++) {
            newStrArray[index] = b[i];
            index++;
        }

        for (int firstIndex = 0; firstIndex < newStrArray.length; firstIndex++) {
            int secondIndex = firstIndex;
            String swapItem = newStrArray[secondIndex];
            while (secondIndex > 0 && swapItem.compareTo(newStrArray[secondIndex-1]) < 0) {
                newStrArray[secondIndex] = newStrArray[secondIndex-1];
                secondIndex--;
            }
            newStrArray[secondIndex] = swapItem;
        }

        return newStrArray;

    }

    public static void main(String[] args) {
        
        String[] a = {"x", "y", "z"}; 
        String[] b = {"a", "b", "z"}; 

        System.out.println(java.util.Arrays.toString(mergeArrays(a,b)));

        // mergeArrays(["a", "c", "z"], ["b", "f", "x"]) → ["a", "b", "c", "f", "x", "z"]
        // mergeArrays(["a", "c", "n"], ["c", "f", "x"]) → ["a", "c", "c", "f", "n", "x"]
        // mergeArrays(["f", "g", "z"], ["c", "f", "g"]) → ["c", "f", "f", "g", "g", "z"]
        // mergeArrays(["a", "b", "c"], ["q"]) → ["a", "b", "c", "q"]
        // mergeArrays(["b", "c", "z"], ["a", "c", "z"]) → ["a", "b", "c", "c", "z", "z"]	
        // mergeArrays(["a", "b", "c", "z"], ["a", "c", "n"]) → ["a", "a", "b", "c", "c", "n", "z"]
        // mergeArrays(["c", "n"], ["a", "b", "m"]) → ["a", "b", "c", "m", "n"]
        // mergeArrays(["a", "b", "c"], ["d", "e", "f"]) → ["a", "b", "c", "d", "e", "f"]
        // mergeArrays(["d", "e", "f"], ["a", "b", "c"]) → ["a", "b", "c", "d", "e", "f"]
        // mergeArrays(["x"], ["a", "b", "c"]) → ["a", "b", "c", "x"]	["x"]
        // mergeArrays(["c", "z"], ["a", "y", "z"]) → ["a", "c", "y", "z", "z"]
        // ** mergeArrays(["x", "y", "z"], ["a", "b", "z"]) → ["a", "b", "x", "y", "z", "z"]
    }
}