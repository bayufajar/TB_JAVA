package tb_java;

import java.util.*;

public class ruangkelastest{
    public static void main(String[] args) {
       
        saranaruangkelas SRK = new saranaruangkelas();
       identitaskelas ik = new identitaskelas();
       kondisiruangkelas kork = new kondisiruangkelas();
       kebersihanruangkelas kebrk = new kebersihanruangkelas();
       kenyamananruangkelas kenyrk = new kenyamananruangkelas();
       keamananruangkelas keamanan = new keamananruangkelas();
       lingkunganruangkelas lrk = new lingkunganruangkelas();
    
       
       ik.identitaskelas();
       kork.kondisiruangkelas();
       lrk.lingkunganruangkelas();
       kebrk.kebersihanruangkelas();
       kenyrk.kenyamananruangkelas();
       keamanan.keamananruangkelas();
       
        Scanner input = new Scanner(System.in);
        System.out.print("lihat hasil? (y/n) : ");
        String pilihan = input.next();
       
    }
}
