package training.bosch.aa.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import training.bosch.aa.business.AdminBusiness;
import training.bosch.aa.domain.RoleDetails;

public class ViewEditRolename_Page extends JFrame {
    
    private static String arr1[]={"Admin","Professor","Editor","Presenter"};
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JList roleList_verp = new JList(arr1);
    
    private JButton update = new JButton();
    private JButton delete = new JButton();

    public ViewEditRolename_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
       
        this.getContentPane().setLayout( layoutMain );
        panelCenter.setLayout( null );
        this.setSize(new Dimension(400, 360));
        this.setTitle( "View/Edit Rolenames" );
       
        roleList_verp.setBounds(new Rectangle(70, 15, 250, 165));
        update.setText("Update");
        update.setBounds(new Rectangle(60, 215, 100, 30));
        update.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    update_actionPerformed(e);
                }
            });
        delete.setText("Delete");
        delete.setBounds(new Rectangle(230, 215, 90, 30));
        delete.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    delete_actionPerformed(e);
                }
            });
    
        panelCenter.add(delete, null);
        panelCenter.add(update, null);
        panelCenter.add(roleList_verp, null);
        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
    }

  

    private void update_actionPerformed(ActionEvent e) {
        int index=roleList_verp.getSelectedIndex();
    	JFrame newjf=new updateRole(index);
    	newjf.setVisible(true);
    	
    }

    private void delete_actionPerformed(ActionEvent e) {
    	 int index=roleList_verp.getSelectedIndex();
    	 String ro = null;
    	 switch(index)
	    	{case 0: ro="Admin";
	    		break;
	    	case 1: ro="Professor";
	    		break;
	    	case 2:ro="Editor";
	    		break;
	    	case 3: ro="Presentor";
	    		break;	    	
	    	}
    	 ViewEditRolename_Page ur= new ViewEditRolename_Page();
    	 AdminBusiness.deleteRole(ro);
    	 arr1[index]=null;
    	 JList roleList_verp = new JList(arr1);
    	 System.out.println(arr1);
    	 JOptionPane.showMessageDialog(ur,"Sucessfully deleted  "+ ro );
    	 
    	 
    }
}
