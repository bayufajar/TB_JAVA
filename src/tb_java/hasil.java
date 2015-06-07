/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class hasil extends JPanel {

    public JTextField txt1;
    public JTextField txt2;
    public JTextField txt3;
    public JTextField txt4;
    public JTextField txt5;
    public JTextField txt6;
    public JTextField txt7;
    public JTextField txt8;
    public JTextField txt9;
    public JTextField txt10;
    public JTextField txt11;
    public JTextField txt12;
    public JTextField txt13;
    public JTextField txt14;
    public JTextField txt15;
    public JTextField txt16;
    public JTextField txt17;
    public JTextField txt18;
    public JTextField txt19;
    public JTextField txt20;
    public JTextField txt21;
    public JTextField txt22;
    public JTextField txt23;
    public JTextField txt24;
    public JTextField txt25;
    public JTextField txt26;
    public JTextField txt27;
    public JTextField txt28;
    public JTextField txt29;
    public JTextField txt30;
    public JTextField txt31;
    public JTextField txt32;
    public JTextField txt33;
    public JTextField txt34;
    public JTextField txt35;
    public JTextField txt36;
    public JTextField txt37;
    public JTextField txt38;
    public JTextField txt39;
    public JTextField txt40;
    public JTextField txt41;
    public JTextField txt42;
    public JTextField txt43;
    public JTextField txt44;
    public JTextField txt45;
    public JTextField txt46;
    public JTextField txt47;
    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JLabel label4;
    public JLabel label5;
    public JLabel label6;
    public JLabel label7;
    public JLabel label8;
    public JLabel label9;
    public JLabel label10;
    public JLabel label11;
    public JLabel label12;
    public JLabel label13;
    public JLabel label14;
    public JLabel label15;
    public JLabel label16;
    public JLabel label17;
    public JLabel label18;
    public JLabel label19;
    public JLabel label20;
    public JLabel label21;
    public JLabel label22;
    public JLabel label23;
    public JLabel label24;
    public JLabel label25;
    public JLabel label26;
    public JLabel label27;
    public JLabel label28;
    public JLabel label29;
    public JLabel label30;
    public JLabel label31;
    public JLabel label32;
    public JLabel label33;
    public JLabel label34;
    public JLabel label35;
    public JLabel label36;
    public JLabel label37;
    public JLabel label38;
    public JLabel label39;
    public JLabel label40;
    public JLabel label41;
    public JLabel label42;
    public JLabel label43;
    public JLabel label44;
    public JLabel label45;
    public JLabel label46;
    public JLabel label47;
    public JPanel panelbackground;
    public JPanel panelidentitas;
    public JPanel panelkondisi;
    public JPanel panellingkungan;
    public JPanel panelsarana;
    public JPanel panelkebersihan;
    public JPanel panelkenyamanan;
    public JPanel panelkeamanan;
    
   
    public void init(ruangkelasetget RKS) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {

        }

        //identitas
        label1 = new JLabel("kelas : ");
        label1.setLocation(10, 10);
        label1.setSize(label1.getPreferredSize());
        add(label1);

       
        txt1 = new JTextField(10);
        txt1.setLocation(80, 10);
        txt1.setSize(txt1.getPreferredSize());
        txt1.setEditable(false);
        txt1.setText("" +RKS.getNamaruang());
        add(txt1);
        
        label2 = new JLabel("Alamat : ");
        label2.setLocation(10, 40);
        label2.setSize(label2.getPreferredSize());
        add(label2);

        txt2 = new JTextField(10);
        txt2.setLocation(80, 40);
        txt2.setSize(txt2.getPreferredSize());
        txt2.setEditable(false);
        txt2.setText("" + RKS.getLokasiruang());
        add(txt2);

        label3 = new JLabel("Fakultas : ");
        label3.setLocation(10, 70);
        label3.setSize(label3.getPreferredSize());
        add(label3);

        txt3 = new JTextField(10);
        txt3.setLocation(80, 70);
        txt3.setSize(txt3.getPreferredSize());
        txt3.setEditable(false);
        txt3.setText("" + RKS.getFaJur()); 
        add(txt3);

        panelidentitas = new JPanel();
        panelidentitas.setLocation(5, 5);
        panelidentitas.setSize(250, 110);
        panelidentitas.setBorder(BorderFactory.createTitledBorder(""));
        panelidentitas.setBackground(Color.white);
        add(panelidentitas);
        panelidentitas.add(label1);
        panelidentitas.add(label2);
        panelidentitas.add(label3);
        panelidentitas.add(txt1);
        panelidentitas.add(txt2);
        panelidentitas.add(txt3);
        panelidentitas.setLayout(null);

        label4 = new JLabel("panjang : ");
        label4.setLocation(10, 10);
        label4.setSize(label4.getPreferredSize());
        add(label4);

        txt4 = new JTextField(10);
        txt4.setText( "" + RKS.getPanjang());
        txt4.setLocation(80, 10);
        txt4.setSize(txt4.getPreferredSize());
        txt4.setEditable(false);
        add(txt4);
        
        label5 = new JLabel("lebar : ");
        label5.setLocation(10, 40);
        label5.setSize(label5.getPreferredSize());
        add(label5);

        txt5 = new JTextField(10);
        txt5.setText("" + RKS.getLebar());
        txt5.setLocation(80, 40);
        txt5.setSize(txt5.getPreferredSize());
        txt5.setEditable(false);
        add(txt5);

        label6 = new JLabel("jml. kursi : ");
        label6.setLocation(10, 70);
        label6.setSize(label6.getPreferredSize());
        add(label6);

        txt6 = new JTextField(10);
        txt6.setText("" + RKS.getJumlah_kursi());
        txt6.setLocation(80, 70);
        txt6.setSize(txt6.getPreferredSize());
        txt6.setEditable(false);
        add(txt6);
        
        label7 = new JLabel("jml. pintu : ");
        label7.setLocation(10, 100);
        label7.setSize(label7.getPreferredSize());
        add(label7);

        txt7 = new JTextField(10);
        txt7.setText("" + RKS.getJumlah_pintu());
        txt7.setLocation(80, 100);
        txt7.setSize(txt7.getPreferredSize());
        txt7.setEditable(false);
        add(txt7);

        label8 = new JLabel("kelas : ");
        label8.setLocation(10, 130);
        label8.setSize(label8.getPreferredSize());
        add(label8);

        txt8 = new JTextField(10);
        txt8.setText("" + RKS.getJumlahjendela());
        txt8.setLocation(80, 130);
        txt8.setSize(txt8.getPreferredSize());
        txt8.setEditable(false);
        add(txt8);
        
        
        label9 = new JLabel("Luas : ");
        label9.setLocation(10, 160);
        label9.setSize(label9.getPreferredSize());
        add(label9);

        txt9 = new JTextField(10);
        txt9.setText("" + RKS.luas());
        txt9.setLocation(80, 160);
        txt9.setSize(txt9.getPreferredSize());
        txt9.setEditable(false);
        add(txt9);
        
        label10 = new JLabel("btk ruang : ");
        label10.setLocation(10, 190);
        label10.setSize(label10.getPreferredSize());
        add(label10);

        txt10 = new JTextField(10);
        txt10.setText("" + RKS.getBentukruang());
        txt10.setLocation(80, 190);
        txt10.setSize(txt10.getPreferredSize());
        txt10.setEditable(false);
        add(txt10);
        
        panelkondisi = new JPanel();
        panelkondisi.setLocation(5, 120);
        panelkondisi.setSize(250, 230);
        panelkondisi.setBackground(Color.white);
        panelkondisi.setBorder(BorderFactory.createTitledBorder(""));
        panelkondisi.add(label4);
        panelkondisi.add(label5);
        panelkondisi.add(label6);
        panelkondisi.add(label7);
        panelkondisi.add(label8);
        panelkondisi.add(label9);
         panelkondisi.add(label10);
        panelkondisi.add(txt4);
        panelkondisi.add(txt5);
        panelkondisi.add(txt6);
        panelkondisi.add(txt7);
        panelkondisi.add(txt8);
        panelkondisi.add(txt9);
        panelkondisi.add(txt10);
        panelkondisi.setLayout(null);
        add(panelkondisi);
        
        
        label11 = new JLabel("kond.lantai : ");
        label11.setLocation(10, 10);
        label11.setSize(label10.getPreferredSize());
        add(label11);

        txt11 = new JTextField(10);
        txt11.setText("" + RKS.getKondlantai());
        txt11.setLocation(80, 10); 
        txt11.setSize(txt11.getPreferredSize());
        txt11.setEditable(false);
        add(txt11);
        
        label12 = new JLabel("kond.din : ");
        label12.setLocation(10, 40);
        label12.setSize(label12.getPreferredSize());
        add(label12);

        txt12 = new JTextField(10);
        txt12.setText("" + RKS.getKonddinding()); 
        txt12.setLocation(80, 40);
        txt12.setSize(txt12.getPreferredSize());
        txt12.setEditable(false);
        add(txt12);
        
        label13 = new JLabel("kond.atap : ");
        label13.setLocation(10, 70);
        label13.setSize(label13.getPreferredSize());
        add(label13);

        txt13 = new JTextField(10);
        txt13.setText("" + RKS.getKondatap());
        txt13.setLocation(80, 70);
        txt13.setSize(txt13.getPreferredSize());
        txt13.setEditable(false);
        add(txt13);
        
        label14 = new JLabel("kond.pintu : ");
        label14.setLocation(10, 100);
        label14.setSize(label14.getPreferredSize());
        add(label14);

        txt14 = new JTextField(10);
        txt14.setText("" + RKS.getKondpintu());
        txt14.setLocation(80, 100);
        txt14.setSize(txt14.getPreferredSize());
        txt14.setEditable(false);
        add(txt14);
        
        label15 = new JLabel("kond.jend : ");
        label15.setLocation(10, 130);
        label15.setSize(label15.getPreferredSize());
        add(label15);

        txt15 = new JTextField(10);
        txt15.setLocation(80, 130);
        txt15.setSize(txt15.getPreferredSize());
        txt15.setEditable(false);
        add(txt15);
        
        label16 = new JLabel("kesimpulan : ");
        label16.setLocation(10, 160);
        label16.setSize(label16.getPreferredSize());
        add(label16);

        txt16 = new JTextField(10);
        txt16.setLocation(80, 160);
        txt16.setSize(txt16.getPreferredSize());
        txt16.setEditable(false);
        add(txt16);
        
        panellingkungan = new JPanel();
        panellingkungan.setLocation(5,350);
        panellingkungan.setSize(250,205);
        panellingkungan.setBackground(Color.white);
        panellingkungan.setBorder(BorderFactory.createTitledBorder(""));
        panellingkungan.add(label11);
        panellingkungan.add(label12);
        panellingkungan.add(label13);
        panellingkungan.add(label14);
        panellingkungan.add(label15);
        panellingkungan.add(label16);
        panellingkungan.add(txt11);
        panellingkungan.add(txt12);
        panellingkungan.add(txt13);
        panellingkungan.add(txt14);
        panellingkungan.add(txt15);
        panellingkungan.add(txt16);
        panellingkungan.setLayout(null);
        add(panellingkungan);
       
        label17 = new JLabel("steker : ");
        label17.setLocation(10, 10);
        label17.setSize(label17.getPreferredSize());
        add(label17);
        
        txt17 = new JTextField(10);
        txt17.setLocation(80, 10);
        txt17.setSize(txt17.getPreferredSize());
        txt17.setEditable(false);
        add(txt17);
        
        label18 = new JLabel("kabel : ");
        label18.setLocation(10, 40);
        label18.setSize(label18.getPreferredSize());
        add(label18);

        txt18 = new JTextField(10);
        txt18.setLocation(80, 40);
        txt18.setSize(txt18.getPreferredSize());
        txt18.setEditable(false);
        add(txt18);
        
        label19 = new JLabel("lampu : ");
        label19.setLocation(10, 70);
        label19.setSize(label19.getPreferredSize());
        add(label19);

        txt19 = new JTextField(10);
        txt19.setLocation(80, 70);
        txt19.setSize(txt19.getPreferredSize());
        txt19.setEditable(false);
        add(txt19);
        
        label20 = new JLabel("kipas : ");
        label20.setLocation(10, 100);
        label20.setSize(label20.getPreferredSize());
        add(label20);

        txt20 = new JTextField(10);
        txt20.setLocation(80, 100);
        txt20.setSize(txt20.getPreferredSize());
        txt20.setEditable(false);
        add(txt20);
        
        label21 = new JLabel("AC : ");
        label21.setLocation(10, 130);
        label21.setSize(label21.getPreferredSize());
        add(label21);

        txt21 = new JTextField(10);
        txt21.setLocation(80, 130);
        txt21.setSize(txt21.getPreferredSize());
        txt21.setEditable(false);
        add(txt21);
        
        label22 = new JLabel("CCTV : ");
        label22.setLocation(10, 160);
        label22.setSize(label22.getPreferredSize());
        add(label22);

        txt22 = new JTextField(10);
        txt22.setLocation(80, 160);
        txt22.setSize(txt22.getPreferredSize());
        txt22.setEditable(false);
        add(txt22);
        
        label23 = new JLabel("SSID : ");
        label23.setLocation(10, 190);
        label23.setSize(label23.getPreferredSize());
        add(label23);

        txt23 = new JTextField(10);
        txt23.setLocation(80, 190);
        txt23.setSize(txt23.getPreferredSize());
        txt23.setEditable(false);
        add(txt23);
        
        panelsarana = new JPanel();
        panelsarana.setLocation(265,5);
        panelsarana.setSize(250,250);
        panelsarana.setBackground(Color.white);
        panelsarana.setBorder(BorderFactory.createTitledBorder(""));
        panelsarana.add(label17);
        panelsarana.add(label18);
        panelsarana.add(label19);
        panelsarana.add(label20);
        panelsarana.add(label21);
        panelsarana.add(label22);
        panelsarana.add(label23);
        panelsarana.add(txt17);
        panelsarana.add(txt18);
        panelsarana.add(txt19);
        panelsarana.add(txt20);
        panelsarana.add(txt21);
        panelsarana.add(txt22);
        panelsarana.add(txt23);
        panelsarana.setLayout(null);
        add(panelsarana);
        
        
        label24 = new JLabel("udara : ");
        label24.setLocation(10, 10);
        label24.setSize(label24.getPreferredSize());
        add(label24);

        txt24 = new JTextField(10);
        txt24.setLocation(80, 10);
        txt24.setSize(txt24.getPreferredSize());
        txt24.setEditable(false);
        add(txt24);
        
        label25 = new JLabel("cahaya: ");
        label25.setLocation(10, 40);
        label25.setSize(label25.getPreferredSize());
        add(label25);

        txt25 = new JTextField(10);
        txt25.setLocation(80, 40);
        txt25.setSize(txt25.getPreferredSize());
        txt25.setEditable(false);
        add(txt25);
        
        label26 = new JLabel("lembab : ");
        label26.setLocation(10, 70);
        label26.setSize(label26.getPreferredSize());
        add(label26);

        txt26 = new JTextField(10);
        txt26.setLocation(80, 70);
        txt26.setSize(txt26.getPreferredSize());
        txt26.setEditable(false);
        add(txt26);
        
        
        label27 = new JLabel("suhu : ");
        label27.setLocation(10, 100);
        label27.setSize(label27.getPreferredSize());
        add(label27);

        txt27 = new JTextField(10);
        txt27.setLocation(80, 100);
        txt27.setSize(txt27.getPreferredSize());
        txt27.setEditable(false);
        add(txt27);
        
        panelkebersihan = new JPanel();
        panelkebersihan.setLocation(265,265);
        panelkebersihan.setSize(250,140);
        panelkebersihan.setBackground(Color.white);
        panelkebersihan.setBorder(BorderFactory.createTitledBorder(""));
        panelkebersihan.add(label24);
        panelkebersihan.add(label25);
        panelkebersihan.add(label26);
        panelkebersihan.add(label27);
        panelkebersihan.add(txt24);
        panelkebersihan.add(txt25);
        panelkebersihan.add(txt26);
        panelkebersihan.add(txt27);
        panelkebersihan.setLayout(null);
        add(panelkebersihan);
        
        
        label28 = new JLabel("bising : ");
        label28.setLocation(10, 10);
        label28.setSize(label28.getPreferredSize());
        add(label28);

        txt28 = new JTextField(10);
        txt28.setLocation(80, 10);
        txt28.setSize(txt28.getPreferredSize());
        txt28.setEditable(false);
        add(txt28);
        
        label29 = new JLabel("bau : ");
        label29.setLocation(10, 40);
        label29.setSize(label29.getPreferredSize());
        add(label29);

        txt29 = new JTextField(10);
        txt29.setLocation(80, 40);
        txt29.setSize(txt29.getPreferredSize());
        txt29.setEditable(false);
        add(txt29);
        
        label30 = new JLabel("bocor : ");
        label30.setLocation(10, 70);
        label30.setSize(label30.getPreferredSize());
        add(label30);

        txt30 = new JTextField(10);
        txt30.setLocation(80, 70);
        txt30.setSize(txt30.getPreferredSize());
        txt30.setEditable(false);
        add(txt27);
        
        label31 = new JLabel("rusak : ");
        label31.setLocation(10, 100);
        label31.setSize(label31.getPreferredSize());
        add(label31);

        txt31 = new JTextField(10);
        txt31.setLocation(80, 100);
        txt31.setSize(txt31.getPreferredSize());
        txt31.setEditable(false);
        add(txt31);
        
        panelkenyamanan = new JPanel();
        panelkenyamanan.setLocation(265,405);
        panelkenyamanan.setSize(250,145);
        panelkenyamanan.setBackground(Color.white);
        panelkenyamanan.setBorder(BorderFactory.createTitledBorder(""));
        panelkenyamanan.add(label28);
        panelkenyamanan.add(label29);
        panelkenyamanan.add(label30);
        panelkenyamanan.add(label31);
        panelkenyamanan.add(txt28);
        panelkenyamanan.add(txt29);
        panelkenyamanan.add(txt30);
        panelkenyamanan.add(txt31);
        panelkenyamanan.setLayout(null);
        add(panelkenyamanan);
        
        label32 = new JLabel("kokoh : ");
        label32.setLocation(10, 10);
        label32.setSize(label32.getPreferredSize());
        add(label32);

        txt32 = new JTextField(10);
        txt32.setLocation(80, 10);
        txt32.setSize(txt32.getPreferredSize());
        txt32.setEditable(false);
        add(txt32);
        
        label33 = new JLabel("kunci : ");
        label33.setLocation(10, 40);
        label33.setSize(label33.getPreferredSize());
        add(label33);

        txt33 = new JTextField(10);
        txt33.setLocation(80, 40);
        txt33.setSize(txt33.getPreferredSize());
        txt33.setEditable(false);
        add(txt33);
        
        label34 = new JLabel("aman : ");
        label34.setLocation(10, 70);
        label34.setSize(label34.getPreferredSize());
        add(label34);

        txt34 = new JTextField(10);
        txt34.setLocation(80, 70);
        txt34.setSize(txt34.getPreferredSize());
        txt34.setEditable(false);
        add(txt34);
        
        panelkeamanan = new JPanel();
        panelkeamanan.setLocation(530,5);
        panelkeamanan.setSize(250,150);
        panelkeamanan.setBackground(Color.white);
        panelkeamanan.setBorder(BorderFactory.createTitledBorder(""));
        panelkeamanan.add(label32);
        panelkeamanan.add(label33);
        panelkeamanan.add(label34);
        panelkeamanan.add(txt32);
        panelkeamanan.add(txt33);
        panelkeamanan.add(txt34);
        panelkeamanan.setLayout(null);
        add(panelkeamanan);
        
        
        
        setLayout(null);
        setBackground(Color.white);
        setBorder(BorderFactory.createEtchedBorder());

    }
}
