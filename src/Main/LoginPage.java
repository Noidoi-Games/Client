package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.border.*;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginBtn = new JButton("LOGIN");
    JButton resetBtn = new JButton("REGISTER");
    JTextField idField = new JTextField();
    JPasswordField passField = new JPasswordField();
    JLabel idLabel = new JLabel("User:");
    JLabel passLabel = new JLabel("Password:");
    JLabel msgLabel = new JLabel("");

    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOg) {
        logininfo = loginInfoOg;

        frame.add(idLabel);
        frame.add(passLabel);
        frame.add(msgLabel);
        frame.add(idField);
        frame.add(passField);
        frame.add(loginBtn);
        frame.add(resetBtn);

        JLabel logoLabel = new JLabel();
        //logoLabel.setIcon(new ImageIcon(new ImageIcon("logo.png").getImage().getScaledInstance(100, 34, Image.SCALE_DEFAULT)));
        logoLabel.setIcon(new ImageIcon("logo.png"));
        Dimension size = logoLabel.getPreferredSize();
        logoLabel.setBounds(50, 25, size.width, size.height);
        frame.add(logoLabel);

        //frame.add(new JLabel(new ImageIcon("logo.png")));

        ImageIcon logoIconPng = new ImageIcon("logo2.png");
        frame.setIconImage(logoIconPng.getImage());



        idLabel.setBounds(50, 100, 75, 25);
        idLabel.setForeground( Color.white );
        passLabel.setBounds(50, 150, 75, 25);
        passLabel.setForeground( Color.white );

        msgLabel.setBounds(125, 250, 250, 35);
        msgLabel.setFont(new Font(null, Font.ITALIC, 15));

        idField.setBounds(125, 100, 200, 25);
        idField.setBorder(null);

        passField.setBounds( 125, 150, 200, 25);
        passField.setBorder(null);

        loginBtn.setBounds(50, 200, 100, 25);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(this);
        loginBtn.setOpaque(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setBorder(new RoundedBorder(5, Color.YELLOW));
        loginBtn.setForeground(Color.YELLOW);


        resetBtn.setBounds(225, 200, 100, 25);
        resetBtn.setFocusable(false);
        resetBtn.addActionListener(this);
        resetBtn.setOpaque(false);
        resetBtn.setContentAreaFilled(false);
        resetBtn.setBorder(new RoundedBorder(5, Color.YELLOW));
        resetBtn.setForeground(Color.YELLOW);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#7d4d7b"));
        frame.setSize(390, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetBtn) {
            idField.setText("");
            passField.setText("");
        }

        if(e.getSource()==loginBtn) {
            String id = idField.getText();
            String pass = String.copyValueOf(passField.getPassword());

            if(logininfo.containsKey(id)) {
                if(logininfo.get(id).equals(pass)) {
                    msgLabel.setForeground(Color.red);
                    msgLabel.setText("Login successful!");
                    WelcomePage welcomePage = new WelcomePage();
                }
                else {
                    msgLabel.setForeground(Color.red);
                    msgLabel.setText("Wrong password!");
                }
            }
            else {
                msgLabel.setForeground(Color.red);
                msgLabel.setText("User not found!");
            }
        }
    }
}
