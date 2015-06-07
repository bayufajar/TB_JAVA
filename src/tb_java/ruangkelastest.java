package tb_java;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.io.*;
import java.io.File;

public class ruangkelastest extends JFrame {

    private JTabbedPane tp;
    private JPanel panelbg;
    LOGIN l = new LOGIN();
    public JButton buttonprocess;
    public JButton buttonedit;
    saranaruangkelas SRK = new saranaruangkelas();
    identitaskelas ik = new identitaskelas();
    kondisiruangkelas kork = new kondisiruangkelas();
    kebersihanruangkelas kebrk = new kebersihanruangkelas();
    kenyamananruangkelas kenyrk = new kenyamananruangkelas();
    keamananruangkelas keamanan = new keamananruangkelas();
    lingkunganruangkelas lrk = new lingkunganruangkelas();
    ruangkelasetget RKS = new ruangkelasetget();
    hasil Hasil = new hasil();
    JFileChooser fc = new JFileChooser();
    public JButton buttonlogin;
    public void init() {

        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (Exception e) {

        }
        buttonprocess = new JButton("process");
        buttonprocess.setLocation(200, 330);
        buttonprocess.setSize(120, 40);
        add(buttonprocess);
        buttonprocess.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean sukses = false;
                try{
                    if(lrk.pilihan.getSelectedItem().equals("bersih")){
                       RKS.setKesimpulan("bersih");
                    }else{ 
                        RKS.setKesimpulan("kotor");
                    }
                    
						RKS.setNamaruang(ik.txt1.getText());
						RKS.setLokasiruang(ik.txt2.getText());
                                                RKS.setFaJur(ik.txt3.getText());
                                                RKS.setPanjang(kork.slider1.getValue());
                                                RKS.setLebar(kork.slider2.getValue());
                                                RKS.setJumlah_kursi(kork.slider3.getValue());
                                                RKS.setJumlah_pintu(kork.slider4.getValue());
                                                RKS.setJumlahjendela(kork.slider5.getValue()); 
                                                RKS.setKondlantai(lrk.txt1.getText());
                                                RKS.setKonddinding(lrk.txt2.getText());
                                                RKS.setKondatap(lrk.txt3.getText());
                                                RKS.setKondpintu(lrk.txt4.getText());
                                                RKS.setKondjendela(lrk.txt5.getText());
                                                RKS.setKesimpulan((String) lrk.pilihan.getSelectedItem());
                                                RKS.setJumkontak(SRK.slider1.getValue());
                                                RKS.setKabelLCD(SRK.slider2.getValue());
                                                RKS.setJumLampu(SRK.slider3.getValue());
                                                RKS.setJumKipas(SRK.slider4.getValue());
                                                RKS.setJumAC(SRK.slider5.getValue());
                                                RKS.setJumCCTV(SRK.slider6.getValue());
                                                RKS.setSSID((String) SRK.cbSSID.getSelectedItem());
                                                RKS.setBandwith((String) SRK.cbbandwith.getSelectedItem());
                                                RKS.setPoskontak((String) SRK.cbsteker.getSelectedItem());
                                                RKS.setPoskabLCD((String) SRK.cbkabel.getSelectedItem());
                                                RKS.setPosKipas((String) SRK.cbkipasangin.getSelectedItem());
                                                RKS.setPoslampu((String) SRK.cblampu.getSelectedItem());
                                                RKS.setPosAC((String) SRK.cbAC.getSelectedItem());
                                                RKS.setPosCTV((String) SRK.cbCCTV.getSelectedItem());
                                                RKS.setKondAC((String) SRK.cbACkondisi.getSelectedItem());
                                                RKS.setKondCTV((String) SRK.cbCCTVkondisi.getSelectedItem());
                                                RKS.setKondkabLCD((String) SRK.cbkabelkondisi.getSelectedItem());
                                                RKS.setKondkipas((String) SRK.cbkipasanginkondisi.getSelectedItem());
                                                RKS.setKondkontak((String) SRK.cbstekerkondisi.getSelectedItem());
                                                RKS.setKondlampu((String) SRK.cblampukondisi.getSelectedItem()); 
                                                RKS.setSirkudara((String) kebrk.cbudara.getSelectedItem());
                                                RKS.setPencahayaan(kebrk.slider1.getValue());
                                                RKS.setKelembapan(kebrk.slider2.getValue());
                                                RKS.setCelcius(kebrk.slider3.getValue());
                                                RKS.setKebisingan((String)kenyrk.cb1.getSelectedItem() );
                                                RKS.setBau((String) kenyrk.cb2.getSelectedItem());
                                                RKS.setKebocoran((String) kenyrk.cb3.getSelectedItem());
                                                RKS.setKerusakan((String) kenyrk.cb4.getSelectedItem());
                                                RKS.setKekohan((String) keamanan.cb1.getSelectedItem());
                                                RKS.setKPJ((String) keamanan.cb2.getSelectedItem());
                                                RKS.setKeamanan((String) keamanan.cb3.getSelectedItem());
                    
                    
                     
                     sukses = true;
                     
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,
							"Kolom Angka harus diisi angka");
                }
                if (sukses) {
					int returnVal = fc.showSaveDialog(ruangkelastest.this);
		            if (returnVal == JFileChooser.APPROVE_OPTION) {
		                File file = fc.getSelectedFile();
		                
		                try {
					         ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
					         os.writeObject(Hasil);
					         os.close();
					         JOptionPane.showMessageDialog(null, "Kelas berhasil disimpan");
					      } catch(Exception ex) {
					          ex.printStackTrace();
					      }
		            }
					getContentPane().removeAll();
					add(Hasil);
					Hasil.init(RKS);
					               setBounds(0,0,810,650);
					revalidate();
					repaint();
                                        setTitle("preview");
                }
                
            }
        });

           
        buttonlogin = new JButton("LOGIN");
        buttonlogin.setLocation(90,110);
        buttonlogin.setSize(100,35);
         l.add(buttonlogin);
        buttonlogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
           if(l.txt1.getText().equals(l.username[0]) && l.psw1.getText().equals(l.password[0])){
               getContentPane().removeAll();
               new ruangkelastest().init();
              
               init();
               l.revalidate();
               l.repaint();
           }
            }
        });
        
        
        add(l);
        l.setBounds(0,0,810,650);
        
        buttonedit = new JButton("edit");
        buttonedit.setLocation(280, 550);
        buttonedit.setSize(100, 35);
        add(buttonedit);
        buttonedit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                
                getContentPane().removeAll();
                init();
                revalidate();
                repaint();
                
            }
        });

        Hasil.add(buttonedit);
    
        
        tp = new JTabbedPane();
        tp.setLocation(10, 20);
        tp.setSize(550, 300);
        tp.addTab("identitas", new identitaskelas());
        tp.addTab("kondisi", new kondisiruangkelas());
        tp.addTab("lingkungan", new lingkunganruangkelas());
        tp.addTab("sarana", new saranaruangkelas());
        tp.addTab("kebersihan", new kebersihanruangkelas());
        tp.addTab("kenyamanan", new kenyamananruangkelas());
        tp.addTab("keamanan", new keamananruangkelas());
        add(tp);

        JMenuBar menu = new JMenuBar();
        setJMenuBar(menu);

        JMenu submenu = new JMenu("File");
        JMenu submenu1 = new JMenu("Help");
        JMenuItem item1 = new JMenuItem("Load", 'A');
        item1.setMnemonic('o');
        item1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
            int returnVal = fc.showOpenDialog(ruangkelastest.this);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					try {
						ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
						RKS = (ruangkelasetget)is.readObject();
						is.close();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Data not Found !");
						//ex.printStackTrace();
					}
					getContentPane().removeAll();
					Hasil.init(RKS);
					add(Hasil);
					revalidate();
					repaint();
				}
                                setBounds(0,0,810,650);
            }
        });
        JMenuItem item4 = new JMenuItem("Close", 'k');
        JMenuItem visit = new JMenuItem("Visit");
        JMenuItem about = new JMenuItem("about");
        item4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menu.add(submenu);
        submenu.add(item1);

        submenu.addSeparator();
        submenu.add(item4);
        menu.add(submenu1);
        submenu1.add(about);
        submenu1.add(visit);
        visit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "anda bisa mengunjungi : http://espadafajar.com");
            }
        });

        panelbg = new JPanel();
        panelbg.setLocation(0, 0);
        panelbg.setSize(400, 400);
        panelbg.setBackground(Color.white);
        add(panelbg);
        setBounds(300, 150, 600, 450);
        setVisible(true);
        setTitle("Inventaris Kelas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setResizable(true);
    }
    

    public static void main(String[] args) {

        new ruangkelastest().init();

    }
}
