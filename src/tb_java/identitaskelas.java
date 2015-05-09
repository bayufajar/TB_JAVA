
package tb_java;

import java.util.Scanner;

public class identitaskelas {
     ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public void identitaskelas(){
    System.out.println("------Identitas Ruang Kelas-------");
    System.out.println("");
    System.out.print("nama ruang kelas : ");
    String s = input.next();
    RKS.setNamaruang(s);
    System.out.print("alamat kelas : ");
    String a = input.next();
    RKS.setLokasiruang(a);
    System.out.print("input Fa/jurusan : ");
    String d = input.next();
    RKS.setFaJur(d);
    System.out.println("");
    }
}
