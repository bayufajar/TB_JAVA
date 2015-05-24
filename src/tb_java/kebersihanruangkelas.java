/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_java;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class kebersihanruangkelas extends JPanel{
    
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public void kebersihanruangkelas(){
    System.out.print("------KEBERSIHAN RUANG KELAS-----");
    System.out.println("");
    System.out.print("Input Sirkulasi Udara: ");
    String udara = input.next();
    RKS.setSirkudara(udara);
    RKS.analisisudara(udara);
    System.out.print("Input Nilai Pencahayaan: ");
    int pch = input.nextInt();
    RKS.setPencahayaan(pch);
    RKS.analisiscahaya(pch);
    System.out.print("Input Kelembapan (%): ");
    int bab = input.nextInt();
    RKS.setKelembapan(bab);
    RKS.analisiskelembapan(bab);
    System.out.print("Input Suhu (celcius): ");
    int shu = input.nextInt();
    RKS.setCelcius(shu);
    RKS.analisissuhu(shu);
    }
}
