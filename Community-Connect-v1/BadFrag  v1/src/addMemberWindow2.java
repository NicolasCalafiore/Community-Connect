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


public class addMemberWindow2{
  String weads;

  int y;
   JFrame frame = new JFrame("Test");
  JTextField name;
  JLabel nameText;
  JLabel nameCheck;
  String NMN;
  JTextField customRank;
  JTextField role;
  JLabel customRoleText;
JComboBox selection;
JComboBox roleSelection;
JLabel roleBox;
JLabel rankBox;
JButton customRankButton;
String membertag;
JLabel initialDate;
JButton changeDate;
  int wad;
  JLabel nameText12;
String memberTagCarry;
JTextField newDate;
String nameString;//
JLabel mainImage;
String startDateStringCarry;
JTextField customTag;
JLabel customTagText;
JButton continue1;
JButton noCustomTag;
JButton finalize;
JButton customRoleButton;
JLabel rankCheck;
JLabel roleCheck;
JTextField customRole;
JLabel tagCheck;
JLabel dateCheck;
JButton continue2;
JButton continue3;
JTextArea finalReport;
  public double addMemberWindow2(){
    
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(750, 500);
       frame.setResizable(false);
       frame.setVisible(true);
       frame.setTitle("B:F A.I.D.S New Member Tag Creation (BFAIDSNMTC)"); 
 
         
         
         
    name = new JTextField();
    frame.add(name);
    name.setBounds(80, 25, 100, 20);
    
    nameText = new JLabel("Custom Tag:");
    frame.add(nameText);
    nameText.setBounds(5, 25, 100, 20);
    
    int xx = 20;
    
    nameText12 = new JLabel ("XXX");
    frame.add(nameText12);
    nameText12.setBounds(300, 400, 200, 100);
    nameText12.setFont(new Font("Arial", Font.BOLD, 19));
    
    nameCheck = new JLabel ("Tag Inserted");
    frame.add(nameCheck);
    nameCheck.setBounds(625, 25+xx, 100, 20);
    
     rankCheck = new JLabel ("Rank Inserted");
    frame.add(rankCheck);
    rankCheck.setBounds(625, 40+xx+xx, 100, 20);
    
     roleCheck = new JLabel ("Role Inserted");
    frame.add(roleCheck);
    roleCheck.setBounds(625, 55+xx+xx+xx, 100, 20);
    
     tagCheck = new JLabel ("Name Inserted");
    frame.add(tagCheck);
    tagCheck.setBounds(625, 70+xx+xx+xx+xx, 100, 20);
    
     dateCheck = new JLabel ("Date Inserted");
    frame.add(dateCheck);
    dateCheck.setBounds(625, 85+xx+xx+xx+xx+xx, 100, 20);
    
    nameCheck.setForeground(Color.RED); 
    rankCheck.setForeground(Color.RED); 
    roleCheck.setForeground(Color.RED); 
    tagCheck.setForeground(Color.RED); 
    dateCheck.setForeground(Color.RED); 
    
 
    selection = new JComboBox();
    selection.addItem("U.C.E");
    selection.addItem("POG");
    selection.addItem("Grunt");
    selection.addItem("Specialist");
     selection.addItem("Founder");
    frame.add(selection);
  selection.setBounds(85, 100, 100, 20);
   //selection.setEnabled(false);
    
   rankBox = new JLabel ("Starting rank");
   frame.add(rankBox);
   rankBox.setBounds(5, 100, 100, 20);
   
      customRankButton = new JButton("Custom Rank");
   frame.add(customRankButton);
   customRankButton.setBounds(60, 135, 150, 30);
    
     customRank = new JTextField ("Enter custom rank");
    frame.add(customRank);
    customRank.setBounds(85, 140, 100, 20);
   

   
   
   
   
   
   
   
   
   
   
    roleSelection = new JComboBox();
    roleSelection.addItem("None");
    roleSelection.addItem("Moderator");
    roleSelection.addItem("Editor");
    roleSelection.addItem("Veteran");
     roleSelection.addItem("Recruiter");
    frame.add(roleSelection);
  roleSelection.setBounds(85, 200, 100, 20);
   
  customRoleText = new JLabel ("Custom role");
  frame.add(customRoleText);
  customRoleText.setBounds(5, 200, 100, 20);
  
   customRoleButton = new JButton("Custom Role");
   frame.add(customRoleButton);
   customRoleButton.setBounds(60, 235, 150, 30);
   
       customRole = new JTextField ("Enter custom role");
    frame.add(customRole);
    customRole.setBounds(85, 240, 100, 20);
  
     
   
   
     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 Date date = new Date();
 System.out.println(dateFormat.format(date));
 
 String initialStartDateString = dateFormat.format(date);
   
   initialDate = new JLabel ("Current start date: " + initialStartDateString);
   frame.add(initialDate);
   initialDate.setBounds(300, 54, 195, 100);
   
   
   changeDate = new JButton("Edit");
   frame.add(changeDate);
   changeDate.setBounds(300, 115, 75, 25);
   
   newDate = new JTextField("(yyyy/mm/dd)");
   frame.add(newDate);
   newDate.setBounds(380, 115, 90, 25);
   
   customTagText = new JLabel ("Custom Name:");
    frame.add(customTagText);
    customTagText.setBounds(5, 313, 100, 25);
   
   customTag = new JTextField ("");
   frame.add(customTag);
   customTag.setBounds(95, 315, 100, 20);
   
   
    
  
    continue1 = new JButton ("Submit rank");
    frame.add(continue1);
    continue1.setBounds(315, 25, 150, 40);
    
    noCustomTag = new JButton ("No custom name");
    frame.add(noCustomTag);
    noCustomTag.setBounds(40, 355, 135, 25);
    
    finalize = new JButton ("Submit new member");
    frame.add(finalize);
    finalize.setBounds(300, 180, 175, 40);
    
    continue2 = new JButton ("Submit Role");
    frame.add(continue2);
    continue2.setBounds(315, 25, 150, 40);
    
      
    continue3 = new JButton ("Submit Date");
    frame.add(continue3);
    continue3.setBounds(315, 25, 150, 40);
    
    finalReport = new JTextArea();
    frame.add(finalReport);
    finalReport.setEditable(false);
    finalReport.setBounds(300, 250, 150, 90);
    
    
 selection.setEnabled(false);
   customRankButton.setEnabled(false); 
       roleSelection.setEnabled(false);
       finalize.setEnabled(false);
       noCustomTag.setEnabled(false);
      continue1.setEnabled(false);
      changeDate.setEnabled(false);
      newDate.setEnabled(false);
 customRoleButton.setEnabled(false);
     
       customTag.setEnabled(false);  
    customRole.setEnabled(false);
    continue2.setEnabled(false);
    continue2.setVisible(false);
   continue3.setEnabled(false);
    continue3.setVisible(false);
       customRank.setEnabled(false);
       
       
       
    event Action = new event();
name.addActionListener(Action);
customRankButton.addActionListener(Action);
continue1.addActionListener(Action);
         customRoleButton.addActionListener(Action);
         continue2.addActionListener(Action);
         customTag.addActionListener(Action);
           noCustomTag.addActionListener(Action);
            changeDate.addActionListener(Action);
            continue3.addActionListener(Action);
            finalize.addActionListener(Action);
            
              mainImage = new JLabel ();
         mainImage.setIcon(new ImageIcon("bin/res/20190302161528_1.JPG"));
         frame.add(mainImage);
         mainImage.setBounds( -750, 1, 2000, 600);
         
            
      return y;
      
  }
  
  
   public class event implements ActionListener {
         
