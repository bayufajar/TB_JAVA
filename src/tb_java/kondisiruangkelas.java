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
public class kondisiruangkelas {
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public void kondisiruangkelas(){
        System.out.println("------Kondisi Ruang Kelas-------");
    System.out.println("");
    System.out.print("input panjang : ");
    int p = input.nextInt();
    RKS.setPanjang(p);
    System.out.print("input lebar : ");
    int l = input.nextInt();
    RKS.setLebar(l);
    System.out.print("input jumlah kursi : ");
    int jk = input.nextInt();
    RKS.setJumlah_kursi(jk);
    System.out.print("input jumlah pintu : ");
    int jp = input.nextInt();
    System.out.print("input jumlah jendela : ");
    int jl = input.nextInt();
    RKS.setJumlahjendela(jl);
    System.out.println("");
    RKS.luas(l*p);
    RKS.rasio(RKS.luas(l*p)/jl);
    }
}
