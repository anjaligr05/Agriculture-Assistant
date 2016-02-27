package training.bosch.aa.ui;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class UpdateQuerise_Page extends JFrame {

    private JTextArea jTextArea1 = new JTextArea();
    private JLabel jLabel1 = new JLabel();
    private JButton jButton1 = new JButton();

    public UpdateQuerise_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(750, 750));
        this.setTitle( "Update Queries" );
        jTextArea1.setBounds(new Rectangle(60, 120, 505, 375));
        jLabel1.setText("Enter Feedback Queries");
        jLabel1.setBounds(new Rectangle(60, 80, 245, 25));
        jLabel1.setFont(new Font("Times New Roman", 0, 16));
        jButton1.setText("Upload");
        jButton1.setBounds(new Rectangle(460, 450, 90, 30));
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jTextArea1, null);
    }
}
