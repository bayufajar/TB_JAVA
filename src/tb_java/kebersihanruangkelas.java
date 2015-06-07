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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class kebersihanruangkelas extends JPanel {

    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in);
    saranaruangkelas SRK = new saranaruangkelas();
    public JTextField txt1;
    public JTextField txt2;
    public JTextField txt3;
    public JTextField txt4;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JLabel label6;
    public JLabel label7;
    
    String[] forudara = {"lancar", "tidak"};
    public JComboBox cbudara;
     public JSlider slider1;
    public JSlider slider2;
    public JSlider slider3;
    public JLabel nilaislider1;
    public JLabel nilaislider2;
    public JLabel nilaislider3;
    public kebersihanruangkelas() {

        //sirkulasi udara  
        label1 = new JLabel("sirkulasi udara : ");
        label1.setLocation(25, 35);
        label1.setSize(label1.getPreferredSize());
        add(label1);
    //    txt1 = new JTextField(15);
  //      txt1.setLocation(150, 30);
  //      txt1.setSize(txt1.getPreferredSize());
   //     add(txt1);
        cbudara = new JComboBox(forudara);
        cbudara.setLocation(150,30);
        cbudara.setSize(100,30);
        add(cbudara);
        RKS.setSirkudara((String) cbudara.getSelectedItem()); 
        
        
        
        
        //pencahayaan
        label2 = new JLabel("pencahayaan :");
        label2.setLocation(25, 75);
        label2.setSize(label2.getPreferredSize());
        add(label2);
   //     txt2 = new JTextField(15);
    //    txt2.setLocation(150, 70);
   //     txt2.setSize(txt2.getPreferredSize());
   //     add(txt2);
         slider1 = new JSlider();
        slider1.setLocation(150,70);
        slider1.setSize(100,20);
        slider1.setMinimum(250);
        slider1.setMaximum(350);
        slider1.setValue(300);
        slider1.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider1.setText(String.valueOf(slider1.getValue())); 
        RKS.setPencahayaan(slider1.getValue());
         }
     });
     add(slider1);
     
     nilaislider1 = new JLabel("300");
     nilaislider1.setLocation(260,70);
     nilaislider1.setSize(nilaislider1.getPreferredSize());
     add(nilaislider1);
       label6 = new JLabel("%");
        label6.setLocation(285,70);
        label6.setSize(label6.getPreferredSize());
        add(label6);
        
        
        //kelembapan
        label3 = new JLabel("kelembapan : ");
        label3.setLocation(25,115);
        label3.setSize(label3.getPreferredSize());
        add(label3);
  //      txt3 = new JTextField(15);
    //    txt3.setLocation(150,110);
   //     txt3.setSize(txt3.getPreferredSize());
  //      add(txt3);
        
        slider2 = new JSlider();
        slider2.setLocation(150,110);
        slider2.setSize(100,20);
        slider2.setMinimum(70);
        slider2.setMaximum(80);
        slider2.setValue(75);
        slider2.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider2.setText(String.valueOf(slider2.getValue())); 
        RKS.setKelembapan(slider2.getValue()); 
         }
     });
     add(slider2);
     
     nilaislider2 = new JLabel("75");
     nilaislider2.setLocation(260,110);
     nilaislider2.setSize(nilaislider2.getPreferredSize());
     add(nilaislider2);
        label4 = new JLabel("%");
        label4.setLocation(285,110);
        label4.setSize(label4.getPreferredSize());
        add(label4);
        
        
        
        //suhu
        label5 = new JLabel("suhu : ");
        label5.setLocation(25,155);
        label5.setSize(label5.getPreferredSize());
        add(label5);
   //     txt4 = new JTextField(15);
   //     txt4.setLocation(150,150);
   //     txt4.setSize(txt4.getPreferredSize());
   //     add(txt4);
        slider3 = new JSlider();
        slider3.setLocation(150,150);
        slider3.setSize(100,20);
        slider3.setMinimum(25);
        slider3.setMaximum(35);
        slider3.setValue(30);
        slider3.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider3.setText(String.valueOf(slider3.getValue())); 
        RKS.setCelcius(slider3.getValue()); 
         }
     });
     add(slider3);
     
     nilaislider3 = new JLabel("30");
     nilaislider3.setLocation(260,150);
     nilaislider3.setSize(nilaislider3.getPreferredSize());
     add(nilaislider3);
        label4 = new JLabel("C");
        label4.setLocation(285,150);
        label4.setSize(label4.getPreferredSize());
        add(label4);
        
        
        setBackground(Color.white);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);
     
    }
}
