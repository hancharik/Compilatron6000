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

String testDataPath = "";
String argsFileName = "";
String testInputFileName = "";
String inputFileStub = "";
String inputFileName = "";
  int success;



    
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
            testDataPath = "";
            argsFileName = "";
            testInputFileName = "";
            inputFileStub = "";
            inputFileName = "";
            success = 64; // no reason, just need to check other code for what the values mean, i don't want to initiallize to a test result number
 }  // end initializeDataObject()
   

 
 
// accessors and mutators:
 
 public int getNumbr(){
   return numbr;  
 }
 public void setNumbr(int n){
   numbr = n;  
 } 
 
 
 public String getNme(){
     return nme;
 }
 public void setNme(String n){
    nme = n; 
 } 
 
 
 public String getHndl(){
      return hndl;    
 }
 public void setHndl(String h){
     hndl = h;
 } 
 
 
 public String getPth(){
       return pth;   
 }
 public void setPth(String p){
     pth = p;
 } 
 
 
 public String getClsPath(){
      return clsPath;    
 }
 public void setClsPath(String c){
    clsPath = c; 
 } 
 
 
 public String getSrcPath(){
        return srcPath;  
 }
 public void setSrcPath(String s){
   srcPath = s;  
 } 
 
 
 public String getStdPath(){
          return stdPath;
 }
 public void setStdPath(String s){
    stdPath = s; 
 } 
 
 
 public String getOutFileName(){
     return outFileName;     
 }
 public void setOutFileName(String o){
     outFileName = o;
 } 
  
  public String getTestDataPath(){
     return testDataPath;     
 }
 public void setTestDataPath(String o){
     testDataPath = o;
 } 
  public String getArgsFileName(){
     return argsFileName;     
 }
 public void setArgsFileName(String o){
     argsFileName = o;
 } 
  public String getTestInputFileName(){
     return testInputFileName;     
 }
 public void setTestInputFileName(String o){
     testInputFileName = o;
 } 
  public String getInputFileStub(){
     return inputFileStub;     
 }
 public void setInputFileStub(String o){
     inputFileStub = o;
 } 
  public String getInputFileName(){
     return inputFileName;     
 }
 public void setInputFileName(String o){
     inputFileName = o;
 } 
  public int getSuccess(){
     return success;     
 }
 public void setSuccess(int s){
     success = s;
 }   
    
}  // end
