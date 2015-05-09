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
public class kenyamananruangkelas {
    
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public void kenyamananruangkelas(){
        System.out.print("-----KENYAMANAN RUANG KELAS-----");
    System.out.println("");
    System.out.print("Input Kebisingan: ");
    String bising = input.next();
    RKS.setKebisingan(bising);
    RKS.analisiskebisingan();
    System.out.print("Input Bau: ");
    String au = input.next();
    RKS.setBau(au);
    RKS.analisisbau();
    System.out.print("Input Kebocoran: ");
    String cor = input.next();
    RKS.setKebocoran(cor);
    RKS.analisiskebocoran();
    System.out.print("Input Kerusakan: ");
    String sak = input.next();
    RKS.setKerusakan(sak);
    RKS.analisiskerusakan();
    System.out.print("Input Keausan: ");
    String aus = input.next();
    RKS.setKeausan(aus);
    RKS.analisiskeausan();
    }
}
