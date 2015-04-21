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
    
    }
    
    public void printdatakelas()
    {
    
    }
}
