/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_java;
import java.util.*;
/**
 *
 * @author espadafajar
 */
public class saranaruangkelas {
    
    Scanner input = new Scanner(System.in);
    ruangkelasetget RKS = new ruangkelasetget();
    public void JKP_sarana()
    {
    
System.out.println("------Lingkungan Ruang Kelas-------");
    System.out.println("");
    System.out.print("input jumlah stop kontak : ");
    int sk = input.nextInt();
    RKS.setJumkontak(sk);
    
    System.out.print("input kondisi stop kontak : ");
    String kondsk = input.next();
    RKS.setKondkontak(kondsk);
    System.out.print("input posisi stop kontak : ");
    String posSK = input.next();
    RKS.setPoskontak(posSK);
    if(RKS.getJumkontak()>4 && RKS.getKondkontak().equals("baik") && RKS.getPoskontak().equals("samping dosen"))
    {
    return;
    }else{}
    System.out.print("input jumlah kabel LCD : ");
    int JKB = input.nextInt();
    RKS.setKabelLCD(JKB);
    System.out.print("input kondisi kabel LCD : ");
    String KKB = input.next();
    RKS.setKondkabLCD(KKB);
    System.out.print("input posisi kabel LCD : ");
    String PKB = input.next();
    RKS.setPoskabLCD(PKB);
    if(RKS.getKabelLCD()>=1 && RKS.getKondkabLCD().equals("baik") && RKS.getPoskabLCD().equals("dekat dosen"))
    {
        return;
    }else{}
     System.out.print("input jumlah kipas : ");
     int JKP = input.nextInt();
     RKS.setJumKipas(JKP);
     System.out.print("input kondisi kipas : ");
     String KKP = input.next();
     RKS.setKondkipas(KKP);
     System.out.print("input posisi kipas : ");
     String PKKS = input.next();
     RKS.setPosKipas(PKKS);
     System.out.print("input jumlah lampu");
     int JLP = input.nextInt();
     RKS.setJumLampu(JLP);
     System.out.print("kondisi lampu : ");
     String KLP = input.next();
     RKS.setKondlampu(KLP);
     System.out.print("posisi Lampu : ");
     String PLP = input.next();
     RKS.setPoslampu(PLP);
     if(RKS.getJumLampu()>=18 && RKS.getKondlampu().equals("baik") && RKS.getPoslampu().equals("atap"))
     {
     return;
     }else{}
        System.out.print("Jumlah KIPAS Angin : ");
        int JKA = input.nextInt();
        RKS.setJumKipas(JKA);
        System.out.print("kondisi kipas : ");
        String baik = input.next();
        RKS.setKondkipas(baik);
        System.out.print("posisi kipas : ");
        String PKA = input.next();
        RKS.setPosKipas(PKA);
        
        
     
    }
    
    public void printdatakelas()
    {
    
    }
}
