public class UseTestComponent {

    public static void main(String[] args) {
        // NscEllipse dot = new NscEllipse();
        // new TestComponent(dot);

        // new TestComponent(new NscEllipse(50, 10, 40, 60));

        // new TestComponent(new TopHat(25, 25));

        TopHat hat = new TopHat(25, 25);
        hat.setSize(150, 150);
        new TestComponent(hat);
    }
}