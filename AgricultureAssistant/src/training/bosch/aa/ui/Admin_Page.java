package training.bosch.aa.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Admin_Page extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JToolBar toolBar = new JToolBar();
    private JLabel jLabel1 = new JLabel();
    private JLabel addLabel = new JLabel();
    private JLabel createLabel = new JLabel();
    private JLabel vieweditLabel = new JLabel();
    private JLabel scheduleLabel = new JLabel();
    private JLabel vieweditroleLabel = new JLabel();

    public Admin_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( layoutMain );
        panelCenter.setLayout( null );
        panelCenter.setBackground(Color.white);
        panelCenter.setForeground(Color.white);
        this.setSize(new Dimension(496, 396));
        this.setTitle("Admin");
     
      
        jLabel1.setText("       WELCOME ADMINSTRATOR");
        jLabel1.setBounds(new Rectangle(85, 10, 195, 40));
        addLabel.setText("Add Roles");
        addLabel.setBounds(new Rectangle(105, 100, 185, 30));
        addLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                	   addLabel_mouseClicked(e);
                }
            });
      vieweditLabel.setText("Create Users");
      vieweditLabel.setBounds(new Rectangle(60, 100, 170, 35));
      vieweditLabel.addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent e) {
                  createLabel_mouseClicked(e);
              }
          });
        createLabel.setText("Create Users");
        createLabel.setBounds(new Rectangle(105, 155, 170, 35));
        createLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    createLabel_mouseClicked(e);
                }
            });
        vieweditLabel.setText("View/Edit Users");
        vieweditLabel.setBounds(new Rectangle(105, 190, 205, 20));
        vieweditLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    vieweditLabel_mouseClicked(e);
                }
            });
        scheduleLabel.setText("Schedule Events");
        scheduleLabel.setBounds(new Rectangle(105, 210, 200, 35));
        scheduleLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    scheduleLabel_mouseClicked(e);
                }
            });
        vieweditroleLabel.setText("View/Edit Rolenames");
        vieweditroleLabel.setBounds(new Rectangle(105, 135, 105, 15));
        vieweditroleLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    vieweditroleLabel_mouseClicked(e);
                }
            });
     
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        this.getContentPane().add( panelCenter, BorderLayout.CENTER);
        panelCenter.add(vieweditroleLabel, null);
        panelCenter.add(scheduleLabel, null);
        panelCenter.add(vieweditLabel, null);
        panelCenter.add(createLabel, null);
        panelCenter.add(addLabel, null);
        panelCenter.add(jLabel1, null);
    }

     
  
    

    private void createLabel_mouseClicked(MouseEvent e) {
        JFrame frame=new CreateUsers_Page();
        new ApplicationEntry(frame);
    }

    private void vieweditLabel_mouseClicked(MouseEvent e) {
      JFrame frame=new ViewEditUsers_Page();
      new ApplicationEntry(frame);
    }

    private void scheduleLabel_mouseClicked(MouseEvent e) {
      JFrame frame = new Schedule_Page();
        new ApplicationEntry(frame);
        
    }

    private void addLabel_mouseClicked(MouseEvent e) {
        
      JFrame frame = new AddRole_Page();
        new ApplicationEntry(frame);
    }

    private void vieweditroleLabel_mouseClicked(MouseEvent e) {
      JFrame frame = new ViewEditRolename_Page();
        new ApplicationEntry(frame);
        
    }
}


