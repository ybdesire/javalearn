package com.pkg;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ////-----------------panel1-----------------------below
        Panel p1 = new Panel();
        p1.setLayout(null);
        p1.setSize(350,150);

        // 3 label
        JLabel label_first_value = new JLabel("First Value");
        label_first_value.setBounds(5,5,80,25);
        p1.add(label_first_value);
        JLabel label_second_value = new JLabel("Second Value");
        label_second_value.setBounds(5,35,80,25);
        p1.add(label_second_value);
        JLabel label_result = new JLabel("Result");
        label_result.setBounds(5,65,80,25);
        p1.add(label_result);
        // 3 input
        JTextField input_first_value = new JTextField(20);
        input_first_value.setBounds(100,5,165,25);
        p1.add(input_first_value);
        JTextField input_second_value = new JTextField(20);
        input_second_value.setBounds(100,35,165,25);
        p1.add(input_second_value);
        JTextField input_result = new JTextField(20);
        input_result.setBounds(100,65,165,25);
        p1.add(input_result);


        ////-----------------panel1-----------------------above





        ////-----------------panel2-----------------------below
        Panel p2 = new Panel();
        p2.setLayout(null);
        p2.setSize(350,50);
        p2.setBackground(Color.BLUE);
        // 5 buttons
        JButton button_plus = new JButton("+");
        button_plus.setBounds(30, 10, 50, 25);
        button_plus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(isNumeric(input_first_value.getText())&&isNumeric(input_second_value.getText())) {
                    double first_value = Double.parseDouble(input_first_value.getText());
                    double second_value = Double.parseDouble(input_second_value.getText());

                    double result = first_value + second_value;
                    input_result.setText("" + result);
                }
            }
        });
        p2.add(button_plus);


        JButton button_minus = new JButton("-");
        button_minus.setBounds(85, 10, 50, 25);
        p2.add(button_minus);


        JButton button_mul = new JButton("*");
        button_mul.setBounds(140, 10, 50, 25);
        p2.add(button_mul);


        JButton button_div = new JButton("/");
        button_div.setBounds(195, 10, 50, 25);
        p2.add(button_div);


        JButton button_clear = new JButton("Clear");
        button_clear.setBounds(250, 10, 70, 25);
        button_clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                input_first_value.setText("");
                input_second_value.setText("");
                input_result.setText("");
            }
        });
        p2.add(button_clear);
        ////-----------------panel2-----------------------above


        frame.add(p1,BorderLayout.CENTER);
        frame.add(p2,BorderLayout.SOUTH);


        frame.setVisible(true);


    }
}
