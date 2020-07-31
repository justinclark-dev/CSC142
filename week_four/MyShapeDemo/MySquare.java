

public class MySquare extends MyRectangle {

    public MySquare(int side) {
        super(side, side);
    }
    
    // This is BAD:
    public boolean isNegative(int x) {
        if(x < 0) {
            return true;
        } else {
            return false;
        }
    }

    // This is GOOD:
    public boolean ssNegative(int x) {
        return x < 0;
    }

    public static void main(String[] args) {
        MyShape square = new MySquare(25);
        String name = square.getName();
        System.out.println(name);

        double area = square.getArea();
        double p = square.getPerimeter();



    }
}