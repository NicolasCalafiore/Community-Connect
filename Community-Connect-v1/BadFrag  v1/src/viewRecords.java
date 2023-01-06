
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 //Date date = new Date();
// System.out.println(dateFormat.format(date));


public class viewRecords{
  int x;
   JFrame frame;
   JLabel mainImage; 
   JLabel tagText;
   JTextField tagTextField;
   JTextArea absencesText;
JTextArea strikeTextArea;
JTextArea recognitionsTextArea;
JTextArea notesTextArea;
JScrollPane recognitionsScroll;
   JScrollPane absencesScroll;
   JScrollPane strikesScroll;
   JScrollPane notesScroll;
     JScrollPane pRanksScroll;
   JLabel creditForPlane;
   JLabel roach;
   JLabel absencesText1;
   JLabel strikesText;
   String nameLog;
   JLabel memberStartDate;
   JLabel recognitionsText;
   JLabel notesText;
   int strikeCountOutput;
   JLabel name;
   JLabel rank;
   JTextArea pRanks;
   JLabel memberStartDateText;
   int fieldCount = 1;
   JLabel pRanksText;
   JButton finishButton;
   JLabel strikeCount;
   String tagName;
    public double viewRecords(){
       JFrame frame = new JFrame("Test");
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setLayout(null);
       frame.setSize(750, 500);
       frame.setResizable(false);
       frame.setVisible(true);
       frame.setTitle("B:F A.I.D.S Records Request (BFAIDSRR)");   
    //____________________WINDOW___________________________________
       
       memberStartDateText = new JLabel("Start date: ");
       frame.add(memberStartDateText);
       memberStartDateText.setBounds(585, 100, 100, 100);
       
       pRanksText = new JLabel ("Roles:");
       frame.add(pRanksText);
       pRanksText.setBounds(595, 128, 100, 100);
       
       pRanks = new JTextArea("");
       frame.add(pRanks);
       pRanks.setBounds(655, 170, 90, 20);
       pRanks.setEditable(false);
       
               
        pRanksScroll = new JScrollPane (pRanks);
        frame.add(pRanksScroll);
        pRanksScroll.setBounds(645, 170, 90, 20);
        pRanksScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

       
memberStartDate = new JLabel ("yyyy/mm/dd");
frame.add(memberStartDate);
memberStartDate.setBounds(650, 100, 100, 100);
 
    
      tagText = new JLabel ("Tag # :");
      frame.add(tagText);
      tagText.setBounds(10, 10, 100, 20);
      tagText.setForeground(Color.BLACK);
      tagText.setFont(new Font("Arial", Font.BOLD, 18));
      
       tagTextField = new JTextField (3);
       frame.add(tagTextField);
       tagTextField.setBounds(80, 10, 100, 20);
        
       event Action = new event();
       tagTextField.addActionListener(Action);

        
        absencesText = new JTextArea ();
        frame.add(absencesText);
        absencesText.setBounds(30, 275, 100, 100);
        absencesText.setRows(25);
        absencesText.setColumns(25);
        absencesText.setWrapStyleWord(true);
        absencesText.setEditable(false);

    
        
        absencesScroll = new JScrollPane (absencesText);
        frame.add(absencesScroll);
        absencesScroll.setBounds(25, 120, 150, 300);
        absencesScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        
         creditForPlane = new JLabel("Picture: Takistan, Pilot              warming up");
         frame.add(creditForPlane);
         creditForPlane.setBounds (500, 10, 350, 25);
         creditForPlane.setForeground(Color.BLACK);
      
         roach = new JLabel ("Roach");
         frame.add(roach);
         roach.setBounds(630, 10, 350, 25);
         roach.setForeground(Color.BLUE);
    
         absencesText1 = new JLabel ("Registered Absences: ");
         frame.add(absencesText1);
         absencesText1.setBounds(25, 50, 120, 100);
         absencesText1.setForeground(Color.BLACK);
         absencesText1.setFont(new Font("B612", Font.BOLD, 10));
         
         JLabel strikesText = new JLabel("Strikes: ");
         frame.add(strikesText);
         strikesText.setBounds(225, 50, 120, 100);
         
            JLabel recognitionsText = new JLabel("Recognitions : ");
         frame.add(recognitionsText);
         recognitionsText.setBounds(425, 50, 120, 100);
         //_________________________________
            strikeTextArea = new JTextArea ();
        frame.add(strikeTextArea);
        strikeTextArea.setBounds(225, 275, 100, 300);
        strikeTextArea.setRows(25);
        strikeTextArea.setColumns(25);
        strikeTextArea.setWrapStyleWord(true);
        strikeTextArea.setEditable(false);

    
        
      strikesScroll = new JScrollPane (strikeTextArea);
        frame.add(strikesScroll);
        strikesScroll.setBounds(225, 120, 150, 300);
        strikesScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); 
          //_______________________________
        
         recognitionsTextArea = new JTextArea ();
        frame.add(recognitionsTextArea);
        recognitionsTextArea.setBounds(420, 275, 100, 300);
        recognitionsTextArea.setRows(25);
        recognitionsTextArea.setColumns(25);
        recognitionsTextArea.setWrapStyleWord(true);
        recognitionsTextArea.setEditable(false);

    
        
