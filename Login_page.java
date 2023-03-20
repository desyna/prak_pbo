/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author LENOVO
 */
public class Login_page extends JFrame implements ActionListener {

    JLabel user, pass, title, msg;
    JButton login, reset;
    JTextField userform;
    JPasswordField passform;
    JFrame frame = new JFrame();

    Login_page() {

        JPanel panel = new JPanel();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.add(panel);
        panel.setLayout(null);

        title = new JLabel("Login");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        user = new JLabel("Username");
        pass = new JLabel("Password");
        title.setBounds(120, 10, 85, 30);
        user.setBounds(20, 40, 85, 30);
        pass.setBounds(20, 70, 85, 30);
        panel.add(title);
        panel.add(user);
        panel.add(pass);

        userform = new JTextField();
        userform.setBounds(95, 45, 165, 25);
        panel.add(userform);

        passform = new JPasswordField();
        passform.setBounds(95, 75, 165, 25);
        panel.add(passform);

        login = new JButton("Login");
        reset = new JButton("Reset");
        login.setBounds(60, 110, 85, 30);
        reset.setBounds(155, 110, 85, 30);
        login.addActionListener(this);
        reset.addActionListener(this);
        panel.add(login);
        panel.add(reset);
        
        msg = new JLabel("");
        msg.setBounds(0, 150, 300, 30);
        panel.add(msg);

        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Login_page lp = new Login_page();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userform.getText();
        String password = String.valueOf(passform.getPassword());
        if (e.getSource() == reset) {
            userform.setText("");
            passform.setText("");
        }
        if ("desy".equals(username) && "123210083".equals(password)) {
            Menu_page mp = new Menu_page();
            frame.dispose();
        } else {
            userform.setText("");
            passform.setText("");
            msg.setText("Username dan password salah");
        }

    }
}
