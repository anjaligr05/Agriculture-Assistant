package training.bosch.aa.ui;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class ApplicationEntry {
    public ApplicationEntry(JFrame frame) {
    	
    
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        frame.setLocation( ( screenSize.width - frameSize.width ) / 2, ( screenSize.height - frameSize.height ) / 2 );
       // frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setResizable(false);
        frame.setVisible(true);
     
    }

    public static void main(String[] args) {
        try {
      
        	JFrame frame = new Login_Page();
            new ApplicationEntry(frame);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 	catch (Exception e) {
            e.printStackTrace();
        }
      
    }
}
