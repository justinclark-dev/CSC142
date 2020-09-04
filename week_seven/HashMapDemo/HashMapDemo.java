import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * A short demo of HashMap and Iterator.
 * This sample makes use of Java 1.5.0 generics.
 * 
 * @author Dan
 * @version 0.3
 */
public class HashMapDemo
{
    /**
     * The data type of accounts is HashMap<String, java.awt.Color>
     * This means that KEYS used in this HashMap must be type String
     * and VALUES must be type Color.
     */
    private HashMap<String, java.awt.Color> hues;
    
    public HashMapDemo()
    {
        hues = new HashMap<String, java.awt.Color>();
    }
    
    /**
     * Construct a new Color and add it to the map.  The name
     * is used to create the key for the HashMap entry, and the 
     * new Color itself is the value.
     * @param name the color name
     * @param red the amount of red-ness in the color
     * @param green the amount of green-ness in the color
     * @param blue the amount of blue-ness in the color
     */
    public void addColor(String name, int red, int green, int blue)
    {
        java.awt.Color newColor = new java.awt.Color(red, green, blue);
        hues.put(name, newColor);
    }
    
    /**
     * Show in the terminal window a description of the Color
     * associated with the name provided, or an error message
     * if there is no Color for that name.
     * @param name The color name
     */
    public void showColor(String name)
    {
        java.awt.Color rgb = hues.get(name);
        if(rgb == null)
            System.out.println("Sorry, the color " + name + " cannot be found.");
        else 
            System.out.println("The color " + name + " is " + rgb);
    }
    
    /**
     * Show in the terminal window a listing of all the colors in the
     * collection by using an Iterator to iterate through the HashMap's
     * key set.
     */
    public void showAllColors()
    {
        // Notice that both the Set and the Iterator are declared
        // with type String as the type argument.  The keys used
        // in the HashMap are String objects, so that's what will
        // provided in the key set, and therefore by the Iterator.
        Set<String> keySet = hues.keySet();
        Iterator<String> iter = keySet.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            java.awt.Color rgb = hues.get(name);
            System.out.println("The color " + name + " is " + rgb);
        }
    }
    
    /**
     * A short method to test this class.
     */
    public void test()
    {
        System.out.println("Running a test...");
        hues.clear();
        addColor("Black", 0, 0, 0);
        addColor("White", 255, 255, 255);
        addColor("Red", 255, 0, 0);
        addColor("Green", 0, 255, 0);
        addColor("Blue", 0, 0, 255);
        addColor("Navy", 0, 0, 128);
        
        showColor("Blue");
        showColor("Orange");
        
        System.out.println();
        System.out.println("Show all the colors in the map...");
        showAllColors();
        
        System.out.println();
        System.out.println("Now add a few more colors and show all...");
        addColor("Yellow", 255, 255, 0);
        addColor("Cyan", 0, 255, 255);
        addColor("Magenta", 255, 0, 255);
        showAllColors();
        
        System.out.println();
        System.out.println("Now update the value of green and show all again...");
        addColor("Green", 0, 128, 0);
        showAllColors();
    }
    
    /**
     * Allows the test to be run from a command prompt.
     */
    public static void main(String[] args) {
        HashMapDemo d = new HashMapDemo();
        d.test();
    }
}
