
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
import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException; import java.nio.file.Files; import java.nio.file.Paths; import java.util.List; import java.util.stream.Collectors; import java.util.stream.Stream;
import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
















public class addMemberWindow{
  int z = 1;
   int x;
  //JOBJECTS
   JLabel tagText;
   JTextField tagTextField;
   JLabel tagOut;
   String newTag = " ";
   String memberName;
   String NMN;
   JLabel mainImage;
   int sameName = 0;
  String newMemberTagInt;
   JLabel creditStructure;
   JLabel creditNames;
   JTextField rank;
   JButton rankSubmit;
   JButton finalSubmit;
   String afeNMN;
   int xy = 1;
   JFrame frame = new JFrame("Test");
      public double addMemberWindow(){
         
  
        
       //JFrame frame = new JFrame("Test");
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(750, 500);
       frame.setResizable(false);
       frame.setVisible(true);
       frame.setTitle("B:F A.I.D.S New Member Tag Creation (BFAIDSNMTC)");   
       
        
        
        //_________WINDOW ^
       
     
     
       
       rank = new JTextField("Starting rank");
       frame.add(rank);
       rank.setBounds(300, 10, 100, 20);
      rank.setVisible(true);

     
        
        rankSubmit = new JButton("Submit rank");
        frame.add(rankSubmit);
        rankSubmit.setBounds(250,50, 200, 20);
        
       rankSubmit.addActionListener(new ActionListener() {

  public void actionPerformed(ActionEvent e) {
    System.out.println("click");
   tagText.setVisible(true); 
        rank.setVisible(false); 
        tagTextField.setVisible(true); 
        rankSubmit.setVisible(false);;
        tagOut.setVisible(true);
    
  }
       });
        
      
     
       
         tagTextField = new JTextField ("Name");
       frame.add(tagTextField);
       tagTextField.setBounds(80, 10, 100, 20);
        tagTextField.setVisible(false);
          tagText = new JLabel ("Name :");
      frame.add(tagText);
      tagText.setBounds(10, 10, 100, 20);
      tagText.setForeground(Color.BLACK);
      tagText.setFont(new Font("Arial", Font.BOLD, 18));
       tagText.setForeground(Color.BLACK);
       tagText.setVisible(false);
       
       
       finalSubmit = new JButton("Finalize");
       frame.add(finalSubmit);
       finalSubmit.setBounds(200, 200, 300, 200);
       finalSubmit.setVisible(false);
      
       tagOut = new JLabel("New tag" + newTag);
       frame.add(tagOut);
       tagOut.setBounds(185, 10, 100, 20);
       tagOut.setForeground(Color.BLACK);
         tagOut.setVisible(false);
        creditStructure = new JLabel("           Takistan, lead Nick assess situation as NickTheGreek & Insane Cucumber fire upon enemies");
        frame.add(creditStructure);
        creditStructure.setBounds(180, 450, 600, 20);
       creditStructure.setFont(new Font("Arial", Font.BOLD, 11));
        creditStructure.setForeground(Color.RED);
              
       
  
        
       
          mainImage = new JLabel ();
         mainImage.setIcon(new ImageIcon("bin/res/20190302161528_1.JPG"));
         frame.add(mainImage);
         mainImage.setBounds( -750, 1, 2000, 600);
         
       
       
       
       
       
       
       
       
        event Action = new event();
        tagTextField.addActionListener(Action);
       
         
      
          return x;
      } 
      public class event implements ActionListener { //_________________________________
         
    public void actionPerformed(ActionEvent Action){
      NMN = tagTextField.getText();
      newMemberTagInt = tagTextField.getText();
      //double newMemberTagInt =  (int)(Math.random()*((1-99)+1))+99;
  //  newMemberTagInt = (Math.round(newMemberTagInt));
  
 afeNMN = newMemberTagInt;
  
    //_______________________________________________________________



 File file = new File("Sync/" + newMemberTagInt + ".0.txt");
 try{
   int numberCount = 1;
if(!file.exists()){
  file.createNewFile();
}else{
  while(file.exists()){
  System.out.println("File already exists");
   file = new File("Sync/" + newMemberTagInt + numberCount + ".0.txt");

 System.out.println(newMemberTagInt + numberCount + ".0.txt");
afeNMN =  newMemberTagInt + numberCount;
 numberCount++;
}
  
}


 }
 
 catch (Exception O){
  System.exit(0); 
 }
 
 newMemberTagInt = newMemberTagInt;
 
 


tagOut.setText("Tag is: " + afeNMN );
   

   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 Date date = new Date();
 System.out.println(dateFormat.format(date));
        
        
        
 try{
     String rankString = rank.getText();
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("001 " +  newMemberTagInt);
        pw.println("202 " + rankString);
        pw.print("000 " + (dateFormat.format(date)));
        pw.close();
 }
 catch(Exception b){
  System.exit(0); 
 }
      
      try{
        
        file = new File("Sync/1afe.txt");
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(afeNMN + "         " + NMN);
        
        pw.close();
        
  
    
       
        
    }
    catch(Exception LAWD){
     System.exit(0); 
    }
    
  finalSubmit.setVisible(true);
  
  finalSubmit.addActionListener(new ActionListener() {

  public void actionPerformed(ActionEvent e) {
     finalSubmit.setVisible(false);
        tagText.setVisible(false); 
        rank.setVisible(true); 
        tagTextField.setVisible(false); 
        rankSubmit.setVisible(true);;
        tagOut.setVisible(false);
        
        
        
         File file1 = new File("Sync/logs.txt");
    try{
           FileWriter fw1 = new FileWriter(file1, true);
        PrintWriter pw1 = new PrintWriter(fw1);
        pw1.println(NMN + " was added to the DB " + (dateFormat.format(date)));
        System.out.println(memberName);
        pw1.close();
    }
    catch(Exception wadsd){
     System.out.println("LOG"); 
    }
    
        
  }
  
  
  
        });
    }
   
   
      }//Action Listener
      
      
     
    

      
     
}














