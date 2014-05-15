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
import javax.swing.border.*;

public class ScorePanel extends JPanel
{    
    /*
     * Instance variables - define their purpose with JavaDoc
     */

//--------------------------------------------------------------------    
    
    //Constructors
    
    /**
     * Class Constructor for ScorePanel
     * Defines the dimensions, colour and presentation of the panel
     * Adds buttons (with no functionality) to the panel
     */
    public ScorePanel()
    {
        
        setPreferredSize(new Dimension(420,200));
        setBackground(Color.white);
        TitledBorder tb = BorderFactory.createTitledBorder("Scores");
        tb.setTitleJustification(TitledBorder.LEFT);
        setBorder(tb);
        
        JButton btn = new JButton("Restart");
        add(btn);
        btn = new JButton("Repopulate");
        add(btn);
        btn = new JButton("Exit");
        add(btn);
    }
    
//--------------------------------------------------------------------    
    
    //Methods   
    
    /**
     * Repaints the component - not directly invoked, called through repaint or 
     * similar operation.
     * @param brush a graphics object
     */
    public void paintComponent(Graphics brush)
    {
        super.paintComponent(brush);
    }

    /**
     * Briefly describe the purpose of any methods in 2-3 sentences.  If necessary
     * include more detail.
     * 
     * Include these tags if required:
     * @param
     * @return
     */
   
}
