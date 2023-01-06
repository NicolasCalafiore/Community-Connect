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
  

public class portalServer 
{
    public static void main(String[] args) throws IOException 
    {
        // server is listening on port 5056
        ServerSocket ss = new ServerSocket(4321);
          
        // running infinite loop for getting
        // client request
        while (true) 
        {
            Socket s = null;
              
            try 
            {
            
                s = ss.accept();
                  
                System.out.println("A new client is connected : " + s);

                
          
                InputStreamReader inputStreamReader = new InputStreamReader(s.getInputStream());
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(s.getOutputStream());
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
                  
                System.out.println("Assigning new thread for this client");
  
               
                Thread t = new ClientHandlerPortal(s, bufferedReader, bufferedWriter);
                System.out.println("Thread: " + t + " assaigned");
               
                t.start();
                  
            }
            catch (Exception e){
                s.close();
                System.out.println("Socketed Closed");
                e.printStackTrace();
            }
        }
    }
}
  
// ClientHandlerPortal class
class ClientHandlerPortal extends Thread 
{
    DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat fortime = new SimpleDateFormat("hh:mm:ss");
    final Socket s;
    final BufferedReader bufferedReader;
    final BufferedWriter bufferedWriter;
    
  
    
    // Constructor
    public ClientHandlerPortal(Socket s, BufferedReader bufferedReader, BufferedWriter bufferedWriter) 
    {
        this.s = s;
        this.bufferedWriter = bufferedWriter;
        this.bufferedReader = bufferedReader;
    }
  
