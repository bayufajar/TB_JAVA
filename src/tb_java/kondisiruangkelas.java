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




public class kondisiruangkelas extends JPanel{
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public JLabel lpanjang;
    public JLabel llebar;
    public JLabel ljumlahkursi;
    public JLabel ljumlahpintu;
    public JLabel ljumlahjendela;
    public JPanel gb;
    public JTextField txt1 = new JTextField(20);
    public JTextField txt2 = new JTextField(20);
    public JTextField txt3 = new JTextField(20);
    public JTextField txt4 = new JTextField(20);
    public JTextField txt5 = new JTextField(20);
    public kondisiruangkelas(){
        
     lpanjang = new JLabel("panjang : ");
     lpanjang.setLocation(10,35);
     lpanjang.setSize(lpanjang.getPreferredSize());
     
     llebar = new JLabel("lebar : ");
     llebar.setLocation(10,75);
     llebar.setSize(llebar.getPreferredSize());
     
     ljumlahkursi = new JLabel("jumlah kursi : ");
     ljumlahkursi.setLocation(10,115);
     ljumlahkursi.setSize(ljumlahkursi.getPreferredSize());
     
     ljumlahpintu = new JLabel("jumlah pintu : ");
     ljumlahpintu.setLocation(10,155);
     ljumlahpintu.setSize(ljumlahpintu.getPreferredSize());
     
     ljumlahjendela = new JLabel("jumlah jendela : ");
     ljumlahjendela.setLocation(10,195);
     ljumlahjendela.setSize(ljumlahjendela.getPreferredSize());
     
     txt1.setLocation(120,30);
     txt1.setSize(txt1.getPreferredSize());
     
     txt2.setLocation(120,70);
     txt2.setSize(txt2.getPreferredSize());
     
     txt3.setLocation(120,110);
     txt3.setSize(txt3.getPreferredSize());
     
     txt4.setLocation(120,150);
     txt4.setSize(txt4.getPreferredSize());
     txt5.setLocation(120,190);
     txt5.setSize(txt5.getPreferredSize());
     
    gb = new JPanel();
    gb.setLocation(110,5);
    gb.setSize(380,230);
    gb.setBackground(Color.white);
    gb.setBorder(BorderFactory.createTitledBorder("kondisi"));
    
     add(txt4);
     add(txt5);
     add(ljumlahpintu);
     add(ljumlahjendela);
     add(txt3);
     add(txt2);
     add(txt1);
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
