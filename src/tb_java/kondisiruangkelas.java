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

public class kondisiruangkelas extends JPanel {

    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in);    
    saranaruangkelas SRK = new saranaruangkelas();
    
    public JLabel lpanjang;
    public JLabel llebar;
    public JLabel ljumlahkursi;
    public JLabel ljumlahpintu;
    public JLabel ljumlahjendela;
    public JLabel nilaislider1;
    public JLabel nilaislider2;
    public JLabel nilaislider3;
    public JLabel nilaislider4;
    public JLabel nilaislider5;
    
    public JPanel gb;
    public JTextField txt1 = new JTextField(20);
    public JTextField txt2 = new JTextField(20);
    public JTextField txt3 = new JTextField(20);
    public JTextField txt4 = new JTextField(20);
    public JTextField txt5 = new JTextField(20);
    public JSlider slider1;
    public JSlider slider2;
    public JSlider slider3;
    public JSlider slider4;
    public JSlider slider5;
    
    public kondisiruangkelas() {
        
        lpanjang = new JLabel("panjang : ");
        lpanjang.setLocation(10, 35);
        lpanjang.setSize(lpanjang.getPreferredSize());
        
        llebar = new JLabel("lebar : ");
        llebar.setLocation(10, 75);
        llebar.setSize(llebar.getPreferredSize());
        
        ljumlahkursi = new JLabel("jumlah kursi : ");
        ljumlahkursi.setLocation(10, 115);
        ljumlahkursi.setSize(ljumlahkursi.getPreferredSize());
        
        ljumlahpintu = new JLabel("jumlah pintu : ");
        ljumlahpintu.setLocation(10, 155);
        ljumlahpintu.setSize(ljumlahpintu.getPreferredSize());
        
        ljumlahjendela = new JLabel("jumlah jendela : ");
        ljumlahjendela.setLocation(10, 195);
        ljumlahjendela.setSize(ljumlahjendela.getPreferredSize());

   //  txt1.setLocation(120,30);
        //txt1.setSize(txt1.getPreferredSize());
  //   txt2.setLocation(120,70);
        //  txt2.setSize(txt2.getPreferredSize());
   //  txt3.setLocation(120,110);
        //   txt3.setSize(txt3.getPreferredSize());
 //    txt4.setLocation(120,150);
        //  txt4.setSize(txt4.getPreferredSize());
//     txt5.setLocation(120,190);
        //   txt5.setSize(txt5.getPreferredSize());
        slider1 = new JSlider();
        slider1.setLocation(120, 30);
        slider1.setSize(100, 20);
        slider1.setMinimum(1);
        slider1.setMaximum(10);
        slider1.setValue(1);
        slider1.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent ce) {
                nilaislider1.setText(String.valueOf(slider1.getValue()));                
                RKS.setPanjang(slider1.getValue());                
            }
        });
        add(slider1);
        
        slider2 = new JSlider();
        slider2.setLocation(120, 70);
        slider2.setSize(100, 20);
        slider2.setMinimum(1);
        slider2.setMaximum(10);
        slider2.setValue(1);
        slider2.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent ce) {
                nilaislider2.setText(String.valueOf(slider2.getValue()));                
                RKS.setLebar(slider2.getValue());
            }
        });
        add(slider2);
        
        slider3 = new JSlider();
        slider3.setLocation(120, 110);
        slider3.setSize(100, 20);
        slider3.setMinimum(1);
        slider3.setMaximum(50);
        slider3.setValue(25);
        slider3.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent ce) {
                nilaislider3.setText(String.valueOf(slider3.getValue()));    
                RKS.setJumlah_kursi(slider3.getValue());
            }
        });
        add(slider3);
        
        slider4 = new JSlider();
        slider4.setLocation(120, 150);
        slider4.setSize(100, 20);
        slider4.setMinimum(1);
        slider4.setMaximum(4);
        slider4.setValue(1);
        slider4.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent ce) {
                nilaislider4.setText(String.valueOf(slider4.getValue()));   
                RKS.setJumlah_pintu(slider4.getValue());
            }
        });
        add(slider4);
        
        slider5 = new JSlider();
        slider5.setLocation(120, 190);
        slider5.setSize(100, 20);
        slider5.setMinimum(0);
        slider5.setMaximum(8);
        slider5.setValue(0);
        slider5.addChangeListener(new ChangeListener() {
            
            @Override
            public void stateChanged(ChangeEvent ce) {
                nilaislider5.setText(String.valueOf(slider5.getValue()));   
                RKS.setJumlahjendela(slider5.getValue());
            }
        });
        add(slider5);
        
        nilaislider1 = new JLabel("1");
        nilaislider1.setLocation(240, 30);
        nilaislider1.setSize(nilaislider1.getPreferredSize());
        add(nilaislider1);
        
        nilaislider2 = new JLabel("1");
        nilaislider2.setLocation(240, 70);
        nilaislider2.setSize(nilaislider2.getPreferredSize());
        add(nilaislider2);
        
        nilaislider3 = new JLabel("25");
        nilaislider3.setLocation(240, 110);
        nilaislider3.setSize(nilaislider3.getPreferredSize());
        add(nilaislider3);
        
        nilaislider4 = new JLabel("1");
        nilaislider4.setLocation(240, 150);
        nilaislider4.setSize(nilaislider4.getPreferredSize());
        add(nilaislider4);
        
        nilaislider5 = new JLabel("0");
        nilaislider5.setLocation(240, 190);
        nilaislider5.setSize(nilaislider5.getPreferredSize());
        add(nilaislider5);
        
        gb = new JPanel();
        gb.setLocation(110, 5);
        gb.setSize(380, 230);
        gb.setBackground(Color.white);
        gb.setBorder(BorderFactory.createTitledBorder("kondisi"));
        
        add(txt4);
        add(txt5);
        add(ljumlahpintu);
        add(ljumlahjendela);
        add(txt3);
     //add(txt2);
        //  add(txt1);
        add(lpanjang);
        add(llebar);
        add(ljumlahkursi);
        add(gb);
        setLayout(null);
        setBackground(Color.white);
        setBorder(BorderFactory.createEtchedBorder());
  //  System.out.println("------Kondisi Ruang Kelas-------");
        // System.out.println("");
        //System.out.print("input panjang : ");
        //  int p = input.nextInt();
        //RKS.setPanjang(p);
        //   System.out.print("input lebar : ");
        //  int l = input.nextInt();
        // RKS.setLebar(l);
        // System.out.print("input jumlah kursi : ");
        // int jk = input.nextInt();
        // RKS.setJumlah_kursi(jk);
        // System.out.print("input jumlah pintu : ");
        // int jp = input.nextInt();
        /// System.out.print("input jumlah jendela : ");
        // int jl = input.nextInt();
        // RKS.setJumlahjendela(jl);
        //System.out.println("");
        //RKS.luas(l*p);
        // RKS.rasioluas(RKS.luas(l*p)/jl);
    }
}
