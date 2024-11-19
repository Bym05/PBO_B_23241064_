import java.util.Scanner;

class Gaji {
    // Data member atau variabel instan
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Constructor, tanpa modifier akses
    public Gaji() {
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.pajak = 0;
    }

    // Setter untuk Gaji Pokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk Gaji Pokok
    public int getGajiPokok() {
        return this.gajiPokok;
    }

    // Setter untuk Tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk Tunjangan
    public int getTunjangan() {
        return this.tunjangan;
    }

    // Setter untuk Pajak (dalam persen)
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter untuk Pajak (dalam persen)
    public double getPajak() {
        return this.pajak;
    }

    // Method untuk menghitung Gaji Bersih (menggunakan int)
    public int hitungGajiBersih() {
        int totalGaji = this.gajiPokok + this.tunjangan;
        int pajakRupiah = (int) ((this.pajak / 100) * totalGaji); // Menghitung pajak dalam rupiah dan dibulatkan ke int
        return totalGaji - pajakRupiah;
    }

    // Method untuk mencetak Gaji Bersih
    public void cetakGajiBersih() {
        System.out.println("Gaji Pokok   : " + this.gajiPokok);
        System.out.println("Tunjangan    : " + this.tunjangan);
        System.out.println("Pajak        : " + this.pajak + "%");
        System.out.println("Gaji Bersih  : " + hitungGajiBersih());
    }
}

public class App {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Instansiasi objek Gaji
        Gaji gaji1 = new Gaji();

        // Input dari pengguna
        System.out.print("Masukkan Gaji Pokok: ");
        int gajiPokok = scanner.nextInt();
        gaji1.setGajiPokok(gajiPokok);

        System.out.print("Masukkan Tunjangan: ");
        int tunjangan = scanner.nextInt();
        gaji1.setTunjangan(tunjangan);

        System.out.print("Masukkan Pajak (dalam persen): ");
        double pajak = scanner.nextDouble();
        gaji1.setPajak(pajak);

        // Mencetak Gaji Bersih
        gaji1.cetakGajiBersih();

        // Menutup scanner
        scanner.close();
    }
}