    @Override
    public void run() 
    {
    	 String messageFromClient = "Error" ;
        while (true) 
        {
            try {//--------------------------------------------------------------------------------------------------------------------------------
  
            	try {
            	  messageFromClient = bufferedReader.readLine();
            	}
            	catch(IOException dad) {
           	     try {
           						TimeUnit.SECONDS.sleep(1);
           					} catch (InterruptedException e1) {
           						// TODO Auto-generated catch block
           						e1.printStackTrace();
           					}
            		System.out.println("failsafe");
            	}
            	
            	if(messageFromClient == null){
           	     
           						
            		System.out.println("Failsafe");
            		
            		s.close();
            		break;
           	     
            	}
        	 
     		    System.out.println("Raw Message From Client: " + messageFromClient);
     		    
     		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yy");  
     		   LocalDateTime now = LocalDateTime.now();  
	    	   String systemCurrentDate = dtf.format(now);
	    	   
	    	   if(messageFromClient.equals("alertMessagesRequest")) {
	    			try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalAlertMessages.txt"))) {
     	 			    String line;
     	 			    String totalLine = "";
     	 			    
     		    		  String date = dtf.format(now);
     		    		  String[] currentDateFormatted = date.split("/");
     		    		 System.out.println("currentDateFormatted: " + Arrays.toString(currentDateFormatted));
     	 			    
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     	 			    	if(!line.equals("")) {
     	 			    	
     	 			    	
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
     	 							
     	 							bufferedWriter.write("Todays event is " + lineFormatted[1] + " on " + lineFormatted[0]);
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     		 			    	}
     		 			    	
     		 			    	else if (CurrentdayFormatter == ExpirationdayFormatter - 1) {
     		 			    		System.out.println("Tomorrow");
     	 			    			bufferedWriter.write("alertMessage_Reponse");
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     	 							
     	 							bufferedWriter.write("Tomorrows event is " + lineFormatted[1] + " on " + lineFormatted[0]);
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     		 			    	}
     		 			    	else if(CurrentdayFormatter < ExpirationdayFormatter && CurrentdayFormatter > ExpirationdayFormatter - 7) {
     		 			    		System.out.println("This week");
     	 			    			bufferedWriter.write("alertMessage_Reponse");
     	 							bufferedWriter.newLine();
     	 							bufferedWriter.flush();
     	 							
     	 							bufferedWriter.write("This week " + lineFormatted[1] + " is scheduled on " + lineFormatted[0]);
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
     	 			    
     	    		
     	 			    }
     					
     					System.out.println("Total Line: " + totalLine);
     	 			} catch(Exception da) {
     	 				System.out.println("Exception: " + da);
     	 			}
	    	   }
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
     		    if(messageFromClient.equals("registerRequest")) {
     		    	String nikkitUsername = bufferedReader.readLine();
     		    	String registeredUsername = bufferedReader.readLine();
     		    	String email = bufferedReader.readLine();
     		    	String password = bufferedReader.readLine();
     		    	boolean nikkitBoolean = true;
     		    	boolean registeredUsernameBoolean = true;
     		    	System.out.println("Nikkit Username: " + nikkitUsername);
     		    	System.out.println("Registered Username: " + registeredUsername);
     		    	System.out.println("Email: " + email);
     		    	System.out.println("Password: " + password);
  
     		    	
     		    	
     		    	
     		    	File nikkitFile = new File("NIKKIT_Users/" + nikkitUsername + ".txt");
     	    		if(nikkitFile.exists()) {nikkitBoolean = false;}
     		    	
     	    		File RUFile = new File("Database/" + registeredUsername + ".txt");
     	    		if(RUFile.exists()) {registeredUsernameBoolean = false;}
     		    	
     	    		if(registeredUsernameBoolean == false || nikkitBoolean == false) {
     	    			System.out.println("Failure");
     	    			if(registeredUsernameBoolean == false) {
     	    				
     	    				bufferedWriter.write("login_request");
			    			bufferedWriter.newLine();
			    			bufferedWriter.flush();
			    			
			    			
     	    				bufferedWriter.write("login_userNameInvalid");
			    			bufferedWriter.newLine();
			    			bufferedWriter.flush();
     	    			}
     	    			
     	    			if(nikkitBoolean == false) {
     	    				
     	    				bufferedWriter.write("login_request");
			    			bufferedWriter.newLine();
			    			bufferedWriter.flush();
     	    				
     	    				bufferedWriter.write("login_nikkitInvalid");
			    			bufferedWriter.newLine();
			    			bufferedWriter.flush();
     	    			}
     	    			
     	    		}
     	    		
     	    		else {
     	    			
     	    			System.out.println("Success");
     	    			
     	   			bufferedWriter.write("login_request");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    				
	    				bufferedWriter.write("login_accountCreated");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			String startingRole = "Error";
	    			String startingRank = "Errror";
	 	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/sysSet.txt"))) {
     	 			    String line;
     	 			    while ((line = br.readLine()) != null) {
     	 			    	
     	 			    	if(line.startsWith("presetRole: ")) {
     	 			    		startingRole = line.replace("presetRole: ", "");
     	 			    		break;
     	 			    	}
     	 			    	
     	 			    }
     	 			    }
	 	 			
	 	 			
	 	 			
	 	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/sysSet.txt"))) {
     	 			    String line;
   	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.startsWith("presetRank: ")) {
 	 			    		startingRank = line.replace("presetRank: ", "");
 	 			    		System.out.println("Preset Rank: " + startingRank);
 	 			    		break;
 	 			    	}
 	 			    	
 	 			    }
	 	 			}
	    			
	    			
	    		      File myObj = new File("Database/" + registeredUsername + ".txt");
				      if (myObj.createNewFile()) {
							try {
							      FileWriter myWriter = new FileWriter("Database/" + registeredUsername + ".txt");
							      myWriter.write("NameID: " + registeredUsername);
							      myWriter.write(System.getProperty( "line.separator" ));
							      myWriter.write("RankID: " + startingRank);
							      myWriter.write(System.getProperty( "line.separator" ));
							      myWriter.write("DateID: " + systemCurrentDate);
							      myWriter.write(System.getProperty( "line.separator" ));
							      myWriter.write("RoleID: " + startingRole);
							      myWriter.write(System.getProperty( "line.separator" )); 
							      myWriter.write("NIKKITLINK: " + nikkitUsername);
							      myWriter.write(System.getProperty( "line.separator" )); 
							      myWriter.close();
							    } catch (IOException e) {
							      System.out.println("An error occurred.");
							      e.printStackTrace();
							    }
				      }
	    			
						
	    		      File myObj2 = new File("NIKKIT_Users/" + nikkitUsername + ".txt");
				      myObj2.createNewFile(); 
							try {
							       FileWriter myWriter = new FileWriter("NIKKIT_Users/" + nikkitUsername + ".txt");
  							      myWriter.write("NIKKITUSER: " + nikkitUsername);
  							      myWriter.write(System.getProperty( "line.separator" ));
  							      myWriter.write("NIKKITEMAIL: " + email);
  							      myWriter.write(System.getProperty( "line.separator" ));
  							      myWriter.write("NIKKITPASSWORD: " + password);
  							      myWriter.write(System.getProperty( "line.separator" ));
  							      myWriter.write("NIKKITRegisteredUser: " + registeredUsername);
  							      myWriter.write(System.getProperty( "line.separator" ));
  							      myWriter.close();
  							      
							      myWriter.close();
							    } catch (IOException e) {
							      System.out.println("An error occurred.");
							      e.printStackTrace();
							    }
							
							
 							try {
							      FileWriter myWriter = new FileWriter("Resources/dataBaseFullRecordsRaw.txt", true);
							      myWriter.write("Name: " + registeredUsername + " ");
							      myWriter.write(System.getProperty( "line.separator" ));
							      myWriter.write(registeredUsername + " Absences 0");
							      myWriter.write(System.getProperty( "line.separator" ));
							      myWriter.write(registeredUsername + " Warnings 0");
							      myWriter.write(System.getProperty( "line.separator" ));
							      myWriter.write(registeredUsername + " Commendations 0");
							      myWriter.write(System.getProperty( "line.separator" )); 
							      myWriter.write(registeredUsername + " Notes 0");
							      myWriter.write(System.getProperty( "line.separator" )); 
							      myWriter.close();
							    } catch (IOException e) { 
							      System.out.println("An error occurred.");
							      e.printStackTrace();
							    }
				      
 			    			
 			    		      File myObj3 = new File("messageCenter/" + registeredUsername + ".txt");
 						      myObj.createNewFile();
 						      
 						      
 							    
