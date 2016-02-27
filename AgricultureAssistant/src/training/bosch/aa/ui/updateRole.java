package training.bosch.aa.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JToolBar;

import training.bosch.aa.business.AdminBusiness;
import training.bosch.aa.domain.RoleDetails;

public class updateRole extends JFrame{
	
	private static int index;
	
	 private BorderLayout layoutMain = new BorderLayout();
	    private JPanel panelCenter = new JPanel();
	    private JLabel jLabel1 = new JLabel();
	    private JTextField updateRole_arp = new JTextField();
	    private JButton updateButton_arp = new JButton();

	    public updateRole()
	    {
	    	
	    }
	    public updateRole(int ind) {
	        try {
	        	index=ind;
	            jbInit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private void jbInit() throws Exception {
	        this.getContentPane().setLayout( layoutMain );
	        panelCenter.setLayout( null );
	        this.setSize( new Dimension(400, 300) );
	        this.setTitle( "Update Role" );
	        jLabel1.setText("Enter New Role Name");
	        jLabel1.setBounds(new Rectangle(35, 50, 100, 25));
	        updateRole_arp.setBounds(new Rectangle(125, 50, 225, 20));
	        updateButton_arp.setText("Update");
	        updateButton_arp.setBounds(new Rectangle(147, 125, 105, 35));
	        updateButton_arp.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    update_arp_actionPerformed(e);
	                   
	                    
	                }
	            });
	        panelCenter.add(updateButton_arp, null);
	        panelCenter.add(updateRole_arp, null);
	        panelCenter.add(jLabel1, null);
	        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
	    }

	   

	    private void update_arp_actionPerformed(ActionEvent e) {
	    	String ro = null;
	    	String rn=updateRole_arp.getText();
	    	RoleDetails rd=new RoleDetails(rn);
	    	
	    	switch(index)
	    	{
	    	case 0: ro="Admin";
	    		break;
	    	case 1: ro="Professor";
	    		break;
	    	case 2:ro="Editor";
	    		break;
	    	case 3: ro="Presentor";
	    		break;	    	
	    	}
	    	updateRole ur= new updateRole();
	    	AdminBusiness.updateRole(ro,rn );
	    	JOptionPane.showMessageDialog(ur,"Sucessfully updated  "+ ro +" to " + rn);
	      	this.dispose();
	    	 }

	    }

