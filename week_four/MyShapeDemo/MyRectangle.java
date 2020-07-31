

public class MyRectangle extends MyShape {

    public MyRectangle(int w, int h) {
        super(w, h);
    }

    public String getName() {
        return "rectangle";
    } 

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2*width + 2*height;
    }

    
    public boolean ssNegative(int x) {
        return x < 0;
    }

    public boolean isNegative(int x) {
        if(x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        MyShape rec = new MyRectangle(50, 200);
        String name = rec.getName();
        System.out.println(name);

        double area = rec.getArea();
        double perimeter = rec.getPerimeter();

        System.out.println("area: " + area + ", perimeter: " + perimeter);
    }
}