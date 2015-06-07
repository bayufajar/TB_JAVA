/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_java;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class LOGIN extends JPanel{
    
    public JTextField txt1;
    public JPasswordField psw1;
    public JLabel label1;
    public JLabel label2;
    public JButton button1;
    public JPanel panel1;
    String [] username = {"fajar", "bayu", "pratama"};
    String[] password = {"fajar", "bayu", "pratama"};
        
    public void init(){
        
        
        try{
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }catch(Exception e){
            
        } 
        label1 = new JLabel("UserName : ");
        label1.setLocation(10,50);
        label1.setSize(label1.getPreferredSize());
        
        label2 = new JLabel("password : ");
        label2.setLocation(10,85);
        label2.setSize(label2.getPreferredSize());
        
        txt1 = new JTextField(15);
        txt1.setLocation(90,50);
        txt1.setSize(txt1.getPreferredSize());
        
        psw1 = new JPasswordField(15);
        psw1.setLocation(90,85);
        psw1.setSize(psw1.getPreferredSize());
     
        
        
        panel1 = new JPanel();
        panel1.setLocation(10,10);
        panel1.setSize(140,80);
        panel1.setBorder(BorderFactory.createTitledBorder(""));
        panel1.setBackground(Color.white);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(txt1);
        panel1.add(psw1);
        add(panel1);
        
        
   
        setBackground(Color.white);
    }
    
}
