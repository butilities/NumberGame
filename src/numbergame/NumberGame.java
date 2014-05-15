package numbergame;

/**
 *
 * @author All author names should be in this section (if more than one then 
 * include a new (at)author tag for each one.
 * 
 * @version specify the version of the project
 * 
 * Briefly describe the purpose of the class in 2-3 sentences
 */

//You should not need to change this class in any way.  You should be able to 
//run the project and see a new window created with a red block, and a white
//scores panel.

import javax.swing.*;

public class NumberGame {

    /**
     * main method to create a new JFrame and place a panel within
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(new MainPanel());
        
        frame.pack();
        frame.setVisible(true);
    }
}
