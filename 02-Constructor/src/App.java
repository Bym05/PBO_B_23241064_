// class polos atau tanpa constructor
class Polos{
    // atribut objek
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    // atribut
    String nama;
    String NIM;
    String prodi;
    String umur;
    String tinggi;

    // constructor
    // namanya sama dgn nama class
    // tidak memiliki return value/nilai balik
    // method yang pertama kali dipanggil saat objek pertama kali diciptakan/dibuat
    Mahasiswa(String inputNama, String InputNIM, String inputProdi, String inputumur, String inputtinggi){
        // mengisi data
        nama = inputNama;
        NIM = InputNIM;
        prodi = inputProdi;
        umur = inputumur;
        tinggi = inputtinggi;

        // mencetak data
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + NIM);
        System.out.println("Prodi          : " + prodi);
        System.out.println("Umur           : " + umur);
        System.out.println("Tinggi         : " + tinggi);
        System.out.println("_______________________");
    }
}





public class App {
    public static void main(String[] args) throws Exception {
        // Pembuatan Objek atau Intstansi objek
        Polos polos_1= new Polos();

        // isi atribut
        polos_1.dataString = "polos";
        polos_1.dataInteger = 10;

        // cetak objek
        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataInteger);

        // pembuatan objek mahasiswa
        Mahasiswa mhs_1 = new Mahasiswa("Bima", "23241064", "PTI/B", "21", "172");
        Mahasiswa mhs_2 = new Mahasiswa("Chelly", "23241058", "PTI/B", "24", "175");
        Mahasiswa mhs_3 = new Mahasiswa("Ridho", "23241066", "PTI/B", "20", "170");
        Mahasiswa mhs_4 = new Mahasiswa("Adam", "23241044", "PTI/B", "21", "169");
    }
}
