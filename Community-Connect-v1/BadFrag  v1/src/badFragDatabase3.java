
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat ;
import java.net.*;
import javax.swing.JOptionPane;

//___________________IMPORTS END_________________________________
public class badFragDatabase3 extends JFrame {
  viewRecords vR = new viewRecords();
  addMemberWindow aMW = new addMemberWindow();
  addMemberWindow2 aMW2 = new addMemberWindow2();
  addRecord aR = new addRecord();
  viewTags vT = new viewTags();
  multipleRA mRA = new multipleRA();
  addRecord2 aR2 = new addRecord2();
  logs l = new logs();
  JLabel mainTitleLabel;
  JLabel creditLine;
  JLabel creditLineCreator;
  JLabel mainImage;  
  JButton viewRecords;
  JButton addMember;
  JButton addRecord;
  JButton viewTags;  
  JButton logs;
 JButton ra;
JLabel rankCheck;
JLabel roleCheck;
JLabel tagCheck;


//______________JObjects END___________________________________
  public badFragDatabase3(){
    setLayout(null);
    mainTitleLabel = new JLabel ("Bad:Frag Automatic Information Dispensing System");
    mainTitleLabel.setFont(new Font("Impact", Font.BOLD, 30));
    add(mainTitleLabel);
    mainTitleLabel.setBounds (9, -35, 2000, 100);
    mainTitleLabel.setForeground(Color.RED);
    
  JOptionPane.showMessageDialog(null, 
                              "Make sure SYNC is running. If unsure check documentation", 
                              "B:F A.I.D.S SYNC warning", 
                              JOptionPane.WARNING_MESSAGE);

    
    creditLine = new JLabel ("Developed by");
    add(creditLine);
    creditLine.setBounds(9, 0, 2000, 100);
    
    creditLineCreator = new JLabel ("Nikk");
    add(creditLineCreator);
    creditLineCreator.setBounds(90, 0, 2000, 100);
    creditLineCreator.setForeground(Color.BLUE);
    
    viewRecords = new JButton("Search");
    add(viewRecords);
    viewRecords.setBounds(35, 175, 250, 100);
    viewRecords.setFocusPainted(false);
      
    addMember = new JButton ("Add a member");
    add(addMember);
    addMember.setBounds(35, 300, 250, 100);
      
    addRecord = new JButton("Insert data");
    add(addRecord);
    addRecord.setBounds(285, 175, 250, 100);
 
    viewTags = new JButton("View tags");
    add(viewTags);
    viewTags.setBounds(285, 300, 250, 100);
    
    logs = new JButton("Logs");
    add(logs);
    logs.setBounds(625, 45, 75, 25);
    
 ra = new JButton ("<HTML>Register <br> multiple <br >absences <HTML>");
 add(ra);
 ra.setBounds(535, 175, 200, 225);
    
   
   


    mainImage = new JLabel ();
    

  
  
   mainImage.setIcon(new ImageIcon("bin/res/tviCGYhF.JPG"));
  //mainImage.setIcon(new ImageIcon(getClass().getResourceAsStream("res/tviCGYhF.JPG")));
    //mainImage.setIcon(new ImageIcon(getClass().getResource("res/tviCGYhF.JPG")));
    
   // URL imageURL = getClass().getResource("/res/tviCGYhF.JPG");
  //mainImage.setIcon(new ImageIcon(imageURL));
 //System.out.println(imageURL);
    add(mainImage);
    mainImage.setBounds( 1, 1, 2000, 600);
      
      
      
event Action = new event();
viewRecords.addActionListener(Action);
addMember.addActionListener(Action);
addRecord.addActionListener(Action);
viewTags.addActionListener(Action);
 ra.addActionListener(Action);
      logs.addActionListener(Action);
  }//_______________________PLACE JOBJECTS END________________
  public class event implements ActionListener {
         
    public void actionPerformed(ActionEvent Action){
       if(Action.getSource()== viewRecords){
         vR.viewRecords();
       }
       
         if(Action.getSource()== addMember){
         //aMW.addMemberWindow();
          aMW2.addMemberWindow2();
         }
       
         if(Action.getSource()== addRecord){
           aR2.addRecord2();
       }
          if(Action.getSource()== viewTags){
            vT.viewTags();
       }
          if(Action.getSource() == ra){
           mRA.multipleRA(); 
            System.out.println("Clicked");
          }
          if(Action.getSource() == logs){
            l.logs();
          }
          
      
    }}
  //__________________ACTION LISTENER END___________________
  
  
  public static void main (String args[]){
   

   badFragDatabase3 mainFrame = new badFragDatabase3(); 
   mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   mainFrame.setSize(750, 500);
   mainFrame.setResizable(false);
   mainFrame.setVisible(true);
   mainFrame.setTitle("B:F A.I.D.S (BFAIDS)");

    
    
  }//_____________JFRAME END____________________
  
  
  
  
  
  
}
