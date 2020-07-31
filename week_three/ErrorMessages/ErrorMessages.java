/**
 * This is a simple class that really doesn't do anything.
 * We'll use it to explore the kinds of error messages that
 * the compiler will report when it encounters errors in 
 * Java source code.
 */
public class ErrorMessages {
    
    /*
     * Some shared storage, an instance variable.
     */
    private int shared;
    
    /**
     * a sample method. This method has no parameters
     * and no return value.
     */
    public void sampleMethod() {
        int x = 20;
        System.out.println("This is sampleMethod. x is " + x);
    }
    
    /**
     * a sample method. This method has no parameters
     * and returns a value of type int.
     * @return a value back from the method
     */
    public int sampleMethod2() {
        System.out.println("This is sampleMethod2.");
        return shared;
    }
    
    /**
     * a sample method. This method takes a single parameter
     * of type int and returns a value of type int.
     * @param x a value for the method
     * @return a value back from the method
     */
    public int sampleMethod3(int x) {
        System.out.println("This is sampleMethod3; x is " + x);
        shared = x;
        return x * x;
    }
    
}
