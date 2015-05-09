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
public class keamananruangkelas {
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public void keamananruangkelas(){
        System.out.print("-----KEAMANAN RUANG KELAS-----");
    System.out.println("");
    System.out.print("Input Kekokohan: ");
    String koh = input.next();
    RKS.setKekohan(koh);
    RKS.analisiskekokohan();
    System.out.print("Input Kunci Pintu dan Jendela: ");
    String kun = input.next();
    RKS.setKPJ(kun);
    RKS.analisiskpj();
    System.out.print("Input Bahaya: ");
    String bah = input.next();
    RKS.setBahaya(bah);
    RKS.analisiskeamanan();
    }
}
