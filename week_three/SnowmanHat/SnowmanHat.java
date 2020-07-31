
public class SnowmanHat extends Snowman {
    
    //

    //     /**
    //  * Move the hat component.
    //  * 
    //  * @param deltaX The change in the x-coordinate.
    //  * @param deltaY The change in the y-coordinate.
    //  */
    // public void moveHatBy(int deltaX, int deltaY, TopHat thisHat) {
    //     // determine the new location
    //     int newX = thisHat.getX() + deltaX;
    //     int newY = thisHat.getY() + deltaY;
    //     // move the hat component to the new location
    //     thisHat.setLocation(newX, newY);
    //     // request a repaint
    //     super.win.repaint();
    // }



    public static void main(String[] args) {

        // Snowman frosty = new Snowman();
        // TopHat stovepipe = new TopHat();
        // frosty.addHat(stovepipe);

        // frosty.moveHatBy(30, -5);
//-------------------------------------------------------
        // Snowman frosty = new Snowman(true);
        // TopHat stovepipe = new TopHat();
        // frosty.addHat(stovepipe);
        // frosty.removeHat();
        
        // frosty.moveHatBy(20,20);

        Snowman frosty = new Snowman();
        MyHat hat1 = new MyHat();
        frosty.addHat(hat1);
        // TopHat hat2 = new TopHat(10, 85);
        // frosty.addHat(hat2);
        // frosty.moveHatBy(20, 20);

        // frosty.moveHatBy(20, 20);frosty.moveHatBy(20, 20);frosty.moveHatBy(20, 20);frosty.moveHatBy(20, 20);
    }
}