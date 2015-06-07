package tb_java;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class saranaruangkelas extends JPanel {

    Scanner input = new Scanner(System.in);
    ruangkelasetget RKS = new ruangkelasetget();
    indukinterface iif = new forpolimorfis();

    public JSlider slider1;
    public JSlider slider2;
    public JSlider slider3;
    public JSlider slider4;
    public JSlider slider5;
    public JSlider slider6;
    public JLabel nilaislider1;
    public JLabel nilaislider2;
    public JLabel nilaislider3;
    public JLabel nilaislider4;
    public JLabel nilaislider5;
    public JLabel nilaislider6;
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
        label1 = new JLabel("Jml steker : ");
        label1.setLocation(20, 25);
        label1.setSize(label1.getPreferredSize());
        add(label1);
        
      //  txt1 = new JTextField(10);
      //  txt1.setLocation(110, 20);
       // txt1.setSize(txt1.getPreferredSize());
        
        slider1 = new JSlider();
        slider1.setLocation(110,25);
        slider1.setSize(100,20);
        slider1.setMinimum(1);
        slider1.setMaximum(5);
        slider1.setValue(1);
        slider1.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider1.setText(String.valueOf(slider1.getValue())); 
        RKS.setJumkontak(slider1.getValue());
         }
     });
     add(slider1);
     
     nilaislider1 = new JLabel("1");
     nilaislider1.setLocation(220,30);
     nilaislider1.setSize(nilaislider1.getPreferredSize());
     add(nilaislider1);
        
     cbsteker = new JComboBox(Posisi);
        cbsteker.setLocation(250, 20);
        cbsteker.setSize(100, 30);
        add(cbsteker);
        RKS.setPoskontak((String) cbsteker.getSelectedItem());
        cbstekerkondisi = new JComboBox(kondisi);
        cbstekerkondisi.setLocation(370, 20);
        cbstekerkondisi.setSize(80, 30);
        add(cbstekerkondisi);
        RKS.setKondkontak((String) cbstekerkondisi.getSelectedItem());
        //kabel
        label2 = new JLabel("Jml Kabel LCD : ");
        label2.setLocation(20,55);
        label2.setSize(label2.getPreferredSize());
        add(label2);
   //     txt2 = new JTextField(10);
     //   txt2.setLocation(110,50);
      //  txt2.setSize(txt2.getPreferredSize());
    //    add(txt2);
        
        slider2 = new JSlider();
        slider2.setLocation(110,55);
        slider2.setSize(100,20);
        slider2.setMinimum(1);
        slider2.setMaximum(5);
        slider2.setValue(1);
        slider2.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider2.setText(String.valueOf(slider2.getValue())); 
        RKS.setKabelLCD(slider2.getValue());
         }
     });
     add(slider2);
     
     nilaislider2 = new JLabel("1");
     nilaislider2.setLocation(220,55);
     nilaislider2.setSize(nilaislider2.getPreferredSize());
     add(nilaislider2);
        
        cbkabel = new JComboBox(Posisi);
        cbkabel.setLocation(250,50);
        cbkabel.setSize(100,30);
        add(cbkabel);
        RKS.setPoskabLCD((String) cbkabel.getSelectedItem());
        cbkabelkondisi = new JComboBox(kondisi);
        cbkabelkondisi.setLocation(370,50);
        cbkabelkondisi.setSize(80,30);
        add(cbkabelkondisi);
        RKS.setKondkabLCD((String) cbkabelkondisi.getSelectedItem());
        
        //lampu
        label3 = new JLabel("Jml lampu : ");
        label3.setLocation(20,85);
        label3.setSize(label3.getPreferredSize());
        add(label3);
  //      txt3 = new JTextField(10);
    //    txt3.setLocation(110,80);
      //  txt3.setSize(txt3.getPreferredSize());
        //add(txt3);
        
           slider3 = new JSlider();
        slider3.setLocation(110,85);
        slider3.setSize(100,20);
        slider3.setMinimum(1);
        slider3.setMaximum(5);
        slider3.setValue(1);
        slider3.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider3.setText(String.valueOf(slider3.getValue())); 
        RKS.setJumLampu(slider3.getValue());
         }
     });
     add(slider3);
     
     nilaislider3 = new JLabel("1");
     nilaislider3.setLocation(220,80);
     nilaislider3.setSize(nilaislider3.getPreferredSize());
     add(nilaislider3);
        
        cblampu = new JComboBox(Posisi);
        cblampu.setLocation(250,80);
        cblampu.setSize(100,30);
        add(cblampu);
       RKS.setPoslampu((String) cblampu.getSelectedItem()); 
        cblampukondisi = new JComboBox(kondisi);
        cblampukondisi.setLocation(370,80);
        cblampukondisi.setSize(80,30);
        add(cblampukondisi);
        RKS.setKondlampu((String) cblampukondisi.getSelectedItem());
        //kipas angin
        label4 = new JLabel("Jml kipas angin:");
        label4.setLocation(20,115);
        label4.setSize(label4.getPreferredSize());
        add(label4);
 //       txt4 = new JTextField(10);
   //     txt4.setLocation(110,110);
     //   txt4.setSize(txt4.getPreferredSize());
       // add(txt4);
        
           slider4 = new JSlider();
        slider4.setLocation(110,115);
        slider4.setSize(100,20);
        slider4.setMinimum(1);
        slider4.setMaximum(5);
        slider4.setValue(1);
        slider4.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider4.setText(String.valueOf(slider4.getValue())); 
        RKS.setJumKipas(slider4.getValue());
         }
     });
     add(slider4);
     
     nilaislider4 = new JLabel("1");
     nilaislider4.setLocation(220,115);
     nilaislider4.setSize(nilaislider4.getPreferredSize());
     add(nilaislider4);
        
        
        cbkipasangin = new JComboBox(Posisi);
        cbkipasangin.setLocation(250,110);
        cbkipasangin.setSize(100,30);
        add(cbkipasangin);
        RKS.setPosKipas((String) cbkipasangin.getSelectedItem());
        cbkipasanginkondisi = new JComboBox(kondisi);
        cbkipasanginkondisi.setLocation(370,110);
        cbkipasanginkondisi.setSize(80,30);
        add(cbkipasanginkondisi);
        RKS.setKondkipas((String) cbkipasanginkondisi.getSelectedItem());
        
        //AC
        label5 = new JLabel("Jml AC : ");
        label5.setLocation(20,145);
        label5.setSize(label5.getPreferredSize());
        add(label5);
   //     txt5 = new JTextField(10);
   //     txt5.setLocation(110,140);
   //     txt5.setSize(txt5.getPreferredSize());
   //     add(txt5);
           slider5 = new JSlider();
        slider5.setLocation(110,145);
        slider5.setSize(100,20);
        slider5.setMinimum(1);
        slider5.setMaximum(5);
        slider5.setValue(1);
        slider5.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider5.setText(String.valueOf(slider5.getValue())); 
        RKS.setJumAC(slider5.getValue());
         }
     });
     add(slider5);
     
     nilaislider5 = new JLabel("1");
     nilaislider5.setLocation(220,145);
     nilaislider5.setSize(nilaislider5.getPreferredSize());
     add(nilaislider5);
        
        cbAC = new JComboBox(Posisi);
        cbAC.setLocation(250,140);
        cbAC.setSize(100,30);
        add(cbAC);
        RKS.setPosAC((String) cbAC.getSelectedItem());
        cbACkondisi = new JComboBox(kondisi);
        cbACkondisi.setLocation(370,140);
        cbACkondisi.setSize(80,30);
        add(cbACkondisi);
        RKS.setKondAC((String) cbACkondisi.getSelectedItem());
        //CCTV
        label6 = new JLabel("Jml CCTV : ");
        label6.setLocation(20,175);
        label6.setSize(label6.getPreferredSize());
        add(label6);
        //txt6 = new JTextField(10);
       // txt6.setLocation(110,170);
     //   txt6.setSize(txt6.getPreferredSize());
   //     add(txt6);
           slider6 = new JSlider();
        slider6.setLocation(110,175);
        slider6.setSize(100,20);
        slider6.setMinimum(1);
        slider6.setMaximum(5);
        slider6.setValue(1);
        slider6.addChangeListener(new ChangeListener() {

         @Override
         public void stateChanged(ChangeEvent ce) {
        nilaislider6.setText(String.valueOf(slider6.getValue())); 
        RKS.setJumCCTV(slider6.getValue());
         }
     });
     add(slider6);
     
     nilaislider6 = new JLabel("1");
     nilaislider6.setLocation(220,175);
     nilaislider6.setSize(nilaislider6.getPreferredSize());
     add(nilaislider6);
        
        cbCCTV = new JComboBox(Posisi);
        cbCCTV.setLocation(250,170);
        cbCCTV.setSize(100,30);
        add(cbCCTV);
        RKS.setPosCTV((String) cbCCTV.getSelectedItem());
        cbCCTVkondisi = new JComboBox(kondisi);
        cbCCTVkondisi.setLocation(370,170);
        cbCCTVkondisi.setSize(80,30);
        add(cbCCTVkondisi);
        RKS.setKondCTV((String) cbCCTVkondisi.getSelectedItem());
        
        //WIFI
        label7 = new JLabel("SSID");
        label7.setLocation(20,205);
        label7.setSize(label7.getPreferredSize());
        add(label7);
        cbSSID = new JComboBox(SSID);
        cbSSID.setLocation(110,200);
        cbSSID.setSize(130,30);
        add(cbSSID);
        RKS.setSSID((String) cbSSID.getSelectedItem());
        cbbandwith = new JComboBox(bandwith);
        cbbandwith.setLocation(250,200);
        cbbandwith.setSize(100,30);
        add(cbbandwith);
        RKS.setBandwith((String) cbbandwith.getSelectedItem());
        panelbg = new JPanel();
        panelbg.setLocation(10, 5);
        panelbg.setSize(520, 250);
        panelbg.setBackground(Color.white);
        panelbg.setBorder(BorderFactory.createTitledBorder(""));

        add(panelbg);

        setBackground(Color.white);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);

    }

}
