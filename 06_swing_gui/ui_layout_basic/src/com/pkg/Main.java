package com.pkg;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    private static void placeComponents(JFrame frame, JPanel panel) {

        panel.setLayout(null);

        /// label
        JLabel userLabel = new JLabel("User:");
        // setBounds(x, y, width, height)
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /// input
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        // input
        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // Button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String msg="nothing";
                String userName = userText.getText();
                String password = passwordText.getText();
                msg = userName+","+password;
                JOptionPane.showMessageDialog(frame, msg);
            }
        });


        panel.add(loginButton);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(frame, panel);


        frame.setVisible(true);
    }
}
