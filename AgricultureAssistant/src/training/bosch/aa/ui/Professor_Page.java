package training.bosch.aa.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.ListModel;



public class Professor_Page extends JFrame {
    
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  String chooseArr[] ={"pesticides","rice crop"};
 
  
    private JLabel jLabel1 = new JLabel();
    private JButton logoutButton_pp = new JButton();
    private JTabbedPane jTabbedPane1 = new JTabbedPane();
    private JList reviewList_pp = new JList(chooseArr);
    private JList jList3 = new JList();
    private JPanel jPanel1 = new JPanel();
    private JList queriesList_pp = new JList();


    public Professor_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        
        
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(750, 750));
        this.setTitle( "Professor" );
        
        jLabel1.setText("WELCOME PROFESSOR");
        jLabel1.setBounds(new Rectangle(267, 0, 215, 45));
        jLabel1.setFont(new Font("Tahoma", 1, 17));
        logoutButton_pp.setText("Logout");
        logoutButton_pp.setBounds(new Rectangle(1155, 10, 115, 30));
        logoutButton_pp.setMaximumSize(new Dimension(67, 21));
        logoutButton_pp.setMinimumSize(new Dimension(67, 21));
        jTabbedPane1.setBounds(new Rectangle(0, 110, 1280, 870));


        jList3.setBounds(new Rectangle(110, 120, 1270, 815));
        jTabbedPane1.addTab("Review Artefacts", reviewList_pp);
        jPanel1.add(queriesList_pp, null);
        jTabbedPane1.addTab("Reply to Queries", jPanel1);
        this.getContentPane().add(jTabbedPane1, null);
        this.getContentPane().add(logoutButton_pp, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jList3, null);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }




      private void jButton1_actionPerformed(ActionEvent e) {
      }
      
      public Component getListCellRendererComponent(
           JList list,           // the list
           Object value,            // value to display
           int index,               // cell index
           boolean isSelected,      // is the cell selected
           boolean cellHasFocus)    // does the cell have focus
         {
             String s = value.toString();
             
             
             if (isSelected) {
                 System.out.println("pesticide selected");
             } else {
               System.out.println("rice crop selected");
             }
             setEnabled(list.isEnabled());
             setFont(list.getFont());
             
             return this;
         }


      private void reviewList_pp_mouseClicked(MouseEvent e) {
          
        ListModel model = reviewList_pp.getModel();
         
         //    System.out.println(model.getElementAt(reviewList_pp.getSelectedIndex()));
        int index= reviewList_pp.getSelectedIndex();
        System.out.println(index);

          
      }

  
    }

