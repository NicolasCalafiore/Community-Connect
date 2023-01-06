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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class addRecord2{
 int y; 
 JTextField tag;
 JButton submit;
 JComboBox selection;
 JTextField info;
 JButton finalize;
 JLabel nameCheck;
 JLabel name;
JLabel rank;
JLabel startDate;
JLabel tagText;
JLabel nameText;
JLabel rankText;
JLabel typeText;
JLabel inputText;
JLabel mainImage;
JLabel recogName;
JLabel recogStructure;

  public double addRecord2(){
    
  
    
       JFrame frame = new JFrame("BFAIDSNDIW");
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(750, 500);
       frame.setResizable(false);
       frame.setVisible(true);
       frame.setTitle("B:F A.I.D.S New Data Input Window (BFAIDSNDIW)");   
    tagText = new JLabel ("Tag: ");
    frame.add(tagText);
    tagText.setBounds(10, 10, 100, 20);
    
      tag = new JTextField();
       frame.add(tag);
      tag.setBounds(60, 12, 100, 20);
      
      
      
      
      typeText = new JLabel("Type:");
      frame.add(typeText);
      typeText.setBounds(8, 100, 100, 20);
      
      nameText = new JLabel("Name: ");
      frame.add(nameText);
      nameText.setBounds(575, 40, 100, 20);
      
        rankText = new JLabel("Rank: ");
      frame.add(rankText);
      rankText.setBounds(575, 60, 100, 20);
       
    submit = new JButton("Submit");
    frame.add(submit);
    submit.setBounds(160, 12, 100, 20);
    
    inputText = new JLabel("Input:");
    frame.add(inputText);
    inputText.setBounds(10, 200, 100, 20);
    
    name = new JLabel ("XXXX");
    frame.add(name);
    name.setBounds(675, 40, 100, 20);
    
    rank = new JLabel ("XXXX");
      frame.add(rank);
      rank.setBounds(675, 60, 100, 20);
    
   selection = new JComboBox();
    selection.addItem("Strike");
    selection.addItem("Recognition");
    selection.addItem("RA");
    selection.addItem("Rank Change");
    selection.addItem("Add Role");
    frame.add(selection);
  selection.setBounds(60, 100, 100, 20);
   selection.setEnabled(false);
    
    info = new JTextField();
    frame.add(info);
    info.setBounds(60, 200, 100, 20);
     info.setEnabled(false);
    
     finalize = new JButton("Finalize");
     frame.add(finalize);
     finalize.setBounds(60, 350, 100, 20);
      finalize.setEnabled(false);
    
    nameCheck = new JLabel("Tag required");
    frame.add(nameCheck);
    nameCheck.setBounds(275, 12, 175, 20);
    nameCheck.setForeground(Color.RED);
    
    
    
    
    
           recogName = new JLabel ("Pilot Ishi");
       frame.add(recogName);
       recogName.setBounds(480, 10, 250, 25);
         recogName.setForeground(Color.BLUE);
         
       int s = 60;
       int si = 10;
         
       recogStructure = new JLabel ("Takistan,                  picking up fallen soldiers for backup");
       frame.add(recogStructure);
       recogStructure.setBounds(425, 10, 350, 25);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
          mainImage = new JLabel ();
    mainImage.setIcon(new ImageIcon("res/adsw.PNG"));
    frame.add(mainImage);
    mainImage.setBounds( -200, -20, 2000, 600);
    
     inputText.setFont(new Font("Arial", Font.BOLD, 15));
      typeText.setFont(new Font("Arial", Font.BOLD, 15));
       tagText.setFont(new Font("Arial", Font.BOLD, 15));
     inputText.setForeground(Color.BLACK);
      typeText.setForeground(Color.BLACK);
       tagText.setForeground(Color.BLACK);
    
    
event Action = new event();
finalize.addActionListener(Action);
submit.addActionListener(Action);
    
    
 return y;  
  }
   
         
  
   
  
  
    public class event implements ActionListener {
      
         
    public void actionPerformed(ActionEvent Action){
        if(Action.getSource()== submit){
           String tagString = tag.getText();
           
        File f = new File("Sync/" + tagString + ".0.txt");
if(f.exists() && !f.isDirectory()) { 
    nameCheck.setText("Record acquired");
    nameCheck.setForeground(Color.GREEN);
    info.setEnabled(true);
    finalize.setEnabled(true);
    selection.setEnabled(true);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   String nameLog;
    
    
    
    
    
    
     try (Stream<String> stream = Files.lines(Paths.get("Sync/"+tagString + ".0.txt"))) {

     try{
      Scanner scanner = new Scanner(new File("Sync/"+tagString + ".0.txt"));


 String line = "";
   while(scanner.hasNext()){
     String lineOfText = scanner.nextLine();
     
     if (lineOfText.startsWith("001")) {
          lineOfText = lineOfText.substring(3);
          nameLog = lineOfText;
       System.out.println(lineOfText);
       System.out.println("123");
       name.setText(lineOfText);
   
     }
     if (lineOfText.startsWith("202")) {
          lineOfText = lineOfText.substring(3);
       System.out.println(lineOfText);
       System.out.println("123");
       rank.setText(lineOfText);
   
     }
   }
     }catch(Exception e) {
    System.out.println("123"); 
   }//Catch
  
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("124"); 
    }
    
    
}
else{
 nameCheck.setText("Record does not exist!");
  nameCheck.setForeground(Color.RED);
}
          
          
        }
      
      
        if(Action.getSource()== finalize){
           nameCheck.setText("Tag required");
            nameCheck.setForeground(Color.RED);
    info.setEnabled(false);
    finalize.setEnabled(false);
    selection.setEnabled(false);
          
      String identifier = ("");
      
  System.out.println("clicked");
  String infoString = info.getText();
  String tagString = tag.getText();
  String lol = selection.getSelectedItem().toString();  
  
  
      if(lol.equals("Strike")){
       System.out.println("Strike"); 
     identifier = ("111");
       
      }
          if(lol.equals("Recognition")){
       System.out.println("Recognition"); 
       identifier = ("999");
      }
                   if(lol.equals("RA")){
       System.out.println("RA"); 
         identifier = ("433");
      }
                            if(lol.equals("Rank Change")){
       System.out.println("Rank Change"); 
       identifier = ("202");
      }
                            
      
               if(lol.equals("Add Role")){
       System.out.println("Add Role"); 
       identifier = ("756");
      }
      
      
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 Date date = new Date();
 System.out.println(dateFormat.format(date));
                  File file1 = new File("Sync/logs.txt");
    try{
           FileWriter fw1 = new FileWriter(file1, true);
        PrintWriter pw1 = new PrintWriter(fw1);
        pw1.println(tagString + "s file was edited " + (dateFormat.format(date)) );
        System.out.println(tagString);
        pw1.close();
    }
    catch(Exception wadsd){
     System.out.println("LOG"); 
    }
    
    
    
    
     File file = new File("Sync/" + tagString + ".0.txt");
    try{
      FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(" ");
        pw.println(identifier + " " + infoString);
        pw.close();
        System.out.println(identifier + " " + infoString);
    }
    catch(Exception loa){
     System.out.println("ERROR"); 
    }
        
      
      
      
      
      
      
      
      
      
      
    }
      
      
    }
    }
  
  
  
  
}