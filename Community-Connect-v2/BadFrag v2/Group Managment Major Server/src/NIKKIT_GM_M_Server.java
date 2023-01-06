import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;


import java.util.stream.Collectors;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.io.*;
import java.text.*;
import java.util.*;
import java.net.*;
  

public class NIKKIT_GM_M_Server 
{
    public static void main(String[] args) throws IOException 
    {
        // server is listening on port 5056
        ServerSocket ss = new ServerSocket(1234);
          
        // running infinite loop for getting
        // client request
        while (true) 
        {
            Socket s = null;
              
            try 
            {
                // socket object to receive incoming client requests
                s = ss.accept();
                  
                System.out.println("A new client is connected : " + s);
                  
                // obtaining input and out streams
               // DataInputStream dis = new DataInputStream(s.getInputStream());
               // DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                
          
                InputStreamReader inputStreamReader = new InputStreamReader(s.getInputStream());
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(s.getOutputStream());
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
                  
                System.out.println("Assigning new thread for this client");
  
               
                Thread t = new ClientHandler(s, bufferedReader, bufferedWriter);
                System.out.println("Thread: " + t + " assaigned");
               
                t.start();
                  
            }
            catch (Exception e){
                s.close();
                
                e.printStackTrace();  
            }
        }
        


        
        
        
    }
    
}
  

// ClientHandler class
class ClientHandler extends Thread 
{
    DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat fortime = new SimpleDateFormat("hh:mm:ss");
    final Socket s;
    final BufferedReader bufferedReader;
    final BufferedWriter bufferedWriter;
    
  
    // Constructor
    public ClientHandler(Socket s, BufferedReader bufferedReader, BufferedWriter bufferedWriter) 
    {
        this.s = s;
        this.bufferedWriter = bufferedWriter;
        this.bufferedReader = bufferedReader;
    }
  