    public void actionPerformed(ActionEvent Action){
    
      
      
      
      
        System.out.println("1" + wad);
      
       
      if(Action.getSource()== name){
            nameString = name.getText();
             File f = new File("Sync/" + nameString + ".0.txt");
if(f.exists() && !f.isDirectory()) { 
  nameText12.setVisible(false);
    nameText12.setText("Tag exists already");
    
    
    
    
    
    
    
    
     nameText12.setVisible(true);
   int delay = 1500;
     ActionListener taskPerformer = new ActionListener() {
       public void actionPerformed(ActionEvent evt) {
           nameText12.setVisible(false);
       }
   };
   new javax.swing.Timer(delay, taskPerformer).start();    
    
    
    
    
    
    
    
    
    
    
    
    
    
       nameText12.setForeground(Color.RED); 
    wad = 0;
     System.out.println("12" + wad);
}
else { 
   
     wad = 1;
      System.out.println("13" + wad);
      nameText12.setText("");
}
     
      
             System.out.println("4" + wad);
if(wad ==1){
           System.out.println(nameString);
           nameCheck.setForeground(Color.GREEN); 
           
           name.setEnabled(false);
           customRankButton.setEnabled(true); 
            selection.setEnabled(true);
        
            continue1.setEnabled(true);
            

 finalReport.append("Tag: " + nameString);
      }
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
         
    File file = new File("Sync/" + nameString + ".0.txt");
 try{
   int numberCount = 1;
if(!file.exists()){
  file.createNewFile();
}else{
  
  
}


 }
 
 catch (Exception O){
  System.exit(0); 
 }
  File file1 = new File("Sync/1afe.txt");
 try{
   int numberCount = 1;
if(!file.exists()){
  file.createNewFile();
}else{
  
  
}


 }
 
 catch (Exception O){
  System.exit(0); 
 }
 //________
      
      
      
      
      if(Action.getSource() == customRankButton){
        
        
    
         String customRankString = customRank.getText();
         selection.setEnabled(false);
         customRankButton.setVisible(false);
         customRank.setVisible(true);
         customRank.setEnabled(true);
        
         
      }
      if(Action.getSource() == continue1){
     String rankString =  selection.getSelectedItem().toString();  
         String customRankString = customRank.getText();
     
       
        if(!selection.isEnabled()){
            finalReport.append("\nRank: " + customRankString);
            try{
             FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("202 " +  customRankString);
        pw.close();
            }
            catch(Exception waD){
             System.out.println("2"); 
            }
        
        }
        else{
          //if(!customRankButton.getModel().isPressed()){
      finalReport.append("\nRank:  " + rankString);
  //  } 
      
      
      try{
             FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("202 " +  rankString);
        pw.close();
            }
            catch(Exception waD){
             System.out.println("2"); 
            }
      
      
      
      
      
      
      
      
        }
        
        
        
        continue1.setVisible(false);
        customRankButton.setVisible(false);
        customRank.setVisible(true);
        customRank.setEditable(false);
   
        rankCheck.setForeground(Color.GREEN); 
         selection.setEnabled(false);
         
        roleSelection.setEnabled(true);
         customRoleButton.setEnabled(true);
          continue2.setEnabled(true);
    continue2.setVisible(true);
    
     
      }
      
      if(Action.getSource() == customRoleButton){
        roleSelection.setEnabled(false);
        customRoleButton.setVisible(false);
        customRole.setVisible(true);
        customRole.setEnabled(true);
        
      }
      if(Action.getSource() == continue2){
        
        String customRoleString = customRole.getText();
        
         String roleSelectionString =  roleSelection.getSelectedItem().toString(); 
         
         
          if(!customRole.isEnabled()){
            finalReport.append("\nRole:  " + roleSelectionString);
              try{
             FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("756 " +  roleSelectionString);
        pw.close();
            }
            catch(Exception waD){
             System.out.println("2"); 
            }
            
            
        }
        else{
    
      finalReport.append("\nRole:  " + customRoleString);
 try{
             FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("756 " +  customRoleString);
        pw.close();
            }
            catch(Exception waD){
             System.out.println("2"); 
            }
        }
         
        customRole.setEnabled(false);
        customRole.setText("Custm rl: " + customRoleString); 
        continue2.setVisible(false);
         continue2.setEnabled(false);
         roleCheck.setForeground(Color.GREEN); 
         noCustomTag.setEnabled(true);
         customTag.setEnabled(true);
           customRole.setEnabled(false);
           customRoleButton.setEnabled(false);
           customRoleButton.setVisible(false);
           roleSelection.setEnabled(false);
           
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      }
      if(Action.getSource() == noCustomTag){
        tagCheck.setForeground(Color.ORANGE); 
        noCustomTag.setEnabled(false);
          customTag.setEnabled(false);
          changeDate.setEnabled(true);
            newDate.setEnabled(false);
             continue3.setVisible(true);
              continue3.setEnabled(true);
              String membertag = name.getText();
              finalReport.append("\nName:  " + membertag);
               try{
             FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("001 " +  nameString);
        pw.close();
            }
            catch(Exception waD){
             System.out.println("2"); 
            }
              memberTagCarry = membertag;
      }
      if(Action.getSource() == customTag){
        tagCheck.setForeground(Color.GREEN);
          
        noCustomTag.setEnabled(false);
          customTag.setEnabled(false);
          changeDate.setEnabled(true);
            newDate.setEnabled(false);
            continue3.setVisible(true);
            continue3.setEnabled(true);
            
             String membertag = customTag.getText();
             finalReport.append("\nName:  " + membertag);
             
               try{
             FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("001 " +  membertag);
        pw.close();
            }
            catch(Exception waD){
             System.out.println("2"); 
            }
       
            memberTagCarry = membertag;
      }
      
      if(Action.getSource() == changeDate){
           newDate.setEnabled(true);
           //changeDate.setEnabled(false);
       
      }
      if(Action.getSource() == continue3){
         if(!newDate.isEnabled()){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 Date date = new Date();
 System.out.println(dateFormat.format(date));
           String startDateString = dateFormat.format(date);
           finalReport.append("\nStart date:  " + startDateString);
           
           try{
             FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("000 " +  startDateString);
        pw.close();
            }
            catch(Exception waD){
             System.out.println("2"); 
            }
           
           
           
           
           
           
           
         }
           else{
           String startDateString = newDate.getText();
            finalReport.append("\nStart date:  " + startDateString);
            
            
                try{
             FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("000 " +  startDateString);
        pw.close();
            }
            catch(Exception waD){
             System.out.println("2"); 
            }
            
            
          
         }
         
        initialDate.setText("Current Start date: CUSTOM DATE");
         changeDate.setEnabled(false);
          newDate.setEnabled(false);
          continue3.setVisible(false);
          finalize.setEnabled(true);
          
          dateCheck.setForeground(Color.GREEN);
       frame.invalidate();
frame.validate();
frame.repaint();

      }
      if(Action.getSource() == finalize){
        
        
         JOptionPane.showMessageDialog(null, 
                              "The member has been added successfuly! \n The program will now close \n to ensure read/write operations finish smoothly", 
                              "B:F A.I.D.S SYNC warning", 
                              JOptionPane.WARNING_MESSAGE);
         try{
              FileWriter fw1 = new FileWriter(file1, true);
        PrintWriter pw1 = new PrintWriter(fw1);
        pw1.println(nameString + "              " + memberTagCarry);
        System.out.println(nameString + "              " + memberTagCarry);
        pw1.close();
         }
         catch(Exception wads){
           
         }
           File file2 = new File("Sync/logs.txt");
    try{
           FileWriter fw2 = new FileWriter(file2, true);
        PrintWriter pw2 = new PrintWriter(fw2);
          DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 Date date = new Date();
 System.out.println(dateFormat.format(date));
        pw2.println(memberTagCarry + " was added to the DB " + (dateFormat.format(date)));
    
        pw2.close();
    }
    catch(Exception wadsd){
     System.out.println("LOG"); 
    }
    
    
        
         frame.dispose();
         System.exit(0);
         
      }
      
      
      
      
     
      
      
      
          
      
    }
   }

}