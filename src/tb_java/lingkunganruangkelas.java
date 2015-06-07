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

public class lingkunganruangkelas extends JPanel{
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    kebersihanruangkelas krk = new kebersihanruangkelas();
    public JLabel bersih;
    public JLabel keterangan;
    public JLabel llantai;
    public JLabel ldinding;
    public JLabel latap;
    public JLabel lpintu;
    public JLabel ljendela;
    public JComboBox pilihan;
    public JLabel lkesimpulan;
    public JPanel gb;
    public JTextField txt1 = new JTextField(20);
    public JTextField txt2 = new JTextField(20);
    public JTextField txt3 = new JTextField(20);
    public JTextField txt4 = new JTextField(20);
    public JTextField txt5 = new JTextField(20); 
    
    
    
    public lingkunganruangkelas(){
        
        keterangan = new JLabel("Keterangan: ");
        keterangan.setLocation(365, 35);
        keterangan.setSize(keterangan.getPreferredSize());
        
        bersih = new JLabel("Bersih atau Kotor");
        bersih.setLocation(365, 55);
        bersih.setSize(bersih.getPreferredSize());
                
    llantai = new JLabel("Kondisi lantai : ");
     llantai.setLocation(10,35);
     llantai.setSize(llantai.getPreferredSize());
     

     ldinding = new JLabel("Kondisi dinding");
     ldinding.setLocation(10,75);
     ldinding.setSize(ldinding.getPreferredSize());
     
     latap = new JLabel("Kondisi atap : ");
     latap.setLocation(10,115);
     latap.setSize(latap.getPreferredSize());
     
     lpintu = new JLabel("Kondisi pintu : ");
     lpintu.setLocation(10,155);
     lpintu.setSize(lpintu.getPreferredSize());
     
     ljendela = new JLabel("Kondisi jendela : ");

     ldinding = new JLabel("dinding : ");
     ldinding.setLocation(10,75);
     ldinding.setSize(ldinding.getPreferredSize());
     
     latap = new JLabel("atap : ");
     latap.setLocation(10,115);
     latap.setSize(latap.getPreferredSize());
     
     lpintu = new JLabel("pintu : ");
     lpintu.setLocation(10,155);
     lpintu.setSize(lpintu.getPreferredSize());
     
     ljendela = new JLabel("jendela : ");

     ljendela.setLocation(10,195);
     ljendela.setSize(ljendela.getPreferredSize());
     
     lkesimpulan = new JLabel("kesimpulan : ");
     lkesimpulan.setLocation(10,235);
     lkesimpulan.setSize(lkesimpulan.getPreferredSize());
     
     txt1.setLocation(120,30);
     txt1.setSize(txt1.getPreferredSize());
     RKS.setKondlantai(txt1.getText());
     txt2.setLocation(120,70);
     txt2.setSize(txt2.getPreferredSize());
     RKS.setKonddinding(txt2.getText());
     txt3.setLocation(120,110);
     txt3.setSize(txt3.getPreferredSize());
     RKS.setKondatap(txt3.getText());
     txt4.setLocation(120,150);
     txt4.setSize(txt4.getPreferredSize());
     RKS.setKondpintu(txt4.getText());
     txt5.setLocation(120,190);
     txt5.setSize(txt5.getPreferredSize());
     RKS.setKondjendela(txt5.getText());
     
     String[] textcombo = {"bersih", "kotor"};
     pilihan = new JComboBox(textcombo);
     pilihan.setLocation(120,230);
     pilihan.setSize(80,25);
     RKS.setKesimpulan((String) pilihan.getSelectedItem()); 
     
    gb = new JPanel();
    gb.setLocation(110,5);
    gb.setSize(380,225);
    gb.setBackground(Color.white);
    gb.setBorder(BorderFactory.createTitledBorder("kondisi"));
    
    add(bersih); 
    add(keterangan);
     add(txt4);
     add(txt5);
     add(llantai);
     add(ldinding);
     add(txt3);
     add(txt2);
     add(txt1);
     add(latap);
     add(ljendela);
     add(lpintu);
     add(lkesimpulan);
     add(pilihan);
     add(gb);
     setLayout(null);
     setBackground(Color.white);
     setBorder(BorderFactory.createEtchedBorder());
//       System.out.print("-----LINGKUNGAN RUANG KELAS-----");
    //System.out.println("");
 //   System.out.print("Input Kondisi Lantai: ");
  //  String lantai = input.next();
   // RKS.setKondlantai(lantai);
   // System.out.print("Input Kondisi Dinding: ");
   // String dinding = input.next();
   // RKS.setKonddinding(dinding);
   // System.out.print("Input Kondisi Atap: ");
   // String atap = input.next();
   // RKS.setKondatap(atap);
   // System.out.print("Input Kondisi Pintu: ");
   // String pintu = input.next();
    //RKS.setKondpintu(pintu);
   // System.out.print("Input Kondisi Jendela: ");
    //String jendela = input.next();
    //RKS.setKondjendela(jendela);
   /// System.out.print("Kesimpulan(bersih/kotor) : ");
   // String kesimpulan = input.next();
    //RKS.setAnalisislingkungan(kesimpulan);
        
}
    //public String analisislingkungan(){
    //if(RKS.getAnalisislingkungan().equals("bersih")){
     //  kebersihanruangkelas krk = new kebersihanruangkelas();
    //}else{
     //   kebersihanruangkelas krk = new kebersihanruangkelas();
    //}    
      //  return analisislingkungan();
   // }
    }

