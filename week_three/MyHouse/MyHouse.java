public class MyHouse extends NscComponent {

    // fields
    private NscRectangle theWalls;
    
    public MyHouse(int x, int y) {
        super(x, y, 120, 90);

        // make the pieces
        NscUpTriangle theRoof;
        NscRectangle theDoor;
        theRoof = new NscUpTriangle(0, 0, 120, 40);
        theWalls =  new NscRectangle(10, 40, 100, 50);
        theDoor = new NscRectangle(48, 50, 24, 40);

        theWalls.setFilled(true);

        add(theRoof);
        add(theWalls);
        add(theDoor);
    }

    // public String getTitle() {
    //     return super.getTitle();
    // } 

    // public void setTitle(String value) {
    //     super.setTitle(value);
    // }

    public void setColor(java.awt.Color value) {
        theWalls.setBackground(value);
        repaint();
    }
    
    public java.awt.Color getColor() {
        return theWalls.getBackground();
    }

}

class NewHouse {
    public static void main(String[] args) {
        MyHouse myHouse = new MyHouse(50,50);
        myHouse.setColor(java.awt.Color.blue);

        NscWindow win = new NscWindow();
        win.setTitle("Mi Casa Mufassa!");
        win.add(myHouse);
        win.repaint();
    }
}