    @Override
    public void run() 
    {
        String received;
        String toreturn;
        while (true) 
        {
            try {
            	
            	
  
            	 String messageFromClient = bufferedReader.readLine();
     		    System.out.println("Raw Message From Client: " + messageFromClient);
     		    	
     		    
     		    
     		    
     		    
     		    
     		    
     		    
     
     		    
     		    
     		    
     		    
     		    
     	    	if(messageFromClient.equals("sysSet")) {//---------------------------System Edits Start----------------------------------------------------------------------
     	    		System.out.println("System Settings Accessed");
     	    		
     	    		String systemSettingsTarget = bufferedReader.readLine();
     	    		
     	    		if(systemSettingsTarget.equals("rankReset")) {
     	    			System.out.println("System Preset Rank Edit Accessed");
     	    			
     					Path path = Paths.get("Resources/sysSet.txt");
     					Charset charset = StandardCharsets.UTF_8;
     					
     					String content = new String(Files.readAllBytes(path), charset);
     					content = content.replaceAll("presetRank: ", "ARCHIVED_PRESET_RANK ");
     					Files.write(path, content.getBytes(charset));
     	    			
     	    			
     	    			while(true) {
     	    			String newRank = bufferedReader.readLine();
     	    			if(!newRank.equals("END_EDIT") && !newRank.equals("")) {
     	    				

     	    				
     	    				System.out.println("New Rank Added: " + newRank);
     						try {
     						      FileWriter myWriter = new FileWriter("Resources/sysSet.txt",true);
     						      myWriter.write("presetRank: " + newRank);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.close();

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
     	    				
     	    				
     	    			}
     	    			else if(newRank.equals("END_EDIT")){
     	    				break;
     	    			}
     	    			
     	    			
     	    			
     	    			
     	    			}
         				System.out.println("System Preset Rank Edit Complete");
     	    		}
     	    		
     	    		if(systemSettingsTarget.equals("roleReset")) {
     	    			System.out.println("System Preset Role Edit Accessed");
     	    			
     					Path path = Paths.get("Resources/sysSet.txt");
     					Charset charset = StandardCharsets.UTF_8;
     					
     					String content = new String(Files.readAllBytes(path), charset);
     					content = content.replaceAll("presetRole: ", "ARCHIVED_PRESET_ROLE ");
     					Files.write(path, content.getBytes(charset));
     					
     					
     	    			while(true) {
     	    			String newRole = bufferedReader.readLine();
     	    			if(!newRole.equals("END_EDIT") && !newRole.equals("")) {
     	    				

     	    				
     	    				System.out.println("New Role Added: " + newRole);
     						try {
     						      FileWriter myWriter = new FileWriter("Resources/sysSet.txt",true);
     						      myWriter.write("presetRole: " + newRole);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.close();

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
     	    				
     	    				
     	    			}
     	    			else if(newRole.equals("END_EDIT")){
     	    				break;
     	    			}
     	    			
     	    			
     	    			
     	    			
     	    			}
     	    			
     	    			
     	    		}
     	    		
     	    		if(systemSettingsTarget.equals("MIPcalendarFunction")){
     	    			String MIPfunction = bufferedReader.readLine();
     	    			
     	    			if(MIPfunction.equals("false")) {
								Path path = Paths.get("Resources/SysSet.txt");
								Charset charset = StandardCharsets.UTF_8;
								
								String content = new String(Files.readAllBytes(path), charset);
								content = content.replaceAll("MIPcalendarFunction true","MIPcalendarFunction false");
								Files.write(path, content.getBytes(charset));
								}
     	    			if(MIPfunction.equals("true")) {
     	   				Path path = Paths.get("Resources/SysSet.txt");
						Charset charset = StandardCharsets.UTF_8;
						
						String content = new String(Files.readAllBytes(path), charset);
						content = content.replaceAll("MIPcalendarFunction false","MIPcalendarFunction true");
						Files.write(path, content.getBytes(charset));
     	    			}
     	    			
     	    			
     	    		}
     	
     	    	}//-----------------------------------------------------------------System Edits End--------------------------------------------------------------------------
     	    	
     	    	if(messageFromClient.equals("sysSetRequest")) {//---------------System Settings Request Start----------------------------------------------------------------
     	    		
     	    		
     				try (Stream<String> stream = Files.lines(Paths.get("Resources/sysSet.txt"))) {

     			        List<String> abc = stream.filter(str->str.startsWith("presetRank: "))
     			                                 .map(s->s.split("presetRank: ")[1]).collect(Collectors.toList());

     			        System.out.println("System Preset Rank Located: " + abc);    
     			        
     			        String SystemRank = String.join(",", abc);
     			        
     		    		bufferedWriter.write("SysSet");
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		bufferedWriter.write("rankSysSet");
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		bufferedWriter.write(SystemRank);
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		System.out.println("Sent:" + SystemRank);
     		    		
     		    		
     		    		
     		    		
     		    		

     			    } catch (IOException e) {
     			        e.printStackTrace();
     			    }
     				
     				try (Stream<String> stream = Files.lines(Paths.get("Resources/sysSet.txt"))) {

     			        List<String> abc = stream.filter(str->str.startsWith("presetRole: "))
     			                                 .map(s->s.split("presetRole: ")[1]).collect(Collectors.toList());

     			        System.out.println("System Preset Role Located: " + abc);    
     			        
     			        String SystemRank = String.join(",", abc);
     			        
     		    		bufferedWriter.write("SysSet");
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		bufferedWriter.write("roleSysSet");
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		bufferedWriter.write(SystemRank);
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		System.out.println("Sent:" + SystemRank);
     		    		
     		    		
     		    		
     		    		
     		    		

     			    } catch (IOException e) {
     			        e.printStackTrace();
     			    }
     	    		
     	 			String option1 = "";
     				String option2 = "";
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/noticeBoardVariableTitles.txt"))) {
     	 			    String line;
     	 			  
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     	 			    	if(line.startsWith("option1: ")) {
     	 			    		option1 = line.replace("option1: ", "");
     	 			    	}
     	 			    	if(line.startsWith("option2: ")) {
     	 			    		option2 = line.replace("option2: ", "");
     	 			    	}

     	 			    }
     	 			    }
     	 			
     	 			
    				String MIPcalendarFunction = "";
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/sysSet.txt"))) {
     	 			    String line;
     	 			    while ((line = br.readLine()) != null) {
     	 			    	System.out.println("SysSet line: " + line);
     	 			    	if(line.startsWith("MIPcalendarFunction ")) {
     	 			    		MIPcalendarFunction = line.replace("MIPcalendarFunction ", "");
     	 			    		break;
     	 			    	}
     	 			    	
     	 			    }
     	 			    }
     	 			
     	 			
         			bufferedWriter.write("systemSettingsOptionsRequest");
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(option1);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(option2);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(MIPcalendarFunction);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				System.out.println("Option1: " + option1);
     				System.out.println("Option2: " + option2);
     				System.out.println("MIPcalendarFunction: " + MIPcalendarFunction);
 
     	    		
     	    	}//-------------------------------------------------------------System Settings Request Start-------------------------------------------------------------------
     		    	
     	    	
     	    	if(messageFromClient.equals("sysSetRequest_specific_rank")) {//-Request For Rank Combo Start ------------------------------------------------------------------
     				try (Stream<String> stream = Files.lines(Paths.get("Resources/sysSet.txt"))) {

     			        List<String> abc = stream.filter(str->str.startsWith("presetRank: "))
     			                                 .map(s->s.split("presetRank: ")[1]).collect(Collectors.toList());

     			        System.out.println("System Preset Rank Located: " + abc);    
     			        
     			        String SystemRank = String.join(",", abc);
     			        
     			       bufferedWriter.write("dataRequest");
    					bufferedWriter.newLine();
    					bufferedWriter.flush();
     					
     		    		bufferedWriter.write("rankComboAdd");
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		bufferedWriter.write(SystemRank);
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		System.out.println("Sent:" + SystemRank);
     		    		
     		    		

     			    } catch (IOException e) {
     			        e.printStackTrace();
     			    }
     	    	}//-------------------------------------------------------------Request For Rank Combo End ---------------------------------------------------------------------
     	    	
     	    	if(messageFromClient.equals("sysSetRequest_specific_role")) {
     	    		try (Stream<String> stream = Files.lines(Paths.get("Resources/sysSet.txt"))) {

     			        List<String> abc = stream.filter(str->str.startsWith("presetRole: "))
     			                                 .map(s->s.split("presetRole: ")[1]).collect(Collectors.toList());

     			        System.out.println("System Preset Role Located: " + abc);    
     			        
     			        String SystemRank = String.join(",", abc);
     			        
     					bufferedWriter.write("dataRequest");
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		bufferedWriter.write("roleComboAdd");
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		bufferedWriter.write(SystemRank);
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     		    		System.out.println("Sent:" + SystemRank);
     		    		
     		    		

     			    } catch (IOException e) {
     			        e.printStackTrace();
     			    }
     	    	}
     	    	
     	    	if(messageFromClient.equals("additionRequest")) {
     	    		
     	    		
     	    		System.out.println("Addition System Accessed");
     	    		String memberNameToAdd = bufferedReader.readLine();
     	    		String memberNikkitUsername = bufferedReader.readLine();
     	    		String memberRankToAdd = bufferedReader.readLine();
     	    		String memberDateToAdd = bufferedReader.readLine();
     	    		String memberNikkitPassword = bufferedReader.readLine();
     	    		String memberNikkitEmail = bufferedReader.readLine();
     	    		String memberRole = bufferedReader.readLine();
     	    		System.out.println("Name: " + memberNameToAdd);
     	    		System.out.println("Nikkit Username: " + memberNikkitUsername);
     	    		System.out.println("Rank: " + memberRankToAdd);
     	    		System.out.println("Date: " + memberDateToAdd);
     	    		System.out.println("Nikkit password: " + memberNikkitPassword);
     	    		System.out.println("Nikkit Email: " + memberNikkitEmail);
     	    		System.out.println("Role: " + memberRole);
     	    		
     	    		int twoStepCheck = 0;
     	    		
     	    		 File f = new File("Database/" + memberNameToAdd + ".txt");
     	    		 File d = new File("NIKKIT_Users/" + memberNikkitUsername + ".txt");
     	    	        if (f.exists() || d.exists()) {
     	    	        	
     	    	        	if (f.exists()) {
     	    	    		bufferedWriter.write("console_Appendation");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				

     	    	    		bufferedWriter.write("Member Name " + memberNameToAdd + " already exists");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();}
     	    	        	
     	    	        	
     	    	        	
     	    	        	if(d.exists()) {
     		    	    		bufferedWriter.write("console_Appendation");
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();
     		    				

     		    	    		bufferedWriter.write("NIKKIT  Username " + memberNikkitUsername + " already exists");
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();}
     	    	        	}
     	    	        else {
     	    	        	System.out.println("Good");
     	    	        	
     					      File myObj = new File("Database/" + memberNameToAdd + ".txt");
     					      if (myObj.createNewFile()) {
     								try {
     								      FileWriter myWriter = new FileWriter("Database/" + memberNameToAdd + ".txt");
     								      myWriter.write("NameID: " + memberNameToAdd);
     								      myWriter.write(System.getProperty( "line.separator" ));
     								      myWriter.write("RankID: " + memberRankToAdd);
     								      myWriter.write(System.getProperty( "line.separator" ));
     								      myWriter.write("DateID: " + memberDateToAdd);
     								      myWriter.write(System.getProperty( "line.separator" ));
     								      myWriter.write("RoleID: " + memberRole);
     								      myWriter.write(System.getProperty( "line.separator" )); 
     								      myWriter.write("NIKKITLINK: " + memberNikkitUsername);
     								      myWriter.write(System.getProperty( "line.separator" )); 
     								      myWriter.close();
     								    } catch (IOException e) {
     								      System.out.println("An error occurred.");
     								      e.printStackTrace();
     								    }
     					      }

     	    	        	
     	    	        	
     					      File file = new File("NIKKIT_Users/" + memberNikkitUsername + ".txt");
     					      
     						    //Create the file
     						    if (file.createNewFile())
     						    {
     						        System.out.println("File is created!");
     						        FileWriter myWriter = new FileWriter("NIKKIT_Users/" + memberNikkitUsername + ".txt");
     							      myWriter.write("NIKKITUSER: " + memberNikkitUsername);
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.write("NIKKITEMAIL: " + memberNikkitEmail);
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.write("NIKKITPASSWORD: " + memberNikkitPassword);
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.write("NIKKITRegisteredUser: " + memberNameToAdd);
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.close();
     						        
     						        
     						        
     						    } else {
     						        System.out.println("File already exists.");
     						    }
     						    
     						    
     						    
     						    
     						    
     							try {
     							      FileWriter myWriter = new FileWriter("Resources/dataBaseFullRecordsRaw.txt", true);
     							      myWriter.write("Name: " + memberNameToAdd + " ");
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.write(memberNameToAdd + " Absences 0");
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.write(memberNameToAdd + " Warnings 0");
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.write(memberNameToAdd + " Commendations 0");
     							      myWriter.write(System.getProperty( "line.separator" )); 
     							      myWriter.write(memberNameToAdd + " Notes 0");
     							      myWriter.write(System.getProperty( "line.separator" )); 
     							      myWriter.close();
     							    } catch (IOException e) { 
     							      System.out.println("An error occurred.");
     							      e.printStackTrace();
     							    }

     						    
     						    try {
     							      FileWriter myWriter = new FileWriter("Resources/systemlogsData.txt", true);
     							      myWriter.write( memberDateToAdd + " - Member Added: " + memberNameToAdd);
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.close();
     							    } catch (IOException e) {
     							      System.out.println("An error occurred.");
     							      e.printStackTrace();
     							    }
     						    
     						    
     							try {
       						      FileWriter myWriter = new FileWriter("Resources/messageCenter.txt",true);
       						      myWriter.write(memberNameToAdd + ":0");
       						      myWriter.write(System.getProperty( "line.separator" ));
       						      myWriter.close();

       						    } catch (IOException e) {
       						      System.out.println("An error occurred.");
       						      e.printStackTrace();
       						    }
     						    
     						    
     	    	        	
     		    	        	
     			    	    		bufferedWriter.write("console_Appendation");
     			    				bufferedWriter.newLine();
     			    				bufferedWriter.flush();
     			    				

     			    	    		bufferedWriter.write("Member Successfully Added To Database");
     			    				bufferedWriter.newLine();
     			    				bufferedWriter.flush();
     	    	        	
     				    		      File myObj3 = new File("messageCenter/" + memberNameToAdd + ".txt");
     	 						      myObj.createNewFile();
     	    	        	
     	    	        	
     	    	        }//Good
     	    	        

     	    		
     	    		
     	    	}//Addition End
     	    	
     	    	if(messageFromClient.equals("searchRequest")) {
     	    		String searchTarget = bufferedReader.readLine();
     	    		
     	    		  File f = new File("Database/" + searchTarget + ".txt");

     	    	        if (f.exists()) {
     	    	        	
     	    	        	String  NikkitUsername = "Error";
     	    	    		bufferedWriter.write("console_Appendation");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				

     	    	    		bufferedWriter.write("Member File Located");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				
     	    				
     	    				
     	    				
     	    				
     	    				
     	    				
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("RankID: "))
     	    			                                 .map(s->s.split("RankID: ")[1]).collect(Collectors.toList());

     	    			        String targetActiveRank = abc.toString();
     	    			        System.out.println("Rank Located: " + targetActiveRank);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_rankData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetActiveRank);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    				
     	    				
     	    				
     	    				
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("DateID: "))
     	    			                                 .map(s->s.split("DateID: ")[1]).collect(Collectors.toList());

     	    			        String targetActiveDate = abc.toString();
     	    			        System.out.println("Date Located: " + targetActiveDate);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_dateData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetActiveDate);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    				
     	    				
     	    				
     	    				
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("RoleID: "))
     	    			                                 .map(s->s.split("RoleID: ")[1]).collect(Collectors.toList());

     	    			        String targetActiveRole = abc.toString();
     	    			        System.out.println("Role Located: " + targetActiveRole);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_roleData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetActiveRole);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    				
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("NIKKITLINK: "))
     	    			                                 .map(s->s.split("NIKKITLINK: ")[1]).collect(Collectors.toList());

     	    			         NikkitUsername = abc.toString();
     	    			         NikkitUsername = NikkitUsername.replace("[", "");
     	    			         NikkitUsername = NikkitUsername.replace("]", "");
     	    			        System.out.println("Nikkit Located: " + NikkitUsername);    
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_nikkitData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(NikkitUsername);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    			        

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    				
     	    				
     	    				try (Stream<String> stream = Files.lines(Paths.get("NIKKIT_Users/" + NikkitUsername + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("NIKKITEMAIL: "))
     	    			                                 .map(s->s.split("NIKKITEMAIL: ")[1]).collect(Collectors.toList());

     	    			         String NIKKITEMAIL = abc.toString();
     	    			        System.out.println("Nikkit Email: " + NIKKITEMAIL);   
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_emailData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(NIKKITEMAIL);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    			        

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    				
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("loggedAbsence: "))
     	    			                                 .map(s->s.split("loggedAbsence: ")[1]).collect(Collectors.toList());

     	    			        String targetAbsences = abc.toString();
     	    			        System.out.println("Absences Located: " + targetAbsences);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_absenceData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetAbsences);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     		    	        
     		    	        
     		    	        
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("loggedWarning: "))
     	    			                                 .map(s->s.split("loggedWarning: ")[1]).collect(Collectors.toList());

     	    			        String targetWarnings = abc.toString();
     	    			        System.out.println("Absences Located: " + targetWarnings);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_warningData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetWarnings);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     		    	        
     		    	        
     		    	        
     		    	        
     		    	        
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("loggedComm: "))
     	    			                                 .map(s->s.split("loggedComm: ")[1]).collect(Collectors.toList());

     	    			        String targetWarnings = abc.toString();
     	    			        System.out.println("Comms Located: " + targetWarnings);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_commsData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetWarnings);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    				
     	    				
     	    				
     	    				
     	    				
     	      				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("loggedNote: "))
     	    			                                 .map(s->s.split("loggedNote: ")[1]).collect(Collectors.toList());

     	    			        String targetWarnings = abc.toString();
     	    			        System.out.println("Notes Located: " + targetWarnings);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_notesData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetWarnings);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	      				
     	      				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("loggedAbsenceDate: "))
     	    			                                 .map(s->s.split("loggedAbsenceDate: ")[1]).collect(Collectors.toList());

     	    			        String targetAbsenceDates = abc.toString();
     	    			        System.out.println("Absence Dates Located: " + targetAbsenceDates);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_absenceDateData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetAbsenceDates);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	      				
     	      				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("loggedWarningDate: "))
     	    			                                 .map(s->s.split("loggedWarningDate: ")[1]).collect(Collectors.toList());

     	    			        String targetWarningDates = abc.toString();
     	    			        System.out.println("Warning Dates Located: " + targetWarningDates);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_warningDateData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetWarningDates);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	      				
     	      				
     	      				
     	      				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("loggedCommDate: "))
     	    			                                 .map(s->s.split("loggedCommDate: ")[1]).collect(Collectors.toList());

     	    			        String targetCommDates = abc.toString();
     	    			        System.out.println("Comm Dates Located: " + targetCommDates);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_commDateData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetCommDates);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	      				
     	      				try (Stream<String> stream = Files.lines(Paths.get("Database/" + searchTarget + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("loggedNoteDate: "))
     	    			                                 .map(s->s.split("loggedNoteDate: ")[1]).collect(Collectors.toList());

     	    			        String targetNoteDates = abc.toString();
     	    			        System.out.println("Notes Dates Located: " + targetNoteDates);    
     	    			        
     	    			        
     	    		    		bufferedWriter.write("dataRequest");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write("search_noteDateData");
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		bufferedWriter.write(targetNoteDates);
     	    					bufferedWriter.newLine();
     	    					bufferedWriter.flush();
     	    					
     	    		    		System.out.println("Sent:" + abc);
     	    		    		
     	    		    		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	      				
     	      				
     	      				
     	      				
     	      				
     	    				
     	    				
     	    				
     	    	        }
     	    	        else {
     	    	    		bufferedWriter.write("console_Appendation");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				

     	    	    		bufferedWriter.write("Member Is Not Active In Database");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    	        }
     	    	        
     	    	        
     	    	        
     	    	        
         				
         				
         				
         				
         				
         				
     	    	        
     	    	        
     	    	        
     	    	        
     	    		
     	    	}
     	    	if(messageFromClient.equals("edit_check_request")) {
     	    	
     	    		String target =  bufferedReader.readLine();
     	    		
     	    		File f = new File("Database/" + target + ".txt");
     	    		
     	    		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
     	    		  LocalDateTime now = LocalDateTime.now();  
     	    		  System.out.println(dtf.format(now));  

         	        if (f.exists()) {
         	    		bufferedWriter.write("console_Appendation");
         				bufferedWriter.newLine();
         				bufferedWriter.flush();
         				

         	    		bufferedWriter.write("File Located");
         				bufferedWriter.newLine();
         				bufferedWriter.flush();
         				
     				    try {
     					      FileWriter myWriter = new FileWriter("Resources/systemlogsData.txt", true);
     					      myWriter.write(dtf.format(now) + " - Member Edited: " + target);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.close();
     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    }
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("RankID: "))
         			                                 .map(s->s.split("RankID: ")[1]).collect(Collectors.toList());

         			        String targetActiveRank = abc.toString();
         			        System.out.println("Rank Located: " + targetActiveRank);    
         			        
         			        
         		    		bufferedWriter.write("dataRequest");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("edit_rankData");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write(targetActiveRank);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		System.out.println("Sent:" + abc);
         		    		
         		    		

         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
         				
         				
         				
         				
         				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("DateID: "))
         			                                 .map(s->s.split("DateID: ")[1]).collect(Collectors.toList());

         			        String targetActiveDate = abc.toString();
         			        System.out.println("Date Located: " + targetActiveDate);    
         			        
         			        
         		    		bufferedWriter.write("dataRequest");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("edit_dateData");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write(targetActiveDate);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		System.out.println("Sent:" + abc);
         		    		
         		    		

         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
         				
         				
         				
         				
         				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("RoleID: "))
         			                                 .map(s->s.split("RoleID: ")[1]).collect(Collectors.toList());

         			        String targetActiveRole = abc.toString();
         			        System.out.println("Role Located: " + targetActiveRole);    
         			        
         			        
         		    		bufferedWriter.write("dataRequest");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("edit_roleData");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write(targetActiveRole);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		System.out.println("Sent:" + abc);
         		    		
         		    		

         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
         				
         				
           				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("loggedAbsence: "))
         			                                 .map(s->s.split("loggedAbsence: ")[1]).collect(Collectors.toList());

         			        String targetWarnings = abc.toString();
         			        System.out.println("Absences   Located: " + targetWarnings);    
         			        
         			        
         		    		bufferedWriter.write("dataRequest");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("edit_absenceData");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write(targetWarnings);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		System.out.println("Sent:" + abc);
         		    		
         		    		

         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
         				

         				
           				
           				
           				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("loggedWarning: "))
         			                                 .map(s->s.split("loggedWarning: ")[1]).collect(Collectors.toList());

         			        String targetWarnings = abc.toString();
         			        System.out.println("Warnings  Located: " + targetWarnings);    
         			        
         			        
         		    		bufferedWriter.write("dataRequest");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("edit_warningData");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write(targetWarnings);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		System.out.println("Sent:" + abc);
         		    		
         		    		

         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
           				
           				
           				
           				
           				
           				
           				
           				
           				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("loggedComm: "))
         			                                 .map(s->s.split("loggedComm: ")[1]).collect(Collectors.toList());

         			        String targetWarnings = abc.toString();
         			        System.out.println("Comms  Located: " + targetWarnings);    
         			        
         			        
         		    		bufferedWriter.write("dataRequest");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("edit_commsData");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write(targetWarnings);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		System.out.println("Sent:" + abc);
         		    		
         		    		

         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
           				
           				
           				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("loggedNote: "))
         			                                 .map(s->s.split("loggedNote: ")[1]).collect(Collectors.toList());

         			        String targetWarnings = abc.toString();
         			        System.out.println("Notes  Located: " + targetWarnings);    
         			        
         			        
         		    		bufferedWriter.write("dataRequest");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("edit_notesData");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write(targetWarnings);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		System.out.println("Sent:" + abc);
         		    		
         		    		
         		    		
         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
           				
           				
           				
           				
         				
         				
         				
         	        }
         	        else {
         	    		bufferedWriter.write("console_Appendation");
         				bufferedWriter.newLine();
         				bufferedWriter.flush();
         				

         	    		bufferedWriter.write("Member Is Not Active In Database");
         				bufferedWriter.newLine();
         				bufferedWriter.flush();
         	        }
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		
     	    	
     	    	}
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("edit_append_request")) {
     	    		String type =  bufferedReader.readLine();
     	    		String target = bufferedReader.readLine();
     	    		String data = bufferedReader.readLine();
     	    		String date = bufferedReader.readLine();

     	    	    
     	    	    
     	    		
     	    		
     	    		if(type.equals("absenceRegister")) {
     	    			
     	    			try {
     	    				System.out.println("Attempting System Absence Logger");
     					      FileWriter myWriter = new FileWriter("Resources/systemLogger.txt",true);
     					      myWriter.write("loggedAbsence");
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     	    		}
     	    			catch(Exception da) {}
     	    			
     					try {
     					      FileWriter myWriter = new FileWriter("Database/" + target + ".txt",true);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedAbsence: " + data);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedAbsenceDate: " + date);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.close();
     					      
     					      
     							try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     								
     						        List<String> abc = stream.filter(str->str.startsWith(target + " Absences "))
     						                                 .map(s->s.split(target + " Absences ")[1]).collect(Collectors.toList());
     	   
     						        
     						        String absenceAmountOnFullRecord = abc.toString();
     						        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     						        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     				    			
     						        int absenceAmountOnFullRecordInt =Integer.parseInt(absenceAmountOnFullRecord); 
     						        absenceAmountOnFullRecordInt += 1;
     						        

     								Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     								Charset charset = StandardCharsets.UTF_8;
     								
     								String content = new String(Files.readAllBytes(path), charset);
     								content = content.replaceAll(target + " Absences " + absenceAmountOnFullRecord, target + " Absences " + absenceAmountOnFullRecordInt);
     								Files.write(path, content.getBytes(charset));
     						
     					    		
     					    		
     					    		
     					    		
     					    		

     						    } catch (IOException e) {
     						        e.printStackTrace();
     						    }
     					      

     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    }
     	    			
     	    			
     	    		}
     	    		if(type.equals("noteRegister")) {
     	    			try {
     					      FileWriter myWriter = new FileWriter("Resources/systemLogger.txt",true);
     					      myWriter.write("loggedNote");
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     	    		}
     	    			catch(Exception da) {}
     	    			
     					try {
     					      FileWriter myWriter = new FileWriter("Database/" + target + ".txt",true);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedNote: " + data);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedNoteDate: " + date);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.close();
     					      
     					      
     							try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     								
     						        List<String> abc = stream.filter(str->str.startsWith(target + " Notes "))
     						                                 .map(s->s.split(target + " Notes ")[1]).collect(Collectors.toList());
     	   
     						        
     						        String absenceAmountOnFullRecord = abc.toString();
     						        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     						        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     				    			
     						        int absenceAmountOnFullRecordInt =Integer.parseInt(absenceAmountOnFullRecord); 
     						        absenceAmountOnFullRecordInt += 1;
     						        

     								Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     								Charset charset = StandardCharsets.UTF_8;
     								
     								String content = new String(Files.readAllBytes(path), charset);
     								content = content.replaceAll(target + " Notes " + absenceAmountOnFullRecord, target + " Notes " + absenceAmountOnFullRecordInt);
     								Files.write(path, content.getBytes(charset));
     						
     					    		
     					    		
     					    		
     					    		
     					    		

     						    } catch (IOException e) {
     						        e.printStackTrace();
     						    }

     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    }
     	    		}
     	    		if(type.equals("commendationRegister")) {
     	    			try {
     					      FileWriter myWriter = new FileWriter("Resources/systemLogger.txt",true);
     					      myWriter.write("loggedCommendation");
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     	    		}
     	    			catch(Exception da) {}
     					try {
     					      FileWriter myWriter = new FileWriter("Database/" + target + ".txt",true);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedComm: " + data);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedCommDate: " + date);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.close();
     					      
     							try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     								
     						        List<String> abc = stream.filter(str->str.startsWith(target + " Commendations "))
     						                                 .map(s->s.split(target + " Commendations ")[1]).collect(Collectors.toList());
     	   
     						        
     						        String absenceAmountOnFullRecord = abc.toString();
     						        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     						        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     				    			
     						        int absenceAmountOnFullRecordInt =Integer.parseInt(absenceAmountOnFullRecord); 
     						        absenceAmountOnFullRecordInt += 1;
     						        

     								Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     								Charset charset = StandardCharsets.UTF_8;
     								
     								String content = new String(Files.readAllBytes(path), charset);
     								content = content.replaceAll(target + " Commendations " + absenceAmountOnFullRecord, target + " Commendations " + absenceAmountOnFullRecordInt);
     								Files.write(path, content.getBytes(charset));
     						
     					    		
     					    		
     					    		
     					    		
     					    		

     						    } catch (IOException e) {
     						        e.printStackTrace();
     						    }

     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    }
     	    		}
     	    		if(type.equals("warningRegister")) {
     	    			try {
     					      FileWriter myWriter = new FileWriter("Resources/systemLogger.txt",true);
     					      myWriter.write("loggedWarning");
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     	    		}
     	    			catch(Exception da) {}
     					try {
     					      FileWriter myWriter = new FileWriter("Database/" + target + ".txt",true);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedWarning: " + data);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedWarningDate: " + date);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.close();
     					      

     							try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     								
     						        List<String> abc = stream.filter(str->str.startsWith(target + " Warnings "))
     						                                 .map(s->s.split(target + " Warnings ")[1]).collect(Collectors.toList());
     	   
     						        
     						        String absenceAmountOnFullRecord = abc.toString();
     						        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     						        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     				    			
     						        int absenceAmountOnFullRecordInt =Integer.parseInt(absenceAmountOnFullRecord); 
     						        absenceAmountOnFullRecordInt += 1;
     						        

     								Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     								Charset charset = StandardCharsets.UTF_8;
     								
     								String content = new String(Files.readAllBytes(path), charset);
     								content = content.replaceAll(target + " Warnings " + absenceAmountOnFullRecord, target + " Warnings " + absenceAmountOnFullRecordInt);
     								Files.write(path, content.getBytes(charset));
     		

     						    } catch (IOException e) {
     						        e.printStackTrace();
     						    }
     							

     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							
     							

     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    }
     	    		}
     	    		
     	    	}
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("edit_primaryData")) {
     	    		String target = bufferedReader.readLine();
     	    		String rank = bufferedReader.readLine();
     	    		String role = bufferedReader.readLine();
     	    		String date = bufferedReader.readLine();
     	    		String ProInd = bufferedReader.readLine();
     	    		String targetActiveRank = "Error";
     	    		
     				if(ProInd.equals("D") || ProInd.equals("P") || ProInd.equals("N")){
         				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("RankID: "))
         			                                 .map(s->s.split("RankID: ")[1]).collect(Collectors.toList());

         			        targetActiveRank = abc.toString();
         			       

         		    		
         		    		

         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
     				}//Previous Rank Catching
     				
     				
     				Path path = Paths.get("Database/" + target + ".txt");
     				Charset charset = StandardCharsets.UTF_8;
     				
     				String content = new String(Files.readAllBytes(path), charset);
     				content = content.replaceAll("RankID: ", "ARCHIVED_RankID ");
     				Files.write(path, content.getBytes(charset));
     				
     				String content2 = new String(Files.readAllBytes(path), charset);
     				content2 = content2.replaceAll("DateID: ", "ARCHIVED_DateID ");
     				Files.write(path, content2.getBytes(charset));
     				
     				String content3 = new String(Files.readAllBytes(path), charset);
     				content3 = content3.replaceAll("RoleID: ", "ARCHIVED_RoleID ");
     				Files.write(path, content3.getBytes(charset));
     				

     				
     				try {
     				      FileWriter myWriter = new FileWriter("Database/" + target + ".txt",true);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write("RankID: " + rank);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write("DateID: " + date);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write("RoleID: " + role);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      if(ProInd.equals("D")) {
     				      myWriter.write("loggedNote: Demoted from " + targetActiveRank + " to " + rank);
     				      }
     				      if(ProInd.equals("P")) {
     				      myWriter.write("loggedNote: Promoted from " + targetActiveRank + " to " + rank);
     				      }
     				      if(ProInd.equals("N")) {
     				      myWriter.write("loggedNote: Rank changed from " + targetActiveRank + " to " + rank);
     				      }
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      
     				      
     				      
     				      myWriter.close();

     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    }
     	    		
     	    		
     	    	}
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("removal_request")) {
     	    		String target = bufferedReader.readLine();
     	    		String reason = bufferedReader.readLine();
     	    		
     	    		System.out.println("Reason: " + reason);
     	    		String targetNikkit = "Error";
     	    		
     	    		 File f = new File("Database/" + target + ".txt");
     	    	        if (f.exists()){
     	    	        	
     	    	    		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
     	    	    		  LocalDateTime now = LocalDateTime.now();  
     	    	    		  System.out.println(dtf.format(now));					 
     	       try {
     	    	   if(reason.equals("")) {
     	    		   reason = "N/A";
     	    	   }
     	    							      FileWriter myWriter = new FileWriter("Resources/systemlogsData.txt", true);
     	    							      myWriter.write( dtf.format(now) + " - Member Deleted: " + target + " : Reason: " + reason);
     	    							      myWriter.write(System.getProperty( "line.separator" ));
     	    							      myWriter.close();
     	    							    } catch (IOException e) {
     	    							      System.out.println("An error occurred.");
     	    							      e.printStackTrace();
     	    							    }
     	    	        	
     	    	        	
     	    	        	try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("NIKKITLINK: "))
     	    			                                 .map(s->s.split("NIKKITLINK: ")[1]).collect(Collectors.toList());

     	    			         targetNikkit = abc.toString();
     	    			         targetNikkit = targetNikkit.replace("[", "");
     	    			         targetNikkit = targetNikkit.replace("]", "");
     	    			        System.out.println("Nikkit Located: " + targetNikkit);  }
     	    	        	catch(IOException failureToLocateNikkitLink) {
     	    	        		
     	    	        	}
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	File a = new File("NIKKIT_Users/" + targetNikkit + ".txt");
     	    	        	
     	    	        	f.delete();
     	    	        	a.delete();
     	    	        	
     	    	        	
     	    	    		bufferedWriter.write("console_Appendation");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				
     	    	    		bufferedWriter.write("File Deleted");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				
     	    				
     	    				
     						try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     							
     					        List<String> abc = stream.filter(str->str.startsWith(target + " Absences "))
     					                                 .map(s->s.split(target + " Absences ")[1]).collect(Collectors.toList());
        
     					        
     					        String absenceAmountOnFullRecord = abc.toString();
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     			    			
     			
     					        

     							Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     							Charset charset = StandardCharsets.UTF_8;
     							
     							String content = new String(Files.readAllBytes(path), charset);
     							content = content.replaceAll(target + " Absences " + absenceAmountOnFullRecord, "");
     							Files.write(path, content.getBytes(charset));
     	

     					    } catch (IOException e) {
     					        e.printStackTrace();
     					    }
     						
     						try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     							
     					        List<String> abc = stream.filter(str->str.startsWith(target + " Notes "))
     					                                 .map(s->s.split(target + " Notes ")[1]).collect(Collectors.toList());
        
     					        
     					        String absenceAmountOnFullRecord = abc.toString();
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     			    	
     					        

     							Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     							Charset charset = StandardCharsets.UTF_8;
     							
     							String content = new String(Files.readAllBytes(path), charset);
     							content = content.replaceAll(target + " Notes " + absenceAmountOnFullRecord, "");
     							Files.write(path, content.getBytes(charset));
     	

     					    } catch (IOException e) {
     					        e.printStackTrace();
     					    }
     						
     						try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     							
     					        List<String> abc = stream.filter(str->str.startsWith(target + " Commendations "))
     					                                 .map(s->s.split(target + " Commendations ")[1]).collect(Collectors.toList());
        
     					        
     					        String absenceAmountOnFullRecord = abc.toString();
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     			    
     					        

     							Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     							Charset charset = StandardCharsets.UTF_8;
     							
     							String content = new String(Files.readAllBytes(path), charset);
     							content = content.replaceAll(target + " Commendations " + absenceAmountOnFullRecord, "");
     							Files.write(path, content.getBytes(charset));
     	

     					    } catch (IOException e) {
     					        e.printStackTrace();
     					    }
     						
     					try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     							
     					        List<String> abc = stream.filter(str->str.startsWith(target + " Warnings "))
     					                                 .map(s->s.split(target + " Warnings ")[1]).collect(Collectors.toList());
        
     					        
     					        String absenceAmountOnFullRecord = abc.toString();
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     			    
     					        

     							Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     							Charset charset = StandardCharsets.UTF_8;
     							
     							String content = new String(Files.readAllBytes(path), charset);
     							content = content.replaceAll(target + " Warnings " + absenceAmountOnFullRecord, "");
     							Files.write(path, content.getBytes(charset));
     	

     					    } catch (IOException e) {
     					        e.printStackTrace();
     					    }
     					
     					
     					Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     					Charset charset = StandardCharsets.UTF_8;
     					
     					String content = new String(Files.readAllBytes(path), charset);
     					content = content.replaceAll("Name: " + target + " ", "");
     					Files.write(path, content.getBytes(charset));
     					

     						
     	    				
     	    				
     	    	        }
     	    	        
     	    	        
     	    	        
     	    	        
     	    	        
     	    	        
     	    	        
     	    	        
     	    	        
     	    	        
     	    	        
     	    	        
     	    	}
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("absence_registration_request")) {
     	    		String target = bufferedReader.readLine();
     	    		String date = bufferedReader.readLine();
     	    		String AW = bufferedReader.readLine();
     	    		String AE = bufferedReader.readLine();
     	    		String AN = bufferedReader.readLine();
     	    		String ANA = bufferedReader.readLine();
     	    		String event = bufferedReader.readLine();
     	    		
     	    		System.out.println("Absence Record System Accessed");
     	    		System.out.println("Target: " + target);
     	    		System.out.println("Event: " + event);
     	    		System.out.println("Date: " + date);
     	    		System.out.println("Apply Warning State: " + AW);
     	    		System.out.println("Apply Excuse State: " + AE);
     	    		System.out.println("Apply Notification System State: " + AN);
     	    		System.out.println("Apply Regristration As Non-Absence State: " + ANA);
     	    		
     	    		 File f = new File("Database/" + target + ".txt");
     	    	        if (f.exists()){
     	    	        	
     	    	    		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
     	    	    		  LocalDateTime now = LocalDateTime.now();  
     	    	    		  System.out.println(dtf.format(now));					 
     	       try {
     	    							      FileWriter myWriter = new FileWriter("Resources/systemlogsData.txt", true);
     	    							      myWriter.write( dtf.format(now) + " - Member Absence Recorded: " + target + " : " + event);
     	    							      myWriter.write(System.getProperty( "line.separator" ));
     	    							      myWriter.close();
     	    							    } catch (IOException e) {
     	    							      System.out.println("An error occurred.");
     	    							      e.printStackTrace();
     	    							    }
     	    	    		  
     	    	    		  
     	    	        	System.out.println("Target File Found");
     						try {
     						      FileWriter myWriter = new FileWriter("Database/" + target + ".txt",true);
     						      myWriter.write("loggedAbsence: " + event);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedAbsenceDate: " + date);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      if(AW.equals("applyWarning")) {
     						    	  myWriter.write(System.getProperty( "line.separator" ));
     						    	  myWriter.write("loggedWarning: (aw) Absence");
     						    	  myWriter.write(System.getProperty( "line.separator" ));
     						    	  myWriter.write("loggedWarningDate: " + date);
     						    	  myWriter.write(System.getProperty( "line.separator" ));
     						      }
     						      if(AE.equals("applyExcuse")) {
     						    	  myWriter.write(System.getProperty( "line.separator" ));
     						    	  myWriter.write("loggedNote: Excused " + event);
     						    	  myWriter.write(System.getProperty( "line.separator" ));
     						    	  myWriter.write("loggedNoteDate:" + date);
     						    	  myWriter.write(System.getProperty( "line.separator" ));
     						      }
     						      
     					    		bufferedWriter.write("console_Appendation");
     								bufferedWriter.newLine();
     								bufferedWriter.flush();
     								
     					    		bufferedWriter.write("Absence Logged");
     								bufferedWriter.newLine();
     								bufferedWriter.flush();
     						      
     						      
     						      myWriter.close();

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
     						
     						try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     						
     					        List<String> abc = stream.filter(str->str.startsWith(target + " Absences "))
     					                                 .map(s->s.split(target + " Absences ")[1]).collect(Collectors.toList());
        
     					        
     					        String absenceAmountOnFullRecord = abc.toString();
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     					        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     			    			
     					        int absenceAmountOnFullRecordInt =Integer.parseInt(absenceAmountOnFullRecord); 
     					        absenceAmountOnFullRecordInt += 1;
     					        

     							Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     							Charset charset = StandardCharsets.UTF_8;
     							
     							String content = new String(Files.readAllBytes(path), charset);
     							content = content.replaceAll(target + " Absences " + absenceAmountOnFullRecord, target + " Absences " + absenceAmountOnFullRecordInt);
     							Files.write(path, content.getBytes(charset));
     					
     				    		
     				    		
     				    		
     				    		
     				    		

     					    } catch (IOException e) {
     					        e.printStackTrace();
     					    }
     						
     						
     						
     						
     						
     						
     						
     						
     						
     						
     						
     						
     	    	        	
     	    	        }
     	    	        else {
     			    		bufferedWriter.write("console_Appendation");
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     						
     			    		bufferedWriter.write("Member Not Located");
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     	    	        }
     	    		
     	    		
     	    		
     	    		
     	    		
     	    	}
     	    	
     	    	if(messageFromClient.equals("massLookup_request")) {
     	    		String primaryDataType = bufferedReader.readLine();
     	    		String operator = bufferedReader.readLine();
     	    		String amountFromClient = bufferedReader.readLine();
     	    		int amount = Integer.parseInt(amountFromClient);
     	    		
     	    		System.out.println("primaryDataType: " + primaryDataType);
     	    		System.out.println("operator: " + operator);
     	    		System.out.println("amount: " + amount);
     	    		
     	    		
     	    	
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/dataBaseFullRecordsRaw.txt"))) {
     	 			    String line;
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     	 			    	
     	 			if (line.trim().isEmpty()) {
     	 			
     	 			    	}	
     	 					else if(!line.equals(" spacer ")){
     	 						
     	 						String filterCheck = (line.split(" ")[1]);
     	 						if(filterCheck.equals(primaryDataType)) {

     	 							
     	 							System.out.println("Matching Primary Data Type Found: " + line);
     	 							
     	 							 filterCheck = (line.split(" ")[2]);
     	 							 int filterChecktoInt =Integer.parseInt(filterCheck); 
     	 							 
     	 							if(operator.equals("Greater Than")) {
     	 								if(filterChecktoInt > amount) {
     	 									System.out.println("Amount is Greater: " + line);
     	 									
     	 						    		try {
     	 						    			
     	 							    		bufferedWriter.write("dataRequest");
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	 						    			
     	 							    		bufferedWriter.write("fullListLookup_Data");
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	 						    			
     	 							    		bufferedWriter.write(line);
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	
     	 							    		}catch (IOException failureToRequestSysSet) {}
     	 							    			
     	 							    		
     	 						    		
     	 						    		
     	 								}
     	 							}
     	 							if(operator.equals("Equal To")) {
     	 								if(filterChecktoInt == amount) {
     	 									System.out.println("Amount is Equal: " + line);
     	 						    		try {
     	 						    			
     	 							    		bufferedWriter.write("dataRequest");
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	 						    			
     	 							    		bufferedWriter.write("fullListLookup_Data");
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	 						    			
     	 							    		bufferedWriter.write(line);
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	
     	 							    		}catch (IOException failureToRequestSysSet) {}
     	 								}
     	 								
     	 							}
     	 							if(operator.equals("Less Than")) {
     	 								if(filterChecktoInt < amount) {
     	 									System.out.println("Amount is Less: " + line);
     	 						    		try {
     	 						    			
     	 							    		bufferedWriter.write("dataRequest");
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	 						    			
     	 							    		bufferedWriter.write("fullListLookup_Data");
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	 						    			
     	 							    		bufferedWriter.write(line);
     	 						    			bufferedWriter.newLine();
     	 						    			bufferedWriter.flush();
     	
     	 							    		}catch (IOException failureToRequestSysSet) {}
     	 								}
     	 								
     	 							}
     	 							
     	 							
     	 							
     	 							
     	 							
     	 						}
     	 			    	}
     	 			    	
     	 			    }
     	 			} catch (IOException e1) {
     	 				System.out.println("Error");
     	 				e1.printStackTrace();
     	 			}
     	    		
     	  
     	    
     	    	}
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("absenceCheck_request")) {
     	    		String target = bufferedReader.readLine();
     	    		
     	    		 File d = new File("Database/" + target + ".txt");
     	    	        if (d.exists()) {
     	    	        	
     	    	    		try {
     	    		    		bufferedWriter.write("dataRequest");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("massNameCheck");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("true");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    	    			
     	    		    		}catch (IOException failureToRequestSysSet) {
     	    		    			
     	    		    		}
     	    	        	
     	    	        }
     	    	        else {
     	    	    		try {
     	    		    		bufferedWriter.write("dataRequest");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("massNameCheck");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("false");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    	    			
     	    		    		}catch (IOException failureToRequestSysSet) {
     	    		    			
     	    		    		}
     	    	        }
     	    		
     	    		
     	    		
     	    	}
     	    	
     	    	
     	    	if(messageFromClient.equals("massAbsence_request")) {
     	    		

     			    

     	    		
     	    		System.out.println("Mass Absence System Accessed");
     	    		
     	    		String targets = bufferedReader.readLine();
     	    		String eventName   = bufferedReader.readLine();
     	    		String warningBoolean   = bufferedReader.readLine();
     	    		String nonAbsenceBoolean = bufferedReader.readLine();
     	    		String applyExcuseBoolean = bufferedReader.readLine();
     	    		String notifyBoolean = bufferedReader.readLine();
     	    		String date = bufferedReader.readLine();
     	    		
     			    try {
     				      FileWriter myWriter = new FileWriter("Resources/systemlogsData.txt", true);
     				      myWriter.write(date + " - Mass Absence Recorded: " + eventName);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    }
     	    		
     	    		
     	    		String[] targetsArray = targets.split(",");
     	    		

     	    		System.out.println("Targets: " + targets);
     	    		System.out.println("Event: " + eventName);
     	    		System.out.println("Length: " + targetsArray.length);
     	    		
     	     		System.out.println("Array: " + Arrays.toString(targetsArray));
     	     		System.out.println("warn: " + warningBoolean);
     	     		System.out.println("abs: " + nonAbsenceBoolean);
     	     		System.out.println("ae: " + applyExcuseBoolean);
     	     		System.out.println("notify: " + notifyBoolean);
     	     		
     	     		
     	     		int counter = 0;
     	     		
     	    		
     	    
     	    			
     	    			int arraySize = targetsArray.length;
     	    			System.out.println("Length: " + arraySize);
     	    			
     	    			while(true) {
     	    				
     	    				System.out.println("For Loop Active:");
     	    				System.out.println("Counter: " + counter);
     					try {
     					      FileWriter myWriter = new FileWriter("Database/"+ targetsArray[0 + counter] +".txt",true);
     					      System.out.println("Current Target: " +  targetsArray[0 + counter]);
     					      myWriter.write("loggedAbsence: " + eventName);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedAbsenceDate: " + date);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      if(warningBoolean.equals("ApplyWarnTrue")) {
     					          myWriter.write("loggedWarning: Absence Warning " + eventName);
     					          myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedWarningDate: " + date);
     						      myWriter.write(System.getProperty( "line.separator" ));
     					          System.out.println("Warning Applied");
     					      }
     					      if(applyExcuseBoolean.equals("ApplyExcuseTrue")) {
     					          myWriter.write("loggedNote: Absence Excused " + eventName);
     					          myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedNoteDate: " + date);
     						      myWriter.write(System.getProperty( "line.separator" ));
     					          System.out.println("Note Applied");
     					      }

     					      myWriter.close();

     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    }
     					
     					System.out.println("End Counter: " + counter);
     					//--------------------------------------------------------------------------------------------------------------------
     					int counterLoop = counter;
     					
     					try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     						
     				        List<String> abc = stream.filter(str->str.startsWith(targetsArray[0 + counterLoop] + " Absences "))
     				                                 .map(s->s.split(targetsArray[0 + counterLoop] + " Absences ")[1]).collect(Collectors.toList());

     				        
     				        String absenceAmountOnFullRecord = abc.toString();
     				        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     				        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     		    			
     				        int absenceAmountOnFullRecordInt =Integer.parseInt(absenceAmountOnFullRecord); 
     				        absenceAmountOnFullRecordInt += 1;
     				        

     						Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     						Charset charset = StandardCharsets.UTF_8;
     						
     						String content = new String(Files.readAllBytes(path), charset);
     						content = content.replaceAll(targetsArray[0 + counter] + " Absences " + absenceAmountOnFullRecord, targetsArray[0 + counter] + " Absences " + absenceAmountOnFullRecordInt);
     						Files.write(path, content.getBytes(charset));
     				
     			    		
     			    		
     			    		
     			    		
     			    		

     				    } catch (IOException e) {
     				        e.printStackTrace();
     				    }
     					

     					
     					counter++;
     					if(counter == targetsArray.length) {
     						break;
     					}
     	    		 }
     	    			
     	    		
     	    	
     	    		
     	    		
     	    		

     	    		
     	    		
     	    		
     	    		
     	    		
     	    	}
     	    	
     	    	if(messageFromClient.equals("massDeletionCheck_request")) {
     	    		String memberName = bufferedReader.readLine();
     	    		
     	    		 File d = new File("Database/" + memberName + ".txt");
     	    	        if (d.exists()) {

     	    				
     	    	        	bufferedWriter.write("dataRequest");
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();
     		    				

     		    	    		bufferedWriter.write("deletionTrue");
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();
     	    	        
     	    	        
     	    	        
     	    	        }
     	    	        else {
     	    	        	bufferedWriter.write("dataRequest");
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();
     		    				

     		    	    		bufferedWriter.write("deletionFalse");
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();
     	    	        }
     	    		
     	    		
     	    		
     	    		
     	    	}
     	    	
     	    	if(messageFromClient.equals("massDeletion_request")) {
     	    		String targets = bufferedReader.readLine();
     	    		String reason = bufferedReader.readLine();
     	    		
     	    		System.out.println("Mass Deletion System Accessed");
     	    		System.out.println("Targets: " + targets);
     	    		System.out.println("Reason: " + reason);
     	    		
     	    		String[] targetsArray = targets.split(",");
     	    		System.out.println("Target Array: " + targetsArray);
     	    		
     	    		
     	    		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
     	    		  LocalDateTime now = LocalDateTime.now();  
     	    		  System.out.println(dtf.format(now)); 
     	    		
     			    try {
     				      FileWriter myWriter = new FileWriter("Resources/systemlogsData.txt", true);
     				      myWriter.write(dtf.format(now) + " - Mass Deletion Recorded: " + targetsArray);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    }
     	    		
     	    		int arrayCounter = targetsArray.length;
     	    		System.out.println("Array length: " + arrayCounter);
     	    		int loopCounter = 0;
     	    		
     	    		while(true) {
     	    	     	 File f = new File("Database/" + targetsArray[0 + loopCounter] + ".txt");
     	    	     	System.out.println("File: Database/"  + targetsArray[0 + loopCounter] + ".txt");
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	     	 String NikkitUsername = "Error";
     	    	        	
     	    	        	
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + targetsArray[0 + loopCounter] + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("NIKKITLINK: "))
     	    			                                 .map(s->s.split("NIKKITLINK: ")[1]).collect(Collectors.toList());

     	    			         NikkitUsername = abc.toString();
     	    			         NikkitUsername = NikkitUsername.replace("[", "");
     	    			         NikkitUsername = NikkitUsername.replace("]", "");
     	    			        System.out.println("Nikkit Located: " + NikkitUsername);    
     	    			        
     	    			       
     	    			      

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    	        	
     	    				 File fe = new File("NIKKIT_Users/" + NikkitUsername + ".txt");
     	    				 
     	    				f.delete();
     	    				fe.delete();
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     		
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	
     	    	        	loopCounter++;
     	    	        	System.out.println("Loop Counter: " + loopCounter);
     	    	        	if(loopCounter == arrayCounter) {
     	    	        		break;
     	    	        	}
     	    		}
     	    		
     	    		
     	    		
     	    	}
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("massWarningCheck_request")) {
     	    		String target = bufferedReader.readLine();
     	    		System.out.println("mWC-R target: " + target);
     	    		
     	    		 File d = new File("Database/" + target + ".txt");
     	    	        if (d.exists()) {
     	    	        	
     	    	    		try {
     	    		    		bufferedWriter.write("dataRequest");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("massWarningNameCheck");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("true");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    	    			
     	    		    		}catch (IOException failureToRequestSysSet) {
     	    		    			
     	    		    		}
     	    		
     	    		
     	    		
     	    	}
     	    	        else {
     	    	    		try {
     	    		    		bufferedWriter.write("dataRequest");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("massWarningNameCheck");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("false");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    	    			
     	    		    		}catch (IOException failureToRequestSysSet) {
     	    		    			
     	    		    		}
     	    	        }
     	    	}
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("massWarning_request")) {
     	    		String targets = bufferedReader.readLine();
     	    		System.out.println("Target: " + targets);
     	    		String warning = bufferedReader.readLine();
     	    		System.out.println("Warning: " + warning);
     	    		String date = bufferedReader.readLine();
     	    		System.out.println("Date: " + date);
     	    		
     	    		 
     	    		
     			    try {
     				      FileWriter myWriter = new FileWriter("Resources/systemlogsData.txt", true);
     				      myWriter.write(date + " - Mass Warning Recorded: " + warning);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    }
     	    		
     	    		String[] targetsArray = targets.split(",");
     	    		System.out.println("Target Array: " + targetsArray);
     	    		int arrayCounter = targetsArray.length;
     	    		System.out.println("Array length: " + arrayCounter);
     	    		int loopCounter = 0;
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		//-----------------------------------------------------------------------------------
         			while(true) {
         				
         				System.out.println("For Loop Active:");
         				System.out.println("Counter: " + loopCounter);
     				try {
     				      FileWriter myWriter = new FileWriter("Database/"+ targetsArray[0 + loopCounter] +".txt",true);
     				      System.out.println("Current Target: " +  targetsArray[0 + loopCounter]);
     				      myWriter.write("loggedWarning: " + warning);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write("loggedWarningDate: " + date);
     				      myWriter.write(System.getProperty( "line.separator" ));

     				      myWriter.close();

     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    }
     				
     				System.out.println("End Counter: " + loopCounter);
     				//--------------------------------------------------------------------------------------------------------------------
     				int counterLoop = loopCounter;
     				
     				try (Stream<String> stream = Files.lines(Paths.get("Resources/dataBaseFullRecordsRaw.txt"))) {
     					
     			        List<String> abc = stream.filter(str->str.startsWith(targetsArray[0 + counterLoop] + " Warnings "))
     			                                 .map(s->s.split(targetsArray[0 + counterLoop] + " Warnings ")[1]).collect(Collectors.toList());

     			        
     			        String absenceAmountOnFullRecord = abc.toString();
     			        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("[", "");
     			        absenceAmountOnFullRecord = absenceAmountOnFullRecord.replace("]", "");
     	    			System.out.println("Parse int: " + absenceAmountOnFullRecord);
     			        int absenceAmountOnFullRecordInt = Integer.parseInt(absenceAmountOnFullRecord); 
     			        absenceAmountOnFullRecordInt += 1;
     			        

     					Path path = Paths.get("Resources/dataBaseFullRecordsRaw.txt");
     					Charset charset = StandardCharsets.UTF_8;
     					
     					String content = new String(Files.readAllBytes(path), charset);
     					content = content.replaceAll(targetsArray[0 + loopCounter] + " Warnings " + absenceAmountOnFullRecord, targetsArray[0 + loopCounter] + " Warnings " + absenceAmountOnFullRecordInt);
     					Files.write(path, content.getBytes(charset));
     			
     		    		
     		    		
     		    		
     		    		
     		    		

     			    } catch (IOException e) {
     			        e.printStackTrace();
     			    }
     				

     				
     				loopCounter++;
     				
     			
     				if(loopCounter == targetsArray.length) {
     					break;
     				}
         		 }
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		
     	   
     	    		
     	    		
     	    		
     	    		//--------------------------------------------------------------------------------------------------------------------------
     	    		
     	    	}
     	    	
     	    	if(messageFromClient.equals("massEditCheck_request")) {
     	    		String target = bufferedReader.readLine();
     	    		
     	    		 File d = new File("Database/" + target + ".txt");
     	    	        if (d.exists()) {
     	    	        	
     	    	    		try {
     	    		    		bufferedWriter.write("dataRequest");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("massEditNameCheck");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("true");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    	    			
     	    		    		}catch (IOException failureToRequestSysSet) {
     	    		    			
     	    		    		}
     	    		
     	    		
     	    		
     	    	}
     	    	        else {
     	    	    		try {
     	    		    		bufferedWriter.write("dataRequest");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("massEditNameCheck");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    		    		bufferedWriter.write("false");
     	    	    			bufferedWriter.newLine();
     	    	    			bufferedWriter.flush();
     	    	    			
     	    	    			
     	    		    		}catch (IOException failureToRequestSysSet) {
     	    		    			
     	    		    		}
     	    	        }
     	    		
     	    	}//----------------
     	    	
     	    	

     	    	
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("massEdit_request")) {
     	    		String targets = bufferedReader.readLine();
     	    		String requests = bufferedReader.readLine();
     	    		
     	    		String[] targetsArray = targets.split(",");
     	    		String[] requestArray = requests.split(",");
     	    		
     	    		int targetLength = targetsArray.length;
     	    		int requestLength = requestArray.length;
     	    		int requestCounter = 0;
     	    		int targetCounter = 0;
     	    		
     	    		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
     	    		  LocalDateTime now = LocalDateTime.now();  
     	    		  System.out.println(dtf.format(now));  
     	    		
     	    		System.out.println("Targets: " + targets);
     	    		System.out.println("Target Array: " + targetsArray);
     	    		System.out.println("Target Array Length: " + targetLength);
     	    		System.out.println("Requests: " + requests);
     	    		System.out.println("Request Array: " + requestArray);
     	    		System.out.println("Request Array Length: " + requestLength);
     	    		
     	    		while(true) {
     	    			
     	    		String requestToString = requestArray[0 + requestCounter];
     	    		System.out.println("Current Active Request: " + requestToString);
     	    		
     	    		requestToString = requestToString.replace(",", " ");
     	    		requestToString = requestToString.replace(": ", " ");
     	    		
     	    		System.out.println("Formatted Request: " + requestToString);
     	    		String[] formattedRequestArr = requestToString.split(" ");
     	    		String requestIdentifier = formattedRequestArr[0];
     	    		System.out.println("Request Identifier: " + requestIdentifier);
     	    		//-------------------------------------------------------------------------------------------------------
     	    		if(requestIdentifier.equals("Role")) {
     	    			System.out.println("Role Mass Edit System Accessed");
     	    			String roleIdentifier = "Error";
     	    			int roleWordCounter = 0;
     	    			
     	    			String roleBuilder = "";
     	    			while(true) {
     	    				String tempWord = formattedRequestArr[1 + roleWordCounter];
     	    				if(!tempWord.equals("Attributes")) {
     	    					roleBuilder = roleBuilder + " " + formattedRequestArr[1 + roleWordCounter];
     	    				}
     	    				if(tempWord.equals("Attributes")) {
     	    					break;
     	    				}
     	    				
     	    				roleWordCounter++;
     	    			}
     	    			System.out.println("Role:" + roleBuilder);
     	    			int notifyBooleanLocator = formattedRequestArr.length;
     	    			
     	    			String notifyBoolean = formattedRequestArr[notifyBooleanLocator - 1];
     	    			System.out.println("Notify Statment: " + notifyBoolean);
     	    			
     		    		String finalRole = roleBuilder;
     		    		String notifyFinalBoolean = notifyBoolean;
     		    		
     		    		
     		    		
     		    		
     		    		for (int i = targetLength; i != 0;  i--) {
     		    			
     					try {
     						System.out.println("i: " + i);
     						Path path = Paths.get("Database/" + targetsArray[i - 1] +".txt");
     						System.out.println("File: " + "Database/" + targetsArray[i - 1] +".txt");
     						Charset charset = StandardCharsets.UTF_8;
     						
     						String content = new String(Files.readAllBytes(path), charset);
     						content = content.replaceAll("RoleID: ", "ARCHIVED_ROLE_ID ");
     						Files.write(path, content.getBytes(charset));
     						
     						
     						
     					      FileWriter myWriter = new FileWriter("Database/" + targetsArray[i - 1] +".txt",true);
     					      myWriter.write("RoleID: " + roleBuilder);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedNote: Role change to " + roleBuilder);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write("loggedNoteDate: " + dtf.format(now));
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.close();
     					      
     					      
     					      
     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    }
     					
     		    		}
     		    		
     		    		
     		    		
     		    		
     		    		
     	
     	    		}//ROLE
     	    		
     	    		if(requestIdentifier.equals("Date")) {
     	    		String newDate = formattedRequestArr[1];
     	    		
     	    		System.out.println("New Date: " + newDate);
     	    		
     	    		for (int i = targetLength; i != 0;  i--) {
     	    			
     				try {
     					System.out.println("i: " + i);
     					Path path = Paths.get("Database/" + targetsArray[i - 1] +".txt");
     					System.out.println("File: " + "Database/" + targetsArray[i - 1] +".txt");
     					Charset charset = StandardCharsets.UTF_8;
     					
     					String content = new String(Files.readAllBytes(path), charset);
     					content = content.replaceAll("DateID: ", "ARCHIVED_DATE_ID ");
     					Files.write(path, content.getBytes(charset));
     					
     					
     				      FileWriter myWriter = new FileWriter("Database/" + targetsArray[i - 1] +".txt",true);
     				      myWriter.write("DateID: " + newDate);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write("loggedNote: Date change to " + newDate);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write("loggedNoteDate: " + dtf.format(now));
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     				      
     				      
     				      

     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    }
     				
     	    		}
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		}	//Role
     	    		if(requestIdentifier.equals("General")) {
     	    			System.out.println("General Rank Change Selected");
     	    			String ProDem = formattedRequestArr[3];
     	    			System.out.println("ProDem: " + ProDem);
     	    			
     	    			if(ProDem.equals("GeneralPromotion")) {
     	    				System.out.println("Promotion Selected");
     	    			}
     	    			if(ProDem.equals("GeneralDemotion")) {
     	    				System.out.println("Demotion Selected");
     	    			}
     	    			
     	    			String notifyBoolean =  formattedRequestArr[5];
     	    			System.out.println("Notify: " + notifyBoolean);
     	    			
     	    		}//General ProDem
     	    		if(requestIdentifier.equals("Rank")) {
     	    		
     	    			
     	    			String rankBuilder = "";
     	    			int rankCounter = 0;
     	    			
     	    			while(true) {
     	    				String rankTemp = formattedRequestArr[1 + rankCounter];
     	    				if(!rankTemp.equals("Attributes")) {
     	    					rankBuilder = rankBuilder + " " + rankTemp;
     	    				}
     	    				if(rankTemp.equals("Attributes")) {
     	    					break;
     	    				}
     	    				
     	    				rankCounter++;
     	    			}
     	    			System.out.println("New Rank: " + rankBuilder);
     	    			
     	    			
     	    			
     	    			String notifyBoolean = formattedRequestArr[formattedRequestArr.length - 1];
     	    			
     	    			System.out.println("Rank: " + rankBuilder);
     	    			System.out.println("Notify: " + notifyBoolean);
     	    			
     		    		for (int i = targetLength; i != 0;  i--) {
     		    			
     						try {
     							System.out.println("i: " + i);
     							Path path = Paths.get("Database/" + targetsArray[i - 1] +".txt");
     							System.out.println("File: " + "Database/" + targetsArray[i - 1] +".txt");
     							Charset charset = StandardCharsets.UTF_8;
     							
     							String content = new String(Files.readAllBytes(path), charset);
     							content = content.replaceAll("RankID: ", "ARCHIVED_RANK_ID ");
     							Files.write(path, content.getBytes(charset));
     							
     							
     						      FileWriter myWriter = new FileWriter("Database/" + targetsArray[i - 1] +".txt",true);
     						      myWriter.write("RankID: " + rankBuilder);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedNote: Rank change to " + rankBuilder);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedNoteDate: " + dtf.format(now));
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.close();
     						      
     						      
     						      

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
     						
     			    		}
     	    			
     	    		}//Rank
     	    		if(requestIdentifier.equals("General")) {
     	    			System.out.println("General Rank Change System");
     	    			String rankBoolean = formattedRequestArr[3];
     	    			System.out.println("General Rank Statment: " + rankBoolean);
     	    			 String[] RankArray = null;
     	    			 String targetActiveRank = null;
     	    			 
     	    			
     					try (Stream<String> stream = Files.lines(Paths.get("Resources/sysSet.txt"))) {

     				        List<String> abc = stream.filter(str->str.startsWith("presetRank: "))
     				                                 .map(s->s.split("presetRank: ")[1]).collect(Collectors.toList());

     				        System.out.println("System Preset Rank Located: " + abc);    
     				        
     				        RankArray = new String[abc.size()];
     				        RankArray = abc.toArray(RankArray);
     				        
     				       
     				        

     				    } catch (IOException e) {
     				        e.printStackTrace();
     				    }
     					
     					int loopCounter = 0;
     					
     					
     					
     					
     	    			        while(true) {
     	    			        	
     	    			        	boolean continueBoolean = true;
     	    			        	
         				try (Stream<String> stream = Files.lines(Paths.get("Database/" + targetsArray[0 + loopCounter] + ".txt"))) {

         			        List<String> abc = stream.filter(str->str.startsWith("RankID: "))
         			                                 .map(s->s.split("RankID: ")[1]).collect(Collectors.toList());

         			        targetActiveRank = abc.toString();
         			        System.out.println("Rank Located: " + targetActiveRank);    
         		    		

         			    } catch (IOException e) {
         			        e.printStackTrace();
         			    }
         				
         				
         				int rankFinder = 0;
         				targetActiveRank = targetActiveRank.replace("[", "");
         				targetActiveRank = targetActiveRank.replace("]", "");
         				while(true) {
         					
         					//System.out.println("Rank: " + targetActiveRank);
         					//System.out.println("Compared SysSet Rank: " + RankArray[0 + rankFinder]);
         					if(targetActiveRank.equals(RankArray[0 + rankFinder])) {
         						break;
         					}
         					else {
         						System.out.println("Rank no go");
         						rankFinder++;
         					}
         					if(rankFinder == RankArray.length) {
         						bufferedWriter.write("console_Appendation");
             					bufferedWriter.newLine();
             					bufferedWriter.flush();
             					
             		    		bufferedWriter.write("Member " + targetsArray[0 + loopCounter] + " Rank is Unidentifiable");
             					bufferedWriter.newLine();
             					bufferedWriter.flush();
             					
         						bufferedWriter.write("console_Appendation");
             					bufferedWriter.newLine();
             					bufferedWriter.flush();
             					
             		    		bufferedWriter.write("Manual Edit Required for Member " + targetsArray[0 + loopCounter]);
             					bufferedWriter.newLine();
             					bufferedWriter.flush();
             					
             					continueBoolean = false;
             					
             					loopCounter++;
             					
             					break;
         					}
         				}
         				System.out.println("Active Rank to Array location: " + rankFinder);
         				System.out.println("rankFinder: " + rankFinder);
         				System.out.println("RankArray.length: " + RankArray.length);
         				
         				if(rankFinder==0 && rankBoolean.equals("GeneralDemotion")) {
         					
         		    		bufferedWriter.write("console_Appendation");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("Member Has No Rank Under Hierarchy: " + targetsArray[0 + loopCounter]);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         					loopCounter++;
         					
         					
         				}
         				
         				else if (rankFinder==RankArray.length -1 && rankBoolean.equals("GeneralPromotion")){
         		    		bufferedWriter.write("console_Appendation");
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         		    		bufferedWriter.write("Member Has No Rank Over Hierarchy: " + targetsArray[0 + loopCounter]);
         					bufferedWriter.newLine();
         					bufferedWriter.flush();
         					
         					loopCounter++;
         				}
         				else {
         					if(continueBoolean == true) {
         				
         				Path path = Paths.get("Database/" + targetsArray[0 + loopCounter] +".txt");
     					System.out.println("File: " + "Database/" + targetsArray[0 + loopCounter] +".txt");
     					Charset charset = StandardCharsets.UTF_8;
     					
     					String content = new String(Files.readAllBytes(path), charset);
     					content = content.replaceAll("RankID: ", "ARCHIVED_RANK_ID ");
     					Files.write(path, content.getBytes(charset));
         				
     				      FileWriter myWriter = new FileWriter("Database/" + targetsArray[0 + loopCounter] +".txt",true);
     				      
     				      
     				      if(rankBoolean.equals("GeneralPromotion")) {
     				    	  myWriter.write("RankID: " + RankArray[rankFinder + 1]);
     				    	  myWriter.write(System.getProperty( "line.separator" ));
     				    	  myWriter.write("loggedNote: Rank Promoted to " + RankArray[rankFinder + 1]);
     				    	  myWriter.write(System.getProperty( "line.separator" ));
     				    	  myWriter.write("loggedNoteDate: " + dtf.format(now));
     				    	  myWriter.write(System.getProperty( "line.separator" ));
     				      }
     				      if(rankBoolean.equals("GeneralDemotion")) {
     				    	  myWriter.write("RankID: " + RankArray[rankFinder - 1]);
     				    	  myWriter.write(System.getProperty( "line.separator" ));
     				    	  myWriter.write("loggedNote: Rank Demoted to " + RankArray[rankFinder - 1]);
     				    	  myWriter.write(System.getProperty( "line.separator" ));
     				    	  myWriter.write("loggedNoteDate: " + dtf.format(now));
     				    	  myWriter.write(System.getProperty( "line.separator" ));
     				      }
     				      
     				      
     				      
     				      
     				      
     				      myWriter.close();
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				
         				loopCounter++;
         				}
         				}
         				
         				
         				
         				System.out.println("Loop Counter: " + loopCounter);
         				System.out.println("Target Length: " + targetsArray);
         				if(loopCounter == targetsArray.length) {
         					break;
         				}
         				
     	    			        
     	    			        }//while true
     					
     					
     					
     					
     					
     					
     					
     					
     					
     					
     					
     					
     					
     	    			        
     	    			        
     	    			
     	    	
     						
     						
     						
     						
     						
     						
     						
     						
     						
     						
     		
     					
     	    		
     	    			
     	    			
     	    			
     	    			
     	    			
     	    			
     	    			
     	    			
     	    			
     	    			
     	    			
     	    		}//General Rank
     	    		if(requestIdentifier.equals("Note")) {
     	    			String noteBuilder = "";
     	    			int noteCounter = 0;
     	    			
     	    			while(true) {
     	    				String noteTemp = formattedRequestArr[1 + noteCounter];
     	    				if(!noteTemp.equals("Attributes")) {
     	    					noteBuilder = noteBuilder + " " + noteTemp;
     	    				}
     	    				if(noteTemp.equals("Attributes")) {
     	    					break;
     	    				}
     	    				
     	    				noteCounter++;
     	    				
     	    				
     	    			}
     	    		
     	    			System.out.println("Note: " + noteBuilder);
     	    			
     	    			for (int i = targetLength; i != 0;  i--) {
     		    			
     						try {
     							System.out.println("i: " + i);
     							Path path = Paths.get("Database/" + targetsArray[i - 1] +".txt");
     							System.out.println("File: " + "Database/" + targetsArray[i - 1] +".txt");
     							Charset charset = StandardCharsets.UTF_8;
     							
     							String content = new String(Files.readAllBytes(path), charset);
     							content = content.replaceAll("NoteID: ", "ARCHIVED_NOTE_ID ");
     							Files.write(path, content.getBytes(charset));
     							
     							
     						      FileWriter myWriter = new FileWriter("Database/" + targetsArray[i - 1] +".txt",true);
     						      myWriter.write("loggedNote: " + noteBuilder);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedNoteDate: " + dtf.format(now));
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.close();
     						      
     						      
     						      

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
     						
     			    		}
     	    			
     	    			
     	    			
     	    			
     	    		}
     	    		
     	    		if(requestIdentifier.equals("Commendation")) {
     	    			
     	    			System.out.println("Commendation");
     	    			String commBuilder = "";
     	    			int commCounter = 0;
     	    			
     	    			while(true) {
     	    				String commTemp = formattedRequestArr[1 + commCounter];
     	    				if(!commTemp.equals("Attributes")) {
     	    					commBuilder = commBuilder + " " + commTemp;
     	    				}
     	    				if(commTemp.equals("Attributes")) {
     	    					break;
     	    				}
     	    				
     	    				commCounter++;
     	    				
     	    				
     	    			}
     	    			
     	    			System.out.println("Comms: " + commBuilder);
     	    			
     	    			String notifyBoolean = formattedRequestArr[formattedRequestArr.length - 1];
     	    			
     	    			System.out.println("Notify State: " + notifyBoolean);
     	    			
     	    			for (int i = targetLength; i != 0;  i--) {
     		    			
     						try {
     							System.out.println("i: " + i);
     							
     							
     							
     						      FileWriter myWriter = new FileWriter("Database/" + targetsArray[i - 1] +".txt",true);
     						      myWriter.write("loggedComm: " + commBuilder);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedCommDate: " + dtf.format(now));
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      
     						      myWriter.close();
     						      
     						      
     						      

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
     						
     			    		}
     	    			
     	    		}
     	    		if(requestIdentifier.equals("Absence")) {
     	    			System.out.println("Absence");
     	    			
     	    			String absenceBuilder = "";
     	    			int absenceCounter = 0;
     	    			
     	    			while(true) {
     	    				String absenceTemp = formattedRequestArr[1 + absenceCounter];
     	    				if(!absenceTemp.equals("Attributes")) {
     	    					absenceBuilder = absenceBuilder + " " + absenceTemp;
     	    				}
     	    				if(absenceTemp.equals("Attributes")) {
     	    					break;
     	    				}
     	    				
     	    				absenceCounter++;
     	    				
     	    				
     	    			}
     	    			System.out.println("Absence Event: " + absenceBuilder);
     	    			
     	    			String notifyBoolean = formattedRequestArr[formattedRequestArr.length - 1];
     	    			String excuseBoolean = formattedRequestArr[formattedRequestArr.length - 2];
     	    			String warningBoolean = formattedRequestArr[formattedRequestArr.length - 3];
     	    			
     	    			System.out.println("Notify Boolean: " + notifyBoolean);
     	    			System.out.println("Excuse Boolean: " + excuseBoolean);
     	    			System.out.println("Warning Boolean: " + warningBoolean);
     	    			
     	    			
     	    			
     	    			
     	    			for (int i = targetLength; i != 0;  i--) {
     		    			
     						try {
     							System.out.println("i: " + i);
     							
     							
     							
     						      FileWriter myWriter = new FileWriter("Database/" + targetsArray[i - 1] +".txt",true);
     						      myWriter.write("loggedAbsence: " + absenceBuilder);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedAbsenceDate: " + dtf.format(now));
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      if(excuseBoolean.equals("applyExcuse")) {
     							      myWriter.write("loggedNote: Unexcused - " + absenceBuilder);
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.write("loggedNoteDate: " + dtf.format(now));
     							      myWriter.write(System.getProperty( "line.separator" ));
     						      }
     						      if(excuseBoolean.equals("applyWarning")){
     							      myWriter.write("loggedWarning: Absence Warning - " + absenceBuilder);
     							      myWriter.write(System.getProperty( "line.separator" ));
     							      myWriter.write("loggedWarningDate: " + dtf.format(now));
     							      myWriter.write(System.getProperty( "line.separator" ));
     						      }
     						      myWriter.close();
     						      
     						      
     						      

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
     						
     			    		}
     	    			
     	    			
     	    			
     	    			
     	    			
     	    		}
     	    		
     	    		if(requestIdentifier.equals("Warning")) {
     	    			
     	    			String warningBuilder = "";
     	    			int warningCounter = 0;
     	    			
     	    			while(true) {
     	    				String warningTemp = formattedRequestArr[1 + warningCounter];
     	    				if(!warningTemp.equals("Attributes")) {
     	    					warningBuilder = warningBuilder + " " + warningTemp;
     	    				}
     	    				if(warningTemp.equals("Attributes")) {
     	    					break;
     	    				}
     	    				
     	    				warningCounter++;
     	    				
     	    				
     	    			}
     	    			System.out.println("Warning: " + warningBuilder);
     	    			String notifyBoolean = formattedRequestArr[formattedRequestArr.length - 1];
     	    			System.out.println("Notify Boolean: " + notifyBoolean);	
     	    			
     	    			
     	    			
     	    			for (int i = targetLength; i != 0;  i--) {
     		    			
     						try {
     							System.out.println("i: " + i);
     							
     							
     							
     						      FileWriter myWriter = new FileWriter("Database/" + targetsArray[i - 1] +".txt",true);
     						      myWriter.write("loggedWarning: " + warningBuilder);
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.write("loggedWarningDate: " + dtf.format(now));
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.close();
     						      
     						      
     						      

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
     						
     			    		}
     	    			
     	    			
     	    		}
     	    		
     	    		
     	    		requestCounter++;
     	    		if(requestCounter == requestLength) {
     	    			break;
     	    		}
     	    		}
     	    		
     	    		
     	    		
     	    	}
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("noteInsert_request")) {
     	    		String noteTarget = bufferedReader.readLine();
     	    		String note = bufferedReader.readLine();
     	    		
     	    		
     				try {
     				      FileWriter myWriter = new FileWriter("Resources/noticeBoardCenter.txt",true);
     				      myWriter.write(noteTarget + " " + note);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();

     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    }
     	    		
     	    		
     	    	}
     	    	
     	    	
     	    	if(messageFromClient.equals("noticeMessageRequest")) {
     	    		
     	    		System.out.println("Notice Collection Started");
     	    		
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/noticeBoardCenter.txt"))) {
     	 			    String line;
     	 			  
     	 			    while ((line = br.readLine()) != null) {
     	 			    	 System.out.println("Line: " + line);
     	 			    	
      						String filterCheck = (line.split(" ")[0]);
      						 System.out.println("Filter: " + filterCheck);
      						if(filterCheck.equals("generalNoticeMessage")) {
     	 			    	
      				    		bufferedWriter.write("dataRequest");
      							bufferedWriter.newLine();
      							bufferedWriter.flush();
     	 			    	
     			    		bufferedWriter.write("generalNotice");
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     						
     			    		bufferedWriter.write(line.replace("generalNoticeMessage ", ""));
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     						
     						System.out.println("General Notice Sent: " + line);
      						}//-----------------
      						if(filterCheck.equals("optionOneNoticeMessage")) {
      		 			    	
      				    		bufferedWriter.write("dataRequest");
      							bufferedWriter.newLine();
      							bufferedWriter.flush();
     	 			    	
      		 			    	
      				    		bufferedWriter.write("general1Notice");
      							bufferedWriter.newLine();
      							bufferedWriter.flush();
      							
      				    		bufferedWriter.write(line.replace("optionOneNoticeMessage ", ""));
      							bufferedWriter.newLine();
      							bufferedWriter.flush();
      							
      							System.out.println("General Notice Sent: " + line);
      	 						}//-----------------------
      						if(filterCheck.equals("optionTwoNoticeMessage")) {
      		 			    	
      				    		bufferedWriter.write("dataRequest");
      							bufferedWriter.newLine();
      							bufferedWriter.flush();
     	 			    	
      							
      				    		bufferedWriter.write("general2Notice");
      							bufferedWriter.newLine();
      							bufferedWriter.flush();
      							
      				    		bufferedWriter.write(line.replace("optionTwoNoticeMessage ", ""));
      							bufferedWriter.newLine();
      							bufferedWriter.flush();
      							
      							System.out.println("General Notice Sent: " + line);
      	 						}
      						
      						
     						
     						
     	 			    }
     	 			    }
     	 			catch (IOException dada) {
     	 				
     	 			}
     	    		
     	    		
     	    		
     	 			String option1 = "";
     				String option2 = "";
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/noticeBoardVariableTitles.txt"))) {
     	 			    String line;
     	 			  
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     	 			    	if(line.startsWith("option1: ")) {
     	 			    		option1 = line.replace("option1: ", "");
     	 			    	}
     	 			    	if(line.startsWith("option2: ")) {
     	 			    		option2 = line.replace("option2: ", "");
     	 			    	}

     	 			    }
     	 			    }
         			bufferedWriter.write("noticeBoardVariableTitles");
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(option1);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(option2);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				System.out.println("Option1: " + option1);
     				System.out.println("Option2: " + option2);
     	    		
     	    	}
     	    	
     	    	if(messageFromClient.equals("memberList_request")) {
     	    		
     	    		 File directoryPath = new File("Database/");
     	    		  File filesList[] = directoryPath.listFiles();
     	    	      for(File file : filesList) {
     	    	    	  String nameFormatted = file.getName();
     	    	    	  nameFormatted = nameFormatted.replace(".txt", "");
     	    	    	  
     	    	    	  
     	    	          System.out.println("File name: "+ nameFormatted);
     	    	          
     	    	          if(!nameFormatted.equals("dataBaseFullRecordsRaw")) {
     	    	        	  
     	    	      		bufferedWriter.write("dataRequest");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				
     	    	    		bufferedWriter.write("memberList_name");
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				
     	    	    		bufferedWriter.write(nameFormatted);
     	    				bufferedWriter.newLine();
     	    				bufferedWriter.flush();
     	    				
     	    				
     	    				
     	    	          
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + nameFormatted + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("RankID: "))
     	    			                                 .map(s->s.split("RankID: ")[1]).collect(Collectors.toList());

     	    			        String targetNIKKITLINK = abc.toString();
     	    			           System.out.println(nameFormatted + "'s Nikkit: " + targetNIKKITLINK);
     	    			           
     	   	    	      		bufferedWriter.write("dataRequest");
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();
     		    				
     		    	    		bufferedWriter.write("memberList_nikkit");
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();
     		    				
     		    	    		bufferedWriter.write(targetNIKKITLINK);
     		    				bufferedWriter.newLine();
     		    				bufferedWriter.flush();
     		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    	          
     	    	          
     	    				try (Stream<String> stream = Files.lines(Paths.get("Database/" + nameFormatted + ".txt"))) {

     	    			        List<String> abc = stream.filter(str->str.startsWith("RoleID: "))
     	    			                                 .map(s->s.split("RoleID: ")[1]).collect(Collectors.toList());

     	    			        String targetNIKKITLINK = abc.toString();
     	    			           System.out.println(nameFormatted + "'s Date: " + targetNIKKITLINK);
     	    			           
     		   	    	      		bufferedWriter.write("dataRequest");
     			    				bufferedWriter.newLine();
     			    				bufferedWriter.flush();
     			    				
     			    	    		bufferedWriter.write("memberList_date");
     			    				bufferedWriter.newLine();
     			    				bufferedWriter.flush();
     			    				
     			    	    		bufferedWriter.write(targetNIKKITLINK);
     			    				bufferedWriter.newLine();
     			    				bufferedWriter.flush();
     		

     	    			    } catch (IOException e) {
     	    			        e.printStackTrace();
     	    			    }
     	    	          
     	    	          
     	    	      }
     	    	          
     	    	          
     	    	          
     	    	          
     	    	          
     	    	          
     	    	          
     	    	       }
     	    		
     	    		
     	    	}
     	    	
     	    	if(messageFromClient.equals("MIPcalendarEventRegistration")) {
     	    		String month = bufferedReader.readLine();
     	    		String day =  bufferedReader.readLine();
     	    		String year = bufferedReader.readLine();
     	    		String name = bufferedReader.readLine();
     	    		String info = bufferedReader.readLine(); 
     	    		
     	    		String fileNameFormat = year + "-" + month + "-" + day;
     	    		
     	    		File file = new File("Resources/portalCalendar/" + fileNameFormat + ".txt");
     	    		if(file.exists()) {
     					try {
     					      FileWriter myWriter = new FileWriter("Resources/systemCalendar/" + fileNameFormat + ".txt",true);
     					      myWriter.write("eventName: " + name);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write(name + "Info: " + info);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.close();
     					      
     				    		bufferedWriter.write("console_Appendation");
     							bufferedWriter.newLine();
     							bufferedWriter.flush();
     							
     				    		bufferedWriter.write(fileNameFormat.replace(".", "/") + " edited");
     							bufferedWriter.newLine();
     							bufferedWriter.flush();

     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    
     	    		}
     	    		}
     	    		else {
     	    			file.createNewFile();
     	    			FileWriter myWriter = new FileWriter("Resources/portalCalendar/" + fileNameFormat + ".txt",true);
     	    			myWriter.write("eventName: " + name);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write(name + "Info: " + info);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     				      
     			    		bufferedWriter.write("console_Appendation");
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     						
     			    		bufferedWriter.write(fileNameFormat.replace(".", "/") + " event created");
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     	    			
     	    		}
     	    		
     	    		
     	    		
     	    		try {
     				      FileWriter myWriter = new FileWriter("Resources/portalAlertMessages.txt",true);
     				      System.out.println("------------------------WRITING ALERT MESSAGE--------------------------------");
    				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write("CALENDARALERTMESSAGE " + month + "/" + day + "/" + year + "---" + name);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    
       		}

     	    	}
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("CalendarRequestMIP")) {
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		
    	    		String year = bufferedReader.readLine();
     	    		String month = bufferedReader.readLine();
     	    		
     	    		int yearInt = Integer.valueOf(year);
     	    		yearInt = yearInt - 2000;
     	    		String yearStr = String.valueOf(yearInt);
     	    		
     	    		if(month.equals("Janurary")) { month = "1";} if(month.equals("May")) { month = "5";} if(month.equals("September")) { month = "9";}
     	    		if(month.equals("Feburary")) { month = "2";} if(month.equals("June")) { month = "6";} if(month.equals("October")) { month = "10";}
     	    		if(month.equals("March")) { month = "3";} if(month.equals("July")) { month = "7";} if(month.equals("November")) { month = "10";}
     	    		if(month.equals("April")) { month = "4";} if(month.equals("August")) { month = "8";} if(month.equals("December")) { month = "12";}
     	    		
     	    		System.out.println("Year requested: " + yearInt + "\nMonth requested: " + month);
     	    		
     	    		
     	    		
     	    		 File directoryPath = new File("Resources/portalCalendar");
     	    		  File filesList[] = directoryPath.listFiles();
     	    	      for(File file : filesList) {
     	    	    	  String fileStr = file.getName();
     	    	    	  fileStr = fileStr.replace(".txt","");
     	    	    	  System.out.println("File String: " + fileStr);
     	    	    	  
     	    	    	//try {
     	    	    	  String[] formmattedFileArr = fileStr.split("-");
     	    	    	  System.out.println("array: " + Arrays.toString(formmattedFileArr));
     	    	    	 
     	    	    	  
     	    	    	  System.out.println("File Year: " + formmattedFileArr[0]);
     	    	    	  System.out.println("File Month: " + formmattedFileArr[1]);
     	    	    	  System.out.println("File Day: " + formmattedFileArr[2]);
     	    	    	  
     	    	    	  
     	    	    	  if(formmattedFileArr[0].equals(yearStr)){
     	    	    		  System.out.println("Year Good");
     	    	    		  if(formmattedFileArr[1].equals(month)) {
     	    	    			  System.out.println("Month Good");
     	    	    			  String day = formmattedFileArr[2];
     	    	    			  String event = "Error";
     	    	    			  String info = "Error";
     	    	    				  
     	    	    				  
     	    	
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    			  try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar/" + fileStr + ".txt"))) {
     	    	    		 			    String line;
     	    	    		 			  System.out.println("CHECKPOINT 1");
     	    	    		 			    while ((line = br.readLine()) != null) {
     	    	    		 			    	 System.out.println(line + ",eventName: ");
     	    	    		 			    	 System.out.println(line + "," + event + "Info: ");
     	    	    		 			    	if(line.startsWith("eventName: ")) {
     	    	    		 			    		 event = line.replace("eventName: ", "");
     	    	    		 			    		System.out.println("CAUGHT 2");
     	    	    		 			    	}
     	    	    		 			    	 if(line.startsWith(event + "Info: ")) {
     	    	    		 			    		System.out.println("CAUGHT");
     	    	    		 			    		info = line.replace(event + "Info: ", "");
     	    	    		 			    	 }
     	    	    		 			    	
     	    	    		 			    
     	    	    		 			    }
     	    	    		 			    
     	    	    		 			    
 
     	    	    		 			    
     	    	    		 			    
     	    	    		 			    
     	    	    		 			    
     	    	    		 					bufferedWriter.write("dataRequest");
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					bufferedWriter.write("calendarOutputMIP");
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					bufferedWriter.write(day);
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					bufferedWriter.write(event);
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					bufferedWriter.write(info);
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					System.out.println("Day: " + day);
     	    	    	    					System.out.println("Event: " + event);
     	    	    	    					System.out.println("Info: " + info);
     	    	    		 			    	
     	    	    		 			    	
     	    	    		 			    
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    		    
     	    	    					  
     	    	    					
     	    	    					
     	    	    					
     	    	    					
     	    	    		  }catch(IOException da) {
     	    	    				  System.out.println("Calendar Error " + da);
     	    	    			  } 
     	    	    			  
     	    	    			  
     	    	    		  }
     	    	    		  
     	    	    	  }
     	    	    	  
     	    	    	  
     	    	    	  
     	    	 
     	    		
     	    	}
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		
     	    		
     	    	}
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("calendarSubmit")) {
     	    		String year = bufferedReader.readLine();
     	    		String month =  bufferedReader.readLine();
     	    		String day = bufferedReader.readLine();
     	    		String name = bufferedReader.readLine();
     	    		String info = bufferedReader.readLine(); 
     	    		
     	    		String fileNameFormat = year + "-" + month + "-" + day;
     	    		
     	    		File file = new File("Resources/systemCalendar/" + fileNameFormat + ".txt");
     	    		if(file.exists()) {
     					try {
     					      FileWriter myWriter = new FileWriter("Resources/systemCalendar/" + fileNameFormat + ".txt",true);
     					      myWriter.write("eventName: " + name);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.write(name + "Info: " + info);
     					      myWriter.write(System.getProperty( "line.separator" ));
     					      myWriter.close();
     					      
     				    		bufferedWriter.write("console_Appendation");
     							bufferedWriter.newLine();
     							bufferedWriter.flush();
     							
     				    		bufferedWriter.write(fileNameFormat.replace(".", "/") + " edited");
     							bufferedWriter.newLine();
     							bufferedWriter.flush();

     					    } catch (IOException e) {
     					      System.out.println("An error occurred.");
     					      e.printStackTrace();
     					    
     	    		}
     	    		}
     	    		else {
     	    			file.createNewFile();
     	    			FileWriter myWriter = new FileWriter("Resources/systemCalendar/" + fileNameFormat + ".txt",true);
     	    			myWriter.write("eventName: " + name);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.write(name + "Info: " + info);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     				      
     			    		bufferedWriter.write("console_Appendation");
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     						
     			    		bufferedWriter.write(fileNameFormat.replace(".", "/") + " event created");
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     	    			
     	    		}
     	    		
     	    		
     	    		
     	    		try {
     				      FileWriter myWriter = new FileWriter("Resources/systemAlertMessage.txt",true);
     				      myWriter.write("CALENDARALERTMESSAGE " + month + "/" + day + "/" + year + "---" + name);
     				      myWriter.write(System.getProperty( "line.separator" ));
     				      myWriter.close();
     				    } catch (IOException e) {
     				      System.out.println("An error occurred.");
     				      e.printStackTrace();
     				    
       		}
     	    		
     	    		
     	    		
     	    	}
     	    	

     	    	
     	    	
     	    	if(messageFromClient.equals("CalendarRequest")) {
     	    		String year = bufferedReader.readLine();
     	    		String month = bufferedReader.readLine();
     	    		
     	    		int yearInt = Integer.valueOf(year);
     	    		yearInt = yearInt - 2000;
     	    		String yearStr = String.valueOf(yearInt);
     	    		
     	    		if(month.equals("January")) { month = "1";} if(month.equals("May")) { month = "5";} if(month.equals("September")) { month = "9";}
     	    		if(month.equals("Feburary")) { month = "2";} if(month.equals("June")) { month = "6";} if(month.equals("October")) { month = "10";}
     	    		if(month.equals("March")) { month = "3";} if(month.equals("July")) { month = "7";} if(month.equals("November")) { month = "10";}
     	    		if(month.equals("April")) { month = "4";} if(month.equals("August")) { month = "8";} if(month.equals("December")) { month = "12";}
     	    		
     	    		System.out.println("Year requested: " + yearInt + "\nMonth requested: " + month);
     	    		
     	    		
     	    		
     	    		 File directoryPath = new File("Resources/systemCalendar");
     	    		  File filesList[] = directoryPath.listFiles();
     	    	      for(File file : filesList) {
     	    	    	  String fileStr = file.getName();
     	    	    	  fileStr = fileStr.replace(".txt","");
     	    	    	  System.out.println("File String: " + fileStr);
     	    	    	  
     	    	    	//try {
     	    	    	  String[] formmattedFileArr = fileStr.split("-");
     	    	    	  System.out.println("array: " + Arrays.toString(formmattedFileArr));
     	    	    	 
     	    	    	  
     	    	    	  System.out.println("File Year: " + formmattedFileArr[0]);
     	    	    	  System.out.println("File Month: " + formmattedFileArr[1]);
     	    	    	  System.out.println("File Day: " + formmattedFileArr[2]);
     	    	    	  
     	    	    	  
     	    	    	  if(formmattedFileArr[0].equals(yearStr)){
     	    	    		  System.out.println("Year Good");
     	    	    		  System.out.println(formmattedFileArr[1] + "," + month);
     	    	    		  if(formmattedFileArr[1].equals(month)) {
     	    	    			  System.out.println("Month Good");
     	    	    			  String day = formmattedFileArr[2];
     	    	    			  String event = "Error";
     	    	    			  String info = "Error";
     	    	    				  
     	    	    				  
     	    	
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    			  try (BufferedReader br = new BufferedReader(new FileReader("Resources/systemCalendar/" + fileStr + ".txt"))) {
     	    	    		 			    String line;
     	    	    		 			   
     	    	    		 			    while ((line = br.readLine()) != null) {
     	    	    		 			    	 System.out.println("Line: " + line);
     	    	    		 			    	 
     	    	    		 			    	if(line.startsWith("eventName: ")) {
     	    	    		 			    		 event = line.replace("eventName: ", "");
     	    	    		 			    		
     	    	    	
     	    	    		 			    		
     	    	    		 			    		
     	    	    		 			    	}
     	    	    		 			    	if(line.startsWith(event + "Info: ")) {
     	    	    		 			    		info = line.replace(event + "Info: ", "");
     	    	    		 			    	}
     	    	    		 			    }
     	    	    		 			    	
     	    	    		 					bufferedWriter.write("dataRequest");
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					bufferedWriter.write("calendarOutput");
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					bufferedWriter.write(day);
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					bufferedWriter.write(event);
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					bufferedWriter.write(info);
     	    	    	    					bufferedWriter.newLine();
     	    	    	    					bufferedWriter.flush();
     	    	    	    					
     	    	    	    					System.out.println("Day: " + day);
     	    	    	    					System.out.println("Event: " + event);
     	    	    	    					System.out.println("Info: " + info);
     	    	    		 			    	
     	    	    		 			    	
     	    	    		 			    
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    				  
     	    	    		    
     	    	    					  
     	    	    					
     	    	    					
     	    	    					
     	    	    					
     	    	    		  }catch(IOException da) {
     	    	    				  System.out.println("Calendar Error " + da);
     	    	    			  } 
     	    	    			  
     	    	    			  
     	    	    		  }
     	    	    		  
     	    	    	  }
     	    	    	  
     	    	    	  
     	    	    	  
     	    	      //} catch (Exception da) {
     	    	    	//  System.out.println("Calendar Error");
     	    	     // }
     	    		
     	    	}
     	    	}
     	    	
     	    	if(messageFromClient.equals("MIPrequestDataRequest")) {
         			
         			        
    	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/requestData.txt"))) {
     	 			    String line;
     	 			   
     	 			    while ((line = br.readLine()) != null) {
     	 		
     	 			    	
     	 			    	if(!line.startsWith("ARCHIVED")) {
     	 					bufferedWriter.write("requestsData_Data");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 					bufferedWriter.write(line);
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 	}
     	 			    	
     	 			    }
     	 			    }
     	   		

     	    		
     	    	}
     	    	
     	    	if(messageFromClient.equals("calendarButtonRequestMIP")) {
    	    		String year = bufferedReader.readLine();
     	    		String month = bufferedReader.readLine();
     	    		String day = bufferedReader.readLine();
     	    		
     	    		System.out.println("Year: " + year);
     	    		System.out.println("Month: " + month);
     	    		System.out.println("Day: " + day);
     	    		
     	    		String fileFormat = year + "-" + month + "-" + day + ".txt";
     	    		  File myObj = new File("Resources/portalCalendar/" + fileFormat);
     	    		  
     	    		  if(myObj.exists()) {
     	 			try (BufferedReader br = new BufferedReader(new FileReader(myObj))) {
     	 			    String line;
     	 			    String event = "";
     	 			    String eventInfo = "";
     	 			    int lineCounter = 0;
     	 			    while ((line = br.readLine()) != null) {
     	 			    	lineCounter++;
     	 			    	
     	 			    	System.out.println("Linet: " + line);
     	 			    	
     	 			    	if(line.startsWith("eventName: ")) {
     	 			    		 event = line.replace("eventName: ", "");
     	 			    		System.out.println("Event Name Found: " + event);
     	 			    		}
     	 			    	if(line.startsWith(event + "Info: ")) {
     	 			    		 eventInfo = line.replace(event + "Info: ", "");
     	 			    		System.out.println("Event info found: " + eventInfo);
     	 			    		}
     	 			    	
     	 			    
     	 			    	
     	 			    	if(lineCounter % 2 == 0) {
     	 		    		bufferedWriter.write("dataRequest");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 		    		bufferedWriter.write("calendarDataMIP");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();

     	 					
     	 		    		bufferedWriter.write(event);
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush(); 
     	 					System.out.println("Sending event: " + event);
     	
     	 		    		bufferedWriter.write(eventInfo);
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					System.out.println("Sending event info: " + eventInfo);

     	 			    	}
     	 					
     	 			    	
     	 			    	
     	 			    }
     	 			    }
     	    		  
     	    	}
     	    		  else {
     	 		    		bufferedWriter.write("dataRequest");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 		    		bufferedWriter.write("calendarDataMIP");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 		    		bufferedWriter.write("No Event Scheduled");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 		    		bufferedWriter.write("");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	    		  }
     	    	}
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("calendarButtonRequest")) {
     	    		String year = bufferedReader.readLine();
     	    		String month = bufferedReader.readLine();
     	    		String day = bufferedReader.readLine();
     	    		
     	    		System.out.println("Year: " + year);
     	    		System.out.println("Month: " + month);
     	    		System.out.println("Day: " + day);
     	    		
     	    		String fileFormat = year + "-" + month + "-" + day + ".txt";
     	    		  File myObj = new File("Resources/systemCalendar/" + fileFormat);
     	    		  
     	    		  if(myObj.exists()) {
     	 			try (BufferedReader br = new BufferedReader(new FileReader(myObj))) {
     	 			    String line;
     	 			    String event = "";
     	 			    String eventInfo = "";
     	 			    int lineCounter = 0;
     	 			    while ((line = br.readLine()) != null) {
     	 			    	lineCounter++;
     	 			    	
     	 			    	System.out.println("Linet: " + line);
     	 			    	
     	 			    	if(line.startsWith("eventName: ")) {
     	 			    		 event = line.replace("eventName: ", "");
     	 			    		System.out.println("Event Name Found: " + event);
     	 			    		}
     	 			    	if(line.startsWith(event + "Info: ")) {
     	 			    		 eventInfo = line.replace(event + "Info: ", "");
     	 			    		System.out.println("Event info found: " + eventInfo);
     	 			    		}
     	 			    	
     	 			    
     	 			    	
     	 			    	if(lineCounter % 2 == 0) {
     	 		    		bufferedWriter.write("dataRequest");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 		    		bufferedWriter.write("calendarData");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();

     	 					
     	 		    		bufferedWriter.write(event);
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush(); 
     	 					System.out.println("Sending event: " + event);
     	
     	 		    		bufferedWriter.write(eventInfo);
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					System.out.println("Sending event info: " + eventInfo);

     	 			    	}
     	 					
     	 			    	
     	 			    	
     	 			    }
     	 			    }
     	    		  
     	    	}
     	    		  else {
     	 		    		bufferedWriter.write("dataRequest");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 		    		bufferedWriter.write("calendarData");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 		    		bufferedWriter.write("No Event Scheduled");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	 					
     	 		    		bufferedWriter.write("");
     	 					bufferedWriter.newLine();
     	 					bufferedWriter.flush();
     	    		  }
     	    	}
     	    	
     	    	
     			if(messageFromClient.equals("customAlertMessagePortal")) {
     	     		String message = bufferedReader.readLine();
     	     		String date = bufferedReader.readLine();
     	 			try {
     	 			      FileWriter myWriter = new FileWriter("Resources/portalAlertMessages.txt",true);
     	 			      myWriter.write(date + "---" + message);
     	 			      myWriter.write(System.getProperty( "line.separator" ));
     	 			      myWriter.close();

     	 			    } catch (IOException e) {
     	 			      System.out.println("An error occurred.");
     	 			      e.printStackTrace();
     	 			    }
     	     		}
     			
     			
     	    	if(messageFromClient.equals("alertMessagesRequest")){
     	    		
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/systemAlertMessage.txt"))) {
     	 			    String line;
     	 			    String totalLine = "";
     	 			    
     	 			   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
     		    		  LocalDateTime now = LocalDateTime.now();  
     		    		  System.out.println(dtf.format(now)); 
     		    		  String date = dtf.format(now);
     		    		  String[] currentDateFormatted = date.split("/");
     		    		 System.out.println("currentDateFormatted: " + Arrays.toString(currentDateFormatted));
     	 			    
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     	 			    	if(line.startsWith("CALENDARALERTMESSAGE ")) {
     	 			    		System.out.println("CALENDAR ALERT");
     	 			    		line = line.replace("CALENDARALERTMESSAGE ", "");
     	 			    		String[] lineFormatted = line.split("---");
     	 			    		System.out.println("lineFormatted: " + Arrays.toString(lineFormatted));
     		 			    	String[] dateFormatter = lineFormatted[0].split("/");
     		 			    	System.out.println("dateFormatter: " + Arrays.toString(dateFormatter));
     		 			    	
     		 			    	String currentYear = currentDateFormatted[2];
     		 			    	String currentMonth = currentDateFormatted[0];
     		 			    	String currentDay = currentDateFormatted[1];
     		 			    	
     		 			    	
     		 			    	String expirationYear = dateFormatter[2];
     		 			    	String expirationMonth = dateFormatter[0];
     		 			    	String expirationDay = dateFormatter[1];
     		 			    	
     		 			    	int currentYearInt = Integer.parseInt(currentYear);
     		 			    	int currentMonthInt = Integer.parseInt(currentMonth);
     		 			    	int currentDayInt = Integer.parseInt(currentDay);
     		 			    	int expirationYearInt = Integer.parseInt(expirationYear);
     		 			    	int expirationMonthInt = Integer.parseInt(expirationMonth);
     		 			    	int expirationDayInt = Integer.parseInt(expirationDay);
     		 			    	
     		 			    	System.out.println("currentYearInt: " + currentYearInt);
     		 			    	System.out.println("currentMonthInt: " + currentMonthInt);
     		 			    	System.out.println("currentDayInt: " + currentDayInt);
     		 			    	System.out.println("expirationYearInt: " + expirationYearInt);
     		 			    	System.out.println("expirationMonthInt: " + expirationMonthInt);
     		 			    	System.out.println("expirationDayInt: " + expirationDayInt);
     		 			    	
     		 			
     		 			    	int temp = 0;
     		 			        temp = currentYearInt*365;
     		 			    	int CurrentdayFormatter = temp;
     		 			    	temp = currentMonthInt*30;
     		 			        CurrentdayFormatter = CurrentdayFormatter + temp + currentDayInt;
     		 			        
     		 			       temp = expirationYearInt*365;
     		 			       int ExpirationdayFormatter = temp;
     		 			      temp = expirationMonthInt*30;
     		 			      ExpirationdayFormatter = ExpirationdayFormatter + temp + expirationDayInt;
     		 			       
     		 			       
     		 			    	System.out.println("Current Day Format: " + CurrentdayFormatter);
     		 			    	System.out.println("Expiration Day Format: " + ExpirationdayFormatter);
     		 			        
     		 	
     		 			    	if(CurrentdayFormatter == ExpirationdayFormatter) {
     		 			    		System.out.println("Today");
     	 			    			bufferedWriter.write("alertMessage_Reponse");
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     	 							
     	 							bufferedWriter.write("Todays schedule is " + lineFormatted[1] + " on " + lineFormatted[0]);
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     		 			    	}
     		 			    	
     		 			    	else if (CurrentdayFormatter == ExpirationdayFormatter - 1) {
     		 			    		System.out.println("Tomorrow");
     	 			    			bufferedWriter.write("alertMessage_Reponse");
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     	 							
     	 							bufferedWriter.write("Tomorrows schedule is " + lineFormatted[1] + " on " + lineFormatted[0]);
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     		 			    	}
     		 			    	else if(CurrentdayFormatter < ExpirationdayFormatter && CurrentdayFormatter > ExpirationdayFormatter - 7) {
     		 			    		System.out.println("This week");
     	 			    			bufferedWriter.write("alertMessage_Reponse");
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     	 							
     	 							bufferedWriter.write("This week " + lineFormatted[1] + " is upcoming on " + lineFormatted[0]);
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     		 			    	}
     		 			    	
     		 			    	
     		 			    	/*if(currentYearInt == expirationYearInt) {
     		 			    		if(currentMonthInt == expirationMonthInt) {
     		 			    			
     		 			    			if(currentDayInt == expirationDayInt) {
     		 				    			System.out.println("VALID DAY OF");
     			 			    			bufferedWriter.write("alertMessage_Reponse");
     			 							bufferedWriter.newLine();
     			 							bufferedWriter.flush();
     			 							
     			 							bufferedWriter.write("TODAY: " + lineFormatted[1] + " - " + lineFormatted[0]);
     			 							bufferedWriter.newLine();
     			 							bufferedWriter.flush();
     			 							
     		 			    			}//DAY OF^
     		 			    			if(currentDayInt == expirationDayInt - 1) {
     		 				    			System.out.println("VALID DAY BEFORE");
     			 			    			bufferedWriter.write("alertMessage_Reponse");
     			 							bufferedWriter.newLine();
     			 							bufferedWriter.flush();
     			 							
     			 							bufferedWriter.write("TOMORROW: " + lineFormatted[1] + " - " + lineFormatted[0]);
     			 							bufferedWriter.newLine();
     			 							bufferedWriter.flush();
     			 							
     		 			    			}//DAY OF^
     		 			    			
     		 			    			
     		 			    		}
     		 			    		
     		 			    		
     		 			    		
     		 			    		
     		 			    	}*/
     		 			    	
     		 			    	
     		 			    	
     		 			    	
     	 			    	}//CALENDAR
     	 			    	else {
     	 			    	
     	 		    		
     	 		    		 
     	 			    	String[] lineFormatted = line.split("---");
     	 			    	System.out.println("lineFormatted: " + Arrays.toString(lineFormatted));
     	 			    	String[] dateFormatter = lineFormatted[0].split("/");
     	 			    	System.out.println("dateFormatter: " + Arrays.toString(dateFormatter));
     	 			    	
     	 			    	String currentYear = currentDateFormatted[2];
     	 			    	String currentMonth = currentDateFormatted[0];
     	 			    	String currentDay = currentDateFormatted[1];
     	 			    	
     	 			    	
     	 			    	String expirationYear = dateFormatter[2];
     	 			    	String expirationMonth = dateFormatter[0];
     	 			    	String expirationDay = dateFormatter[1];
     	 			    	
     	 			    	int currentYearInt = Integer.parseInt(currentYear);
     	 			    	int currentMonthInt = Integer.parseInt(currentMonth);
     	 			    	int currentDayInt = Integer.parseInt(currentDay);
     	 			    	int expirationYearInt = Integer.parseInt(expirationYear);
     	 			    	int expirationMonthInt = Integer.parseInt(expirationMonth);
     	 			    	int expirationDayInt = Integer.parseInt(expirationDay);
     	 			    	
     	 			    	System.out.println("currentYearInt: " + currentYearInt);
     	 			    	System.out.println("currentMonthInt: " + currentMonthInt);
     	 			    	System.out.println("currentDayInt: " + currentDayInt);
     	 			    	System.out.println("expirationYearInt: " + expirationYearInt);
     	 			    	System.out.println("expirationMonthInt: " + expirationMonthInt);
     	 			    	System.out.println("expirationDayInt: " + expirationDayInt);
     	 			    	
     	 			    	if(currentYearInt <= expirationYearInt) {
     	 			    		if(currentMonthInt <expirationMonthInt ) {
     	 			    			System.out.println("VALID");
     	 			    			bufferedWriter.write("alertMessage_Reponse");
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     	 							
     	 							bufferedWriter.write(lineFormatted[1]);
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     	 			    			
     	 			    		}
     	 			    		else if(currentMonthInt == expirationMonthInt) {
     	 			    			
     	 			    			if(currentDayInt < expirationDayInt) {
     	 			    				System.out.println("VALID");
     	 				    			bufferedWriter.write("alertMessage_Reponse");
     	 								bufferedWriter.newLine();
     	 								bufferedWriter.flush();
     	 								
     	 								bufferedWriter.write(lineFormatted[1]);
     	 								bufferedWriter.newLine();
     	 								bufferedWriter.flush();
     	 			    			}
     	 			    			else {
     	 			    				System.out.println("NOT VALID");
     	 			    			}
     	 			    		}
     	 			    		
     	 			    		
     	 			    	}
     	 			    	else {
     	 			    		System.out.println("NOT VALID");
     	 			    	}
     	 			    		
     	 			
     	 			    
     	 			    	
     	 			    		
     	 			    }
     	 			    	

     						
     	 			    }
     	 			    
     	    		

     					
     					System.out.println("Total Line: " + totalLine);
     	 			} catch(Exception da) {
     	 				System.out.println("Exception: " + da);
     	 			}
     	    		
     	    	}
     	    			
     	    	if(messageFromClient.equals("activityLogData_request")) {
     	    		
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/systemlogsData.txt"))) {
     	 			    String line;
     	 			  
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     		    			bufferedWriter.write("activitySystemLog_Reponse");
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     						
     						bufferedWriter.write(line);
     						bufferedWriter.newLine();
     						bufferedWriter.flush();
     	 			    	
     	 			    }
     	 			    }
     	 			
     	 			int warnLogger = 0;
     	 			int absenceLogger = 0;
     	 			int commLogger = 0;
     	 			int noteLogger = 0;
     	 			
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/systemLogger.txt"))) {
     	 			    String line;
     	 			  
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     	 			    	if(line.equals("loggedWarning")) {
     	 			    		 warnLogger++;
     	 			    	}
     	 			    	if(line.equals("loggedAbsence")) {
     	 			    		absenceLogger++;
     	 			    	}
     	 			    	if(line.equals("loggedCommendation")) {
     	 			    		commLogger++;
     	 			    	}
     	 			    	if(line.equals("loggedNote")) {
     	 			    		noteLogger++;
     	 			    	}
     	 			    }
     	 			    }
     	 			
     	 			String warnStr = String.valueOf(warnLogger);
     	 			String absStr = String.valueOf(absenceLogger);
     	 			String commStr = String.valueOf(commLogger);
     	 			String noteStr = String.valueOf(noteLogger);
     	 			
     	    		System.out.println("Absence: " + absenceLogger);
     	    		System.out.println("Warn " + warnLogger);
     	    		System.out.println("Comm " + commLogger);
     	    		System.out.println("Note " + noteLogger);
     	 			
     	 			bufferedWriter.write("activityLoggerCount_Reponse");
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(warnStr);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(absStr);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(commStr);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				bufferedWriter.write(noteStr);
     				bufferedWriter.newLine();
     				bufferedWriter.flush();
     				
     				
     				
     	 			
     	 			int fileCounter = 0;
     	 			 File directoryPath = new File("Database/");
     	    		  File filesList[] = directoryPath.listFiles();
     	    	      for(File file : filesList) {
     	    	    	 fileCounter++;
     	    	      }
     	    	      fileCounter--;
     	    	      String CounterStr = String.valueOf(fileCounter);
     	    			bufferedWriter.write("activityMemberCount_Reponse");
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     					bufferedWriter.write(CounterStr);
     					bufferedWriter.newLine();
     					bufferedWriter.flush();
     					
     					
     	    		
     	    	}
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	
     	    	if(messageFromClient.equals("clearGeneral_request")) {
     	    		
     	    		Path path = Paths.get("Resources/noticeBoardCenter.txt");
     				Charset charset = StandardCharsets.UTF_8;
     				
     				String content = new String(Files.readAllBytes(path), charset);
     				content = content.replaceAll("generalNoticeMessage", "");
     				Files.write(path, content.getBytes(charset));
     	    		
     	    	}
         	if(messageFromClient.equals("clearOption1")) {
         		Path path = Paths.get("Resources/noticeBoardCenter.txt");
     			Charset charset = StandardCharsets.UTF_8;
     			
     			String content = new String(Files.readAllBytes(path), charset);
     			content = content.replaceAll("optionOneNoticeMessage ", "");
     			Files.write(path, content.getBytes(charset));
     	    	}
         	if(messageFromClient.equals("clearOption2")) {
         		Path path = Paths.get("Resources/noticeBoardCenter.txt");
     			Charset charset = StandardCharsets.UTF_8;
     			
     			String content = new String(Files.readAllBytes(path), charset);
     			content = content.replaceAll("optionTwoNoticeMessage ", "");
     			Files.write(path, content.getBytes(charset));
         	}
         	if(messageFromClient.equals("clearSystemLogs")) {
     			try {
     			      FileWriter myWriter = new FileWriter("Resources/systemlogsData.txt");
     			      myWriter.write("");
     			      myWriter.write(System.getProperty( "line.separator" ));
     			      myWriter.close();

     			    } catch (IOException e) {
     			      System.out.println("An error occurred.");
     			      e.printStackTrace();
     			    }
         	}
         	
         	
         	if(messageFromClient.equals("noticeBoardVariableTitleRequest")) {
         		String option1 = bufferedReader.readLine();
         		String option2 = bufferedReader.readLine();
         		
         		
     			try {
     			      FileWriter myWriter = new FileWriter("Resources/noticeBoardVariableTitles.txt",true);
     			      myWriter.write("option1: " + option1);
     			      myWriter.write(System.getProperty( "line.separator" ));
     			      myWriter.write("option2: " + option2);
     			      myWriter.write(System.getProperty( "line.separator" ));
     			      myWriter.close();

     			    } catch (IOException e) {
     			      System.out.println("An error occurred.");
     		
     			      e.printStackTrace();
     			    }
         	}
         	
         	
         	if(messageFromClient.equals("customAlertMessage")) {
         		
         		String message = bufferedReader.readLine();
         		String date = bufferedReader.readLine();
     			try {
     			      FileWriter myWriter = new FileWriter("Resources/systemAlertMessage.txt",true);
     			      myWriter.write(date + "---" + message);
     			      myWriter.write(System.getProperty( "line.separator" ));
     			      myWriter.close();

     			    } catch (IOException e) {
     			      System.out.println("An error occurred.");
     			      e.printStackTrace();
     			    }
         	}
     	    	
         	if(messageFromClient.equals("MIPcalendarData")) {
         		String event1 = bufferedReader.readLine();
         		String event2 = bufferedReader.readLine();
         		String event3 = bufferedReader.readLine();
         		String event4 = bufferedReader.readLine();
         		String event5 = bufferedReader.readLine();
         		
         		
         		
         		String event1Pre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event1: ")) {
	 			    		event1Pre = line.replace("event1: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
         		String event2Pre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event2: ")) {
	 			    		event2Pre = line.replace("event2: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
         		String event3Pre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event3: ")) {
	 			    		event3Pre = line.replace("event3: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
         		String event4Pre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event4: ")) {
	 			    		event4Pre = line.replace("event4: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
         		String event5Pre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event5: ")) {
	 			    		event5Pre = line.replace("event5: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
         		
         		
	 			if(!event5.equals(event5Pre)) {try {  FileWriter myWriter = new FileWriter("Resources/event5Attendance.txt"); myWriter.write(""); myWriter.close(); } catch (IOException add) {}}
	 			if(!event4.equals(event4Pre)) {try {  FileWriter myWriter = new FileWriter("Resources/event4Attendance.txt"); myWriter.write(""); myWriter.close(); } catch (IOException add) {} }
	 			if(!event3.equals(event3Pre)) {try {  FileWriter myWriter = new FileWriter("Resources/event3Attendance.txt"); myWriter.write(""); myWriter.close(); } catch (IOException add) {} }
	 			if(!event2.equals(event2Pre)) {try {  FileWriter myWriter = new FileWriter("Resources/event2Attendance.txt"); myWriter.write(""); myWriter.close(); } catch (IOException add) {} }
	 			if(!event1.equals(event1Pre)) {try {  FileWriter myWriter = new FileWriter("Resources/event1Attendance.txt"); myWriter.write(""); myWriter.close(); } catch (IOException add) {} }
         		
         		
         		
         		
         		
         		
         		
         		
         		String event1ACTIVE = bufferedReader.readLine();
         		String event2ACTIVE = bufferedReader.readLine();
         		String event3ACTIVE = bufferedReader.readLine();
         		String event4ACTIVE = bufferedReader.readLine();
         		String event5ACTIVE = bufferedReader.readLine();
         		
         		String event1WARNING = bufferedReader.readLine();
         		String event2WARNING = bufferedReader.readLine();
         		String event3WARNING = bufferedReader.readLine();
         		String event4WARNING = bufferedReader.readLine();
         		String event5WARNING = bufferedReader.readLine();
         		
         		String event1nonAbsence = bufferedReader.readLine();
         		String event2nonAbsence = bufferedReader.readLine();
         		String event3nonAbsence = bufferedReader.readLine();
         		String event4nonAbsence = bufferedReader.readLine();
         		String event5nonAbsence = bufferedReader.readLine();
         		
         		String event1excused = bufferedReader.readLine();
         		String event2excused = bufferedReader.readLine();
         		String event3excused = bufferedReader.readLine();
         		String event4excused = bufferedReader.readLine();
         		String event5excused = bufferedReader.readLine();
         		
         
	 			    
	 			
	 			
	 			
	 			
         		
					try {
					      FileWriter myWriter = new FileWriter("Resources/portalCalendar.txt");
					      myWriter.write("event1: " + event1);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event1ACTIVE: " + event1ACTIVE);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event1WARNING: " + event1WARNING);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event1nonAbsence: " + event1nonAbsence);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event1excused: " + event1excused);
					      myWriter.write(System.getProperty( "line.separator" ));
					      
					      myWriter.write("event2: " + event2);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event2ACTIVE: " + event2ACTIVE);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event2WARNING: " + event2WARNING);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event2nonAbsence: " + event2nonAbsence);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event2excused: " + event2excused);
					      myWriter.write(System.getProperty( "line.separator" ));
					      
					      myWriter.write("event3: " + event3);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event3ACTIVE: " + event3ACTIVE);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event3WARNING: " + event3WARNING);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event3nonAbsence: " + event3nonAbsence);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event3excused: " + event3excused);
					      myWriter.write(System.getProperty( "line.separator" ));
					      
					      myWriter.write("event4: " + event4);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event4ACTIVE: " + event4ACTIVE);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event4WARNING: " + event4WARNING);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event4nonAbsence: " + event4nonAbsence);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event4excused: " + event4excused);
					      myWriter.write(System.getProperty( "line.separator" ));
					      
					      myWriter.write("event5: " + event5);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event5ACTIVE: " + event5ACTIVE);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event5WARNING: " + event5WARNING);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event5nonAbsence: " + event5nonAbsence);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("event5excused: " + event5excused);
					      myWriter.write(System.getProperty( "line.separator" ));
					      
					      
					      
					      
					      
					      
					      
					      
					      
					      myWriter.close();
					      
					    } catch (IOException e) {
					      System.out.println("An error occurred.");
					      e.printStackTrace();
					    }
					
					
					

					
         		
         	}
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	if(messageFromClient.equals("MIPCalendarSettingsRequest")) {
         		
         		
         		
   			 String event1 = ""; 
 			 String event2 = ""; 
 			 String event3 = ""; 
 			 String event4 = ""; 
 			 String event5 = ""; 
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event1: ")) {
	 			    		event1 = line.replace("event1: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
 			  
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event2: ")) {
	 			    		event2 = line.replace("event2: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event3: ")) {
	 			    		event3 = line.replace("event3: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event4: ")) {
	 			    		event4 = line.replace("event4: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event5: ")) {
	 			    		event5 = line.replace("event5: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			
	 			
	 			
	 		bufferedWriter.write("attendanceEventNames");
		bufferedWriter.newLine();
		bufferedWriter.flush();
	 			
	 		bufferedWriter.write(event5);
		bufferedWriter.newLine();
		bufferedWriter.flush();
		bufferedWriter.write(event4);
		bufferedWriter.newLine();
		bufferedWriter.flush();
		bufferedWriter.write(event3);
		bufferedWriter.newLine();
		bufferedWriter.flush();
		bufferedWriter.write(event2);
		bufferedWriter.newLine();
		bufferedWriter.flush();
		bufferedWriter.write(event1);
		bufferedWriter.newLine();
		bufferedWriter.flush();
		
			String event1Active = "";
			String event2Active = "";
			String event3Active = "";
			String event4Active = "";
			String event5Active = "";
 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event1ACTIVE: ")) {
	 			    		event1Active = line.replace("event1ACTIVE: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event2ACTIVE: ")) {
	 			    		event2Active = line.replace("event2ACTIVE: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event3ACTIVE: ")) {
	 			    		event3Active = line.replace("event3ACTIVE: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event4ACTIVE: ")) {
	 			    		event4Active = line.replace("event4ACTIVE: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event5ACTIVE: ")) {
	 			    		event5Active = line.replace("event5ACTIVE: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			
	 			
	 			
	 			
	 			
			bufferedWriter.write("attendanceEventActivity");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.write(event5Active);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.write(event4Active);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.write(event3Active);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.write(event2Active);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.write(event1Active);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			
         		String event1Warning = "";
				String event2Warning = "";
				String event3Warning = "";
				String event4Warning = "";
				String event5Warning = "";
				
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event1WARNING: ")) {
	 			    		event1Warning = line.replace("event1WARNING: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event2WARNING: ")) {
	 			    		event2Warning = line.replace("event2WARNING: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event3WARNING: ")) {
	 			    		event3Warning = line.replace("event3WARNING: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event4WARNING: ")) {
	 			    		event4Warning = line.replace("event4WARNING: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event5WARNING: ")) {
	 			    		event5Warning = line.replace("event5WARNING: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			
				bufferedWriter.write("attendanceWarningData");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event1Warning);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event2Warning);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event3Warning);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event4Warning);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event5Warning);
				bufferedWriter.newLine();
				bufferedWriter.flush();
	 			
				String event1NonAbsence = "";
				String event2NonAbsence = "";
				String event3NonAbsence = "";
				String event4NonAbsence = "";
				String event5NonAbsence = "";
				
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event1nonAbsence: ")) {
	 			    		event1NonAbsence = line.replace("event1nonAbsence: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event2nonAbsence: ")) {
	 			    		event2NonAbsence = line.replace("event2nonAbsence: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event3nonAbsence: ")) {
	 			    		event3NonAbsence = line.replace("event3nonAbsence: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event4nonAbsence: ")) {
	 			    		event4NonAbsence = line.replace("event4nonAbsence: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event5nonAbsence: ")) {
	 			    		event5NonAbsence = line.replace("event5nonAbsence: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			
				bufferedWriter.write("attendancenonAbsenceData");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event1NonAbsence);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event2NonAbsence);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event3NonAbsence);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event4NonAbsence);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event5NonAbsence);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				String event1Excused = "";
				String event2Excused = "";
				String event3Excused = "";
				String event4Excused = "";
				String event5Excused = "";
				
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event5excused: ")) {
	 			    		event5Excused = line.replace("event5excused: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event4excused: ")) {
	 			    		event4Excused = line.replace("event4excused: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event1excused: ")) {
	 			    		event1Excused = line.replace("event1excused: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event3excused: ")) {
	 			    		event3Excused = line.replace("event3excused: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("event2excused: ")) {
	 			    		event2Excused = line.replace("event2excused: ", "");
	 			    		break;
	 			    	}
	 			    	
	 			    }
	 			    }
	 			
				bufferedWriter.write("attendanceExcusedData");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event1Excused);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event2Excused);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event3Excused);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event4Excused);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				bufferedWriter.write(event5Excused);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				
				
				
				
				
				
				String event1Name;
				String event2Name;
				String event3Name;
				String event4Name;
				String event5Name;
				String customName;
				
				
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/event1Attendance.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 					bufferedWriter.write("event1AttendanceList");
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 					
	 					bufferedWriter.write(line);
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/event2Attendance.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
						bufferedWriter.write("event2AttendanceList");
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 					
	 					bufferedWriter.write(line);
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/event3Attendance.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
						bufferedWriter.write("event3AttendanceList");
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 					
	 					bufferedWriter.write(line);
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/event4Attendance.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
						bufferedWriter.write("event4AttendanceList");
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 					
	 					bufferedWriter.write(line);
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/event5Attendance.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
						bufferedWriter.write("event5AttendanceList");
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 					
	 					bufferedWriter.write(line);
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 			    	
	 			    }
	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/eventCustomAttendance.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
						bufferedWriter.write("eventCustomAttendanceList");
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 					
	 					bufferedWriter.write(line);
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 			    	
	 			    }
	 			    }
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
         	}
         	
         	if(messageFromClient.equals("pollDataLookup")) {
         		
         		String pollNumber = bufferedReader.readLine();
         		
         		if(!pollNumber.equals("Select")){
         		if(pollNumber.equals("Poll 1")) {pollNumber = "One"; }
         		if(pollNumber.equals("Poll 2")) {pollNumber = "Two"; }
         		if(pollNumber.equals("Poll 3")) {pollNumber = "Three"; }
         		if(pollNumber.equals("Poll 4")) {pollNumber = "Four"; }
         		
         		
    			int oneOne = 0;
				int oneTwo = 0;
				int oneThree = 0;
				int oneFour = 0;
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/poll" + pollNumber + "Data.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	
	 			    	if(line.startsWith("1 ")) {oneOne++;}
	 			    	if(line.startsWith("2 ")) {oneTwo++;}
	 			    	if(line.startsWith("3 ")) {oneThree++;}
	 			    	if(line.startsWith("4 ")) {oneFour++;}
	 			    	}
	 			    }
	 			String oneOneStr = String.valueOf(oneOne);
	 			String oneTwoStr = String.valueOf(oneTwo);
	 			String oneThreeStr = String.valueOf(oneThree);
	 			String oneFourStr = String.valueOf(oneFour);
	 			
	    		try {
    			bufferedWriter.write("pollDataResults");
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			
    			bufferedWriter.write(oneOneStr);
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			bufferedWriter.write(oneTwoStr);
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			bufferedWriter.write(oneThreeStr);
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			bufferedWriter.write(oneFourStr);
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
	    		} catch (IOException dad) {}
         	}
	 			
         	}
         	
         	if(messageFromClient.equals("pollSettingsData")) {
         		String pollOneQuestion = bufferedReader.readLine();
         		String pollOneOne = bufferedReader.readLine();
         		String pollOneTwo = bufferedReader.readLine();
         		String pollOneThree = bufferedReader.readLine();
         		String pollOneFour = bufferedReader.readLine();
         		String pollOneActive = bufferedReader.readLine();
         		
         		String pollTwoQuestion = bufferedReader.readLine();
         		String pollTwoOne = bufferedReader.readLine();
         		String pollTwoTwo = bufferedReader.readLine();
         		String pollTwoThree = bufferedReader.readLine();
         		String pollTwoFour = bufferedReader.readLine();
         		String pollTwoActive = bufferedReader.readLine();
         		
         		String pollThreeQuestion = bufferedReader.readLine();
         		String pollThreeOne = bufferedReader.readLine();
         		String pollThreeTwo = bufferedReader.readLine();
         		String pollThreeThree = bufferedReader.readLine();
         		String pollThreeFour = bufferedReader.readLine();
         		String pollThreeActive = bufferedReader.readLine();
         		
         		String pollFourQuestion = bufferedReader.readLine();
         		String pollFourOne = bufferedReader.readLine();
         		String pollFourTwo = bufferedReader.readLine();
         		String pollFourThree = bufferedReader.readLine();
         		String pollFourFour = bufferedReader.readLine();
         		String pollFourActive = bufferedReader.readLine();
         		
 
         		
				
				String PollOnePre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) {
	 			    String line;while ((line = br.readLine()) != null) {if(line.startsWith("pollOne: ")) {PollOnePre = line.replace("pollOne: ", "");break;}}}
				String PollTwoPre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) {
	 			    String line;while ((line = br.readLine()) != null) {
	 			    	System.out.println("Line: " + line);
	 			    	if(line.startsWith("pollTwo: ")) {PollTwoPre = line.replace("pollTwo: ", ""); System.out.println("CAUGHT"); break;}}}
				String PollThreePre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) {
	 			    String line;while ((line = br.readLine()) != null) {if(line.startsWith("pollThree: ")) {PollThreePre = line.replace("pollThree: ", "");break;}}}
				String PollFourPre = "Error";
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) {
	 			    String line;while ((line = br.readLine()) != null) {if(line.startsWith("pollFour: ")) {PollFourPre = line.replace("pollFour: ", "");break;}}}

	 			   	 			    	
	 			boolean pollStateChangeBoolean = false;
	 			    		
	 			  if(!PollOnePre.equals(pollOneQuestion)) { try {
						      FileWriter myWriter = new FileWriter("Resources/pollOneData.txt");
						      myWriter.write("");
						      myWriter.close();
						      System.out.println("Poll 1 Cleared");
						      pollStateChangeBoolean = true;
	 			  }catch(IOException dad) {}}
	 			  if(!PollTwoPre.equals(pollTwoQuestion)) { try {
				      FileWriter myWriter = new FileWriter("Resources/pollTwoData.txt");
				      myWriter.write("");
				      myWriter.close();
				      System.out.println("Poll 2 Cleared");
				      pollStateChangeBoolean = true;
			  }catch(IOException dad) {}}
	 			  if(!PollThreePre.equals(pollThreeQuestion)) { try {
				      FileWriter myWriter = new FileWriter("Resources/pollThreeData.txt");
				      myWriter.write("");
				      myWriter.close();
				      System.out.println("Poll 3 Cleared");
				      pollStateChangeBoolean = true;
			  }catch(IOException dad) {}}
	 			  if(!PollFourPre.equals(pollFourQuestion)) { try {
				      FileWriter myWriter = new FileWriter("Resources/pollFourData.txt");
				      myWriter.write("");
				      myWriter.close();
				      System.out.println("Poll 4 Cleared");
				      pollStateChangeBoolean = true;
			  }catch(IOException dad) {}}
	 			  
	 			  String currentState = "";
	 	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollStates.txt"))) {
	 	 			    String line;
	 	 			    while ((line = br.readLine()) != null) {
	 	 			    	
	 	 			    	currentState = line;
	 	 			    	
	 	 			    }
	 	 			    }
	 	 			
	 			  if(pollStateChangeBoolean == true) {
	 				  int currentStateInt = Integer.parseInt(currentState);
	 				 currentStateInt++;
	 				currentState = String.valueOf(currentStateInt);
	 					try {
	 					      FileWriter myWriter = new FileWriter("Resources/pollStates.txt", false);
	 					      myWriter.write(currentStateInt);;
	 					} catch(IOException dad) {}
	 				  
	 			  }
	 			    	
	 			 System.out.println("PollOnePre: " + PollOnePre + "\n poll 1: " + pollOneQuestion);
	 			System.out.println("PollTwoPre: " + PollTwoPre + "\n poll 2: " + pollTwoQuestion);
	 			System.out.println("PollThreePre: " + PollThreePre + "\n poll 3: " + pollThreeQuestion);
	 			System.out.println("PollFourPre: " + PollFourPre + "\n poll 4: " + pollFourQuestion);
	 			System.out.println(PollFourPre + " " + pollFourQuestion);
         		
				try {
				      FileWriter myWriter = new FileWriter("Resources/pollCenter.txt", false);
				      myWriter.write("pollOne: " + pollOneQuestion);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollTwo: " + pollTwoQuestion);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollThree: " + pollThreeQuestion);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollFour: " + pollFourQuestion);
				      myWriter.write(System.getProperty( "line.separator" ));
				      
				      myWriter.write("pollOneOne: " + pollOneOne);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollOneTwo: " + pollOneTwo);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollOneThree: " + pollOneThree);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollOneFour: " + pollOneFour);
				      myWriter.write(System.getProperty( "line.separator" ));
				      
				      myWriter.write("pollTwoOne: " + pollTwoOne);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollTwoTwo: " + pollTwoTwo);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollTwoThree: " + pollTwoThree);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollTwoFour: " + pollTwoFour);
				      myWriter.write(System.getProperty( "line.separator" ));
				      
				      myWriter.write("pollThreeOne: " + pollThreeOne);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollThreeTwo: " + pollThreeTwo);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollThreeThree: " + pollThreeThree);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollThreeFour: " + pollThreeFour);
				      myWriter.write(System.getProperty( "line.separator" ));
				      
				      myWriter.write("pollFourOne: " + pollFourOne);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollFourTwo: " + pollFourTwo);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollFourThree: " + pollFourThree);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollFourFour: " + pollFourFour);
				      myWriter.write(System.getProperty( "line.separator" ));
				      
				      myWriter.write("pollOneActive: " + pollOneActive);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollTwoActive: " + pollTwoActive);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollThreeActive: " + pollThreeActive);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("pollFourActive: " + pollFourActive);
				      myWriter.write(System.getProperty( "line.separator" ));
				      
				      
				      
				      myWriter.close();

				      
				      
				      
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				
				
				
				
				
				
         		
         		
         		
         	}
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	
         	if(messageFromClient.equals("pollInformationData")) {
         		
         		
         		String pollOneQuestion = "Error";
         		String pollOneOne = "Error";
         		String pollOneTwo = "Error";
         		String pollOneThree = "Error";
         		String pollOneFour = "Error";
         		String pollOneActive = "Error";
         		
         		String pollTwoQuestion = "Error";
         		String pollTwoOne = "Error";
         		String pollTwoTwo = "Error";
         		String pollTwoThree = "Error";
         		String pollTwoFour = "Error";
         		String pollTwoActive = "Error";
         		
         		String pollThreeQuestion = "Error";
         		String pollThreeOne = "Error";
         		String pollThreeTwo = "Error";
         		String pollThreeThree = "Error";
         		String pollThreeFour = "Error";
         		String pollThreeActive = "Error";
         		
         		String pollFourQuestion = "Error";
         		String pollFourFour = "Error";
         		String pollFourTwo = "Error";
         		String pollFourThree = "Error";
         		String pollFourOne = "Error";
         		String pollFourActive = "Error";
     			
 	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) {
 	 			    String line;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.startsWith("pollOne: ")) {
 	 			    		pollOneQuestion = line.replace("pollOne: ", "");
 	 			    		break;
 	 			    	}
 	 			    	
 	 			    }
 	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) {
 	 			    String line;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.startsWith("pollTwo: ")) {
 	 			    		pollTwoQuestion = line.replace("pollTwo: ", "");
 	 			    		break;
 	 			    	}
 	 			    	
 	 			    }
 	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) {
 	 			    String line;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.startsWith("pollThree: ")) {
 	 			    		pollThreeQuestion = line.replace("pollThree: ", "");
 	 			    		break;
 	 			    	}
 	 			    	
 	 			    }
 	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) {
 	 			    String line;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.startsWith("pollFour: ")) {
 	 			    		pollFourQuestion = line.replace("pollFour: ", "");
 	 			    		break;
 	 			    	}
 	 			    	
 	 			    }
 	 			    }
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
 	 			  if(line.startsWith("pollOneOne: ")) {pollOneOne = line.replace("pollOneOne: ", ""); break; }}}
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
	 	 			  if(line.startsWith("pollOneTwo: ")) {pollOneTwo = line.replace("pollOneTwo: ", ""); break; }}}
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
	 	 			  if(line.startsWith("pollOneThree: ")) {pollOneThree = line.replace("pollOneThree: ", ""); break; }}}
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
	 	 			  if(line.startsWith("pollOneFour: ")) {pollOneFour = line.replace("pollOneFour: ", ""); break; }}}
	 			
	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
	 	 			  if(line.startsWith("pollTwoOne: ")) {pollTwoOne = line.replace("pollTwoOne: ", ""); break; }}}
		 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
		 	 			  if(line.startsWith("pollTwoTwo: ")) {pollTwoTwo = line.replace("pollTwoTwo: ", ""); break; }}}
		 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
		 	 			  if(line.startsWith("pollTwoThree: ")) {pollTwoThree = line.replace("pollTwoThree: ", ""); break; }}}
		 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
		 	 			  if(line.startsWith("pollTwoFour: ")) {pollTwoFour = line.replace("pollTwoFour: ", ""); break; }}}
		 			
		 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
		 	 			  if(line.startsWith("pollThreeOne: ")) {pollThreeOne = line.replace("pollThreeOne: ", ""); break; }}}
			 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
			 	 			  if(line.startsWith("pollThreeTwo: ")) {pollThreeTwo = line.replace("pollThreeTwo: ", ""); break; }}}
			 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
			 	 			  if(line.startsWith("pollThreeThree: ")) {pollThreeThree = line.replace("pollThreeThree: ", ""); break; }}}
			 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
			 	 			  if(line.startsWith("pollThreeFour: ")) {pollThreeFour = line.replace("pollThreeFour: ", ""); break; }}}
			 			
			 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
			 	 			  if(line.startsWith("pollFourOne: ")) {pollFourOne = line.replace("pollFourOne: ", ""); break; }}}
				 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
				 	 			  if(line.startsWith("pollFourTwo: ")) {pollFourTwo = line.replace("pollFourTwo: ", ""); break; }}}
				 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
				 	 			  if(line.startsWith("pollFourThree: ")) {pollFourThree = line.replace("pollFourThree: ", ""); break; }}}
				 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
				 	 			  if(line.startsWith("pollFourFour: ")) {pollFourFour = line.replace("pollFourFour: ", ""); break; }}}
	 			
	 			
				 			
				 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
				 	 			  if(line.startsWith("pollOneActive: ")) {pollOneActive = line.replace("pollOneActive: ", ""); break; }}}
				 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
				 	 			  if(line.startsWith("pollTwoActive: ")) {pollTwoActive = line.replace("pollTwoActive: ", ""); break; }}}
				 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
				 	 			  if(line.startsWith("pollThreeActive: ")) {pollThreeActive = line.replace("pollThreeActive: ", ""); break; }}}
				 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollCenter.txt"))) { String line; while ((line = br.readLine()) != null) {
				 	 			  if(line.startsWith("pollFourActive: ")) {pollFourActive = line.replace("pollFourActive: ", ""); break; }}}
				 			
	 			
	 			
	 			
	 
     			
     			
				 			try {
				 				bufferedWriter.write("pollData_input");
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollOneQuestion);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollTwoQuestion);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollThreeQuestion);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollFourQuestion);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				
				 				bufferedWriter.write(pollOneOne);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollOneTwo);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollOneThree);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollOneFour);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				
				 				bufferedWriter.write(pollTwoOne);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollTwoTwo);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollTwoThree);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollTwoFour);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				
				 				bufferedWriter.write(pollThreeOne);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollThreeTwo);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollThreeThree);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollThreeFour);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				
				 				bufferedWriter.write(pollFourOne);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollFourTwo);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollFourThree);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollFourFour);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				
				 				bufferedWriter.write(pollOneActive);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollTwoActive);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollThreeActive);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 				bufferedWriter.write(pollFourActive);
				 				bufferedWriter.newLine();
				 				bufferedWriter.flush();
				 			
				 				
				 				
         		
         		
         		
         		
         		
         		
         	} catch (IOException dad) {}
         	}
         	
         	
         	

         	
         	if(messageFromClient.equals("requestAccept")) {
         		String request = bufferedReader.readLine();
         		String selectType = bufferedReader.readLine();
         		
    

         		if(selectType.equals("numeral")) {
            		
    	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/requestData.txt"))) {
     	 			    String line;
     	 			  
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     	 			    	if(line.startsWith("Request Number: " + request)) {
     	 			    		request = line;
     	 			    		System.out.println("------------------- " + request + " -----------------------------");
     	 			    	}
  

     	 			    }
     	 			    }
         			
         			
         		}
         		

				String originalRequest = request;
         		request = request.replace("Request Number: ", "");
         		request = request.replace(" | ", ",");
         		String requestArr[] = request.split(",");
         		System.out.println("requestArr[]: " + Arrays.toString(requestArr));
         	
         		
        		String requestNumber = requestArr[0];
         		System.out.println("Request Number: " + requestArr[0]);
         		String requestName = requestArr[1].replace("User: ", "");
         		System.out.println("Request Name: " + requestName);
         		String requestType = requestArr[2].replace("Request Type: ", "");
         		System.out.println("Request Type: " + requestType);
           		String requestData = requestArr[3].replace("Requested Change: ", "");
         		System.out.println("Request Data: " + requestData);
         		
				Path path = Paths.get("Resources/requestData.txt");
				Charset charset = StandardCharsets.UTF_8;
				
				String content = new String(Files.readAllBytes(path), charset);
				content = content.replace(originalRequest, "ARCHIVED_REQUEST: " + requestNumber);
				System.out.println("ARCHIVED_REQUEST: " + requestNumber);
				Files.write(path, content.getBytes(charset));
         		
         		
      		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
	    		  LocalDateTime now = LocalDateTime.now();  
	    		  System.out.println(dtf.format(now));
	    		  
         		if(requestType.equals("Role Change")) {
         			
         			
   	    
   	    		  
         			
    				Path path2 = Paths.get("Database/" + requestName + ".txt");
					Charset charset2 = StandardCharsets.UTF_8;
					
					String content2 = new String(Files.readAllBytes(path2), charset2);
					content2 = content2.replaceAll("RoleID: ", "ARCHIVED_RoleID: ");
					Files.write(path2, content2.getBytes(charset));
					
					
					
						try {
						      FileWriter myWriter = new FileWriter("Database/" + requestName + ".txt",true);
						      myWriter.write("RoleID: " + requestData);
						      myWriter.write(System.getProperty( "line.separator" ));
						      myWriter.write("loggedNote: Requested Role: " + requestData);
						      myWriter.write(System.getProperty( "line.separator" ));
						      myWriter.write("loggedNoteDate: " + dtf.format(now));
						      myWriter.write(System.getProperty( "line.separator" ));
						      myWriter.close();

						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }
						
					
				
					
         		}
         		
         		
         		
 
         		
         		
         		if(requestType.equals("Rank Change")) {
     				Path path2 = Paths.get("Database/" + requestName + ".txt");
    					Charset charset2 = StandardCharsets.UTF_8;
    					
    					String content2 = new String(Files.readAllBytes(path2), charset2);
    					content2 = content2.replaceAll("RankID: ", "ARCHIVED_RankID: ");
    					Files.write(path2, content2.getBytes(charset));
    					
    					
    					
    						try {
    						      FileWriter myWriter = new FileWriter("Database/" + requestName + ".txt",true);
    						      myWriter.write("RankID: " + requestData);
    						      myWriter.write(System.getProperty( "line.separator" ));
    						      myWriter.write("loggedNote: Requested Rank: " + requestData);
    						      myWriter.write(System.getProperty( "line.separator" ));
    						      myWriter.write("loggedNoteDate: " + dtf.format(now));
    						      myWriter.write(System.getProperty( "line.separator" ));
    						  
    						      myWriter.close();

    						    } catch (IOException e) {
    						      System.out.println("An error occurred.");
    						      e.printStackTrace();
    						    }
         		}
         		if(requestType.equals("Date Change")) {
     				Path path2 = Paths.get("Database/" + requestName + ".txt");
    					Charset charset2 = StandardCharsets.UTF_8;
    					
    					String content2 = new String(Files.readAllBytes(path2), charset2);
    					content2 = content2.replaceAll("DateID: ", "ARCHIVED_DateID: ");
    					Files.write(path2, content2.getBytes(charset));
    					
    					
    					
    						try {
    						      FileWriter myWriter = new FileWriter("Database/" + requestName + ".txt",true);
    						      myWriter.write("DateID: " + requestData);
    						      myWriter.write(System.getProperty( "line.separator" ));
    						      myWriter.write("loggedNote: Requested Date: " + requestData);
    						      myWriter.write(System.getProperty( "line.separator" ));
    						      myWriter.write("loggedNoteDate: " + dtf.format(now));
    						      myWriter.write(System.getProperty( "line.separator" ));
    						      
    						      myWriter.close();

    						    } catch (IOException e) {
    						      System.out.println("An error occurred.");
    						      e.printStackTrace();
    						    }
         		}

         		
         	}
         	
         	
    		if(messageFromClient.equals("requests_acceptAll")) {
     			String listOfRequests = bufferedReader.readLine();
     			listOfRequests = listOfRequests.substring(1);
     			listOfRequests = listOfRequests.substring(0, listOfRequests.length() - 1);
     			listOfRequests = listOfRequests.substring(0, listOfRequests.length() - 1);
    			System.out.println(listOfRequests);
    			
    			listOfRequests = listOfRequests.replace(", ",  ",");
    			String listArr[] = listOfRequests.split(",");
    			int sizeOfList  = listArr.length;
    			System.out.println("Length: " + sizeOfList);
    			
    			for(int x = 0; x < sizeOfList; x++) {
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				String originalRequest = listArr[x];
    				System.out.println("originalRequest: " + originalRequest);
    				String requestIdentifier = originalRequest;
    				requestIdentifier = requestIdentifier.replace("Request Number: ", "");
    				requestIdentifier = requestIdentifier.replace(" | ", ",");
             		String requestArr[] = requestIdentifier.split(",");
             		System.out.println("requestArr[]: " + Arrays.toString(requestArr));
             	
             		
            		String requestNumber = requestArr[0];
             		System.out.println("Request Number: " + requestArr[0]);
             		String requestName = requestArr[1].replace("User: ", "");
             		System.out.println("Request Name: " + requestName);
             		String requestType = requestArr[2].replace("Request Type: ", "");
             		System.out.println("Request Type: " + requestType);
               		String requestData = requestArr[3].replace("Requested Change: ", "");
             		System.out.println("Request Data: " + requestData);
             		
    				Path path = Paths.get("Resources/requestData.txt");
    				Charset charset = StandardCharsets.UTF_8;
    				
    				String content = new String(Files.readAllBytes(path), charset);
    				content = content.replace(originalRequest, "ARCHIVED_REQUEST: " + requestNumber);
    				System.out.println("ARCHIVED_REQUEST: " + requestNumber);
    				Files.write(path, content.getBytes(charset));
             		
             		
          		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
    	    		  LocalDateTime now = LocalDateTime.now();  
    	    		  System.out.println(dtf.format(now));
    	    		  
             		if(requestType.equals("Role Change")) {
             			
             			
       	    
       	    		  
             			
        				Path path2 = Paths.get("Database/" + requestName + ".txt");
    					Charset charset2 = StandardCharsets.UTF_8;
    					
    					String content2 = new String(Files.readAllBytes(path2), charset2);
    					content2 = content2.replaceAll("RoleID: ", "ARCHIVED_RoleID: ");
    					Files.write(path2, content2.getBytes(charset));
    					
    					
    					
    						try {
    						      FileWriter myWriter = new FileWriter("Database/" + requestName + ".txt",true);
    						      myWriter.write("RoleID: " + requestData);
    						      myWriter.write(System.getProperty( "line.separator" ));
    						      myWriter.write("loggedNote: Requested Role: " + requestData);
    						      myWriter.write(System.getProperty( "line.separator" ));
    						      myWriter.write("loggedNoteDate: " + dtf.format(now));
    						      myWriter.write(System.getProperty( "line.separator" ));
    						      myWriter.close();

    						    } catch (IOException e) {
    						      System.out.println("An error occurred.");
    						      e.printStackTrace();
    						    }
    						
    					
    				
    					
             		}
             		
             		
             		
     
             		
             		
             		if(requestType.equals("Rank Change")) {
         				Path path2 = Paths.get("Database/" + requestName + ".txt");
        					Charset charset2 = StandardCharsets.UTF_8;
        					
        					String content2 = new String(Files.readAllBytes(path2), charset2);
        					content2 = content2.replaceAll("RankID: ", "ARCHIVED_RankID: ");
        					Files.write(path2, content2.getBytes(charset));
        					
        					
        					
        						try {
        						      FileWriter myWriter = new FileWriter("Database/" + requestName + ".txt",true);
        						      myWriter.write("RankID: " + requestData);
        						      myWriter.write(System.getProperty( "line.separator" ));
        						      myWriter.write("loggedNote: Requested Rank: " + requestData);
        						      myWriter.write(System.getProperty( "line.separator" ));
        						      myWriter.write("loggedNoteDate: " + dtf.format(now));
        						      myWriter.write(System.getProperty( "line.separator" ));
        						  
        						      myWriter.close();

        						    } catch (IOException e) {
        						      System.out.println("An error occurred.");
        						      e.printStackTrace();
        						    }
             		}
             		if(requestType.equals("Date Change")) {
         				Path path2 = Paths.get("Database/" + requestName + ".txt");
        					Charset charset2 = StandardCharsets.UTF_8;
        					
        					String content2 = new String(Files.readAllBytes(path2), charset2);
        					content2 = content2.replaceAll("DateID: ", "ARCHIVED_DateID: ");
        					Files.write(path2, content2.getBytes(charset));
        					
        					
        					
        						try {
        						      FileWriter myWriter = new FileWriter("Database/" + requestName + ".txt",true);
        						      myWriter.write("DateID: " + requestData);
        						      myWriter.write(System.getProperty( "line.separator" ));
        						      myWriter.write("loggedNote: Requested Date: " + requestData);
        						      myWriter.write(System.getProperty( "line.separator" ));
        						      myWriter.write("loggedNoteDate: " + dtf.format(now));
        						      myWriter.write(System.getProperty( "line.separator" ));
        						      
        						      myWriter.close();

        						    } catch (IOException e) {
        						      System.out.println("An error occurred.");
        						      e.printStackTrace();
        						    }
             		}
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    			}
    			
    			
     		}
    		
    		
     
       		
         	
    		if(messageFromClient.equals("requestDeny")) {
    			String request = bufferedReader.readLine();
    			String requestType = bufferedReader.readLine();
    			
    			if(requestType.equals("numeral")) {
                		
        	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/requestData.txt"))) {
         	 			    String line;
         	 			  
         	 			    while ((line = br.readLine()) != null) {
         	 			    	
         	 			    	if(line.startsWith("Request Number: " + request)) {
         	 			    		request = line;
         	 			    		System.out.println("------------------- " + request + " -----------------------------");
         	 			    	}
      

         	 			    }
         	 			    }
             			
             			
             		
    			}
 	 			
    			
    			Path path = Paths.get("Resources/requestData.txt");
					Charset charset = StandardCharsets.UTF_8;
					
					String content = new String(Files.readAllBytes(path), charset);
					content = content.replace(request, "ARCHIVED_REQUEST_DENY");
					Files.write(path, content.getBytes(charset));
    			
    			
    			
    		}


    		
    		
    		
    		if(messageFromClient.equals("multipleInbox_Request")) {
    			
    			   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
         		   LocalDateTime now = LocalDateTime.now();  
    	    	   String systemCurrentDate = dtf.format(now);
    	    	   
    			System.out.println("Multiple messaged system accessed");
    			String topic = bufferedReader.readLine();
    			String message = bufferedReader.readLine();
    			String sender = bufferedReader.readLine();
    			String rank = bufferedReader.readLine();
    			String operator = bufferedReader.readLine();
    			System.out.println("topic" + topic );
    			System.out.println("message " + message );
    			System.out.println("sender" + sender );
    			System.out.println("rank" + rank );
    			System.out.println("operator" + operator );
    		
    			String selectMembers[];
    			ArrayList<String> sysSetRanks = new ArrayList<String>();
    			int rankPosition = 0;
    			int sysSetRankPosition = 0;
    			String currentRank = "Error";
    			
    			try (BufferedReader br = new BufferedReader(new FileReader("Resources/sysSet.txt"))) {
 	 			    String line;
 	 			  
 	 			    while ((line = br.readLine()) != null) {
 	 			    	System.out.println("Line in sysSet: " + line );
 	 			    	if(line.startsWith("presetRank: ")) {
 	 			    		System.out.println("CAUGHT");
 	 			    		sysSetRanks.add(line.replace("presetRank: ", ""));
 	 			    	}
 	 			    	
 	 		
 	 			    }
			
    	    	  
    	  		}
    			
    			
    			System.out.println("Current ranks: "+ sysSetRanks);
    			
    			while(sysSetRankPosition < sysSetRanks.size()) {
    				System.out.println("sysSetRankPosition " + sysSetRankPosition);
    				System.out.println("sysSetRanks.get(sysSetRankPosition) " + sysSetRanks.get(sysSetRankPosition));
    				if(sysSetRanks.get(sysSetRankPosition).equals(rank)) {
    					System.out.println("--------------------SYSSET RANK POSITION CAUGHTCAUGHT-------------------");
    					break;
    					
    					
    				}
    				
    				sysSetRankPosition++;
    			}
    			
    			
    			
    			
	    		 File directoryPath = new File("Database/");
	    		  File filesList[] = directoryPath.listFiles();
	    		 
	    	      for(File file : filesList) {
	    	    	  String nameFormatted = file.getName();
	    	    	  System.out.println("Current file: " + nameFormatted);
	    	    	  
	    	  		try (BufferedReader br = new BufferedReader(new FileReader("Database/" + nameFormatted))) {
	 	 			    String line;
	 	 			  
	 	 			    while ((line = br.readLine()) != null) {
	 	 			      System.out.println("Current file line: " + line);
	 	 			    	if(line.startsWith("RankID: ")) {
	 	 			    		currentRank = line.replace("RankID: ", "");
	 	 			    		 System.out.println("CAUGHT");
	 	 			    		 break;
	 	 			    	}
	 	 			    	
	 	 		
	 	 			    }
    			
	    	    	  
	    	  		}
	    	  
	    	  		for(rankPosition = 0; rankPosition < sysSetRanks.size(); rankPosition++) {
	    	  			
	    	  			 System.out.println("rankPosition " + rankPosition);
	    	  			 
	    	  			System.out.println("if " + currentRank + " equals " + sysSetRanks.get(rankPosition));
	    	  			if(currentRank.equals(sysSetRanks.get(rankPosition))) {
	    	  				 System.out.println("CAUGHT");
	    	  				
	    	  				 
	    	  				 System.out.println("rankPosition: " + rankPosition);
	    	  				 System.out.println("sysSetRankPosition: " + sysSetRankPosition);
	    	  				if(operator.equals("For all at")){
	    	  					
	    	  					if(rankPosition == sysSetRankPosition) {
	    	  						System.out.println("------------------------------------------" + nameFormatted + " fits the criteria" + "------------------------------------------");
	    	  						try {
	    	  					      FileWriter myWriter = new FileWriter("Resources/messageCenter/" + nameFormatted, true);
	    	  					      myWriter.write(dtf.format(now) + "," + topic + "," + sender + "," + message);
	    	  					      myWriter.write(System.getProperty( "line.separator" ));
	    	  					      myWriter.close();
	    	  					    } catch (IOException e) {
	    	  					      System.out.println("An error occurred.");
	    	  					      e.printStackTrace();
	    	  					    }
	    	  						
	    	  						
	    	  						
	    	  					}
	    	  					
	    	  				}
	    	  				if(operator.equals("At and below")){
	    	  					if(rankPosition <= sysSetRankPosition ) {
	    	  						System.out.println( "------------------------------------------" + nameFormatted + " fits the criteria" + "------------------------------------------");
	    	  						try {
		    	  					      FileWriter myWriter = new FileWriter("Resources/messageCenter/" + nameFormatted, true);
		    	  					      myWriter.write(dtf.format(now) + "," + topic + "," + sender + "," + message);
		    	  					      myWriter.write(System.getProperty( "line.separator" ));
		    	  					      myWriter.close();
		    	  					    } catch (IOException e) {
		    	  					      System.out.println("An error occurred.");
		    	  					      e.printStackTrace();
		    	  					    }
	    	  					}
	    	  				}
	    	  				if(operator.equals("At and above")){
	    	  					if(rankPosition >= sysSetRankPosition ) {
	    	  						System.out.println("------------------------------------------" + nameFormatted + " fits the criteria" + "------------------------------------------");
	    	  						try {
		    	  					      FileWriter myWriter = new FileWriter("Resources/messageCenter/" + nameFormatted, true);
		    	  					      myWriter.write(dtf.format(now) + "," + topic + "," + sender + "," + message);
		    	  					      myWriter.write(System.getProperty( "line.separator" ));
		    	  					      myWriter.close();
		    	  					    } catch (IOException e) {
		    	  					      System.out.println("An error occurred.");
		    	  					      e.printStackTrace();
		    	  					    }
	    	  					}
	    	  				}
	    	  				
	    	  				
	    	  				
	    	  				
	    	  				
	    	  			}
	    	  			
	    	  			
	    	  			
	    	  		}
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
	    	    	  
    			
	    	      }
    			
    			
    		}
    		
    		
    		
    		
    		
    		
      		if(messageFromClient.equals("messageInputRequest")) {
      	      	
     		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
     		   LocalDateTime now = LocalDateTime.now();  
	    	   String systemCurrentDate = dtf.format(now);
  	    	   
     			String username = bufferedReader.readLine();
     			String details = bufferedReader.readLine();
     			String sender = bufferedReader.readLine();
     			String topic = bufferedReader.readLine();
     			File nikkitFile = new File("Resources/messageCenter/" + username + ".txt");
 	    		if(nikkitFile.exists()) {
 	    			bufferedWriter.write("inboxReciepentAvailable");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
 	    			
					try {
					      FileWriter myWriter = new FileWriter("Resources/messageCenter/" + username + ".txt", true);
					      myWriter.write(dtf.format(now) + "," + topic + "," + sender + "," + details);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.close();
					    } catch (IOException e) {
					      System.out.println("An error occurred.");
					      e.printStackTrace();
					    }
					
 	    			
 	    		}
 	    		else {
 	    			bufferedWriter.write("inboxReciepentNotAvailable");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
 	    		}
 	    		
 	    		
     			
     		}
      		
      		
      		
      		
      		
      		
      		
    		if(messageFromClient.equals("requests_denyAll")) {
    			
    			try {
				      FileWriter myWriter = new FileWriter("Resources/requestData.txt");
				      myWriter.write("");
				      myWriter.close();

				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
    			
    			
    		}
    		
    		
    		if(messageFromClient.equals("activationRequest")) {
    			String type = bufferedReader.readLine();
    			String username = bufferedReader.readLine();
    			String activation = bufferedReader.readLine();
    			boolean loginBoolean = false;
    			
     			try (BufferedReader br = new BufferedReader(new FileReader("Resources/keyCenter.txt"))) {
 	 			    String line;
 	 			  
 	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.equals(username + "," + activation)) {
 	 			    		loginBoolean = true;
 	 			  		try {
						      FileWriter myWriter = new FileWriter("Resources/activationRecordingCenter.txt",true);
						      myWriter.write(username);
						      myWriter.write(System.getProperty( "line.separator" ));
						      myWriter.close();

						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }
 	 			    		
 	 			  	bufferedWriter.write("login_success");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
				  	bufferedWriter.write(username);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			  File myObj3 = new File("Resources/messageCenter/" + username + ".txt");
	    			  
	    			  if(!myObj3.exists()) {
					      myObj3.createNewFile();
	    			  }
 	 			    	}
 	 			    }
 	 			    if(loginBoolean == false) {
 	 			    	if(type.equals("manual")) {
 	 			    		bufferedWriter.write("login_failure_attempt");
 	 		    			bufferedWriter.newLine();
 	 		    			bufferedWriter.flush();
 	 			    	}
 	 			    	else {
 	 			  	bufferedWriter.write("login_failure");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();}
 	 			    }
 	 			    }
    		}
    		
    		
    		
    		
    		
    		
    		
    		
    		if(messageFromClient.equals("messageSpecific_request")) {
    			String messageDetails = bufferedReader.readLine();
     			String userName = bufferedReader.readLine();
     		 	System.out.println("messageDetails: " + messageDetails);
     		 	
     		 	//demoList.addElement(time + " | From: " + sender + " | " + topic);
     		 	
     		 	
     		 	String messageDetailsStr = messageDetails;
     		 	 System.out.println("messageDetailsStr: " + messageDetailsStr);
     		     messageDetailsStr = messageDetailsStr.replace(" | ", ",");
     		  
     		     System.out.println("messageDetailsStr: " + messageDetailsStr);
     		 	String message[] = messageDetailsStr.split(",");
     		 	System.out.println(message[0] + "," + message[1]);
     		 	String messageNonArr = message[0] +  "," + message[1];
     		 	
 	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/messageCenter/" + userName +".txt"))) {
 	 			    String line;
 	 			    while ((line = br.readLine()) != null) {
 	 			    
 	 			    	System.out.println("Line: " + line);
 	 			    	if(line.startsWith(messageNonArr)) {
 	 			    		
 	 			    		System.out.println(("CAUGHT"));
 	 			    		
 	 			    		String messageFormattedForDataOutput[] = line.split(",");
 	 			    		System.out.println(messageFormattedForDataOutput[3]);
 	 			    		
 	 			    		
 	 			    		
 	 			    		
 		 					bufferedWriter.write("MessageDetails_Data");
 		 					bufferedWriter.newLine();
 		 					bufferedWriter.flush();
 		 					
 		 					bufferedWriter.write(messageFormattedForDataOutput[3]);
 		 					bufferedWriter.newLine();
 		 					bufferedWriter.flush(); 
 		 					
		 					bufferedWriter.write(messageFormattedForDataOutput[2]);
 		 					bufferedWriter.newLine();
 		 					bufferedWriter.flush(); 
 		 					
 	 			    	}
 	 			    }
 	 			    
 	 			}
    		}
    		
    		
    		if(messageFromClient.equals("inboxRequest")) {
    			
      	  		String nikkit = bufferedReader.readLine();
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/messageCenter/" + nikkit +".txt"))) {
     	 			    String line;
     	 			    while ((line = br.readLine()) != null) {
     	 			    	//(dtf.format(now) + "," + topic + "," + sender + "," + details);
     	 			    	
     	 			    	String lineArr[] = line.split(",");
     	 			    	String time = lineArr[0];
     	 			    	String topic = lineArr[1];
     	 			    	String sender = lineArr[2];
     	 			    	
     	 			    	
     	    				bufferedWriter.write("inboxDataRequest");
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
    		    			
     	    				bufferedWriter.write(time);
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
    		    			
     	    				bufferedWriter.write(topic);
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
    		    			
    		    			
    		    			System.out.println("Sent: " + time + "," + topic);
    		    			
    		    			
     	 			    }
        			
        			
        		}
     	 			
     	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/messageStates.txt"))) {
     	 			    String line;
     	 			    String messageState;
     	 			    while ((line = br.readLine()) != null) {
     	 			    	System.out.println("Line: " + line);
     	 			    	if(line.startsWith(nikkit + ":")) {
     	 			    		messageState = line.replace(nikkit + ":", "");
     	 			    		bufferedWriter.write("messageStateCheck");
        		    			bufferedWriter.newLine();
        		    			bufferedWriter.flush();
        		    			System.out.println("messageState: " + messageState);
     	 			    		bufferedWriter.write(messageState);
        		    			bufferedWriter.newLine();
        		    			bufferedWriter.flush();
     	 			    	}

     	 			    }
     	 			    }
    			
    			
    		}
    		
    		
    		
    		  	 
    		 
    		if(messageFromClient.equals("messageStateRequest")) {
    			String nikkit = bufferedReader.readLine();
    			
    			try (BufferedReader br = new BufferedReader(new FileReader("Resources/messageStates.txt"))) {
 	 			    String line;
 	 			    String messageState;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	System.out.println("Line: " + line);
 	 			    	if(line.startsWith(nikkit + ":")) {
 	 			    		messageState = line.replace(nikkit + ":", "");
 	 			    		bufferedWriter.write("messageStateCheck");
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
    		    			System.out.println("messageState: " + messageState);
 	 			    		bufferedWriter.write(messageState);
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
 	 			    	}

 	 			    }
 	 			    }
    		 }
    		
    		if(messageFromClient.equals("attendanceStateCheck")) {
     			try (BufferedReader br = new BufferedReader(new FileReader("Resources/stateChanges.txt"))) {
 	 			    String line;
 	 			    String attendanceState;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.startsWith("attendance:")) {
 	 			    		attendanceState = line.replace("attendance:", "");
 	 			    		bufferedWriter.write("attendanceStateCheck");
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
    		    			
     			    		bufferedWriter.write(attendanceState);
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
 	 			    	}

 	 			    }
 	 			    }
    		}
    		
    		
    		if(messageFromClient.equals("stateRequests")) {
    			String user = bufferedReader.readLine();
    			System.out.println("User: " + user);
    			try (BufferedReader br = new BufferedReader(new FileReader("Resources/stateChanges.txt"))) {
 	 			    String line;
 	 			    String attendanceState;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.startsWith("attendance:")) {
 	 			    		attendanceState = line.replace("attendance:", "");
 	 			    		bufferedWriter.write("attendanceState");
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
    		    			
 	 			    		bufferedWriter.write(attendanceState);
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
 	 			    	}

 	 			    }
 	 			    }
    				
    			
    			
    			
    			try (BufferedReader br = new BufferedReader(new FileReader("Resources/messageStates.txt"))) {
 	 			    String line;
 	 			    String messageState;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	System.out.println("Line: " + line);
 	 			    	if(line.startsWith(user + ":")) {
 	 			    		messageState = line.replace(user + ":", "");
 	 			    		bufferedWriter.write("messageState");
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
    		    			System.out.println("messageState: " + messageState);
 	 			    		bufferedWriter.write(messageState);
    		    			bufferedWriter.newLine();
    		    			bufferedWriter.flush();
 	 			    	}

 	 			    }
 	 			    }
    		}
    		
    
    			
    		
    		
    	
    		
     	    	if(messageFromClient.equals("CLOSE")) {
     	    		System.out.println("Exit Command Recieved");
    				Path path = Paths.get("Resources/activationRecordingCenter.txt");
 					Charset charset = StandardCharsets.UTF_8;
 					
 					String content = new String(Files.readAllBytes(path), charset);
 					content = content.replaceAll("presetRank: ", "ARCHIVED_PRESET_RANK ");
 					Files.write(path, content.getBytes(charset));
 					
     	    		
     	    		break;
     	    	}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
          
        try
        {
            // closing resources
            this.bufferedWriter.close();
            this.bufferedReader.close();
            
   
              
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    

    
}