      recognitionsScroll = new JScrollPane (recognitionsTextArea);
        frame.add(recognitionsScroll);
        recognitionsScroll.setBounds(420, 120, 150, 300);
        recognitionsScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); 
        
        
        
       /* notesTextArea = new JTextArea ("");
        frame.add(notesTextArea);
        notesTextArea.setBounds(570, 120, 175, 300);
        notesTextArea.setRows(25);
        notesTextArea.setColumns(25);
        notesTextArea.setWrapStyleWord(true);
        notesTextArea.setEditable(false);
        
        
        notesText = new JLabel ("Notes");
        frame.add(notesText);
      notesText.setBounds(640, 50, 120, 100);
        
        notesScroll = new JScrollPane (notesTextArea);
        frame.add(notesScroll);
        notesScroll.setBounds(570, 120, 175, 300);
        notesScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); 
        
        
        
        */
        
        
        name = new JLabel ("NAME");
        frame.add(name);
        name.setBounds(200, 10, 135, 20);
            name.setFont(new Font("Arial", Font.BOLD, 10));
        
        rank = new JLabel("RANK");
        frame.add(rank);
        rank.setBounds(300, 10, 135, 20);
            rank.setFont(new Font("Arial", Font.BOLD, 10));
        
         mainImage = new JLabel ();
         mainImage.setIcon(new ImageIcon("bin/res/20190302144658_1.JPG"));
         frame.add(mainImage);
         mainImage.setBounds( -200, 1, 2000, 600);
         
         
         
      
       return x;
    }
    public class event implements ActionListener { //_________________________________
         
    public void actionPerformed(ActionEvent Action){
      
       if(Action.getSource()== tagTextField){
         
                 System.out.println("S");
    recognitionsTextArea.setText(null);
    strikeTextArea.setText(null);
   absencesText.setText(null);
   
         
      System.out.println("Clicked");
      pRanks.setText("");
      String searchObject = tagTextField.getText();
      try (Stream<String> stream = Files.lines(Paths.get("Sync/"+searchObject + ".0.txt"))) {

     try{
      Scanner scanner = new Scanner(new File("Sync/"+searchObject + ".0.txt"));


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
    System.exit(0); 
   }//Catch
        List<String> abc = stream.filter(str->str.startsWith("433"))
        .map(s->s.split("433")[1]).collect(Collectors.toList());

        System.out.println(abc);    // A C Z
      //   absencesText.append(abc);
      
         for (String string : abc)
  absencesText.append(string + "\n");
           
           
    } catch (IOException e) {
      e.printStackTrace();
    }//___________________________________________________________________________
    try (Stream<String> stream = Files.lines(Paths.get("Sync/" + searchObject + ".0.txt"))) {
      

        List<String> strikeOutput = stream.filter(str->str.startsWith("111"))
        .map(s->s.split("111")[1]).collect(Collectors.toList());

        System.out.println(strikeOutput);
        // A C Z
      //   absencesText.append(abc);
      
         for (String string : strikeOutput)
     
  strikeTextArea.append(string + "\n" );
         
           

    } catch (IOException e) {
      e.printStackTrace();
    }//_______________________________________________________________________
    
      try (Stream<String> stream = Files.lines(Paths.get("Sync/" + searchObject + ".0.txt"))) {

        List<String> recognitionOutput = stream.filter(str->str.startsWith("999"))
        .map(s->s.split("999")[1]).collect(Collectors.toList());

        System.out.println(recognitionOutput);    // A C Z
      //   absencesText.append(abc);
      
         for (String string : recognitionOutput)
  recognitionsTextArea.append(string + "\n");
           
           
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
     try (Stream<String> stream = Files.lines(Paths.get("Sync/" + searchObject + ".0.txt"))) {

        List<String> notesOutput = stream.filter(str->str.startsWith("511"))
        .map(s->s.split("511")[1]).collect(Collectors.toList());

        System.out.println(notesOutput);    // A C Z
      //   absencesText.append(abc);
      
         for (String string : notesOutput)
  notesTextArea.append(string + "\n");
           
           
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
    
     try (Stream<String> stream = Files.lines(Paths.get("Sync/" + searchObject + ".0.txt"))) {

        List<String> memberStartDateOutput = stream.filter(str->str.startsWith("000"))
        .map(s->s.split("000")[1]).collect(Collectors.toList());

        System.out.println(memberStartDateOutput);    // A C Z
      //   absencesText.append(abc);
      
         for (String string : memberStartDateOutput)
  memberStartDate.setText(string + "\n");
           
           
    } catch (IOException e) {
      e.printStackTrace();
    }
    

    
    
    try (Stream<String> stream = Files.lines(Paths.get("Sync/" + searchObject + ".0.txt"))) {

        List<String> pRanksOutput = stream.filter(str->str.startsWith("756"))
        .map(s->s.split("756")[1]).collect(Collectors.toList());

        System.out.println(pRanksOutput);    // A C Z
      //   absencesText.append(abc);
      
         for (String string : pRanksOutput)
  pRanks.append(string + "\n");
           
           
    } catch (IOException e) {
      e.printStackTrace();
    }
    pRanks.setCaretPosition(0); 

    
    

    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
 
    
    
      
       }//TagTextField
     
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 Date date = new Date();
 System.out.println(dateFormat.format(date));
 
    File file = new File("Sync/logs.txt");
    try{
           FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(nameLog + "'s record was viewed " + (dateFormat.format(date)) );
        System.out.println(nameLog);
        pw.close();
    }
    catch(Exception wadsd){
     System.out.println("LOG"); 
    }

    }
    
   
        
       }//ACTION LISTENER
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
       