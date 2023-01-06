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
//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 //Date date = new Date();
// System.out.println(dateFormat.format(date));

public class multipleRA{
  int x;
  
 
       
  
  JTextField tf1;
   JTextField tf2;
    JTextField tf3;
     JTextField tf4;
      JTextField tf5;
       JTextField tf6;
        JTextField tf7;
         JTextField tf8;
          JTextField tf9;
           JTextField tf10;
           JButton nameCheck;
           JButton finalize;
           JLabel tagCheck1;
           JLabel tagCheck2;
           JLabel tagCheck3;
           JLabel tagCheck4;
           JLabel tagCheck5;
           JLabel tagCheck6;
          
           JLabel tagCheck7;
           JLabel tagCheck8;
           JLabel tagCheck9;
           JLabel tagCheck10;
           
           JLabel image;
  JTextField operation;
  JLabel tag;
       public double multipleRA(){
         
            JFrame frame = new JFrame("Test");
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(750, 500);
       frame.setResizable(false);
       frame.setVisible(true);
       frame.setTitle("B:F A.I.D.S Multiple Registered Absences (BFAIDSMRA)");  
         
       int space = 40;
         tag = new JLabel("Insert tags in text field");
         frame.add(tag);
         tag.setBounds(90, 400, 250, 25);
             tag.setForeground(Color.WHITE);
         nameCheck = new JButton ("Check tags");
         frame.add(nameCheck);
         nameCheck.setBounds(225, 9, 100, 25);
             
       tf1 = new JTextField();
       frame.add(tf1);
       tf1.setBounds(100, 10, 100, 25);
       
         tagCheck1 = new JLabel("Tag required");
         frame.add(tagCheck1);
         tagCheck1.setBounds(10, 10, 100, 25);
            tagCheck1.setForeground(Color.RED);
    
         
        tf2 = new JTextField();
       frame.add(tf2);
       tf2.setBounds(100, 10 + space, 100, 25);
         
            tagCheck2 = new JLabel("Tag required");
         frame.add(tagCheck2);
         tagCheck2.setBounds(10, 10 + space, 100, 25);
            tagCheck2.setForeground(Color.RED);
       
        tf3 = new JTextField();
       frame.add(tf3);
       tf3.setBounds(100, 10+ space+ space, 100, 25);
       
            tagCheck3 = new JLabel("Tag required");
         frame.add(tagCheck3);
         tagCheck3.setBounds(10, 10+ space+ space, 100, 25);
            tagCheck3.setForeground(Color.RED);
         
        tf4 = new JTextField();
       frame.add(tf4);
       tf4.setBounds(100, 10+ space+ space+ space, 100, 25);
       
            tagCheck4 = new JLabel("Tag required");
         frame.add(tagCheck4);
         tagCheck4.setBounds(10, 10+ space+ space+ space, 100, 25);
            tagCheck4.setForeground(Color.RED);
         
        tf5 = new JTextField();
       frame.add(tf5);
       tf5.setBounds(100, 10+ space+ space+ space+ space, 100, 25);
       
            tagCheck5 = new JLabel("Tag required");
         frame.add(tagCheck5);
         tagCheck5.setBounds(10, 10+ space+ space+ space+ space, 100, 25);
            tagCheck5.setForeground(Color.RED);
         
        tf6= new JTextField();
       frame.add(tf6);
       tf6.setBounds(100, 10+ space+ space+ space+ space+ space, 100, 25);
       
            tagCheck6 = new JLabel("Tag required");
         frame.add(tagCheck6);
         tagCheck6.setBounds(10, 10+ space+ space+ space+ space+ space, 100, 25);
            tagCheck6.setForeground(Color.RED);
         
        tf7
          = new JTextField();
       frame.add(tf7);
       tf7.setBounds(100, 10+ space+ space+ space+ space+ space+ space, 100, 25);
       
            tagCheck7 = new JLabel("Tag required");
         frame.add(tagCheck7);
         tagCheck7.setBounds(10, 10+ space+ space+ space+ space+ space+ space, 100, 25);
            tagCheck7.setForeground(Color.RED);
         
        tf8 = new JTextField();
       frame.add(tf8);
       tf8.setBounds(100, 10+ space+ space+ space+ space+ space+ space+ space, 100, 25);
       
            tagCheck8 = new JLabel("Tag required");
         frame.add(tagCheck8);
         tagCheck8.setBounds(10, 10+ space+ space+ space+ space+ space+ space+ space, 100, 25);
            tagCheck8.setForeground(Color.RED);
         
        tf9 = new JTextField();
       frame.add(tf9);
       tf9.setBounds(100, 10+ space+ space+ space+ space+ space+ space+ space+ space, 100, 25);
       
            tagCheck9 = new JLabel("Tag required");
         frame.add(tagCheck9);
         tagCheck9.setBounds(10, 10+ space+ space+ space+ space+ space+ space+ space+ space, 100, 25);
            tagCheck9.setForeground(Color.RED);
         
        tf10 = new JTextField();
       frame.add(tf10);
       tf10.setBounds(100, 10+ space+ space+ space+ space+ space+ space+ space+ space+ space, 100, 25);
       
            tagCheck10 = new JLabel("Tag required");
         frame.add(tagCheck10);
         tagCheck10.setBounds(10, 10+ space+ space+ space+ space+ space+ space+ space+ space+ space, 100, 25);
            tagCheck10.setForeground(Color.RED);
         
         
         operation = new JTextField("Operation name");
         frame.add(operation);
         operation.setBounds(350, 25, 300, 25);
         
         finalize = new JButton("Finalize");
         frame.add(finalize);
         finalize.setBounds(350, 100, 300, 300);
         finalize.setEnabled(false);
         event Action = new event();
          finalize.addActionListener(Action);
         nameCheck.addActionListener(Action);
         
         
        image = new JLabel ();
         image.setIcon(new ImageIcon("bin/res/20190215163621_1.JPG"));
         frame.add(image);
         image.setBounds( -200, -75, 2000, 600);
         
      
         
         
         
        return x; 
       }
       
