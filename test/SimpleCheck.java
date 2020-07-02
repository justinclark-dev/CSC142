public class SimpleCheck {
    public static void main(String[] args) {
        int x = 3;
	int y = 2 * x - 4;

	if (y > 0) {
	    x = x - 1;
	}
	
	System.out.println(x);
    }
}
