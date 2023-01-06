import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import com.formdev.flatlaf.FlatLightLaf;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.SystemColor;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

import javax.swing.UIManager;
import javax.swing.JToggleButton;
import javax.swing.JList;
import java.awt.FlowLayout;


public class portalMain {
	

	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	private static JTextField textField;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_1;
	private static JTextField textField_4;
	private static JTextField textField_5;
	public static void main (String[] args) throws Exception { 
		//Graphite
		
		FlatLightLaf.setup();
		
		/*
		try {
          
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(portalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(portalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(portalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(portalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } */
		
		
		
		Socket socket = new Socket("localhost", 4321);
		
		List<String> alertMessages  = new ArrayList<>();
    	
	    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
	    BufferedWriter bufferedWriter =  new BufferedWriter(outputStreamWriter);
	   	InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());	
	   	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	    
	    LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	    String formattedDate = myDateObj.format(myFormatObj);
		System.out.println(formattedDate);
		
		String document = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
		File file = new File(document + "/NIKKITUSERDATA");

		
		JFrame frame = new JFrame("Portal");
		frame.setBackground(new Color(250,250,250));

		
	    
	    
	    JLabel lblNewLabel_1_2 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
		
	   
	    
		String onFilePassword = "";
		String onFileUser = "";
		BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(document + "/NIKKITUSERDATA"));
				String line = reader.readLine();
				while (line != null) {
					System.out.println(line);
					if(line.startsWith("NIKKITPASS: ")) {
						onFilePassword = line.replace("NIKKITPASS: ", "");
					}
					if(line.startsWith("NIKKITLOGIN: ")) {
						onFileUser = line.replace("NIKKITLOGIN: ", "");
					}
					
					line = reader.readLine();
					
				}
				reader.close();
			} catch (IOException e) {
				System.out.println("No Saved Data");
			}
			
			if(file.exists()) {
			bufferedWriter.write("login_request");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			bufferedWriter.write(onFileUser);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			bufferedWriter.write(onFilePassword);
			bufferedWriter.newLine();
			bufferedWriter.flush();
	}

			  
		
	    frame.getContentPane().setBackground(new Color(245, 245, 245));
	    frame.setSize(800,600);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JLabel lblNewLabel = new JLabel("GROUP NAME Portal");
	    lblNewLabel.setForeground(new Color(0, 0, 0));
	    lblNewLabel.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 22));
	    
	    JPanel btnPanel = new JPanel();
	    btnPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    btnPanel.setBackground(new Color(30,30,30));
	    
	    Icon icon = new ImageIcon("src/bin/icons8_Logout_26px.png");
	    JButton btnNewButton_5 = new JButton(icon);
	    btnNewButton_5.setOpaque(false);
	    btnNewButton_5.setContentAreaFilled(false);
	    btnNewButton_5.setBorderPainted(false);
	    
	    btnNewButton_5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		File myObj = new File(document + "/NIKKITUSERDATA"); 
	    	    myObj.delete();
	    	    try {
	     		bufferedWriter.write("CLOSE");
    			bufferedWriter.newLine();
    			bufferedWriter.flush();
    			
    		socket.close();
        	bufferedReader.close();
        	bufferedWriter.close();
        System.exit(0);
	    	    } catch (IOException dad) {}
	    	    
	    	    
	    	}
	    });
	    btnNewButton_5.setBackground(new Color(240, 128, 128));
	    
	    JPanel cardBoard = new JPanel();
	    
	    JScrollPane scrollPane = new JScrollPane();
	    
	 
	   // consolePanel.add(textPane, BorderLayout.CENTER);

	    
	    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
	    groupLayout.setHorizontalGroup(
	    	groupLayout.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(groupLayout.createSequentialGroup()
	    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	    				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
	    					.addGroup(groupLayout.createSequentialGroup()
	    						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
	    						.addGap(353)
	    						.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
	    					.addComponent(btnPanel, 0, 0, Short.MAX_VALUE)
	    					.addComponent(cardBoard, GroupLayout.PREFERRED_SIZE, 783, Short.MAX_VALUE))
	    				.addGroup(groupLayout.createSequentialGroup()
	    					.addGap(0)
	    					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1236, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(23, Short.MAX_VALUE))
	    );
	    groupLayout.setVerticalGroup(
	    	groupLayout.createParallelGroup(Alignment.LEADING)
	    		.addGroup(groupLayout.createSequentialGroup()
	    			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
	    				.addComponent(btnNewButton_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(cardBoard, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(btnPanel, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
	    );
	    // JTextPane textPane = new JTextPane();
	     //JScrollPane scrollPane = new JScrollPane( textPane );
	     

	     
	     JPanel consolePanel = new JPanel();
	     scrollPane.setViewportView(consolePanel);
	    consolePanel.setLayout(new BorderLayout(0, 0));
	    
	    JTextPane textPane = new JTextPane();
	    textPane .setBackground(new Color(0, 0, 0));
	    textPane .setHighlighter(null);
	    textPane .setEditable(false);
	    textPane .setForeground(new Color(0, 0, 0));
	    textPane .setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 18));
	    textPane.setBackground(new Color(0,229,228));
	    consolePanel.add(textPane, BorderLayout.CENTER);
	    cardBoard.setLayout(new CardLayout(0, 0));
	     StyledDocument style = textPane.getStyledDocument();
	     cardBoard.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	     SimpleAttributeSet align= new SimpleAttributeSet();
	     //style.setParagraphAttributes(0, style.getLength(), align, false);
	    
	    JPanel panel_6 = new JPanel();
	    panel_6.setBackground(new Color(240, 240, 240));
	    cardBoard.add(panel_6, "name_165108026512200");
	    
	    JLabel lblGroupPortalStarting = new JLabel("Group Portal Starting Page");
	    lblGroupPortalStarting.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 22));
	    GroupLayout gl_panel_6 = new GroupLayout(panel_6);
	    gl_panel_6.setHorizontalGroup(
	    	gl_panel_6.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel_6.createSequentialGroup()
	    			.addContainerGap(88, Short.MAX_VALUE)
	    			.addComponent(lblGroupPortalStarting, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
	    			.addGap(201))
	    );
	    gl_panel_6.setVerticalGroup(
	    	gl_panel_6.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_6.createSequentialGroup()
	    			.addGap(189)
	    			.addComponent(lblGroupPortalStarting, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(197, Short.MAX_VALUE))
	    );
	    panel_6.setLayout(gl_panel_6);
	    
	    JLabel lblAttendance = new JLabel("Attendance");
	    lblAttendance.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 22));
	    
	    textField = new JTextField();
	    textField.setColumns(10);
	    
	    JLabel lblCustomEvent = new JLabel("Custom Event");
	    lblCustomEvent.setFont(new Font("MS PGothic", Font.BOLD, 13));
	    
	    JLabel lblSelectAnEvent = new JLabel("Select an event or register for a custom event");
	    lblSelectAnEvent.setFont(new Font("Myanmar Text", Font.BOLD, 13));
	    
	    JTextArea textArea = new JTextArea();
	    
	
	    lblNewLabel_1_2.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    //JTextPane textPane_2 = new JTextPane();
	   
	    

	    JCheckBox chckbxNewCheckBox = new JCheckBox("Request Excused");

	    
	   
	    textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    
	    JLabel lblReason = new JLabel("Reason");
	    lblReason.setFont(new Font("MS PGothic", Font.BOLD, 13));
	    

	    
	   
	    //chckbxNewCheckBox.setBackground(Color.white);
	    
	  
	 
	/*    gl_attendancePanel.setHorizontalGroup(
	    	gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_attendancePanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_attendancePanel.createSequentialGroup()
	    					.addGroup(gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_attendancePanel.createSequentialGroup()
	    							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    							.addGroup(gl_attendancePanel.createParallelGroup(Alignment.TRAILING, false)
	    								.addGroup(gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
	    									.addComponent(lblReason, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
	    									.addComponent(chckbxNewCheckBox)
	    									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
	    									.addComponent(lblCustomEvent, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
	    								.addGroup(gl_attendancePanel.createSequentialGroup()
	    									.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	    									.addGap(11))))
	    						.addComponent(lblSelectAnEvent, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
	    					.addGap(18))
	    				.addComponent(lblAttendance, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
	    			.addGap(71)
	    			.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
	    );
	    gl_attendancePanel.setVerticalGroup(
	    	gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_attendancePanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblAttendance, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    			.addGap(11)
	    			.addComponent(lblSelectAnEvent, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    			.addGroup(gl_attendancePanel.createParallelGroup(Alignment.LEADING, false)
	    				.addGroup(gl_attendancePanel.createSequentialGroup()
	    					.addGap(12)
	    					.addComponent(lblCustomEvent, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addGroup(gl_attendancePanel.createSequentialGroup()
	    							.addGap(45)
	    							.addComponent(lblReason, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(chckbxNewCheckBox)
	    					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    					.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_attendancePanel.createSequentialGroup()
	    					.addPreferredGap(ComponentPlacement.RELATED)))
	    			.addContainerGap(29, Short.MAX_VALUE))
	    		.addComponent(textPane_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
	    );
	 */
	    
	   
	    
	    JPanel pollPanel = new JPanel();
	    pollPanel.setBackground(new Color(250,250,250));
	    cardBoard.add(pollPanel, "name_17582534200999");
	    
	    JLabel lblPolls = new JLabel("Polls");
	    lblPolls.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 22));
	    
	    JPanel panel = new JPanel();
	    panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Poll 1", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
	    
	    ((javax.swing.border.TitledBorder) panel.getBorder()).
	    setTitleFont(new Font("Rockwell", Font.ITALIC, 14));

	    panel.repaint();
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Poll 3", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    
	    JPanel panel_1_1 = new JPanel();
	    panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Poll 4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    
	    JPanel panel_1_1_1 = new JPanel();
	    panel_1_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Poll 2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	    
	    ((javax.swing.border.TitledBorder) panel_1.getBorder()).
	    setTitleFont(new Font("Rockwell", Font.ITALIC, 14));

	    panel_1.repaint();
	    
	    ((javax.swing.border.TitledBorder) panel_1_1.getBorder()).
	    setTitleFont(new Font("Rockwell", Font.ITALIC, 14));

	    panel_1_1.repaint();
	    
	    ((javax.swing.border.TitledBorder) panel_1_1_1.getBorder()).
	    setTitleFont(new Font("Rockwell", Font.ITALIC, 14));
	    
	    panel_1_1_1.repaint();
	    
	    
	    panel.repaint();
	    panel.setBackground(new Color(250,250,250));
	    panel_1.setBackground(new Color(250,250,250));
	    panel_1_1.setBackground(new Color(250,250,250));
	    panel_1_1_1.setBackground(new Color(250,250,250));
	    
	    JLabel lblNewLabel_4_2 = new JLabel("Messages:");
	    lblNewLabel_4_2.setVisible(false);
	    lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
	    
	    JLabel lblNewLabel_4 = new JLabel("Server Connection:");
	    lblNewLabel_4.setVisible(false);
	    lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 11));
	    GroupLayout gl_pollPanel = new GroupLayout(pollPanel);
	    gl_pollPanel.setHorizontalGroup(
	    	gl_pollPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_pollPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_pollPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_pollPanel.createSequentialGroup()
	    					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
	    					.addGap(10)
	    					.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_pollPanel.createSequentialGroup()
	    					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(panel_1_1_1, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_pollPanel.createSequentialGroup()
	    					.addComponent(lblPolls, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(33, Short.MAX_VALUE))
	    );
	    gl_pollPanel.setVerticalGroup(
	    	gl_pollPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_pollPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_pollPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblPolls, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_4_2, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_pollPanel.createParallelGroup(Alignment.LEADING, false)
	    				.addComponent(panel_1_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_pollPanel.createParallelGroup(Alignment.LEADING, false)
	    				.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    
	    JTextArea textArea_1_1_1_1 = new JTextArea();
	    textArea_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
	    textArea_1_1_1_1.setEditable(false);
	    textArea_1_1_1_1.setEnabled(false);
	    textArea_1_1_1_1.setOpaque(false);
	    
	    JPanel panel_2_1_1 = new JPanel();
	    panel_2_1_1.setLayout(new GridLayout(2, 2, 0, 0));
	    
	    JButton btnNewButton_9_1_1 = new JButton("New button");
	    btnNewButton_9_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_9_1_1.setEnabled(false);
	    panel_2_1_1.add(btnNewButton_9_1_1);
	    
	    JButton btnNewButton_11_1_1 = new JButton("New button");
	    btnNewButton_11_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_11_1_1.setEnabled(false);
	    panel_2_1_1.add(btnNewButton_11_1_1);
	    
	    JButton btnNewButton_10_1_1 = new JButton("New button");
	    btnNewButton_10_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_10_1_1.setEnabled(false);
	    panel_2_1_1.add(btnNewButton_10_1_1);
	    
	    JButton btnNewButton_8_1_1 = new JButton("New button");
	    btnNewButton_8_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_8_1_1.setEnabled(false);
	    
	    
	   /* btnNewButton_9_1_1.setOpaque(false);
	    btnNewButton_9_1_1.setContentAreaFilled(false);
	    btnNewButton_9_1_1.setBorderPainted(true);
	    btnNewButton_9_1_1.setFocusPainted(false);
	    
	    btnNewButton_11_1_1.setOpaque(false);
	    btnNewButton_11_1_1.setContentAreaFilled(false);
	    btnNewButton_11_1_1.setBorderPainted(true);
	    btnNewButton_11_1_1.setFocusPainted(false);
	    
	    btnNewButton_10_1_1.setOpaque(false);
	    btnNewButton_10_1_1.setContentAreaFilled(false);
	    btnNewButton_10_1_1.setBorderPainted(true);
	    btnNewButton_10_1_1.setFocusPainted(false);
	    
	    btnNewButton_8_1_1.setOpaque(false);
	    btnNewButton_8_1_1.setContentAreaFilled(false);
	    btnNewButton_8_1_1.setBorderPainted(true);
	    btnNewButton_8_1_1.setFocusPainted(false); */
	    
	    btnNewButton_9_1_1.setBorder(new MatteBorder(1, 1, 0, 0, (Color) new Color(0, 0, 0)));
	    btnNewButton_11_1_1.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
	    btnNewButton_10_1_1.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
	    btnNewButton_8_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))); 
	    
	    
	    
	    
	    panel_2_1_1.add(btnNewButton_8_1_1);
	    GroupLayout gl_panel_1_1_1 = new GroupLayout(panel_1_1_1);
	    gl_panel_1_1_1.setHorizontalGroup(
	    	gl_panel_1_1_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_1_1_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_1_1_1.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textArea_1_1_1_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
	    				.addComponent(panel_2_1_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_panel_1_1_1.setVerticalGroup(
	    	gl_panel_1_1_1.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel_1_1_1.createSequentialGroup()
	    			.addComponent(textArea_1_1_1_1, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_2_1_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    panel_1_1_1.setLayout(gl_panel_1_1_1);
	    
	    JTextArea textArea_1_1_1 = new JTextArea();
	    textArea_1_1_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
	    textArea_1_1_1.setEditable(false);
	    textArea_1_1_1.setEnabled(false);
	    textArea_1_1_1.setOpaque(false);
	    
	    JPanel panel_2_1 = new JPanel();
	    panel_2_1.setLayout(new GridLayout(2, 2, 0, 0));
	    
	    JButton btnNewButton_9_1 = new JButton("New button");
	    btnNewButton_9_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_9_1.setEnabled(false);
	    panel_2_1.add(btnNewButton_9_1);
	    
	    JButton btnNewButton_11_1 = new JButton("New button");
	    btnNewButton_11_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_11_1.setEnabled(false);
	    panel_2_1.add(btnNewButton_11_1);
	    
	    JButton btnNewButton_10_1 = new JButton("New button");
	    btnNewButton_10_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_10_1.setEnabled(false);
	    panel_2_1.add(btnNewButton_10_1);
	    
	    JButton btnNewButton_8_1 = new JButton("New button");
	    btnNewButton_8_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_8_1.setEnabled(false);
	    
	   /* btnNewButton_9_1.setOpaque(false);
	    btnNewButton_9_1.setContentAreaFilled(false);
	    btnNewButton_9_1.setBorderPainted(true);
	    btnNewButton_9_1.setFocusPainted(false);
	    
	    btnNewButton_11_1.setOpaque(false);
	    btnNewButton_11_1.setContentAreaFilled(false);
	    btnNewButton_11_1.setBorderPainted(true);
	    btnNewButton_11_1.setFocusPainted(false);
	    
	    btnNewButton_10_1.setOpaque(false);
	    btnNewButton_10_1.setContentAreaFilled(false);
	    btnNewButton_10_1.setBorderPainted(true);
	    btnNewButton_10_1.setFocusPainted(false);
	    
	    btnNewButton_8_1.setOpaque(false);
	    btnNewButton_8_1.setContentAreaFilled(false);
	    btnNewButton_8_1.setBorderPainted(true);
	    btnNewButton_8_1.setFocusPainted(false);*/
	    
	    btnNewButton_9_1.setBorder(new MatteBorder(1, 1, 0, 0, (Color) new Color(0, 0, 0)));
	    btnNewButton_11_1.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
	    btnNewButton_10_1.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
	    btnNewButton_8_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0))); 
	    
	    
	    panel_2_1.add(btnNewButton_8_1);
	    GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
	    gl_panel_1_1.setHorizontalGroup(
	    	gl_panel_1_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_1_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_1_1.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textArea_1_1_1, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
	    				.addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_panel_1_1.setVerticalGroup(
	    	gl_panel_1_1.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(Alignment.LEADING, gl_panel_1_1.createSequentialGroup()
	    			.addComponent(textArea_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
	    			.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    panel_1_1.setLayout(gl_panel_1_1);
	    
	    JTextArea textArea_1_1 = new JTextArea();
	    textArea_1_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
	    textArea_1_1.setEditable(false);
	    textArea_1_1.setEnabled(false);
	    textArea_1_1.setOpaque(false);
	    JPanel panel_2 = new JPanel();
	    GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	    gl_panel_1.setHorizontalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textArea_1_1, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
	    				.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    gl_panel_1.setVerticalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addComponent(textArea_1_1, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
	    			.addGap(19)
	    			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    panel_2.setLayout(new GridLayout(2, 2, 0, 0));
	    
	    JButton btnNewButton_9 = new JButton("New button");
	    btnNewButton_9.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_9.setEnabled(false);
	    panel_2.add(btnNewButton_9);
	    
	    JButton btnNewButton_11 = new JButton("New button");
	    btnNewButton_11.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_11.setEnabled(false);
	    panel_2.add(btnNewButton_11);
	    
	    JButton btnNewButton_10 = new JButton("New button");
	    btnNewButton_10.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_10.setEnabled(false);
	    panel_2.add(btnNewButton_10);
	    
	    JButton btnNewButton_8 = new JButton("New button");
	    btnNewButton_8.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_8.setEnabled(false);
	    panel_2.add(btnNewButton_8);
	    panel_1.setLayout(gl_panel_1);
	    
	  /*  btnNewButton_9.setOpaque(false);
	    btnNewButton_9.setContentAreaFilled(false);
	    btnNewButton_9.setBorderPainted(true);
	    btnNewButton_9.setFocusPainted(false);
	    
	    btnNewButton_11.setOpaque(false);
	    btnNewButton_11.setContentAreaFilled(false);
	    btnNewButton_11.setBorderPainted(true);
	    btnNewButton_11.setFocusPainted(false);
	    
	    btnNewButton_10.setOpaque(false);
	    btnNewButton_10.setContentAreaFilled(false);
	    btnNewButton_10.setBorderPainted(true);
	    btnNewButton_10.setFocusPainted(false);
	    
	    btnNewButton_8.setOpaque(false);
	    btnNewButton_8.setContentAreaFilled(false);
	    btnNewButton_8.setBorderPainted(true);
	    btnNewButton_8.setFocusPainted(false); */
	      
	    btnNewButton_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    btnNewButton_11.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
	    btnNewButton_10.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    btnNewButton_8.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0))); 
	    
	    
	    JTextArea textArea_1 = new JTextArea();
	    textArea_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
	    textArea_1.setEnabled(false);
	    textArea_1.setEditable(false);
	    textArea_1.setOpaque(false);

	    
	    JPanel panel_2_1_1_1 = new JPanel();
	    panel_2_1_1_1.setLayout(new GridLayout(2, 2, 0, 0));
	    
	    JButton btnNewButton_9_1_1_1 = new JButton("New button");
	    btnNewButton_9_1_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    		
	    		
	    	}
	    });
	    btnNewButton_9_1_1_1.setEnabled(false);
	    panel_2_1_1_1.add(btnNewButton_9_1_1_1);
	   // btnNewButton_9_1_1_1.setOpaque(false);
	   // btnNewButton_9_1_1_1.setContentAreaFilled(false);
	   // btnNewButton_9_1_1_1.setBorderPainted(true);
	   // btnNewButton_9_1_1_1.setFocusPainted(false);
	    
	    JButton btnNewButton_11_1_1_1 = new JButton("New button");
	    btnNewButton_11_1_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_11_1_1_1.setEnabled(false);
	    panel_2_1_1_1.add(btnNewButton_11_1_1_1);
	    //btnNewButton_11_1_1_1.setOpaque(false);
	   // btnNewButton_11_1_1_1.setContentAreaFilled(false);
	   // btnNewButton_11_1_1_1.setBorderPainted(true);
	   // btnNewButton_11_1_1_1.setFocusPainted(false);
	    
	    JButton btnNewButton_10_1_1_1 = new JButton("New button");
	    btnNewButton_10_1_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_10_1_1_1.setEnabled(false);
	    panel_2_1_1_1.add(btnNewButton_10_1_1_1);
	    //btnNewButton_10_1_1_1.setOpaque(false);
	   // btnNewButton_10_1_1_1.setContentAreaFilled(false);
	    //btnNewButton_10_1_1_1.setBorderPainted(true);
	    //btnNewButton_10_1_1_1.setFocusPainted(false);
	    
	    JButton btnNewButton_8_1_1_1 = new JButton("New button");
	    btnNewButton_8_1_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			
	    			String target = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write("poll_inputData");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();

	    			bufferedWriter.write("poll_1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    			
	    		} catch (IOException dad) {}
	    	}
	    });
	    btnNewButton_8_1_1_1.setEnabled(false);
	    panel_2_1_1_1.add(btnNewButton_8_1_1_1);
	    //btnNewButton_8_1_1_1.setOpaque(false);
	   // btnNewButton_8_1_1_1.setContentAreaFilled(false);
	   // btnNewButton_8_1_1_1.setBorderPainted(true);
	   // btnNewButton_8_1_1_1.setFocusPainted(false);
	    
	    btnNewButton_8_1_1_1.setBorder(new MatteBorder(1, 0, 1, 1, (Color) new Color(0, 0, 0)));
	    btnNewButton_10_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    btnNewButton_11_1_1_1.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
	    btnNewButton_9_1_1_1.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
	    
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textArea_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
	    				.addComponent(panel_2_1_1_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    panel.setLayout(gl_panel);
	    pollPanel.setLayout(gl_pollPanel);
	    
	    JPanel informationPanel = new JPanel();
	    informationPanel.setBackground(new Color(220, 220, 220));
	    cardBoard.add(informationPanel, "name_17584339430100");
	    
	    JLabel lblYourInformation = new JLabel("Your Information");
	    lblYourInformation.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 22));
	    
	    JLabel lblNewLabel_1 = new JLabel("Name:");
	    lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1 = new JLabel("NIKKIT Username:");
	    lblNewLabel_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1 = new JLabel("Email:");
	    lblNewLabel_1_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_1 = new JLabel("Group Name:");
	    lblNewLabel_1_1_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_2 = new JLabel("Password:");
	    lblNewLabel_1_1_1_2.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_3 = new JLabel("Rank:");
	    lblNewLabel_1_1_1_3.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_3_1 = new JLabel("Role:");
	    lblNewLabel_1_1_1_3_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_3_1_1 = new JLabel("Starting Date:");
	    lblNewLabel_1_1_1_3_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_3_1_1_1 = new JLabel("Absences:");
	    lblNewLabel_1_1_1_3_1_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_3_1_1_2 = new JLabel("Warnings:");
	    lblNewLabel_1_1_1_3_1_1_2.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_3_1_1_2_1 = new JLabel("Accolades:");
	    lblNewLabel_1_1_1_3_1_1_2_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_3_1_1_2_1_1 = new JLabel("Notes:");
	    lblNewLabel_1_1_1_3_1_1_2_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JTextPane textPane_1 = new JTextPane();
	    textPane_1.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));

	    
	    JTextPane textPane_3 = new JTextPane();
	    textPane_3.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
	    
	    JButton btnNewButton_12 = new JButton("Edit");
	    btnNewButton_12.setOpaque(false);
	    btnNewButton_12.setContentAreaFilled(false);
	    btnNewButton_12.setBorderPainted(false);
	    btnNewButton_12.setFocusPainted(false);
	    
	    JButton btnNewButton_12_1 = new JButton("Edit");
	    btnNewButton_12_1.setOpaque(false);
	    btnNewButton_12_1.setContentAreaFilled(false);
	    btnNewButton_12_1.setBorderPainted(false);
	    btnNewButton_12_1.setFocusPainted(false);
	    
	    JButton btnNewButton_12_2  = new JButton("Edit");
	    btnNewButton_12_2.setOpaque(false);
	    btnNewButton_12_2.setContentAreaFilled(false);
	    btnNewButton_12_2.setBorderPainted(false);
	    btnNewButton_12_2.setFocusPainted(false);
	    
	    JButton btnNewButton_12_2_1 = new JButton("Edit");
	    btnNewButton_12_2_1.setOpaque(false);
	    btnNewButton_12_2_1.setContentAreaFilled(false);
	    btnNewButton_12_2_1.setBorderPainted(false);
	    btnNewButton_12_2_1.setFocusPainted(false);
	    

	    
	    JLabel lblNewLabel_1_3 = new JLabel("xxxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_3.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_1 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_2 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_2.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_3 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_3.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_3_1 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_3_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_3_2 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_3_2.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_3_3 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_3_3.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_3_4 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_3_4.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_3_5 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_3_5.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_3_6 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_3_6.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_2_3_7 = new JLabel("xxxxxxxxxxxxxxxxxxxxx");
	    lblNewLabel_1_2_3_7.setFont(new Font("Monospaced", Font.BOLD, 14));
	    GroupLayout gl_informationPanel = new GroupLayout(informationPanel);
	    gl_informationPanel.setHorizontalGroup(
	    	gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_informationPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblYourInformation, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_2, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1_1_2)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_2_3_7, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1_1_3_1_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_2_3_5, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.TRAILING, false)
	    						.addComponent(lblNewLabel_1_1_1_3_1_1_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    						.addComponent(lblNewLabel_1_1_1_3_1_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_2_3_2, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_2_3_1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1_1_3_1_1_2_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_2_3_3, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1_1_3_1_1_2_1_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_2_3_4, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblNewLabel_1_1_1_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_1_2_3_6, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.TRAILING, false)
	    						.addComponent(lblNewLabel_1_1_1_3_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    						.addComponent(lblNewLabel_1_1_1_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))))
	    			.addPreferredGap(ComponentPlacement.RELATED, 10, GroupLayout.PREFERRED_SIZE)
	    			.addGroup(gl_informationPanel.createParallelGroup(Alignment.TRAILING, false)
	    				.addComponent(btnNewButton_12_2_1, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
	    				.addComponent(btnNewButton_12_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addComponent(btnNewButton_12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addComponent(btnNewButton_12_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0))
	    );
	    gl_informationPanel.setVerticalGroup(
	    	gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_informationPanel.createSequentialGroup()
	    			.addGap(0)
	    			.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_informationPanel.createSequentialGroup()
	    					.addComponent(lblYourInformation, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    					.addGap(18)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_informationPanel.createParallelGroup(Alignment.BASELINE)
	    							.addComponent(lblNewLabel_1)
	    							.addComponent(btnNewButton_12_1))
	    						.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(btnNewButton_12)
	    						.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_informationPanel.createParallelGroup(Alignment.BASELINE)
	    							.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    							.addComponent(btnNewButton_12_2))
	    						.addComponent(lblNewLabel_1_2_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_2_3_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.TRAILING)
	    						.addComponent(lblNewLabel_1_1_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(btnNewButton_12_2_1)
	    						.addComponent(lblNewLabel_1_2_3_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addGap(18)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_1_1_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_2_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_1_1_3_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_2_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_1_1_3_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_2_3_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addGap(18)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_1_1_3_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_2_3_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_2_3_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_1_1_3_1_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_1_1_3_1_1_2_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_2_3_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_informationPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_2_3_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_1_1_3_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    informationPanel.setLayout(gl_informationPanel);
	    
	    JPanel calendarPanel = new JPanel();
	    //calendarPanel.setBackground(Color.white);
	    cardBoard.add(calendarPanel, "name_17587162593500");
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(245, 245, 245));
	    panel_3.setBorder(null);
	    
	    
	    
	    JTextArea textArea_2 = new JTextArea();
	    textArea_2.setFont(new Font("Monospaced", Font.BOLD, 16));
	    textArea_2.setBorder(new MatteBorder(1, 1, 0, 0, (Color) new Color(0, 0, 0)));
	    
	    
	    JTextPane textPane_4 = new JTextPane();
	    textPane_4.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 10));
	    StyledDocument textPane_4doc = textPane_4.getStyledDocument();
	    SimpleAttributeSet textPane_4center = new SimpleAttributeSet();
	    StyleConstants.setAlignment(textPane_4center, StyleConstants.ALIGN_LEFT);
	    textPane_4doc.setParagraphAttributes(0, textPane_4doc.getLength(), textPane_4center, false);
	    
	    textPane_4.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
	    
	    JTextPane textPane_5 = new JTextPane();
	    textPane_5.setFont(new Font("Segoe UI", Font.BOLD, 10));
	    StyledDocument textPane_5doc = textPane_5.getStyledDocument();
	    SimpleAttributeSet textPane_5center = new SimpleAttributeSet();
	    StyleConstants.setAlignment(textPane_5center, StyleConstants.ALIGN_CENTER);
	    textPane_5doc.setParagraphAttributes(0, textPane_5doc.getLength(), textPane_5center, false);
	    
	    textPane_5.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
	    GroupLayout gl_calendarPanel = new GroupLayout(calendarPanel);
	    gl_calendarPanel.setHorizontalGroup(
	    	gl_calendarPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_calendarPanel.createSequentialGroup()
	    			.addGap(0)
	    			.addGroup(gl_calendarPanel.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
	    				.addGroup(gl_calendarPanel.createSequentialGroup()
	    					.addComponent(textPane_4, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
	    					.addGap(0)
	    					.addComponent(textPane_5, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
	    					.addGap(0)
	    					.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)))
	    			.addGap(0))
	    );
	    gl_calendarPanel.setVerticalGroup(
	    	gl_calendarPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_calendarPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addGroup(gl_calendarPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textPane_5, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
	    				.addComponent(textPane_4, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
	    				.addComponent(textArea_2, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
	    			.addGap(0))
	    );
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBackground(new Color(245, 245, 245));
	    //panel_4.setBackground(Color.white);
	    
	    JLabel lblMonth = new JLabel("MONTH,");
	    lblMonth.setFont(new Font("Segoe UI", Font.BOLD, 22));
	    
	    JLabel lblYear = new JLabel("YEAR");
	    lblYear.setFont(new Font("Gill Sans MT", Font.PLAIN, 14));
	    
	    JButton MIPcal1 = new JButton("1");
	    MIPcal1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("1");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal1.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
	    MIPcal1.setOpaque(false);
	    MIPcal1.setContentAreaFilled(false);
	    MIPcal1.setBorderPainted(true);
	    MIPcal1.setFocusPainted(false);
	    panel_4.add(MIPcal1);
	    
	    JButton MIPcal2 = new JButton("2");
	    MIPcal2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("2");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal2.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal2);
	    MIPcal2.setOpaque(false);
	    MIPcal2.setContentAreaFilled(false);
	    MIPcal2.setBorderPainted(true);
	    MIPcal2.setFocusPainted(false);
	    
	    JButton MIPcal3 = new JButton("3");
	    MIPcal3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("3");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal3.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal3);
	    MIPcal3.setOpaque(false);
	    MIPcal3.setContentAreaFilled(false);
	    MIPcal3.setBorderPainted(true);
	    MIPcal3.setFocusPainted(false);
	    
	    JButton MIPcal4 = new JButton("4");
	    MIPcal4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("4");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal4.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal4);
	    MIPcal4.setOpaque(false);
	    MIPcal4.setContentAreaFilled(false);
	    MIPcal4.setBorderPainted(true);
	    MIPcal4.setFocusPainted(false);
	    
	    JButton MIPcal5 = new JButton("5");
	    MIPcal5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("5");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal5.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal5);
	    MIPcal5.setOpaque(false);
	    MIPcal5.setContentAreaFilled(false);
	    MIPcal5.setBorderPainted(true);
	    MIPcal5.setFocusPainted(false);
	    
	    JButton MIPcal6 = new JButton("6");
	    MIPcal6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("6");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal6.setBorder(new MatteBorder(2, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal6);
	    MIPcal6.setOpaque(false);
	    MIPcal6.setContentAreaFilled(false);
	    MIPcal6.setBorderPainted(true);
	    MIPcal6.setFocusPainted(false);
	    
	    JButton MIPcal7 = new JButton("7");
	    MIPcal7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("7");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal7.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal7);
	    MIPcal7.setOpaque(false);
	    MIPcal7.setContentAreaFilled(false);
	    MIPcal7.setBorderPainted(true);
	    MIPcal7.setFocusPainted(false);
	    
	    JButton MIPcal8 = new JButton("8");
	    MIPcal8.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("8");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal8.setBorder(new MatteBorder(1, 2, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal8);
	    MIPcal8.setOpaque(false);
	    MIPcal8.setContentAreaFilled(false);
	    MIPcal8.setBorderPainted(true);
	    MIPcal8.setFocusPainted(false);
	    
	    JButton MIPcal9 = new JButton("9");
	    MIPcal9.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("9");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal9);
	    MIPcal9.setOpaque(false);
	    MIPcal9.setContentAreaFilled(false);
	    MIPcal9.setBorderPainted(true);
	    MIPcal9.setFocusPainted(false);
	    
	    JButton MIPcal10 = new JButton("10");
	    MIPcal10.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("10");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal10);
	    MIPcal10.setOpaque(false);
	    MIPcal10.setContentAreaFilled(false);
	    MIPcal10.setBorderPainted(true);
	    MIPcal10.setFocusPainted(false);
	    
	    JButton MIPcal11 = new JButton("11");
	    MIPcal11.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("11");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal11);
	    MIPcal11.setOpaque(false);
	    MIPcal11.setContentAreaFilled(false);
	    MIPcal11.setBorderPainted(true);
	    MIPcal11.setFocusPainted(false);
	    
	    JButton MIPcal12 = new JButton("12");
	    MIPcal12.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("12");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal12);
	    MIPcal12.setOpaque(false);
	    MIPcal12.setContentAreaFilled(false);
	    MIPcal12.setBorderPainted(true);
	    MIPcal12.setFocusPainted(false);
	    
	    JButton MIPcal13 = new JButton("13");
	    MIPcal13.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("13");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal13);
	    MIPcal13.setOpaque(false);
	    MIPcal13.setContentAreaFilled(false);
	    MIPcal13.setBorderPainted(true);
	    MIPcal13.setFocusPainted(false);
	    
	    JButton MIPcal14 = new JButton("14");
	    MIPcal14.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("14");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal14.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal14);
	    MIPcal14.setOpaque(false);
	    MIPcal14.setContentAreaFilled(false);
	    MIPcal14.setBorderPainted(true);
	    MIPcal14.setFocusPainted(false);
	    
	    JButton MIPcal15 = new JButton("15");
	    MIPcal15.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("15");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal15.setBorder(new MatteBorder(1, 2, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal15);
	    MIPcal15.setOpaque(false);
	    MIPcal15.setContentAreaFilled(false);
	    MIPcal15.setBorderPainted(true);
	    MIPcal15.setFocusPainted(false);
	    
	    JButton MIPcal16 = new JButton("16");
	    MIPcal16.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("16");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal16.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal16);
	    MIPcal16.setOpaque(false);
	    MIPcal16.setContentAreaFilled(false);
	    MIPcal16.setBorderPainted(true);
	    MIPcal16.setFocusPainted(false);
	    
	    JButton MIPcal17 = new JButton("17");
	    MIPcal17.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("17");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal17.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal17);
	    MIPcal17.setOpaque(false);
	    MIPcal17.setContentAreaFilled(false);
	    MIPcal17.setBorderPainted(true);
	    MIPcal17.setFocusPainted(false);
	    
	    JButton MIPcal18 = new JButton("18");
	    MIPcal18.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("18");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal18.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal18);
	    MIPcal18.setOpaque(false);
	    MIPcal18.setContentAreaFilled(false);
	    MIPcal18.setBorderPainted(true);
	    MIPcal18.setFocusPainted(false);
	    
	    JButton MIPcal19 = new JButton("19");
	    MIPcal19.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("19");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal19.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal19);
	    MIPcal19.setOpaque(false);
	    MIPcal19.setContentAreaFilled(false);
	    MIPcal19.setBorderPainted(true);
	    MIPcal19.setFocusPainted(false);
	    
	    JButton MIPcal20 = new JButton("20");
	    MIPcal20.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("20");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal20.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal20);
	    MIPcal20.setOpaque(false);
	    MIPcal20.setContentAreaFilled(false);
	    MIPcal20.setBorderPainted(true);
	    MIPcal20.setFocusPainted(false);
	    
	    JButton MIPcal21 = new JButton("21");
	    MIPcal21.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("21");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal21.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal21);
	    MIPcal21.setOpaque(false);
	    MIPcal21.setContentAreaFilled(false);
	    MIPcal21.setBorderPainted(true);
	    MIPcal21.setFocusPainted(false);
	    
	    JButton MIPcal22 = new JButton("22");
	    MIPcal22.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("22");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal22.setBorder(new MatteBorder(1, 2, 2, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal22);
	    MIPcal22.setOpaque(false);
	    MIPcal22.setContentAreaFilled(false);
	    MIPcal22.setBorderPainted(true);
	    MIPcal22.setFocusPainted(false);
	    
	    JButton MIPcal23 = new JButton("23");
	    MIPcal23.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("23");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal23.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal23);
	    MIPcal23.setOpaque(false);
	    MIPcal23.setContentAreaFilled(false);
	    MIPcal23.setBorderPainted(true);
	    MIPcal23.setFocusPainted(false);
	    
	    JButton MIPcal24 = new JButton("24");
	    MIPcal24.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("24");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal24.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal24);
	    MIPcal24.setOpaque(false);
	    MIPcal24.setContentAreaFilled(false);
	    MIPcal24.setBorderPainted(true);
	    MIPcal24.setFocusPainted(false);
	    
	    JButton MIPcal25 = new JButton("25");
	    MIPcal25.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("25");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal25.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal25);
	    MIPcal25.setOpaque(false);
	    MIPcal25.setContentAreaFilled(false);
	    MIPcal25.setBorderPainted(true);
	    MIPcal25.setFocusPainted(false);
	    
	    JButton MIPcal26 = new JButton("26");
	    MIPcal26.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("26");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal26.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal26);
	    MIPcal26.setOpaque(false);
	    MIPcal26.setContentAreaFilled(false);
	    MIPcal26.setBorderPainted(true);
	    MIPcal26.setFocusPainted(false);
	    
	    JButton MIPcal27 = new JButton("27");
	    MIPcal27.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("27");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal27.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal27);
	    MIPcal27.setOpaque(false);
	    MIPcal27.setContentAreaFilled(false);
	    MIPcal27.setBorderPainted(true);
	    MIPcal27.setFocusPainted(false);
	    
	    JButton MIPcal28 = new JButton("28");
	    MIPcal28.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("28");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal28.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal28);
	    MIPcal28.setOpaque(false);
	    MIPcal28.setContentAreaFilled(false);
	    MIPcal28.setBorderPainted(true);
	    MIPcal28.setFocusPainted(false);
	    
	    JButton MIPcal29 = new JButton("29");
	    MIPcal29.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("29");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal29.setBorder(new MatteBorder(0, 2, 2, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal29);
	    MIPcal29.setOpaque(false);
	    MIPcal29.setContentAreaFilled(false);
	    MIPcal29.setBorderPainted(true);
	    MIPcal29.setFocusPainted(false);
	    
	    JButton MIPcal30 = new JButton("30");
	    MIPcal30.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("30");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal30.setBorder(new MatteBorder(0, 1, 2, 1, (Color) new Color(0, 0, 0)));
	    panel_4.add(MIPcal30);
	    MIPcal30.setOpaque(false);
	    MIPcal30.setContentAreaFilled(false);
	    MIPcal30.setBorderPainted(true);
	    MIPcal30.setFocusPainted(false);
	    
	    JButton MIPcal31 = new JButton("31");
	    MIPcal31.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String month = lblMonth.getText();
	    		int monthInt = 0;
	    		String yearStr = lblYear.getText();
	    		int yearInt = Integer.valueOf(yearStr);
	    		 yearInt = yearInt - 2000;
	    		
	    		if(month.equals("January")) {monthInt = 1;}if(month.equals("July")) {monthInt = 7;}
	    		if(month.equals("Feburary")) {monthInt = 2;}if(month.equals("August")) {monthInt = 8;}
	    		if(month.equals("March")) {monthInt = 3;}if(month.equals("September")) {monthInt = 9;}
	    		if(month.equals("April")) {monthInt = 4;}if(month.equals("October")) {monthInt = 10;}
	    		if(month.equals("May")) {monthInt = 5;}if(month.equals("November")) {monthInt = 11;}
	    		if(month.equals("June")) {monthInt = 6;}if(month.equals("December")) {monthInt = 12;}
	    		
	    		textArea_2.setText("");
    		try {
	    			
	    			String yearToString = String.valueOf(yearInt);
	    			String monthToString = String.valueOf(monthInt);

	    			bufferedWriter.write("calendarButtonRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(yearToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(monthToString);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("31");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) { System.out.println("Error: " + failureCalendarRequest);}
	    	}
	    });
	    MIPcal31.setBorder(new MatteBorder(0, 1, 2, 1, (Color) new Color(0, 0, 0)));
	    MIPcal31.setOpaque(false);
	    MIPcal31.setContentAreaFilled(false);
	    MIPcal31.setBorderPainted(true);
	    MIPcal31.setFocusPainted(false);
	    panel_4.add(MIPcal31);
	    
	 
	    
	    JButton btnNewButton_13 = new JButton("Next");
	    btnNewButton_13.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String currentMonth = lblMonth.getText();
	    		if(currentMonth.equals("January")) {lblMonth.setText("Feburary");}
	    		if(currentMonth.equals("Feburary")) {lblMonth.setText("March");}
	    		if(currentMonth.equals("March")) {lblMonth.setText("April");}
	    		if(currentMonth.equals("April")) {lblMonth.setText("May");}
	    		if(currentMonth.equals("May")) {lblMonth.setText("June");}
	    		if(currentMonth.equals("June")) {lblMonth.setText("July");}
	    		if(currentMonth.equals("July")) {lblMonth.setText("August");}
	    		if(currentMonth.equals("August")) {lblMonth.setText("September");}
	    		if(currentMonth.equals("September")) {lblMonth.setText("October");}
	    		if(currentMonth.equals("October")) {lblMonth.setText("November");}
	    		if(currentMonth.equals("November")) {lblMonth.setText("December");}
	    		if(currentMonth.equals("December")) {lblMonth.setText("January");
	    		int year = Integer.parseInt(lblYear.getText());
	    		System.out.println("Year: " + year);
	    		int yearInt = year + 1;
	    		System.out.println("yearInt: " + yearInt);
	    		lblYear.setText(Integer.toString(yearInt));
	    		System.out.println("Year to string: " + Integer.toString(yearInt));
	    		}
	    		
	    		MIPcal1.setContentAreaFilled(false); MIPcal12.setContentAreaFilled(false); MIPcal22.setContentAreaFilled(false); 
	    		MIPcal2.setContentAreaFilled(false); MIPcal13.setContentAreaFilled(false); MIPcal23.setContentAreaFilled(false); 
	    		MIPcal3.setContentAreaFilled(false); MIPcal14.setContentAreaFilled(false); MIPcal24.setContentAreaFilled(false); 
	    		MIPcal4.setContentAreaFilled(false); MIPcal15.setContentAreaFilled(false); MIPcal25.setContentAreaFilled(false); 
	    		MIPcal5.setContentAreaFilled(false); MIPcal16.setContentAreaFilled(false); MIPcal26.setContentAreaFilled(false); 
	    		MIPcal6.setContentAreaFilled(false); MIPcal17.setContentAreaFilled(false); MIPcal27.setContentAreaFilled(false); 
	    		MIPcal7.setContentAreaFilled(false); MIPcal18.setContentAreaFilled(false); MIPcal28.setContentAreaFilled(false); 
	    		MIPcal8.setContentAreaFilled(false); MIPcal19.setContentAreaFilled(false); MIPcal29.setContentAreaFilled(false); 
	    		MIPcal9.setContentAreaFilled(false); MIPcal20.setContentAreaFilled(false); MIPcal30.setContentAreaFilled(false); 
	    		MIPcal10.setContentAreaFilled(false); MIPcal21.setContentAreaFilled(false); MIPcal31.setContentAreaFilled(false); 
	    		MIPcal11.setContentAreaFilled(false); 
	    		
	      		try {
	    			String month = lblMonth.getText();
	    			String year = lblYear.getText();
	    			
	    			bufferedWriter.write("CalendarRequestMIP");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(year);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(month);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			
	    		}
	    		catch(IOException failureCalendarRequest) {}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    	}
	    });
	   // btnNewButton_13.setOpaque(false);
	   // btnNewButton_13.setContentAreaFilled(false);
	   // btnNewButton_13.setBorderPainted(true);
	   // btnNewButton_13.setFocusPainted(false);
	    
	    JButton btnNewButton_13_1 = new JButton("Back");
	    btnNewButton_13_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String currentMonth = lblMonth.getText();
	    		if(currentMonth.equals("January")) {lblMonth.setText("December");
	    		int year = Integer.parseInt(lblYear.getText());
	    		System.out.println("Year: " + year);
	    		int yearInt = year - 1;
	    		System.out.println("yearInt: " + yearInt);
	    		lblYear.setText(Integer.toString(yearInt));
	    		System.out.println("Year to string: " + Integer.toString(yearInt));
	    		System.out.println("Sent Calendar Request asd");
	    		}
	    		
	    		if(currentMonth.equals("December")) {lblMonth.setText("November");}
	    		if(currentMonth.equals("November")) {lblMonth.setText("October");}
	    		if(currentMonth.equals("October")) {lblMonth.setText("September");}
	    		if(currentMonth.equals("September")) {lblMonth.setText("August");}
	    		if(currentMonth.equals("August")) {lblMonth.setText("July");}
	    	
	    		if(currentMonth.equals("July")) {lblMonth.setText("June");}
	    		
	    		if(currentMonth.equals("June")) {lblMonth.setText("May");}
	    		
	    		if(currentMonth.equals("May")) {lblMonth.setText("April");}
	    	
	    		if(currentMonth.equals("April")) {lblMonth.setText("March");}
	    		
	    		if(currentMonth.equals("March")) {lblMonth.setText("Feburary");}
	    		
	    		if(currentMonth.equals("Feburary")) {lblMonth.setText("January");}
	    		
	    		MIPcal1.setContentAreaFilled(false); MIPcal12.setContentAreaFilled(false); MIPcal22.setContentAreaFilled(false); 
	    		MIPcal2.setContentAreaFilled(false); MIPcal13.setContentAreaFilled(false); MIPcal23.setContentAreaFilled(false); 
	    		MIPcal3.setContentAreaFilled(false); MIPcal14.setContentAreaFilled(false); MIPcal24.setContentAreaFilled(false); 
	    		MIPcal4.setContentAreaFilled(false); MIPcal15.setContentAreaFilled(false); MIPcal25.setContentAreaFilled(false); 
	    		MIPcal5.setContentAreaFilled(false); MIPcal16.setContentAreaFilled(false); MIPcal26.setContentAreaFilled(false); 
	    		MIPcal6.setContentAreaFilled(false); MIPcal17.setContentAreaFilled(false); MIPcal27.setContentAreaFilled(false); 
	    		MIPcal7.setContentAreaFilled(false); MIPcal18.setContentAreaFilled(false); MIPcal28.setContentAreaFilled(false); 
	    		MIPcal8.setContentAreaFilled(false); MIPcal19.setContentAreaFilled(false); MIPcal29.setContentAreaFilled(false); 
	    		MIPcal9.setContentAreaFilled(false); MIPcal20.setContentAreaFilled(false); MIPcal30.setContentAreaFilled(false); 
	    		MIPcal10.setContentAreaFilled(false); MIPcal21.setContentAreaFilled(false); MIPcal31.setContentAreaFilled(false); 
	    		MIPcal11.setContentAreaFilled(false); 
	    		
	      		try {
		    			String month = lblMonth.getText();
		    			String year = lblYear.getText();
		    			
		    			bufferedWriter.write("CalendarRequestMIP");
		    			bufferedWriter.newLine();
		    			bufferedWriter.flush();
		    			
		    			bufferedWriter.write(year);
		    			bufferedWriter.newLine();
		    			bufferedWriter.flush();
		    			
		    			bufferedWriter.write(month);
		    			bufferedWriter.newLine();
		    			bufferedWriter.flush();
		    			
		    			
		    		}
		    		catch(IOException failureCalendarRequest) {}
	    	}
	    });
	  // btnNewButton_13_1.setOpaque(false);
	   // btnNewButton_13_1.setContentAreaFilled(false);
	   // btnNewButton_13_1.setBorderPainted(true);
	   // btnNewButton_13_1.setFocusPainted(false);
	    
	    JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Total Events:");
	    lblNewLabel_1_1_1_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Next Event:");
	    lblNewLabel_1_1_1_1_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    GroupLayout gl_panel_3 = new GroupLayout(panel_3);
	    gl_panel_3.setHorizontalGroup(
	    	gl_panel_3.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_3.createSequentialGroup()
	    			.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
	    			.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_3.createSequentialGroup()
	    					.addGap(18)
	    					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_panel_3.createSequentialGroup()
	    							.addComponent(btnNewButton_13_1)
	    							.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
	    							.addComponent(btnNewButton_13)
	    							.addContainerGap(65, Short.MAX_VALUE))
	    						.addGroup(gl_panel_3.createSequentialGroup()
	    							.addComponent(lblMonth)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(lblYear, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	    							.addGap(38))))
	    				.addGroup(gl_panel_3.createSequentialGroup()
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1_1_1_1_1_1)
	    						.addComponent(lblNewLabel_1_1_1_1_1))
	    					.addGap(75))))
	    );
	    gl_panel_3.setVerticalGroup(
	    	gl_panel_3.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_3.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblMonth, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblYear, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	    			.addGap(40)
	    			.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(btnNewButton_13)
	    				.addComponent(btnNewButton_13_1))
	    			.addGap(18)
	    			.addComponent(lblNewLabel_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(133, Short.MAX_VALUE))
	    		.addComponent(panel_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
	    );
	    panel_4.setLayout(new GridLayout(5, 7, 0, 0));
	    
	    

	    
	    JButton btnNewButton_23 = new JButton("");
	    btnNewButton_23.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
	    btnNewButton_23.setOpaque(false);
	    btnNewButton_23.setContentAreaFilled(false);
	    btnNewButton_23.setBorderPainted(true);
	    btnNewButton_23.setFocusPainted(false);
	    
	    panel_4.add(btnNewButton_23);
	    panel_3.setLayout(gl_panel_3);
	    calendarPanel.setLayout(gl_calendarPanel);
	    
	    JPanel messagePanel = new JPanel();
	    messagePanel.setBackground(new Color(240, 240, 240));
	    cardBoard.add(messagePanel, "name_17588859171200");
	    
	    textField_2 = new JTextField();
	    textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(210, 210, 210)));
	    textField_2.setBackground(new Color(240, 240, 240));
	    textField_2.setColumns(10);
	    textField_2.setColumns(10);
	    
	    JLabel lblNewLabel_1_1_1_3_2 = new JLabel("To:");
	    lblNewLabel_1_1_1_3_2.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JTextArea textArea_3 = new JTextArea();
	    textArea_3.setBackground(new Color(245, 245, 245));
	    textArea_3.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
	    
	    JButton btnNewButton_22 = new JButton("Send");
	    btnNewButton_22.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String username = textField_2.getText();
	    		String topic = textField_1.getText();
	    		String message = textArea_3.getText();
	    		
	    		try {
	    			bufferedWriter.write("messageInputRequest");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(username);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(message);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			String sender = lblNewLabel_1_2.getText();
	    			
	    			bufferedWriter.write(sender);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(topic);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    		}
	    		catch(IOException dad) {}
	    		
	    	}
	    });
	    //btnNewButton_22.setOpaque(false);
	    //btnNewButton_22.setContentAreaFilled(false);
	    //btnNewButton_22.setBorderPainted(true);
	    //btnNewButton_22.setFocusPainted(false);
	    
	    JButton btnNewButton_22_1 = new JButton("Reciepent List");
	    //btnNewButton_22_1.setOpaque(false);
	    //btnNewButton_22_1.setContentAreaFilled(false);
	    //btnNewButton_22_1.setBorderPainted(true);
	    //btnNewButton_22_1.setFocusPainted(false);
	    
	    JTextArea textPane_6 = new JTextArea();
	    textPane_6.setFont(new Font("Segoe UI", Font.PLAIN, 14));
	    textPane_6.setBorder(new MatteBorder(1, 1, 1, 0, (Color) new Color(0, 0, 0)));
	    textPane_6.setWrapStyleWord(true);
	    SimpleAttributeSet textPane_6center = new SimpleAttributeSet();
	    StyleConstants.setAlignment(textPane_6center, StyleConstants.ALIGN_LEFT);
	   // textPane_6doc.setParagraphAttributes(0, textPane_6doc.getLength(), textPane_6center, false);
	    
	    JLabel lblNewLabel_2 = new JLabel("Not found");
	    lblNewLabel_2.setVisible(false);
	    lblNewLabel_2.setForeground(Color.RED);
	    
	    textField_1 = new JTextField();
	   ;
	    textField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(210, 210, 210)));
	    textField_1.setBackground(new Color(240, 240, 240));
	    textField_1.setColumns(10);
	    
	    JLabel lblNewLabel_3 = new JLabel("Topic:");
	    
	    DefaultListModel demoList = new DefaultListModel();
	    JList list = new JList(demoList);
	    list.setBackground(new Color(245, 245, 245));
	    list.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
	    list.setFont(new Font("Sans Serif",Font.BOLD,12));
	    
	    MouseListener mouseListener = new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            	textPane_6.setText("");
	               String selectedItem = (String) list.getSelectedValue();
	               String userName = lblNewLabel_1_2.getText();
	               System.out.println("SELECTED: " + selectedItem);
	               
	               	    		try {
		    			bufferedWriter.write("messageSpecific_request");
		    			bufferedWriter.newLine();
		    			bufferedWriter.flush();
		    			
		    			bufferedWriter.write(selectedItem);
		    			bufferedWriter.newLine();
		    			bufferedWriter.flush();
		    			
		    			bufferedWriter.write(userName);
		    			bufferedWriter.newLine();
		    			bufferedWriter.flush();
		    			
		    		}
		    		catch(IOException dad) {}

	             }
	        }
	    };
	    list.addMouseListener(mouseListener);
	    
	    JPanel panel_7 = new JPanel();
	    panel_7.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
	    
	    
	    
	    GroupLayout gl_messagePanel = new GroupLayout(messagePanel);
	    gl_messagePanel.setHorizontalGroup(
	    	gl_messagePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_messagePanel.createSequentialGroup()
	    			.addGroup(gl_messagePanel.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_messagePanel.createParallelGroup(Alignment.LEADING)
	    					.addGroup(gl_messagePanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(lblNewLabel_1_1_1_3_2)
	    						.addPreferredGap(ComponentPlacement.RELATED))
	    					.addComponent(btnNewButton_22_1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
	    					.addGroup(gl_messagePanel.createSequentialGroup()
	    						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
	    						.addPreferredGap(ComponentPlacement.UNRELATED)
	    						.addComponent(btnNewButton_22)
	    						.addGap(4)
	    						.addComponent(lblNewLabel_2))
	    					.addGroup(gl_messagePanel.createSequentialGroup()
	    						.addGap(0)
	    						.addGroup(gl_messagePanel.createParallelGroup(Alignment.LEADING)
	    							.addComponent(textArea_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
	    							.addComponent(list, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
	    						.addGap(0)))
	    				.addGroup(gl_messagePanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(lblNewLabel_3)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_messagePanel.createParallelGroup(Alignment.LEADING, false)
	    				.addComponent(textPane_6)
	    				.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_messagePanel.setVerticalGroup(
	    	gl_messagePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_messagePanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_messagePanel.createParallelGroup(Alignment.TRAILING, false)
	    				.addGroup(Alignment.LEADING, gl_messagePanel.createSequentialGroup()
	    					.addGroup(gl_messagePanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_1_1_1_3_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(btnNewButton_22)
	    						.addComponent(lblNewLabel_2))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(btnNewButton_22_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_messagePanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_3))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(textArea_3))
	    				.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
	    			.addGap(0)
	    			.addGroup(gl_messagePanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textPane_6, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(list, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)))
	    );
	    
	    JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("Request Rank Change");
	    lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JComboBox comboBox_1 = new JComboBox();
	    comboBox_1.setBackground(Color.white);
	    
	    JButton btnNewButton_21_1_1 = new JButton("Request");
	    btnNewButton_21_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String RUN = lblNewLabel_1_2.getText();
	    		String rank = comboBox_1.getSelectedItem().toString();
	    		try {
	    			bufferedWriter.write("requestCommand");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(RUN);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("Rank Change");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(rank);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    		}
	    		catch(IOException dad) {}
	    	}
	    });
	    btnNewButton_21_1_1.setOpaque(false);
	    btnNewButton_21_1_1.setContentAreaFilled(false);
	    btnNewButton_21_1_1.setBorderPainted(true);
	    btnNewButton_21_1_1.setFocusPainted(false);
	    
	    JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Request Role Change");
	    lblNewLabel_1_1_1_2_1_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JComboBox comboBox = new JComboBox();
	    comboBox.setBackground(Color.white);
	    
	    	    
	    	    JButton btnNewButton_21_1 = new JButton("Request");
	    	    btnNewButton_21_1.addActionListener(new ActionListener() {
	    	    	public void actionPerformed(ActionEvent e) {
	    	    		String RUN = lblNewLabel_1_2.getText();
	    	    		String role = comboBox.getSelectedItem().toString();
	    	    		try {
	    	    			bufferedWriter.write("requestCommand");
	    	    			bufferedWriter.newLine();
	    	    			bufferedWriter.flush();
	    	    			
	    	    			bufferedWriter.write(RUN);
	    	    			bufferedWriter.newLine();
	    	    			bufferedWriter.flush();
	    	    			
	    	    			bufferedWriter.write("Role Change");
	    	    			bufferedWriter.newLine();
	    	    			bufferedWriter.flush();
	    	    			
	    	    			bufferedWriter.write(role);
	    	    			bufferedWriter.newLine();
	    	    			bufferedWriter.flush();
	    	    			
	    	    		}
	    	    		catch(IOException dad) {}
	    	    	}
	    	    });
	    	    btnNewButton_21_1.setOpaque(false);
	    	    btnNewButton_21_1.setContentAreaFilled(false);
	    	    btnNewButton_21_1.setBorderPainted(true);
	    	    btnNewButton_21_1.setFocusPainted(false);
	    
	    textField_3 = new JTextField();
	    textField_3.setColumns(10);
	    MouseListener mouseListener5 = new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = textField_3.getText();
	            if(text.equals("mm/dd/yy")) {
	            	textField_3.setText("");
	            	textField_3.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    };
	    textField_3.setForeground(new Color(127,127,127));
	    
	    textField_3.addMouseListener(mouseListener5);
	    textField_3.setText("mm/dd/yy");
	    
	    textField_3.addKeyListener(new KeyAdapter() {
	        public void keyReleased(KeyEvent e) {
	        	System.out.println("RELEASED");
	        }

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	System.out.println("TYPED");
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_3 = (JTextField) e.getSource();
	  		    String text = textField_3.getText();
	  		    textField_3.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_3.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_3.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_3.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    
	    
	    JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Request Date Change");
	    lblNewLabel_1_1_1_2_1.setFont(new Font("Monospaced", Font.BOLD, 14));
	    
	    JButton btnNewButton_21 = new JButton("Request");
	    btnNewButton_21.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String RUN = lblNewLabel_1_2.getText();
	    		String newDate = textField_3.getText();
	    		try {
	    			bufferedWriter.write("requestCommand");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(RUN);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write("Date Change");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(newDate);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    		}
	    		catch(IOException dad) {}
	    		
	    		
	    	}
	    });
	    btnNewButton_21.setOpaque(false);
	    btnNewButton_21.setContentAreaFilled(false);
	    btnNewButton_21.setBorderPainted(true);
	    btnNewButton_21.setFocusPainted(false);
	    
	    JLabel lblNewLabel_1_1_1_2_1_2 = new JLabel("Send a Request");
	    lblNewLabel_1_1_1_2_1_2.setFont(new Font("Monospaced", Font.BOLD, 22));
	    GroupLayout gl_panel_7 = new GroupLayout(panel_7);
	    gl_panel_7.setHorizontalGroup(
	    	gl_panel_7.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_7.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblNewLabel_1_1_1_2_1_2)
	    				.addComponent(lblNewLabel_1_1_1_2_1)
	    				.addGroup(gl_panel_7.createSequentialGroup()
	    					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(btnNewButton_21, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(lblNewLabel_1_1_1_2_1_1)
	    				.addGroup(gl_panel_7.createSequentialGroup()
	    					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(btnNewButton_21_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(lblNewLabel_1_1_1_2_1_1_1)
	    				.addGroup(gl_panel_7.createSequentialGroup()
	    					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
	    					.addGap(10)
	    					.addComponent(btnNewButton_21_1_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(66, Short.MAX_VALUE))
	    );
	    gl_panel_7.setVerticalGroup(
	    	gl_panel_7.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_7.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel_1_1_1_2_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(lblNewLabel_1_1_1_2_1)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_21))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel_1_1_1_2_1_1)
	    			.addGap(6)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_21_1))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblNewLabel_1_1_1_2_1_1_1)
	    			.addGap(6)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
	    				.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_21_1_1))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    panel_7.setLayout(gl_panel_7);
	    messagePanel.setLayout(gl_messagePanel);
	    
	    JPanel attendancePanel = new JPanel();
	    attendancePanel.setBackground(new Color(250, 250, 250));
	    cardBoard.add(attendancePanel, "name_660407274745600");
	    
	    JLabel lblOr = new JLabel("or");
	    lblOr.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 22));
	    
	    textField_4 = new JTextField();
	    textField_4.setColumns(10);
	    
	    JLabel lblNewLabel_5 = new JLabel("Custom Event Name");
	    
	    JPanel panel_9 = new JPanel();
	    
	    JLabel lblCustomEvent_1 = new JLabel("Reason");
	    lblCustomEvent_1.setFont(new Font("MS PGothic", Font.BOLD, 13));
	    
	    JTextPane textPane_2 = new JTextPane();
	    StyledDocument textPane_2doc = textPane_2.getStyledDocument();
	    SimpleAttributeSet textPane_2center = new SimpleAttributeSet();
	    StyleConstants.setAlignment(textPane_2center, StyleConstants.ALIGN_LEFT);
	    textPane_2doc.setParagraphAttributes(0, textPane_2doc.getLength(), textPane_2center, false);
	    textPane_2.setForeground(new Color(0, 0, 0));
	    textPane_2.setBackground(new Color(245, 245, 245));
	    textPane_2.setBorder( new MatteBorder(1, 1, 0, 0, (Color) new Color(0, 0, 0)));
	    
	    textField_5 = new JTextField();
	    textField_5.setColumns(10);
	    
	    JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Request Excused");
	    
	    JToggleButton xx = new JToggleButton("EVENT 1");
	    JToggleButton xxx = new JToggleButton("EVENT 1");
	    JToggleButton xxxxxx = new JToggleButton("EVENT 1");
	    JToggleButton xxxxx = new JToggleButton("EVENT 1");
	    JToggleButton xxxx = new JToggleButton("EVENT 1");
	    
	    
	    JButton btnNewButton_6 = new JButton("New button");
	    btnNewButton_6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String eventName = "Error";
	    		String reason = "Error";
	    		String requestExcused = "false";
	    		String target = lblNewLabel_1_2.getText();
	    		
	    		eventName = textField_4.getText();
	    				
	    		if(xx.isSelected()) {
	    			eventName = xx.getText();
	    		}
	    		if(xxx.isSelected()) {
	    			eventName = xxx.getText();
	    		}
	    		if(xxxx.isSelected()) {
	    			eventName = xxxx.getText();
	    		}
	    		if(xxxxx.isSelected()) {
	    			eventName = xxxxx.getText();
	    		}
	    		if(xxxxxx.isSelected()) {
	    			eventName = xxxxxx.getText();
	    		}
	    		
	    		reason = textField_5.getText();
	    		
	    		if(chckbxNewCheckBox_1.isSelected()) {
	    			requestExcused = "true";
	    		}
	    	
	    		
	    	
	    	try {
	    		bufferedWriter.write("portalAbsenceRegistration");
	    		bufferedWriter.newLine();
	    		bufferedWriter.flush();
	    		bufferedWriter.write(target);
	    		bufferedWriter.newLine();
	    		bufferedWriter.flush();
	    		bufferedWriter.write(requestExcused);
	    		bufferedWriter.newLine();
	    		bufferedWriter.flush();
	    		bufferedWriter.write(reason);
	    		bufferedWriter.newLine();
	    		bufferedWriter.flush();
	    		bufferedWriter.write(eventName);
	    		bufferedWriter.newLine();
	    		bufferedWriter.flush();
	    	} catch (IOException dad) {}
	    		
	    	System.out.println("Target: " + target);
	    	System.out.println("requestExcused: " + requestExcused);
	    	System.out.println("reason: " + reason);
	    	System.out.println("eventName: " + eventName);
	    	
		    try
		    {  
		    	textPane_2doc.insertString(0, eventName + "\n", null );
		    }
		    catch(Exception dad) { System.out.println(dad); }
	    	
	    	eventName = textField.getText();
	    	xx.setSelected(false);
	    	xxx.setSelected(false);
	    	xxxx.setSelected(false);
	    	xxxxx.setSelected(false);
	    	xxxxxx.setSelected(false);

    		
    		textArea.setText("");
    		chckbxNewCheckBox.setSelected(false);
    	
	
    		
	    		
	    	}
	    });
	    
	    
	    GroupLayout gl_attendancePanel = new GroupLayout(attendancePanel);
	    gl_attendancePanel.setHorizontalGroup(
	    	gl_attendancePanel.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_attendancePanel.createSequentialGroup()
	    			.addGroup(gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_attendancePanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
	    						.addComponent(lblNewLabel_5)
	    						.addComponent(lblOr, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblCustomEvent_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(chckbxNewCheckBox_1)
	    						.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
	    					.addGap(320))
	    				.addGroup(gl_attendancePanel.createSequentialGroup()
	    					.addGap(54)
	    					.addComponent(btnNewButton_6)
	    					.addPreferredGap(ComponentPlacement.RELATED)))
	    			.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
	    		.addComponent(panel_9, GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
	    );
	    gl_attendancePanel.setVerticalGroup(
	    	gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_attendancePanel.createSequentialGroup()
	    			.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addGroup(gl_attendancePanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_attendancePanel.createSequentialGroup()
	    					.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
	    					.addContainerGap())
	    				.addGroup(gl_attendancePanel.createSequentialGroup()
	    					.addComponent(lblOr, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(lblNewLabel_5)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    					.addGap(66)
	    					.addComponent(lblCustomEvent_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(chckbxNewCheckBox_1)
	    					.addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
	    					.addComponent(btnNewButton_6)
	    					.addGap(57))))
	    );
	    panel_9.setLayout(new GridLayout(1, 0, 5, 0));
	    

	    
	    xx.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		xx.setContentAreaFilled(true);
	    		//btnNewButton_6_1_1_1_1.setContentAreaFilled(false);
	    		//btnNewButton_6_1_1_1.setContentAreaFilled(false);
	    		//btnNewButton_6_1_1.setContentAreaFilled(false);
	    		//btnNewButton_6_1 .setContentAreaFilled(false);
	    		

	    		xxx.setSelected(false);
	    		xxxx.setSelected(false);
	    		xxxxx.setSelected(false);
	    		xxxxxx.setSelected(false);
	    		
	    		if(!xx.isSelected()) {
	    			xx.setContentAreaFilled(false);
	    		}
	    		
	    	
	    		
	    	}
	    });

	    
	    panel_9.add(xx);
	    

	    xxx.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	//	btnNewButton_6_1_1_1_1.setContentAreaFilled(true);
	    		//btnNewButton_6.setContentAreaFilled(false);
	    		//btnNewButton_6_1_1_1.setContentAreaFilled(false);
	    		//btnNewButton_6_1_1.setContentAreaFilled(false);
	    		//btnNewButton_6_1 .setContentAreaFilled(false);
	    		
	    		xx.setSelected(false);
	    		xxxx.setSelected(false);
	    		xxxxx.setSelected(false);
	    		xxxxxx.setSelected(false);
	    		
	    		if(!xxx.isSelected()) {
	    			xxx.setContentAreaFilled(false);
	    		}
	    		
	    	
	    	}
	    });
	    panel_9.add(xxx);
	    

	    xxxx.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	//	btnNewButton_6_1_1_1_1.setContentAreaFilled(false);
	    	//	btnNewButton_6.setContentAreaFilled(false);
	    	//	btnNewButton_6_1_1_1.setContentAreaFilled(true);
	    	//	btnNewButton_6_1_1.setContentAreaFilled(false);
	    	//	btnNewButton_6_1 .setContentAreaFilled(false);
	    		
	    		xx.setSelected(false);
	    		xxx.setSelected(false);
	    		xxxxx.setSelected(false);
	    		xxxxxx.setSelected(false);
	    		
	    		if(!xxxx.isSelected()) {
	    			xxxx.setContentAreaFilled(false);
	    		}
	    	}
	    });

	    panel_9.add(xxxx);

	    xxxxx.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//btnNewButton_6_1_1_1_1.setContentAreaFilled(false);
	    		//btnNewButton_6.setContentAreaFilled(false);
	    		//btnNewButton_6_1_1_1.setContentAreaFilled(false);
	    		//btnNewButton_6_1_1.setContentAreaFilled(true);
	    		//btnNewButton_6_1 .setContentAreaFilled(false);
	    		
	    		xx.setSelected(false);
	    		xxx.setSelected(false);
	    		xxxx.setSelected(false);
	    		xxxxxx.setSelected(false);
	    		
	    		if(!xxxxx.isSelected()) {
	    			xxxxx.setContentAreaFilled(false);
	    		}
	    	}
	    });

	    panel_9.add(xxxxx);
	    
	   
	    xxxxxx.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	//	btnNewButton_6_1_1_1_1.setContentAreaFilled(false);
	    	//	btnNewButton_6.setContentAreaFilled(false);
	    	//	btnNewButton_6_1_1_1.setContentAreaFilled(false);
	    	//	btnNewButton_6_1_1.setContentAreaFilled(false);
	    	//	btnNewButton_6_1 .setContentAreaFilled(true);
	    		
	    		xx.setSelected(false);
	    		xxx.setSelected(false);
	    		xxxx.setSelected(false);
	    		xxxxx.setSelected(false);
	    		
	    		if(!xxxxxx.isSelected()) {
	    			xxxxxx.setContentAreaFilled(false);
	    		}
	    	}
	    });
	    panel_9.add(xxxxxx);
	    attendancePanel.setLayout(gl_attendancePanel);
	    
	 
	    
	    
	    
	    Icon icon2 = new ImageIcon("src/bin/icons8_check_all_26px.png");
	    JButton btnNewButton = new JButton(icon2);
	    btnNewButton.setToolTipText("Attendance");
	    btnNewButton.setOpaque(false);
	    btnNewButton.setContentAreaFilled(false);
	    btnNewButton.setBorderPainted(false);
	    //btnNewButton.setOpaque(false);
	    //btnNewButton.setContentAreaFilled(false);
	    //btnNewButton.setBorderPainted(true);
	    //btnNewButton.setFocusPainted(false);
	    
	    
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textPane_2.setText("");
	    		cardBoard.removeAll();
	    		cardBoard.add(attendancePanel);
	    		cardBoard.repaint();
	    		cardBoard.revalidate();
	    		
	    		String target = lblNewLabel_1_2.getText();
	    		
	    		try {
	    			bufferedWriter.write("attendanceInformationRequest");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    			bufferedWriter.write(target);
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    		}
	    		catch(IOException dad) {}
	    	}
	    });
	    
	    Icon Pollicon = new ImageIcon("src/bin/icons8_survey_26px.png");
	    JButton btnNewButton_3 = new JButton(Pollicon);
	    btnNewButton.setToolTipText("Polls");
	   
	    btnNewButton_3.setOpaque(false);
	    btnNewButton_3.setContentAreaFilled(false);
	    btnNewButton_3.setBorderPainted(false);
	    
	   // btnNewButton_3.setOpaque(false);
	  //  btnNewButton_3.setContentAreaFilled(false);
	   // btnNewButton_3.setBorderPainted(true);
	   // btnNewButton_3.setFocusPainted(false);
	    
	    btnNewButton_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		lblNewLabel_4_2.setVisible(false);
	    		lblNewLabel_4.setVisible(false);
	    		try {
	    			bufferedWriter.write("pollInformationRequest");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	
	    			
	    		}
	    		catch (IOException ad) {}
	    		cardBoard.removeAll();
	    		cardBoard.add(pollPanel);
	    		cardBoard.repaint();
	    		cardBoard.revalidate();
	    	}
	    });
	    
	    Icon Infoicon = new ImageIcon("src/bin/icons8_automatic_26px.png");
	    JButton btnNewButton_4 = new JButton(Infoicon);
	    btnNewButton_4.setToolTipText("Your information");
	    btnNewButton_4.setOpaque(false);
	    btnNewButton_4.setContentAreaFilled(false);
	    btnNewButton_4.setBorderPainted(false);

	   // btnNewButton_4.setOpaque(false);
	   // btnNewButton_4.setContentAreaFilled(false);
	   // btnNewButton_4.setBorderPainted(true);
	   // btnNewButton_4.setFocusPainted(false);
	    
	    btnNewButton_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	       		cardBoard.removeAll();
	    		cardBoard.add(informationPanel);
	    		cardBoard.repaint();
	    		cardBoard.revalidate();
	    	}
	    });
	    Icon Calendaricon = new ImageIcon("src/bin/icons8_schedule_26px.png");
	    JButton btnNewButton_2 = new JButton(Calendaricon);
	    btnNewButton_4.setToolTipText("Calendar");
	    btnNewButton_2.setOpaque(false);
	    btnNewButton_2.setContentAreaFilled(false);
	    btnNewButton_2.setBorderPainted(false);
	
	    //btnNewButton_2.setOpaque(false);
	    //btnNewButton_2.setContentAreaFilled(false);
	   // btnNewButton_2.setBorderPainted(true);
	   // btnNewButton_2.setFocusPainted(false);
	    
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textPane_4.setText("");
	    		textPane_5.setText("");
	    		
	  		  DateTimeFormatter dtfMonth = DateTimeFormatter.ofPattern("MM");  
    		  LocalDateTime nowMonth = LocalDateTime.now();  
    		
    		int currentMonth = Integer.valueOf(dtfMonth.format(nowMonth));
    		System.out.println(currentMonth);
    		
    		if(currentMonth == 1) {lblMonth.setText("January"); }if(currentMonth == 7) {lblMonth.setText("July"); }
    		if(currentMonth == 2) {lblMonth.setText("Feburary"); }if(currentMonth == 8) {lblMonth.setText("August"); }
    		if(currentMonth == 3) {lblMonth.setText("March"); }if(currentMonth == 9) {lblMonth.setText("September"); }
    		if(currentMonth == 4) {lblMonth.setText("April"); }if(currentMonth == 10) {lblMonth.setText("October"); }
    		if(currentMonth == 5) {lblMonth.setText("May"); }if(currentMonth == 11) {lblMonth.setText("November"); }
    		if(currentMonth == 6) {lblMonth.setText("June"); }if(currentMonth == 12) {lblMonth.setText("December"); }
    		
    		  DateTimeFormatter dtfyear = DateTimeFormatter.ofPattern("yyyy");  
    		  LocalDateTime nowyear = LocalDateTime.now();  
    		
    		int currentyear = Integer.valueOf(dtfyear.format(nowyear));
    		System.out.println(currentyear);
    		
    		lblYear.setText(dtfyear.format(nowyear));
	    		
	    		
	       		cardBoard.removeAll();
		    		cardBoard.add(calendarPanel);
		    		cardBoard.repaint();
		    		cardBoard.revalidate();
		    		
		        	try {
		        		bufferedWriter.write("MIPcalendarFullRequest");
		    			bufferedWriter.newLine();
		    			bufferedWriter.flush();

		        	}
		        	catch(IOException FailedToDischargeSocket) {
		        		System.out.println("Error 9");
		        	}
		        	
		        	
	    	}
	    });
	    
	    Icon Inboxicon = new ImageIcon("src/bin/icons8_group_message_26px_1.png");
	    JButton btnNewButton_1 = new JButton(Inboxicon);
	    btnNewButton_1.setToolTipText("Messages");
	    btnNewButton_1.setOpaque(false);
	    btnNewButton_1.setContentAreaFilled(false);
	    btnNewButton_1.setBorderPainted(false);
	   
	   // btnNewButton_1.setOpaque(false);
	    //btnNewButton_1.setContentAreaFilled(false);
	    //btnNewButton_1.setBorderPainted(true);
	   // btnNewButton_1.setFocusPainted(false);
	    
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String nikkit = lblNewLabel_1_3.getText();
	    		demoList.removeAllElements();
	    		textPane_6.setText("");
	           	try {
	        		bufferedWriter.write("MIPinboxRequest");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    	 		bufferedWriter.write(nikkit);
	    	    	bufferedWriter.newLine();
	    	    	bufferedWriter.flush();
	    			
	    			bufferedWriter.write("messageStateCheck");
	    	    	bufferedWriter.newLine();
	    	    	bufferedWriter.flush();
	    			
	    			bufferedWriter.write(nikkit);
	    	    	bufferedWriter.newLine();
	    	    	bufferedWriter.flush();

	        	}
	        	catch(IOException FailedToDischargeSocket) {
	        		System.out.println("Error 9");
	        	}
	           	
	    		cardBoard.removeAll();
	    		cardBoard.add(messagePanel);
	    		cardBoard.repaint();
	    		cardBoard.revalidate();
	    		
	    	}
	    });
	    
	    Icon Exiticon = new ImageIcon("src/bin/icons8_exit_sign_26px_1.png");
	    JButton btnNewButton_1_1 = new JButton(Exiticon);
	    btnNewButton_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	        	try {
	        		System.out.println("Closing...");
	        		bufferedWriter.write("CLOSE");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    		socket.close();
	        	bufferedReader.close();
	        	bufferedWriter.close();
	        	
	        	}
	        	catch(IOException FailedToDischargeSocket) {
	        		System.out.println("Error 9");
	        	}
	        	
	    		frame.dispose();
	    		System.exit(0);
	    	}
	    });
	    btnNewButton_1_1.setToolTipText("Messages");
	    btnNewButton_1_1.setOpaque(false);
	    btnNewButton_1_1.setContentAreaFilled(false);
	    btnNewButton_1_1.setBorderPainted(false);
	    GroupLayout gl_btnPanel = new GroupLayout(btnPanel);
	    gl_btnPanel.setHorizontalGroup(
	    	gl_btnPanel.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(Alignment.LEADING, gl_btnPanel.createSequentialGroup()
	    			.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(49, Short.MAX_VALUE))
	    );
	    gl_btnPanel.setVerticalGroup(
	    	gl_btnPanel.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_btnPanel.createSequentialGroup()
	    			.addGroup(gl_btnPanel.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_btnPanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_btnPanel.createParallelGroup(Alignment.TRAILING)
	    					.addGroup(gl_btnPanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
	    					.addGroup(gl_btnPanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
	    					.addGroup(gl_btnPanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
	    					.addGroup(Alignment.LEADING, gl_btnPanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
	    					.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
	    			.addContainerGap())
	    );
	    btnPanel.setLayout(gl_btnPanel);
	    frame.getContentPane().setLayout(groupLayout);
	    
	    frame.addWindowListener(new WindowAdapter() {

	        @Override
	        public void windowClosing(WindowEvent e) {
	        	try {
	        		System.out.println("Closing...");
	        		bufferedWriter.write("CLOSE");
	    			bufferedWriter.newLine();
	    			bufferedWriter.flush();
	    			
	    		socket.close();
	        	bufferedReader.close();
	        	bufferedWriter.close();
	        	
	        	}
	        	catch(IOException FailedToDischargeSocket) {
	        		System.out.println("Error 9");
	        	}
	        }
	    });
		
		
	  
		
		
		
		
		
	    class readingThread implements Runnable {

	        public void run(){
	 

	    try {
 

	    
	    while(true) {//------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    	System.out.println("Portal Listening");
	    	String messageFromServer = bufferedReader.readLine();
	    	System.out.println("Message from server: " + messageFromServer);
	    	
	    	
	    	if(messageFromServer.equals("login_request")) {
	    		String loginTarget = bufferedReader.readLine();
	    		
	    		if(loginTarget.equals("login_nikkitInvalid")) {
	    			System.out.println("NIKKIT Invalid");
	    		
	    		}
	    		if(loginTarget.equals("login_userNameInvalid")) { 
	    			System.out.println("Username Invalid");
	    		}
	    		if(loginTarget.equals("login_accountCreated")) {
	    			
	    			System.out.println("Account Created");
	    		}
	    		
	    	}//LOGIN REQUESTS
	    	if(messageFromServer.equals("login_success")) {
	    		  System.out.println("1234");
	    		  frame.setVisible(true);
	    		  
	    		  String RU = bufferedReader.readLine();
	    		  System.out.println("RU: " + RU);
	    		  String E = bufferedReader.readLine();
	    		  System.out.println("E: " + E);
	    		  String P = bufferedReader.readLine();
	    		  System.out.println("P: " + P);
	    		  String R = bufferedReader.readLine();
	    		  System.out.println("R" + R);
	    		  String RO = bufferedReader.readLine();
	    		  System.out.println("RO: " + RO);
	    		  String SD = bufferedReader.readLine();
	    		  System.out.println("SD: " + SD);
	    		  String NU = bufferedReader.readLine();
	    		  System.out.println("NU: " + NU);
	    		  
	    		  
	    		  lblNewLabel_1_2.setText(RU);
	    		  lblNewLabel_1_3.setText(NU);
	    		  lblNewLabel_1_2_1.setText(E);
	    		  lblNewLabel_1_2_3_7.setText(P);
	    		  lblNewLabel_1_2_2.setText(R);
	    		  lblNewLabel_1_2_3.setText(RO);
	    		  lblNewLabel_1_2_3_5.setText(SD);
	    		  
				  try
				  {
				bufferedWriter.write("alertMessagesRequest");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				bufferedWriter.write("messageStates");
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				bufferedWriter.write(lblNewLabel_1_2.getText());
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				bufferedWriter.write("pollStates");
				bufferedWriter.newLine();
				bufferedWriter.flush();

				}catch (IOException failureToRequestSysSet) {
					
				}
	    		  
	    		  
	    		  
	    	}
	    	if(messageFromServer.equals("login_accountNotFound") || messageFromServer.equals("login_passwordInvalid")) {
	    		
	    		
	    		File myObj = new File(document + "/NIKKITUSERDATA"); 
	    	    myObj.delete();
  
	    	    if(messageFromServer.equals("login_passwordInvalid")) {
	    	    	JOptionPane.showMessageDialog(null, "Your account could not be found - Please Login");
	    	    	
	    	}
	    	    if(messageFromServer.equals("login_accountNotFound")) {
	      	
	    	    JOptionPane.showMessageDialog(null, "Auto-Login failed - Invalid Passowrd - Please Login");
    
	    	}
	    	    
	    
	    	    
	    	  
	    	}
	    	
	    	if(messageFromServer.equals("attendanceEventNames")) {
	    		String event5 = bufferedReader.readLine();
	    		String event4 = bufferedReader.readLine();
	    		String event3 = bufferedReader.readLine();
	    		String event2 = bufferedReader.readLine();
	    		String event1 = bufferedReader.readLine();
	    		
	    		xx.setText(event1);
	    		xxx.setText(event2);
	    		xxxx.setText(event3);
	    		xxxxx.setText(event4);
	    		xxxxxx.setText(event5);
	    	
	    		
	    	}
	    	if(messageFromServer.equals("attendanceEventActivity")) {
	    		String event5 = bufferedReader.readLine();
	    		String event4 = bufferedReader.readLine();
	    		String event3 = bufferedReader.readLine();
	    		String event2 = bufferedReader.readLine();
	    		String event1 = bufferedReader.readLine();
	    		
	    		if(event5.equals("ACTIVE")) {xxxxxx.setEnabled(true); } if(event5.equals("UNACTIVE")) {xxxxxx.setEnabled(false); }
	    		if(event4.equals("ACTIVE")) {xxxxx .setEnabled(true); } if(event4.equals("UNACTIVE")) {xxxxx.setEnabled(false); }
	    		if(event3.equals("ACTIVE")) {xxxx.setEnabled(true); } if(event3.equals("UNACTIVE")) {xxxx.setEnabled(false); }
	    		if(event2.equals("ACTIVE")) {xxx.setEnabled(true); } if(event2.equals("UNACTIVE")) {xxx.setEnabled(false); }
	    		if(event1.equals("ACTIVE")) {xx.setEnabled(true); } if(event1.equals("UNACTIVE")) {xx.setEnabled(false); }
	    	}
	    	
	    	if(messageFromServer.equals("attendanceAbsenceActivityData")) {
	    		String absences = bufferedReader.readLine();
	    		absences = absences.replace("[", "");
	    		absences = absences.replace("]", "");
	    		String absencesArr[] = absences.split(", ");
	    		
	    		for(String x : absencesArr) {
				    try
				    {
				    	textPane_2doc.insertString(0, x + "\n", null );
				    }
				    catch(Exception e) { System.out.println(e); }
	    		}
	    		
	    		
	    	}
	    	
	    	if(messageFromServer.equals("pollData_input")) {
	    		
	 	      		String pollOneQuestion = bufferedReader.readLine();
	 	      		String pollTwoQuestion = bufferedReader.readLine();
	 	      		String pollThreeQuestion = bufferedReader.readLine();
	 	      		String pollFourQuestion = bufferedReader.readLine();
	 	      		
	         		String pollOneOne = bufferedReader.readLine();
	         		String pollOneTwo = bufferedReader.readLine();
	         		String pollOneThree = bufferedReader.readLine();
	         		String pollOneFour = bufferedReader.readLine();
	         
	         		
	         		
	         		String pollTwoOne = bufferedReader.readLine();
	         		String pollTwoTwo = bufferedReader.readLine();
	         		String pollTwoThree = bufferedReader.readLine();
	         		String pollTwoFour = bufferedReader.readLine();
	         		
	         		
	         		
	         		String pollThreeOne = bufferedReader.readLine();
	         		String pollThreeTwo = bufferedReader.readLine();
	         		String pollThreeThree = bufferedReader.readLine();
	         		String pollThreeFour = bufferedReader.readLine();
	         		
	         		
	         	
	         		String pollFourOne = bufferedReader.readLine();
	         		String pollFourTwo = bufferedReader.readLine();
	         		String pollFourThree = bufferedReader.readLine();
	         		String pollFourFour = bufferedReader.readLine();
	         		
	        		String pollOneActive = bufferedReader.readLine();
	        		String pollTwoActive = bufferedReader.readLine();
	        		String pollThreeActive = bufferedReader.readLine();
	         		String pollFourActive = bufferedReader.readLine();
	         		String pollState = bufferedReader.readLine();
	         		
	         		
	        		System.out.println("----------------PollStateCheck-----------------");
		    		
		    		System.out.println("pollState" + pollState);
		    		String currentState = "";
		    		 
		    		  
		    	  	     try (BufferedReader br = new BufferedReader(new FileReader(document + "/NIKKITUSERDATA"))) {
			    	    	 String line;
			    	    	 
			    	    	 while ((line = br.readLine()) != null) {
			    	    		 if(line.startsWith("poll:")) {
			    	    			 currentState = line.replace("poll:", "");
			    	    		 }
			    	    		 
			    	    		 
			    	    	 }
			    	    	 
					      }
		    	  	     
		    		  
		    	  	     Path path = Paths.get(document + "/NIKKITUSERDATA");
	 					Charset charset = StandardCharsets.UTF_8;
	 					System.out.println("currentState " + currentState );
	 					System.out.println("pollState " + pollState );
	 					String content = new String(Files.readAllBytes(path), charset);
	 					content = content.replaceAll("poll:" + currentState, "poll:" + pollState);
	 					Files.write(path, content.getBytes(charset));
	 					
	 				     Icon Pollicon = new ImageIcon("src/bin/icons8_survey_26px.png");
	 				     btnNewButton_3.setIcon(Pollicon);
	 					
	 					
	 					
	         		
	         		System.out.println("1 active " + pollOneActive);
	         		System.out.println("2 active " + pollTwoActive);
	         		System.out.println("3 active " + pollThreeActive);
	         		System.out.println("4 active " + pollFourActive);
	    		
	         		
	         		if(pollOneActive.equals("active")) {
	         		textArea_1.setText(pollOneQuestion);
	         		btnNewButton_9_1_1_1.setText("1. " + pollOneOne);
	         		btnNewButton_11_1_1_1 .setText("2. " + pollOneTwo);
	         		btnNewButton_10_1_1_1 .setText("3. " + pollOneThree);
	         		btnNewButton_8_1_1_1 .setText("4. " + pollOneFour);
	         		textArea_1.setEnabled(true);
	         		btnNewButton_9_1_1_1.setEnabled(true);
	         		btnNewButton_11_1_1_1.setEnabled(true);
	         		btnNewButton_10_1_1_1.setEnabled(true);
	         		btnNewButton_8_1_1_1.setEnabled(true);
	         		}
	         		else {
		         		textArea_1.setText("Poll Unavailable");
		         		btnNewButton_9_1_1_1.setText("Unavaialble");
		         		btnNewButton_11_1_1_1 .setText("Unavaialble");
		         		btnNewButton_10_1_1_1 .setText("Unavaialble");
		         		btnNewButton_8_1_1_1 .setText("Unavaialble");
		         		textArea_1.setEnabled(false);
		         		btnNewButton_9_1_1_1.setEnabled(false);
		         		btnNewButton_11_1_1_1.setEnabled(false);
		         		btnNewButton_10_1_1_1.setEnabled(false);
		         		btnNewButton_8_1_1_1.setEnabled(false);	
		         		
	         		}
	         		
	         		if(pollTwoActive.equals("active")) {
	         			textArea_1_1_1_1.setText(pollTwoQuestion);
	         			btnNewButton_9_1_1 .setText("1. " + pollTwoOne);
	         			btnNewButton_11_1_1  .setText("2. " + pollTwoTwo);
	         			btnNewButton_10_1_1  .setText("3. " + pollTwoThree);
	         			btnNewButton_8_1_1  .setText("4. " + pollTwoFour);
	         			textArea_1_1_1_1.setEnabled(true);
	         			btnNewButton_9_1_1 .setEnabled(true);
	         			btnNewButton_11_1_1 .setEnabled(true);
	         			btnNewButton_10_1_1 .setEnabled(true);
	         			btnNewButton_8_1_1 .setEnabled(true);
	         		}
	         		else {
	         			textArea_1_1_1_1.setText("Poll Unavailable");
	         			btnNewButton_9_1_1.setText("Unavaialble");
	         			btnNewButton_11_1_1 .setText("Unavaialble");
	         			btnNewButton_10_1_1 .setText("Unavaialble");
	         			btnNewButton_8_1_1 .setText("Unavaialble");
	         			textArea_1_1_1_1.setEnabled(false);
	         			btnNewButton_9_1_1.setEnabled(false);
	         			btnNewButton_11_1_1.setEnabled(false);
	         			btnNewButton_10_1_1.setEnabled(false);
	         			btnNewButton_8_1_1.setEnabled(false);	
	         		}
	         		
	         		if(pollThreeActive.equals("active")) {
	         			textArea_1_1.setText(pollThreeQuestion);
	         			btnNewButton_9 .setText("1. " + pollThreeOne);
	         			btnNewButton_11  .setText("2. " + pollThreeTwo);
	         			btnNewButton_10  .setText("3. " + pollThreeThree);
	         			btnNewButton_8  .setText("4. " + pollThreeFour);
	         			textArea_1_1.setEnabled(true);
	         			btnNewButton_9.setEnabled(true);
	         			btnNewButton_11.setEnabled(true);
	         			btnNewButton_10.setEnabled(true);
	         			btnNewButton_8.setEnabled(true);
	         		}
	         		else {
	         			textArea_1_1.setText("Poll Unavailable");
		         		btnNewButton_9.setText("Unavaialble");
		         		btnNewButton_11 .setText("Unavaialble");
		         		btnNewButton_10 .setText("Unavaialble");
		         		btnNewButton_8 .setText("Unavaialble");
		         		btnNewButton_9.setEnabled(false);
		         		btnNewButton_9.setEnabled(false);
		         		btnNewButton_11.setEnabled(false);
		         		btnNewButton_10.setEnabled(false);
		         		btnNewButton_8.setEnabled(false);	
	         		}
	         		
	         		if(pollFourActive.equals("active")) {
	         			textArea_1_1_1.setText(pollFourQuestion);
	         			btnNewButton_9_1 .setText("1. " + pollFourOne);
	         			btnNewButton_11_1  .setText("2. " + pollFourTwo);
	         			btnNewButton_10_1  .setText("3. " + pollFourThree);
	         			btnNewButton_8_1  .setText("4. " + pollFourFour);
	         			textArea_1_1_1.setEnabled(true);
	         			btnNewButton_9_1.setEnabled(true);
	         			btnNewButton_11_1.setEnabled(true);
	         			btnNewButton_10_1.setEnabled(true);
	         			btnNewButton_8_1.setEnabled(true);
	         		}
	         		else {
	         			textArea_1_1_1.setText("Poll Unavailable");
	         			btnNewButton_9_1.setText("Unavaialble");
	         			btnNewButton_11_1 .setText("Unavaialble");
	         			btnNewButton_10_1 .setText("Unavaialble");
	         			btnNewButton_8_1 .setText("Unavaialble");
		         		textArea_1_1_1.setEnabled(false);
		         		btnNewButton_9_1.setEnabled(false);
		         		btnNewButton_11_1.setEnabled(false);
		         		btnNewButton_10_1.setEnabled(false);
		         		btnNewButton_8_1.setEnabled(false);	
	         		}
	         		
	         		
	         		
	         		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    	}
	    	
	    	
	    	if(messageFromServer.equals("poll_updateData")) {
	    		lblNewLabel_4_2.setText(bufferedReader.readLine());
	    		lblNewLabel_4_2.setVisible(true);
	    		
	    	}
	    	if(messageFromServer.equals("poll_updateDataTypeTwo")) {
	    		lblNewLabel_4.setText(bufferedReader.readLine());
	    		lblNewLabel_4.setVisible(true);
	    	}
	    	
    		if(messageFromServer.equals("calendarOutputMIP")) {
    			String day = bufferedReader.readLine();
    			String event = bufferedReader.readLine();
    			String info = bufferedReader.readLine();
    			
    			System.out.println("Calendar");
    			System.out.println("Day of Event: " + day);
    			System.out.println("Event: " + event);
    			System.out.println("Info of event: " + info);
    			
if(day.equals("1")) {MIPcal1.setContentAreaFilled(true);MIPcal1.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("17")) {MIPcal17.setContentAreaFilled(true);MIPcal17.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("2")) {MIPcal2.setContentAreaFilled(true);MIPcal2.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("18")) {MIPcal18.setContentAreaFilled(true);MIPcal18.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("3")) {MIPcal3.setContentAreaFilled(true);MIPcal3.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("19")) {MIPcal19.setContentAreaFilled(true);MIPcal19.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("4")) {MIPcal4.setContentAreaFilled(true);MIPcal4.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("20")) {MIPcal20.setContentAreaFilled(true);MIPcal20.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("5")) {MIPcal5.setContentAreaFilled(true);MIPcal5.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("21")) {MIPcal21.setContentAreaFilled(true);MIPcal21.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("6")) {MIPcal6.setContentAreaFilled(true);MIPcal6.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("22")) {MIPcal22.setContentAreaFilled(true);MIPcal22.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("7")) {MIPcal7.setContentAreaFilled(true);MIPcal7.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("23")) {MIPcal23.setContentAreaFilled(true);MIPcal23.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("8")) {MIPcal8.setContentAreaFilled(true);MIPcal8.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("24")) {MIPcal24.setContentAreaFilled(true);MIPcal24.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("9")) {MIPcal9.setContentAreaFilled(true);MIPcal9.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("25")) {MIPcal25.setContentAreaFilled(true);MIPcal25.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("10")) {MIPcal10.setContentAreaFilled(true);MIPcal10.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("26")) {MIPcal26.setContentAreaFilled(true);MIPcal26.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("11")) {MIPcal11.setContentAreaFilled(true);MIPcal11.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("27")) {MIPcal27.setContentAreaFilled(true);MIPcal27.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("12")) {MIPcal12.setContentAreaFilled(true);MIPcal12.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("28")) {MIPcal28.setContentAreaFilled(true);MIPcal28.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("13")) {MIPcal13.setContentAreaFilled(true);MIPcal13.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("29")) {MIPcal29.setContentAreaFilled(true);MIPcal29.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("14")) {MIPcal14.setContentAreaFilled(true);MIPcal14.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("30")) {MIPcal30.setContentAreaFilled(true); MIPcal30.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("15")) {MIPcal15.setContentAreaFilled(true);MIPcal15.setBackground(SystemColor.inactiveCaptionBorder);}if(day.equals("31")) {MIPcal31.setContentAreaFilled(true); MIPcal31.setBackground(SystemColor.inactiveCaptionBorder);}
if(day.equals("16")) {MIPcal16.setContentAreaFilled(true);MIPcal16.setBackground(SystemColor.inactiveCaptionBorder);}

    		}
	    	
	    	
    		if(messageFromServer.equals("calendarDataMIP")) {
    			textArea_2.append(bufferedReader.readLine() + "\n" + bufferedReader.readLine());
    		}
    		
	    	
    		if(messageFromServer.equals("fullCalendarData")) {
    			String date = bufferedReader.readLine();
    			String eventName = bufferedReader.readLine();
    			String eventDetails = bufferedReader.readLine();
    		
			    try
			    {
			    	textPane_4doc.insertString(0, eventName + " - " + eventDetails + "\n", null );
			    }
			    catch(Exception e) { System.out.println(e); }
			    try
			    {
			    	textPane_5doc.insertString(0, date + "\n", null );
			    }
			    catch(Exception e) { System.out.println(e); }
    			
    		}

	    	
    		if(messageFromServer.equals("inboxDataRequest")) {
    			
    			String time = bufferedReader.readLine();
    			String topic = bufferedReader.readLine();
    			
    			System.out.print("adding: " + time + " | " + topic);
    			demoList.addElement(time + " | " + topic);
    			
    	

    		}
	    	
    		if(messageFromServer.equals("inboxReciepentAvailable")) {
    			lblNewLabel_2.setVisible(false);
    			textArea_3.setText("");
    			textField_2.setText("");
    		}
    		
    		if(messageFromServer.equals("inboxReciepentNotAvailable")) {

    			lblNewLabel_2.setVisible(true);
    		}
    		
       		if(messageFromServer.equals("roleComboAdd")) {
      			String presetRanks = bufferedReader.readLine();
    			String[] presetRanksArr = presetRanks.split(",");    
    			comboBox.removeAllItems();
    			for ( String ss : presetRanksArr) {
    				comboBox.addItem(ss);
    				
    			}
    		}
       		
       		if(messageFromServer.equals("rankComboAdd")) {
    			
    			String presetRanks = bufferedReader.readLine();
    			String[] presetRanksArr = presetRanks.split(",");    
    			comboBox_1.removeAllItems();
    			for ( String ss : presetRanksArr) {
    				comboBox_1.addItem(ss);
    				
    			}
    		}
	    	
       		if(messageFromServer.equals("requestsNumberData")) {
       			
       			String number = bufferedReader.readLine();
       		   JOptionPane.showMessageDialog(null,"Your request number is: " + number,"Requests Information",1);
       			
       		}
       		
 
			
       		if(messageFromServer.equals("MessageDetails_Data")) {
       			String messageToShow = bufferedReader.readLine();
       			String sender = bufferedReader.readLine();
       			System.out.println("messageToShow: " + messageToShow);
			  
			    	textPane_6.setText( messageToShow + "\nFrom: " + sender);
			    
			   
			    
       		}
       		
       		if(messageFromServer.equals("messageState")) {
       			System.out.println("---------------MESSAGE STATE-------------------");
       			String serverMessageState = bufferedReader.readLine();
       			System.out.println("serverMessageState " + serverMessageState);
       			String localState = "";
      	
    		  
 	  	     try (BufferedReader br = new BufferedReader(new FileReader(document + "/NIKKITUSERDATA"))) {
	    	    	 String line;
	    	    	 
	    	    	 while ((line = br.readLine()) != null) {
	    	    		 if(line.startsWith("message:")) {
	    	    			 localState = line.replace("message:", "");
	    	    		 }
	    	    		 
	    	    		 
	    	    	 }
	    	    	 
			      }
 	  	     System.out.println("localState " + localState);
 	  	     if(!serverMessageState.equals(localState)) {
 	  	     Icon InboxiconALERT = new ImageIcon("src/bin/messageUpdate.png");
 	 	      btnNewButton_1.setIcon(InboxiconALERT);
 	  	     }
 	  	     
       		}
       		
       		if(messageFromServer.equals("messageStateCheck")) {
       	  		System.out.println("----------------messageStateCheck-----------------");
	    		String messageState = bufferedReader.readLine();
	    		String currentState = "";
	    		  File myObj = new File(document + "/NIKKITUSERDATA");
	    		  
	    	  	     try (BufferedReader br = new BufferedReader(new FileReader(document + "/NIKKITUSERDATA"))) {
		    	    	 String line;
		    	    	 
		    	    	 while ((line = br.readLine()) != null) {
		    	    		 if(line.startsWith("message:")) {
		    	    			 currentState = line.replace("message:", "");
		    	    		 }
		    	    		 
		    	    		 
		    	    	 }
		    	    	 
				      }
	    	  	     
	    		  
	    	  	     Path path = Paths.get(document + "/NIKKITUSERDATA");
 					Charset charset = StandardCharsets.UTF_8;
 					System.out.println("currentState " + currentState );
 					System.out.println("messageState " + messageState );
 					String content = new String(Files.readAllBytes(path), charset);
 					content = content.replaceAll("message:" + currentState, "message:" + messageState);
 					Files.write(path, content.getBytes(charset));
 					
 					  Icon Inboxicon = new ImageIcon("src/bin/icons8_group_message_26px_1.png");
 		 	 	      btnNewButton_1.setIcon(Inboxicon);
       		}
       		
       		
       		if(messageFromServer.equals("pollState_Data")) {
       			String serverState = bufferedReader.readLine();
       			String currentState = "";
       			
   	  	     try (BufferedReader br = new BufferedReader(new FileReader(document + "/NIKKITUSERDATA"))) {
    	    	 String line;
    	    	 
    	    	 while ((line = br.readLine()) != null) {
    	    		 if(line.startsWith("poll:")) {
    	    			 currentState = line.replace("poll:", "");
    	    		 }
    	    		 
    	    		 
    	    	 }
    	    	 
		      }
   	  	     System.out.println("currentState" + currentState);
   	  	System.out.println("serverState" + serverState);
   	  	     if(!currentState.equals(serverState)) {
   	  	    Icon PolliconALERT = new ImageIcon("src/bin/surveyUPDATE.png");
   		     btnNewButton_3.setIcon(PolliconALERT);
   	  	     }
       			
       		}
       		
       		
       	 	if(messageFromServer.equals("alertMessage_Reponse")) {
	    		String message = bufferedReader.readLine();
	    		alertMessages.add(message);
	    		System.out.println("Alert Message: " + message);
	    	}
			

	    	
	    	
       	
    
       	
       	
       	
       	
	    }//------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    }catch(Exception da) {}
	        }
	    }
	    
	    
	    	
	   	 Thread t1 = new Thread(new readingThread());
		 t1.start();
	    	
	    
		   class messageField implements Runnable {
				  
				  

		       public void run(){
		    	   
		    
		      	   try {
			    	   TimeUnit.SECONDS.sleep(3);
			    	   }
			    	   catch (Exception dad) { }
		    		   
		       
		    	   System.out.println("t2 Running");
		    	   
		    	   int arrayLocation = 0;
		    	   int temp = 0;
		    	   while(true) {
		    		  
		    		 
		    		    temp = arrayLocation;
		    		    while( temp == arrayLocation) {
		    		    arrayLocation = 0 + (int)(Math.random() * ((alertMessages.size() - 1) + 1));   
		    		    System.out.println("arrayLocation: " + arrayLocation);
		    		    }
		    		    System.out.println("alertMessages.size(): " + alertMessages.size());
		    		   String messageToShow = alertMessages.get(arrayLocation);
		    		   System.out.println("messgeToShow: " + messageToShow);
		    		   String[] messageInCharArry = messageToShow.split("");
		    		   
		    		   int x = 1;
		    		   while(x != messageInCharArry.length + 1) {
		    			  // System.out.println("x: " + x);
		    			
		    	   try {
		    		//   System.out.println("Trying to write");
		    		//   System.out.println(messageInCharArry[messageInCharArry.length - x] + textPane_14.getText());
		    		//   System.out.println("Individual to add: " + messageInCharArry[messageInCharArry.length - x]);
		    		   
		    		   style.insertString(0,  messageInCharArry[messageInCharArry.length - x], null ); 

		    	   
		    	   }
				    catch(Exception e) {  System.out.println("12314 " + e); }
		    	   
		    	   try {
			    	   TimeUnit.MILLISECONDS.sleep(60);
			    	   }
			    	   catch (Exception dad) { }
		    	   x++; 
		    	  // System.out.println("New x: " + x);
		    		   }//FOR 2-----------------------
		
		    	   try {
		    	   TimeUnit.MILLISECONDS.sleep(60);
		    	   }
		    	   catch (Exception dad) { }
		    	
		    	   //WORD^
		    	 //  System.out.println("Array Location: " + arrayLocation );
		    	   
		    	   
		    	   
		    	   
		    
		    	   
		    	   
		    	 
		    	   
		    	   for(int xax = 0; xax < 300; xax++) {
		    		   
		    		 //  System.out.println("xax: " + xax);
		    	  // textPane_14.setText(textPane_14.getText() + " ");
		    	   try {

		    		   style.insertString(0, "\u2006", null ); }
					    catch(Exception e) { System.out.println(e); }
		    	   try {
		    	   TimeUnit.MILLISECONDS.sleep(65);
		    	   }
		    	   catch (Exception dadd) { }
		    	   
		    	   }//^BLANKS
		    	   textPane.setText("");
		    	   

		    	
		    	   
		    	
		       }//WHILE TRUE
		       }
		       }
			
			 Thread t2 = new Thread(new messageField());
			 t2.start();
			 
			 

		
		if(!file.exists()) {
			bufferedWriter.write("portalMainDisconnectForVerify");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			bufferedWriter.close();
			bufferedReader.close();
			socket.close();
			
			userVerify.main(new String[0]);
			frame.disable();
			frame.setVisible(false);
			frame.dispose();
			
		}
		
		
    

		
		
		
		
		 
	}
}
