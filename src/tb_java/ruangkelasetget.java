/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_java;

/**
 *
 * @author espadafajar
 */
public class ruangkelasetget {
    

private String namaruang;
private String lokasiruang;
private String faJur;
private int panjang;
private int lebar;
private int luas;
private String bentukruang;
private int jumlah_kursi;
private int jumlah_pintu;
private int jumlahjendela;
private int rasioluas;
private String kondisiruang;
private String kondpintu;
private String kondjendela;
private String konddinding;
private String kondatap;
private String kondlantai;
private String sirkudara;
private int pencahayaan;
private int kelembapan;
private int celcius;
private String kebisingan;
private String bau;
private String kebocoran;
private String kerusakan;
private String keausan;
private String kekohan;
private String KPJ;
private String bahaya;
private int jumkontak;
private String kondkontak;
private String poskontak;
private int kabelLCD;
private String kondkabLCD;
private String poskabLCD;
private int jumLampu;
private String kondlampu;
private String poslampu;
private int jumKipas;
private String kondkipas;
private String posKipas;
private int jumAC;
private String kondAC;
private String posAC;
private int SSID;
private int bandwith;
private int jumCCTV;
private String kondCTV;
private String posCTV;
private String analisislingkungan;
 String hasiludara;
 String hasilcahaya;
String hasilsuhu;
String hasillembab;
String hasilbentukruang;
String hasilrasioluas;
String hasilpintu;
String hasiljendela;
String hasilkebisingan;
String hasilbau;
String hasilkebocoran;
String hasilkerusakan;
String hasilkeausan;
String hasilkokoh;
String hasilkpj;
String hasilkeamanan;

    /**
     * @return the namaruang
     */
    public String getNamaruang() {
        return namaruang;
    }

    /**
     * @param namaruang the namaruang to set
     */
    public void setNamaruang(String namaruang) {
        this.namaruang = namaruang;
    }

    /**
     * @return the lokasiruang
     */
    public String getLokasiruang() {
        return lokasiruang;
    }

    /**
     * @param lokasiruang the lokasiruang to set
     */
    public void setLokasiruang(String lokasiruang) {
        this.lokasiruang = lokasiruang;
    }

    /**
     * @return the faJur
     */
    public String getFaJur() {
        return faJur;
    }

    /**
     * @param faJur the faJur to set
     */
    public void setFaJur(String faJur) {
        this.faJur = faJur;
    }

    /**
     * @return the panjang
     */
    public int getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public int getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the luas
     */
     public int luas(int L){
       L = panjang * lebar;
    if(panjang!=lebar)
    {
    bentukruang = "persegi panjang";
    hasilbentukruang = "sesuai";
    }
    
       return L;
   }
     public int rasio(int rl){
         rasioluas = luas / jumlah_kursi;
         if (rasioluas >=0.5){
            hasilrasioluas = "sesuai";
         }
    if(jumlah_pintu>=2)
    {
    hasilpintu = "sesuai";
    }
    else if(jumlahjendela>=1)
    {
hasiljendela = "sesuai";
    }
    return rasio(rl);
     }

    /**
     * @return the jumlah_kursi
     */
    public int getJumlah_kursi() {
        return jumlah_kursi;
    }

    /**
     * @param jumlah_kursi the jumlah_kursi to set
     */
    public void setJumlah_kursi(int jumlah_kursi) {
        this.jumlah_kursi = jumlah_kursi;
    }

    /**
     * @return the jumlah_pintu
     */
    public int getJumlah_pintu() {
        return jumlah_pintu;
    }

    /**
     * @param jumlah_pintu the jumlah_pintu to set
     */
    public void setJumlah_pintu(int jumlah_pintu) {
        this.jumlah_pintu = jumlah_pintu;
    }

    /**
     * @return the jumlahjendela
     */
    public int getJumlahjendela() {
        return jumlahjendela;
    }

    /**
     * @param jumlahjendela the jumlahjendela to set
     */
    public void setJumlahjendela(int jumlahjendela) {
        this.jumlahjendela = jumlahjendela;
    }

    /**
     * @return the rasioluas
     */
  
