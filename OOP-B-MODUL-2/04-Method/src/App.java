class Mahasiswa {
    // Data Member atau ciri
    String nama;
    String NIM;

    // Constructor
    Mahasiswa(String Nama, String NIM){
        this.nama = Nama;
        this.NIM  = NIM;
    }

    // Method tanpa return dan Tanpa Parameter
    void cetak(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // method dengan parameter dan tanpa return
    void setNama(String nama){
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    // method dengan parameter dan return
    String sayHai(String pesan){
        return "Hi.." + this.nama + pesan;
    }
}




public class App {
    public static void main(String[] args) throws Exception{
        
        // Membuat Objek
        Mahasiswa mhs_1 = new Mahasiswa("Bima", "23241064");

        // memanggil method tanpa parameter dan return
        mhs_1.cetak();

        // memanggil method dengan parameter tanpa return
        mhs_1.setNama("Bima");
        mhs_1.cetak();

        // memanggil method dengan return tanpa parameter
        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());

        // memanggil method dengan parameter dan return
        String pesan = mhs_1.sayHai(" Sukses Selalu Bos Moeda Belajar OOP");
        System.out.println(pesan);
    }
}