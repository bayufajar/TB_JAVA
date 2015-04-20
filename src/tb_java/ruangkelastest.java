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
public class ruangkelastest {
    public static void main(String[] args)
    {
    Ruangkelas Rk = new Ruangkelas();
    saranaruangkelas SRK = new saranaruangkelas();
    Rk.Identitasruangkelas();
    Rk.Kondisiruangkelas();
    Rk.Lingkunganruangkelas();
    Rk.Kebersihanruangkelas();
    Rk.Kenyamananruangkelas();
    Rk.Keamananruangkelas();
    SRK.JKP_sarana();
    Scanner input = new Scanner(System.in);
    System.out.print("lihat hasil? (y/n) : ");
    String pilihan = input.next();
    if(pilihan.equals("y"))
    {   
        Rk.printdata();
        SRK.printdatakelas();
    }
}
}
