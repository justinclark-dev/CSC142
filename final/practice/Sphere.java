public class Sphere {
    private static int RADIUS;
    private double volume;

    public Sphere(int radius) {
        RADIUS = radius;
        calcVolume();
    }

    private void calcVolume() {
        volume = (3.0/4.0) * Math.PI * (RADIUS * RADIUS * RADIUS);
    }

    public double getVolume() {
        return volume;
    }

    public static void main(String[] args) {

        Sphere sphere = new Sphere(5);

        System.out.println(sphere.getVolume());

    }
    
}
