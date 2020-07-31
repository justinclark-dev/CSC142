public class Arrays {
    
    private static void bits32() {
        int[] numbers = new int[33];

        System.out.println("initial: " + numbers[2]);

        int i = 0;
        while (i < numbers.length) {
            numbers[i] = (int) (Math.pow(2, i));
            i++;
        }

        numbers[0] = 200;

        i = 0;
        while (i < numbers.length) {
            System.out.println(i + ":     " +  numbers[i]);
            i++;
        }
        System.out.println("---------------------------------");
    }

    private static void bits64() {
        double[] numbers = new double[65];

        System.out.println("initial: " + numbers[2]);

        int i = 0;
        while (i < numbers.length) {
            numbers[i] = (double) (Math.pow(2, i));
            i++;
        }

        numbers[0] = 200;

        i = 0;
        while (i < numbers.length) {
            System.out.println(i + ":     " +  numbers[i]);
            i++;
        }
    }

    public static void main(String[] myArgs) {

        bits32();
        bits64();
    }
}