package tb_java;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class ruangkelastest extends JFrame{
   private JTabbedPane tp;
   private JPanel panelbg;
    public ruangkelastest(){
        
        try{
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }catch(Exception e){
            
        }
        
       tp = new JTabbedPane();
       tp.setLocation(10,20);
       tp.setSize(550,300);
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
        JMenuItem item1 = new JMenuItem("save", 'A');
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
       panelbg.setLocation(0,0);
       panelbg.setSize(400,400);
       panelbg.setBackground(Color.white);
       add(panelbg);
       setBounds(300,150,600,400);
       setVisible(true);
       setTitle("Inventaris Kelas");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setResizable(false);
    }
    
    
    public static void main(String[] args) {
      
       ruangkelastest rkt = new ruangkelastest();  

       saranaruangkelas SRK = new saranaruangkelas();
       identitaskelas ik = new identitaskelas();
       kondisiruangkelas kork = new kondisiruangkelas();
       kebersihanruangkelas kebrk = new kebersihanruangkelas();
       kenyamananruangkelas kenyrk = new kenyamananruangkelas();
       keamananruangkelas keamanan = new keamananruangkelas();
       lingkunganruangkelas lrk = new lingkunganruangkelas();
    
       
     //  ik.identitaskelas();
   //    kork.kondisiruangkelas();
     //  lrk.lingkunganruangkelas();
   //    kebrk.kebersihanruangkelas();
   //    kenyrk.kenyamananruangkelas();
   //    keamanan.keamananruangkelas();
       
   //     Scanner input = new Scanner(System.in);
  //      System.out.print("lihat hasil? (y/n) : ");
  //      String pilihan = input.next();
       
    }
}
