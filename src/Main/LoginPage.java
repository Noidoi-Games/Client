package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginBtn = new JButton("LOGIN");
    JButton registerBtn = new JButton("REGISTER");
    JButton resetBtn = new JButton("Forgot your password?");
    JButton createBtn = new JButton("Don't have an account? Create one here!");
    JTextField idField = new JTextField();
    JPasswordField passField = new JPasswordField();
    JLabel idLabel = new JLabel("User:");
    JLabel passLabel = new JLabel("Password:");
    JLabel msgLabel = new JLabel("");
    JLabel mipLabel = new JLabel();
    HashMap<String, String> logininfo = new HashMap<String, String>();
    ImageIcon logoIconPng = new ImageIcon("logo2.png");

    LoginPage(HashMap<String, String> loginInfoOg) {


        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon("logo.png"));
        Dimension logoLabelSize = logoLabel.getPreferredSize();
        logoLabel.setBounds(50, 50, logoLabelSize.width, logoLabelSize.height);

        JLabel videoLabel = new JLabel();
        videoLabel.setIcon(new ImageIcon("duck2.gif"));
        Dimension videoLabelSize = logoLabel.getPreferredSize();
        videoLabel.setBounds(-200, -200, 1000, 1000);

        logininfo = loginInfoOg;

        frame.add(idLabel);
        frame.add(passLabel);
        frame.add(msgLabel);
        frame.add(idField);
        frame.add(passField);
        frame.add(loginBtn);
        frame.add(registerBtn);
        frame.add(resetBtn);
        frame.add(createBtn);
        frame.add(logoLabel);
        frame.add(mipLabel);
        frame.add(videoLabel);
        frame.setIconImage(logoIconPng.getImage());

        mipLabel.setBounds(20, 75, 335, 200);
        mipLabel.setVisible(false);
        mipLabel.setOpaque(true);
        mipLabel.setBackground(Color.decode("#604269"));

        idLabel.setBounds(50, 125, 75, 25);
        idLabel.setForeground(Color.WHITE);

        passLabel.setBounds(50, 175, 75, 25);
        passLabel.setForeground(Color.WHITE);

        msgLabel.setBounds(125, 120, 200, 35);
        msgLabel.setFont(new Font(null, Font.ITALIC, 15));
        msgLabel.setForeground(Color.pink);

        idField.setBounds(125, 125, 200, 25);
        idField.setFont(new Font("Roboto", Font.PLAIN, 17));
        idField.setBorder(null);

        passField.setBounds(125, 175, 200, 25);
        passField.setBorder(null);

        loginBtn.setBounds(145, 225, 100, 25);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(this);
        loginBtn.setOpaque(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setBorder(new RoundedBorder(5, Color.YELLOW));
        loginBtn.setForeground(Color.YELLOW);
        loginBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        registerBtn.setBounds(145, 225, 100, 25);
        registerBtn.setVisible(false);
        registerBtn.setFocusable(false);
        registerBtn.addActionListener(this);
        registerBtn.setOpaque(false);
        registerBtn.setContentAreaFilled(false);
        registerBtn.setBorder(new RoundedBorder(5, Color.YELLOW));
        registerBtn.setForeground(Color.YELLOW);
        registerBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        resetBtn.setBounds(90, 275, 200, 15);
        resetBtn.setFocusable(false);
        resetBtn.addActionListener(this);
        resetBtn.setContentAreaFilled(false);
        resetBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        resetBtn.setForeground(Color.WHITE);
        resetBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        createBtn.setBounds(70, 300, 250, 15);
        createBtn.setFocusable(false);
        createBtn.addActionListener(this);
        createBtn.setContentAreaFilled(false);
        createBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        createBtn.setForeground(Color.WHITE);
        createBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#7d4d7b"));
        frame.setSize(390, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == idField || e.getSource() == passField ) {
            msgLabel.setVisible(false);
        }

        if(e.getSource() == createBtn) {
            clearUserAndPass();

            loginBtn.setVisible(false);
            registerBtn.setVisible(true);
        }

        if(e.getSource() == registerBtn) {
            String id = idField.getText();
            String pass = String.copyValueOf(passField.getPassword());

            if(logininfo.get(id)==null) {
                logininfo.put(id, pass);

                clearUserAndPass();

                registerBtn.setVisible(false);
                loginBtn.setVisible(true);

            }
            else {
                clearUserAndPass();
                msgLabel.setText("User already in use!");
            }
        }

        if(e.getSource() == loginBtn) {
            String id = idField.getText();
            String pass = String.copyValueOf(passField.getPassword());

            if(logininfo.containsKey(id)) {
                if(logininfo.get(id).equals(pass)) {
                    msgLabel.setText("Login successful!");

                    frame.dispose();

                    ClientPage welcomePage = new ClientPage();
                } else {
                    clearUserAndPass();
                    msgLabel.setText("Wrong password!");
                }
            } else {
                clearUserAndPass();
                msgLabel.setText("User not found!");
            }
        }

    }

    private void clearUserAndPass() {
        idField.setText("");
        passField.setText("");
    }

}
