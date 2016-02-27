package training.bosch.aa.ui;
import training.bosch.aa.util.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import training.bosch.aa.util.Validation;

public class PersonalInfoui extends JFrame{
	
	
	  String[] arr = { "Admin", "Professor", "Editor", "Presenter" };
	    private BorderLayout layoutMain = new BorderLayout();
	    private JPanel panelCenter = new JPanel();
	    private JMenuBar menuBar = new JMenuBar();
	    private JMenu menuFile = new JMenu();
	    private JMenuItem menuFileExit = new JMenuItem();
	    private JMenu menuHelp = new JMenu();
	    private JMenuItem menuHelpAbout = new JMenuItem();
	    private JLabel statusBar = new JLabel();
	    private JToolBar toolBar = new JToolBar();
	    private JButton buttonOpen = new JButton();
	    private JButton buttonClose = new JButton();
	    private JButton buttonHelp = new JButton();
	    private ImageIcon imageOpen =
	        new ImageIcon(CreateUsers_Page.class.getResource("openfile.gif"));
	    private ImageIcon imageClose =
	        new ImageIcon(CreateUsers_Page.class.getResource("closefile.gif"));
	    private ImageIcon imageHelp =
	        new ImageIcon(CreateUsers_Page.class.getResource("help.gif"));
	    private JLabel jLabel1 = new JLabel();
	    private JLabel jLabel2 = new JLabel();
	    private JLabel jLabel3 = new JLabel();
	    private JLabel jLabel4 = new JLabel();
	    private JLabel jLabel5 = new JLabel();
	    private JButton logoutButton_crp = new JButton();
	    private JComboBox roleComboBox_crp = new JComboBox(arr);
	    private JLabel jLabel6 = new JLabel();
	    private JButton saveButton_crp = new JButton();
	    private JTextField name_crp = new JTextField();
	    private JTextField phone_crp = new JTextField();
	    private JTextField email_crp = new JTextField();
	    private JTextField username_crp = new JTextField();
	    private JTextField password_crp = new JTextField();

	    public PersonalInfoui() {
			// TODO Auto-generated constructor stub
		        try {
	            jbInit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private void jbInit() throws Exception {
	        this.setJMenuBar(menuBar);
	        this.getContentPane().setLayout(layoutMain);
	        panelCenter.setLayout(null);
	        this.setSize(new Dimension(514, 390));
	        this.setTitle("Create Users");
	        menuFile.setText("File");
	        menuFileExit.setText("Exit");
	        menuFileExit.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent ae) {
	                    fileExit_ActionPerformed(ae);
	                }
	            });
	        menuHelp.setText("Help");
	        menuHelpAbout.setText("About");
	        menuHelpAbout.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent ae) {
	                    helpAbout_ActionPerformed(ae);
	                }
	            });
	        statusBar.setText("");
	        buttonOpen.setToolTipText("Open File");
	        buttonOpen.setIcon(imageOpen);
	        buttonClose.setToolTipText("Close File");
	        buttonClose.setIcon(imageClose);
	        buttonHelp.setToolTipText("About");
	        buttonHelp.setIcon(imageHelp);
	        jLabel1.setText("Name");
	        jLabel1.setBounds(new Rectangle(35, 58, 95, 25));
	        jLabel2.setText("Phone");
	        jLabel2.setBounds(new Rectangle(35, 91, 95, 25));
	        jLabel3.setText("Email");
	        jLabel3.setBounds(new Rectangle(35, 124, 95, 25));
	        jLabel4.setText("Username");
	        jLabel4.setBounds(new Rectangle(35, 157, 95, 25));
	        jLabel5.setText("Password");
	        jLabel5.setBounds(new Rectangle(35, 190, 95, 25));
	        logoutButton_crp.setText("Logout");
	        logoutButton_crp.setBounds(new Rectangle(390, 10, 75, 20));
	        logoutButton_crp.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    jButton1_actionPerformed(e);
	                }
	            });
	        roleComboBox_crp.setBounds(new Rectangle(120, 30, 190, 20));
	        roleComboBox_crp.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    jComboBox1_actionPerformed(e);
	                }
	            });
	        jLabel6.setText("Role");
	        jLabel6.setBounds(new Rectangle(35, 25, 95, 25));
	        saveButton_crp.setText("Save");
	        saveButton_crp.setBounds(new Rectangle(210, 255, 85, 25));
	        saveButton_crp.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    saveButton_crp_actionPerformed(e);
	                }
	            });
	        name_crp.setBounds(new Rectangle(120, 60, 190, 20));
	        name_crp.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    jTextField1_actionPerformed(e);
	                }
	            });
	        phone_crp.setBounds(new Rectangle(120, 95, 190, 20));
	        email_crp.setBounds(new Rectangle(120, 130, 190, 20));
	        username_crp.setBounds(new Rectangle(120, 165, 190, 20));
	        username_crp.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    username_cr_actionPerformed(e);
	                }
	            });
	        password_crp.setBounds(new Rectangle(120, 195, 190, 20));
	        menuFile.add(menuFileExit);
	        menuBar.add(menuFile);
	        menuHelp.add(menuHelpAbout);
	        menuBar.add(menuHelp);
	        this.getContentPane().add(statusBar, BorderLayout.SOUTH);
	        toolBar.add(buttonOpen);
	        toolBar.add(buttonClose);
	        toolBar.add(buttonHelp);
	        this.getContentPane().add(toolBar, BorderLayout.NORTH);
	        panelCenter.add(password_crp, null);
	        panelCenter.add(username_crp, null);
	        panelCenter.add(email_crp, null);
	        panelCenter.add(phone_crp, null);
	        panelCenter.add(name_crp, null);
	        panelCenter.add(saveButton_crp, null);
	        panelCenter.add(jLabel6, null);
	        panelCenter.add(roleComboBox_crp, null);
	        panelCenter.add(logoutButton_crp, null);
	        panelCenter.add(jLabel5, null);
	        panelCenter.add(jLabel4, null);
	        panelCenter.add(jLabel3, null);
	        panelCenter.add(jLabel2, null);
	        panelCenter.add(jLabel1, null);
	        this.getContentPane().add(panelCenter, BorderLayout.CENTER);
	    }

	    void fileExit_ActionPerformed(ActionEvent e) {
	        System.exit(0);
	    }

	    void helpAbout_ActionPerformed(ActionEvent e) {
	        JOptionPane.showMessageDialog(this,
	                                      new CreateRoles_Page_AboutBoxPanel1(),
	                                      "About", JOptionPane.PLAIN_MESSAGE);
	    }

	    private void jButton1_actionPerformed(ActionEvent e) {
	    }

	    private void jComboBox1_actionPerformed(ActionEvent e) {
	    }

	    private void saveButton_crp_actionPerformed(ActionEvent e) {

	        String name = name_crp.getText();
	        System.out.println(name);

	        String phone = phone_crp.getText();
	        System.out.println(phone);

	        String email = email_crp.getText();
	        System.out.println(email);

	        String un = username_crp.getText();
	        System.out.println(un);
	        
	        String pw = password_crp.getText();
	        System.out.println(pw);
	        
	        String role = (String)roleComboBox_crp.getSelectedItem();
	        System.out.println(role);
	        
	      Validation vObj=new Validation();
	      if(vObj.validateForCreateUsers(un,pw))
	          System.out.println("Success");
	      else
	          System.out.println("Failed pattern");


	    }

	    private void jTextField1_actionPerformed(ActionEvent e) {
	    }

	    private void username_cr_actionPerformed(ActionEvent e) {
	    }

}
