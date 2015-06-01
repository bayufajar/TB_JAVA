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

    public kebersihanruangkelas() {

        //sirkulasi udara  
        label1 = new JLabel("sirkulasi udara : ");
        label1.setLocation(25, 35);
        label1.setSize(label1.getPreferredSize());
        add(label1);
        txt1 = new JTextField(15);
        txt1.setLocation(150, 30);
        txt1.setSize(txt1.getPreferredSize());
        add(txt1);

        //pencahayaan
        label2 = new JLabel("pencahayaan :");
        label2.setLocation(25, 75);
        label2.setSize(label2.getPreferredSize());
        add(label2);
        txt2 = new JTextField(15);
        txt2.setLocation(150, 70);
        txt2.setSize(txt2.getPreferredSize());
        add(txt2);
        
        //kelembapan
        label3 = new JLabel("kelembapan : ");
        label3.setLocation(25,115);
        label3.setSize(label3.getPreferredSize());
        add(label3);
        txt3 = new JTextField(15);
        txt3.setLocation(150,110);
        txt3.setSize(txt3.getPreferredSize());
        add(txt3);
        label4 = new JLabel("%");
        label4.setLocation(340,115);
        label4.setSize(label4.getPreferredSize());
        add(label4);
        
        
        
        //suhu
        label5 = new JLabel("suhu : ");
        label5.setLocation(25,155);
        label5.setSize(label5.getPreferredSize());
        add(label5);
        txt4 = new JTextField(15);
        txt4.setLocation(150,150);
        txt4.setSize(txt4.getPreferredSize());
        add(txt4);
        
        
        
        setBackground(Color.white);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);
        System.out.print("------KEBERSIHAN RUANG KELAS-----");
        System.out.println("");
        System.out.print("Input Sirkulasi Udara: ");
  //  String udara = input.next();
        //  RKS.setSirkudara(udara);
        //   RKS.analisisudara(udara);
        System.out.print("Input Nilai Pencahayaan: ");
 ///   int pch = input.nextInt();
        //   RKS.setPencahayaan(pch);
        //   RKS.analisiscahaya(pch);
        System.out.print("Input Kelembapan (%): ");
  //  int bab = input.nextInt();
        //   RKS.setKelembapan(bab);
        //   RKS.analisiskelembapan(bab);
        System.out.print("Input Suhu (celcius): ");
  //  int shu = input.nextInt();
        //   RKS.setCelcius(shu);
        //  RKS.analisissuhu(shu);
    }
}
