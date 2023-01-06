import javax.swing.JFrame;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.InputMap;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextPane;
import javax.swing.BoxLayout;
import javax.swing.border.MatteBorder;
import java.awt.CardLayout;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import com.k33ptoo.components.KGradientPanel;
import java.awt.FlowLayout;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.SystemColor;
public class administrativeMainClass {
	static String JFrameTitle = "Administrative Demo";
	private static JTextField add_NameTextField_TextField;
	private static JTextField add_NikkitUsername_JTextField;
	private static JTextField add_NikkitPassword_JTextField;
	private static JTextField add_email_JTextField;
	private static JTextField add_startingDate_textField;
	private static JTextField search_TargetField;
	private static JTextField edit_targetName_JTextField;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JTextField edit_email_JTextField;
	private static JTextField edit_nikkitUsername_JTextField;
	private static JTextField edit_Username_JTextField;
	private static JTextField add_QuestionOneSecurity_TextField;
	private static JTextField add_QuestionTwoSecurity_JTextField;
	private static JTextField textField_17;
	private static JTextField textField_18;
	private static JTextField textField_19;
	private static JTextField textField_20;
	private static JTextField textField_21;
	private static JTextField textField_22;
	private static JTextField textField_23;
	private static JTextField textField_24;
	private static JTextField textField_25;
	private static JTextField textField_26;
	private static JTextField textField_27;
	private static JTextField textField_28;
	private static JTextField textField_29;
	private static JTextField textField_30;
	private static JTextField textField_31;
	private static JTextField textField_32;
	private static JTextField textField_33;
	private static JTextField textField_34;
	private static JTextField textField_35;
	private static JTextField textField_36;
	private static JTextField textField_37;
	private static JTextField textField_38;
	private static JTextField textField_39;
	private static JTextField textField_40;
	private static JTextField txtAmount;
	private static JTextField textField_41;
	private static JTextField textField_42;
	private static JTextField textField_43;
	private static JTextField textField;
	private static JTextField textField_1;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main (String[] args) throws Exception {
		FlatLightLaf.setup();
	    JFrame mainFrame = new JFrame(JFrameTitle);
	    mainFrame.setBackground(new Color(0, 0, 0));
	    mainFrame.setSize(1400,850);
	    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    
	    LocalDateTime systemDateTime = LocalDateTime.now();
	    DateTimeFormatter systemFormattedDateTime = DateTimeFormatter.ofPattern("MM/dd/yy");
	    String systemDateTimeFinal = systemDateTime.format(systemFormattedDateTime);
	    
	    
	    
	    UIManager.getLookAndFeelDefaults().put( "ScrollBar.thumb", Color.white );
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    JPanel leftBarPanel = new JPanel();
	    leftBarPanel.setBackground(new Color(22,33,53));
	    leftBarPanel.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
	    
	    JPanel auxiliaryBarPanel = new JPanel();
	    auxiliaryBarPanel.setBackground(new Color(52, 41, 119));
	    
	    JPanel cardBoardPanel = new JPanel();
	    cardBoardPanel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
	    
	    JTextPane textPane_8 = new JTextPane();
	    
	    GroupLayout groupLayout = new GroupLayout(mainFrame.getContentPane());
	    groupLayout.setHorizontalGroup(
	    	groupLayout.createParallelGroup(Alignment.LEADING)
	    		.addGroup(groupLayout.createSequentialGroup()
	    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	    				.addGroup(groupLayout.createSequentialGroup()
	    					.addComponent(leftBarPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    					.addGap(0)
	    					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	    						.addComponent(cardBoardPanel, GroupLayout.PREFERRED_SIZE, 1149, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(auxiliaryBarPanel, GroupLayout.PREFERRED_SIZE, 1160, GroupLayout.PREFERRED_SIZE)))
	    				.addComponent(textPane_8, GroupLayout.PREFERRED_SIZE, 1385, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    groupLayout.setVerticalGroup(
	    	groupLayout.createParallelGroup(Alignment.LEADING)
	    		.addGroup(groupLayout.createSequentialGroup()
	    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	    				.addGroup(groupLayout.createSequentialGroup()
	    					.addGap(0)
	    					.addComponent(auxiliaryBarPanel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
	    					.addGap(0)
	    					.addComponent(cardBoardPanel, 0, 0, Short.MAX_VALUE))
	    				.addComponent(leftBarPanel, GroupLayout.PREFERRED_SIZE, 784, GroupLayout.PREFERRED_SIZE))
	    			.addGap(0)
	    			.addComponent(textPane_8, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
	    );
	    cardBoardPanel.setLayout(new CardLayout(0, 0));
	    
	    KGradientPanel searchPanel = new KGradientPanel();
	    searchPanel.kBorderRadius = 0;
	    searchPanel.kGradientFocus = 0;
	    searchPanel.kEndColor = new Color(248, 248, 255);
	    searchPanel.kStartColor = new Color(248, 248, 255);
	    cardBoardPanel.add(searchPanel, "name_212559356519500");
	    
	    JLabel search_TargetLabel = new JLabel("Target:");
	    search_TargetLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    search_TargetField =  new JTextField();
	    search_TargetField.setColumns(10);
	    search_TargetField.setText("Name");
	    search_TargetField.setForeground(Color.LIGHT_GRAY);
	    search_TargetField.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = search_TargetField.getText();
	            if(text.equals("Name")) {
	            	search_TargetField.setText("");
	            	search_TargetField.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    JLabel search_activeRankLabel = new JLabel("Active Rank:");
	    search_activeRankLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_ActiveRoleLabel = new JLabel("Active Role:");
	    search_ActiveRoleLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_PartitionLabel = new JLabel("Partition:");
	    search_PartitionLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_EmailLabel = new JLabel("Email:");
	    search_EmailLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_NIKKITUsernameLabel = new JLabel("NIKKIT Username:");
	    search_NIKKITUsernameLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_NIKKITPasswordLabel = new JLabel("NIKKIT Password:");
	    search_NIKKITPasswordLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_WarningsLabel = new JLabel("Warnings:");
	    search_WarningsLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_AbsencesLabel = new JLabel("Absences:");
	    search_AbsencesLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_AccoladesLabel = new JLabel("Accolades:");
	    search_AccoladesLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel search_NotesMiscLabel = new JLabel("Notes/Misc.:");
	    search_NotesMiscLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JPanel search_TextPane_Panel = new JPanel();
	    search_TextPane_Panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JLabel search_dateLabel = new JLabel("Starting Date:");
	    search_dateLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JPanel search_Title_Panel = new JPanel();
	    search_Title_Panel.setBackground(new Color(32, 178, 170, 0));
	    GroupLayout gl_searchPanel = new GroupLayout(searchPanel);
	    gl_searchPanel.setHorizontalGroup(
	    	gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_searchPanel.createSequentialGroup()
	    			.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING, false)
	    				.addComponent(search_Title_Panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addGroup(gl_searchPanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(search_TextPane_Panel, GroupLayout.PREFERRED_SIZE, 1112, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap())
	    		.addGroup(gl_searchPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(search_TargetLabel)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(search_TargetField, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(911, Short.MAX_VALUE))
	    		.addGroup(gl_searchPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    					.addGroup(gl_searchPanel.createSequentialGroup()
	    						.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    							.addComponent(search_activeRankLabel)
	    							.addComponent(search_ActiveRoleLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
	    						.addGap(211)
	    						.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    							.addComponent(search_NIKKITPasswordLabel)
	    							.addGroup(gl_searchPanel.createSequentialGroup()
	    								.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    									.addGroup(gl_searchPanel.createSequentialGroup()
	    										.addComponent(search_EmailLabel)
	    										.addGap(277))
	    									.addGroup(gl_searchPanel.createSequentialGroup()
	    										.addComponent(search_NIKKITUsernameLabel, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
	    										.addGap(200)))
	    								.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    									.addComponent(search_WarningsLabel)
	    									.addComponent(search_AbsencesLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
	    								.addGap(198)
	    								.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    									.addComponent(search_NotesMiscLabel)
	    									.addComponent(search_AccoladesLabel)))))
	    					.addComponent(search_PartitionLabel))
	    				.addGroup(gl_searchPanel.createSequentialGroup()
	    					.addComponent(search_dateLabel)
	    					.addPreferredGap(ComponentPlacement.RELATED, 866, GroupLayout.PREFERRED_SIZE)))
	    			.addGap(187))
	    );
	    gl_searchPanel.setVerticalGroup(
	    	gl_searchPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_searchPanel.createSequentialGroup()
	    			.addComponent(search_Title_Panel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_searchPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(search_TargetLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(search_TargetField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(37)
	    			.addGroup(gl_searchPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(search_activeRankLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(search_EmailLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(search_WarningsLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(search_AccoladesLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_searchPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(search_ActiveRoleLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(search_NIKKITUsernameLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(search_AbsencesLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(search_NotesMiscLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_searchPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(search_PartitionLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(search_NIKKITPasswordLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(search_dateLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    			.addGap(45)
	    			.addComponent(search_TextPane_Panel, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
	    			.addGap(23))
	    );
	    search_Title_Panel.setLayout(new BorderLayout(0, 0));
	    
	    JLabel search_Title_Label = new JLabel("Lookup", SwingConstants.CENTER);
	    search_Title_Label.setFont(new Font("Segoe UI Black", Font.PLAIN, 21));
	    search_Title_Panel.add(search_Title_Label, BorderLayout.CENTER);
	    search_TextPane_Panel.setLayout(new GridLayout(1, 0, 0, 0));
	    
	    JPanel search_Warnings_Panel = new JPanel();
	    search_TextPane_Panel.add(search_Warnings_Panel);
	    search_Warnings_Panel.setLayout(new BorderLayout(0, 0));
	    
	    Border empty = new EmptyBorder(0,0,0,0);
	    
	    JScrollPane search_WarningTextPane_ScrollPane = new JScrollPane();
	
	    

	
	    
	    
	    
	    search_WarningTextPane_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    search_WarningTextPane_ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    search_Warnings_Panel.add(search_WarningTextPane_ScrollPane, BorderLayout.EAST);
	    search_WarningTextPane_ScrollPane.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
	    
	    JTextPane search_WarningDate_TextPane = new JTextPane();
	    search_WarningTextPane_ScrollPane.setViewportView(search_WarningDate_TextPane);
	    search_WarningDate_TextPane.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
	    
	    JScrollPane search_WarningInfo_ScrollPane = new JScrollPane();
	 
	    search_WarningInfo_ScrollPane.getVerticalScrollBar().setModel(search_WarningTextPane_ScrollPane.getVerticalScrollBar().getModel());
	   
	    search_Warnings_Panel.add(search_WarningInfo_ScrollPane, BorderLayout.CENTER);
	    search_WarningInfo_ScrollPane.setBorder(null);
	    search_WarningInfo_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	    search_WarningInfo_ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    
	    JTextPane search_WarningInfo_TextPane =  new JTextPane();
	    search_WarningInfo_ScrollPane.setViewportView(search_WarningInfo_TextPane);
	    
	    JPanel search_Absence_Panel = new JPanel();
	    search_TextPane_Panel.add(search_Absence_Panel);
	    search_Absence_Panel.setLayout(new BorderLayout(0, 0));
	    
	    JScrollPane search_AbsenceDate_ScrollPane = new JScrollPane();
	    search_AbsenceDate_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    search_AbsenceDate_ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    search_Absence_Panel.add(search_AbsenceDate_ScrollPane, BorderLayout.EAST);
	    search_AbsenceDate_ScrollPane.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
	    
	    JTextPane search_AbsenceDate_TextPane = new JTextPane();
	    search_AbsenceDate_TextPane.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
	    search_AbsenceDate_ScrollPane.setViewportView(search_AbsenceDate_TextPane);
	    
	    JScrollPane search_AbsenceInfo_ScrollPane = new JScrollPane();
	    search_AbsenceInfo_ScrollPane.getVerticalScrollBar().setModel(search_AbsenceDate_ScrollPane.getVerticalScrollBar().getModel());
	    search_AbsenceInfo_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	    search_AbsenceInfo_ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    search_Absence_Panel.add(search_AbsenceInfo_ScrollPane, BorderLayout.CENTER);
	    search_AbsenceInfo_ScrollPane.setBorder(empty);
	    
	    JTextPane search_AbsenceInfo_TextPane = new JTextPane();
	    search_AbsenceInfo_ScrollPane.setViewportView(search_AbsenceInfo_TextPane);
	    
	    JPanel search_Accolades_Panel = new JPanel();
	    search_TextPane_Panel.add(search_Accolades_Panel);
	    search_Accolades_Panel.setLayout(new BorderLayout(0, 0));
	    
	    JScrollPane search_AccoladesDate_ScrollPane = new JScrollPane();
	    search_AccoladesDate_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    search_AccoladesDate_ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    search_AccoladesDate_ScrollPane.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
	    search_Accolades_Panel.add(search_AccoladesDate_ScrollPane, BorderLayout.EAST);
	   
	    
	    JTextPane search_AccoladesDate_TextPane = new JTextPane();
	    search_AccoladesDate_TextPane.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
	    search_AccoladesDate_ScrollPane.setViewportView(search_AccoladesDate_TextPane);
	    
	    JScrollPane search_AccoladesInfo_ScrollPane = new JScrollPane();
	    search_AccoladesInfo_ScrollPane.getVerticalScrollBar().setModel(search_AccoladesDate_ScrollPane.getVerticalScrollBar().getModel());
	    search_AccoladesInfo_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	    search_AccoladesInfo_ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    search_AccoladesInfo_ScrollPane.setBorder(null);
	    search_Accolades_Panel.add(search_AccoladesInfo_ScrollPane, BorderLayout.CENTER);
	    
	    JTextPane search_AccoladesInfo_TextPane = new JTextPane();
	    search_AccoladesInfo_ScrollPane.setViewportView(search_AccoladesInfo_TextPane);
	    
	    JPanel search_Misc_Panel = new JPanel();
	    search_TextPane_Panel.add(search_Misc_Panel);
	    search_Misc_Panel.setLayout(new BorderLayout(0, 0));
	    
	    JScrollPane search_MiscDate_ScrollPane = new JScrollPane();
	    search_MiscDate_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    search_MiscDate_ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    search_Misc_Panel.add(search_MiscDate_ScrollPane, BorderLayout.EAST);
	    search_MiscDate_ScrollPane.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
	    search_MiscDate_ScrollPane.setBorder(empty);
	    
	    JTextPane search_MiscDate_Textpane = new JTextPane();
	    search_MiscDate_Textpane.setBorder(new MatteBorder(0, 0, 0, 1, (Color) Color.WHITE));
	    search_MiscDate_ScrollPane.setViewportView(search_MiscDate_Textpane);
	    
	    JScrollPane search_MiscInfo_ScrollPane = new JScrollPane();
	    search_MiscInfo_ScrollPane.getVerticalScrollBar().setModel(search_MiscDate_ScrollPane.getVerticalScrollBar().getModel());
	    search_MiscInfo_ScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
	    search_MiscInfo_ScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    search_Misc_Panel.add(search_MiscInfo_ScrollPane, BorderLayout.CENTER);
	    search_MiscInfo_ScrollPane.setBorder(empty);
	    
	    JTextPane search_MiscInfo_Textpane = new JTextPane();
	    search_MiscInfo_Textpane.setBorder(null);
	    search_MiscInfo_ScrollPane.setViewportView(search_MiscInfo_Textpane);
	    
	   
	    searchPanel.setLayout(gl_searchPanel);
	    
	    KGradientPanel addPanel = new KGradientPanel();
	    addPanel.kGradientFocus = 0;
	    addPanel.kBorderRadius = 0;
	    addPanel.kEndColor = new Color(248, 248, 255);
	    addPanel.kStartColor = new Color(248, 248, 255);
	    
	    addPanel.setBackground(Color.WHITE);
	    cardBoardPanel.add(addPanel, "name_251038619395400");
	    
	    JLabel add_informationTitle_JLabel = new JLabel("Information");
	    add_informationTitle_JLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JComboBox add_startingRank_comboBox = new JComboBox();
	    add_startingRank_comboBox.addItem("Starting Rank");
	    
	    JCheckBox chckbxNewCheckBox = new JCheckBox("Use Name for NIKKIT Username");
	    chckbxNewCheckBox.setSelected(true);
	    
	    add_NameTextField_TextField = new JTextField("Name");
	    add_NameTextField_TextField.setForeground(Color.LIGHT_GRAY);
	    add_NameTextField_TextField.setColumns(10);
	    
	    add_NameTextField_TextField.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = add_NameTextField_TextField.getText();
	            if(text.equals("Name")) {
	            	add_NameTextField_TextField.setText("");
	            	add_NameTextField_TextField.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    add_NameTextField_TextField.addKeyListener(new KeyAdapter() {

	        public void keyReleased(KeyEvent e) {
	        	
	        	if(chckbxNewCheckBox.isSelected()) {
	        		add_NikkitUsername_JTextField.setForeground(Color.BLACK);
	        		String registeredUsername = add_NameTextField_TextField.getText();
	        		add_NikkitUsername_JTextField.setText(registeredUsername);
	        	}

	        }

	        public void keyPressed(KeyEvent e) {
	
	        	
	        }
	      });
	   
	    JComboBox<String> add_startingRole_JComboBox = new JComboBox<String>();
	    add_startingRole_JComboBox.addItem("Starting Role");
	    
	    JLabel add_NIKKITRegisterTitle_JLabel = new JLabel("NIKKIT Registration");
	    add_NIKKITRegisterTitle_JLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    add_NikkitUsername_JTextField = new JTextField("NIKKIT Username");
	    add_NikkitUsername_JTextField.setForeground(Color.LIGHT_GRAY);
	    add_NikkitUsername_JTextField.setColumns(10);
	    add_NikkitUsername_JTextField.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = add_NikkitUsername_JTextField.getText();
	            if(text.equals("NIKKIT Username")) {
	            	add_NikkitUsername_JTextField.setText("");
	            	add_NikkitUsername_JTextField.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    add_NikkitPassword_JTextField = new JTextField("NIKKIT Password");
	    add_NikkitPassword_JTextField.setForeground(Color.LIGHT_GRAY);
	    add_NikkitPassword_JTextField.setColumns(10);
	    add_NikkitPassword_JTextField.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = add_NikkitPassword_JTextField.getText();
	            if(text.equals("NIKKIT Password")) {
	            	add_NikkitPassword_JTextField.setText("");
	            	add_NikkitPassword_JTextField.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    
	    add_email_JTextField = new JTextField("Email");
	    add_email_JTextField.setForeground(Color.LIGHT_GRAY);
	    add_email_JTextField.setColumns(10);
	    add_email_JTextField.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = add_email_JTextField.getText();
	            if(text.equals("Email")) {
	            	add_email_JTextField.setText("");
	            	add_email_JTextField.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    
	    
	    JCheckBox chckbxNewCheckBox_1 = new JCheckBox("N/A");
	    chckbxNewCheckBox_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(chckbxNewCheckBox_1.isSelected()) {
	    			add_email_JTextField.setEnabled(false); add_email_JTextField.setText("N/A");
	    		}else {
	    			add_email_JTextField.setEnabled(true); add_email_JTextField.setText("");
	    		}
	    		
	    	}
	    });
	    
	    JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Unique");
	    chckbxNewCheckBox_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(chckbxNewCheckBox_2.isSelected()) {textField_7.setEnabled(true); add_startingRank_comboBox.setEnabled(false);}
	    		else {
	    			textField_7.setEnabled(false);
	    			add_startingRank_comboBox.setEnabled(true);
	    		}
	    	}
	    });
	    
	    JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Unqiue");
	    chckbxNewCheckBox_2_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(chckbxNewCheckBox_2_1.isSelected()) {textField_8.setEnabled(true); add_startingRole_JComboBox.setEnabled(false);}
	    		else {
	    			textField_8.setEnabled(false);
	    			add_startingRole_JComboBox.setEnabled(true);
	    		}
	    	}
	    });
	    
	    JLabel add_SecurityTiltle_JLabel = new JLabel("Security");
	    add_SecurityTiltle_JLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    add_QuestionOneSecurity_TextField = new JTextField();
	    add_QuestionOneSecurity_TextField.setColumns(10);
	    
	    add_QuestionTwoSecurity_JTextField = new JTextField();
	    add_QuestionTwoSecurity_JTextField.setColumns(10);

	    
	    JComboBox<String> add_QuestionOneSecurity_JComboBox = new JComboBox<String>();
	    add_QuestionOneSecurity_JComboBox.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String securityQuestionOneCheck = add_QuestionOneSecurity_JComboBox.getSelectedItem().toString();
	    		if(securityQuestionOneCheck.equals("[Disable Security Question (Allow Member to Choose in Portal)]")) {add_QuestionOneSecurity_TextField.setText("Disabled"); add_QuestionOneSecurity_TextField.setForeground(Color.LIGHT_GRAY); add_QuestionOneSecurity_TextField.setEnabled(false); }
	    		else {add_QuestionOneSecurity_TextField.setText(""); add_QuestionOneSecurity_TextField.setForeground(Color.black); add_QuestionOneSecurity_TextField.setEnabled(true);}
	    	}
	    });
	    add_QuestionOneSecurity_JComboBox.addItem("Select Security Question One");
	    add_QuestionOneSecurity_JComboBox.addItem("[Disable Security Question (Allow Member to Choose in Portal)]");
	    add_QuestionOneSecurity_JComboBox.addItem("What is your fathers middle name?");
	    add_QuestionOneSecurity_JComboBox.addItem("What is your grandmothers nationality?");
	    add_QuestionOneSecurity_JComboBox.addItem("What is your least favorite number?");
	    add_QuestionOneSecurity_JComboBox.addItem("What middle school did you attend?");
	    add_QuestionOneSecurity_JComboBox.addItem("What was your elementary school's mascot?");
	    JComboBox<String> add_QuestionTwoSecurity_JComboBox = new JComboBox<String>();
	    add_QuestionTwoSecurity_JComboBox.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String securityQuestionOneCheck = add_QuestionTwoSecurity_JComboBox.getSelectedItem().toString();
	    		if(securityQuestionOneCheck.equals("[Disable Security Question (Allow Member to Choose in Portal)]")) {add_QuestionTwoSecurity_JTextField.setText("Disabled"); add_QuestionTwoSecurity_JTextField.setForeground(Color.LIGHT_GRAY); add_QuestionTwoSecurity_JTextField.setEnabled(false);}
	    		else {add_QuestionTwoSecurity_JTextField.setText(""); add_QuestionTwoSecurity_JTextField.setForeground(Color.black); add_QuestionTwoSecurity_JTextField.setEnabled(true);}
	    	}
	    });
	    add_QuestionTwoSecurity_JComboBox.addItem("Select Security Question Two");
	    add_QuestionTwoSecurity_JComboBox.addItem("[Disable Security Question (Allow Member to Choose in Portal)]");
	    add_QuestionTwoSecurity_JComboBox.addItem("What is your fathers middle name?");
	    add_QuestionTwoSecurity_JComboBox.addItem("What is your grandmothers nationality?");
	    add_QuestionTwoSecurity_JComboBox.addItem("What is your least favorite number?");
	    add_QuestionTwoSecurity_JComboBox.addItem("What middle school did you attend?");
	    add_QuestionTwoSecurity_JComboBox.addItem("What was your elementary school's mascot?");
	    
	    add_QuestionOneSecurity_TextField.setForeground(Color.LIGHT_GRAY);
	    add_QuestionOneSecurity_TextField.setText("Security Question 1");
	    add_QuestionTwoSecurity_JTextField.setForeground(Color.LIGHT_GRAY);
	    add_QuestionTwoSecurity_JTextField.setText("Security Question 2");
	    
	    add_startingDate_textField = new JTextField(systemDateTimeFinal);
	    add_startingDate_textField.setColumns(10);
	    add_startingDate_textField.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_4 = (JTextField) e.getSource();
	  		    String text = textField_4.getText();
	  		  textField_4.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_4.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_4.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_4.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JButton add_Finalize_JButton = new JButton("Finalize");
	    
	    JComboBox add_partition_ComboBox = new JComboBox();
	    add_partition_ComboBox.addItem("Group 1");
	    
	    textField_7 = new JTextField();
	    textField_7.setEnabled(false);
	    textField_7.setColumns(10);
	    
	    textField_8 = new JTextField();
	    textField_8.setEnabled(false);
	    textField_8.setColumns(10);
	    
	    JPanel add_TitlePanel_JPanel = new JPanel();
	    add_TitlePanel_JPanel.setBackground(new Color(32, 178, 170, 0));
	    add_TitlePanel_JPanel.setLayout(new BorderLayout(0, 0));
	    GroupLayout gl_addPanel = new GroupLayout(addPanel);
	    gl_addPanel.setHorizontalGroup(
	    	gl_addPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_addPanel.createSequentialGroup()
	    			.addComponent(add_TitlePanel_JPanel, GroupLayout.PREFERRED_SIZE, 1122, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(27, Short.MAX_VALUE))
	    		.addGroup(gl_addPanel.createSequentialGroup()
	    			.addGap(485)
	    			.addComponent(add_Finalize_JButton, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(511, Short.MAX_VALUE))
	    		.addGroup(gl_addPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(add_informationTitle_JLabel)
	    			.addContainerGap(1052, Short.MAX_VALUE))
	    		.addGroup(gl_addPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_addPanel.createSequentialGroup()
	    					.addGroup(gl_addPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(add_NameTextField_TextField, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
	    						.addComponent(add_partition_ComboBox, 0, 234, Short.MAX_VALUE)
	    						.addComponent(add_startingRank_comboBox, Alignment.TRAILING, 0, 234, Short.MAX_VALUE)
	    						.addComponent(add_startingRole_JComboBox, 0, 234, Short.MAX_VALUE))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addGroup(gl_addPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(chckbxNewCheckBox)
	    						.addGroup(gl_addPanel.createParallelGroup(Alignment.LEADING, false)
	    							.addGroup(gl_addPanel.createSequentialGroup()
	    								.addComponent(chckbxNewCheckBox_2_1)
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(textField_8))
	    							.addGroup(gl_addPanel.createSequentialGroup()
	    								.addComponent(chckbxNewCheckBox_2)
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))))
	    				.addGroup(gl_addPanel.createSequentialGroup()
	    					.addComponent(add_startingDate_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)))
	    			.addGap(664))
	    		.addGroup(gl_addPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.LEADING, false)
	    				.addComponent(add_SecurityTiltle_JLabel, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(add_QuestionTwoSecurity_JComboBox, 0, 199, Short.MAX_VALUE)
	    				.addComponent(add_QuestionOneSecurity_JComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(add_QuestionOneSecurity_TextField, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(add_QuestionTwoSecurity_JTextField, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(741, Short.MAX_VALUE))
	    		.addGroup(gl_addPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(add_NIKKITRegisterTitle_JLabel)
	    				.addComponent(add_NikkitUsername_JTextField, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
	    				.addComponent(add_NikkitPassword_JTextField, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
	    				.addComponent(add_email_JTextField, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(chckbxNewCheckBox_1)
	    			.addGap(778))
	    );
	    gl_addPanel.setVerticalGroup(
	    	gl_addPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_addPanel.createSequentialGroup()
	    			.addComponent(add_TitlePanel_JPanel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(add_informationTitle_JLabel)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(add_NameTextField_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(chckbxNewCheckBox))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(add_startingRank_comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(chckbxNewCheckBox_2)
	    				.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(4)
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(chckbxNewCheckBox_2_1)
	    				.addComponent(add_startingRole_JComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(add_startingDate_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(add_partition_ComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(add_SecurityTiltle_JLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(add_QuestionOneSecurity_JComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(add_QuestionOneSecurity_TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(add_QuestionTwoSecurity_JComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(add_QuestionTwoSecurity_JTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(add_NIKKITRegisterTitle_JLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(add_NikkitUsername_JTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(add_NikkitPassword_JTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(13)
	    			.addGroup(gl_addPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(add_email_JTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(chckbxNewCheckBox_1))
	    			.addPreferredGap(ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
	    			.addComponent(add_Finalize_JButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
	    			.addGap(44))
	    );
	    
	    JLabel add_title_JTextField = new JLabel("Add a Member", SwingConstants.CENTER);
	    add_title_JTextField.setFont(new Font("Segoe UI Black", Font.PLAIN, 21));
	    add_TitlePanel_JPanel.add(add_title_JTextField, BorderLayout.CENTER);
	    addPanel.setLayout(gl_addPanel);
	    
	    KGradientPanel editPanel = new KGradientPanel();
	    editPanel.kStartColor = new Color(248, 248, 255);
	    editPanel.kEndColor = new Color(248, 248, 255);
	    editPanel.setBackground(Color.WHITE);
	    cardBoardPanel.add(editPanel, "name_262939664070400");
	    
	    JLabel edit_targetLabel_JLabel = new JLabel("Target:");
	    edit_targetLabel_JLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    edit_targetName_JTextField = new JTextField();
	    edit_targetName_JTextField.setColumns(10);
	    edit_targetName_JTextField.setText("Name");
	    edit_targetName_JTextField.setForeground(Color.LIGHT_GRAY);
	    edit_targetName_JTextField.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = edit_targetName_JTextField.getText();
	            if(text.equals("Name")) {
	            	edit_targetName_JTextField.setText("");
	            	edit_targetName_JTextField.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    JPanel edit_titlePanel_JPanel = new JPanel();
	    edit_titlePanel_JPanel.setBackground(new Color(32, 178, 170, 0));
	    edit_titlePanel_JPanel.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_34 = new JPanel();
	    
	    
	    GroupLayout gl_editPanel = new GroupLayout(editPanel);
	    gl_editPanel.setHorizontalGroup(
	    	gl_editPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_editPanel.createSequentialGroup()
	    			.addGroup(gl_editPanel.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(panel_34, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
	    				.addGroup(Alignment.LEADING, gl_editPanel.createParallelGroup(Alignment.TRAILING, false)
	    					.addComponent(edit_titlePanel_JPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
	    					.addGroup(Alignment.LEADING, gl_editPanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(edit_targetLabel_JLabel)
	    						.addPreferredGap(ComponentPlacement.RELATED)
	    						.addComponent(edit_targetName_JTextField, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))))
	    			.addGap(27))
	    );
	    gl_editPanel.setVerticalGroup(
	    	gl_editPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_editPanel.createSequentialGroup()
	    			.addComponent(edit_titlePanel_JPanel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_editPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(edit_targetLabel_JLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(edit_targetName_JTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(panel_34, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE))
	    );
	    panel_34.setLayout(new GridLayout(2, 2, 0, 0));
	    
	    
	    
	    JPanel panel_5 = new JPanel();
	    panel_34.add(panel_5);
	    panel_5.setBackground(new Color(248, 248, 255));
	    panel_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    
	    JLabel edit_EmailLabel_JLabel = new JLabel("Email:");
	    edit_EmailLabel_JLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    edit_email_JTextField = new JTextField();
	    edit_email_JTextField.setColumns(10);
	    
	    edit_nikkitUsername_JTextField = new JTextField();
	    edit_nikkitUsername_JTextField.setColumns(10);
	    
	    JLabel edit_nikkitUsername_JLabel = new JLabel("<html>  &nbsp; NIKKIT <br> Username: </html>", SwingConstants.CENTER);
	    edit_nikkitUsername_JLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel edit_Username_JLabel = new JLabel("Username:");
	    edit_Username_JLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    edit_Username_JTextField = new JTextField();
	    edit_Username_JTextField.setColumns(10);
	    
	    JPanel panel_35 = 	new JPanel();
	    panel_35.setBackground(new Color (248, 248, 255));
	    
	    JPanel edit_NikkitDataPanel_JPanel = new JPanel();
	    GroupLayout gl_panel_5 = new GroupLayout(panel_5);
	    gl_panel_5.setHorizontalGroup(
	    	gl_panel_5.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_5.createSequentialGroup()
	    			.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_5.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
	    						.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING, false)
	    							.addComponent(edit_nikkitUsername_JLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    							.addComponent(edit_Username_JLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    						.addComponent(edit_EmailLabel_JLabel))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
	    						.addComponent(edit_email_JTextField, GroupLayout.PREFERRED_SIZE, 458, GroupLayout.PREFERRED_SIZE)
	    						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
	    							.addComponent(edit_nikkitUsername_JTextField, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
	    							.addComponent(edit_Username_JTextField, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)))
	    					.addGap(23))
	    				.addComponent(edit_NikkitDataPanel_JPanel, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_35, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_panel_5.setVerticalGroup(
	    	gl_panel_5.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_5.createSequentialGroup()
	    			.addComponent(edit_NikkitDataPanel_JPanel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(edit_email_JTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(edit_EmailLabel_JLabel))
	    			.addGap(49)
	    			.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(edit_Username_JTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(edit_Username_JLabel))
	    			.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
	    			.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(edit_nikkitUsername_JLabel)
	    				.addComponent(edit_nikkitUsername_JTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(49)
	    			.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    edit_NikkitDataPanel_JPanel.setLayout(new BorderLayout(0, 0));
	    edit_NikkitDataPanel_JPanel.setBackground(new Color (248, 248, 255));
	    
	    JLabel edit_NikkitDataSubTtitle_JLabel = new JLabel("NIKKIT Data", SwingConstants.CENTER);
	    edit_NikkitDataPanel_JPanel.add(edit_NikkitDataSubTtitle_JLabel, BorderLayout.CENTER);
	    edit_NikkitDataSubTtitle_JLabel.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 16));
	    
	    JButton btnNewButton_4_2_1 = new JButton("Submit");
	    GroupLayout gl_panel_35 = new GroupLayout(panel_35);
	    gl_panel_35.setHorizontalGroup(
	    	gl_panel_35.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_35.createSequentialGroup()
	    			.addGap(241)
	    			.addComponent(btnNewButton_4_2_1, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
	    			.addGap(241))
	    );
	    gl_panel_35.setVerticalGroup(
	    	gl_panel_35.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_35.createSequentialGroup()
	    			.addComponent(btnNewButton_4_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    panel_35.setLayout(gl_panel_35);
	    panel_5.setLayout(gl_panel_5);
	    
	    JPanel panel_6 = new JPanel();
	    panel_34.add(panel_6);
	    panel_6.setBackground(new Color(248, 248, 255));
	    panel_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    
	    JTextArea textArea = new JTextArea();
	    textArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JComboBox comboBox_6 = new JComboBox();
	    
	    JLabel lblTarget_1_1_2 = new JLabel("Type:");
	    lblTarget_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_1_1_2_1 = new JLabel("Date:");
	    lblTarget_1_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_17 = new JTextField();
	    textField_17.setColumns(10);
	    
	    textField_17.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_17 = (JTextField) e.getSource();
	  		    String text = textField_17.getText();
	  		  textField_17.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_17.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_17.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_17.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JPanel panel_35_1 = new JPanel();
	    panel_35_1.setBackground(new Color (248, 248, 255));
	    
	    JButton btnNewButton_4_2_1_1 = new JButton("Submit");
	    GroupLayout gl_panel_35_1 = new GroupLayout(panel_35_1);
	    gl_panel_35_1.setHorizontalGroup(
	    	gl_panel_35_1.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 559, Short.MAX_VALUE)
	    		.addGroup(gl_panel_35_1.createSequentialGroup()
	    			.addGap(241)
	    			.addComponent(btnNewButton_4_2_1_1, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
	    			.addGap(241))
	    );
	    gl_panel_35_1.setVerticalGroup(
	    	gl_panel_35_1.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 33, Short.MAX_VALUE)
	    		.addGroup(gl_panel_35_1.createSequentialGroup()
	    			.addComponent(btnNewButton_4_2_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    panel_35_1.setLayout(gl_panel_35_1);
	    
	    JLabel lblTarget_1_2_1_1_1 = new JLabel("NIKKIT Data", SwingConstants.CENTER);
	    lblTarget_1_2_1_1_1.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 16));
	    GroupLayout gl_panel_6 = new GroupLayout(panel_6);
	    gl_panel_6.setHorizontalGroup(
	    	gl_panel_6.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_6.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_6.createSequentialGroup()
	    					.addComponent(lblTarget_1_1_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
	    				.addGroup(gl_panel_6.createSequentialGroup()
	    					.addComponent(lblTarget_1_1_2_1)
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap())
	    		.addComponent(panel_35_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
	    		.addGroup(gl_panel_6.createSequentialGroup()
	    			.addComponent(lblTarget_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    gl_panel_6.setVerticalGroup(
	    	gl_panel_6.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_6.createSequentialGroup()
	    			.addComponent(lblTarget_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_1_1_2)
	    				.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_1_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(29)
	    			.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
	    			.addComponent(panel_35_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    panel_6.setLayout(gl_panel_6);
	    
	    JPanel panel_7_1 = new JPanel();
	    panel_34.add(panel_7_1);
	    panel_7_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    panel_7_1.setBackground(new Color(248, 248, 255));
	    
	    JList list_6 = new JList();
	    list_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JPanel panel_27 = new JPanel();
	    panel_27.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    
	    panel_27.setVisible(false);
	    panel_27.setBackground(new Color(248, 248, 255));
	    
	    JLabel lblTarget_1_2_1_1_2_1 = new JLabel("NIKKIT Data", SwingConstants.CENTER);
	    lblTarget_1_2_1_1_2_1.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 16));
	    
	    JPanel panel_37 = new JPanel();
	    panel_37.setBackground(new Color (248, 248, 255));
	    GroupLayout gl_panel_7_1 = new GroupLayout(panel_7_1);
	    gl_panel_7_1.setHorizontalGroup(
	    	gl_panel_7_1.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(Alignment.LEADING, gl_panel_7_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(panel_27, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
	    			.addContainerGap())
	    		.addComponent(lblTarget_1_2_1_1_2_1, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
	    		.addGroup(gl_panel_7_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(list_6, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
	    			.addContainerGap())
	    );
	    gl_panel_7_1.setVerticalGroup(
	    	gl_panel_7_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_7_1.createSequentialGroup()
	    			.addComponent(lblTarget_1_2_1_1_2_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(list_6, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addGroup(gl_panel_7_1.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    panel_37.setLayout(new GridLayout(2, 1, 0, 10));
	    
	    JButton btnNewButton_9 = new JButton("Delete");
	    panel_37.add(btnNewButton_9);
	    
	    JButton btnNewButton_9_1 = new JButton("Edit");
	    panel_37.add(btnNewButton_9_1);
	    btnNewButton_9_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	
	    			if(panel_27.isVisible()) {
	    				panel_27.setVisible(false);
	    			}
	    			else {
	    				panel_27.setVisible(true);
	    			}

	    		
	    		
	    	}
	    });
	    btnNewButton_9.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		 int input = JOptionPane.showConfirmDialog(null, "Are you sure?");
	    		
	    		
	    		
	    	}
	    });
	    
	    textField_41 = new JTextField();
	    textField_41.setColumns(10);
	    
	    JTextArea textArea_5 = new JTextArea();
	    textArea_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    textField_42 = new JTextField();
	    textField_42.setColumns(10);
	    
	    textField_42.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_42 = (JTextField) e.getSource();
	  		    String text = textField_42.getText();
	  		  textField_42.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_42.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_42.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_42.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JButton btnNewButton_10 = new JButton("Submit");
	    
	    JLabel lblTarget_1_2_2_1 = new JLabel("Edit");
	    lblTarget_1_2_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    GroupLayout gl_panel_27 = new GroupLayout(panel_27);
	    gl_panel_27.setHorizontalGroup(
	    	gl_panel_27.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_27.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_27.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_panel_27.createSequentialGroup()
	    					.addComponent(textArea_5, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
	    					.addContainerGap())
	    				.addGroup(gl_panel_27.createSequentialGroup()
	    					.addGroup(gl_panel_27.createParallelGroup(Alignment.LEADING)
	    						.addComponent(textField_41, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
	    						.addGroup(gl_panel_27.createSequentialGroup()
	    							.addComponent(textField_42, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.UNRELATED)
	    							.addComponent(btnNewButton_10, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
	    					.addContainerGap())))
	    		.addGroup(gl_panel_27.createSequentialGroup()
	    			.addGap(181)
	    			.addComponent(lblTarget_1_2_2_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(194, Short.MAX_VALUE))
	    );
	    gl_panel_27.setVerticalGroup(
	    	gl_panel_27.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel_27.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTarget_1_2_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
	    			.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textArea_5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_27.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(textField_42, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_10))
	    			.addContainerGap())
	    );
	    panel_27.setLayout(gl_panel_27);
	    panel_7_1.setLayout(gl_panel_7_1);
	    
	    JPanel panel_7 = new JPanel();
	    panel_34.add(panel_7);
	    panel_7.setBackground(new Color(248, 248, 255));
	    panel_7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    
	    JLabel lblTarget_1_1 = new JLabel("Role:");
	    lblTarget_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JComboBox comboBox_4 = new JComboBox();
	    
	    JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Unique");
	    chckbxNewCheckBox_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(chckbxNewCheckBox_4.isSelected()) {
	    			comboBox_4.setEnabled(false);
	    			textField_9.setEnabled(true);
	    		}
	    		else {
	    			comboBox_4.setEnabled(true);
	    			textField_9.setEnabled(false);
	    		}
	    	}
	    });
	    
	    textField_9 = new JTextField();
	    textField_9.setEnabled(false);
	    textField_9.setColumns(10);
	    
	    JLabel lblTarget_1_1_1 = new JLabel("Rank:");
	    lblTarget_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JComboBox comboBox_4_1 = new JComboBox();
	    
	    JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Unique");
	    chckbxNewCheckBox_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if(chckbxNewCheckBox_3.isSelected()) {textField_10.setEnabled(true); comboBox_4_1.setEnabled(false);}
	    		else {textField_10.setEnabled(false); comboBox_4_1.setEnabled(true);}
	    	}
	    });
	    
	    textField_10 = new JTextField();
	    textField_10.setEnabled(false);
	    textField_10.setColumns(10);
	    
	    JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Promotion");
	    
	    JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("Demotion");
	    
	    JLabel lblTarget_1_1_1_1 = new JLabel("Partition:");
	    lblTarget_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JComboBox comboBox_5 = new JComboBox();
	    
	    JLabel lblTarget_1_1_3_2_1 = new JLabel("Date:");
	    lblTarget_1_1_3_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_11 = new JTextField();
	    textField_11.setColumns(10);
	    
	    textField_11.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_11 = (JTextField) e.getSource();
	  		    String text = textField_11.getText();
	  		  textField_11.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_11.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_11.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_11.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JPanel panel_35_2 = new JPanel();
	    panel_35_2.setBackground(new Color (248, 248, 255));
	    
	    JButton btnNewButton_4_2_1_2 = new JButton("Submit");
	    GroupLayout gl_panel_35_2 = new GroupLayout(panel_35_2);
	    gl_panel_35_2.setHorizontalGroup(
	    	gl_panel_35_2.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 559, Short.MAX_VALUE)
	    		.addGroup(gl_panel_35_2.createSequentialGroup()
	    			.addGap(241)
	    			.addComponent(btnNewButton_4_2_1_2, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
	    			.addGap(241))
	    );
	    gl_panel_35_2.setVerticalGroup(
	    	gl_panel_35_2.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 33, Short.MAX_VALUE)
	    		.addGroup(gl_panel_35_2.createSequentialGroup()
	    			.addComponent(btnNewButton_4_2_1_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    panel_35_2.setLayout(gl_panel_35_2);
	    
	    JLabel lblTarget_1_2_1_1_2 = new JLabel("NIKKIT Data", SwingConstants.CENTER);
	    lblTarget_1_2_1_1_2.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 16));
	    GroupLayout gl_panel_7 = new GroupLayout(panel_7);
	    gl_panel_7.setHorizontalGroup(
	    	gl_panel_7.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_7.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTarget_1_1_1)
	    			.addPreferredGap(ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(chckbxNewCheckBox_3)
	    				.addComponent(chckbxNewCheckBox_4))
	    			.addGap(18)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING, false)
	    				.addComponent(textField_9)
	    				.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
	    			.addGap(15))
	    		.addGroup(gl_panel_7.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTarget_1_1)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING, false)
	    				.addComponent(comboBox_4_1, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addComponent(comboBox_4, Alignment.LEADING, 0, 200, Short.MAX_VALUE))
	    			.addContainerGap(320, Short.MAX_VALUE))
	    		.addComponent(panel_35_2, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
	    		.addGroup(gl_panel_7.createSequentialGroup()
	    			.addContainerGap(371, Short.MAX_VALUE)
	    			.addComponent(chckbxNewCheckBox_5)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(chckbxNewCheckBox_5_1)
	    			.addGap(52))
	    		.addGroup(gl_panel_7.createSequentialGroup()
	    			.addComponent(lblTarget_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    		.addGroup(gl_panel_7.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblTarget_1_1_1_1)
	    				.addComponent(lblTarget_1_1_3_2_1))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_7.createSequentialGroup()
	    					.addComponent(comboBox_5, 0, 485, Short.MAX_VALUE)
	    					.addGap(15))
	    				.addGroup(gl_panel_7.createSequentialGroup()
	    					.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
	    					.addContainerGap())))
	    );
	    gl_panel_7.setVerticalGroup(
	    	gl_panel_7.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel_7.createSequentialGroup()
	    			.addComponent(lblTarget_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
	    					.addComponent(lblTarget_1_1)
	    					.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    					.addComponent(chckbxNewCheckBox_4))
	    				.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(comboBox_4_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblTarget_1_1_1)
	    				.addComponent(chckbxNewCheckBox_3))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(chckbxNewCheckBox_5)
	    				.addComponent(chckbxNewCheckBox_5_1))
	    			.addGap(28)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_1_1_1_1)
	    				.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_1_1_3_2_1)
	    				.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    			.addGap(40)
	    			.addComponent(panel_35_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    panel_7.setLayout(gl_panel_7);
	    
	    JLabel edit_title_JLabel = new JLabel("Edit", SwingConstants.CENTER);
	    edit_title_JLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 21));
	    edit_titlePanel_JPanel.add(edit_title_JLabel, BorderLayout.CENTER);
	    editPanel.setLayout(gl_editPanel);
	    
	    KGradientPanel listPanel = new KGradientPanel();
	    listPanel.setkEndColor(new Color(248, 248, 255));
	    listPanel.setkStartColor(new Color(248, 248, 255));
	    listPanel.kStartColor = Color.WHITE;
	    listPanel.kEndColor = Color.WHITE;
	    listPanel.setBackground(Color.WHITE);
	    cardBoardPanel.add(listPanel, "name_518464836477600");
	    
	    JPanel panel_8 = new JPanel();
	    panel_8.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
	    
	    JPanel panel_9 = new JPanel();
	    panel_9.setBorder(null);
	    panel_9.setBackground(Color.WHITE);
	    GroupLayout gl_listPanel = new GroupLayout(listPanel);
	    gl_listPanel.setHorizontalGroup(
	    	gl_listPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_listPanel.createSequentialGroup()
	    			.addGap(0)
	    			.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(42, Short.MAX_VALUE))
	    );
	    gl_listPanel.setVerticalGroup(
	    	gl_listPanel.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(Alignment.LEADING, gl_listPanel.createSequentialGroup()
	    			.addGap(0)
	    			.addGroup(gl_listPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 698, Short.MAX_VALUE)
	    				.addComponent(panel_8, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    
	    JPanel panel_10 = new JPanel();
	    
	    JPanel panel_11 = new JPanel();
	    
	    JPanel panel_12 = new JPanel();
	    panel_12.setBorder(null);
	    GroupLayout gl_panel_9 = new GroupLayout(panel_9);
	    gl_panel_9.setHorizontalGroup(
	    	gl_panel_9.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_9.createSequentialGroup()
	    			.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    			.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
	    );
	    gl_panel_9.setVerticalGroup(
	    	gl_panel_9.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_9.createSequentialGroup()
	    			.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 689, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 689, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 688, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    panel_12.setLayout(new BorderLayout(0, 0));
	    
	    JTextPane textPane_11 = new JTextPane();
	    panel_12.add(textPane_11, BorderLayout.CENTER);
	    panel_11.setLayout(new BorderLayout(0, 0));
	    
	    JTextPane textPane_10 = new JTextPane();
	    panel_11.add(textPane_10, BorderLayout.CENTER);
	    panel_10.setLayout(new BorderLayout(0, 0));
	    
	    JTextPane textPane_9 = new JTextPane();
	    panel_10.add(textPane_9, BorderLayout.CENTER);
	    panel_9.setLayout(gl_panel_9);
	    panel_8.setLayout(new BorderLayout(0, 0));
	    
	    JTree tree = new JTree();
	    tree.setModel(new DefaultTreeModel(
	    	new DefaultMutableTreeNode("All Criteria") {
	    		{
	    			add(new DefaultMutableTreeNode("All Members"));
	    			add(new DefaultMutableTreeNode("Partitions"));
	    			add(new DefaultMutableTreeNode("Rank"));
	    			add(new DefaultMutableTreeNode("Role"));
	    		}
	    	}
	    ));
	    

	    
	    panel_8.add(tree, BorderLayout.CENTER);
	    listPanel.setLayout(gl_listPanel);
	    
	    KGradientPanel deletePanel = new KGradientPanel();
	    deletePanel.setkEndColor(new Color(248, 248, 255));
	    deletePanel.setkStartColor(new Color(248, 248, 255));
	    deletePanel.kStartColor = new Color(248, 248, 255);
	    deletePanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(deletePanel, "name_518908472273300");
	    
	    JLabel lblTarget_1_3 = new JLabel("Target:");
	    lblTarget_1_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_18 = new JTextField();
	    textField_18.setColumns(10);
	    textField_18.setText("Name");
	    textField_18.setForeground(Color.LIGHT_GRAY);
	    textField_18.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = textField_18.getText();
	            if(text.equals("Name")) {
	            	textField_18.setText("");
	            	textField_18.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    JButton btnNewButton_5 = new JButton("Submit");
	    
	    JButton btnNewButton_5_1 = new JButton("Search");
	    
	    JLabel lblTarget_1_3_3 = new JLabel("Details");
	    lblTarget_1_3_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JTextArea textArea_1 = new JTextArea();
	    textArea_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JCheckBox chckbxNewCheckBox_6 = new JCheckBox("N/A");
	    chckbxNewCheckBox_6.setSelected(true);
	    
	    JPanel panel_25_3 = new JPanel();
	    panel_25_3.setBackground(new Color(32, 178, 170, 0));
	    panel_25_3.setLayout(new BorderLayout(0, 0));
	    
	    JPanel panel_28 = new JPanel();
	  
	    panel_28.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    panel_28.setBackground(new Color (248, 248, 255));
	    panel_28.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Confirmation Info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	   
	    ((javax.swing.border.TitledBorder) panel_28.getBorder()).
        setTitleFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
	    
	    GroupLayout gl_deletePanel = new GroupLayout(deletePanel);
	    gl_deletePanel.setHorizontalGroup(
	    	gl_deletePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_deletePanel.createSequentialGroup()
	    			.addGroup(gl_deletePanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_25_3, GroupLayout.PREFERRED_SIZE, 1122, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_deletePanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_deletePanel.createParallelGroup(Alignment.LEADING, false)
	    						.addGroup(gl_deletePanel.createSequentialGroup()
	    							.addComponent(lblTarget_1_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(btnNewButton_5_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
	    						.addComponent(chckbxNewCheckBox_6)
	    						.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblTarget_1_3_3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(textArea_1)
	    						.addComponent(panel_28, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	    			.addContainerGap(27, Short.MAX_VALUE))
	    );
	    gl_deletePanel.setVerticalGroup(
	    	gl_deletePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_deletePanel.createSequentialGroup()
	    			.addComponent(panel_25_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_deletePanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_1_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_5_1))
	    			.addGap(55)
	    			.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
	    			.addGap(23)
	    			.addComponent(lblTarget_1_3_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(chckbxNewCheckBox_6)
	    			.addGap(43)
	    			.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(215, Short.MAX_VALUE))
	    );
	    
	    JLabel lblTarget_1_3_2 = new JLabel("Starting Date:");
	    lblTarget_1_3_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_1_3_2_1_1_1 = new JLabel("Date");
	    lblTarget_1_3_2_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_1_3_2_1 = new JLabel("Rank:");
	    lblTarget_1_3_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_1_3_2_1_1 = new JLabel("Rank:");
	    lblTarget_1_3_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_1_3_2_1_2 = new JLabel("Role:");
	    lblTarget_1_3_2_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_1_3_2_1_2_1 = new JLabel("Role:");
	    lblTarget_1_3_2_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    GroupLayout gl_panel_28 = new GroupLayout(panel_28);
	    gl_panel_28.setHorizontalGroup(
	    	gl_panel_28.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_28.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_28.createSequentialGroup()
	    					.addComponent(lblTarget_1_3_2)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblTarget_1_3_2_1_1_1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_28.createSequentialGroup()
	    					.addComponent(lblTarget_1_3_2_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblTarget_1_3_2_1_1, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
	    				.addGroup(gl_panel_28.createSequentialGroup()
	    					.addComponent(lblTarget_1_3_2_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblTarget_1_3_2_1_2_1, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
	    			.addContainerGap())
	    );
	    gl_panel_28.setVerticalGroup(
	    	gl_panel_28.createParallelGroup(Alignment.LEADING)
	    		.addGroup(Alignment.TRAILING, gl_panel_28.createSequentialGroup()
	    			.addContainerGap(37, Short.MAX_VALUE)
	    			.addGroup(gl_panel_28.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_1_3_2)
	    				.addComponent(lblTarget_1_3_2_1_1_1))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel_28.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_1_3_2_1)
	    				.addComponent(lblTarget_1_3_2_1_1))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblTarget_1_3_2_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblTarget_1_3_2_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    panel_28.setLayout(gl_panel_28);
	    
	    JLabel lblNewLabel_1_4 = new JLabel("Remove", SwingConstants.CENTER);
	    lblNewLabel_1_4.setFont(new Font("Segoe UI Black", Font.PLAIN, 21));
	    panel_25_3.add(lblNewLabel_1_4, BorderLayout.CENTER);
	    deletePanel.setLayout(gl_deletePanel);
	    
	    KGradientPanel calendarPanel = new KGradientPanel();
	    calendarPanel.setkEndColor(new Color(248, 248, 255));
	    calendarPanel.setkStartColor(new Color(248, 248, 255));
	    calendarPanel.kStartColor = new Color(248, 248, 255);
	    calendarPanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(calendarPanel, "name_519279147735800");
	    
	    JPanel panel_13 = new JPanel();
	    panel_13.setBackground(Color.WHITE);
	    panel_13.setBorder(null);
	    
	    JList list = new JList();
	    
	    JLabel monthSelectedLabel = new JLabel("Selected Month", SwingConstants.RIGHT);
	    monthSelectedLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_1_4_1 = new JLabel(",");
	    lblTarget_1_4_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel daySelectedLabel = new JLabel("Selected Day");
	    daySelectedLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_1_4_3 = new JLabel("Event(s):");
	    lblTarget_1_4_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_19 = new JTextField();
	    textField_19.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
	    textField_19.setBackground(new Color(248, 248, 255));
	    textField_19.setColumns(10);
	    
	    JTextArea textArea_2 = new JTextArea();
	    textArea_2.setBackground(new Color(248, 248, 255));
	    
	    JPanel panel_15 = new JPanel();
	    panel_15.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(127, 127, 127)));
	    panel_15.setBackground(new Color(248, 248, 255));
	    GroupLayout gl_calendarPanel = new GroupLayout(calendarPanel);
	    gl_calendarPanel.setHorizontalGroup(
	    	gl_calendarPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_calendarPanel.createSequentialGroup()
	    			.addGroup(gl_calendarPanel.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(Alignment.LEADING, gl_calendarPanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_calendarPanel.createParallelGroup(Alignment.LEADING, false)
	    						.addGroup(gl_calendarPanel.createSequentialGroup()
	    							.addComponent(lblTarget_1_4_3)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(textField_19))
	    						.addGroup(gl_calendarPanel.createSequentialGroup()
	    							.addGap(95)
	    							.addComponent(lblTarget_1_4_1)
	    							.addGap(148)
	    							.addComponent(monthSelectedLabel, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
	    							.addGap(9)
	    							.addComponent(daySelectedLabel))
	    						.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(panel_15, 0, 0, Short.MAX_VALUE))
	    				.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 1131, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(list)
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    gl_calendarPanel.setVerticalGroup(
	    	gl_calendarPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_calendarPanel.createSequentialGroup()
	    			.addGap(0)
	    			.addGroup(gl_calendarPanel.createParallelGroup(Alignment.TRAILING)
	    				.addComponent(list, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 583, GroupLayout.PREFERRED_SIZE))
	    			.addGroup(gl_calendarPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_calendarPanel.createSequentialGroup()
	    					.addGap(17)
	    					.addGroup(gl_calendarPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblTarget_1_4_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(monthSelectedLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(daySelectedLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_calendarPanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblTarget_1_4_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_calendarPanel.createSequentialGroup()
	    					.addGap(9)
	    					.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    
	    textField_20 = new JTextField();
	    textField_20.setColumns(10);
	    textField_20.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_20 = (JTextField) e.getSource();
	  		    String text = textField_20.getText();
	  		  textField_20.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_20.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_20.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_20.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JLabel lblTarget_1_4_2_1 = new JLabel("Date");
	    lblTarget_1_4_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_21 = new JTextField();
	    textField_21.setColumns(10);
	    
	    JLabel lblTarget_1_4_2_1_1 = new JLabel("Event");
	    lblTarget_1_4_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Notify");
	    chckbxNewCheckBox_7.setSelected(true);
	    
	    JTextArea textArea_3 = new JTextArea();
	    textArea_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    textArea_3.setText("Details...");
	    textArea_3.setForeground(Color.LIGHT_GRAY);
	    textArea_3.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = textArea_3.getText();
	            if(text.equals("Name")) {
	            	textArea_3.setText("");
	            	textArea_3.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    
	    JButton btnNewButton_6 = new JButton("Submit");
	    btnNewButton_6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    
	    JLabel lblCreateAnEvent = new JLabel("Create an event", SwingConstants.CENTER);
	    lblCreateAnEvent.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    GroupLayout gl_panel_15 = new GroupLayout(panel_15);
	    gl_panel_15.setHorizontalGroup(
	    	gl_panel_15.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_panel_15.createSequentialGroup()
	    			.addGap(34)
	    			.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblCreateAnEvent, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
	    				.addGroup(gl_panel_15.createSequentialGroup()
	    					.addComponent(textArea_3, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(btnNewButton_6, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
	    				.addGroup(gl_panel_15.createSequentialGroup()
	    					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
	    						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblTarget_1_4_2_1))
	    					.addGap(10)
	    					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblTarget_1_4_2_1_1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	    						.addGroup(gl_panel_15.createSequentialGroup()
	    							.addComponent(textField_21, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
	    							.addPreferredGap(ComponentPlacement.UNRELATED)
	    							.addComponent(chckbxNewCheckBox_7)))))
	    			.addGap(53))
	    );
	    gl_panel_15.setVerticalGroup(
	    	gl_panel_15.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_15.createSequentialGroup()
	    			.addComponent(lblCreateAnEvent, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_1_4_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblTarget_1_4_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(chckbxNewCheckBox_7))
	    			.addGap(4)
	    			.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
	    				.addComponent(btnNewButton_6, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
	    				.addComponent(textArea_3, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    panel_15.setLayout(gl_panel_15);
	    
	    JPanel panel_14 = new JPanel();
	    panel_14.setBackground(Color.WHITE);
	    panel_14.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
	    
	    JPanel panel_16 = new JPanel();
	    panel_16.setBackground(Color.WHITE);
	    
	    JLabel lblNewLabel_1_1_2 = new JLabel("M");
	    lblNewLabel_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    panel_16.setLayout(new BorderLayout(0, 0));
	    
	    JLabel monthTitle = new JLabel("MONTH", SwingConstants.CENTER);
	    monthTitle.setFont(new Font("Segoe UI", Font.ITALIC, 18));
	    panel_16.add(monthTitle, BorderLayout.CENTER);
	    
	    JLabel lblNewLabel_1_1 = new JLabel("<html> Year &nbsp; &nbsp; </html>");
	    lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    panel_16.add(lblNewLabel_1_1, BorderLayout.EAST);
	    
	    JLabel lblNewLabel_1_1_1 = new JLabel("     Season");
	    lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    panel_16.add(lblNewLabel_1_1_1, BorderLayout.WEST);
	    
	 
	    Icon calendarNullButton = new ImageIcon("Resources/Decals/calendarNullBackground.png");
	    ImageIcon rollover = new ImageIcon("Resources/Decals/icons8_circle_64px.png");
	    Icon CalendarSelected = new ImageIcon("Resources/Decals/CalendarSelected.png");
	    Icon CalendarPressed = new ImageIcon("Resources/Decals/CalendarPressedIcon.png");
	    
	    JToggleButton Su1 = new JToggleButton("Su1-1", calendarNullButton);
	    JToggleButton M1 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton T1 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton W1 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Tr1 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton F1 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton S1 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Su2 = new JToggleButton("Su1-2", calendarNullButton);
	    JToggleButton M2 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton T2 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton W2 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Tr2 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton F2 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton S2 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Su3 = new JToggleButton("Su1-3", calendarNullButton);
	    JToggleButton M3 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton T3 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton W3 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Tr3 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton F3 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton S3 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton M4 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton T4 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton W4 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Tr4 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton F4 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton S4 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Su4 = new JToggleButton("Su1-5", calendarNullButton);
	    JToggleButton M5 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton T5 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton W5 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Tr5 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton F5 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton S5 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Su5 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton M6 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton T6 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton W6 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Tr6 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton F6 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton S6 = new JToggleButton("New button", calendarNullButton);
	    JToggleButton Su6 = new JToggleButton("Su1-5", calendarNullButton);
	    
	    
	    
	    
	    Su1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Su1.getText());
	    		//Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    		

	    	}
	    });
	    Su1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Su1.setSelectedIcon(CalendarSelected);
	    Su1.setRolloverIcon(rollover);
	    Su1.setOpaque(false);
	    Su1.setVerticalTextPosition(JLabel.CENTER);
	    Su1.setHorizontalTextPosition(JLabel.CENTER);
	    Su1.setContentAreaFilled(false);
	    Su1.setRolloverIcon(rollover);
	    Su1.setRolloverEnabled(true);
	    panel_14.add(Su1);
	    
	    M1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(M1.getText());
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		//M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    	
	    });
	    M1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    M1.setSelectedIcon(CalendarSelected);
	    M1.setOpaque(false);
	    M1.setVerticalTextPosition(JLabel.CENTER);
	    M1.setHorizontalTextPosition(JLabel.CENTER);
	    M1.setContentAreaFilled(false);
	    M1.setRolloverIcon(rollover);
	    M1.setRolloverEnabled(true);
	    M1.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	
	        	M1.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	M1.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(M1);
	    
	    T1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(T1.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		//T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    T1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    T1.setSelectedIcon(CalendarSelected);
	    T1.setRolloverIcon(rollover);
	    T1.setRolloverEnabled(true);
	    T1.setOpaque(false);
	    T1.setVerticalTextPosition(JLabel.CENTER);
	    T1.setHorizontalTextPosition(JLabel.CENTER);
	    T1.setContentAreaFilled(false);
	    T1.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	T1.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	T1.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(T1);
	    
	    W1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(W1.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		//W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    W1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    W1.setSelectedIcon(CalendarSelected);
	    W1.setRolloverIcon(rollover);
	    W1.setRolloverEnabled(true);
	    W1.setOpaque(false);
	    W1.setVerticalTextPosition(JLabel.CENTER);
	    W1.setHorizontalTextPosition(JLabel.CENTER);
	    W1.setContentAreaFilled(false);
	    W1.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	W1.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	W1.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(W1);
	    
	 
	    Tr1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Tr1.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		//Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Tr1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Tr1.setSelectedIcon(CalendarSelected);
	    Tr1.setRolloverIcon(rollover);
	    Tr1.setRolloverEnabled(true);
	    Tr1.setOpaque(false);
	    Tr1.setVerticalTextPosition(JLabel.CENTER);
	    Tr1.setHorizontalTextPosition(JLabel.CENTER);
	    Tr1.setContentAreaFilled(false);
	    Tr1.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Tr1.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Tr1.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Tr1);
	    
	    
	    F1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(F1.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		//F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    F1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    F1.setSelectedIcon(CalendarSelected);
	    F1.setRolloverIcon(rollover);
	    F1.setRolloverEnabled(true);
	    F1.setOpaque(false);
	    F1.setVerticalTextPosition(JLabel.CENTER);
	    F1.setHorizontalTextPosition(JLabel.CENTER);
	    F1.setContentAreaFilled(false);
	    F1.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	F1.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	F1.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(F1);
	    

	    S1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(S1.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		//S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    S1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    S1.setSelectedIcon(CalendarSelected);
	    S1.setSelectedIcon(CalendarSelected);
	    S1.setRolloverIcon(rollover);
	    S1.setSelected(false);
	    S1.setOpaque(false);
	    S1.setVerticalTextPosition(JLabel.CENTER);
	    S1.setHorizontalTextPosition(JLabel.CENTER);
	    S1.setContentAreaFilled(false);
	    panel_14.add(S1);
	    
	    Su2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Su2.getText());
	    		
	    		Su1.setSelected(false);
	    		//Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Su2.setSelectedIcon(CalendarSelected);
	    Su2.setRolloverIcon(rollover);
	    Su2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Su2.setSelectedIcon(CalendarSelected);
	    Su2.setRolloverIcon(rollover);
	    Su2.setRolloverEnabled(true);
	    Su2.setOpaque(false);
	    Su2.setVerticalTextPosition(JLabel.CENTER);
	    Su2.setHorizontalTextPosition(JLabel.CENTER);
	    Su2.setContentAreaFilled(false);
	    Su2.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Su2.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Su2.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Su2);
	    
	    
	    M2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(M2.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		//M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    M2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    M2.setSelectedIcon(CalendarSelected);
	    M2.setRolloverIcon(rollover);
	    M2.setRolloverEnabled(true);
	    M2.setOpaque(false);
	    M2.setVerticalTextPosition(JLabel.CENTER);
	    M2.setHorizontalTextPosition(JLabel.CENTER);
	    M2.setContentAreaFilled(false);
	    M2.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	M2.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	M2.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(M2);
	    
	    
	    T2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(T2.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		//T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    T2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    T2.setSelectedIcon(CalendarSelected);
	    T2.setRolloverIcon(rollover);
	    T2.setRolloverEnabled(true);
	    T2.setOpaque(false);
	    T2.setVerticalTextPosition(JLabel.CENTER);
	    T2.setHorizontalTextPosition(JLabel.CENTER);
	    T2.setContentAreaFilled(false);
	    T2.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	T2.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	T2.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(T2);
	    
	   
	    W2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(W2.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		//W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    W2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    W2.setSelectedIcon(CalendarSelected);
	    W2.setRolloverIcon(rollover);
	    W2.setRolloverEnabled(true);
	    W2.setOpaque(false);
	    W2.setVerticalTextPosition(JLabel.CENTER);
	    W2.setHorizontalTextPosition(JLabel.CENTER);
	    W2.setContentAreaFilled(false);
	    W2.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	W2.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	W2.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(W2);
	    
	  
	    Tr2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Tr2.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		//Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Tr2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Tr2.setSelectedIcon(CalendarSelected);
	    Tr2.setRolloverIcon(rollover);
	    Tr2.setRolloverEnabled(true);
	    Tr2.setOpaque(false);
	    Tr2.setVerticalTextPosition(JLabel.CENTER);
	    Tr2.setHorizontalTextPosition(JLabel.CENTER);
	    Tr2.setContentAreaFilled(false);
	    Tr2.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Tr2.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Tr2.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Tr2);
	    
	    
	    F2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(F2.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		//F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    F2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    F2.setSelectedIcon(CalendarSelected);
	    F2.setRolloverIcon(rollover);
	    F2.setRolloverEnabled(true);
	    F2.setOpaque(false);
	    F2.setVerticalTextPosition(JLabel.CENTER);
	    F2.setHorizontalTextPosition(JLabel.CENTER);
	    F2.setContentAreaFilled(false);
	    F2.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	F2.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	F2.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(F2);
	    
	    S2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(S2.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		//S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    S2.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    S2.setSelectedIcon(CalendarSelected);
	    S2.setRolloverIcon(rollover);
	    S2.setRolloverEnabled(true);
	    S2.setOpaque(false);
	    S2.setVerticalTextPosition(JLabel.CENTER);
	    S2.setHorizontalTextPosition(JLabel.CENTER);
	    S2.setContentAreaFilled(false);
	    S2.setRolloverIcon(rollover);
	    S2.setRolloverEnabled(true);
	    panel_14.add(S2);
	    
	  
	    Su3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Su3.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		//Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Su3.setSelectedIcon(CalendarSelected);
	    Su3.setRolloverIcon(rollover);
	    Su3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Su3.setSelectedIcon(CalendarSelected);
	    Su3.setRolloverIcon(rollover);
	    Su3.setRolloverEnabled(true);
	    Su3.setOpaque(false);
	    Su3.setVerticalTextPosition(JLabel.CENTER);
	    Su3.setHorizontalTextPosition(JLabel.CENTER);
	    Su3.setContentAreaFilled(false);
	    Su3.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Su3.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Su3.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Su3);
	    
	    
	    M3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(M3.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		//M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    M3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    M3.setSelectedIcon(CalendarSelected);
	    M3.setRolloverIcon(rollover);
	    M3.setRolloverEnabled(true);
	    M3.setOpaque(false);
	    M3.setVerticalTextPosition(JLabel.CENTER);
	    M3.setHorizontalTextPosition(JLabel.CENTER);
	    M3.setContentAreaFilled(false);
	    M3.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	M3.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	M3.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(M3);
	    
	    
	    T3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(T3.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		//T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    T3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    T3.setSelectedIcon(CalendarSelected);
	    T3.setRolloverIcon(rollover);
	    T3.setRolloverEnabled(true);
	    T3.setOpaque(false);
	    T3.setVerticalTextPosition(JLabel.CENTER);
	    T3.setHorizontalTextPosition(JLabel.CENTER);
	    T3.setContentAreaFilled(false);
	    T3.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	T3.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	T3.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(T3);
	    
	   
	    W3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(W3.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		//W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    W3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    W3.setSelectedIcon(CalendarSelected);
	    W3.setRolloverIcon(rollover);
	    W3.setRolloverEnabled(true);
	    W3.setOpaque(false);
	    W3.setVerticalTextPosition(JLabel.CENTER);
	    W3.setHorizontalTextPosition(JLabel.CENTER);
	    W3.setContentAreaFilled(false);
	    W3.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	W3.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	W3.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(W3);
	    
	    
	    Tr3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Tr3.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		//Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Tr3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Tr3.setSelectedIcon(CalendarSelected);
	    Tr3.setRolloverIcon(rollover);
	    Tr3.setRolloverEnabled(true);
	    Tr3.setOpaque(false);
	    Tr3.setVerticalTextPosition(JLabel.CENTER);
	    Tr3.setHorizontalTextPosition(JLabel.CENTER);
	    Tr3.setContentAreaFilled(false);
	    Tr3.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Tr3.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Tr3.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Tr3);
	    
	    
	    F3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(F3.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		//F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    F3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    F3.setSelectedIcon(CalendarSelected);
	    F3.setRolloverIcon(rollover);
	    F3.setRolloverEnabled(true);
	    F3.setOpaque(false);
	    F3.setVerticalTextPosition(JLabel.CENTER);
	    F3.setHorizontalTextPosition(JLabel.CENTER);
	    F3.setContentAreaFilled(false);
	    F3.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	F3.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	F3.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(F3);
	    
	  
	    S3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(S3.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		//S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    S3.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    S3.setSelectedIcon(CalendarSelected);
	    S3.setRolloverIcon(rollover);
	    S3.setRolloverEnabled(true);
	    S3.setOpaque(false);
	    S3.setVerticalTextPosition(JLabel.CENTER);
	    S3.setHorizontalTextPosition(JLabel.CENTER);
	    S3.setContentAreaFilled(false);
	    S3.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	S3.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	S3.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(S3);
	    
	    
	    Su4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Su4.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		//Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Su4.setSelectedIcon(CalendarSelected);
	    Su4.setRolloverIcon(rollover);
	    Su4.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Su4.setSelectedIcon(CalendarSelected);
	    Su4.setRolloverIcon(rollover);
	    Su4.setRolloverEnabled(true);
	    Su4.setOpaque(false);
	    Su4.setVerticalTextPosition(JLabel.CENTER);
	    Su4.setHorizontalTextPosition(JLabel.CENTER);
	    Su4.setContentAreaFilled(false);
	    Su4.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Su4.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Su4.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Su4);
	    
	   
	    M4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(M4.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		//M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    M4.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    M4.setSelectedIcon(CalendarSelected);
	    M4.setRolloverIcon(rollover);
	    M4.setRolloverEnabled(true);
	    M4.setOpaque(false);
	    M4.setVerticalTextPosition(JLabel.CENTER);
	    M4.setHorizontalTextPosition(JLabel.CENTER);
	    M4.setContentAreaFilled(false);
	    M4.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	M4.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	M4.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(M4);
	    
	   
	    T4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(T4.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		//T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    T4.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    T4.setSelectedIcon(CalendarSelected);
	    T4.setRolloverIcon(rollover);
	    T4.setRolloverEnabled(true);
	    T4.setOpaque(false);
	    T4.setVerticalTextPosition(JLabel.CENTER);
	    T4.setHorizontalTextPosition(JLabel.CENTER);
	    T4.setContentAreaFilled(false);
	    T4.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	T4.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	T4.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(T4);
	    
	  
	    W4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(W4.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		//W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    W4.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    W4.setSelectedIcon(CalendarSelected);
	    W4.setRolloverIcon(rollover);
	    W4.setRolloverEnabled(true);
	    W4.setOpaque(false);
	    W4.setVerticalTextPosition(JLabel.CENTER);
	    W4.setHorizontalTextPosition(JLabel.CENTER);
	    W4.setContentAreaFilled(false);
	    W4.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	W4.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	W4.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(W4);
	    
	   
	    Tr4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Tr4.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		//Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Tr4.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Tr4.setSelectedIcon(CalendarSelected);
	    Tr4.setRolloverIcon(rollover);
	    Tr4.setRolloverEnabled(true);
	    Tr4.setOpaque(false);
	    Tr4.setVerticalTextPosition(JLabel.CENTER);
	    Tr4.setHorizontalTextPosition(JLabel.CENTER);
	    Tr4.setContentAreaFilled(false);
	    Tr4.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Tr4.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Tr4.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Tr4);
	    
	   
	    F4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(F4.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		//F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    F4.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    F4.setSelectedIcon(CalendarSelected);
	    F4.setRolloverIcon(rollover);
	    F4.setRolloverEnabled(true);
	    F4.setOpaque(false);
	    F4.setVerticalTextPosition(JLabel.CENTER);
	    F4.setHorizontalTextPosition(JLabel.CENTER);
	    F4.setContentAreaFilled(false);
	    F4.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	F4.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	F4.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(F4);
	    
	 
	    S4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(S4.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		//S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    S4.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    S4.setSelectedIcon(CalendarSelected);
	    S4.setRolloverIcon(rollover);
	    S4.setRolloverEnabled(true);
	    S4.setOpaque(false);
	    S4.setVerticalTextPosition(JLabel.CENTER);
	    S4.setHorizontalTextPosition(JLabel.CENTER);
	    S4.setContentAreaFilled(false);
	    S4.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	S4.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	S4.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(S4);
	    
	  
	    Su5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Su5.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		//Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Su5.setSelectedIcon(CalendarSelected);
	    Su5.setRolloverIcon(rollover);
	    Su5.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Su5.setSelectedIcon(CalendarSelected);
	    Su5.setRolloverIcon(rollover);
	    Su5.setRolloverEnabled(true);
	    Su5.setOpaque(false);
	    Su5.setVerticalTextPosition(JLabel.CENTER);
	    Su5.setHorizontalTextPosition(JLabel.CENTER);
	    Su5.setContentAreaFilled(false);
	    Su5.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Su5.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Su5.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Su5);
	    
	   
	    M5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(M5.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		//M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    M5.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    M5.setSelectedIcon(CalendarSelected);
	    M5.setRolloverIcon(rollover);
	    M5.setRolloverEnabled(true);
	    M5.setOpaque(false);
	    M5.setVerticalTextPosition(JLabel.CENTER);
	    M5.setHorizontalTextPosition(JLabel.CENTER);
	    M5.setContentAreaFilled(false);
	    M5.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	M5.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	M5.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(M5);
	    
	   
	    T5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(T5.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		//T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    T5.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    T5.setSelectedIcon(CalendarSelected);
	    T5.setRolloverIcon(rollover);
	    T5.setRolloverEnabled(true);
	    T5.setOpaque(false);
	    T5.setVerticalTextPosition(JLabel.CENTER);
	    T5.setHorizontalTextPosition(JLabel.CENTER);
	    T5.setContentAreaFilled(false);
	    T5.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	T5.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	T5.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(T5);
	    
	   
	    W5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(W5.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		//W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    W5.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    W5.setSelectedIcon(CalendarSelected);
	    W5.setRolloverIcon(rollover);
	    W5.setRolloverEnabled(true);
	    W5.setOpaque(false);
	    W5.setVerticalTextPosition(JLabel.CENTER);
	    W5.setHorizontalTextPosition(JLabel.CENTER);
	    W5.setContentAreaFilled(false);
	    W5.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	W5.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	W5.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(W5);
	    
	  	    Tr5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Tr5.getText());
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		//Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Tr5.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Tr5.setSelectedIcon(CalendarSelected);
	    Tr5.setRolloverIcon(rollover);
	    Tr5.setRolloverEnabled(true);
	    Tr5.setOpaque(false);
	    Tr5.setVerticalTextPosition(JLabel.CENTER);
	    Tr5.setHorizontalTextPosition(JLabel.CENTER);
	    Tr5.setContentAreaFilled(false);
	    Tr5.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Tr5.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Tr5.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Tr5);
	    
	   
	    F5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(F5.getText());
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		//F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    F5.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    F5.setSelectedIcon(CalendarSelected);
	    F5.setRolloverIcon(rollover);
	    F5.setRolloverEnabled(true);
	    F5.setOpaque(false);
	    F5.setVerticalTextPosition(JLabel.CENTER);
	    F5.setHorizontalTextPosition(JLabel.CENTER);
	    F5.setContentAreaFilled(false);
	    F5.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	F5.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	F5.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(F5);
	    
	    
	    S5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(S5.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		//S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    S5.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    S5.setSelectedIcon(CalendarSelected);
	    S5.setRolloverIcon(rollover);
	    S5.setRolloverEnabled(true);
	    S5.setOpaque(false);
	    S5.setVerticalTextPosition(JLabel.CENTER);
	    S5.setHorizontalTextPosition(JLabel.CENTER);
	    S5.setContentAreaFilled(false);
	    S5.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	S5.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	S5.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(S5);
	    
	  
	    Su6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Su6.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		//Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Su6.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Su6.setSelectedIcon(CalendarSelected);
	    Su6.setRolloverIcon(rollover);
	    Su6.setRolloverEnabled(true);
	    Su6.setOpaque(false);
	    Su6.setVerticalTextPosition(JLabel.CENTER);
	    Su6.setHorizontalTextPosition(JLabel.CENTER);
	    Su6.setContentAreaFilled(false);
	    Su6.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Su6.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Su6.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Su6);
	    
	  	    M6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(M6.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		//M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    M6.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    M6.setSelectedIcon(CalendarSelected);
	    M6.setRolloverIcon(rollover);
	    M6.setRolloverEnabled(true);
	    M6.setOpaque(false);
	    M6.setVerticalTextPosition(JLabel.CENTER);
	    M6.setHorizontalTextPosition(JLabel.CENTER);
	    M6.setContentAreaFilled(false);
	    M6.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	M6.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	M6.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(M6);
	    
	   
	    T6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(T6.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		//T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    T6.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    T6.setSelectedIcon(CalendarSelected);
	    T6.setRolloverIcon(rollover);
	    T6.setRolloverEnabled(true);
	    T6.setOpaque(false);
	    T6.setVerticalTextPosition(JLabel.CENTER);
	    T6.setHorizontalTextPosition(JLabel.CENTER);
	    T6.setContentAreaFilled(false);
	    T6.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	T6.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	T6.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(T6);
	    
	    
	    W6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(W6.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		//W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    W6.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    W6.setSelectedIcon(CalendarSelected);
	    W6.setRolloverIcon(rollover);
	    W6.setRolloverEnabled(true);
	    W6.setOpaque(false);
	    W6.setVerticalTextPosition(JLabel.CENTER);
	    W6.setHorizontalTextPosition(JLabel.CENTER);
	    W6.setContentAreaFilled(false);
	    W6.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	W6.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	W6.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(W6);
	    
	    
	    Tr6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(Tr6.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		//Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		S6.setSelected(false);
	    	}
	    });
	    Tr6.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    Tr6.setSelectedIcon(CalendarSelected);
	    Tr6.setRolloverIcon(rollover);
	    Tr6.setRolloverEnabled(true);
	    Tr6.setOpaque(false);
	    Tr6.setVerticalTextPosition(JLabel.CENTER);
	    Tr6.setHorizontalTextPosition(JLabel.CENTER);
	    Tr6.setContentAreaFilled(false);
	    Tr6.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	Tr6.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	Tr6.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(Tr6);
	    
	   
	    F6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    F6.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    F6.setSelectedIcon(CalendarSelected);
	    F6.setRolloverIcon(rollover);
	    F6.setRolloverEnabled(true);
	    F6.setOpaque(false);
	    F6.setVerticalTextPosition(JLabel.CENTER);
	    F6.setHorizontalTextPosition(JLabel.CENTER);
	    F6.setContentAreaFilled(false);
	    F6.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	F6.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	F6.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(F6);
	    
	    
	    S6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		monthSelectedLabel.setText(monthTitle.getText());
	    		daySelectedLabel.setText(S6.getText());
	    		
	    		Su1.setSelected(false);
	    		Su2.setSelected(false);
	    		Su3.setSelected(false);
	    		Su4.setSelected(false);
	    		Su5.setSelected(false);
	    		Su6.setSelected(false);
	    		M1.setSelected(false);
	    		M2.setSelected(false);
	    		M3.setSelected(false);
	    		M4.setSelected(false);
	    		M5.setSelected(false);
	    		M6.setSelected(false);
	    		T1.setSelected(false);
	    		T2.setSelected(false);
	    		T3.setSelected(false);
	    		T4.setSelected(false);
	    		T5.setSelected(false);
	    		T6.setSelected(false);
	    		W1.setSelected(false);
	    		W2.setSelected(false);
	    		W3.setSelected(false);
	    		W4.setSelected(false);
	    		W5.setSelected(false);
	    		W6.setSelected(false);
	    		Tr1.setSelected(false);
	    		Tr2.setSelected(false);
	    		Tr3.setSelected(false);
	    		Tr4.setSelected(false);
	    		Tr5.setSelected(false);
	    		Tr6.setSelected(false);
	    		F1.setSelected(false);
	    		F2.setSelected(false);
	    		F3.setSelected(false);
	    		F4.setSelected(false);
	    		F5.setSelected(false);
	    		F6.setSelected(false);
	    		S1.setSelected(false);
	    		S2.setSelected(false);
	    		S3.setSelected(false);
	    		S4.setSelected(false);
	    		S5.setSelected(false);
	    		//S6.setSelected(false);
	    	}
	    });
	    S6.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
	    S6.setSelectedIcon(CalendarSelected);
	    S6.setRolloverIcon(rollover);
	    S6.setRolloverEnabled(true);
	    S6.setOpaque(false);
	    S6.setVerticalTextPosition(JLabel.CENTER);
	    S6.setHorizontalTextPosition(JLabel.CENTER);
	    S6.setContentAreaFilled(false);
	    S6.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	        	S6.setForeground(Color.BLACK);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	S6.setForeground(Color.BLACK);
	        }
	    });
	    panel_14.add(S6);
	    
	    Icon calendarNextBtn = new ImageIcon("Resources/Decals/calendarNextBtn.png");
	    Icon calendarNextBtnPressed = new ImageIcon("Resources/Decals/calendarNextBtn(Pressed).png");
	    JButton btnNewButton_7 = new JButton(calendarNextBtn);
	    btnNewButton_7.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mousePressed(MouseEvent e) {
	    		btnNewButton_7.setIcon(calendarNextBtnPressed);
	    	}
	    	@Override
	    	public void mouseReleased(MouseEvent e) {
	    		btnNewButton_7.setIcon(calendarNextBtn);
	    	}

	    });
	    btnNewButton_7.setOpaque(false);
	    btnNewButton_7.setContentAreaFilled(false);
	    btnNewButton_7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String currentViewedMonth = monthTitle.getText();
	    		if(currentViewedMonth.equals("January")) {monthTitle.setText("Feburary");}
	    		if(currentViewedMonth.equals("Feburary")) {monthTitle.setText("March"); lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Spring </html>");}
	    		if(currentViewedMonth.equals("March")) {monthTitle.setText("April");}
	    		if(currentViewedMonth.equals("April")) {monthTitle.setText("May");}
	    		if(currentViewedMonth.equals("May")) {monthTitle.setText("June"); lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Summer </html>"); }
	    		if(currentViewedMonth.equals("June")) {monthTitle.setText("July");}
	    		if(currentViewedMonth.equals("July")) {monthTitle.setText("August");}
	    		if(currentViewedMonth.equals("August")) {monthTitle.setText("September"); lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Fall </html>");}
	    		if(currentViewedMonth.equals("September")) {monthTitle.setText("October");}
	    		if(currentViewedMonth.equals("October")) {monthTitle.setText("November");}
	    		if(currentViewedMonth.equals("November")) {monthTitle.setText("December"); lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Winter </html>");}
	    		if(currentViewedMonth.equals("December")) {monthTitle.setText("January");
	    		
    		  	String yearToFormat = lblNewLabel_1_1.getText();
    	        yearToFormat = yearToFormat.replace("<html> ", "");
    	        yearToFormat = yearToFormat.replace(" &nbsp; &nbsp; </html>", "");
    	        
    	        int yearFormatter = Integer.valueOf(yearToFormat);
    	        lblNewLabel_1_1.setText(String.valueOf("<html> " + (yearFormatter + 1) + " &nbsp; &nbsp; </html>"));
	    		
	    		}

	    		
	    		String newMonth = monthTitle.getText();
	    		
	    		
	    		
	    		
	    		 Calendar cal = Calendar.getInstance();
	    	        if(newMonth.equals("January")) {
	    	        cal.set(Calendar.MONTH, Calendar.JANUARY);
	    	        }
	    	        if(newMonth.equals("Feburary")) {
	    	        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
	    	        }
	    	        if(newMonth.equals("March")) {
	    	        cal.set(Calendar.MONTH, Calendar.MARCH);
	    	        }
	    	        if(newMonth.equals("April")) {
	    	        cal.set(Calendar.MONTH, Calendar.APRIL);
	    	        }
	    	        if(newMonth.equals("May")) {
	    	        cal.set(Calendar.MONTH, Calendar.MAY);
	    	        }
	    	        if(newMonth.equals("June")) {
	    	        cal.set(Calendar.MONTH, Calendar.JUNE);
	    	        }
	    	        if(newMonth.equals("July")) {
	    	        cal.set(Calendar.MONTH, Calendar.JULY);
	    	        }
	    	        if(newMonth.equals("August")) {
	    	        cal.set(Calendar.MONTH, Calendar.AUGUST);
	    	        }
	    	        if(newMonth.equals("September")) {
	    	        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
	    	        }
	    	        if(newMonth.equals("October")) {
	    	        cal.set(Calendar.MONTH, Calendar.OCTOBER);
	    	        }
	    	        if(newMonth.equals("November")) {
	    	        cal.set(Calendar.MONTH, Calendar.NOVEMBER);
	    	        }
	    	        if(newMonth.equals("December")) {
	    	        cal.set(Calendar.MONTH, Calendar.DECEMBER);
	    	        }
	    	        
	    	        String yearToFormat = lblNewLabel_1_1.getText();
	    	        yearToFormat = yearToFormat.replace("<html> ", "");
	    	        yearToFormat = yearToFormat.replace(" &nbsp; &nbsp; </html>", "");
	    	        int yearForSystem = Integer.valueOf(yearToFormat);
	    	        cal.set(Calendar.YEAR, yearForSystem);

	    	        cal.set(Calendar.DAY_OF_MONTH, 1);
	    	        Date firstDayOfMonth = cal.getTime();
	    	        
	    	        DateFormat sdf = new SimpleDateFormat("EEEEEEEE");   
	    	        System.out.println("First Day of Month: " + sdf.format(firstDayOfMonth)); 
	    	        
	    	        String currentMonth = sdf.format(firstDayOfMonth).toString();
	    	        System.out.println("currentMonth " + currentMonth);
	    	        
	    	        int day = 1;
	    	        if(currentMonth.equals("Monday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setText(String.valueOf(day));
	    	        	day++;
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setVisible(false); 
	    	        	F5.setVisible(false);
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false); 
	    	        }
	    	        if(currentMonth.equals("Tuesday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setVisible(false);
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false); 
	    	        	
	    	        	
	    	        	
	    	        }
	    	        if(currentMonth.equals("Wednesday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Thursday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        	
	    	        }
	    	        if(currentMonth.equals("Friday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setVisible(false);
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su6.setText(String.valueOf(day));
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Saturday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setVisible(false);
	    	        	F1.setVisible(false);
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su6.setText(String.valueOf(day));
	    	        	day++;
	    	        	M6.setText(String.valueOf(day));
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Sunday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setText(String.valueOf(day));
	    	        	day++;
	    	        	M1.setText(String.valueOf(day));
	    	        	day++;
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setVisible(false);
	    	        	day++;
	    	        	Tr5.setVisible(false);
	    	        	day++;
	    	        	F5.setVisible(false);
	    	        	day++;
	    	        	S5.setVisible(false);
	    	        	day++;
	    	        	Su6.setVisible(false);
	    	        	day++;
	    	        	M6.setVisible(false);
	    	        	day++;
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
		    		Su1.setSelected(false);
		    		Su2.setSelected(false);
		    		Su3.setSelected(false);
		    		Su4.setSelected(false);
		    		Su5.setSelected(false);
		    		Su6.setSelected(false);
		    		M1.setSelected(false);
		    		M2.setSelected(false);
		    		M3.setSelected(false);
		    		M4.setSelected(false);
		    		M5.setSelected(false);
		    		M6.setSelected(false);
		    		T1.setSelected(false);
		    		T2.setSelected(false);
		    		T3.setSelected(false);
		    		T4.setSelected(false);
		    		T5.setSelected(false);
		    		T6.setSelected(false);
		    		W1.setSelected(false);
		    		W2.setSelected(false);
		    		W3.setSelected(false);
		    		W4.setSelected(false);
		    		W5.setSelected(false);
		    		W6.setSelected(false);
		    		Tr1.setSelected(false);
		    		Tr2.setSelected(false);
		    		Tr3.setSelected(false);
		    		Tr4.setSelected(false);
		    		Tr5.setSelected(false);
		    		Tr6.setSelected(false);
		    		F1.setSelected(false);
		    		F2.setSelected(false);
		    		F3.setSelected(false);
		    		F4.setSelected(false);
		    		F5.setSelected(false);
		    		F6.setSelected(false);
		    		S1.setSelected(false);
		    		S2.setSelected(false);
		    		S3.setSelected(false);
		    		S4.setSelected(false);
		    		S5.setSelected(false);
		    		S6.setSelected(false);
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    	}
	    });
	    Icon calendarBackBtn = new ImageIcon("Resources/Decals/calendarBackBtn.png");
	    Icon calendarBackBtnPressed = new ImageIcon("Resources/Decals/calendarBackBtn(Pressed).png");
	    JButton btnNewButton_7_1 = new JButton(calendarBackBtn);
	    btnNewButton_7_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mousePressed(MouseEvent e) {
	    		btnNewButton_7_1.setIcon(calendarBackBtnPressed);
	    	}
	    	@Override
	    	public void mouseReleased(MouseEvent e) {
	    		btnNewButton_7_1.setIcon(calendarBackBtn);
	    	}
	    });
	    btnNewButton_7_1.setOpaque(false);
	    btnNewButton_7_1.setContentAreaFilled(false);
	    btnNewButton_7_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String currentViewedMonth = monthTitle.getText();
	    		if(currentViewedMonth.equals("January")) {monthTitle.setText("December");
	    		
	    		  	String yearToFormat = lblNewLabel_1_1.getText();
	    	        yearToFormat = yearToFormat.replace("<html> ", "");
	    	        yearToFormat = yearToFormat.replace(" &nbsp; &nbsp; </html>", "");
	    	        
	    		int yearFormatter = Integer.valueOf(yearToFormat);
	    		lblNewLabel_1_1.setText(String.valueOf("<html> " + (yearFormatter - 1) + " &nbsp; &nbsp; </html>"));
	    		
	    		
	    		
	    		}
	    		if(currentViewedMonth.equals("Feburary")) {monthTitle.setText("January"); lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Spring </html>");}
	    		if(currentViewedMonth.equals("March")) {monthTitle.setText("Feburary");}
	    		if(currentViewedMonth.equals("April")) {monthTitle.setText("March");}
	    		if(currentViewedMonth.equals("May")) {monthTitle.setText("April"); lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Summer </html>"); }
	    		if(currentViewedMonth.equals("June")) {monthTitle.setText("May");}
	    		if(currentViewedMonth.equals("July")) {monthTitle.setText("June");}
	    		if(currentViewedMonth.equals("August")) {monthTitle.setText("July"); lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Fall </html>");}
	    		if(currentViewedMonth.equals("September")) {monthTitle.setText("August");}
	    		if(currentViewedMonth.equals("October")) {monthTitle.setText("September");}
	    		if(currentViewedMonth.equals("November")) {monthTitle.setText("October"); lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Winter </html>");}
	    		if(currentViewedMonth.equals("December")) {monthTitle.setText("November");}

	    		
	    		String newMonth = monthTitle.getText();
	    		
	    		
	    		
	    		
	    		 Calendar cal = Calendar.getInstance();
	    	        if(newMonth.equals("January")) {
	    	        cal.set(Calendar.MONTH, Calendar.JANUARY);
	    	        }
	    	        if(newMonth.equals("Feburary")) {
	    	        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
	    	        }
	    	        if(newMonth.equals("March")) {
	    	        cal.set(Calendar.MONTH, Calendar.MARCH);
	    	        }
	    	        if(newMonth.equals("April")) {
	    	        cal.set(Calendar.MONTH, Calendar.APRIL);
	    	        }
	    	        if(newMonth.equals("May")) {
	    	        cal.set(Calendar.MONTH, Calendar.MAY);
	    	        }
	    	        if(newMonth.equals("June")) {
	    	        cal.set(Calendar.MONTH, Calendar.JUNE);
	    	        }
	    	        if(newMonth.equals("July")) {
	    	        cal.set(Calendar.MONTH, Calendar.JULY);
	    	        }
	    	        if(newMonth.equals("August")) {
	    	        cal.set(Calendar.MONTH, Calendar.AUGUST);
	    	        }
	    	        if(newMonth.equals("September")) {
	    	        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
	    	        }
	    	        if(newMonth.equals("October")) {
	    	        cal.set(Calendar.MONTH, Calendar.OCTOBER);
	    	        }
	    	        if(newMonth.equals("November")) {
	    	        cal.set(Calendar.MONTH, Calendar.NOVEMBER);
	    	        }
	    	        if(newMonth.equals("December")) {
	    	        cal.set(Calendar.MONTH, Calendar.DECEMBER);
	    	        }
	    	        
	    	        String yearToFormat = lblNewLabel_1_1.getText();
	    	        yearToFormat = yearToFormat.replace("<html> ", "");
	    	        yearToFormat = yearToFormat.replace(" &nbsp; &nbsp; </html>", "");
	    	        int yearForSystem = Integer.valueOf(yearToFormat);
	    	        cal.set(Calendar.YEAR, yearForSystem);

	    	        cal.set(Calendar.DAY_OF_MONTH, 1);
	    	        Date firstDayOfMonth = cal.getTime();
	    	        
	    	        DateFormat sdf = new SimpleDateFormat("EEEEEEEE");   
	    	        System.out.println("First Day of Month: " + sdf.format(firstDayOfMonth)); 
	    	        
	    	        String currentMonth = sdf.format(firstDayOfMonth).toString();
	    	        System.out.println("currentMonth " + currentMonth);
	    	        
	    	        int day = 1;
	    	        if(currentMonth.equals("Monday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setText(String.valueOf(day));
	    	        	day++;
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setVisible(false); 
	    	        	F5.setVisible(false);
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false); 
	    	        }
	    	        if(currentMonth.equals("Tuesday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setVisible(false);
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false); 
	    	        	
	    	        	
	    	        	
	    	        }
	    	        if(currentMonth.equals("Wednesday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Thursday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        	
	    	        }
	    	        if(currentMonth.equals("Friday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setVisible(false);
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su6.setText(String.valueOf(day));
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Saturday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setVisible(false);
	    	        	F1.setVisible(false);
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su6.setText(String.valueOf(day));
	    	        	day++;
	    	        	M6.setText(String.valueOf(day));
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Sunday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setText(String.valueOf(day));
	    	        	day++;
	    	        	M1.setText(String.valueOf(day));
	    	        	day++;
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setVisible(false);
	    	        	day++;
	    	        	Tr5.setVisible(false);
	    	        	day++;
	    	        	F5.setVisible(false);
	    	        	day++;
	    	        	S5.setVisible(false);
	    	        	day++;
	    	        	Su6.setVisible(false);
	    	        	day++;
	    	        	M6.setVisible(false);
	    	        	day++;
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    		
	    	        
	    	        Su1.setSelected(false);
		    		Su2.setSelected(false);
		    		Su3.setSelected(false);
		    		Su4.setSelected(false);
		    		Su5.setSelected(false);
		    		Su6.setSelected(false);
		    		M1.setSelected(false);
		    		M2.setSelected(false);
		    		M3.setSelected(false);
		    		M4.setSelected(false);
		    		M5.setSelected(false);
		    		M6.setSelected(false);
		    		T1.setSelected(false);
		    		T2.setSelected(false);
		    		T3.setSelected(false);
		    		T4.setSelected(false);
		    		T5.setSelected(false);
		    		T6.setSelected(false);
		    		W1.setSelected(false);
		    		W2.setSelected(false);
		    		W3.setSelected(false);
		    		W4.setSelected(false);
		    		W5.setSelected(false);
		    		W6.setSelected(false);
		    		Tr1.setSelected(false);
		    		Tr2.setSelected(false);
		    		Tr3.setSelected(false);
		    		Tr4.setSelected(false);
		    		Tr5.setSelected(false);
		    		Tr6.setSelected(false);
		    		F1.setSelected(false);
		    		F2.setSelected(false);
		    		F3.setSelected(false);
		    		F4.setSelected(false);
		    		F5.setSelected(false);
		    		F6.setSelected(false);
		    		S1.setSelected(false);
		    		S2.setSelected(false);
		    		S3.setSelected(false);
		    		S4.setSelected(false);
		    		S5.setSelected(false);
		    		S6.setSelected(false);
		    		
	    	}
	    });
	    
	    
	    JLabel lblNewLabel_1_1_2_1 = new JLabel("T");
	    lblNewLabel_1_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JLabel lblNewLabel_1_1_2_1_1 = new JLabel("W");
	    lblNewLabel_1_1_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Th");
	    lblNewLabel_1_1_2_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel("F");
	    lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JLabel lblNewLabel_1_1_2_1_1_1_1_1 = new JLabel("S");
	    lblNewLabel_1_1_2_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JLabel lblNewLabel_1_1_2_1_1_1_1_1_1 = new JLabel("Su");
	    lblNewLabel_1_1_2_1_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    GroupLayout gl_panel_13 = new GroupLayout(panel_13);
	    gl_panel_13.setHorizontalGroup(
	    	gl_panel_13.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_13.createSequentialGroup()
	    			.addGroup(gl_panel_13.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_16, GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
	    				.addGroup(gl_panel_13.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_panel_13.createParallelGroup(Alignment.TRAILING)
	    						.addComponent(btnNewButton_7_1)
	    						.addComponent(lblNewLabel_1_1_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
	    					.addGroup(gl_panel_13.createParallelGroup(Alignment.TRAILING)
	    						.addGroup(gl_panel_13.createSequentialGroup()
	    							.addGap(143)
	    							.addComponent(lblNewLabel_1_1_2)
	    							.addGap(164)
	    							.addComponent(lblNewLabel_1_1_2_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	    							.addGap(157)
	    							.addComponent(lblNewLabel_1_1_2_1_1)
	    							.addGap(160)
	    							.addComponent(lblNewLabel_1_1_2_1_1_1)
	    							.addGap(166)
	    							.addComponent(lblNewLabel_1_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
	    							.addComponent(lblNewLabel_1_1_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
	    							.addGap(22))
	    						.addGroup(gl_panel_13.createSequentialGroup()
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(btnNewButton_7)
	    							.addGap(12))))
	    				.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 1121, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_panel_13.setVerticalGroup(
	    	gl_panel_13.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_13.createSequentialGroup()
	    			.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
	    			.addGroup(gl_panel_13.createParallelGroup(Alignment.TRAILING, false)
	    				.addComponent(btnNewButton_7_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addComponent(btnNewButton_7, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
	    			.addGap(18)
	    			.addGroup(gl_panel_13.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_1_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_1_1_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_1_1_2)
	    				.addComponent(lblNewLabel_1_1_2_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_1_1_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_1_1_2_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
	    );
	    panel_14.setLayout(new GridLayout(6, 7, 120, 0));
	    
	   
	    

	    

	    

	    

	    
	    panel_13.setLayout(gl_panel_13);
	    calendarPanel.setLayout(gl_calendarPanel);
	    
	    KGradientPanel activityPanel = new KGradientPanel();
	    activityPanel.setkEndColor(new Color(248, 248, 255));
	    activityPanel.setkStartColor(new Color(248, 248, 255));
	    activityPanel.kStartColor = new Color(248, 248, 255);
	    activityPanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(activityPanel, "name_520951959855600");
	    
	    JList list_1 = new JList();
	    list_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JTextPane textPane_12 = new JTextPane();
	    textPane_12.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JTextPane textPane_12_1 = new JTextPane();
	    textPane_12_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JList list_1_1 = new JList();
	    list_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    
	    KGradientPanel analysisPanel = new KGradientPanel();
	    analysisPanel.setkEndColor(new Color(248, 248, 255));
	    analysisPanel.setkStartColor(new Color(248, 248, 255));
	    analysisPanel.kStartColor = new Color(248, 248, 255);
	    analysisPanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(analysisPanel, "name_622065650451300");
	    
	    JList list_5 = new JList();
	    list_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JTextPane textPane_18 = new JTextPane();
	    textPane_18.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    GroupLayout gl_analysisPanel = new GroupLayout(analysisPanel);
	    gl_analysisPanel.setHorizontalGroup(
	    	gl_analysisPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_analysisPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(list_5, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(textPane_18, GroupLayout.PREFERRED_SIZE, 726, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(39, Short.MAX_VALUE))
	    );
	    gl_analysisPanel.setVerticalGroup(
	    	gl_analysisPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_analysisPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_analysisPanel.createParallelGroup(Alignment.TRAILING, false)
	    				.addComponent(textPane_18, Alignment.LEADING)
	    				.addComponent(list_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
	    			.addContainerGap(12, Short.MAX_VALUE))
	    );
	    analysisPanel.setLayout(gl_analysisPanel);
	    
	    JButton btnNewButton_45 = new JButton("Analysis");
	    btnNewButton_45.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(analysisPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    
	    JLabel lblAbsences_1 = new JLabel("Absences");
	    lblAbsences_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblAbsences_1_1 = new JLabel("Warnings");
	    lblAbsences_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblAbsences_1_1_1 = new JLabel("Accolades");
	    lblAbsences_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblAbsences_1_1_1_1 = new JLabel("Total Members");
	    lblAbsences_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblAbsences_1_1_1_1_1 = new JLabel("Events");
	    lblAbsences_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblAbsences_1_1_1_1_1_1 = new JLabel("Polls");
	    lblAbsences_1_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblAbsences_1_2 = new JLabel("Avg. Participation");
	    lblAbsences_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblAbsences_1_2_1 = new JLabel("Avg. Events/Month");
	    lblAbsences_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblAbsences_1_2_1_1 = new JLabel("Avg. Poll/Month");
	    lblAbsences_1_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    GroupLayout gl_activityPanel = new GroupLayout(activityPanel);
	    gl_activityPanel.setHorizontalGroup(
	    	gl_activityPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_activityPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_activityPanel.createParallelGroup(Alignment.LEADING, false)
	    				.addComponent(list_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addGroup(gl_activityPanel.createSequentialGroup()
	    					.addComponent(btnNewButton_45)
	    					.addGap(177)
	    					.addGroup(gl_activityPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblAbsences_1)
	    						.addComponent(lblAbsences_1_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblAbsences_1_1_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
	    					.addGap(159)
	    					.addGroup(gl_activityPanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblAbsences_1_1_1_1)
	    						.addComponent(lblAbsences_1_1_1_1_1)
	    						.addComponent(lblAbsences_1_1_1_1_1_1)))
	    				.addComponent(list_1_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_activityPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textPane_12_1, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textPane_12, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblAbsences_1_2_1)
	    				.addComponent(lblAbsences_1_2)
	    				.addComponent(lblAbsences_1_2_1_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    gl_activityPanel.setVerticalGroup(
	    	gl_activityPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_activityPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_activityPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textPane_12, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
	    				.addComponent(list_1, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_activityPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textPane_12_1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(list_1_1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_activityPanel.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_activityPanel.createSequentialGroup()
	    					.addGroup(gl_activityPanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(btnNewButton_45, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblAbsences_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblAbsences_1_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_activityPanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_activityPanel.createSequentialGroup()
	    							.addComponent(lblAbsences_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    							.addGap(18)
	    							.addComponent(lblAbsences_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    						.addGroup(gl_activityPanel.createSequentialGroup()
	    							.addComponent(lblAbsences_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    							.addGap(18)
	    							.addComponent(lblAbsences_1_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))))
	    				.addGroup(gl_activityPanel.createSequentialGroup()
	    					.addComponent(lblAbsences_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    					.addGap(18)
	    					.addComponent(lblAbsences_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    					.addGap(18)
	    					.addComponent(lblAbsences_1_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
	    			.addGap(35))
	    );
	    activityPanel.setLayout(gl_activityPanel);
	    
	    KGradientPanel noticeBoardPanel = new KGradientPanel();
	    noticeBoardPanel.setkEndColor(new Color(248, 248, 255));
	    noticeBoardPanel.setkStartColor(new Color(248, 248, 255));
	    noticeBoardPanel.kStartColor = new Color(248, 248, 255);
	    noticeBoardPanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(noticeBoardPanel, "name_521461006106400");
	    
	    JPanel panel_17 = new JPanel();
	    panel_17.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(0, 0, 0)));
	    
	    JLabel lblOption = new JLabel("Option 1");
	    lblOption.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblOption_2 = new JLabel("Option 2");
	    lblOption_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblOption_2_1 = new JLabel("Create a Notice");
	    lblOption_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
	    
	    JComboBox<String> comboBox_7 = new JComboBox<String>();
	    comboBox_7.addItem("Option 1");
	    comboBox_7.addItem("Option 2");
	    JTextArea textArea_4 = new JTextArea();
	    textArea_4.setText("Details...");
	    textArea_4.setForeground(Color.LIGHT_GRAY);
	    textArea_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    textArea_4.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = textArea_4.getText();
	            if(text.equals("Details...")) {
	            	textArea_4.setText("");
	            	textArea_4.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    
	    JButton btnNewButton_46 = new JButton("Post");
	    GroupLayout gl_noticeBoardPanel = new GroupLayout(noticeBoardPanel);
	    gl_noticeBoardPanel.setHorizontalGroup(
	    	gl_noticeBoardPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_noticeBoardPanel.createSequentialGroup()
	    			.addGroup(gl_noticeBoardPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_noticeBoardPanel.createSequentialGroup()
	    					.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 914, GroupLayout.PREFERRED_SIZE)
	    					.addGroup(gl_noticeBoardPanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_noticeBoardPanel.createSequentialGroup()
	    							.addGap(40)
	    							.addComponent(lblOption_2_1))
	    						.addGroup(gl_noticeBoardPanel.createSequentialGroup()
	    							.addPreferredGap(ComponentPlacement.UNRELATED)
	    							.addGroup(gl_noticeBoardPanel.createParallelGroup(Alignment.TRAILING)
	    								.addComponent(textArea_4, Alignment.LEADING)
	    								.addGroup(Alignment.LEADING, gl_noticeBoardPanel.createParallelGroup(Alignment.LEADING, false)
	    									.addComponent(comboBox_7, 0, 187, Short.MAX_VALUE)
	    									.addComponent(btnNewButton_46, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
	    				.addGroup(gl_noticeBoardPanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(lblOption, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
	    					.addGap(379)
	    					.addComponent(lblOption_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(38, Short.MAX_VALUE))
	    );
	    gl_noticeBoardPanel.setVerticalGroup(
	    	gl_noticeBoardPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_noticeBoardPanel.createSequentialGroup()
	    			.addGap(27)
	    			.addGroup(gl_noticeBoardPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblOption, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblOption_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_noticeBoardPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_noticeBoardPanel.createSequentialGroup()
	    					.addComponent(lblOption_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    					.addGap(14)
	    					.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textArea_4, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(btnNewButton_46)
	    					.addContainerGap())
	    				.addComponent(panel_17, GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)))
	    );
	    panel_17.setLayout(new GridLayout(1, 0, 0, 0));
	    
	    JPanel panel_18 = new JPanel();
	    panel_17.add(panel_18);
	    
	    JTextPane textPane_13_1_1 = new JTextPane();
	    
	    JPanel panel_20 = new JPanel();
	    GroupLayout gl_panel_18 = new GroupLayout(panel_18);
	    gl_panel_18.setHorizontalGroup(
	    	gl_panel_18.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_18.createSequentialGroup()
	    			.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(textPane_13_1_1, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
	    );
	    gl_panel_18.setVerticalGroup(
	    	gl_panel_18.createParallelGroup(Alignment.LEADING)
	    		.addComponent(panel_20, GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
	    		.addComponent(textPane_13_1_1, GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
	    );
	    panel_20.setLayout(new GridLayout(1, 0, 0, 0));
	    
	    JTextPane textPane_13 = new JTextPane();
	    panel_20.add(textPane_13);
	    
	    JTextPane textPane_14 = new JTextPane();
	    panel_20.add(textPane_14);
	    panel_18.setLayout(gl_panel_18);
	    
	    JPanel panel_18_1 = new JPanel();
	    panel_17.add(panel_18_1);
	    
	    JPanel panel_20_1 = new JPanel();
	    panel_20_1.setLayout(new GridLayout(1, 0, 0, 0));
	    
	    JTextPane textPane_13_1 = new JTextPane();
	    textPane_13_1.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
	    panel_20_1.add(textPane_13_1);
	    
	    JTextPane textPane_14_1 = new JTextPane();
	    panel_20_1.add(textPane_14_1);
	    
	    JTextPane textPane_13_1_1_1 = new JTextPane();
	    GroupLayout gl_panel_18_1 = new GroupLayout(panel_18_1);
	    gl_panel_18_1.setHorizontalGroup(
	    	gl_panel_18_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_18_1.createSequentialGroup()
	    			.addComponent(panel_20_1, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(textPane_13_1_1_1, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
	    );
	    gl_panel_18_1.setVerticalGroup(
	    	gl_panel_18_1.createParallelGroup(Alignment.LEADING)
	    		.addComponent(panel_20_1, GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
	    		.addComponent(textPane_13_1_1_1, GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
	    );
	    panel_18_1.setLayout(gl_panel_18_1);
	    noticeBoardPanel.setLayout(gl_noticeBoardPanel);
	    
	    KGradientPanel alertPanel = new KGradientPanel();
	    alertPanel.setkEndColor(new Color(248, 248, 255));
	    alertPanel.setkStartColor(new Color(248, 248, 255));
	    alertPanel.kStartColor = new Color(248, 248, 255);
	    alertPanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(alertPanel, "name_522258982411000");
	    
	    JTextPane textPane_15 = new JTextPane();
	    
	    textField_22 = new JTextField();
	    textField_22.setColumns(10);
	    GroupLayout gl_alertPanel = new GroupLayout(alertPanel);
	    gl_alertPanel.setHorizontalGroup(
	    	gl_alertPanel.createParallelGroup(Alignment.TRAILING)
	    		.addComponent(textPane_15, GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
	    		.addGroup(Alignment.LEADING, gl_alertPanel.createSequentialGroup()
	    			.addGap(10)
	    			.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 1097, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    gl_alertPanel.setVerticalGroup(
	    	gl_alertPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_alertPanel.createSequentialGroup()
	    			.addComponent(textPane_15, GroupLayout.PREFERRED_SIZE, 602, GroupLayout.PREFERRED_SIZE)
	    			.addGap(46)
	    			.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(21, Short.MAX_VALUE))
	    );
	    alertPanel.setLayout(gl_alertPanel);
	    
	    KGradientPanel massEditPanel = new KGradientPanel();
	    massEditPanel.setkEndColor(new Color(248, 248, 255));
	    massEditPanel.setkStartColor(new Color(248, 248, 255));
	    massEditPanel.kStartColor = new Color(248, 248, 255);
	    massEditPanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(massEditPanel, "name_522479831800400");
	    
	    JLabel lblTarget_2 = new JLabel("Target:");
	    lblTarget_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_23 = new JTextField();
	    textField_23.setColumns(10);
	    
	    JLabel lblTarget_2_1 = new JLabel("List of Targeted Members");
	    lblTarget_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JTextPane textPane_16 = new JTextPane();
	    textPane_16.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    JPanel panel_19 = new JPanel();
	    panel_19.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JPanel panel_21 = new JPanel();
	    
	    JList list_2 = new JList();
	    list_2.setBorder(new LineBorder(new Color(0, 0, 0)));
	    
	    JButton btnNewButton_55 = new JButton("Delete");
	    
	    JButton btnNewButton_55_1 = new JButton("Edit");
	    
	    JPanel panel_25_4 = new JPanel();
	    panel_25_4.setBackground(new Color(32, 178, 170, 0));
	    panel_25_4.setLayout(new BorderLayout(0, 0));
	    GroupLayout gl_massEditPanel = new GroupLayout(massEditPanel);
	    gl_massEditPanel.setHorizontalGroup(
	    	gl_massEditPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_massEditPanel.createSequentialGroup()
	    			.addGroup(gl_massEditPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_massEditPanel.createSequentialGroup()
	    					.addGroup(gl_massEditPanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_massEditPanel.createSequentialGroup()
	    							.addContainerGap()
	    							.addComponent(textPane_16, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
	    							.addGap(18)
	    							.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE))
	    						.addGroup(gl_massEditPanel.createSequentialGroup()
	    							.addGap(43)
	    							.addComponent(lblTarget_2_1)))
	    					.addGap(18)
	    					.addGroup(gl_massEditPanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_massEditPanel.createSequentialGroup()
	    							.addComponent(btnNewButton_55_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(btnNewButton_55))
	    						.addGroup(gl_massEditPanel.createParallelGroup(Alignment.TRAILING, false)
	    							.addComponent(panel_21, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    							.addComponent(list_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))))
	    				.addGroup(gl_massEditPanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(lblTarget_2)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(panel_25_4, GroupLayout.PREFERRED_SIZE, 1122, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(27, Short.MAX_VALUE))
	    );
	    gl_massEditPanel.setVerticalGroup(
	    	gl_massEditPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_massEditPanel.createSequentialGroup()
	    			.addComponent(panel_25_4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_massEditPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTarget_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(30)
	    			.addGroup(gl_massEditPanel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(btnNewButton_55)
	    				.addComponent(btnNewButton_55_1)
	    				.addComponent(lblTarget_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_massEditPanel.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_massEditPanel.createSequentialGroup()
	    					.addComponent(list_2, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textPane_16, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(90, Short.MAX_VALUE))
	    );
	    
	    JLabel lblNewLabel_1_5 = new JLabel("Mass Edit", SwingConstants.CENTER);
	    lblNewLabel_1_5.setFont(new Font("Segoe UI Black", Font.PLAIN, 21));
	    panel_25_4.add(lblNewLabel_1_5, BorderLayout.CENTER);
	    panel_19.setLayout(new CardLayout(0, 0));
	    
	    JPanel roleMultipleEdit = new JPanel();
	    panel_19.add(roleMultipleEdit, "name_523277438714700");
	    
	    JLabel lblTarget_2_1_1 = new JLabel("New Role");
	    lblTarget_2_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JComboBox comboBox_8 = new JComboBox();
	    
	    JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Unique");
	    
	    textField_24 = new JTextField();
	    textField_24.setColumns(10);
	    
	    JCheckBox chckbxNewCheckBox_8_1 = new JCheckBox("Notify Members");
	    
	    JButton btnNewButton_54 = new JButton("Submit");
	    GroupLayout gl_roleMultipleEdit = new GroupLayout(roleMultipleEdit);
	    gl_roleMultipleEdit.setHorizontalGroup(
	    	gl_roleMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_roleMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_roleMultipleEdit.createParallelGroup(Alignment.TRAILING, false)
	    				.addComponent(btnNewButton_54, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    				.addGroup(Alignment.LEADING, gl_roleMultipleEdit.createSequentialGroup()
	    					.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(chckbxNewCheckBox_8)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(lblTarget_2_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(chckbxNewCheckBox_8_1, Alignment.LEADING))
	    			.addContainerGap(42, Short.MAX_VALUE))
	    );
	    gl_roleMultipleEdit.setVerticalGroup(
	    	gl_roleMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_roleMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTarget_2_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_roleMultipleEdit.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(chckbxNewCheckBox_8)
	    				.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(chckbxNewCheckBox_8_1)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(btnNewButton_54, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(419, Short.MAX_VALUE))
	    );
	    roleMultipleEdit.setLayout(gl_roleMultipleEdit);
	    
	    JPanel notesMultipleEdit = new JPanel();
	    panel_19.add(notesMultipleEdit, "name_523279410312500");
	    
	    JLabel lblTarget_2_1_2 = new JLabel("Notes");
	    lblTarget_2_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_25 = new JTextField();
	    textField_25.setColumns(10);
	    
	    JLabel lblTarget_2_1_2_1 = new JLabel("Date");
	    lblTarget_2_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_26 = new JTextField();
	    textField_26.setColumns(10);
	    textField_26.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_26 = (JTextField) e.getSource();
	  		    String text = textField_26.getText();
	  		  textField_26.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_26.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_26.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_26.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Notify Member");
	    
	    JButton btnNewButton_56 = new JButton("Submit");
	    GroupLayout gl_notesMultipleEdit = new GroupLayout(notesMultipleEdit);
	    gl_notesMultipleEdit.setHorizontalGroup(
	    	gl_notesMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_notesMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_notesMultipleEdit.createParallelGroup(Alignment.LEADING)
	    				.addComponent(chckbxNewCheckBox_9)
	    				.addComponent(textField_25, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
	    				.addComponent(lblTarget_2_1_2)
	    				.addComponent(lblTarget_2_1_2_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_56, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_notesMultipleEdit.setVerticalGroup(
	    	gl_notesMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_notesMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTarget_2_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(lblTarget_2_1_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(chckbxNewCheckBox_9)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(btnNewButton_56)
	    			.addContainerGap(297, Short.MAX_VALUE))
	    );
	    notesMultipleEdit.setLayout(gl_notesMultipleEdit);
	    
	    JPanel startingDateMultipleEdit = new JPanel();
	    panel_19.add(startingDateMultipleEdit, "name_523281460169300");
	    
	    JLabel lblTarget_2_1_2_2 = new JLabel("New Date");
	    lblTarget_2_1_2_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_27 = new JTextField();
	    textField_27.setColumns(10);
	    textField_27.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_27 = (JTextField) e.getSource();
	  		    String text = textField_27.getText();
	  		  textField_27.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_27.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_27.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_27.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JLabel lblTarget_2_1_2_2_1 = new JLabel("Details");
	    lblTarget_2_1_2_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_28 = new JTextField();
	    textField_28.setColumns(10);
	    
	    JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Notify Members");
	    
	    JButton btnNewButton_57 = new JButton("Submit");
	    GroupLayout gl_startingDateMultipleEdit = new GroupLayout(startingDateMultipleEdit);
	    gl_startingDateMultipleEdit.setHorizontalGroup(
	    	gl_startingDateMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_startingDateMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_startingDateMultipleEdit.createParallelGroup(Alignment.LEADING)
	    				.addComponent(chckbxNewCheckBox_10)
	    				.addComponent(textField_28, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
	    				.addComponent(lblTarget_2_1_2_2)
	    				.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblTarget_2_1_2_2_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_57, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_startingDateMultipleEdit.setVerticalGroup(
	    	gl_startingDateMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_startingDateMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTarget_2_1_2_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(lblTarget_2_1_2_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(chckbxNewCheckBox_10)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(btnNewButton_57)
	    			.addContainerGap(297, Short.MAX_VALUE))
	    );
	    startingDateMultipleEdit.setLayout(gl_startingDateMultipleEdit);
	    
	    JPanel accoldateMultipleEdit = new JPanel();
	    panel_19.add(accoldateMultipleEdit, "name_523283704372000");
	    
	    JLabel A = new JLabel("Accolade");
	    A.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_29 = new JTextField();
	    textField_29.setColumns(10);
	    
	    textField_30 = new JTextField();
	    textField_30.setColumns(10);
	    textField_30.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_30 = (JTextField) e.getSource();
	  		    String text = textField_30.getText();
	  		  textField_30.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_30.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_30.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_30.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JLabel lblDate = new JLabel("Date");
	    lblDate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Notify");
	    
	    JButton btnNewButton_58 = new JButton("New button");
	    GroupLayout gl_accoldateMultipleEdit = new GroupLayout(accoldateMultipleEdit);
	    gl_accoldateMultipleEdit.setHorizontalGroup(
	    	gl_accoldateMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_accoldateMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_accoldateMultipleEdit.createParallelGroup(Alignment.LEADING)
	    				.addComponent(chckbxNewCheckBox_11)
	    				.addComponent(textField_29, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
	    				.addComponent(A, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_58, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_accoldateMultipleEdit.setVerticalGroup(
	    	gl_accoldateMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_accoldateMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(A, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addGap(4)
	    			.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(chckbxNewCheckBox_11)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(btnNewButton_58)
	    			.addContainerGap(306, Short.MAX_VALUE))
	    );
	    accoldateMultipleEdit.setLayout(gl_accoldateMultipleEdit);
	    
	    JPanel partitionMultipleEdit = new JPanel();
	    panel_19.add(partitionMultipleEdit, "name_523286416029500");
	    
	    JComboBox comboBox_9 = new JComboBox();
	    
	    JLabel lblTarget_2_1_3 = new JLabel("Select new partition");
	    lblTarget_2_1_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_2_1_3_1 = new JLabel("Details");
	    lblTarget_2_1_3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_31 = new JTextField();
	    textField_31.setColumns(10);
	    
	    JCheckBox chckbxNewCheckBox_12 = new JCheckBox("Notify");
	    
	    JButton btnNewButton_59 = new JButton("Submit");
	    GroupLayout gl_partitionMultipleEdit = new GroupLayout(partitionMultipleEdit);
	    gl_partitionMultipleEdit.setHorizontalGroup(
	    	gl_partitionMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_partitionMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_partitionMultipleEdit.createParallelGroup(Alignment.LEADING)
	    				.addComponent(chckbxNewCheckBox_12)
	    				.addComponent(textField_31, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
	    				.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblTarget_2_1_3)
	    				.addComponent(lblTarget_2_1_3_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_59, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    gl_partitionMultipleEdit.setVerticalGroup(
	    	gl_partitionMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_partitionMultipleEdit.createSequentialGroup()
	    			.addGap(15)
	    			.addComponent(lblTarget_2_1_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(lblTarget_2_1_3_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(chckbxNewCheckBox_12)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(btnNewButton_59)
	    			.addContainerGap(298, Short.MAX_VALUE))
	    );
	    partitionMultipleEdit.setLayout(gl_partitionMultipleEdit);
	    
	    JPanel warningMultipleEdit = new JPanel();
	    panel_19.add(warningMultipleEdit, "name_523288565697700");
	    
	    JLabel lblWarning = new JLabel("Warning");
	    lblWarning.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_32 = new JTextField();
	    textField_32.setColumns(10);
	    
	    JLabel lblDate_1 = new JLabel("Date");
	    lblDate_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_33 = new JTextField();
	    textField_33.setColumns(10);
	    textField_33.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_33 = (JTextField) e.getSource();
	  		    String text = textField_33.getText();
	  		  textField_33.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_33.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_33.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_33.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JCheckBox chckbxNewCheckBox_11_1 = new JCheckBox("Notify");
	    
	    JButton btnNewButton_58_1 = new JButton("New button");
	    GroupLayout gl_warningMultipleEdit = new GroupLayout(warningMultipleEdit);
	    gl_warningMultipleEdit.setHorizontalGroup(
	    	gl_warningMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_warningMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_warningMultipleEdit.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblWarning, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblDate_1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(chckbxNewCheckBox_11_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_58_1, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    gl_warningMultipleEdit.setVerticalGroup(
	    	gl_warningMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_warningMultipleEdit.createSequentialGroup()
	    			.addComponent(lblWarning, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(11)
	    			.addComponent(lblDate_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addGap(4)
	    			.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(chckbxNewCheckBox_11_1)
	    			.addGap(7)
	    			.addComponent(btnNewButton_58_1)
	    			.addContainerGap(317, Short.MAX_VALUE))
	    );
	    warningMultipleEdit.setLayout(gl_warningMultipleEdit);
	    
	    JPanel rankMultipleEdit = new JPanel();
	    panel_19.add(rankMultipleEdit, "name_523290715227300");
	    
	    JLabel lblTarget_2_1_4 = new JLabel("Select new rank");
	    lblTarget_2_1_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JComboBox comboBox_10 = new JComboBox();
	    
	    JCheckBox chckbxNewCheckBox_13 = new JCheckBox("Unique");
	    
	    textField_34 = new JTextField();
	    textField_34.setColumns(10);
	    
	    JLabel lblTarget_2_1_4_1 = new JLabel("Date");
	    lblTarget_2_1_4_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_35 = new JTextField();
	    textField_35.setColumns(10);
	    textField_35.addKeyListener(new KeyAdapter() {

	        public void keyTyped(KeyEvent e) {
	        	
	        	char key=e.getKeyChar();
	        	int k=key;
	        	
	        	if(k==KeyEvent.VK_BACK_SPACE)
	        	{
	        		System.out.println("BACKSPACE");
	        	} else {
	        	char keyCode = e.getKeyChar();
	        	String keyCodeStr = Character.toString(keyCode);
	        	JTextField textField_35 = (JTextField) e.getSource();
	  		    String text = textField_35.getText();
	  		  textField_35.setText(text.toUpperCase());
	  		    
	  		    
	  		    int size = text.length();
	  		    System.out.println("Size: " + size);
	  		    int counter = 0;
	  		    if(size == 2) {
	  		    	textField_35.setText(text + "/");
	  		    }
	  		    if(size == 5) {
	  		    	textField_35.setText(text + "/");
	  		    } 
	        	if(size > 7) {
	        		text = text.substring(0, text.length() - 1);
	        		textField_35.setText(text);
	        	}
	        		    
	        		    
	        		
	        }
       
	        }

	        public void keyPressed(KeyEvent e) {
	        	System.out.println("PRESSED");
	        }
	      });
	    
	    JButton btnNewButton_60 = new JButton("New button");
	    
	    JToggleButton tglbtnNewToggleButton = new JToggleButton("General Promotion");
	    
	    JToggleButton tglbtnGeneralDemotion = new JToggleButton("General Demotion");
	    
	    JToggleButton tglbtnSubmit = new JToggleButton("Submit");
	    GroupLayout gl_rankMultipleEdit = new GroupLayout(rankMultipleEdit);
	    gl_rankMultipleEdit.setHorizontalGroup(
	    	gl_rankMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_rankMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_rankMultipleEdit.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_rankMultipleEdit.createSequentialGroup()
	    					.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(chckbxNewCheckBox_13)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField_34, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
	    				.addComponent(lblTarget_2_1_4, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblTarget_2_1_4_1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_60, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
	    				.addComponent(tglbtnSubmit, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
	    				.addGroup(gl_rankMultipleEdit.createSequentialGroup()
	    					.addGap(44)
	    					.addComponent(tglbtnGeneralDemotion)
	    					.addGap(140)
	    					.addComponent(tglbtnNewToggleButton)))
	    			.addContainerGap())
	    );
	    gl_rankMultipleEdit.setVerticalGroup(
	    	gl_rankMultipleEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_rankMultipleEdit.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTarget_2_1_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_rankMultipleEdit.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(chckbxNewCheckBox_13)
	    				.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(lblTarget_2_1_4_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(btnNewButton_60)
	    			.addGap(105)
	    			.addGroup(gl_rankMultipleEdit.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(tglbtnNewToggleButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(tglbtnGeneralDemotion, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(tglbtnSubmit)
	    			.addContainerGap(174, Short.MAX_VALUE))
	    );
	    rankMultipleEdit.setLayout(gl_rankMultipleEdit);
	    
	    JPanel panel_29 = new JPanel();
	    panel_19.add(panel_29, "name_523292783420500");
	    panel_29.setLayout(new BorderLayout(0, 0));
	    
	    JLabel lblTarget_2_1_6 = new JLabel("Select a Function to The Right", SwingConstants.CENTER);
	    lblTarget_2_1_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	    panel_29.add(lblTarget_2_1_6, BorderLayout.CENTER);
	    panel_21.setLayout(new GridLayout(4, 2, 0, 0));
	    
	    JButton btnNewButton_47 = new JButton("Role");
	    btnNewButton_47.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	     		panel_19.removeAll();
	    		panel_19.add(roleMultipleEdit);
	    		panel_19.repaint();
	    		panel_19.revalidate();
	     
	    	}
	    });
	    panel_21.add(btnNewButton_47);
	    
	    JButton btnNewButton_52 = new JButton("Notes");
	    btnNewButton_52.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	     		panel_19.removeAll();
	    		panel_19.add(notesMultipleEdit);
	    		panel_19.repaint();
	    		panel_19.revalidate();
	    	}
	    });
	    panel_21.add(btnNewButton_52);
	    
	    JButton btnNewButton_48 = new JButton("Starting Date");
	    btnNewButton_48.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	     		panel_19.removeAll();
	    		panel_19.add(startingDateMultipleEdit);
	    		panel_19.repaint();
	    		panel_19.revalidate();
	    	}
	    });
	    panel_21.add(btnNewButton_48);
	    
	    JButton btnNewButton_51 = new JButton("Accolade");
	    btnNewButton_51.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	     		panel_19.removeAll();
	    		panel_19.add(accoldateMultipleEdit);
	    		panel_19.repaint();
	    		panel_19.revalidate();
	    	}
	    });
	    panel_21.add(btnNewButton_51);
	    
	    JButton btnNewButton_50 = new JButton("Partition");
	    btnNewButton_50.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	     		panel_19.removeAll();
	    		panel_19.add(partitionMultipleEdit);
	    		panel_19.repaint();
	    		panel_19.revalidate();
	    	}
	    });
	    panel_21.add(btnNewButton_50);
	    
	    JButton btnNewButton_49 = new JButton("Warning");
	    btnNewButton_49.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	     		panel_19.removeAll();
	    		panel_19.add(warningMultipleEdit);
	    		panel_19.repaint();
	    		panel_19.revalidate();
	    	}
	    });
	    panel_21.add(btnNewButton_49);
	    
	    JButton btnNewButton_53 = new JButton("");
	    panel_21.add(btnNewButton_53);
	    
	    JButton btnNewButton_8 = new JButton("Rank");
	    btnNewButton_8.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	     		panel_19.removeAll();
	    		panel_19.add(rankMultipleEdit);
	    		panel_19.repaint();
	    		panel_19.revalidate();
	    	}
	    });
	    panel_21.add(btnNewButton_8);
	    massEditPanel.setLayout(gl_massEditPanel);
	    
 		panel_19.removeAll();
		panel_19.add(panel_29);
		panel_19.repaint();
		panel_19.revalidate();
	    
	    KGradientPanel massAbsencePanel = new KGradientPanel();
	    massAbsencePanel.setkEndColor(new Color(248, 248, 255));
	    massAbsencePanel.setkStartColor(new Color(248, 248, 255));
	    massAbsencePanel.kStartColor = new Color(248, 248, 255);
	    massAbsencePanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(massAbsencePanel, "name_522481853156200");
	    
	    JLabel lblTarget_2_2 = new JLabel("Target:");
	    lblTarget_2_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_36 = new JTextField();
	    textField_36.setColumns(10);
	    
	    JLabel lblTarget_2_1_5 = new JLabel("List of Targeted Members");
	    lblTarget_2_1_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JTextPane textPane_16_1 = new JTextPane();
	    textPane_16_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JList list_3 = new JList();
	   list_3 .setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JLabel lblTarget_2_1_5_1 = new JLabel("Unlisted Event Name");
	    lblTarget_2_1_5_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_37 = new JTextField();
	    textField_37.setColumns(10);
	    
	    JCheckBox chckbxNewCheckBox_14 = new JCheckBox("Use Unlisted Event");
	    
	    JLabel lblTarget_2_1_5_1_1 = new JLabel("Attributes");
	    lblTarget_2_1_5_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JCheckBox chckbxNewCheckBox_14_1 = new JCheckBox("Apply Warning");
	    
	    JCheckBox chckbxNewCheckBox_14_1_1 = new JCheckBox("Notify");
	    
	    JCheckBox chckbxNewCheckBox_14_1_2 = new JCheckBox("Register as Unrecorded Absence");
	    
	    JCheckBox chckbxNewCheckBox_14_1_1_1 = new JCheckBox("Excused");
	    
	    JLabel lblTarget_2_1_5_1_2 = new JLabel("Details");
	    lblTarget_2_1_5_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_38 = new JTextField();
	    textField_38.setColumns(10);
	    
	    JCheckBox chckbxNewCheckBox_14_2 = new JCheckBox("Link Details");
	    
	    JButton btnNewButton_61 = new JButton("Register");
	    
	    JPanel panel_25_5 = new JPanel();
	    panel_25_5.setBackground(new Color(32, 178, 170, 0));
	    panel_25_5.setLayout(new BorderLayout(0, 0));
	    GroupLayout gl_massAbsencePanel = new GroupLayout(massAbsencePanel);
	    gl_massAbsencePanel.setHorizontalGroup(
	    	gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    			.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(textPane_16_1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
	    					.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    							.addGap(18)
	    							.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    								.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    									.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    										.addComponent(lblTarget_2_1_5_1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    										.addComponent(textField_37, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
	    									.addPreferredGap(ComponentPlacement.RELATED)
	    									.addComponent(chckbxNewCheckBox_14))
	    								.addComponent(lblTarget_2_1_5_1_1)
	    								.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    									.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    										.addComponent(chckbxNewCheckBox_14_1)
	    										.addComponent(chckbxNewCheckBox_14_1_1))
	    									.addGap(18)
	    									.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    										.addComponent(chckbxNewCheckBox_14_1_1_1)
	    										.addComponent(chckbxNewCheckBox_14_1_2)))
	    								.addComponent(lblTarget_2_1_5_1_2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
	    								.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    									.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
	    									.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
	    									.addComponent(chckbxNewCheckBox_14_2)
	    									.addGap(36)))
	    							.addGap(18))
	    						.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    							.addGap(185)
	    							.addComponent(btnNewButton_61, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(list_3, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
	    					.addGap(36))
	    				.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(lblTarget_2_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
	    					.addGap(4)
	    					.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    					.addGap(47)
	    					.addComponent(lblTarget_2_1_5, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(panel_25_5, GroupLayout.PREFERRED_SIZE, 1122, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    gl_massAbsencePanel.setVerticalGroup(
	    	gl_massAbsencePanel.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    			.addComponent(panel_25_5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblTarget_2_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(51)
	    			.addComponent(lblTarget_2_1_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(list_3, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
	    				.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.BASELINE)
	    					.addComponent(textPane_16_1, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
	    					.addGroup(gl_massAbsencePanel.createSequentialGroup()
	    						.addComponent(lblTarget_2_1_5_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addGap(5)
	    						.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.BASELINE)
	    							.addComponent(textField_37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    							.addComponent(chckbxNewCheckBox_14))
	    						.addGap(52)
	    						.addComponent(lblTarget_2_1_5_1_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addGap(6)
	    						.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.BASELINE)
	    							.addComponent(chckbxNewCheckBox_14_1)
	    							.addComponent(chckbxNewCheckBox_14_1_2))
	    						.addGap(5)
	    						.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.BASELINE)
	    							.addComponent(chckbxNewCheckBox_14_1_1)
	    							.addComponent(chckbxNewCheckBox_14_1_1_1))
	    						.addGap(39)
	    						.addComponent(lblTarget_2_1_5_1_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addPreferredGap(ComponentPlacement.RELATED)
	    						.addGroup(gl_massAbsencePanel.createParallelGroup(Alignment.BASELINE)
	    							.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    							.addComponent(chckbxNewCheckBox_14_2))
	    						.addGap(84)
	    						.addComponent(btnNewButton_61, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))))
	    			.addContainerGap())
	    );
	    
	    JLabel lblNewLabel_1_6 = new JLabel("Mass Absence", SwingConstants.CENTER);
	    lblNewLabel_1_6.setFont(new Font("Segoe UI Black", Font.PLAIN, 21));
	    panel_25_5.add(lblNewLabel_1_6, BorderLayout.CENTER);
	    massAbsencePanel.setLayout(gl_massAbsencePanel);
	    
	    KGradientPanel massDeletePanel = new KGradientPanel();
	    massDeletePanel.setkEndColor(new Color(248, 248, 255));
	    massDeletePanel.setkStartColor(new Color(248, 248, 255));
	    massDeletePanel.kStartColor = new Color(248, 248, 255);
	    massDeletePanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(massDeletePanel, "name_522485693330600");
	    
	    JTextPane textPane_16_1_1 = new JTextPane();
	    textPane_16_1_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JLabel lblTarget_2_1_5_2 = new JLabel("List of Targeted Members");
	    lblTarget_2_1_5_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_39 = new JTextField();
	    textField_39.setColumns(10);
	    
	    JLabel lblTarget_2_2_1 = new JLabel("Target:");
	    lblTarget_2_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTarget_2_1_5_2_1 = new JLabel("Details");
	    lblTarget_2_1_5_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    textField_40 = new JTextField();
	    textField_40.setColumns(10);
	    
	    JCheckBox chckbxNewCheckBox_15 = new JCheckBox("N/A");
	    
	    JButton btnNewButton_62 = new JButton("Submit");
	    
	    JPanel panel_25_6 = new JPanel();
	    panel_25_6.setBackground(new Color(32, 178, 170, 0));
	    panel_25_6.setLayout(new BorderLayout(0, 0));
	    GroupLayout gl_massDeletePanel = new GroupLayout(massDeletePanel);
	    gl_massDeletePanel.setHorizontalGroup(
	    	gl_massDeletePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_massDeletePanel.createSequentialGroup()
	    			.addGroup(gl_massDeletePanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_massDeletePanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_massDeletePanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_massDeletePanel.createSequentialGroup()
	    							.addGap(37)
	    							.addComponent(lblTarget_2_1_5_2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
	    						.addGroup(gl_massDeletePanel.createSequentialGroup()
	    							.addComponent(textPane_16_1_1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
	    							.addGroup(gl_massDeletePanel.createParallelGroup(Alignment.LEADING)
	    								.addGroup(gl_massDeletePanel.createSequentialGroup()
	    									.addPreferredGap(ComponentPlacement.UNRELATED)
	    									.addGroup(gl_massDeletePanel.createParallelGroup(Alignment.LEADING)
	    										.addGroup(gl_massDeletePanel.createSequentialGroup()
	    											.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
	    											.addPreferredGap(ComponentPlacement.UNRELATED)
	    											.addComponent(chckbxNewCheckBox_15))
	    										.addComponent(lblTarget_2_1_5_2_1)))
	    								.addGroup(gl_massDeletePanel.createSequentialGroup()
	    									.addGap(127)
	    									.addComponent(btnNewButton_62, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))))))
	    				.addComponent(panel_25_6, GroupLayout.PREFERRED_SIZE, 1122, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_massDeletePanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(lblTarget_2_2_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
	    					.addGap(4)
	    					.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(27, Short.MAX_VALUE))
	    );
	    gl_massDeletePanel.setVerticalGroup(
	    	gl_massDeletePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_massDeletePanel.createSequentialGroup()
	    			.addComponent(panel_25_6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
	    			.addGap(7)
	    			.addGroup(gl_massDeletePanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblTarget_2_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(lblTarget_2_1_5_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addGap(11)
	    			.addGroup(gl_massDeletePanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_massDeletePanel.createSequentialGroup()
	    					.addComponent(lblTarget_2_1_5_2_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_massDeletePanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(chckbxNewCheckBox_15))
	    					.addGap(44)
	    					.addComponent(btnNewButton_62, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(textPane_16_1_1, GroupLayout.PREFERRED_SIZE, 529, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(59, Short.MAX_VALUE))
	    );
	    
	    JLabel lblNewLabel_1_7 = new JLabel("Mass Delete", SwingConstants.CENTER);
	    lblNewLabel_1_7.setFont(new Font("Segoe UI Black", Font.PLAIN, 21));
	    panel_25_6.add(lblNewLabel_1_7, BorderLayout.CENTER);
	    massDeletePanel.setLayout(gl_massDeletePanel);
	    
	    KGradientPanel massLookupPanel = new KGradientPanel();
	    massLookupPanel.setkEndColor(new Color(248, 248, 255));
	    massLookupPanel.setkStartColor(new Color(248, 248, 255));
	    massLookupPanel.kStartColor = new Color(248, 248, 255);
	    massLookupPanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(massLookupPanel, "name_522487727575000");
	    
	    JPanel panel_22 = new JPanel();
	    panel_22.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
	    
	    JList list_4 = new JList();
	    list_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JTextPane textPane_17 = new JTextPane();
	    textPane_17.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    GroupLayout gl_massLookupPanel = new GroupLayout(massLookupPanel);
	    gl_massLookupPanel.setHorizontalGroup(
	    	gl_massLookupPanel.createParallelGroup(Alignment.LEADING)
	    		.addComponent(panel_22, GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
	    		.addGroup(gl_massLookupPanel.createSequentialGroup()
	    			.addGap(10)
	    			.addComponent(list_4, GroupLayout.PREFERRED_SIZE, 842, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(textPane_17, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
	    			.addGap(35))
	    );
	    gl_massLookupPanel.setVerticalGroup(
	    	gl_massLookupPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_massLookupPanel.createSequentialGroup()
	    			.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_massLookupPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(textPane_17, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
	    				.addComponent(list_4, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    
	    JComboBox comboBox_11 = new JComboBox();
	    
	    JLabel lblRankFilter = new JLabel("Rank Filter");
	    lblRankFilter.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JComboBox comboBox_11_1 = new JComboBox();
	    
	    JLabel lblPartitionFilter = new JLabel("Partition Filter");
	    lblPartitionFilter.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblRoleFilter = new JLabel("Role Filter");
	    lblRoleFilter.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JComboBox comboBox_11_1_1 = new JComboBox();
	    
	    JPanel panel_23 = new JPanel();
	    panel_23.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    
	    JCheckBox chckbxNewCheckBox_16 = new JCheckBox("Apply");
	    
	    JCheckBox chckbxNewCheckBox_16_1 = new JCheckBox("Apply");
	    
	    JCheckBox chckbxNewCheckBox_16_1_1 = new JCheckBox("Apply");
	    GroupLayout gl_panel_22 = new GroupLayout(panel_22);
	    gl_panel_22.setHorizontalGroup(
	    	gl_panel_22.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_22.createSequentialGroup()
	    			.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_22.createSequentialGroup()
	    					.addGap(55)
	    					.addComponent(lblRankFilter, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
	    					.addGap(65)
	    					.addComponent(lblPartitionFilter))
	    				.addGroup(gl_panel_22.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
	    						.addComponent(comboBox_11, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(chckbxNewCheckBox_16, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
	    						.addComponent(chckbxNewCheckBox_16_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(comboBox_11_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
	    			.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_22.createSequentialGroup()
	    					.addGap(45)
	    					.addComponent(lblRoleFilter, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_22.createSequentialGroup()
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
	    						.addComponent(chckbxNewCheckBox_16_1_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(comboBox_11_1_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(262, Short.MAX_VALUE))
	    );
	    gl_panel_22.setVerticalGroup(
	    	gl_panel_22.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_22.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_23, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
	    				.addGroup(gl_panel_22.createSequentialGroup()
	    					.addGroup(gl_panel_22.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblRankFilter, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblPartitionFilter, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblRoleFilter, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addGroup(gl_panel_22.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(comboBox_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(comboBox_11_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(comboBox_11_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addGroup(gl_panel_22.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(chckbxNewCheckBox_16)
	    						.addComponent(chckbxNewCheckBox_16_1)
	    						.addComponent(chckbxNewCheckBox_16_1_1))))
	    			.addContainerGap())
	    );
	    
	    JLabel lblDataFilter = new JLabel("Data Filter");
	    lblDataFilter.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JComboBox comboBox_11_1_1_1 = new JComboBox();
	    
	    JComboBox comboBox_11_1_1_1_1 = new JComboBox();
	    
	    txtAmount = new JTextField();
	    txtAmount.setColumns(10);
	    txtAmount.setText("Amount");
	    txtAmount.setForeground(Color.LIGHT_GRAY);
	    txtAmount.addMouseListener(new MouseAdapter(){
	        public void mouseClicked(MouseEvent e) {
	            if (e.getClickCount() == 1) {

	            String text = txtAmount.getText();
	            if(text.equals("Name")) {
	            	txtAmount.setText("");
	            	txtAmount.setForeground(Color.black);
	            }
	            	
	            

	             }
	        }
	    });
	    
	    JCheckBox chckbxNewCheckBox_17 = new JCheckBox("Apply");
	    GroupLayout gl_panel_23 = new GroupLayout(panel_23);
	    gl_panel_23.setHorizontalGroup(
	    	gl_panel_23.createParallelGroup(Alignment.LEADING)
	    		.addGroup(Alignment.TRAILING, gl_panel_23.createSequentialGroup()
	    			.addContainerGap(142, Short.MAX_VALUE)
	    			.addComponent(lblDataFilter, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
	    			.addGap(117))
	    		.addGroup(gl_panel_23.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_panel_23.createParallelGroup(Alignment.LEADING)
	    				.addComponent(chckbxNewCheckBox_17, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel_23.createSequentialGroup()
	    					.addComponent(comboBox_11_1_1_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(comboBox_11_1_1_1_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(txtAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(18, Short.MAX_VALUE))
	    );
	    gl_panel_23.setVerticalGroup(
	    	gl_panel_23.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_23.createSequentialGroup()
	    			.addComponent(lblDataFilter, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_panel_23.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(comboBox_11_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(comboBox_11_1_1_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(txtAmount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(chckbxNewCheckBox_17)
	    			.addContainerGap(9, Short.MAX_VALUE))
	    );
	    panel_23.setLayout(gl_panel_23);
	    panel_22.setLayout(gl_panel_22);
	    massLookupPanel.setLayout(gl_massLookupPanel);
	    
	    KGradientPanel homePanel = new KGradientPanel();
	    homePanel.setkEndColor(new Color(248, 248, 255));
	    homePanel.setkStartColor(new Color(248, 248, 255));
	    homePanel.kBorderRadius = 0;
	    homePanel.kStartColor = new Color(248, 248, 255);
	    homePanel.kEndColor = new Color(248, 248, 255);
	    cardBoardPanel.add(homePanel, "name_623616845831500");
 		cardBoardPanel.removeAll();
    	cardBoardPanel.add(homePanel);
    	cardBoardPanel.repaint();
    	cardBoardPanel.revalidate();
	    
	    KGradientPanel panel_24 = new KGradientPanel();
	    panel_24.kStartColor = new Color(245, 245, 245);
	    panel_24.kEndColor = new Color(245, 245, 245);
	    panel_24.kBorderRadius = 0;
	    
	    JLabel lblSteamLink = new JLabel("Steam Link:");
	    lblSteamLink.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JLabel lblDiscordLink = new JLabel("Discord Link:");
	    lblDiscordLink.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JLabel lblTeamspeakLink = new JLabel("TeamSpeak Link:");
	    lblTeamspeakLink.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JLabel lblGroupmeLink = new JLabel("GroupMe Link:");
	    lblGroupmeLink.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	    
	    JButton btnNewButton_63 = new JButton("https://steamcommunity.com/groups/[Group Link]");
	    btnNewButton_63.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnNewButton_63.setBackground(new Color (248, 248, 255));
	    btnNewButton_63.setBorderPainted(false);
	    btnNewButton_63.setHorizontalAlignment(SwingConstants.LEFT);
	    btnNewButton_63.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	    
	    JButton btnNewButton_63_1 = new JButton("https://discord.gg/[Group Link]");
	    btnNewButton_63_1.setBackground(new Color (248, 248, 255));
	    btnNewButton_63_1.setBorderPainted(false);
	    btnNewButton_63_1.setHorizontalAlignment(SwingConstants.LEFT);
	    btnNewButton_63_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnNewButton_63_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	    
	    JButton btnNewButton_63_1_1 = new JButton("ts3server://your.ip?port=1234&channelID=##");
	    btnNewButton_63_1_1.setBackground(new Color (248, 248, 255));
	    btnNewButton_63_1_1.setBorderPainted(false);
	    btnNewButton_63_1_1.setHorizontalAlignment(SwingConstants.LEFT);
	    btnNewButton_63_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnNewButton_63_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	    
	    JButton btnNewButton_63_1_1_1 = new JButton("https://app.groupme.com/join_group/123");
	    btnNewButton_63_1_1_1.setBackground(new Color (248, 248, 255));
	    btnNewButton_63_1_1_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String link = btnNewButton_63_1_1_1.getText();
	    	 	System.out.println("11");
	    		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
	    		    try {
	    		    	System.out.println("asd");
						Desktop.getDesktop().browse(new URI(link));
					} catch (IOException | URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    		}
	    		else {
	    		 	System.out.println("dsa");
	    		}
	    	}
	    });
	    btnNewButton_63_1_1_1.setBorderPainted(false);
	    btnNewButton_63_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
	    btnNewButton_63_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
	    
	    
	    Icon homeLogo = new ImageIcon("Resources/Decals/groupLogo.png");
	    JButton btnNewButton_64 = new JButton(homeLogo);
	    btnNewButton_64.setOpaque(false);
	    btnNewButton_64.setContentAreaFilled(false);
	    btnNewButton_64.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	    
	    JPanel panel_26 = new JPanel();
	    panel_26.setBackground(new Color (238, 238, 245));
	    GroupLayout gl_homePanel = new GroupLayout(homePanel);
	    gl_homePanel.setHorizontalGroup(
	    	gl_homePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_homePanel.createSequentialGroup()
	    			.addGroup(gl_homePanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_homePanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addGroup(gl_homePanel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 1101, GroupLayout.PREFERRED_SIZE)
	    						.addGroup(gl_homePanel.createSequentialGroup()
	    							.addGroup(gl_homePanel.createParallelGroup(Alignment.LEADING)
	    								.addComponent(lblSteamLink)
	    								.addComponent(lblTeamspeakLink)
	    								.addComponent(lblGroupmeLink)
	    								.addComponent(lblDiscordLink, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
	    							.addGap(13)
	    							.addGroup(gl_homePanel.createParallelGroup(Alignment.LEADING, false)
	    								.addComponent(btnNewButton_63_1_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    								.addComponent(btnNewButton_63_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    								.addComponent(btnNewButton_63, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    								.addComponent(btnNewButton_63_1, GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
	    							.addGap(72)
	    							.addComponent(btnNewButton_64, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE))))
	    				.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 1145, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    gl_homePanel.setVerticalGroup(
	    	gl_homePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_homePanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
	    			.addGroup(gl_homePanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_homePanel.createSequentialGroup()
	    					.addGap(143)
	    					.addGroup(gl_homePanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(btnNewButton_63)
	    						.addComponent(lblSteamLink, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
	    					.addGap(46)
	    					.addGroup(gl_homePanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblDiscordLink, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(btnNewButton_63_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
	    					.addGap(40)
	    					.addGroup(gl_homePanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblTeamspeakLink, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(btnNewButton_63_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
	    					.addGap(47)
	    					.addGroup(gl_homePanel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblGroupmeLink, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(btnNewButton_63_1_1_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
	    				.addGroup(gl_homePanel.createSequentialGroup()
	    					.addGap(69)
	    					.addComponent(btnNewButton_64, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)))
	    			.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
	    			.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    );
	    panel_26.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	    
	    JLabel lblEmailSupportgroupmanamgentnikkitcom = new JLabel("Email: SupportGroupManagement@NIKKIT.com");
	    panel_26.add(lblEmailSupportgroupmanamgentnikkitcom);
	    lblEmailSupportgroupmanamgentnikkitcom.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel lblPhone = new JLabel("| Phone: 123-456-7890");
	    panel_26.add(lblPhone);
	    lblPhone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel lblFundedBy = new JLabel("| Funded By:");
	    panel_26.add(lblFundedBy);
	    lblFundedBy.setFont(new Font("Rockwell", Font.PLAIN, 14));
	    
	    JLabel lblfunderUsername = new JLabel("[Funder Username]");
	    panel_26.add(lblfunderUsername);
	    lblfunderUsername.setFont(new Font("Rockwell", Font.PLAIN, 14));
	    panel_24.setLayout(new GridLayout(0, 4, 10, 0));
	    
	    KGradientPanel gradientPanel_2 = new KGradientPanel();
	    gradientPanel_2.kBorderRadius = 20;
	    gradientPanel_2.kGradientFocus = 0;
	    gradientPanel_2.setBackground(new Color (248, 248, 255));
	    gradientPanel_2.kTransparentControls = false;
	    gradientPanel_2.kEndColor = new Color(52, 41, 119);
	    gradientPanel_2.kStartColor = new Color(22,33,53);
	    panel_24.add(gradientPanel_2);
	    
	    JLabel lblGroupName = new JLabel("Group Name");
	    lblGroupName.setForeground(new Color(255, 255, 255));
	    lblGroupName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTotalMembers_1_2 = new JLabel("[Group Name]");
	    lblTotalMembers_1_2.setForeground(new Color(255, 255, 255));
	    lblTotalMembers_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	    GroupLayout gl_gradientPanel_2 = new GroupLayout(gradientPanel_2);
	    gl_gradientPanel_2.setHorizontalGroup(
	    	gl_gradientPanel_2.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 235, Short.MAX_VALUE)
	    		.addGroup(gl_gradientPanel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_gradientPanel_2.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblTotalMembers_1_2, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
	    				.addComponent(lblGroupName, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    gl_gradientPanel_2.setVerticalGroup(
	    	gl_gradientPanel_2.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 87, Short.MAX_VALUE)
	    		.addGroup(gl_gradientPanel_2.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblGroupName)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblTotalMembers_1_2, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
	    			.addContainerGap())
	    );
	    gradientPanel_2.setLayout(gl_gradientPanel_2);
	    
	    KGradientPanel gradientPanel = new KGradientPanel();
	    gradientPanel.kGradientFocus = 0;
	    gradientPanel.kBorderRadius = 20;
	    gradientPanel.setBackground(new Color (248, 248, 255));
	    gradientPanel.kEndColor = new Color(52, 41, 119);
	    gradientPanel.kStartColor = new Color(22,33,53);
	    
	    JLabel lblTotalMembers = new JLabel("Total Members");
	    lblTotalMembers.setForeground(new Color(255, 255, 255));
	    lblTotalMembers.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTotalMembers_1 = new JLabel("###");
	    lblTotalMembers_1.setForeground(new Color(255, 255, 255));
	    lblTotalMembers_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	    GroupLayout gl_gradientPanel = new GroupLayout(gradientPanel);
	    gl_gradientPanel.setHorizontalGroup(
	    	gl_gradientPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_gradientPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_gradientPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblTotalMembers_1, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
	    				.addComponent(lblTotalMembers, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    gl_gradientPanel.setVerticalGroup(
	    	gl_gradientPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_gradientPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTotalMembers)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblTotalMembers_1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
	    			.addContainerGap())
	    );
	    gradientPanel.setLayout(gl_gradientPanel);
	    panel_24.add(gradientPanel);
	    
	    KGradientPanel gradientPanel_1 = new KGradientPanel();
	    gradientPanel_1.kGradientFocus = 0;
	    gradientPanel_1.kBorderRadius = 20;
	    gradientPanel_1.setBackground(new Color (248, 248, 255));
	    gradientPanel_1.kEndColor = new Color(52, 41, 119);
	    gradientPanel_1.kStartColor = new Color(22,33,53);
	    panel_24.add(gradientPanel_1);
	    
	    JLabel lblTotalEvents = new JLabel("Next Event");
	    lblTotalEvents.setForeground(new Color(255, 255, 255));
	    lblTotalEvents.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTotalMembers_1_1 = new JLabel("###");
	    lblTotalMembers_1_1.setForeground(new Color(255, 255, 255));
	    lblTotalMembers_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	    GroupLayout gl_gradientPanel_1 = new GroupLayout(gradientPanel_1);
	    gl_gradientPanel_1.setHorizontalGroup(
	    	gl_gradientPanel_1.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 235, Short.MAX_VALUE)
	    		.addGroup(gl_gradientPanel_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_gradientPanel_1.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblTotalMembers_1_1, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
	    				.addComponent(lblTotalEvents, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    gl_gradientPanel_1.setVerticalGroup(
	    	gl_gradientPanel_1.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 87, Short.MAX_VALUE)
	    		.addGroup(gl_gradientPanel_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTotalEvents)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblTotalMembers_1_1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
	    			.addContainerGap())
	    );
	    gradientPanel_1.setLayout(gl_gradientPanel_1);
	    
	    KGradientPanel gradientPanel_1_1 = new KGradientPanel();
	    gradientPanel_1_1.kBorderRadius = 20;
	    gradientPanel_1_1.kGradientFocus = 0;
	    gradientPanel_1_1.kEndColor = new Color(52, 41, 119);
	    gradientPanel_1_1.kStartColor = new Color(22,33,53);
	    gradientPanel_1_1.setBackground(new Color (248, 248, 255));
	    panel_24.add(gradientPanel_1_1);
	    
	    JLabel lblGroupId = new JLabel("Group ID");
	    lblGroupId.setForeground(new Color(255, 255, 255));
	    lblGroupId.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JLabel lblTotalMembers_1_1_1 = new JLabel("###");
	    lblTotalMembers_1_1_1.setForeground(new Color(255, 255, 255));
	    lblTotalMembers_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	    GroupLayout gl_gradientPanel_1_1 = new GroupLayout(gradientPanel_1_1);
	    gl_gradientPanel_1_1.setHorizontalGroup(
	    	gl_gradientPanel_1_1.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 235, Short.MAX_VALUE)
	    		.addGap(0, 235, Short.MAX_VALUE)
	    		.addGroup(gl_gradientPanel_1_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_gradientPanel_1_1.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblTotalMembers_1_1_1, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
	    				.addComponent(lblGroupId, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    gl_gradientPanel_1_1.setVerticalGroup(
	    	gl_gradientPanel_1_1.createParallelGroup(Alignment.LEADING)
	    		.addGap(0, 87, Short.MAX_VALUE)
	    		.addGap(0, 87, Short.MAX_VALUE)
	    		.addGroup(gl_gradientPanel_1_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblGroupId)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(lblTotalMembers_1_1_1, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
	    			.addContainerGap())
	    );
	    gradientPanel_1_1.setLayout(gl_gradientPanel_1_1);
	    homePanel.setLayout(gl_homePanel);
	    
	    JPanel portalHierarchyPanel = new JPanel();
	    cardBoardPanel.add(portalHierarchyPanel, "name_22085584881000");
	    
	    JPanel portalCalendarPanel = new JPanel();
	    cardBoardPanel.add(portalCalendarPanel, "name_22095833501100");
	    
	    JPanel portalPollsPanel = new JPanel();
	    cardBoardPanel.add(portalPollsPanel, "name_22127441800000");
	    
	    JPanel portalAttendancePanel = new JPanel();
	    cardBoardPanel.add(portalAttendancePanel, "name_22162624487500");
	    
	    JPanel portalRequestsPanel = new JPanel();
	    portalRequestsPanel.setBackground(new Color (248, 248, 255));
	    cardBoardPanel.add(portalRequestsPanel, "name_22192010158600");
	    
	    JPanel panel_32 = new JPanel();
	    panel_32.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    panel_32.setVisible(false);
	    panel_32.setBackground(new Color (248, 248, 255));
	    
	    JLabel lblNewLabel_3_1_1 = new JLabel("#####");
	    
	    DefaultListModel requestsModelList = new DefaultListModel();
	    JList list_7 = new JList(requestsModelList);
	    list_7.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		panel_32.setVisible(true);
	    		lblNewLabel_3_1_1.setText(list_7.getSelectedValue().toString());
	    	}
	    });
	    requestsModelList.addElement("12345");
	    
	    list_7.setBorder(new MatteBorder(0, 0, 0, 1, (Color) SystemColor.control));
	    
	    JTextPane textPane_19 = new JTextPane();
	    textPane_19.setBackground(new Color (243,243,255));
	    textPane_19.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
	    
	    JTextPane textPane_20 = new JTextPane();
	    
	    JTextPane textPane_21 = new JTextPane();
	    
	    
	    
	    JTextPane textPane_21_1 = new JTextPane();
	    textPane_21_1.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
	    
	    JPanel panel_30 = new JPanel();
	    panel_30.setBackground(new Color (248, 248, 255));
	    
	    JPanel panel_31 = new JPanel();
	    panel_31.setBackground(new Color (248, 248, 255));
	    
	    
	    GroupLayout gl_portalRequestsPanel = new GroupLayout(portalRequestsPanel);
	    gl_portalRequestsPanel.setHorizontalGroup(
	    	gl_portalRequestsPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_portalRequestsPanel.createSequentialGroup()
	    			.addComponent(list_7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(textPane_20, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(textPane_21, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
	    			.addGap(0)
	    			.addComponent(textPane_21_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
	    			.addGroup(gl_portalRequestsPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_portalRequestsPanel.createSequentialGroup()
	    					.addGap(0)
	    					.addGroup(gl_portalRequestsPanel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_portalRequestsPanel.createSequentialGroup()
	    							.addGap(6)
	    							.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE))
	    						.addComponent(textPane_19, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 635, GroupLayout.PREFERRED_SIZE)))
	    				.addGroup(gl_portalRequestsPanel.createSequentialGroup()
	    					.addGap(6)
	    					.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE))))
	    );
	    gl_portalRequestsPanel.setVerticalGroup(
	    	gl_portalRequestsPanel.createParallelGroup(Alignment.TRAILING)
	    		.addComponent(list_7, GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
	    		.addGroup(gl_portalRequestsPanel.createSequentialGroup()
	    			.addComponent(textPane_21_1, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    		.addGroup(gl_portalRequestsPanel.createSequentialGroup()
	    			.addGroup(gl_portalRequestsPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_portalRequestsPanel.createSequentialGroup()
	    					.addComponent(textPane_19, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
	    					.addGap(0)
	    					.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
	    					.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
	    					.addGap(22))
	    				.addComponent(textPane_21, GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
	    				.addComponent(textPane_20, GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
	    			.addGap(0))
	    );
	    
	    JLabel lblNewLabel_3_1 = new JLabel("Request ID:");
	    lblNewLabel_3_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    
	    lblNewLabel_3_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JPanel panel_33 = new JPanel();
	    panel_33.setBackground(new Color (248, 248, 255));
	    
	    JPanel requestCardboard = new JPanel();
	    requestCardboard.setBackground(new Color(248, 248, 255));
	    GroupLayout gl_panel_32 = new GroupLayout(panel_32);
	    gl_panel_32.setHorizontalGroup(
	    	gl_panel_32.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_32.createSequentialGroup()
	    			.addGroup(gl_panel_32.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_32.createSequentialGroup()
	    					.addGap(21)
	    					.addComponent(lblNewLabel_3_1)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_32.createSequentialGroup()
	    					.addGap(22)
	    					.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
	    					.addGap(18)
	    					.addComponent(requestCardboard, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)))
	    			.addContainerGap())
	    );
	    gl_panel_32.setVerticalGroup(
	    	gl_panel_32.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_32.createSequentialGroup()
	    			.addGroup(gl_panel_32.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel_32.createSequentialGroup()
	    					.addGroup(gl_panel_32.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblNewLabel_3_1_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
	    					.addGap(38)
	    					.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel_32.createSequentialGroup()
	    					.addGap(52)
	    					.addComponent(requestCardboard, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(19, Short.MAX_VALUE))
	    );
	    requestCardboard.setLayout(new CardLayout(0, 0));
	    
	    JPanel requestEdit = new JPanel();
	    requestEdit.setBackground(new Color (248, 248, 255));
	    requestCardboard.add(requestEdit, "name_23644175015300");
	    
	    JLabel lblNewLabel_3_1_1_1 = new JLabel("Request Type:");
	    lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JComboBox comboBox_12 = new JComboBox();
	    
	    JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Requestee:");
	    lblNewLabel_3_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("[Requestee]");
	    lblNewLabel_3_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel lblNewLabel_3_1_1_1_2 = new JLabel("Requested:");
	    lblNewLabel_3_1_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JComboBox comboBox_13 = new JComboBox();
	    
	    textField_43 = new JTextField();
	    textField_43.setColumns(10);
	    
	    JButton btnNewButton_16 = new JButton("Apply & Accept");
	    
	    JCheckBox chckbxNewCheckBox_18 = new JCheckBox("Notify");
	    GroupLayout gl_requestEdit = new GroupLayout(requestEdit);
	    gl_requestEdit.setHorizontalGroup(
	    	gl_requestEdit.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_requestEdit.createSequentialGroup()
	    			.addGroup(gl_requestEdit.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_requestEdit.createSequentialGroup()
	    					.addGap(21)
	    					.addGroup(gl_requestEdit.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_requestEdit.createSequentialGroup()
	    							.addComponent(lblNewLabel_3_1_1_1_2)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(comboBox_13, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE))
	    						.addGroup(gl_requestEdit.createSequentialGroup()
	    							.addComponent(lblNewLabel_3_1_1_1_1)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(lblNewLabel_3_1_1_1_1_1, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
	    						.addGroup(gl_requestEdit.createSequentialGroup()
	    							.addComponent(lblNewLabel_3_1_1_1)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(comboBox_12, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))))
	    				.addGroup(gl_requestEdit.createSequentialGroup()
	    					.addGap(152)
	    					.addComponent(btnNewButton_16, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_requestEdit.createSequentialGroup()
	    					.addGap(21)
	    					.addComponent(chckbxNewCheckBox_18)
	    					.addPreferredGap(ComponentPlacement.RELATED, 345, Short.MAX_VALUE))
	    				.addGroup(Alignment.TRAILING, gl_requestEdit.createSequentialGroup()
	    					.addGap(21)
	    					.addComponent(textField_43, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
	    			.addContainerGap())
	    );
	    gl_requestEdit.setVerticalGroup(
	    	gl_requestEdit.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_requestEdit.createSequentialGroup()
	    			.addGap(29)
	    			.addGroup(gl_requestEdit.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblNewLabel_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_3_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_requestEdit.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_3_1_1_1)
	    				.addComponent(comboBox_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_requestEdit.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_3_1_1_1_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(comboBox_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(textField_43, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(13)
	    			.addComponent(chckbxNewCheckBox_18)
	    			.addPreferredGap(ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
	    			.addComponent(btnNewButton_16, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    requestEdit.setLayout(gl_requestEdit);
	    
	    JPanel requestContact = new JPanel();
	    requestContact.setBackground(new Color (248, 248, 255));
	    requestCardboard.add(requestContact, "name_23648840902300");
	    
	    JLabel lblNewLabel_3_1_1_2 = new JLabel("Requestee:");
	    lblNewLabel_3_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JLabel lblNewLabel_3_1_1_2_1 = new JLabel("[Requestee]");
	    lblNewLabel_3_1_1_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
	    
	    JTextArea textArea_6 = new JTextArea();
	    textArea_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
	    
	    JPanel panel_38 = new JPanel();
	    panel_38.setBackground(new Color (248, 248, 255));
	    GroupLayout gl_requestContact = new GroupLayout(requestContact);
	    gl_requestContact.setHorizontalGroup(
	    	gl_requestContact.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_requestContact.createSequentialGroup()
	    			.addGap(20)
	    			.addGroup(gl_requestContact.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_requestContact.createSequentialGroup()
	    					.addComponent(textArea_6, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
	    					.addGap(10))
	    				.addGroup(gl_requestContact.createParallelGroup(Alignment.LEADING)
	    					.addGroup(gl_requestContact.createSequentialGroup()
	    						.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
	    						.addContainerGap())
	    					.addGroup(gl_requestContact.createSequentialGroup()
	    						.addComponent(lblNewLabel_3_1_1_2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	    						.addPreferredGap(ComponentPlacement.RELATED)
	    						.addComponent(lblNewLabel_3_1_1_2_1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)))))
	    );
	    gl_requestContact.setVerticalGroup(
	    	gl_requestContact.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_requestContact.createSequentialGroup()
	    			.addContainerGap(31, Short.MAX_VALUE)
	    			.addGroup(gl_requestContact.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblNewLabel_3_1_1_2_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblNewLabel_3_1_1_2))
	    			.addGap(18)
	    			.addComponent(textArea_6, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
	    			.addGap(74)
	    			.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
	    			.addGap(21))
	    );
	    panel_38.setLayout(new GridLayout(1, 3, 10, 0));
	    
	    JButton btnNewButton_18 = new JButton("New button");
	    panel_38.add(btnNewButton_18);
	    
	    JButton btnNewButton_19 = new JButton("New button");
	    panel_38.add(btnNewButton_19);
	    
	    JButton btnNewButton_17 = new JButton("New button");
	    panel_38.add(btnNewButton_17);
	    requestContact.setLayout(gl_requestContact);
	    
	    JPanel requestNullPanel = new JPanel();
	    requestNullPanel.setBackground(new Color (248, 248, 255));
	    requestCardboard.add(requestNullPanel, "name_25389155348800");
	    panel_33.setLayout(new GridLayout(4, 1, 25, 7));
		requestCardboard.removeAll();
		requestCardboard.add(requestNullPanel);
		requestCardboard.repaint();
		requestCardboard.revalidate();
	    
	    
	    
	    JButton btnNewButton_15_1 = new JButton("Accept");
	    panel_33.add(btnNewButton_15_1);
	    
	    JButton btnNewButton_15 = new JButton("Reject");
	    panel_33.add(btnNewButton_15);
	    
	    JButton btnNewButton_15_3 = new JButton("Contact");
	    btnNewButton_15_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		requestCardboard.removeAll();
	    		requestCardboard.add(requestContact);
	    		requestCardboard.repaint();
	    		requestCardboard.revalidate();
	    	}
	    });
	    panel_33.add(btnNewButton_15_3);
	    
	    JButton btnNewButton_15_2 = new JButton("Edit");
	    btnNewButton_15_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		requestCardboard.removeAll();
	    		requestCardboard.add(requestEdit);
	    		requestCardboard.repaint();
	    		requestCardboard.revalidate();
	    	}
	    });
	    panel_33.add(btnNewButton_15_2);
	    panel_32.setLayout(gl_panel_32);
	    panel_31.setLayout(new GridLayout(1, 5, 20, 0));
	    
	    JButton btnNewButton_13 = new JButton("Accept All");
	    panel_31.add(btnNewButton_13);
	    
	    JButton btnNewButton_14 = new JButton("Deny All");
	    panel_31.add(btnNewButton_14);
	    
	    JButton btnNewButton_4 = new JButton("Selection");
	    btnNewButton_4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		 String input = JOptionPane.showInputDialog(null, "Enter Request ID");
	    		 panel_32.setVisible(true);
	    	}
	    });
	    panel_31.add(btnNewButton_4);
	    panel_30.setLayout(new BorderLayout(0, 0));
	    
	    JLabel lblNewLabel_3 = new JLabel("Request Management", SwingConstants.CENTER);
	    lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
	    panel_30.add(lblNewLabel_3, BorderLayout.CENTER);
	    portalRequestsPanel.setLayout(gl_portalRequestsPanel);
	    
	    JPanel portalAnnouncementPanel = new JPanel();
	    portalAnnouncementPanel.setBackground(new Color(248, 248, 255));
	    cardBoardPanel.add(portalAnnouncementPanel, "name_22226220189600");
	    
	    JPanel panel = new JPanel();
	    
	    JPanel panel_1 = new JPanel();
	    GroupLayout gl_portalAnnouncementPanel = new GroupLayout(portalAnnouncementPanel);
	    gl_portalAnnouncementPanel.setHorizontalGroup(
	    	gl_portalAnnouncementPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_portalAnnouncementPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(35, Short.MAX_VALUE))
	    );
	    gl_portalAnnouncementPanel.setVerticalGroup(
	    	gl_portalAnnouncementPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_portalAnnouncementPanel.createSequentialGroup()
	    			.addContainerGap()
	    			.addGroup(gl_portalAnnouncementPanel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 698, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
	    			.addContainerGap())
	    );
	    
	    JPanel panel_2_1 = new JPanel();
	    
	    JLabel lblTitle = new JLabel("Title:");
	    lblTitle.setForeground(Color.BLACK);
	    lblTitle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
	    
	    textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	    gl_panel_1.setHorizontalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblTitle)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    gl_panel_1.setVerticalGroup(
	    	gl_panel_1.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_1.createSequentialGroup()
	    			.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap(610, Short.MAX_VALUE))
	    );
	    panel_2_1.setLayout(new BorderLayout(0, 0));
	    
	    JLabel lblNotificationAnnouncement = new JLabel("Notification Announcement", SwingConstants.CENTER);
	    lblNotificationAnnouncement.setForeground(Color.BLACK);
	    lblNotificationAnnouncement.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	    panel_2_1.add(lblNotificationAnnouncement, BorderLayout.CENTER);
	    panel_1.setLayout(gl_panel_1);
	    
	    JPanel panel_2 = new JPanel();
	    
	    JLabel lblSubject = new JLabel("Subject:");
	    lblSubject.setForeground(Color.BLACK);
	    lblSubject.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
	    
	    textField = new JTextField();
	    textField.setColumns(10);
	    
	    JPanel panel_3 = new JPanel();
	    
	    JPanel announcement_Rank_Panel = new JPanel();
	    panel_3.add(announcement_Rank_Panel);
	    
	    JComboBox comboBox_1_1 = new JComboBox();
	    
	    JComboBox comboBox_2 = new JComboBox();
	    
	    JCheckBox chckbxNewCheckBox_19 = new JCheckBox("Rank Filter");
	    chckbxNewCheckBox_19.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		if(chckbxNewCheckBox_19.isSelected()) {
	    			announcement_Rank_Panel.setVisible(true);
	    		if(!panel_3.isVisible()) {
	    			panel_3.setVisible(true);
	    		}
	    		}else {
	    			announcement_Rank_Panel.setVisible(false);
	    		}
	    	}
	    });
	    
	    JCheckBox chckbxNewCheckBox_20 = new JCheckBox("Role Filter");
	    chckbxNewCheckBox_20.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGap(10)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(chckbxNewCheckBox_20)
	    				.addComponent(chckbxNewCheckBox_19)
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addComponent(lblSubject)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)))
	    			.addContainerGap())
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 526, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(11, Short.MAX_VALUE))
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblSubject)
	    				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addComponent(chckbxNewCheckBox_19)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(chckbxNewCheckBox_20)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(447, Short.MAX_VALUE))
	    );
	    panel_3.setLayout(new GridLayout(2, 1, 0, 0));
	    

	    
	    JButton btnNewButton_2_1 = new JButton("Submit");
	    GroupLayout gl_announcement_Rank_Panel = new GroupLayout(announcement_Rank_Panel);
	    gl_announcement_Rank_Panel.setHorizontalGroup(
	    	gl_announcement_Rank_Panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_announcement_Rank_Panel.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(31, Short.MAX_VALUE))
	    );
	    gl_announcement_Rank_Panel.setVerticalGroup(
	    	gl_announcement_Rank_Panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(Alignment.TRAILING, gl_announcement_Rank_Panel.createSequentialGroup()
	    			.addContainerGap(16, Short.MAX_VALUE)
	    			.addGroup(gl_announcement_Rank_Panel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_announcement_Rank_Panel.createSequentialGroup()
	    					.addGap(6)
	    					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_announcement_Rank_Panel.createSequentialGroup()
	    					.addGap(6)
	    					.addGroup(gl_announcement_Rank_Panel.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(comboBox_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(btnNewButton_2_1))))
	    			.addContainerGap())
	    );
	    announcement_Rank_Panel.setLayout(gl_announcement_Rank_Panel);
	    
	    JPanel panel_25 = new JPanel();
	    panel_3.add(panel_25);
	    
	    JComboBox comboBox = new JComboBox();
	    
	    JComboBox comboBox_1 = new JComboBox();
	    
	    JButton btnNewButton_2 = new JButton("Submit");
	    GroupLayout gl_panel_25 = new GroupLayout(panel_25);
	    gl_panel_25.setHorizontalGroup(
	    	gl_panel_25.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel_25.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(btnNewButton_2)
	    			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    gl_panel_25.setVerticalGroup(
	    	gl_panel_25.createParallelGroup(Alignment.LEADING)
	    		.addGroup(Alignment.TRAILING, gl_panel_25.createSequentialGroup()
	    			.addContainerGap(16, Short.MAX_VALUE)
	    			.addGroup(gl_panel_25.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(btnNewButton_2))
	    			.addContainerGap())
	    );
	    panel_25.setLayout(gl_panel_25);
	    panel_2.setLayout(new BorderLayout(0, 0));
	    
	    JLabel lblPortalAnnouncement = new JLabel("Portal Announcement", SwingConstants.CENTER);
	    lblPortalAnnouncement.setForeground(Color.BLACK);
	    lblPortalAnnouncement.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 21));
	    panel_2.add(lblPortalAnnouncement, BorderLayout.CENTER);
	    panel.setLayout(gl_panel);
	    portalAnnouncementPanel.setLayout(gl_portalAnnouncementPanel);
	    
	    JPanel settingsPanel = new JPanel();
	    cardBoardPanel.add(settingsPanel, "name_22689556777300");
	    

	    
	    JLabel serverStatusLabel = new JLabel("Server Status");
	    serverStatusLabel.setForeground(new Color(255, 255, 255));
	    serverStatusLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    JPanel portalInteractionPanel = new JPanel();
	    portalInteractionPanel.setBackground(new Color(52, 41, 119));
	    
	    JLabel lblPortalCommandBar = new JLabel("Portal Command Bar");
	    lblPortalCommandBar.setForeground(new Color(255, 255, 255));
	    lblPortalCommandBar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    
	    Icon connectionIcon = new ImageIcon("Resources/Decals/icons8_connection_status_on_48px.png");
	    JLabel lblNewLabel_2 = new JLabel(connectionIcon);
	    GroupLayout gl_auxiliaryBarPanel = new GroupLayout(auxiliaryBarPanel);
	    gl_auxiliaryBarPanel.setHorizontalGroup(
	    	gl_auxiliaryBarPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_auxiliaryBarPanel.createSequentialGroup()
	    			.addGroup(gl_auxiliaryBarPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_auxiliaryBarPanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(serverStatusLabel))
	    				.addGroup(gl_auxiliaryBarPanel.createSequentialGroup()
	    					.addGap(30)
	    					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
	    			.addGroup(gl_auxiliaryBarPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_auxiliaryBarPanel.createSequentialGroup()
	    					.addGap(427)
	    					.addComponent(lblPortalCommandBar, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_auxiliaryBarPanel.createSequentialGroup()
	    					.addGap(79)
	    					.addComponent(portalInteractionPanel, GroupLayout.PREFERRED_SIZE, 941, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap(50, Short.MAX_VALUE))
	    );
	    gl_auxiliaryBarPanel.setVerticalGroup(
	    	gl_auxiliaryBarPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_auxiliaryBarPanel.createSequentialGroup()
	    			.addGroup(gl_auxiliaryBarPanel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_auxiliaryBarPanel.createSequentialGroup()
	    					.addGap(6)
	    					.addComponent(serverStatusLabel)
	    					.addGap(0)
	    					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
	    				.addGroup(gl_auxiliaryBarPanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(lblPortalCommandBar, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(portalInteractionPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	    			.addContainerGap())
	    );
	    portalInteractionPanel.setLayout(new GridLayout(1, 0, 50, 0));
	    
	    JButton portalButtonCalendar = new JButton("Calendar");
	    portalButtonCalendar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(portalCalendarPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    portalButtonCalendar.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    portalButtonCalendar.setBorder(new LineBorder(Color.BLACK));
	    portalButtonCalendar.setForeground(new Color(255, 255, 255));
	    portalButtonCalendar.setBackground(new Color(52, 41, 119));
	    portalInteractionPanel.add(portalButtonCalendar);
	    
	    JButton portalButtonPoll = new JButton("Polls");
	    portalButtonPoll.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(portalPollsPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    portalButtonPoll.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    portalButtonPoll.setBorder(new LineBorder(Color.BLACK));
	    portalButtonPoll.setForeground(new Color(255, 255, 255));
	    portalButtonPoll.setBackground(new Color(52, 41, 119));
	    portalInteractionPanel.add(portalButtonPoll);
	    
	    JButton portalButtonAtn = new JButton("Attendance");
	    portalButtonAtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(portalAttendancePanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    portalButtonAtn.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    portalButtonAtn.setBorder(new LineBorder(Color.BLACK));
	    portalButtonAtn.setForeground(new Color(255, 255, 255));
	    portalButtonAtn.setBackground(new Color(52, 41, 119));
	    portalInteractionPanel.add(portalButtonAtn);
	    
	    JButton btnNewButton_3_1 = new JButton("Requests");
	    btnNewButton_3_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(portalRequestsPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    btnNewButton_3_1.setForeground(Color.WHITE);
	    btnNewButton_3_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    btnNewButton_3_1.setBorder(new LineBorder(Color.BLACK));
	    btnNewButton_3_1.setBackground(new Color(52, 41, 119));
	    portalInteractionPanel.add(btnNewButton_3_1);
	    
	    JButton btnNewButton_3 = new JButton("Hierarchies");
	    btnNewButton_3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(portalHierarchyPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    btnNewButton_3.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    btnNewButton_3.setBorder(new LineBorder(Color.BLACK));
	    btnNewButton_3.setForeground(new Color(255, 255, 255));
	    btnNewButton_3.setBackground(new Color(52, 41, 119));
	    portalInteractionPanel.add(btnNewButton_3);
	    
	    JButton portalButtonMessages = new JButton("Announcements");
	    portalButtonMessages.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(portalAnnouncementPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    portalButtonMessages.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    portalButtonMessages.setBorder(new LineBorder(Color.BLACK));
	    portalButtonMessages.setForeground(new Color(255, 255, 255));
	    portalButtonMessages.setBackground(new Color(52, 41, 119));
	    portalInteractionPanel.add(portalButtonMessages);
	    auxiliaryBarPanel.setLayout(gl_auxiliaryBarPanel);
	    
	    JPanel titlePanel = new JPanel();
	    titlePanel.setForeground(new Color(255, 255, 255));
	    titlePanel.setBorder(null);
	    titlePanel.setBackground(new Color(22,33,53));
	    
	    JPanel mainButtonPanel = new JPanel();
	    mainButtonPanel.setBackground(new Color(22,33,53));
	    

	    
	    JButton mainBtnMassApp = new JButton("Mass Application");
	    mainBtnMassApp.setForeground(new Color(255, 255, 255));
	    mainBtnMassApp.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
	    mainBtnMassApp.setOpaque(false);
	    mainBtnMassApp.setBorderPainted(false);
	    mainBtnMassApp.setBackground(new Color(22,33,53));

	    
	    final JPopupMenu popup = new JPopupMenu();
	    
        popup.add(new JMenuItem(new AbstractAction("Edit") {
            public void actionPerformed(ActionEvent e) {
         		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(massEditPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Absence") {
            public void actionPerformed(ActionEvent e) {
         		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(massAbsencePanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Delete") {
            public void actionPerformed(ActionEvent e) {
         		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(massDeletePanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
            }
        }));
        popup.add(new JMenuItem(new AbstractAction("Lookup") {
            public void actionPerformed(ActionEvent e) {
         		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(massLookupPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
            }
        }));
        

        mainBtnMassApp.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
    
            	popup.setPopupSize(mainBtnMassApp.getWidth(), 80);
        	    int massPopupX = 0;
        	    int massPopupY = mainBtnMassApp.getHeight();
                popup.show(e.getComponent(), massPopupX, massPopupY);
            }
        });
	    
	    JLabel creditTitleLabel = new JLabel("By:");
	    creditTitleLabel.setForeground(Color.WHITE);
	    creditTitleLabel.setFont(new Font("Calibri", Font.BOLD, 12));
	    
	    JLabel creditNameLabel = new JLabel("Nikk");
	    creditNameLabel.setForeground(new Color(204, 153, 255));
	    creditNameLabel.setFont(new Font("Calibri", Font.BOLD, 12));
	    
	    JPanel linkButtonPanel = new JPanel();
	    linkButtonPanel.setBackground(new Color(22,33,53));
	    
	    JButton btnNewButton_11_1_1 = new JButton("Universal Selection");
	    btnNewButton_11_1_1.setForeground(new Color(255, 255, 255));
	    btnNewButton_11_1_1.setBackground(new Color(22,33,53));
	    
	    Icon settingsIcon = new ImageIcon("Resources/Decals/icons8_settings_30px.png");
	    JButton btnNewButton_12 = new JButton(settingsIcon);
	    btnNewButton_12.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(settingsPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    btnNewButton_12.setOpaque(false);
	    btnNewButton_12.setBorderPainted(false);
	    btnNewButton_12.setBackground(new Color(22,33,53));
	    
	    
	    
	    
	    
	    
	    
	    
	    GroupLayout gl_leftBarPanel = new GroupLayout(leftBarPanel);
	    gl_leftBarPanel.setHorizontalGroup(
	    	gl_leftBarPanel.createParallelGroup(Alignment.LEADING)
	    		.addComponent(titlePanel, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
	    		.addGroup(Alignment.TRAILING, gl_leftBarPanel.createSequentialGroup()
	    			.addGroup(gl_leftBarPanel.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_leftBarPanel.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(btnNewButton_12, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
	    					.addGap(135)
	    					.addComponent(creditTitleLabel)
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addComponent(creditNameLabel))
	    				.addGroup(gl_leftBarPanel.createParallelGroup(Alignment.LEADING)
	    					.addGroup(gl_leftBarPanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(btnNewButton_11_1_1, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
	    					.addGroup(gl_leftBarPanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(linkButtonPanel, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
	    					.addGroup(gl_leftBarPanel.createSequentialGroup()
	    						.addContainerGap()
	    						.addComponent(mainBtnMassApp, GroupLayout.PREFERRED_SIZE, 236, Short.MAX_VALUE))
	    					.addGroup(gl_leftBarPanel.createSequentialGroup()
	    						.addGap(10)
	    						.addComponent(mainButtonPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
	    			.addGap(16))
	    );
	    gl_leftBarPanel.setVerticalGroup(
	    	gl_leftBarPanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_leftBarPanel.createSequentialGroup()
	    			.addComponent(titlePanel, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addComponent(mainButtonPanel, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(mainBtnMassApp, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addComponent(linkButtonPanel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addComponent(btnNewButton_11_1_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
	    			.addGroup(gl_leftBarPanel.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_leftBarPanel.createParallelGroup(Alignment.BASELINE)
	    					.addComponent(creditTitleLabel)
	    					.addComponent(creditNameLabel, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
	    				.addComponent(btnNewButton_12, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
	    			.addContainerGap())
	    );
	    linkButtonPanel.setLayout(new GridLayout(1, 3, 10, 60));
	    
	    
	    Icon twitterIcon = new ImageIcon("Resources/Decals/icons8_twitter_64px.png");
	    JButton btnNewButton_11_1 = new JButton(twitterIcon);
	    btnNewButton_11_1.setOpaque(false);
	    btnNewButton_11_1.setBorderPainted(false);
	    btnNewButton_11_1.setBackground(new Color(22,33,53));
	    linkButtonPanel.add(btnNewButton_11_1);
	    
	    
	    Icon websiteIcon = new ImageIcon("Resources/Decals/icons8_steam_circled_32px.png");
	    JButton btnNewButton_11_2 = new JButton(websiteIcon);
	    btnNewButton_11_2.setOpaque(false);
	    btnNewButton_11_2.setBorderPainted(false);
	    btnNewButton_11_2.setBackground(new Color(22,33,53));
	    linkButtonPanel.add(btnNewButton_11_2);
	    
	    Icon steamIcon = new ImageIcon("Resources/Decals/icons8_website_32px.png");
	    JButton btnNewButton_11 = new JButton(steamIcon);
	    btnNewButton_11.setOpaque(false);
	    btnNewButton_11.setBorderPainted(false);
	    btnNewButton_11.setBackground(new Color(22,33,53));
	    linkButtonPanel.add(btnNewButton_11);
	    mainButtonPanel.setLayout(new GridLayout(6, 2, 10, 10));
	    
	    JButton searchMainBtn = new JButton("Search");
	    searchMainBtn.setForeground(new Color(255, 255, 255));
	    searchMainBtn.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    searchMainBtn.setBackground(new Color(22,33,53));
	    searchMainBtn.setOpaque(false);
	    searchMainBtn.setBorderPainted(false);
	    
	    searchMainBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(searchPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(searchMainBtn);
	    
	    JButton addMainBtn = new JButton("Add");
	    addMainBtn.setForeground(new Color(255, 255, 255));
	    addMainBtn.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    addMainBtn.setOpaque(false);
	    addMainBtn.setBorderPainted(false);
	    addMainBtn.setBackground(new Color(22,33,53));
	    addMainBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(addPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(addMainBtn);
	    
	    JButton editMainBtn = new JButton("Edit");
	    editMainBtn.setForeground(new Color(255, 255, 255));
	    editMainBtn.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    editMainBtn.setOpaque(false);
	    editMainBtn.setBorderPainted(false);
	    editMainBtn.setBackground(new Color(22,33,53));
	    editMainBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(editPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(editMainBtn);
	    
	    JButton mainBtnList = new JButton("List");
	    mainBtnList.setForeground(new Color(255, 255, 255));
	    mainBtnList.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    mainBtnList.setOpaque(false);
	    mainBtnList.setBorderPainted(false);
	    mainBtnList.setBackground(new Color(22,33,53));
	    mainBtnList.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	      		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(listPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(mainBtnList);
	    
	    JButton mainBtnDelete = new JButton("Delete");
	    mainBtnDelete.setForeground(new Color(255, 255, 255));
	    mainBtnDelete.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    mainBtnDelete.setOpaque(false);
	    mainBtnDelete.setBorderPainted(false);
	    mainBtnDelete.setBackground(new Color(22,33,53));
	    mainBtnDelete.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(deletePanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(mainBtnDelete);
	    
	    JButton mainBtnCalendar = new JButton("Calendar");
	    mainBtnCalendar.setForeground(new Color(255, 255, 255));
	    mainBtnCalendar.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    mainBtnCalendar.setOpaque(false);
	    mainBtnCalendar.setBorderPainted(false);
	    mainBtnCalendar.setBackground(new Color(22,33,53));
	    mainBtnCalendar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(calendarPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    		
	    	    LocalDateTime calendarYear = LocalDateTime.now();
	    	    DateTimeFormatter calendarFormattedYear = DateTimeFormatter.ofPattern("yyyy");
	    	    String calendarYearFinal = calendarYear.format(calendarFormattedYear);
	    	    lblNewLabel_1_1.setText("<html> "+ calendarYearFinal + " &nbsp; &nbsp; </html>");
	    	    
	    	    LocalDateTime calendarMonth = LocalDateTime.now();
	    	    DateTimeFormatter calendarFormattedMonth = DateTimeFormatter.ofPattern("MM");
	    	    String calendarMonthFinal = calendarMonth.format(calendarFormattedMonth);
	    	    
	    	    LocalDateTime calendarDate = LocalDateTime.now();
	    	    DateTimeFormatter calendarFormattedDate = DateTimeFormatter.ofPattern("dd");
	    	    String calendarDateFinal = calendarDate.format(calendarFormattedDate);
	    	    
	    	    if(calendarMonthFinal.equals("01")) { monthTitle.setText("Janurary");}if(calendarMonthFinal.equals("07")) { monthTitle.setText("July");}
	    	    if(calendarMonthFinal.equals("02")) { monthTitle.setText("Feburary");}if(calendarMonthFinal.equals("08")) { monthTitle.setText("August");}
	    	    if(calendarMonthFinal.equals("03")) { monthTitle.setText("March");}if(calendarMonthFinal.equals("09")) { monthTitle.setText("September");}
	    	    if(calendarMonthFinal.equals("04")) { monthTitle.setText("April");}if(calendarMonthFinal.equals("10")) { monthTitle.setText("October");}
	    	    if(calendarMonthFinal.equals("05")) { monthTitle.setText("May");}if(calendarMonthFinal.equals("11")) { monthTitle.setText("November");}
	    	    if(calendarMonthFinal.equals("06")) { monthTitle.setText("June");}if(calendarMonthFinal.equals("12")) { monthTitle.setText("December");}
	    	    
	    	    //spring runs from March 1 to May 31;
	    	    //summer runs from June 1 to August 31;
	    	    //fall (autumn) runs from September 1 to November 30; and
	    	    //winter runs from December 1 to February 28 (February 29 in a leap year ).
	    	    
	    	    if(calendarMonthFinal.equals("03") || calendarMonthFinal.equals("04") || calendarMonthFinal.equals("05")) {lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Spring </html>");}
	    	    if(calendarMonthFinal.equals("06") || calendarMonthFinal.equals("07") || calendarMonthFinal.equals("08")) {lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Summer </html>");}
	    	    if(calendarMonthFinal.equals("09") || calendarMonthFinal.equals("10") || calendarMonthFinal.equals("11")) {lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Fall </html>");}
	    	    if(calendarMonthFinal.equals("12") || calendarMonthFinal.equals("01") || calendarMonthFinal.equals("02")) {lblNewLabel_1_1_1.setText("<html> &nbsp; &nbsp; Winter </html>");}
	    	 
	    	        Date date=new Date();
	    	        Calendar c = Calendar.getInstance();
	    	        c.setTime(date);
	    	        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	    	        System.out.println("Day of week in number:"+dayOfWeek);
	    	        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
	    	        System.out.println("Day of week in text:"+dayWeekText);
	    	        
	    	        System.out.println("Current Date: " + calendarDateFinal);
	    	        System.out.println("Current Day: " + dayWeekText);
	    	        

	    	        Calendar cal = Calendar.getInstance();
	    	        if(calendarMonthFinal.equals("01")) {
	    	        cal.set(Calendar.MONTH, Calendar.JANUARY);
	    	        }
	    	        if(calendarMonthFinal.equals("02")) {
	    	        cal.set(Calendar.MONTH, Calendar.FEBRUARY);
	    	        }
	    	        if(calendarMonthFinal.equals("03")) {
	    	        cal.set(Calendar.MONTH, Calendar.MARCH);
	    	        }
	    	        if(calendarMonthFinal.equals("04")) {
	    	        cal.set(Calendar.MONTH, Calendar.APRIL);
	    	        }
	    	        if(calendarMonthFinal.equals("05")) {
	    	        cal.set(Calendar.MONTH, Calendar.MAY);
	    	        }
	    	        if(calendarMonthFinal.equals("06")) {
	    	        cal.set(Calendar.MONTH, Calendar.JUNE);
	    	        }
	    	        if(calendarMonthFinal.equals("07")) {
	    	        cal.set(Calendar.MONTH, Calendar.JULY);
	    	        }
	    	        if(calendarMonthFinal.equals("08")) {
	    	        cal.set(Calendar.MONTH, Calendar.AUGUST);
	    	        }
	    	        if(calendarMonthFinal.equals("09")) {
	    	        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
	    	        }
	    	        if(calendarMonthFinal.equals("10")) {
	    	        cal.set(Calendar.MONTH, Calendar.OCTOBER);
	    	        }
	    	        if(calendarMonthFinal.equals("11")) {
	    	        cal.set(Calendar.MONTH, Calendar.NOVEMBER);
	    	        }
	    	        if(calendarMonthFinal.equals("12")) {
	    	        cal.set(Calendar.MONTH, Calendar.DECEMBER);
	    	        }
	    	        
	    	        String yearToFormat = lblNewLabel_1_1.getText();
	    	        yearToFormat = yearToFormat.replace("<html> ", "");
	    	        yearToFormat = yearToFormat.replace(" &nbsp; &nbsp; </html>", "");
	    	        int yearForSystem = Integer.valueOf(yearToFormat);
	    	        cal.set(Calendar.YEAR, yearForSystem);

	    	        cal.set(Calendar.DAY_OF_MONTH, 1);
	    	        Date firstDayOfMonth = cal.getTime();
	    	        
	    	        DateFormat sdf = new SimpleDateFormat("EEEEEEEE");   
	    	        System.out.println("First Day of Month: " + sdf.format(firstDayOfMonth)); 
	    	        
	    	        String currentMonth = sdf.format(firstDayOfMonth).toString();
	    	        System.out.println("currentMonth " + currentMonth);
	    	        
	    	        int day = 1;
	    	        if(currentMonth.equals("Monday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setText(String.valueOf(day));
	    	        	day++;
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setVisible(false); 
	    	        	F5.setVisible(false);
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false); 
	    	        }
	    	        if(currentMonth.equals("Tuesday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setVisible(false);
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false); 
	    	        	
	    	        	
	    	        	
	    	        }
	    	        if(currentMonth.equals("Wednesday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	S5.setVisible(false);
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Thursday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	Su6.setVisible(false);
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        	
	    	        }
	    	        if(currentMonth.equals("Friday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setVisible(false);
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su6.setText(String.valueOf(day));
	    	        	M6.setVisible(false);
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Saturday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setVisible(false);
	    	        	M1.setVisible(false);
	    	        	T1.setVisible(false);
	    	        	W1.setVisible(false);
	    	        	Tr1.setVisible(false);
	    	        	F1.setVisible(false);
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr5.setText(String.valueOf(day));
	    	        	day++;
	    	        	F5.setText(String.valueOf(day));
	    	        	day++;
	    	        	S5.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su6.setText(String.valueOf(day));
	    	        	day++;
	    	        	M6.setText(String.valueOf(day));
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        if(currentMonth.equals("Sunday")) {
	    	        	Su1.setVisible(true);
	    	        	M1.setVisible(true);
	    	        	T1.setVisible(true);
	    	        	W1.setVisible(true);
	    	        	Tr1.setVisible(true);
	    	        	F1.setVisible(true);
	    	        	S1.setVisible(true);
	    	        	W5.setVisible(true);
	    	        	Tr5.setVisible(true);
	    	        	F5.setVisible(true);
	    	        	S5.setVisible(true);
	    	        	Su6.setVisible(true);
	    	        	M6.setVisible(true);
	    	        	T6.setVisible(true);
	    	        	W6.setVisible(true);
	    	        	Tr6.setVisible(true);
	    	        	F6.setVisible(true);
	    	        	S6.setVisible(true);
	    	        	
	    	        	Su1.setText(String.valueOf(day));
	    	        	day++;
	    	        	M1.setText(String.valueOf(day));
	    	        	day++;
	    	        	T1.setText(String.valueOf(day));
	    	        	day++;
	    	        	W1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr1.setText(String.valueOf(day));
	    	        	day++;
	    	        	F1.setText(String.valueOf(day));
	    	        	day++;
	    	        	S1.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su2.setText(String.valueOf(day));
	    	        	day++;
	    	        	M2.setText(String.valueOf(day));
	    	        	day++;
	    	        	T2.setText(String.valueOf(day));
	    	        	day++;
	    	        	W2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr2.setText(String.valueOf(day));
	    	        	day++;
	    	        	F2.setText(String.valueOf(day));
	    	        	day++;
	    	        	S2.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su3.setText(String.valueOf(day));
	    	        	day++;
	    	        	M3.setText(String.valueOf(day));
	    	        	day++;
	    	        	T3.setText(String.valueOf(day));
	    	        	day++;
	    	        	W3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr3.setText(String.valueOf(day));
	    	        	day++;
	    	        	F3.setText(String.valueOf(day));
	    	        	day++;
	    	        	S3.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su4.setText(String.valueOf(day));
	    	        	day++;
	    	        	M4.setText(String.valueOf(day));
	    	        	day++;
	    	        	T4.setText(String.valueOf(day));
	    	        	day++;
	    	        	W4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Tr4.setText(String.valueOf(day));
	    	        	day++;
	    	        	F4.setText(String.valueOf(day));
	    	        	day++;
	    	        	S4.setText(String.valueOf(day));
	    	        	day++;
	    	        	Su5.setText(String.valueOf(day));
	    	        	day++;
	    	        	M5.setText(String.valueOf(day));
	    	        	day++;
	    	        	T5.setText(String.valueOf(day));
	    	        	day++;
	    	        	W5.setVisible(false);
	    	        	day++;
	    	        	Tr5.setVisible(false);
	    	        	day++;
	    	        	F5.setVisible(false);
	    	        	day++;
	    	        	S5.setVisible(false);
	    	        	day++;
	    	        	Su6.setVisible(false);
	    	        	day++;
	    	        	M6.setVisible(false);
	    	        	day++;
	    	        	T6.setVisible(false);
	    	        	W6.setVisible(false);
	    	        	Tr6.setVisible(false);
	    	        	F6.setVisible(false);
	    	        	S6.setVisible(false);
	    	        }
	    	        
	    	    
	    	}
	    });
	    mainButtonPanel.add(mainBtnCalendar);
	    
	    JButton mainBtnActivity = new JButton("Activity");
	    mainBtnActivity.setForeground(new Color(255, 255, 255));
	    mainBtnActivity.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    mainBtnActivity.setOpaque(false);
	    mainBtnActivity.setBorderPainted(false);
	    mainBtnActivity.setBackground(new Color(22,33,53));
	    mainBtnActivity.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(activityPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(mainBtnActivity);
	    
	    JButton mainBtnNoticeBoard = new JButton("Notice Board");
	    mainBtnNoticeBoard.setForeground(new Color(255, 255, 255));
	    mainBtnNoticeBoard.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    mainBtnNoticeBoard.setOpaque(false);
	    mainBtnNoticeBoard.setBorderPainted(false);
	    mainBtnNoticeBoard.setBackground(new Color(22,33,53));
	    mainBtnNoticeBoard.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(noticeBoardPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(mainBtnNoticeBoard);
	    
	    JButton btnNewButton = new JButton("Alerts");
	    btnNewButton.setForeground(new Color(255, 255, 255));
	    btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    btnNewButton.setOpaque(false);
	    btnNewButton.setBorderPainted(false);
	    btnNewButton.setBackground(new Color(22,33,53));
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	      		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(alertPanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(btnNewButton);
	    
	    JButton mainBtnFeedback = new JButton("Feedback");
	    mainBtnFeedback.setForeground(new Color(255, 255, 255));
	    mainBtnFeedback.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    mainBtnFeedback.setOpaque(false);
	    mainBtnFeedback.setBorderPainted(false);
	    mainBtnFeedback.setBackground(new Color(22,33,53));
	    mainButtonPanel.add(mainBtnFeedback);
	    
	    JButton mainBtnHelp = new JButton("Help");
	    mainBtnHelp.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

	    	}
	    });
	    mainBtnHelp.setForeground(new Color(255, 255, 255));
	    mainBtnHelp.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    mainBtnHelp.setOpaque(false);
	    mainBtnHelp.setBorderPainted(false);
	    mainBtnHelp.setBackground(new Color(22,33,53));
	    mainButtonPanel.add(mainBtnHelp);
	    
	    JButton btnNewButton_1 = new JButton("Home");
	    btnNewButton_1.setForeground(new Color(255, 255, 255));
	    btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
	    btnNewButton_1.setOpaque(false);
	    btnNewButton_1.setBorderPainted(false);
	    btnNewButton_1.setBackground(new Color(22,33,53));
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	     		cardBoardPanel.removeAll();
	    		cardBoardPanel.add(homePanel);
	    		cardBoardPanel.repaint();
	    		cardBoardPanel.revalidate();
	    	}
	    });
	    mainButtonPanel.add(btnNewButton_1);
	    
	    JLabel lblNewLabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[Group Name] <br> Administrative Portal</html>");
	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 18));
	    GroupLayout gl_titlePanel = new GroupLayout(titlePanel);
	    gl_titlePanel.setHorizontalGroup(
	    	gl_titlePanel.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(Alignment.LEADING, gl_titlePanel.createSequentialGroup()
	    			.addGap(19)
	    			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap(34, Short.MAX_VALUE))
	    );
	    gl_titlePanel.setVerticalGroup(
	    	gl_titlePanel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_titlePanel.createSequentialGroup()
	    			.addGap(36)
	    			.addComponent(lblNewLabel)
	    			.addContainerGap(39, Short.MAX_VALUE))
	    );
	    titlePanel.setLayout(gl_titlePanel);
	    leftBarPanel.setLayout(gl_leftBarPanel);
	    mainFrame.getContentPane().setLayout(groupLayout);
	    mainFrame.setVisible(true);
	    
	    
	}
}
