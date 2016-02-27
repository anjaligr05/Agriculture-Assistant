package training.bosch.aa.ui;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToolBar;

public class ViewEditUsers_Page extends JFrame {
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
    private ImageIcon imageOpen = new ImageIcon(ViewEditUsers_Page.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(ViewEditUsers_Page.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(ViewEditUsers_Page.class.getResource("help.gif"));
    private JTable viewEditTable_veup = new JTable(18,5);
    private JButton updateButton_veup = new JButton();
    private JButton deleteButton_veup = new JButton();

    public ViewEditUsers_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        this.getContentPane().setLayout( layoutMain );
        panelCenter.setLayout( null );
        this.setSize(new Dimension(575, 470));
        this.setTitle( "View/Edit Roles" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        menuHelp.setText( "Help" );
        menuHelpAbout.setText( "About" );
        menuHelpAbout.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { helpAbout_ActionPerformed( ae ); } } );
        statusBar.setText( "" );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        viewEditTable_veup.setBounds(new Rectangle(45, 20, 470, 305));
        viewEditTable_veup.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        viewEditTable_veup.setLayout(null);
        updateButton_veup.setText("Update");
        updateButton_veup.setBounds(new Rectangle(175, 350, 80, 15));
        deleteButton_veup.setText("Delete");
        deleteButton_veup.setBounds(new Rectangle(315, 350, 80, 15));
        deleteButton_veup.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    deleteButton_verp_actionPerformed(e);
                }
            });
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        menuHelp.add( menuHelpAbout );
        menuBar.add( menuHelp );
        this.getContentPane().add( statusBar, BorderLayout.SOUTH );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        panelCenter.add(deleteButton_veup, null);
        panelCenter.add(updateButton_veup, null);
        panelCenter.add(viewEditTable_veup, null);
        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
      viewEditTable_veup.setValueAt("Role", 0, 0) ;
      viewEditTable_veup.setValueAt("Name", 0, 1) ;
      viewEditTable_veup.setValueAt("Phone", 0, 2) ;
      viewEditTable_veup.setValueAt("Email", 0, 3) ;
      viewEditTable_veup.setValueAt("Username", 0, 4) ;
        
        
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    void helpAbout_ActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, new ViewEdit_Roles_AboutBoxPanel1(), "About", JOptionPane.PLAIN_MESSAGE);
    }

    private void jCheckBox1_actionPerformed(ActionEvent e) {
    }

    private void deleteButton_verp_actionPerformed(ActionEvent e) {
    }
}
