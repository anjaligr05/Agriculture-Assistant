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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JToolBar;

public class Schedule_Page extends JFrame {
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
    private ImageIcon imageOpen = new ImageIcon(Schedule_Page.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(Schedule_Page.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(Schedule_Page.class.getResource("help.gif"));
    private JTable scheduleTable_sp = new JTable(18,6);
    private JButton updateButton_sp = new JButton();

    public Schedule_Page() {
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
        this.setSize(new Dimension(641, 531));
        this.setTitle( "Shedule Events" );
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
        scheduleTable_sp.setBounds(new Rectangle(10, 10, 615, 380));
        scheduleTable_sp.setBorder(BorderFactory.createLineBorder(Color.black,
                    1));
        updateButton_sp.setText("Update");
        updateButton_sp.setBounds(new Rectangle(252, 410, 135, 20));
        updateButton_sp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
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
        panelCenter.add(updateButton_sp, null);
        panelCenter.add(scheduleTable_sp, null);
        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
      scheduleTable_sp.setValueAt("Event_Id", 0, 0) ;
      scheduleTable_sp.setValueAt("Event_Details", 0, 1) ;
      scheduleTable_sp.setValueAt("Date of Event", 0, 2) ;
      scheduleTable_sp.setValueAt("Time of Event", 0, 3) ;
      scheduleTable_sp.setValueAt("Location", 0, 4) ;
      scheduleTable_sp.setValueAt("Presenter Name", 0, 5) ;
    }



    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    void helpAbout_ActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, new Schedule_Page_AboutBoxPanel1(), "About", JOptionPane.PLAIN_MESSAGE);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
    }
}
