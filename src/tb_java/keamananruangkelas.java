/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_java;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keamananruangkelas extends JPanel {

    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in);
    saranaruangkelas SRK = new saranaruangkelas();
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label5;
    public JComboBox cb1;
    public JComboBox cb2;
    public JComboBox cb3;
    public JPanel panel1;
    
  
    public keamananruangkelas() {

        String[] kokoh = {"kokoh", "tidak"};
        String[] kunci = {"ada", "tidak ada"};
        String[] aman = {"aman", "tidak aman"};

        //kekokohan
        label1 = new JLabel("kekokohan : ");
        label1.setLocation(25, 25);
        label1.setSize(label1.getPreferredSize());
        add(label1);
        cb1 = new JComboBox(kokoh);
        cb1.setLocation(110, 20);
        cb1.setSize(100, 30);
        add(cb1);
        RKS.setKekohan((String) cb1.getSelectedItem()); 
        //kunci
        label2 = new JLabel("kunci : ");
        label2.setLocation(25, 65);
        label2.setSize(label2.getPreferredSize());
        add(label2);
        cb2 = new JComboBox(kunci);
        cb2.setLocation(110, 60);
        cb2.setSize(100, 30);
        add(cb2);
        RKS.setKPJ((String) cb2.getSelectedItem());
        //keamanan
        label3 = new JLabel("keamanan : ");
        label3.setLocation(25, 105);
        label3.setSize(label3.getPreferredSize());
        add(label3);
        cb3 = new JComboBox(aman);
        cb3.setLocation(110, 100);
        cb3.setSize(100, 30);
        add(cb3);
        RKS.setKeamanan((String) cb3.getSelectedItem());
        
        
        
        panel1 = new JPanel();
        panel1.setLocation(240,25);
        panel1.setSize(250,160);
        panel1.setBackground(Color.white);
        panel1.setBorder(BorderFactory.createTitledBorder("pastikan semua diisi sebelum process"));
        add(panel1);
        
        
        
        
        
        setBackground(Color.white);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);
 
 
    }
}
