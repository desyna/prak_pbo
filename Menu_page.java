/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author LENOVO
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu_page extends JFrame implements ActionListener{
    JFrame frame = new JFrame();
    JPanel panel;
    JLabel labelstatus;
    JButton btnBack;
    public Menu_page(){
        panel = new JPanel();
        panel.setLayout(null);
        labelstatus = new JLabel("Anda sudah login");
        btnBack = new JButton("Logout");
        
        add(panel);
       
        
        labelstatus.setBounds(95,50,300,30);
        panel.add(labelstatus);
        
        btnBack.setBounds(100, 90, 85, 30);
        btnBack.addActionListener(this);
        panel.add(btnBack);
        
        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBack){
            new Login_page();
            dispose();
        }
    }
}
