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

public class kenyamananruangkelas extends JPanel{
    
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JComboBox cb1;
    public JComboBox cb2;
    public JComboBox cb3;
    public JComboBox cb4;
    public JComboBox cb5;
    
    
    public kenyamananruangkelas(){
        
        String[] pilihan = {"ya", "tidak"};
        
        
        //kebisingan
        label1 = new JLabel("kebisingan : ");
        label1.setLocation(25,25);
        label1.setSize(label1.getPreferredSize());
        add(label1);
        cb1 = new JComboBox(pilihan);
        cb1.setLocation(110,20);
        cb1.setSize(100,30);
        add(cb1);
        RKS.setKebisingan((String) cb1.getSelectedItem());
        //bau
        label2 = new JLabel("bau");
        label2.setLocation(25,65);
        label2.setSize(label2.getPreferredSize());
        add(label2);
        cb2 = new JComboBox(pilihan);
        cb2.setLocation(110,60);
        cb2.setSize(100,30);
        add(cb2);
        RKS.setBau((String) cb2.getSelectedItem());
        //kebocoran
        label3 = new JLabel("kebocoran : ");
        label3.setLocation(25,95);
        label3.setSize(label3.getPreferredSize());
        add(label3);
        cb3 = new JComboBox(pilihan);
        cb3.setLocation(110,90);
        cb3.setSize(100,30);
        add(cb3);
        RKS.setKebocoran((String) cb3.getSelectedItem()); 
        
        //kerusakan
        label4 = new JLabel("kerusakan : ");
        label4.setLocation(25,125);
        label4.setSize(label4.getPreferredSize());
        add(label4);
        cb4 = new JComboBox(pilihan);
        cb4.setLocation(110,120);
        cb4.setSize(100,30);
        add(cb4);
        RKS.setKerusakan((String) cb4.getSelectedItem()); 
        
        setBackground(Color.white);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);

    }
}
