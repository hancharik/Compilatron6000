/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilatron6000;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mark
 */
public class Compilatron6000 {

    /**
     * @param args the command line arguments
     */
    
    public static CompilatronFrame tv;
    public static DataObject data;
    
    public static void main(String[] args) throws IOException {
        
       //  TrivialEdit te = new TrivialEdit();
        tv = new CompilatronFrame();
        data = new DataObject();
      // BatchTester b = new BatchTester();
       //SingleTester s = new SingleTester();
        
        Process process;

        /*
       //test to run cmdxp.exe
        Runtime runtime = Runtime.getRuntime();
        try {
            process = runtime.exec("cmd /c start C:\\java\\src\\program-test-242-1\\cmdxp.exe");
        } catch (IOException ex) {
            Logger.getLogger(Compilatron6000.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            process = runtime.exec("cmd /c start cd ..");
        } catch (IOException ex) {
            Logger.getLogger(Compilatron6000.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /////////////////////////////////////////////////////////////////////////////
        runtime = Runtime.getRuntime();
        //////////////////////////////////////////////////////////////////////////////////
         try {
           process = runtime.exec("cmd /c start C:\\java\\src\\program-test-242-1\\setup7.bat");
        } catch (IOException ex) {
            Logger.getLogger(Compilatron6000.class.getName()).log(Level.SEVERE, null, ex);
        }
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            process = runtime.exec("cmd /c start C:\\java\\src\\program-test-242-1\\winbash.bat");
        } catch (IOException ex) {
            Logger.getLogger(Compilatron6000.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      */
    }  // end main
    
    
    
} // end
