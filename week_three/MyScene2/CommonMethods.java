import java.awt.Color;

public interface CommonMethods {
    
    /**
     * Calculates proportion for new aspect 
     * ratio to support different tree sizes.
     * 
     * @param part The original part.
     * @param total The original total.
     * @param dimension The new dimension.
     * @return The new proportion.
     */
    default int calcProportion(double part, double total, double dimension) {
        // round to nearest integer before casting to integer for greater accuracy
        return (int)Math.round((part / total) * dimension);
    }

}