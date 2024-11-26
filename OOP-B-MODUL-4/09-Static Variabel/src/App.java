class Display{
    // variabel objek / data member
    private String nama;
    // variabel static milik class
    static String tipe = "Display"; // divol

    // konstruktor
    Display(String nama) {
        this.nama = nama;
    }

    // method cetak
    void cetak() {
        System.out.println("Display name : " + this.nama);

    }

    // method setter
    void setTipe(String tipeInput){
        //tipe = tipeInput; // cara 1
        //this.tipe = tipeInput; // cara 2
        Display.tipe = tipeInput; // cara 3
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Display display1 = new Display("Monitor");
        display1.cetak();
        Display display2 = new Display("smartphone");
        display2.cetak();

        // menampilkan isi dari static variabel
        System.out.println("\nMenampilkan Static Variabel");
        System.out.println("objek1 : " + display1.tipe);
        System.out.println("objek2 : " + display2.tipe);
        System.out.println("Class  : " + Display.tipe);

        // menulis surat isi variabel static
        //display1.tipe = "Tamiplan";
        //display2.tipe = "Tampilan";
        Display.tipe = "Tampilan";

        // menggunakan setter
        display1.setTipe("Spanduk");

        // memanggil isi variabel static
        System.out.println("\nMenampilkan Static Variabel");
        System.out.println("objek1 : " + display1.tipe);
        System.out.println("objek2 : " + display2.tipe);
        System.out.println("Class  : " + Display.tipe);

        // coba-coba
        display1.setTipe("Tiara Mas");
        System.out.println("\nMenampilkan Static Variabel");
        System.out.println("objek1 : " + display1.tipe);
        System.out.println("objek2 : " + display2.tipe);
        System.out.println("Class  : " + Display.tipe);
    }
}