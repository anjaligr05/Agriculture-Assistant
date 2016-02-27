package training.bosch.aa.ui;

import training.bosch.aa.business.AdminBusiness;
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

public class CreateUsers_Page extends JFrame {

    String[] arr = { "Admin", "Professor", "Editor", "Presenter" };
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
 
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JButton logoutButton_crp = new JButton();
    private JComboBox roleComboBox_crp = new JComboBox(arr);
    private JLabel jLabel6 = new JLabel();
    private JButton saveButton_crp = new JButton();
   
    private JTextField username_crp = new JTextField();
    private JTextField password_crp = new JTextField();

    public CreateUsers_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
       
        this.getContentPane().setLayout(layoutMain);
        panelCenter.setLayout(null);
        this.setSize(new Dimension(450, 350));
        this.setTitle("Create Users");
       
      
        jLabel4.setText("Username");
        jLabel4.setBounds(new Rectangle(35, 100, 95, 25));
        jLabel5.setText("Password");
        jLabel5.setBounds(new Rectangle(35, 150, 95, 25));
        logoutButton_crp.setText("Logout");
        logoutButton_crp.setBounds(new Rectangle(350, 10, 75, 20));
        logoutButton_crp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        roleComboBox_crp.setBounds(new Rectangle(120, 40, 190, 20));
        roleComboBox_crp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jComboBox1_actionPerformed(e);
                }
            });
        jLabel6.setText("Role");
        jLabel6.setBounds(new Rectangle(35, 40, 95, 25));
        saveButton_crp.setText("Add");
        saveButton_crp.setBounds(new Rectangle(150, 200, 85, 25));
        saveButton_crp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    saveButton_crp_actionPerformed(e);
                }
            });
      
        username_crp.setBounds(new Rectangle(120, 100, 190, 20));
        username_crp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    username_cr_actionPerformed(e);
                }
            });
        password_crp.setBounds(new Rectangle(120, 150, 190, 20));
      
        panelCenter.add(password_crp, null);
        panelCenter.add(username_crp, null);
       
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
