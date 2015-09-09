/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilatron6000;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author mark
 */
public class CompilatronFrame extends JFrame {
    
    
     CompilatronPanel mainScreen;
   
    
    
        public CompilatronFrame(){
        
        super();
        
        mainScreen = new CompilatronPanel();
       
        setLayout(new BorderLayout());
        getContentPane().add(mainScreen);
       
        this.setTitle("Compilatron6000");
        setSize(500, 500);
        setVisible(true);
        setLocation(400,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 

        //showMessage();
    }

    
}
