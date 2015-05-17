
package tb_java;

public class forpolimorfis extends IndukKelas{
    public void kondisi(){
        System.out.println("Baik");
    }
    public void posisi(){
        System.out.println("dekat dosen");
    }
}
class depanCCTV extends IndukKelas{
    public void posisi(){
        System.out.println("didepan");
    }
}

class belakangCCTV extends IndukKelas{
    public void posisi(){
        System.out.println("dibelakang");
    }
}
