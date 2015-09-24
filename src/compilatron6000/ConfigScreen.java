/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilatron6000;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author mah537
 */
public class ConfigScreen extends JPanel{
    
    int column1 = 200;
    int column2 = 30;
    
    DataObject data; //= compilatron6000.Compilatron6000.data;  // moved to updateLabels()
    
   JFileChooser chooser;
   String choosertitle;
   String chooserDirectorySelection;
   String chooserFileSelection;
    
        public JButton setPathButton = new JButton();
    public JButton setStudentPathButton = new JButton();
    
    public JButton setOutputFileNameButton = new JButton();
    public JButton setArgsFileNameButton = new JButton();
    
    
    public JButton runBatchButton = new JButton();
    public JButton runSingleButton = new JButton();
     
    
    public JLabel studentNameLabel = new JLabel("student name");
    public JLabel studentNumberLabel = new JLabel("student number" );
    public JLabel studentHandleLabel = new JLabel("student Handle");
    public JLabel pathLabel= new JLabel("path");
    public JLabel classPathLabel= new JLabel("class path");
    public JLabel sourcePathLabel= new JLabel("source path");
    public JLabel studentPathLabel= new JLabel("student path");
    public JLabel outputFileNameLabel = new JLabel("output file name");
    public JLabel configurationFileNameLabel = new JLabel("configuration file name" );
    public JLabel argsFileNameLabel = new JLabel("args file name");
    public JLabel successLabel = new JLabel("success number");
    
    public ConfigScreen()
    {
       initializeComponents();
      
    }
/*
// border layout? maybe
        BorderLayout BL = new BorderLayout();
        super.setLayout(BL);
        BL.layoutContainer(this);
        
        JButton btnRunSingle = new JButton();
        btnRunSingle.setBackground(Color.GREEN);
        btnRunSingle.setForeground(Color.darkGray);
        btnRunSingle.setText("Run Single");
        
        this.add(btnRunSingle,"East");

        JButton btnRunBatch = new JButton();
        btnRunBatch.setBackground(Color.RED);
        btnRunBatch.setForeground(Color.WHITE);
        btnRunBatch.setText("Run Batch");
    
        this.add(btnRunBatch,"West");
        
        JPanel JP = new JPanel();
        JP.setLayout(new GridLayout(0,2));
        JP.setBackground(Color.BLUE);
        
        this.add(JP);
    } // end marc's runconfig
    */
        
     public void initializeComponents(){
         
         this.setLayout(null);
        
        
        setOutputFileNameButton.setBounds(column2, 10, 170, 26);
        setStudentPathButton.setBounds(column2, 40, 170, 26);
        setArgsFileNameButton.setBounds(column2, 70, 170, 26);
        setPathButton.setBounds(column2, 100, 170, 26);
        
        
        
        studentNumberLabel.setBounds(column1, 10, 400, 26);
        studentNameLabel.setBounds(column1, 40, 400, 26);
        studentHandleLabel.setBounds(column1, 70, 400, 26);
        pathLabel.setBounds(column1, 100, 400, 26);
        classPathLabel.setBounds(column1, 130, 400, 26);
        sourcePathLabel.setBounds(column1, 160, 400, 26);
        studentPathLabel.setBounds(column1, 190, 400, 26);
        outputFileNameLabel.setBounds(column1, 220, 400, 26);
        configurationFileNameLabel.setBounds(column1, 250, 400, 26);
        argsFileNameLabel.setBounds(column1, 280, 400, 26);
        successLabel.setBounds(column1, 310, 400, 26);
        
        
        runSingleButton.setBounds(40, 370, 170, 26);
        runBatchButton.setBounds(260, 370, 170, 26);
       
        
      

       
        setPathButton.addActionListener(new ConfigScreen.ControlButtonListener());
        setStudentPathButton.addActionListener(new ConfigScreen.ControlButtonListener());
        runSingleButton.addActionListener(new ConfigScreen.ControlButtonListener());
        setOutputFileNameButton.addActionListener(new ConfigScreen.ControlButtonListener());
        setArgsFileNameButton.addActionListener(new ConfigScreen.ControlButtonListener());
        runBatchButton.addActionListener(new ConfigScreen.ControlButtonListener());
        
        setPathButton.setText("Set Path");
        setStudentPathButton.setText("Set Student Path");
        setOutputFileNameButton.setText("Set Output file Name");
        setArgsFileNameButton.setText("Set args file");
        
        runSingleButton.setText("Run Single");
        runBatchButton.setText("Run Batch");
        
        
        //ImageIcon pictureAsset = new ImageIcon("images/pic1.png");
      
       
        this.setBackground(Color.white);
       
        this.add(studentNameLabel);
        this.add(studentNumberLabel);
        this.add(studentHandleLabel);
        this.add(outputFileNameLabel);
        this.add(configurationFileNameLabel);
        this.add(argsFileNameLabel);
        this.add(pathLabel);
        this.add(classPathLabel);
        this.add(sourcePathLabel);
        this.add(studentPathLabel);
        this.add(successLabel);
        
        /*
        this.add(setPathButton);
        this.add(setStudentPathButton);
        this.add(setOutputFileNameButton);
        this.add(setArgsFileNameButton);
        */
        
        this.add(runBatchButton);
        this.add(runSingleButton);
       
       
     }  // end initialize components
        
  public void showChooser(){
      
                        chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      System.out.println("getCurrentDirectory(): " 
         +  chooser.getCurrentDirectory());  // this is where you apply the dataObject.setVariable();
       chooserDirectorySelection = chooser.getCurrentDirectory().toString();
      System.out.println("getSelectedFile() : " 
         +  chooser.getSelectedFile());
      chooserFileSelection = chooser.getSelectedFile().toString();
      }
    else {
      System.out.println("No Selection ");
      }
  }
      
  
    public class ControlButtonListener implements ActionListener{ // i'm pretty sure this is from Fred's IST 311 class
        public void actionPerformed(ActionEvent evt){
          
           JButton thisButton = (JButton) evt.getSource();
           
            if (thisButton == runSingleButton) {
              SingleTester s = new SingleTester();
              updateLabels(compilatron6000.Compilatron6000.data);
            }
            if (thisButton == runBatchButton) {
                BatchTester b = new BatchTester();
                updateLabels(compilatron6000.Compilatron6000.data);   
            }
            
            if (thisButton == setArgsFileNameButton) {
                showChooser();
                argsFileNameLabel.setText(chooserFileSelection);
 
            }
            
            if (thisButton == setPathButton) {
                showChooser();
                pathLabel.setText(chooserFileSelection);
 
            }
            
            
            
            
            
            
        }
    } // end ControlButtonListener
    
 public void updateLabels(DataObject data){
     
     
     
     
    studentNameLabel.setText("student name: " + data.getNme());
    studentNumberLabel.setText("student number: " + data.getNumbr());
    studentHandleLabel.setText("student Handle" + data.getHndl());
    pathLabel.setText("path"+ data.getPth());
    classPathLabel.setText("class path"+ data.getClsPath());
    sourcePathLabel.setText("source path"+data.getSrcPath());
    studentPathLabel.setText("student path"+ data.getStdPath());
    outputFileNameLabel.setText("output file name"+ data.getOutFileName());
    configurationFileNameLabel.setText("configuration file name"+ data.getConfigurationFileName() );
    argsFileNameLabel.setText("args file name"+ data.getArgsFileName());
    successLabel.setText("success = " + data.getSuccess());
    
    
    
 }  // end update labels   
    
    
    
    
    
    
} // end
