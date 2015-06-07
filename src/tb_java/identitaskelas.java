package tb_java;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class identitaskelas extends JPanel {
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public JLabel lnamakelas;
    public JLabel lalamat;
    public JLabel llokasi;
    public JTextField txt1;
    public JTextField txt2;
    public JTextField txt3;
    public JPanel gb;
    public identitaskelas(){
    
    lnamakelas = new JLabel("nama kelas : ");
    lnamakelas.setLocation(10,35);
    lnamakelas.setSize(lnamakelas.getPreferredSize());
    
    
    lalamat = new JLabel("alamat kelas : ");
    lalamat.setLocation(10,75);
    lalamat.setSize(lalamat.getPreferredSize());
   
    llokasi = new JLabel("Fakultas : ");
    llokasi.setLocation(10,115);
    llokasi.setSize(llokasi.getPreferredSize());
    
    txt1 = new JTextField(20);
    txt1.setLocation(120,30);
    txt1.setSize(txt1.getPreferredSize());
    
    txt2 = new JTextField(20);
    txt2.setLocation(120,70);
    txt2.setSize(txt2.getPreferredSize());
    
    txt3 = new JTextField(20);
    txt3.setLocation(120,110);
    txt3.setSize(txt3.getPreferredSize());
    add(lnamakelas);
    add(lalamat);
    add(llokasi);
    add(txt1);
    add(txt2);
    add(txt3);
    gb = new JPanel();
    gb.setLocation(110,5);
    gb.setSize(340,150);
    gb.setBackground(Color.white);
    gb.setBorder(BorderFactory.createTitledBorder("identitas"));
    
    
    add(gb);
    setBackground(Color.white);
    setBorder(BorderFactory.createEtchedBorder());
    setLayout(null);
   
    
    }
}
