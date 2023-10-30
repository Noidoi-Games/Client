package Main;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel auxLabel = new JLabel("Deez nuts!");

    WelcomePage(){
        auxLabel.setBounds(0, 0, 200, 35);
        auxLabel.setFont(new Font(null, Font.BOLD, 25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(auxLabel);
    }
}
