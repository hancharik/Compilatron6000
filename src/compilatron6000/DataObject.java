/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilatron6000;

/**
 *
 * @author mark
 */
public class DataObject {
    
// the are the variables required for Compiler.java (taken from compiler.java constructor)   
int numbr;
String nme;
String hndl;
String pth; 
String clsPath;
String srcPath;
String stdPath;
String outFileName;  
    
    
  public DataObject(){ 
      
      initializeDataObject();
      
      
      
  } // end constructor 
  
  
  
  
  ////////////////////////////////////////////////////////////////////
  // this is in case you want to create a pre-existing data object (say from persistent storage)
    public DataObject(int numbr, String nme, String hndl, String pth, String clsPath, String srcPath, String stdPath, String outFileName){ 
      
     
      
      
      
  } // end constructor with variables
 //////////////////////////////////////////////////////////////////////////
    
    
    
    
 private void initializeDataObject(){
 
     
     // these can be pulled from a database later
            numbr = 0;
            nme = "";
            hndl = "";
            pth = "";
            clsPath = "";
            srcPath = "";
            stdPath = "";
            outFileName = "";  
     
 }  // end initializeDataObject()
   
 
 
 
 
 
 
 
    
}  // end
