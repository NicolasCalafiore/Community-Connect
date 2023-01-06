import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

import com.formdev.flatlaf.FlatLightLaf;
public class userVerify{
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;

public static void main (String[] args) throws Exception {
	Socket socket = new Socket("localhost", 4321);
	  OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
	  BufferedWriter bufferedWriter =  new BufferedWriter(outputStreamWriter);
	  JTextField textField_2 = new JTextField();
	  JTextField textField_3 = new JTextField();
	  JTextField textField_4 = new JTextField();
	  JTextField textField_5 = new JTextField();
	  
	  FlatLightLaf.setup();
	
	 JFrame frame = new JFrame("NIKKIT Register");
	    frame.setSize(750,400);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 

	    frame.addWindowListener(new WindowAdapter() {

	        @Override
	        public void windowClosing(WindowEvent e) {
	        	try {
	        		
	        		bufferedWriter.write("CLOSE");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	        	outputStreamWriter.close();
	        	bufferedWriter.close();
	        	socket.close();
	        	}
	        	catch(IOException FailedToDischargeSocket) {
	        		System.out.println("Error 9");
	        	}
	        }
	    });
	    
	    frame.validate();
	    frame.setVisible(true);;
	    frame.setResizable(true);
	    
	    JPanel cardBoard = new JPanel();
	    cardBoard.setBackground(new Color(245, 245, 245));
	    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
	    groupLayout.setHorizontalGroup(
	    	groupLayout.createParallelGroup(Alignment.TRAILING)
	    		.addComponent(cardBoard, GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
	    );
	    groupLayout.setVerticalGroup(
	    	groupLayout.createParallelGroup(Alignment.TRAILING)
	    		.addComponent(cardBoard, GroupLayout.PREFERRED_SIZE, 361, Short.MAX_VALUE)
	    );
	    cardBoard.setLayout(new CardLayout(0, 0));
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(245, 245, 245));
	    cardBoard.add(panel, "name_298105292774700");
	    
	    JPanel panel_1 = new JPanel();
	    cardBoard.add(panel_1, "name_298116887319800");
	    
	    JLabel lblNewLabel_1 = new JLabel("NIKKIT Account Creation");
	    lblNewLabel_1.setFont(new Font("Candara", Font.PLAIN, 21));
	    
	    JLabel lblNewLabel_1_1 = new JLabel("NIKKIT username:");
	    lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 14));
	    
	    //textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    
	    JLabel lblNewLabel_1_1_1 = new JLabel("This is a private username that will be used to login and connect to NIKKIT");
	    lblNewLabel_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 10));
	    
	    JLabel lblNewLabel_1_1_2 = new JLabel("Registered Username:");
	    lblNewLabel_1_1_2.setFont(new Font("Calibri", Font.PLAIN, 14));
	    
	   // textField_3 = new JTextField();
	    textField_3.setColumns(10);
	    
	    JLabel lblNewLabel_1_1_1_1 = new JLabel("This is a public username that will be visible to all members associated");
	    lblNewLabel_1_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 10));
	    
	    JLabel lblNewLabel_1_1_2_1 = new JLabel("Email:");
	    lblNewLabel_1_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 14));
	    
	   // textField_4 = new JTextField();
	    textField_4.setColumns(10);
	    
	    JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Not Required* Will help in resetting a password and/or information");
	    lblNewLabel_1_1_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 10));
	    
	    JLabel lblNewLabel_1_1_2_2 = new JLabel("Password:");
	    lblNewLabel_1_1_2_2.setFont(new Font("Calibri", Font.PLAIN, 14));
	    
	    //textField_5 = new JTextField();
	    textField_5.setColumns(10);
	    
	    JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("For Security...");
	    lblNewLabel_1_1_1_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 10));
	    
	    JLabel lblNewLabel_1_1_2_2_1 = new JLabel("NIKKIT Username Already Taken");
	    JLabel lblNewLabel_1_1_2_2_1_1 = new JLabel("Registered Username Already Taken");
	    
	    JButton btnNewButton_2 = new JButton("Validate & Submit");
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		String NIKKITusername = textField_2.getText();
	    			String registeredUsername =	textField_3.getText();
	    				String email = textField_4.getText();
	    				String pass = textField_5.getText();
	    				
	    				lblNewLabel_1_1_2_2_1.setVisible(false);
	    				lblNewLabel_1_1_2_2_1_1.setVisible(false);
	    				textField_2.setForeground(Color.black);
	    				textField_3.setForeground(Color.black);
	    				
	    				if(email.equals("")) {email = "N/A";}
	    				
	    				
	    				
	    				
	    				try {
	    				bufferedWriter.write("registerRequest");
	    				bufferedWriter.newLine();
		    			bufferedWriter.flush();
	    				bufferedWriter.write(NIKKITusername);
	    				bufferedWriter.newLine();
		    			bufferedWriter.flush();
	    				bufferedWriter.write(registeredUsername);
	    				bufferedWriter.newLine();
		    			bufferedWriter.flush();
	    				bufferedWriter.write(email);
	    				bufferedWriter.newLine();
		    			bufferedWriter.flush();
	    				bufferedWriter.write(pass);
	    				bufferedWriter.newLine();
		    			bufferedWriter.flush();
	    				
	    				}
	    				catch(Exception dad) {}
	    		
	    	}
	    });
	    

	    lblNewLabel_1_1_2_2_1.setForeground(Color.RED);
	    lblNewLabel_1_1_2_2_1.setFont(new Font("Calibri", Font.PLAIN, 14));
	    lblNewLabel_1_1_2_2_1.setVisible(false);
	    
	   
	    lblNewLabel_1_1_2_2_1_1.setVisible(false);
	    lblNewLabel_1_1_2_2_1_1.setForeground(Color.RED);
	    lblNewLabel_1_1_2_2_1_1.setFont(new Font("Calibri", Font.PLAIN, 14));
	    GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	    gl_panel_1.setHorizontalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 714, Short.MAX_VALUE)
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_1_2_2_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_1_2_2_1_1))
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
	    				.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1_2_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
	    				.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_1.createSequentialGroup()
	    					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
	    						.addComponent(lblNewLabel_1_1_1_1_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    						.addComponent(lblNewLabel_1_1_2_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
	    				.addComponent(btnNewButton_2, Alignment.TRAILING))
	    			.addContainerGap())
	    );
	    gl_panel_1.setVerticalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_1)
	    				.addComponent(lblNewLabel_1_1_2_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_1_1_2_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_1_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_1_1_2_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
	    			.addComponent(btnNewButton_2)
	    			.addContainerGap())
	    );
	    panel_1.setLayout(gl_panel_1);
	    frame.getContentPane().setLayout(groupLayout);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 255, 255)));
	    panel_2.setBackground(new Color(30, 30, 30));
	    
	    JPanel panel_3 = new JPanel();
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0))
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    
	    Icon icon = new ImageIcon("src/bin/asdasdasd.png");
	    JLabel lblNewLabel_4 = new JLabel(icon);
	    GroupLayout gl_panel_3 = new GroupLayout(panel_3);
	    gl_panel_3.setHorizontalGroup(
	    	gl_panel_3.createParallelGroup(Alignment.LEADING)
	    		.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
	    );
	    gl_panel_3.setVerticalGroup(
	    	gl_panel_3.createParallelGroup(Alignment.LEADING)
	    		.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
	    );
	    panel_3.setLayout(gl_panel_3);
	    
	    JLabel lblNikkitLogin = new JLabel("NIKKIT Login");
	    lblNikkitLogin.setForeground(new Color(15,242,255));
	    
	    lblNikkitLogin.setFont(new Font("Eras Bold ITC", Font.BOLD, 32));
	    JTextField textField_1_1 = new JTextField();
	    textField_1_1.setFont(new Font("Rockwell", Font.PLAIN, 11));
	    JLabel lblPassword = new JLabel("Password");
	    JLabel lblNewLabel = new JLabel("NIKKIT username");
	    lblNewLabel.setForeground(new Color(240, 248, 255));
	    lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
	    
	    
	    JTextField textField_6 = new JTextField();
	    textField_6.setFont(new Font("Rockwell", Font.PLAIN, 11));
	    MouseListener mouseListener2 = new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {
	            	lblPassword.setForeground(Color.white);
	            	textField_6.setForeground(Color.white);
	            	lblNewLabel.setForeground(Color.cyan);

	             }
	        }
	    };
	    textField_6.addMouseListener(mouseListener2);
	    
	    textField_6.setForeground(new Color(255, 255, 255));
	    textField_6.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
	    textField_6.setBackground(new Color(30, 30, 30));
	    
	    textField_6.setColumns(10);
	    
	
	    lblPassword.setForeground(new Color(240, 248, 255));
	    lblPassword.setFont(new Font("Calibri", Font.BOLD, 16));
	 
	    MouseListener mouseListener22 = new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {
	            	lblNewLabel.setForeground(Color.white);
	            	textField_1_1.setForeground(Color.white);
	            	lblPassword.setForeground(Color.cyan);

	             }
	        }
	    };
	    textField_1_1.addMouseListener(mouseListener22);
	    textField_1_1.setForeground(new Color(255, 255, 255));
	    textField_1_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
	    textField_1_1.setBackground(new Color(30, 30, 30));
	    
	    //textField_1 = new JTextField();
	    textField_1_1.setColumns(10);
	    
	    JButton btnCreateANikkit = new JButton("No account? Create a NIKKIT account");
	    btnCreateANikkit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoard.removeAll();
	    		cardBoard.add(panel_1);
	    		cardBoard.repaint();
	    		cardBoard.revalidate();
	    	}
	    });
	    btnCreateANikkit.setOpaque(false);
	    btnCreateANikkit.setForeground(new Color(0, 255, 255));
	    btnCreateANikkit.setFont(new Font("Rockwell", Font.BOLD, 11));
	    btnCreateANikkit.setFocusPainted(false);
	    btnCreateANikkit.setContentAreaFilled(false);
	    btnCreateANikkit.setBorderPainted(false);
	    
	    JButton btnNewButton = new JButton("Forgot Password?");
	    btnNewButton.setOpaque(false);
	    btnNewButton.setForeground(new Color(0, 255, 255));
	    btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 11));
	    btnNewButton.setFocusPainted(false);
	    btnNewButton.setContentAreaFilled(false);
	    btnNewButton.setBorderPainted(false);
	    
	    JButton btnNewButton_1 = new JButton("Sign In");
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String userName = textField_6.getText();
	    		
	    		String password = textField_1_1.getText();
	    		try {
	    		bufferedWriter.write("login_request");
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			
    			bufferedWriter.write(userName);
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			
    			bufferedWriter.write(password);
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			
	    		}catch(Exception dad) {}
    			
	    	}
	    });
	    
	    Icon icon122 = new ImageIcon("src/bin/icons8_cell_phone_26px_3.png");
	    JButton btnNewButton_3 = new JButton(icon122);
	    btnNewButton_3.setOpaque(false);
	    btnNewButton_3.setContentAreaFilled(false);
	    btnNewButton_3.setBorderPainted(false);
	    
	    Icon icon1222 = new ImageIcon("src/bin/icons8_mail_26px.png");
	    JButton btnNewButton_3_1 = new JButton(icon1222);
	    btnNewButton_3_1.setOpaque(false);
	    btnNewButton_3_1.setContentAreaFilled(false);
	    btnNewButton_3_1.setBorderPainted(false);
	    
	    
	    GroupLayout gl_panel_2 = new GroupLayout(panel_2);
	    gl_panel_2.setHorizontalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(57)
	    					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNikkitLogin, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
	    						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
	    							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    								.addGroup(gl_panel_2.createSequentialGroup()
	    									.addGap(9)
	    									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
	    										.addComponent(lblNewLabel)
	    										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
	    										.addComponent(lblPassword)
	    										.addComponent(textField_1_1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))
	    								.addComponent(btnCreateANikkit))
	    							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(99)
	    					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
	    					.addGap(44)
	    					.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_2.createSequentialGroup()
	    					.addGap(45)
	    					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(83, Short.MAX_VALUE))
	    );
	    gl_panel_2.setVerticalGroup(
	    	gl_panel_2.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNikkitLogin)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(textField_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(btnCreateANikkit)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(btnNewButton)
	    			.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
	    			.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(btnNewButton_3_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    panel_2.setLayout(gl_panel_2);
	    panel.setLayout(gl_panel);
	    
	    
	    
	    
	    
	    
	    
	    
//---------------------------------------------------------------Server Functions--------------------------------------------------------------------------------------------------------------------------
	    
	    class readingThread implements Runnable {

	        public void run(){
	 

	    try {
 
   	InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());	
   	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	    
	    while(true) {
	    	System.out.println("Verify Portal Listening");
	    	String messageFromServer = bufferedReader.readLine();
	    	System.out.println("Message from server: " + messageFromServer);
	    	
	    	
	    	if(messageFromServer.equals("login_request")) {
	    		String loginTarget = bufferedReader.readLine();
	    		
	    		if(loginTarget.equals("login_nikkitInvalid")) {
	    			System.out.println("NIKKIT Invalid");
	    			textField_2.setForeground(Color.red);
	    			lblNewLabel_1_1_2_2_1.setVisible(true);
	    		}
	    		if(loginTarget.equals("login_userNameInvalid")) { 
	    			System.out.println("Username Invalid");
	    			textField_3.setForeground(Color.red);
	    			lblNewLabel_1_1_2_2_1_1.setVisible(true);
	    		}
	    		if(loginTarget.equals("login_accountCreated")) {
	    			System.out.println("Account Created");
	    			
	    			String document = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
	    			File file = new File(document + "/NIKKITUSERDATA");
	    			file.createNewFile();
	    			
	    			String passwordCreated = textField_5.getText();
	    			String nikkitLogin = textField_2.getText();
	    		
						try {
						      FileWriter myWriter = new FileWriter(document + "/NIKKITUSERDATA", false);
						      myWriter.write("NIKKITLOGIN: " + nikkitLogin);
						      myWriter.write(System.getProperty( "line.separator" ));
						      myWriter.write("NIKKITPASS: " + passwordCreated);
						      myWriter.write(System.getProperty( "line.separator" ));
						      myWriter.write("messages: " + 0);
						      myWriter.write(System.getProperty( "line.separator" ));
						      myWriter.close();

						    } catch (IOException e) {
						      System.out.println("An error occurred.");
						      e.printStackTrace();
						    }
						
				  		cardBoard.removeAll();
			    		cardBoard.add(panel);
			    		cardBoard.repaint();
			    		cardBoard.revalidate();
	    			
	    		}
	    		
	    	}//LOGIN REQUESTS
	    	
	    	if(messageFromServer.equals("login_accountNotFound")) {
	    		lblNewLabel.setForeground(Color.red);
	    		textField_6.setForeground(Color.red);
	    	}
	    	
	    	if(messageFromServer.equals("login_passwordInvalid")) {
	    		lblPassword.setForeground(Color.red);
	    		textField_1_1.setForeground(Color.red);
	    	}
	    	if(messageFromServer.equals("login_success")) {
	    		String userName = textField_6.getText();
	    		String password = textField_1_1.getText();
	    		
	    		
	    		
	    		String document = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
    			File file = new File(document + "/NIKKITUSERDATA");
    			file.createNewFile();
    			
    			String passwordCreated = textField_5.getText();
    			String nikkitLogin = textField_2.getText();
    		
					try {
					      FileWriter myWriter = new FileWriter(document + "/NIKKITUSERDATA", false);
					      myWriter.write("NIKKITLOGIN: " + userName);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("NIKKITPASS: " + password);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("messages: " + 0);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.write("poll: " + 0);
					      myWriter.write(System.getProperty( "line.separator" ));
					      myWriter.close();

					    } catch (IOException e) {
					      System.out.println("An error occurred.");
					      e.printStackTrace();
					    }
	    		
					bufferedWriter.write("verifyDisconnect");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
					
					bufferedWriter.close();
					bufferedReader.close();
					socket.close();
					System.out.println("userVerify socket closed");
					
					
					frame.setVisible(false);
					frame.dispose();
					
	
		        	
		        	
		        	
					
					portalMain.main(new String[0]);
	    		
	    	}
	    	
	    }
	    
	    }catch(Exception da) {}
	        }
	    }
	    
	    
	   	 Thread t1 = new Thread(new readingThread());
		 t1.start();
		
		//------------------------------------------------------------------------------SERVER END-------------------------------------------------------------------------------------------------
	    
	    
}
	}

