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

public void Lingkunganruangkelas()
{
    //pangestu pratama
     System.out.print("-----LINGKUNGAN RUANG KELAS-----");
    System.out.println("");
    System.out.print("Input Kondisi Lantai: ");
    String lantai = input.next();
    RKS.setKondlantai(lantai);
    System.out.print("Input Kondisi Dinding: ");
    String dinding = input.next();
    RKS.setKonddinding(dinding);
    System.out.print("Input Kondisi Atap: ");
    String atap = input.next();
    RKS.setKondatap(atap);
    System.out.print("Input Kondisi Pintu: ");
    String pintu = input.next();
    RKS.setKondpintu(pintu);
    System.out.print("Input Kondisi Jendela: ");
    String jendela = input.next();
    RKS.setKondjendela(jendela);
    System.out.print("Kesimpulan(bersih/kotor) : ");
    String kesimpulan = input.next();
    RKS.setAnalisislingkungan(kesimpulan);
}
    public String analisislingkungan(){
    if(RKS.getAnalisislingkungan().equals("bersih")){
        Kebersihanruangkelas();
    }else{
        Kebersihanruangkelas();
    }    
        return analisislingkungan();
    }

public void Kebersihanruangkelas()
{
    //pangestu pratama
System.out.print("------KEBERSIHAN RUANG KELAS-----");
    System.out.println("");
    System.out.print("Input Sirkulasi Udara: ");
    String udara = input.next();
    RKS.analisisudara();
    RKS.setSirkudara(udara);
    System.out.print("Input Nilai Pencahayaan: ");
    int pch = input.nextInt();
    RKS.analisiscahaya();
    RKS.setPencahayaan(pch);
    System.out.print("Input Kelembapan (%): ");
    int bab = input.nextInt();
    RKS.setKelembapan(bab);
    RKS.analisiskelembapan();
    System.out.print("Input Suhu (celcius): ");
    int shu = input.nextInt();
    RKS.setCelcius(shu);
    RKS.analisissuhu();
}


public void Kenyamananruangkelas()
{
    // pangestu pratama
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

public void Keamananruangkelas()
{
    //pangestu pratama
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

public void printdata()
{

}

}