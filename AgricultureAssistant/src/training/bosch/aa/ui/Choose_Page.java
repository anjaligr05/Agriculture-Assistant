package training.bosch.aa.ui;

import java.awt.Dimension;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTabbedPane;

public class Choose_Page extends JFrame {

    public Choose_Page() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Choose Artefacts" );
    }
}
