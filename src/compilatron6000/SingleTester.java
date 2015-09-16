/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilatron6000;

import java.io.*;
import java.util.*;

public class SingleTester{
    
    
     DataObject dataObject;       
            
  public SingleTester(){
//  initialize student and class configuration data    
    int studentNumber = 0;
    
    // is this correct? make the object and then copy?
    dataObject = new DataObject();
    dataObject = compilatron6000.Compilatron6000.data;
    
    
    int runNumber = 1; 
    String studentName = "blank";
    String studentHandle = "000000";
    String className = "242-1/"; 
    String configFileName = "./configSingle.txt";
    System.out.println("configFileName: " + configFileName);
    String path = "C:/java/jdk1.7.0_71/bin";
    
//  set fixed paths and file names:
    String sourcePath = "./src/src-output";
    String testDataPath = "./src";
    String argsFileName = testDataPath + "/args.txt";
    String testInputFileName = testDataPath + "/TestInput.txt";
/*  make sure set correctly
    System.out.println("sourcePath: " + sourcePath);
    System.out.println("testDataPath: " + testDataPath);
    System.out.println("argsFileName: " + argsFileName);
    System.out.println("testInputFileName: " + testInputFileName);
*/
    try
    {
/*    config file contains:
      - path to Java jdk (enclosed in quotes) on first line
        e.g. - "C:/Program Files/Java/jdk1.7.0_25/bin"
      - student name (lowercase lastnamefm) on second line
        e.g. - smithjq for John Q. Smith
      - random 6-digit handle on third line
        e.g. - 543890 - use the one given to you in class
*/
      File configFile = new File(configFileName);
      Scanner in = new Scanner(configFile);
      String line  = in.nextLine();
      Scanner inLine = new Scanner(line); 
      path = inLine.next();
      line = in.nextLine();
      inLine = new Scanner(line);
      studentName = inLine.next();
      line = in.nextLine();
      inLine = new Scanner(line);
      studentHandle = inLine.next();      

//    set paths and file names:
      String classPath = "/java/bin/" + className + studentName;
      String studentPath = sourcePath + "/" + studentName;
      String inputFileStub = studentPath + "/input";
      String outputFileName = studentPath + "/output-" + studentName + ".txt";
/*    make sure set correctly
      System.out.println("classPath: " + classPath);
      System.out.println("studentPath: " + studentPath);
      System.out.println("inputFileStub: " + inputFileStub);
      System.out.println("outputFileName: " + outputFileName);
*/
      
      System.out.println("run #: " + runNumber + " ; studentNumber: " + studentNumber + 
      "; Name: " + studentName + "; Handle: " + studentHandle);
      System.out.println("Output goes to: " + outputFileName);
        
//    run javac compiler - returns 0 on success
//    Compiler Constructor:
//    public Compiler(int numbr, String nme, String hndl, String pth, String clsPath, 
//    String srcPath, String stdPath, String outFileName)
      
      Compiler c = new Compiler(dataObject);
      int success = c.compileJava();
        
//    Print whether or not compile successful
      if(success == 0) 
      {
        System.out.println("Compiled Successfully");
      }
      else
      {
        System.out.println("Compile Exception");
      }
      
//    Run the test cases
//    TestRunner consructor:
//    public TestRunner(int numbr, String nme, String hndl, String pth, String clsPath, 
//    String srcPath, String stdPath, String tstDataPath, String argFileName, 
//    String tstInputFileName, String inputFileName, String outFileName)
      TestRunner r = new TestRunner(dataObject);
      r.runJava();
      runNumber++;
      System.out.println();
    } catch(IOException ioe)
    {
      System.out.println("main IOException");
    }
  }

   
}
