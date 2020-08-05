import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * First button handler class
 */
public class SayHey implements ActionListener {
    
    /**
     * Method inherited from ActionListener
     * @param  e The event source
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = "Hey, you just clicked the button.";
        JOptionPane.showMessageDialog(null, msg);
    }

}