           public class event implements ActionListener {
         
    public void actionPerformed(ActionEvent Action){
      
      String member1 = tf1.getText();
      String member2 = tf2.getText();
      String member3 = tf3.getText();
      String member4 = tf4.getText();
      String member5 = tf5.getText();
      String member6 = tf6.getText();
      String member7 = tf7.getText();
      String member8 = tf8.getText();
      String member9 = tf9.getText();
      String member10 = tf10.getText();
      String operationString = operation.getText();
        File file = new File("Sync/" + member1 + ".0.txt");
        File file2 = new File("Sync/" + member2 + ".0.txt");
        File file3 = new File("Sync/" + member3 + ".0.txt");
        File file4 = new File("Sync/" + member4 + ".0.txt");
        File file5 = new File("Sync/" + member5 + ".0.txt");
        File file6 = new File("Sync/" + member6 + ".0.txt");
        File file7 = new File("Sync/" + member7 + ".0.txt");
        File file8 = new File("Sync/" + member8 + ".0.txt");
        File file9 = new File("Sync/" + member9 + ".0.txt");
        File file10 = new File("Sync/" + member10 + ".0.txt");
        
          if(Action.getSource()== nameCheck){

             int check = 0;
            
if(file.exists() && !file.isDirectory()) { 
    tagCheck1.setText("Tag acquired");
    tagCheck1.setForeground(Color.GREEN);
System.out.println("exists");
    check++;
            
            
          }
else{
   tagCheck1.setText("Incorrect tag");
    tagCheck1.setForeground(Color.RED);
}
if(file2.exists() && !file2.isDirectory()) { 
    tagCheck2.setText("Tag acquired");
    tagCheck2.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck2.setText("Incorrect tag");
    tagCheck2.setForeground(Color.RED);
}

if(file3.exists() && !file3.isDirectory()) { 
    tagCheck3.setText("Tag acquired");
    tagCheck3.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck3.setText("Incorrect tag");
    tagCheck3.setForeground(Color.RED);
}
if(file4.exists() && !file4.isDirectory()) { 
    tagCheck4.setText("Tag acquired");
    tagCheck4.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck4.setText("Incorrect tag");
    tagCheck4.setForeground(Color.RED);
}
if(file5.exists() && !file5.isDirectory()) { 
    tagCheck5.setText("Tag acquired");
    tagCheck5.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck5.setText("Incorrect tag");
    tagCheck5.setForeground(Color.RED);
}
if(file6.exists() && !file6.isDirectory()) { 
    tagCheck6.setText("Tag acquired");
    tagCheck6.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck6.setText("Incorrect tag");
    tagCheck6.setForeground(Color.RED);
}
if(file7.exists() && !file7.isDirectory()) { 
    tagCheck7.setText("Tag acquired");
    tagCheck7.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck7.setText("Incorrect tag");
    tagCheck7.setForeground(Color.RED);
}
if(file8.exists() && !file8.isDirectory()) { 
    tagCheck8.setText("Tag acquired");
    tagCheck8.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck8.setText("Incorrect tag");
    tagCheck8.setForeground(Color.RED);
}
if(file9.exists() && !file9.isDirectory()) { 
    tagCheck9.setText("Tag acquired");
    tagCheck9.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck9.setText("Incorrect tag");
    tagCheck9.setForeground(Color.RED);
}
if(file10.exists() && !file10.isDirectory()) { 
    tagCheck10.setText("Tag acquired");
    tagCheck10.setForeground(Color.GREEN);
System.out.println("exists");
      check++;
            
            
          }
else{
   tagCheck10.setText("Incorrect tag");
    tagCheck10.setForeground(Color.RED);
}





System.out.println(  check);
if(check == 10){
 finalize.setEnabled(true); 
}

          }
        
        
        
        
        
        
        
        if(Action.getSource()== finalize){
        try{
      FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(" " );
        pw.println("433 " + operationString);
        System.out.println(member1 + "  " + operationString);
        
        
        
        FileWriter fw2 = new FileWriter(file2, true);
        PrintWriter pw2 = new PrintWriter(fw2);
          pw2.println(" " );
        pw2.println("433 " + operationString);
        System.out.println(member2 + "  " + operationString);
        
           FileWriter fw3 = new FileWriter(file3, true);
        PrintWriter pw3 = new PrintWriter(fw3);
          pw3.println(" " );
        pw3.println("433 " + operationString);
        System.out.println(member3 + "  " + operationString);
        
           FileWriter fw4 = new FileWriter(file4, true);
        PrintWriter pw4 = new PrintWriter(fw4);
          pw4.println(" " );
        pw4.println("433 " + operationString);
        System.out.println(member4 + "  " + operationString);
        
           FileWriter fw5 = new FileWriter(file5, true);
        PrintWriter pw5 = new PrintWriter(fw5);
          pw5.println(" " );
        pw5.println("433 " + operationString);
        System.out.println(member5 + "  " + operationString);
        
           FileWriter fw6 = new FileWriter(file6, true);
        PrintWriter pw6 = new PrintWriter(fw6);
          pw6.println(" " );
        pw6.println("433 " + operationString);
        System.out.println(member6 + "  " + operationString);
        
           FileWriter fw7 = new FileWriter(file7, true);
        PrintWriter pw7 = new PrintWriter(fw7);
          pw7.println(" " );
        pw7.println("433 " + operationString);
        System.out.println(member7 + "  " + operationString);
        
           FileWriter fw8 = new FileWriter(file8, true);
        PrintWriter pw8 = new PrintWriter(fw8);
          pw8.println(" " );
        pw8.println("433 " + operationString);
        System.out.println(member8 + "  " + operationString);
        
           FileWriter fw9 = new FileWriter(file9, true);
        PrintWriter pw9 = new PrintWriter(fw9);
          pw9.println(" " );
        pw9.println("433 " + operationString);
        System.out.println(member9 + "  " + operationString);
        
           FileWriter fw10 = new FileWriter(file10, true);
        PrintWriter pw10 = new PrintWriter(fw10);
          pw10.println(" " );
        pw10.println("433 " + operationString);
        System.out.println(member10 + "  " + operationString);
        
        
        pw.close();
        pw2.close();
        pw3.close();
        pw4.close();
        pw5.close();
        pw6.close();
        pw7.close();
        pw8.close();
        pw9.close();
        pw10.close();
           File file11 = new File("Sync/logs.txt");
           
           
           DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 Date date = new Date();
System.out.println(dateFormat.format(date));

    try{
           FileWriter fw11 = new FileWriter(file11, true);
        PrintWriter pw11 = new PrintWriter(fw11);
        pw11.println("Multiple RA's inputed for " + operationString + "  " + (dateFormat.format(date)));
        System.out.println(operationString);
        pw11.close();
    }
    catch(Exception wadsd){
     System.out.println("LOG"); 
    }
        
        }
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        catch(Exception oi){
         System.out.println("Exception");
         
        }
      
      
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    }
         }
}
          