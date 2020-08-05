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
     * This field holds are array of buttons (Tic-Tac-Toe boxes).
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
     * This field holds reference to the current player.
     */
    private String player;
    /**
     * This field holds reference to whether or not the game is over.
     */
    private boolean gameOver;

    /**
     * This zero parameter constructor initializes 
     * all of the fields for this program.
     */
    public TicTacToe() {

        // create the window using the base class
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

        // create all 9 button squares adding them to the "buttons" array
        for (int i = 0; i < 9; i++) {

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
            // set to the next row
            rowIndex++;
        }

        // create the game's message label
        label = new JLabel("X's turn"); 
        label.setSize(160, 20);
        label.setLocation(30, 200);
        label.setAlignmentX(50);
        label.setHorizontalAlignment(SwingConstants.CENTER);       
        add(label);

        // start with X's playing first
        player = "X";

        // the game can't be over until it starts
        gameOver = false;

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
     * The method from ActionListener.
     * 
     * @param e The action that triggered this handler.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        // create a reference to the current button that triggered an event
        JButton btn;
        btn = (JButton) e.getSource(); 

        // if they didn't hit the reset button, then play the game
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
     * then checks for and handles a winning move.
     * 
     * @param a The first array index.
     * @param b The second array index.
     * @param c The third array index.
     */
    private void checkForWinner(int a, int b, int c) {

        // assume no player has won yet
        boolean won = false;

        // check if for 3 in a row
        if (buttons[a].getText().equals(player) && 
            buttons[b].getText().equals(player) && 
            buttons[c].getText().equals(player)) 
        {
            // indicate the match is won
            won = true;
        } 

        // handle win
        if (won) {

            // disable all buttons
            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setEnabled(false);
            }

            // re-enable the winning buttons and remove their click handlers
            buttons[a].setEnabled(true);
            buttons[b].setEnabled(true);
            buttons[c].setEnabled(true);
            buttons[a].removeActionListener(this);
            buttons[b].removeActionListener(this);
            buttons[c].removeActionListener(this);

            // indicate the game is over
            gameOver = true;

            // announce the winning player
            label.setText(player + " wins");

            // show the reset button
            resetBtn.setVisible(true);

            // return to playGame() method
            return;
        }

    }

    // private boolean checkForWinningMove() {
        
    // }

    // private void handleWinningMove() {

    // }

    /**
     * This method handles playing the game.
     * 
     * @param btn The JButton object reference.
     */
    private void playGame(JButton btn) {

        // button text is not blank "", then it has been played already
        if (!btn.getText().equals("")){
            // warn the user with a system beep
            getToolkit().beep();
        } else {
            
            // the button is open!

            // set button text as "X" or "O"
            btn.setText(player);
            
            // check for each winning combination (passing in the array indexes
            checkForWinner(0, 3, 6);
            checkForWinner(1, 4, 7);
            checkForWinner(2, 5, 8);
            checkForWinner(0, 1, 2);
            checkForWinner(3, 4, 5);
            checkForWinner(6, 7, 8);
            checkForWinner(0, 4, 8);
            checkForWinner(2, 4, 6);

            // game is not over yet
            if (!gameOver) {

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
                if (countPlays == 9) { 
                    gameOver = true;
                    label.setText("Cat's game");
                    resetBtn.setVisible(true);
                }
            }

        }

    }




    private void resetGame() {

        gameOver = false;
        player = "X";

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(true);
            buttons[i].removeActionListener(this);
            buttons[i].addActionListener(this);
            buttons[i].setText("");
        }

        label.setText("X's turn");

        resetBtn.setVisible(false);

        
    }

    public static void main(String[] args) {
        
        TicTacToe game = new TicTacToe();
    }

}