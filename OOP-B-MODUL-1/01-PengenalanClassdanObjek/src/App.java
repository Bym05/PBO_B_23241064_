// Membuat class sebagai template
class Mahasiswa{
    // membuat ciri-ciri atau atribut objek
    String nama;
    String NIM;
    String prodi;
    double IPK;
    int umur;
}




public class App {
    public static void main(String[] args) throws Exception {

        // instansiasi objek (membuat objek)
        Mahasiswa mhs_1 = new Mahasiswa();

        // pengisian data objek
        mhs_1.nama = "Bima";
        mhs_1.NIM = "23241064";
        mhs_1.prodi = "PTI";
        mhs_1.IPK = 3.85;
        mhs_1.umur = 21;

        // cetak data
        System.out.println("_________________");
        System.out.println("Nama Mahasiswa : " + mhs_1.nama);
        System.out.println("NIM   : " + mhs_1.NIM);
        System.out.println("Prodi : " + mhs_1.prodi);
        System.out.println("IPK   : " + mhs_1.IPK);
        System.out.println("Umur  : " + mhs_1.umur);
        System.out.println("_________________");

        // objek baru 
        Mahasiswa mhs_2 = new Mahasiswa();

        // isi data objek
        mhs_2.nama = "Adam";
        mhs_2.NIM = "23241044";
        mhs_2.prodi = "PTI";
        mhs_2.IPK = 3.85;
        mhs_2.umur = 21;

        // cetak data mhs 2
        System.out.println("Nama Mahasiswa : " + mhs_2.nama);
        System.out.println("NIM   : " + mhs_2.NIM);
        System.out.println("Prodi : " + mhs_2.prodi);
        System.out.println("IPK   : " + mhs_2.IPK);
        System.out.println("Umur  : " + mhs_2.umur);
        System.out.println("_________________");
    }
}
