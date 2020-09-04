public class Pixel {

    public Pixel(int r, int g, int b) {

    }

    public double getGrayScaleValue() {
        return 255.0 * 0.5;
    }
    public static void main(String[] args) {

        Pixel pixel = new Pixel(0, 0, 0);
        double grayValue;
        grayValue = pixel.getGrayScaleValue();

        System.out.println(grayValue);

        // extra credit
        int r;
        r = (int)Math.round(255.0 * 0.60);
        int g;
        g = (int)Math.round(255.0 * 0.20);
        int b;
        b = (int)Math.round(255.0 * 0.80);
        Pixel pixel2 = new Pixel(r, g, b);

   
    }
}