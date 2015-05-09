/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_java;

import java.util.Scanner;

/**
 *
 * @author espadafajar
 */
public class lingkunganruangkelas {
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    kebersihanruangkelas krk = new kebersihanruangkelas();
    
    public void lingkunganruangkelas(){
         System.out.print("-----LINGKUNGAN RUANG KELAS-----");
    System.out.println("");
    System.out.print("Input Kondisi Lantai: ");
    String lantai = input.next();
    RKS.setKondlantai(lantai);
    System.out.print("Input Kondisi Dinding: ");
    String dinding = input.next();
    RKS.setKonddinding(dinding);
    System.out.print("Input Kondisi Atap: ");
    String atap = input.next();
    RKS.setKondatap(atap);
    System.out.print("Input Kondisi Pintu: ");
    String pintu = input.next();
    RKS.setKondpintu(pintu);
    System.out.print("Input Kondisi Jendela: ");
    String jendela = input.next();
    RKS.setKondjendela(jendela);
    System.out.print("Kesimpulan(bersih/kotor) : ");
    String kesimpulan = input.next();
    RKS.setAnalisislingkungan(kesimpulan);
}
    public String analisislingkungan(){
    if(RKS.getAnalisislingkungan().equals("bersih")){
       kebersihanruangkelas krk = new kebersihanruangkelas();
    }else{
        kebersihanruangkelas krk = new kebersihanruangkelas();
    }    
        return analisislingkungan();
    }
    }

