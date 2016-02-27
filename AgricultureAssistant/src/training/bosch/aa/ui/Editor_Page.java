package training.bosch.aa.ui;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Editor_Page extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();

    public Editor_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(739, 655));
        this.setTitle( "Editor" );
        this.setForeground(new Color(0, 132, 0));
        this.setBackground(new Color(91, 237, 187));
        jLabel1.setText("WELCOME EDITOR");
        jLabel1.setBounds(new Rectangle(273, 40, 190, 90));
        jLabel1.setFont(new Font("Times New Roman", 1, 20));
        jLabel2.setText("Add Artefacts");
        jLabel2.setBounds(new Rectangle(90, 175, 160, 55));
        jLabel2.setFont(new Font("Times New Roman", 0, 16));
        jLabel3.setText("Edit Artefacts");
        jLabel3.setBounds(new Rectangle(95, 280, 160, 55));
        jLabel3.setFont(new Font("Times New Roman", 0, 16));
        jTextField1.setBounds(new Rectangle(90, 220, 235, 25));
        jButton1.setText("jButton1");
        jButton1.setBounds(new Rectangle(335, 220, 100, 25));
        jButton2.setText("jButton2");
        jButton2.setBounds(new Rectangle(445, 220, 100, 25));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton2_actionPerformed(e);
                }
            });
        jButton3.setText("jButton3");
        jButton3.setBounds(new Rectangle(625, 15, 100, 25));
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jTextField1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
    }

    private void jButton2_actionPerformed(ActionEvent e) {
    }
}