    /**
     * @return the kondisiruang
     */
    public String getKondisiruang() {
        return kondisiruang;
    }

    /**
     * @param kondisiruang the kondisiruang to set
     */
    public void setKondisiruang(String kondisiruang) {
        this.kondisiruang = kondisiruang;
    }

    /**
     * @return the kondpintu
     */
    public String getKondpintu() {
        return kondpintu;
    }

    /**
     * @param kondpintu the kondpintu to set
     */
    public void setKondpintu(String kondpintu) {
        this.kondpintu = kondpintu;
    }

    /**
     * @return the kondjendela
     */
    public String getKondjendela() {
        return kondjendela;
    }

    /**
     * @param kondjendela the kondjendela to set
     */
    public void setKondjendela(String kondjendela) {
        this.kondjendela = kondjendela;
    }

    /**
     * @return the konddinding
     */
    public String getKonddinding() {
        return konddinding;
    }

    /**
     * @param konddinding the konddinding to set
     */
    public void setKonddinding(String konddinding) {
        this.konddinding = konddinding;
    }

    /**
     * @return the kondatap
     */
    public String getKondatap() {
        return kondatap;
    }

    /**
     * @param kondatap the kondatap to set
     */
    public void setKondatap(String kondatap) {
        this.kondatap = kondatap;
    }

    /**
     * @return the kondlantai
     */
    public String getKondlantai() {
        return kondlantai;
    }

    /**
     * @param kondlantai the kondlantai to set
     */
    public void setKondlantai(String kondlantai) {
        this.kondlantai = kondlantai;
    }

    /**
     * @return the sirkudara
     */
    public String getSirkudara() {
        return sirkudara;
    }

    /**
     * @param sirkudara the sirkudara to set
     */
    public void setSirkudara(String sirkudara) {
        this.sirkudara = sirkudara;
    }

    /**
     * @return the pencahayaan
     */
    public int getPencahayaan() {
        return pencahayaan;
    }

    /**
     * @param pencahayaan the pencahayaan to set
     */
    public void setPencahayaan(int pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    /**
     * @return the kelembapan
     */
    public int getKelembapan() {
        return kelembapan;
    }

    /**
     * @param kelembapan the kelembapan to set
     */
    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    /**
     * @return the celcius
     */
    public int getCelcius() {
        return celcius;
    }

    /**
     * @param celcius the celcius to set
     */
    public void setCelcius(int celcius) {
        this.celcius = celcius;
    }

    /**
     * @return the kebisingan
     */
    public String getKebisingan() {
        return kebisingan;
    }

    /**
     * @param kebisingan the kebisingan to set
     */
    public void setKebisingan(String kebisingan) {
        this.kebisingan = kebisingan;
    }

    /**
     * @return the bau
     */
    public String getBau() {
        return bau;
    }

    /**
     * @param bau the bau to set
     */
    public void setBau(String bau) {
        this.bau = bau;
    }

    /**
     * @return the kebocoran
     */
    public String getKebocoran() {
        return kebocoran;
    }

    /**
     * @param kebocoran the kebocoran to set
     */
    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
    }

    /**
     * @return the kerusakan
     */
    public String getKerusakan() {
        return kerusakan;
    }

    /**
     * @param kerusakan the kerusakan to set
     */
    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    /**
     * @return the keausan
     */
    public String getKeausan() {
        return keausan;
    }

    /**
     * @param keausan the keausan to set
     */
    public void setKeausan(String keausan) {
        this.keausan = keausan;
    }

    /**
     * @return the kekohan
     */
    public String getKekohan() {
        return kekohan;
    }

    /**
     * @param kekohan the kekohan to set
     */
    public void setKekohan(String kekohan) {
        this.kekohan = kekohan;
    }

    /**
     * @return the KPJ
     */
    public String getKPJ() {
        return KPJ;
    }

    /**
     * @param KPJ the KPJ to set
     */
    public void setKPJ(String KPJ) {
        this.KPJ = KPJ;
    }

    /**
     * @return the bahaya
     */
    public String getBahaya() {
        return bahaya;
    }

