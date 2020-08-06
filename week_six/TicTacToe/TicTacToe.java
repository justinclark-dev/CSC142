// import code resources
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

/**
 * This class is creates a complete, 
 * interactive game of Tic-Tac-Toe.
 * 
 * @author Justin Clark
 * @version PA6: Tic-Tac-Toe, The Game (version 0.1)
 * Grading: Challenge Level
 */
public class TicTacToe extends NscWindow implements ActionListener {
    
    /**
     * This field holds an array of buttons (the Tic-Tac-Toe boxes).
     */
    private JButton[] buttons;
    /**
     * This field holds reference to the reset button.
     */
    private JButton resetBtn;
    /**
     * This field holds reference to the game's message label.
     */
    private JLabel label;
    /**
     * This field holds reference to the current player ("X" or "O").
     */
    private String player;

    /**
     * This zero parameter constructor initializes 
     * all of the fields for this program.
     */
    public TicTacToe() {

        // create the window using the base class constructor
        super(10, 10, 235, 280);

        // set the window title
        setTitle("Tic-Tac-Toe");

        // create "lines effect" with a single rectangle in the background
        NscRectangle bg = new NscRectangle(30, 30, 160, 160);
        bg.setBackground(Color.black);
        bg.setFilled(true);
        add(bg);

        // instantiate a new font object to format our squares
        Font font = new Font("Arial", Font.BOLD, 20);

        // create the array to hold all the button squares
        buttons = new JButton[9];

        // starting x and y points for our squares
        int x = 30;
        int y = 30;

        // square size + line size (50 + 5)
        int spacer = 55;

        // rox index allows us to cycle through the 3 rows,  we start at 1
        int rowIndex = 1;

        // create all button squares adding them to the "buttons" array
        for (int i = 0; i < buttons.length; i++) {

            // create an individual button square
            JButton btn;
            btn = new JButton();
            btn.setSize(50, 50);
            btn.setLocation(x, y);
            btn.setFont(font);
            btn.addActionListener(this);
            btn.setName(Integer.toString(i));
            add(btn);

            // add the current button to the array
            buttons[i] = btn;
            
            // algorithm to position the next button square
            // --------------------------------------------
            // next square needs to move down by the spacer amount
            y += spacer;
            // if current row is the 3rd row
            if (rowIndex == 3) { 
                // set row index to 0
                rowIndex = 0; 
                // move x coordinate to the right by spacer amount
                x += spacer;
                // move the y coordinate back to the top position
                y -= spacer * 3;
            }
            // increase to the next row index
            rowIndex++;
        }

        // start with X's playing first
        player = "X";

        // create the game's message label
        label = new JLabel(player + "'s turn"); 
        label.setSize(160, 20);
        label.setLocation(30, 200);
        label.setAlignmentX(50);
        label.setHorizontalAlignment(SwingConstants.CENTER);       
        add(label);

        // create the game's reset button
        resetBtn = new JButton();
        resetBtn.setSize(68, 22);
        resetBtn.setLocation(75, 218);
        resetBtn.setText("Reset");
        resetBtn.setName("resetBtn");
        resetBtn.addActionListener(this);
        resetBtn.setVisible(false);
        add(resetBtn);

        // re-render for good measure
        repaint();
    }

    /**
     * The method override from ActionListener.
     * 
     * @param e The event that triggered this handler.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        // create a reference to the current button that triggered an event
        JButton btn;
        btn = (JButton) e.getSource(); 

        // check for game reset
        if (btn.getName().equals("resetBtn")) {

            // call the method to reset the game
            resetGame();

        } else {

            // call the method that plays the game, passing the button reference
            playGame(btn);
        }
    }

    /**
     * This method takes 3 parameters that represent
     * their ordinal position in the "buttons" array, 
     * then checks for a winning play by looking at
     * the text value of the buttons.
     * 
     * @param a The first array index.
     * @param b The second array index.
     * @param c The third array index.
     * 
     * @return Returns true for a winning move.
     */
    private boolean winningPlay(int a, int b, int c) {

        // check for 3 in a row (a winning play)
        if (buttons[a].getText().equals(player) && 
            buttons[b].getText().equals(player) && 
            buttons[c].getText().equals(player)) 
        {
            // this player has won!

            // easier to disable all buttons than figuring out the other 6
            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setEnabled(false);
            }

            // re-enable the winning buttons then remove their click handlers
            buttons[a].setEnabled(true);
            buttons[b].setEnabled(true);
            buttons[c].setEnabled(true);
            buttons[a].removeActionListener(this);
            buttons[b].removeActionListener(this);
            buttons[c].removeActionListener(this);

            // indicate this is the winning play
            return true;
        } 

        // not a winner this time
        return false;
    }

    /**
     * This method checks for all possible winning plays.
     * 
     * @return Returns true if the game is won.
     */
    private boolean gameIsWon() {

        // This shows the position of array indexes 
        // in their relative positions on the board:
        //
        //   0  |  3  |  6
        // -----------------
        //   1  |  4  |  7
        // -----------------
        //   2  |  5  |  8

        // check for any winning combination (passing in the array indexes)
        return (
            winningPlay(0, 3, 6) ||
            winningPlay(1, 4, 7) ||
            winningPlay(2, 5, 8) ||
            winningPlay(0, 1, 2) ||
            winningPlay(3, 4, 5) ||
            winningPlay(6, 7, 8) ||
            winningPlay(0, 4, 8) ||
            winningPlay(2, 4, 6)
        );
    }

    /**
     * This method handles playing the game.
     * 
     * @param btn The JButton object reference.
     */
    private void playGame(JButton btn) {

        // button text is not blank "", then it has been played already
        if (!btn.getText().equals("")) {

            // warn the user with a system beep
            getToolkit().beep();

        } else {
            
            // the button is open!

            // set button text as "X" or "O"
            btn.setText(player);

            // check for a winner
            if (gameIsWon()) {
    
                // announce the winning player
                label.setText(player + " wins");
    
                // show the reset button
                resetBtn.setVisible(true);

            } else {

                // toggle the current player
                if (player.equals("X")) {
                    player = "O";
                } else {
                    player = "X";
                }
    
                // display current players turn
                label.setText(player + "'s turn");
    
                // determine how many plays are left
                int countPlays = 0;
                for (int i = 0; i < buttons.length; i++) {
                    String buttonText = buttons[i].getText();
                    if (!buttonText.equals("")) countPlays ++;
                }

                // check for "cat's game" (no winner)
                if (countPlays == buttons.length) { 
                    label.setText("Cat's game");
                    resetBtn.setVisible(true);
                }
            }
        }
    }

    /**
     * This method resets the game to its original state.
     */
    private void resetGame() {

        // player X is always first
        player = "X";
        label.setText(player + "'s turn");

        // reset all the button squares
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(true);
            buttons[i].removeActionListener(this);
            buttons[i].addActionListener(this);
            buttons[i].setText("");
        }
        
        // hide the reset button
        resetBtn.setVisible(false);
    }

    /**
     * The application method initiates our program.
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        
        // instantiate a new game object
        TicTacToe game = new TicTacToe();
    }
}