import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;


public class dateChooserLol extends JFrame {


    private JPanel toPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel mainPanel;
    private JTextField textField1;
    JDateChooser myDateChooser;
    private JLabel myLabel1;
    private JDateChooser elCal;


    public static void main(String[] args) {
        dateChooserLol myFrame = new dateChooserLol();
        myFrame.setContentPane(new dateChooserLol().mainPanel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();



        myFrame.setVisible(true);
    }

    private void createUIComponents() {
        myDateChooser = new JDateChooser();
        myDateChooser.setPreferredSize(new Dimension(150, 20));
        myDateChooser.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        myDateChooser.setBackground(new Color(223,227, 230));

        elCal = new JDateChooser();
        elCal.setPreferredSize(new Dimension(250, 40));
        elCal.setDateFormatString("yyyy-MM-dd HH:mm:ss");
        elCal.setBackground(new Color(223,227, 230));
    }



}
