package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientPage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel userLabel = new JLabel("user!");
    JLabel discoverBtn = new JLabel("BROWSE");
    JButton orderBtn = new JButton("ORDER");
    JButton priceBtn = new JButton("PRICE");
    JButton discountBtn = new JButton("DISCOUNT%");
    JLabel leftLabel = new JLabel();


    ClientPage(){
        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon("logo.png"));
        Dimension logoLabelSize = logoLabel.getPreferredSize();
        logoLabel.setBounds(50, 25, logoLabelSize.width, logoLabelSize.height);

        //JLabel ktpBgLabel = new JLabel();
        //ktpBgLabel.setIcon(new ImageIcon("ktp-bg.png"));
        //Dimension ktpBgSize = ktpBgLabel.getPreferredSize();
        //ktpBgLabel.setBounds(200, 0, ktpBgSize.width, ktpBgSize.height);

        //frame.add(auxLabel);
        frame.add(discoverBtn);
        frame.add(logoLabel);
        frame.add(leftLabel);
        frame.add(orderBtn);
        frame.add(priceBtn);
        frame.add(discountBtn);
        //frame.add(ktpBgLabel);

        // userLabel.setBounds(750, 0, 200, 35);
        // userLabel.setFont(new Font(null, Font.BOLD, 15));

        leftLabel.setBounds(0, 0, 200, 650);
        leftLabel.setVisible(true);
        leftLabel.setOpaque(true);
        leftLabel.setBackground(Color.decode("#64466b"));

        discoverBtn.setBounds(475, 25, 100, 35);
        discoverBtn.setFont(new Font(null, Font.BOLD, 20));
        discoverBtn.setFocusable(false);
        discoverBtn.setOpaque(false);
        discoverBtn.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        discoverBtn.setForeground(Color.WHITE);

        orderBtn.setBounds(350, 100, 100, 25);
        orderBtn.setFont(new Font(null, Font.BOLD, 12));
        orderBtn.setFocusable(false);
        orderBtn.addActionListener(this);
        orderBtn.setOpaque(false);
        orderBtn.setContentAreaFilled(false);
        orderBtn.setBorder(new RoundedBorder(5, Color.YELLOW));
        orderBtn.setForeground(Color.YELLOW);
        orderBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        priceBtn.setBounds(475, 100, 100, 25);
        priceBtn.setFont(new Font(null, Font.BOLD, 12));
        priceBtn.setFocusable(false);
        priceBtn.addActionListener(this);
        priceBtn.setOpaque(false);
        priceBtn.setContentAreaFilled(false);
        priceBtn.setBorder(new RoundedBorder(5, Color.YELLOW));
        priceBtn.setForeground(Color.YELLOW);
        priceBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        discountBtn.setBounds(600, 100, 100, 25);
        discountBtn.setFont(new Font(null, Font.BOLD, 12));
        discountBtn.setFocusable(false);
        discountBtn.addActionListener(this);
        discountBtn.setOpaque(false);
        discountBtn.setContentAreaFilled(false);
        discountBtn.setBorder(new RoundedBorder(5, Color.YELLOW));
        discountBtn.setForeground(Color.YELLOW);
        discountBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#7d4d7b"));
        frame.setLocationRelativeTo(null);
        frame.setSize(850, 650);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
