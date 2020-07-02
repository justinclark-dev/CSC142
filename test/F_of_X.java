public class F_of_X {
    public static void main(String[] args) {
        System.out.println(f(f(2)));
    }

    public static int f(int x) {
        return 3 * x - 1;
    }
}
