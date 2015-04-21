

package tb_java;
import java.util.*;



public class Ruangkelas {

    
    ruangkelasetget RKS = new ruangkelasetget();
    Scanner input = new Scanner(System.in); 
    saranaruangkelas SRK = new saranaruangkelas();
    
    public void Identitasruangkelas()
{
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

    public void Kondisiruangkelas()
    {
    System.out.println("------Kondisi Ruang Kelas-------");
    System.out.println("");
    System.out.print("input panjang : ");
    int p = input.nextInt();
    RKS.setPanjang(p);
    System.out.print("input lebar : ");
    int l = input.nextInt();
    RKS.setLebar(l);
    RKS.setLuas(RKS.getPanjang() * RKS.getLebar());
    if(p==l)
    {
    RKS.setBentukruang("PERSEGI");
    }
    else
    {
    RKS.setBentukruang("PERSEGI PANJANG");
    }
    System.out.print("input jumlah kursi : ");
    int jk = input.nextInt();
    RKS.setJumlah_kursi(jk);
    System.out.print("input jumlah pintu : ");
    int jp = input.nextInt();
    System.out.print("input jumlah jendela : ");
    int jl = input.nextInt();
    RKS.setJumlahjendela(jl);
    RKS.setRasioluas(RKS.getLuas() / RKS.getJumlah_kursi());
    if(RKS.getJumlah_pintu()>=2)
    {
    SRK.JKP_sarana();
    }
    else if(RKS.getJumlah_pintu()>=1)
    {
    SRK.JKP_sarana();
    }
        System.out.println("");
    }
    
    

public void Lingkunganruangkelas()
{
}

public void Kebersihanruangkelas()
{

}

public void Kenyamananruangkelas()
{

}

public void Keamananruangkelas()
{

}

public void printdata()
{

}

}