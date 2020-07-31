public class MyShape {
    
    protected int height;
    protected int width;
    
    public MyShape(int h, int w) {
        height = h;
        width = w;
    }
    
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    
    public String getName() {
        return "shape";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
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
}