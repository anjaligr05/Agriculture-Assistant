package training.bosch.aa.ui;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Presenter_Page extends JFrame {
    String arr[]= {" ","Crop","Type of Topic","Region of Growth","Pesticide","Scientist"};
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JComboBox searchComboBox_pr = new JComboBox(arr);
    private JButton jButton1 = new JButton();
    private JLabel jLabel3 = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JButton jButton2 = new JButton();
    private JTextArea jTextArea1 = new JTextArea();

    public Presenter_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(750, 750));
        this.setTitle( "Presenter" );
        this.setForeground(new Color(71, 169, 64));
        this.setBackground(new Color(173, 233, 237));
        jLabel1.setText("WELCOME PRESENTER");
        jLabel1.setBounds(new Rectangle(185, 50, 230, 85));
        jLabel1.setFont(new Font("Times New Roman", 1, 20));
        jLabel2.setText("Search");
        jLabel2.setBounds(new Rectangle(125, 155, 190, 70));
        jLabel2.setFont(new Font("Times New Roman", 0, 16));
        searchComboBox_pr.setBounds(new Rectangle(210, 180, 325, 25));
        searchComboBox_pr.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jComboBox1_actionPerformed(e);
                }
            });
        jButton1.setText("Enter");
        jButton1.setBounds(new Rectangle(210, 220, 105, 25));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jLabel3.setText("Enter Queries");
        jLabel3.setBounds(new Rectangle(105, 285, 90, 30));
        jScrollPane1.setBounds(new Rectangle(205, 280, 315, 95));
        jButton2.setText("Upload");
        jButton2.setBounds(new Rectangle(215, 390, 110, 30));
        this.getContentPane().add(jButton2, null);
        jScrollPane1.getViewport().add(jTextArea1, null);
        this.getContentPane().add(jScrollPane1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(searchComboBox_pr, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void jComboBox1_actionPerformed(ActionEvent e) {
    }

    private void jLabel3_mouseEntered(MouseEvent e) {
        jLabel3.setForeground(Color.BLUE);
        
        
    }

    private void jLabel3_mouseExited(MouseEvent e) {
        
      jLabel3.setForeground(Color.black);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
    }
}