    /**
     * @param bahaya the bahaya to set
     */
    public void setBahaya(String bahaya) {
        this.bahaya = bahaya;
    }

    /**
     * @return the jumkontak
     */
    public int getJumkontak() {
        return jumkontak;
    }

    /**
     * @param jumkontak the jumkontak to set
     */
    public void setJumkontak(int jumkontak) {
        this.jumkontak = jumkontak;
    }

    /**
     * @return the kondkontak
     */
    public String getKondkontak() {
        return kondkontak;
    }

    /**
     * @param kondkontak the kondkontak to set
     */
    public void setKondkontak(String kondkontak) {
        this.kondkontak = kondkontak;
    }

    /**
     * @return the poskontak
     */
    public String getPoskontak() {
        return poskontak;
    }

    /**
     * @param poskontak the poskontak to set
     */
    public void setPoskontak(String poskontak) {
        this.poskontak = poskontak;
    }

    /**
     * @return the kabelLCD
     */
    public int getKabelLCD() {
        return kabelLCD;
    }

    /**
     * @param kabelLCD the kabelLCD to set
     */
    public void setKabelLCD(int kabelLCD) {
        this.kabelLCD = kabelLCD;
    }

    /**
     * @return the kondkabLCD
     */
    public String getKondkabLCD() {
        return kondkabLCD;
    }

    /**
     * @param kondkabLCD the kondkabLCD to set
     */
    public void setKondkabLCD(String kondkabLCD) {
        this.kondkabLCD = kondkabLCD;
    }

    /**
     * @return the poskabLCD
     */
    public String getPoskabLCD() {
        return poskabLCD;
    }

    /**
     * @param poskabLCD the poskabLCD to set
     */
    public void setPoskabLCD(String poskabLCD) {
        this.poskabLCD = poskabLCD;
    }

    /**
     * @return the jumLampu
     */
    public int getJumLampu() {
        return jumLampu;
    }

    /**
     * @param jumLampu the jumLampu to set
     */
    public void setJumLampu(int jumLampu) {
        this.jumLampu = jumLampu;
    }

    /**
     * @return the kondlampu
     */
    public String getKondlampu() {
        return kondlampu;
    }

    /**
     * @param kondlampu the kondlampu to set
     */
    public void setKondlampu(String kondlampu) {
        this.kondlampu = kondlampu;
    }

    /**
     * @return the poslampu
     */
    public String getPoslampu() {
        return poslampu;
    }

    /**
     * @param poslampu the poslampu to set
     */
    public void setPoslampu(String poslampu) {
        this.poslampu = poslampu;
    }

    /**
     * @return the jumKipas
     */
    public int getJumKipas() {
        return jumKipas;
    }

    /**
     * @param jumKipas the jumKipas to set
     */
    public void setJumKipas(int jumKipas) {
        this.jumKipas = jumKipas;
    }

    /**
     * @return the kondkipas
     */
    public String getKondkipas() {
        return kondkipas;
    }

    /**
     * @param kondkipas the kondkipas to set
     */
    public void setKondkipas(String kondkipas) {
        this.kondkipas = kondkipas;
    }

    /**
     * @return the posKipas
     */
    public String getPosKipas() {
        return posKipas;
    }

    /**
     * @param posKipas the posKipas to set
     */
    public void setPosKipas(String posKipas) {
        this.posKipas = posKipas;
    }

    /**
     * @return the jumAC
     */
    public int getJumAC() {
        return jumAC;
    }

    /**
     * @param jumAC the jumAC to set
     */
    public void setJumAC(int jumAC) {
        this.jumAC = jumAC;
    }

    /**
     * @return the kondAC
     */
    public String getKondAC() {
        return kondAC;
    }

    /**
     * @param kondAC the kondAC to set
     */
    public void setKondAC(String kondAC) {
        this.kondAC = kondAC;
    }

    /**
     * @return the posAC
     */
    public String getPosAC() {
        return posAC;
    }

    /**
     * @param posAC the posAC to set
     */
    public void setPosAC(String posAC) {
        this.posAC = posAC;
    }


    /**
     * @return the bandwith
     */
    public int getBandwith() {
        return bandwith;
    }

