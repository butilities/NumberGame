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

public class NumberPanel extends JPanel
{
    /*
     * Instance variables - define their purpose with JavaDoc
     */

//--------------------------------------------------------------------    
    
    //Constructors    

    /**
     * Class Constructor for NumberPanel
     * Defines the dimension and colour of the NumberPanel
     */
    public NumberPanel()
    {
        setPreferredSize(new Dimension(40, 40));
        setBackground(Color.red);
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
