/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilatron6000;

import javax.swing.JPanel;

/**
 *
 * @author mark
 */
public class CompilatronPanel extends JPanel {
    
    
    public  CompilatronPanel(){
    
    
    super();
     // DemoJFileChooser djfc = new DemoJFileChooser();
   // SimpleTableDemo tableDemo = new SimpleTableDemo();
   // add(tableDemo);
   //  add(djfc);
     ConfigScreen c = new ConfigScreen();
    add(c);
}
    
    
}
