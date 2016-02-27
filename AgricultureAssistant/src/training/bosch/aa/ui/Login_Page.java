package training.bosch.aa.ui;

import training.bosch.aa.business.AdminBusiness;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;
import training.bosch.aa.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

public class Login_Page extends JFrame {


    String arr[] =
    { "Admin", "Professor", "Editor", "Presenter" }; //Array in ComboBox
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
     private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen =
        new ImageIcon(Login_Page.class.getResource("openfile.gif"));
    private ImageIcon imageClose =
        new ImageIcon(Login_Page.class.getResource("closefile.gif"));
    private ImageIcon imageHelp =
        new ImageIcon(Login_Page.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JPasswordField password = new JPasswordField();
    private JButton loginButton = new JButton();
    private JComboBox roleComboBox = new JComboBox(arr);
    private JTextField username = new JTextField();

    public Login_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
      
        this.getContentPane().setLayout(layoutMain);
        panelCenter.setLayout(null);
        panelCenter.setBackground(new Color(214, 255, 220));
        this.setSize(new Dimension(400, 300));
        this.setTitle("Login");
        this.setBackground(new Color(0, 99, 49));
      
        jLabel1.setText(" AGRICULTURAL PERSONAL ASSISTANT");
        jLabel1.setBounds(new Rectangle(85, 5, 265, 35));
        jLabel1.setMaximumSize(new Dimension(300, 14));
        jLabel1.setSize(new Dimension(300, 35));
        jLabel1.setBackground(new Color(56, 174, 56));
        jLabel2.setText("Role");
        jLabel2.setBounds(new Rectangle(15, 60, 80, 25));
        jLabel3.setText("Username");
        jLabel3.setBounds(new Rectangle(15, 105, 80, 25));
        jLabel4.setText("Password");
        jLabel4.setBounds(new Rectangle(15, 155, 80, 25));
        password.setBounds(new Rectangle(120, 155, 230, 20));
        password.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jPasswordField1_actionPerformed(e);
                }
            });
        loginButton.setText("Login");
        loginButton.setBounds(new Rectangle(150, 220, 95, 30));
        loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    loginButton(e);
                }
            });
        roleComboBox.setBounds(new Rectangle(120, 60, 230, 20));
        roleComboBox.setBorder(BorderFactory.createEmptyBorder(3, 3, 1, 0));
        roleComboBox.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jComboBox1_actionPerformed(e);
                }
            });
        username.setBounds(new Rectangle(120, 108, 230, 20));
      
        panelCenter.add(username, null);
        panelCenter.add(roleComboBox, null);
        panelCenter.add(loginButton, null);
        panelCenter.add(password, null);
        panelCenter.add(jLabel4, null);
        panelCenter.add(jLabel3, null);
        panelCenter.add(jLabel2, null);
        panelCenter.add(jLabel1, null);

        this.getContentPane().add(panelCenter, BorderLayout.CENTER);
    }

   

    private void loginButton(ActionEvent e) {


        //Get values from User
        String un = username.getText();
       
        String pw = String.copyValueOf(password.getPassword());
        
        String role = (String)roleComboBox.getSelectedItem();
       
        Validation vObj=new Validation();
        
        	UserMaster umObj=AdminBusiness.readbyusername(un);
        	String un1=umObj.getUsername();
        	String pw1=umObj.getPassword();
        	RoleDetails rd=new RoleDetails(role);
        	
        	
        	if(un.equals(un1)&& pw.equals(pw1))
        	{
        		if (role.equals("Admin")) 
        		{
        		JFrame jfObj=new Admin_Page();
        		jfObj.setVisible(true);
        		jfObj.setLocationRelativeTo(null);
        		this.dispose();
        		}
        		else if (role.equals("Editor"))
        		{
        			JFrame jfObj=new Editor_Page();
            		jfObj.setVisible(true);
            		jfObj.setLocationRelativeTo(null);
            		this.dispose();
        			
        		}
        		else if (role.equals("Professor"))
        		{
        			JFrame jfObj=new Professor_Page();
            		jfObj.setVisible(true);
            		jfObj.setLocationRelativeTo(null);
            		this.dispose();
        			
        		}
        		/*else if (role.equals("Presentor"))
        		{
        			JFrame jfObj=new Presentor_Page();
            		jfObj.setVisible(true);
            		jfObj.setLocationRelativeTo(null);
            		this.dispose();
        			
        		}*/
        	}
        	else
        	{
        		
        		JFrame jfObj=new Admin_Page();
        		JOptionPane.showMessageDialog(jfObj, "Invalid Username and Password");
        		       	        
        		
        	}
        	
        
    }


    private void jComboBox1_actionPerformed(ActionEvent e) {

    }

    private void jPasswordField1_actionPerformed(ActionEvent e) {
    }
}