    /**
     * @param bandwith the bandwith to set
     */
    public void setBandwith(int bandwith) {
        this.bandwith = bandwith;
    }

    /**
     * @return the jumCCTV
     */
    public int getJumCCTV() {
        return jumCCTV;
    }

    /**
     * @param jumCCTV the jumCCTV to set
     */
    public void setJumCCTV(int jumCCTV) {
        this.jumCCTV = jumCCTV;
    }

    /**
     * @return the kondCTV
     */
    public String getKondCTV() {
        return kondCTV;
    }

    /**
     * @param kondCTV the kondCTV to set
     */
    public void setKondCTV(String kondCTV) {
        this.kondCTV = kondCTV;
    }

    /**
     * @return the posCTV
     */
    public String getPosCTV() {
        return posCTV;
    }

    /**
     * @param posCTV the posCTV to set
     */
    public void setPosCTV(String posCTV) {
        this.posCTV = posCTV;
    }

    /**
     * @return the bentukruang
     */
    public String getBentukruang() {
        return bentukruang;
    }

    /**
     * @param bentukruang the bentukruang to set
     */
    public void setBentukruang(String bentukruang) {
        this.bentukruang = bentukruang;
    }

    /**
     * @return the SSID
     */
    public int getSSID() {
        return SSID;
    }

    /**
     * @param SSID the SSID to set
     */
    public void setSSID(int SSID) {
        this.SSID = SSID;
    }

    /**
     * @return the analisislingkungan
     */
    public String getAnalisislingkungan() {
        return analisislingkungan;
    }

    /**
     * @param analisislingkungan the analisislingkungan to set
     */
    public void setAnalisislingkungan(String analisislingkungan) {
        this.analisislingkungan = analisislingkungan;
    }
    
    public String analisisudara()
    {
        if(sirkudara.equals("lancar"))
        {
        hasiludara = "sesuai";
        }
        else{
            hasiludara = "tidak sesuai";
        }
    return analisisudara();
    }
    public int analisiscahaya(){
        if(pencahayaan >=250 && pencahayaan <=350){
        hasilcahaya = "sesuai";
        }
        else{
            hasilcahaya = "tidak sesuai";
        }
        
        return analisiscahaya();
    }
    public int analisiskelembapan(){
        
        if(kelembapan >= 70 && kelembapan<=80)
        {
       hasillembab = "sesuai";
        }
        else
        {
            hasillembab = "tidak sesuai";
        }
        return analisiskelembapan();
    }
    public int analisissuhu(){
        
        if(celcius>=25 && celcius <=35){
        hasilsuhu = "sesuai";
       
        }else{
            hasilsuhu = "tidak sesuai";
        }
        return analisissuhu();
    }
    
    public String analisiskebisingan(){
        if(kebisingan.equals("tidak bising")){
            hasilkebisingan ="sesuai";
        }
        return analisiskebisingan();
    }
    
    public String analisisbau(){
        if(bau.equals("tidak bau")){
            hasilbau = "sesuai";
        }
        return analisisbau();
    }
    
    public String analisiskebocoran(){
        
        if(kebocoran.equals("tidak bocor")){
            hasilkebocoran = "tidak bocor";
        }
        return analisiskebocoran();
    }
    
    public String analisiskerusakan(){
        if(kerusakan.equals("tidak rusak")){
            hasilkerusakan = "sesuai";
        }
        return analisiskerusakan();
    }
    public String analisiskeausan(){
        if(keausan.equals("tidak aus")){
            hasilkeausan = "sesuai";
        }
        
        return analisiskeausan();
    }
    public String analisiskekokohan(){
        if(kekohan.equals("kokoh")){
            hasilkokoh = "sesuai";
        }
    
        return analisiskekokohan();
            }
    public String analisiskpj(){
        if(KPJ.equals("ada")){
            hasilkpj = "sesuai";
        }
        return analisiskpj();
    }    
    public String analisiskeamanan(){
        if(bahaya.equals("aman")){
            hasilkeamanan = "sesuai";
        }
       return analisiskeamanan();
    }
}
