package tb_java;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class saranaruangkelas extends JPanel {

    Scanner input = new Scanner(System.in);
    ruangkelasetget RKS = new ruangkelasetget();
    indukinterface iif = new forpolimorfis();

    public JTextField txt1;
    public JTextField txt2;
    public JTextField txt3;
    public JTextField txt4;
    public JTextField txt5;
    public JTextField txt6;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JLabel label6;
    public JPanel panelbg;
    public JPanel panelbg1;
    public JPanel panelbg2;
    public JComboBox cbsteker;
    public JComboBox cbstekerkondisi;
    public JComboBox cbkabel;
    public JComboBox cbkabelkondisi;
    public JComboBox cblampu;
    public JComboBox cblampukondisi;
    public JComboBox cbAC;
    public JComboBox cbACkondisi;
    public JComboBox cbkipasangin;
    public JComboBox cbkipasanginkondisi;
    public JComboBox cbCCTV;
    public JComboBox cbCCTVkondisi;
    public JComboBox cbSSID;
    public JComboBox cbbandwith;
    public JLabel label7;
    public saranaruangkelas() {

        String[] Posisi = {"di depan", "di samping", "dibelakang","diatap"};
        String[] kondisi = {"baik", "rusak"};
        String[] bandwith = {"512 KB", "1 MB", "2 MB", "3 MB", "5 MB", "10 MB"};
        String[] SSID = {"UMM Hotspot", "UMM Premium", "wifi.id", "LAB. Informatika"};
        
        //steker
        label1 = new JLabel("steker : ");
        label1.setLocation(25, 25);
        label1.setSize(label1.getPreferredSize());
        add(label1);
        txt1 = new JTextField(10);
        txt1.setLocation(110, 20);
        txt1.setSize(txt1.getPreferredSize());

        cbsteker = new JComboBox(Posisi);
        cbsteker.setLocation(250, 20);
        cbsteker.setSize(100, 30);
        add(cbsteker);

        cbstekerkondisi = new JComboBox(kondisi);
        cbstekerkondisi.setLocation(370, 20);
        cbstekerkondisi.setSize(80, 30);
        add(cbstekerkondisi);

        //kabel
        label2 = new JLabel("Kabel LCD : ");
        label2.setLocation(25,55);
        label2.setSize(label2.getPreferredSize());
        add(label2);
        txt2 = new JTextField(10);
        txt2.setLocation(110,50);
        txt2.setSize(txt2.getPreferredSize());
        add(txt2);
        cbkabel = new JComboBox(Posisi);
        cbkabel.setLocation(250,50);
        cbkabel.setSize(100,30);
        add(cbkabel);
        cbkabelkondisi = new JComboBox(kondisi);
        cbkabelkondisi.setLocation(370,50);
        cbkabelkondisi.setSize(80,30);
        add(cbkabelkondisi);
        
        
        //lampu
        label3 = new JLabel("lampu : ");
        label3.setLocation(25,85);
        label3.setSize(label3.getPreferredSize());
        add(label3);
        txt3 = new JTextField(10);
        txt3.setLocation(110,80);
        txt3.setSize(txt3.getPreferredSize());
        add(txt3);
        cblampu = new JComboBox(Posisi);
        cblampu.setLocation(250,80);
        cblampu.setSize(100,30);
        add(cblampu);
        cblampukondisi = new JComboBox(kondisi);
        cblampukondisi.setLocation(370,80);
        cblampukondisi.setSize(80,30);
        add(cblampukondisi);
        
        //kipas angin
        label4 = new JLabel("kipas angin : ");
        label4.setLocation(25,115);
        label4.setSize(label4.getPreferredSize());
        add(label4);
        txt4 = new JTextField(10);
        txt4.setLocation(110,110);
        txt4.setSize(txt4.getPreferredSize());
        add(txt4);
        cbkipasangin = new JComboBox(Posisi);
        cbkipasangin.setLocation(250,110);
        cbkipasangin.setSize(100,30);
        add(cbkipasangin);
        cbkipasanginkondisi = new JComboBox(kondisi);
        cbkipasanginkondisi.setLocation(370,110);
        cbkipasanginkondisi.setSize(80,30);
        add(cbkipasanginkondisi);
        
        
        //AC
        label5 = new JLabel("AC : ");
        label5.setLocation(25,145);
        label5.setSize(label5.getPreferredSize());
        add(label5);
        txt5 = new JTextField(10);
        txt5.setLocation(110,140);
        txt5.setSize(txt5.getPreferredSize());
        add(txt5);
        cbAC = new JComboBox(Posisi);
        cbAC.setLocation(250,140);
        cbAC.setSize(100,30);
        add(cbAC);
        cbACkondisi = new JComboBox(kondisi);
        cbACkondisi.setLocation(370,140);
        cbACkondisi.setSize(80,30);
        add(cbACkondisi);
        
        //CCTV
        label6 = new JLabel("CCTV : ");
        label6.setLocation(25,175);
        label6.setSize(label6.getPreferredSize());
        add(label6);
        txt6 = new JTextField(10);
        txt6.setLocation(110,170);
        txt6.setSize(txt6.getPreferredSize());
        add(txt6);
        cbCCTV = new JComboBox(Posisi);
        cbCCTV.setLocation(250,170);
        cbCCTV.setSize(100,30);
        add(cbCCTV);
        cbCCTVkondisi = new JComboBox(kondisi);
        cbCCTVkondisi.setLocation(370,170);
        cbCCTVkondisi.setSize(80,30);
        add(cbCCTVkondisi);
        
        
        //WIFI
        label7 = new JLabel("SSID");
        label7.setLocation(25,205);
        label7.setSize(label7.getPreferredSize());
        add(label7);
        cbSSID = new JComboBox(SSID);
        cbSSID.setLocation(110,200);
        cbSSID.setSize(130,30);
        add(cbSSID);
        cbbandwith = new JComboBox(bandwith);
        cbbandwith.setLocation(250,200);
        cbbandwith.setSize(100,30);
        add(cbbandwith);
        
        panelbg = new JPanel();
        panelbg.setLocation(10, 5);
        panelbg.setSize(520, 250);
        panelbg.setBackground(Color.white);
        panelbg.setBorder(BorderFactory.createTitledBorder(""));

        add(txt1);
        add(panelbg);

        setBackground(Color.white);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);

    //    System.out.println("------Lingkungan Ruang Kelas-------");
        //  System.out.println("");
        // System.out.print("input jumlah stop kontak : ");
        //     int sk = input.nextInt();
        //       RKS.setJumkontak(sk);
        //     
        //     System.out.print("input kondisi stop kontak : ");
        //    String kondsk = input.next();
        //   RKS.setKondkontak(kondsk);
        //  iif.kondisi();
        //      System.out.print("input posisi stop kontak : ");
        //     String posSK = input.next();
        //    RKS.setPoskontak(posSK);
        //    iif.posisi();
        //     if (RKS.getJumkontak() > 4 && RKS.getKondkontak().equals("baik") && RKS.getPoskontak().equals("dekat dosen")) {
        //         return;
        //     } else {
     //   }
        //   System.out.print("input jumlah kabel LCD : ");
        //   int JKB = input.nextInt();
        //   RKS.setKabelLCD(JKB);
        //  System.out.print("input kondisi kabel LCD : ");
        // String KKB = input.next();
        //  RKS.setKondkabLCD(KKB);
        //  iif.kondisi();
        // System.out.print("input posisi kabel LCD : ");
        // String PKB = input.next();
        //  RKS.setPoskabLCD(PKB);
        // iif.posisi();
        //  if (RKS.getKabelLCD() >= 1 && RKS.getKondkabLCD().equals("baik") && RKS.getPoskabLCD().equals("dekat dosen")) {
        //      return;
        //  } else {
        //  }
        //  System.out.print("input jumlah kipas : ");
        //  int JKP = input.nextInt();
        //  RKS.setJumKipas(JKP);
        ///  System.out.print("input kondisi kipas : ");
        //  String KKP = input.next();
        //  RKS.setKondkipas(KKP);
        //  System.out.print("input posisi kipas : ");
        //  String PKKS = input.next();
        //  RKS.setPosKipas(PKKS);
        //  System.out.print("input jumlah lampu");
        // int JLP = input.nextInt();
        //   RKS.setJumLampu(JLP);
        //  System.out.print("kondisi lampu : ");
        //  String KLP = input.next();
        //  RKS.setKondlampu(KLP);
        //   System.out.print("posisi Lampu : ");
        ///   String PLP = input.next();
        //   RKS.setPoslampu(PLP);
        //  if (RKS.getJumLampu() >= 18 && RKS.getKondlampu().equals("baik") && RKS.getPoslampu().equals("atap")) {
        //      return;
        //  } else {
     //   }
        //   System.out.print("Jumlah KIPAS Angin : ");
        // int JKA = input.nextInt();
        //  RKS.setJumKipas(JKA);
        //   System.out.print("kondisi kipas : ");
        //    String baik = input.next();
        ///    RKS.setKondkipas(baik);
        //    System.out.print("posisi kipas : ");
        //   String PKA = input.next();
        //   RKS.setPosKipas(PKA);
        //  if (RKS.getJumKipas() >= 2 && RKS.getKondkipas().equals("baik") && RKS.getPosKipas().equals("atap")) {
        //     return;
        //} else {
        //   }
        //  System.out.print("Jumlah AC : ");
        // int JAC = input.nextInt();
        //RKS.setJumAC(JAC);
        //   System.out.print("kondisi AC : ");
        //   String KAC = input.next();
        //  RKS.setKondAC(KAC);
        // System.out.print("posisi AC : ");
        // String PAC = input.next();
//        RKS.setPosAC(PAC);
//
        //      if (RKS.getJumAC() >= 1 && RKS.getKondAC().equals("baik") && RKS.getPosAC().equals("dibelakang")) {
        //        return;
        //  }
//
        //      System.out.print("pilih SSID : \n1. UMM Hotspot \n2. UMM Premium \n3. haji lulung");
        //    int pssid = input.nextInt();
        //  RKS.setSSID(pssid);
        //System.out.print("besar bandwith : ");
//        int bb = input.nextInt();
        //      RKS.setBandwith(bb);
//
        //      if (RKS.getSSID() == 1) {
        //        return;
        //  }
        //System.out.print("jumlah CCTV : ");
//        int jctv = input.nextInt();
        //      RKS.setJumCCTV(jctv);
        //    System.out.print("kondisi CCTV : ");
        //  String kctv = input.next();
///        RKS.setKondCTV(kctv);
        //     System.out.print("posisi CCTV : ");
        //      System.out.println("1. ");
        //    System.out.println("2. ");
        //  String pos = input.next();
        //RKS.setPosCTV(posSK);
        //       if (RKS.getJumCCTV() == 2 && RKS.getKondCTV().equals("baik") && RKS.getPosCTV().equals("didepan") && RKS.getPosCTV().equals("dibelakang")) {
        //         return;
        //   }
    }

}
