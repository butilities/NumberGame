package numbergame;

/**
 *
 * @author All author names should be in this section
 * 
 * Briefly describe the purpose of the class in 2-3 sentences
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MainPanel extends JPanel
{
    /*
     * Instance variables - define their purpose with JavaDoc
     */
        
    /** a single NumberPanel */
    private NumberPanel np1;
    /** a panel that contains the score as well as interactive buttons */
    private ScorePanel sp;
    

//--------------------------------------------------------------------    
    
    //Constructors
    
    /**
     * Class Constructor for the MainPanel
     * Defines a single NumberPanel and ScorePanel and adds to the current panel
     */
    public MainPanel()
    {
        setPreferredSize(new Dimension(420,750));
        setBackground(Color.darkGray);
        
        np1 = new NumberPanel();
        add(np1);
        
        sp = new ScorePanel();
        add(sp, BorderLayout.SOUTH);
        
    }
    
//--------------------------------------------------------------------    
    
    //Methods
    
    /**
     * Briefly describe the purpose of any methods in 2-3 sentences.  If necessary
     * include more detail.
     * 
     * Include these tags if required:
     * @param
     * @return
     */

 
}
