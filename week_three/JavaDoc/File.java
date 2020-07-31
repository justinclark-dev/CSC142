/**
 * The description of the class or method appears here.
 * This description can go on for many lines. Remember that
 * the javadoc tool creates HTML documentation from the
 * contents of the JavaDoc comment. So, in a JavaDoc comment
 * you can use HTML formatting tags. If you want some text to
 * be <b>bold</b>, you can put it within a "bold" tag. Similarly,
 * you can use <i>italics</i> or <u>underline</u> tags to alter
 * the way that the text appears.
 * <p>To create a separate paragraph, it is enough to use the
 * opening paragraph tag. (Technically, you should use a closing
 * tag as well, but virtually all browsers are very forgiving
 * about how text is formatted.)</p>
 * <p>There are a large number of on-line resources that you can
 * use to find out more about formatting text using HTML tags.<p>
 * 
 * @<== the indication that the "tag" section is starting, an at-
 * sign at the "beginning" of the line.
 * 
 * @version 0.1
 * @since 0.1
 * @author Justin Clark
 * @see <a href="https://www.justinclark.dev">https://www.justinclark.dev</a>
 */
public class File {

/**
 * Computes the straight-line distance of the move
 * rounded to the nearest unit.
 *
 * @return the straight-line distance from the point specified
 * by the current object to the point given by the two parameters,
 * <i>deltaX</i> and <i>deltaY</i>. The return is rounded to an <b>int</b>
 * value.
 * @param deltaX offset in the X direction.
 * @param deltaY offset in the Y direction.
 */
public int distance(int deltaX, int deltaY) {
    return 5;
}

    /**
     * The application method. This is what runs the program.
     *
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world, from file.");
    }
}