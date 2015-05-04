package tb_java;

import java.util.*;

public class ruangkelastest extends Ruangkelas{
    public static void main(String[] args) {
        Ruangkelas Rk = new Ruangkelas();
        saranaruangkelas SRK = new saranaruangkelas();
        Rk.Identitasruangkelas();
        Rk.Kondisiruangkelas();
        SRK.JKP_sarana();
        Rk.Lingkunganruangkelas();
        Rk.analisislingkungan();
        Rk.Kebersihanruangkelas();
        Rk.Kenyamananruangkelas();
        Rk.Keamananruangkelas();
        Scanner input = new Scanner(System.in);
        System.out.print("lihat hasil? (y/n) : ");
        String pilihan = input.next();
        if (pilihan.equals("y")) {
            Rk.printdata();
            SRK.printdatakelas();
        }
    }
}
