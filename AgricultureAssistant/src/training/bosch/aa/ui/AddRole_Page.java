package training.bosch.aa.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import training.bosch.aa.business.AdminBusiness;

public class AddRole_Page extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JLabel jLabel1 = new JLabel();
    private JTextField newRole_arp = new JTextField();
    private JButton saveButton_arp = new JButton();

    public AddRole_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( layoutMain );
        panelCenter.setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Add Roles" );
        jLabel1.setText("Add New Role");
        jLabel1.setBounds(new Rectangle(35, 50, 100, 25));
        newRole_arp.setBounds(new Rectangle(125, 50, 225, 20));
        saveButton_arp.setText("Add");
        saveButton_arp.setBounds(new Rectangle(147, 125, 105, 35));
        saveButton_arp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    saveButton_arp_actionPerformed(e);
                   
                    
                }
            });
        panelCenter.add(saveButton_arp, null);
        panelCenter.add(newRole_arp, null);
        panelCenter.add(jLabel1, null);
        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
    }

   

    private void saveButton_arp_actionPerformed(ActionEvent e) {
    	
    	 AddRole_Page ap=new AddRole_Page();
    	 String newRole = newRole_arp.getText();
    	 
    	 if (newRole!=null)
    	 {
    		 JOptionPane.showMessageDialog(ap,"Field cannot be left blank"); 
    	 }
    	 else
    	 {
    	 AdminBusiness.createRole(newRole);
    	
    	 JOptionPane.showMessageDialog(ap,"Sucessfully added "+newRole);
       	 ap.setDefaultCloseOperation(ap.EXIT_ON_CLOSE);
    	 }
    	 
    	 

    }
}