   							try {
     						      FileWriter myWriter = new FileWriter("Resources/messageCenter.txt",true);
     						      myWriter.write(registeredUsername + ":0");
     						      myWriter.write(System.getProperty( "line.separator" ));
     						      myWriter.close();

     						    } catch (IOException e) {
     						      System.out.println("An error occurred.");
     						      e.printStackTrace();
     						    }
 						      
	    			
     	    		}
     		    	
     		    }//Register Request
     		    
     		    
     		   
     		  if(messageFromClient.equals("pollStates")) {
     			  String serverState = "";
     				try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollStates.txt"))) {
     	 			    String line;
     	 			    while ((line = br.readLine()) != null) {
     	 			    	System.out.println("Line " + line);
     	 			    	if(!line.equals("")) {
     	 			    	serverState = line;
     	 			    	}
     	 			    }
     	 			    }
     				System.out.println("---------------pollStates-----------------");
     				System.out.println("serverState " + serverState);
     				bufferedWriter.write("pollState_Data");
        			bufferedWriter.newLine();
        			bufferedWriter.flush();
        			
        			bufferedWriter.write(serverState);
        			bufferedWriter.newLine();
        			bufferedWriter.flush();
     		  }
     		   
     		   
     		   
     		   if(messageFromClient.equals("login_request")) {
     			   System.out.println("Login Requested");
     			  String userName = bufferedReader.readLine(); 
     			  String password = bufferedReader.readLine(); 
     			  
     			 File file = new File("NIKKIT_Users/" + userName + ".txt");
  	    		if(!file.exists()) { 
  	  			bufferedWriter.write("login_accountNotFound");
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
  	    		}
  	    		else {
  	    			
  	    			String truePassword = "";
  	    			BufferedReader reader;
  	    			try {
  	    				reader = new BufferedReader(new FileReader("NIKKIT_Users/" + userName + ".txt"));
  	    				String line = reader.readLine();
  	    				while (line != null) {
  	    					System.out.println("Trying to get NIKKIT PASSWORD");
  	    					if(line.startsWith("NIKKITPASSWORD: ")) {
  	    						truePassword = line.replace("NIKKITPASSWORD: ", "");
  	    						System.out.println("NIKKIT password found: " + truePassword);
  	    					}
  	    					
  	    					line = reader.readLine();
  	    					
  	    				}
  	    				reader.close();
  	    			} catch (IOException e) {
  	    				e.printStackTrace();
  	    			}
  	    			if(truePassword.equals(password)) {
  	    			//----------------------------INFO GATHERING vvv
  	    				
  	    				String registeredUser = "Error";
  	    				String email = "Error";
  	    				String passwordToSend = "Error";
  	    				String rank = "Error";
  	    				String role = "Error";
  	    				String StartingDate = "Error";
  		    			try {
  	  	    				reader = new BufferedReader(new FileReader("NIKKIT_Users/" + userName + ".txt"));
  	  	    				String line = reader.readLine();
  	  	    				while (line != null) {
  	  	    					if(line.startsWith("NIKKITRegisteredUser: ")) {
  	  	    					registeredUser = line.replace("NIKKITRegisteredUser: ", "");
  	  	    					}line = reader.readLine();	 }		
  	  	    				reader.close();
  	  	    			} catch (IOException e) { 	e.printStackTrace(); }
  		    			
  		    			
  		    			try {
  	  	    				reader = new BufferedReader(new FileReader("NIKKIT_Users/" + userName + ".txt"));
  	  	    				String line = reader.readLine();
  	  	    				while (line != null) {
  	  	    					if(line.startsWith("NIKKITEMAIL: ")) {
  	  	    					email = line.replace("NIKKITEMAIL: ", "");
  	  	    					}line = reader.readLine();	 }		
  	  	    				reader.close();
  	  	    			} catch (IOException e) { 	e.printStackTrace(); }
  		    			
  		    			try {
  	  	    				reader = new BufferedReader(new FileReader("NIKKIT_Users/" + userName + ".txt"));
  	  	    				String line = reader.readLine();
  	  	    				while (line != null) {
  	  	    					if(line.startsWith("NIKKITPASSWORD: ")) {
  	  	    					passwordToSend = line.replace("NIKKITPASSWORD: ", "");
  	  	    					}line = reader.readLine();	 }		
  	  	    				reader.close();
  	  	    			} catch (IOException e) { 	e.printStackTrace(); }
  		    			
  		    			
  		    			
	  	    				
  		    			
  		    			
  		    			try {
  	  	    				reader = new BufferedReader(new FileReader("Database/" + registeredUser + ".txt"));
  	  	    				String line = reader.readLine();
  	  	    				while (line != null) {
  
  	  	    					if(line.startsWith("RoleID: ")) {
  	  	    					role = line.replace("RoleID: ", "");
  	  	    					}line = reader.readLine();	 }  	  	    				
  	  	    				reader.close();
  	  	    			} catch (IOException e) { 	e.printStackTrace(); }
  		    			
  		    			try {
  	  	    				reader = new BufferedReader(new FileReader("Database/" + registeredUser + ".txt"));
  	  	    				String line = reader.readLine();
  	  	    				while (line != null) {
  
  	  	    					if(line.startsWith("RankID: ")) {
  	  	    					rank = line.replace("RankID: ", "");
  	  	    					}line = reader.readLine();	 }  	  	    				
  	  	    				reader.close();
  	  	    			} catch (IOException e) { 	e.printStackTrace(); }
  		    			
  		    			try {
  	  	    				reader = new BufferedReader(new FileReader("Database/" + registeredUser + ".txt"));
  	  	    				String line = reader.readLine();
  	  	    				while (line != null) {
  
  	  	    					if(line.startsWith("DateID: ")) {
  	  	    					StartingDate = line.replace("DateID: ", "");
  	  	    					}line = reader.readLine();	 }  	  	    				
  	  	    				reader.close();
  	  	    			} catch (IOException e) { 	e.printStackTrace(); }
  		    			
	  	    				
	   

  		    			
  	    				
  		    			
  		    			//----------------------------INFO GATHERING ^^^
  	    				System.out.println("Username and passwords match");
  	    				
  	    	  			bufferedWriter.write("login_success");
  	  	      			bufferedWriter.newLine();
  	  	      			bufferedWriter.flush();
  	  	      			
  	
  	  	      			
  	    				bufferedWriter.write(registeredUser);
  	  	      			bufferedWriter.newLine();
  	  	      			bufferedWriter.flush();
  	  	      			
  	  				bufferedWriter.write(email);
	  	      			bufferedWriter.newLine();
	  	      			bufferedWriter.flush();
	  	      			
	  	  			bufferedWriter.write(passwordToSend);
	  	      			bufferedWriter.newLine();
	  	      			bufferedWriter.flush();
	  	      			
	  	  			bufferedWriter.write(rank);
	  	      			bufferedWriter.newLine();
	  	      			bufferedWriter.flush();
	  	      			
	  	  			bufferedWriter.write(role);
	  	      			bufferedWriter.newLine();
	  	      			bufferedWriter.flush();
	  	      			
	  	      		bufferedWriter.write(StartingDate);
  	      			bufferedWriter.newLine();
  	      			bufferedWriter.flush();
  	      			
  	  			bufferedWriter.write(userName);
	      			bufferedWriter.newLine();
	      			bufferedWriter.flush();
  	  	      	
  	  	      			
  	    			}
  	    			if(!truePassword.equals(password)) {
  	    				System.out.println("Password does not match");
  	    			bufferedWriter.write("login_passwordInvalid");
  	      			bufferedWriter.newLine();
  	      			bufferedWriter.flush();
  	      			
  	    			}
  	    			
  	    			
  	    			
  	    		}
  	    		
  	    		
  	    		
     			  
     		   }//LOGIN REQUEST
     		   
     		  if(messageFromClient.equals("attendanceInformationRequest")) {
     			 String target = bufferedReader.readLine();
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
	
   	 			
   	 			
   	 			
   	 			
 				try (Stream<String> stream = Files.lines(Paths.get("Database/" + target + ".txt"))) {

 			        List<String> abc = stream.filter(str->str.startsWith("loggedAbsence: "))
 			                                 .map(s->s.split("loggedAbsence: ")[1]).collect(Collectors.toList());

 			        String loggedAbsences = abc.toString();
 			     
 			        System.out.println("loggedAbsences Located: " + loggedAbsences);    
 			        
 			        
 		    		bufferedWriter.write("attendanceAbsenceActivityData");
 					bufferedWriter.newLine();
 					bufferedWriter.flush();
 					
 		    		bufferedWriter.write(loggedAbsences);
 					bufferedWriter.newLine();
 					bufferedWriter.flush();

 					
 		    		System.out.println("Sent:" + abc);
 		    		
 		    		

 			    } catch (IOException e) {
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
				
				
				
				
				
     			 
     		 }//---------------------------------------------
     		 if(messageFromClient.equals("verifyDisconnect")) {
     			 System.out.println("Thread for User Verification Closed for continuation to Portal");
     			 s.close();
     			break;
     		 }
     		
     	    	
     		 if(messageFromClient.equals("portalMainDisconnectForVerify")) {
     			 s.close();
     			 System.out.println("Thread to portal closed for User Verification");
     			break;
     		 }
     		
     		 
     		 
     		 
     		 
     		 
     		 
     		 
     		 
     		 
     		 
     		 
     		 
     		if(messageFromClient.equals("portalAbsenceRegistration")) {
     			String target = bufferedReader.readLine();
     			String requestExcused = bufferedReader.readLine();
     			String reason = bufferedReader.readLine();
     			String eventName = bufferedReader.readLine();
     			String eventNumber = "Error";
     			
     			System.out.println("eventName: " + eventName);
	
				try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	System.out.println("Line: " + line);
	 			    	
	 			    	if(line.startsWith("event1: " + eventName)) {
	 			    		eventNumber = "1";
	 			    		break;
	 			    	}
	 			    	else if(line.startsWith("event2: " + eventName)) {
	 			    		eventNumber = "2";
	 			    		break;
	 			    	}
	 			    	else if(line.startsWith("event3: " + eventName)) {
	 			    		eventNumber = "3";
	 			    		break;
	 			    	}
	 			    	else if(line.startsWith("event4: " + eventName)) {
	 			    		eventNumber = "4";
	 			    		break;
	 			    	}
	 			    	else if(line.startsWith("event5: " + eventName)) {
	 			    		eventNumber = "5";
	 			    		break;
	 			    	}
	 			    	else {
	 			    		eventNumber = "Custom";
	 			    	}
	 			    }
				}
				
				String warningBoolean = "Error";
				try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
	 			    String line;
	 			    while ((line = br.readLine()) != null) {
	 			    	if(line.startsWith("event" + eventNumber + "WARNING: ")) {
	 			    		warningBoolean = line.replace("event" + eventNumber + "WARNING: ", "");
	 			    	}
	 			    }
	 			    }
				
				System.out.println("warningBoolean: " + warningBoolean);
				
				
					boolean absenceBoolean = true;
					String absenceData = "Error";
					try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
		 			    String line;
		 			    while ((line = br.readLine()) != null) {
		 			    	if(line.startsWith("event" + eventNumber + "absenceBoolean: ")) {
		 			    		absenceData = line.replace("event" + eventNumber + "absenceBoolean: ", "");
		 			    	}
		 			    }
		 			    }
				
					if(absenceData.equals("applyAbsence")) {absenceBoolean = true; } if(absenceData.equals("DoNotApplyAbsence")) {absenceBoolean = false;}
				
					boolean excuseBoolean = true;
					String excuseData = "Error";
					try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar.txt"))) {
		 			    String line;
		 			    while ((line = br.readLine()) != null) {
		 			    	if(line.startsWith("event" + eventNumber + "excused: ")) {
		 			    		excuseData = line.replace("event" + eventNumber + "excused: ", "");
		 			    	}
		 			    }
		 			    }
					if(excuseData.equals("excused")) {excuseBoolean = false;} if(excuseData.equals("notExcused")) {excuseBoolean = true;}
						
						
					
					if(absenceBoolean = true) {
				try {
				      FileWriter myWriter = new FileWriter("Database/" + target + ".txt", true);
				      myWriter.write("loggedAbsence: " + eventName);
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("loggedAbsenceDate: " + systemCurrentDate);
				      myWriter.write(System.getProperty( "line.separator" ));
				      if(warningBoolean.equals("DoApplyWarning")){
					      myWriter.write("loggedWarning: AA " + eventName);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("loggedWarningDate: " + systemCurrentDate);
					      myWriter.write(System.getProperty( "line.separator" ));
				      }
				      if(excuseBoolean = true) {
					      myWriter.write("loggedNote: Excused: " + eventName);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("loggedNoteDate: " + systemCurrentDate);
					      myWriter.write(System.getProperty( "line.separator" ));
				      }
				      
				      
				      myWriter.close();
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				
					}
	 			    	
				
				
	 					try {
	 					      FileWriter myWriter = new FileWriter("Resources/event" + eventNumber + "Attendance.txt", true);
	 					     System.out.println("Path: " + "Resources/event" + eventNumber + "Attendance.txt");
	 					      if(eventNumber.equals("Custom")) {
		 					      myWriter.write(target + "Event - " + eventName + " - REASON: " + reason);
		 					      myWriter.write(System.getProperty( "line.separator" ));
	 					      }
	 					      else {
		 					      myWriter.write(target + " - REASON: " + reason);
		 					      myWriter.write(System.getProperty( "line.separator" ));
	 					      }
	 					      
	 					      
	 					      myWriter.close(); 
	 					    } catch (IOException e) {
	 					      System.out.println("An error occurred.");
	 					      e.printStackTrace();
	 					    }//-----------------------------------------------------------------------------------------
	 					
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
	 					
							  String state = "";
	 					
							  try (BufferedReader br = new BufferedReader(new FileReader("Resources/stateChanges.txt"))) {
			   		 			    String line;
			   		 			  
			   		 			    while ((line = br.readLine()) != null) {
			   		 			    	System.out.println("Line: " + line);
			   		 			    	if(line.startsWith("attendance:"))
			   		 			    	{state = line.replace("attendance:", ""); 
			   		 			    	System.out.println("CAUGHT");
			   		 			    	}
			   		 			    }
							  }
			   		 			    System.out.println("State: " + state);
			   		 			    String originalState = state;
			   		 			  System.out.println("originalState: " + originalState);
			   		 			    int stateInt = Integer.parseInt(state);
			   		 			    stateInt++;
			   		 			 System.out.println("stateInt: " + stateInt);
			   		 			    state = String.valueOf(stateInt);
			   		 			System.out.println("state: " + state);
			   		 			    
			   		 				Path path = Paths.get("Resources/stateChanges.txt");
			   	 					Charset charset = StandardCharsets.UTF_8;
			   	 					
			   	 					String content = new String(Files.readAllBytes(path), charset);
			   	 					content = content.replace("attendance:" + originalState, "attendance:" + state);
			   	 					Files.write(path, content.getBytes(charset));
			   	 					
			   		 			    
				    			  
	 					
	 			    	
	 			    	
	 			    	
	 			    	
	 			    	
	 			    
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
     		
     		
     		if(messageFromClient.equals("MIPcalendarFullRequest")) {
     			
	    		 File directoryPath = new File("Resources/portalCalendar");
	    		  File filesList[] = directoryPath.listFiles();
	    	      for(File file : filesList) {
	    	    	  String fileStr = file.getName();
	    	    	  System.out.println("File String: " + fileStr);
	    	    	  fileStr = fileStr.replace(".txt","");
	    	    	 String date = fileStr;
	    	    	 
	    			  try (BufferedReader br = new BufferedReader(new FileReader("Resources/portalCalendar/" + fileStr + ".txt"))) {
   		 			    String line;
   		 			    String eventName = "Error";
   		 			    String eventDetails = "Error";
   		 			    while ((line = br.readLine()) != null) {
   		 			    	if(line.startsWith("eventName: "))
   		 			    	{eventName = line.replace("eventName: ", ""); }
   		 			    	if(line.startsWith(eventName + "Info: "))
   		 			    	{eventDetails = line.replace(eventName + "Info: ", ""); }
   		 			    }
   		 			    	System.out.println("SENDING");
   		 				bufferedWriter.write("fullCalendarData");
 	 					bufferedWriter.newLine();
 	 					bufferedWriter.flush();
   		 			    	
 	 					bufferedWriter.write(date);
 	 					bufferedWriter.newLine();
 	 					bufferedWriter.flush();
 	 					
 	 					bufferedWriter.write(eventName);
 	 					bufferedWriter.newLine();
 	 					bufferedWriter.flush();
 	 					
 	 					bufferedWriter.write(eventDetails);
 	 					bufferedWriter.newLine();
 	 					bufferedWriter.flush();
   		 			    	
   		 			    
	    			  }
	    	    	  
	    	    	  
	    	      }
     			
     			
     			
     		}
 
     		if(messageFromClient.equals("CalendarRequestMIP")) {
     			System.out.println("Calendar MIP accessed");
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
 	    	    		 			    	 System.out.println(line + " | eventName: ");
 	    	    		 			    	 System.out.println(line + " | " + event + "Info: ");
 	    	    		 			    	if(line.startsWith("eventName: ")) {
 	    	    		 			    		 event = line.replace("eventName: ", "");
 	    	    		 			    		System.out.println("CAUGHT 2");
 	    	    		 			    	}
 	    	    		 			    	 if(line.startsWith(event + "Info: ")) {
 	    	    		 			    		System.out.println("CAUGHT");
 	    	    		 			    		info = line.replace(event + "Info: ", "");
 	    	    		 			    	 }
 	    	    		 			    	
 	    	    		 			    
 	    	    		 			    }
 	    	    		 			    
 	    	    		 			    

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
     		 
     		if(messageFromClient.equals("pollInformationRequest")) {
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
				 				
				 				
				 				  String serverState = "";
				     				try (BufferedReader br = new BufferedReader(new FileReader("Resources/pollStates.txt"))) {
				     	 			    String line;
				     	 			    while ((line = br.readLine()) != null) {
				     	 			    	System.out.println("Line " + line);
				     	 			    	if(!line.equals("")) {
				     	 			    	serverState = line;
				     	 			    	}
				     	 			    }
				     	 			    }
				     				System.out.println("serverState" + serverState);
				        			bufferedWriter.write(serverState);
				        			bufferedWriter.newLine();
				        			bufferedWriter.flush();
				 				
				 				
				 				
				 			} catch (IOException dad) {}
     			
			     		
     			
     		}
 			
     		if(messageFromClient.equals("poll_inputData")) {
     			String pollNumber = bufferedReader.readLine();
     			System.out.println("pollNumber " + pollNumber);
     			String answerNumber = bufferedReader.readLine();
     			String target = bufferedReader.readLine();
     			String answerRecordedn = "Error";
     			boolean answerRecordedBoolean = true;
     			
     			if(pollNumber.equals("poll_1")) {pollNumber = "One";}
     			if(pollNumber.equals("poll_2")) {pollNumber = "Two";}
     			if(pollNumber.equals("poll_3")) {pollNumber = "Three";}
     			if(pollNumber.equals("poll_4")) {pollNumber = "Four";}
     			System.out.println("Post pollNumber " + pollNumber);
     			
    			try (BufferedReader br = new BufferedReader(new FileReader("Resources/poll"+  pollNumber +"Data.txt"))) {
 	 			    String line;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	
 	 			    	if(line.startsWith("1 " + target)) {
 	 			    		answerRecordedBoolean = false;
 	 			    		answerRecordedn = "1 ";
 	 			    	}
 	 			    	if(line.startsWith("2 " + target)) {
 	 			    		answerRecordedBoolean = false;
 	 			    		answerRecordedn = "2 ";
 	 			    	}
 	 			    	if(line.startsWith("3 " + target)) {
 	 			    		answerRecordedBoolean = false;
 	 			    		answerRecordedn = "3 ";
 	 			    	}
 	 			    	if(line.startsWith("4 " + target)) {
 	 			    		answerRecordedBoolean = false;
 	 			    		answerRecordedn = "4 ";
 	 			    	}

 	 			    }
 	 			    }
    			
    			
    			
      			
      			if(answerRecordedBoolean == false) {
      				System.out.println("Target has already answered");
      			
      				Path path = Paths.get("Resources/poll"+  pollNumber +"Data.txt");
 					Charset charset = StandardCharsets.UTF_8;
 					
 					String content = new String(Files.readAllBytes(path), charset);
 					content = content.replaceAll(answerRecordedn + target, answerNumber + " " + target);
 					Files.write(path, content.getBytes(charset));
 					
 					bufferedWriter.write("poll_updateDataTypeTwo");
 					bufferedWriter.newLine();
 					bufferedWriter.flush();
 					bufferedWriter.write("Answer change from " + answerRecordedn + "to " + answerNumber);
 					bufferedWriter.newLine();
 					bufferedWriter.flush();
      				
      			}else {
     			
    			try {
				      FileWriter myWriter = new FileWriter("Resources/poll" + pollNumber + "Data.txt", true);
				      myWriter.write(answerNumber + " " + target);
				      myWriter.write(System.getProperty( "line.separator" ));
						bufferedWriter.write("poll_updateData");
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
	 					bufferedWriter.write("Answer Applied");
	 					bufferedWriter.newLine();
	 					bufferedWriter.flush();
				      myWriter.close();
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
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
     		
     	  	if(messageFromClient.equals("MIPinboxRequest")) {
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
		    			
		    			
		    	
		    			
 	 			    	
 	 			    
 	 			    }
     	  		
     	  	}
     	  	
     	  	if(messageFromClient.equals("messageStates")) { // login
     	  		System.out.println("------------------------MESSAGE STATES------------");
     	  		String user = bufferedReader.readLine();
     	  		System.out.println("user " + user);
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
     	  	
     	  	
     	  	if(messageFromClient.equals("messageStateCheck")) {
      	  		System.out.println("------------------------MESSAGE STATES------------");
     	  		String user = bufferedReader.readLine();
     	  		System.out.println("user " + user);
 	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/messageStates.txt"))) {
 	 			    String line;
 	 			    String messageState;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	System.out.println("Line: " + line);
 	 			    	if(line.startsWith(user + ":")) {
 	 			    		messageState = line.replace(user + ":", "");
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
     	  	
     	  	
     		if(messageFromClient.equals("messageInputRequest")) {
      	
 	    	   
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
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		String state = "";
 	    		
				  try (BufferedReader br = new BufferedReader(new FileReader("Resources/messageStates.txt"))) {
 		 			    String line;
 		 			  System.out.println("username " + username);
 		 			    while ((line = br.readLine()) != null) {
 		 			    	System.out.println("Line: " + line);
 		 			    	if(line.startsWith(username + ":"))
 		 			    	{state = line.replace(username + ":", ""); 
 		 			    	System.out.println("CAUGHT");
 		 			    	}
 		 			    }
				  }
 		 			    System.out.println("State: " + state);
 		 			    String originalState = state;
 		 			  System.out.println("originalState: " + originalState);
 		 			    int stateInt = Integer.parseInt(state);
 		 			    stateInt++;
 		 			 System.out.println("stateInt: " + stateInt);
 		 			    state = String.valueOf(stateInt);
 		 			System.out.println("state: " + state);
 		 			    
 		 				Path path = Paths.get("Resources/messageStates.txt");
 	 					Charset charset = StandardCharsets.UTF_8;
 	 					
 	 					String content = new String(Files.readAllBytes(path), charset);
 	 					content = content.replace(username + ":" + originalState, username + ":" + state);
 	 					Files.write(path, content.getBytes(charset));
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
 	    		
     			
     		}
     		
     		if(messageFromClient.equals("requestCommand")) {
     			String username = bufferedReader.readLine();
     			String type = bufferedReader.readLine();
     			String data = bufferedReader.readLine();
     			String requestNumerStr = "Error";
     			boolean requestNumberBooleanCheck = true;

     			while(true) {
         			int requestNumber = 1000 + (int)(Math.random() * ((999) + 1000));
         			 requestNumerStr = String.valueOf(requestNumber);
         			 System.out.println("Random Number: " + requestNumerStr );
         			
 	 			try (BufferedReader br = new BufferedReader(new FileReader("Resources/requestData.txt"))) {
 	 			    String line;
 	 			    while ((line = br.readLine()) != null) {
 	 			    	System.out.println("Line: " + line);
 	 			    	
 	 			    	if(line.startsWith(requestNumerStr + " :")) {
 	 			    		System.out.println("Copy found");
 	 			    	 requestNumberBooleanCheck = false;
 	 			    	}
 	 			    	
 	 			    	
 	 			    }
 	 			    System.out.println(" requestNumberBooleanCheck: " +  requestNumberBooleanCheck);
 	 			    if(requestNumberBooleanCheck == true) {
 	 			    	System.out.println("ALL TRUE");
 	 			    	break;
 	 			    	
 	 			    }
 	 			    
 	 			    }
     		}
 	 			
 	 			
     		
     			
				try {
				      FileWriter myWriter = new FileWriter("Resources/requestData.txt", true);
				      myWriter.write("Request Number: " + requestNumerStr + " | User: " + username + " | Request Type: " + type + " | Requested Change: " + data);
				      
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.close();
				      
				      
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
     			
     			
				bufferedWriter.write("requestsNumberData");
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
 				
 				bufferedWriter.write(requestNumerStr);
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			
     			
     		}
     	  	
   
     		
     	
     		
     		
     	    	if(messageFromClient.equals("CLOSE")) {
     	    		System.out.println("Exit Command Recieved");
     	    		s.close();
     	    		break;
     	    	}
            }//try-----------------------------------------------------------------------------------------------------------------------------------------
            catch (IOException e) {
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