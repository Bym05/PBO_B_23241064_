import java.util.Scanner;

class Persegi {
    // Method untuk menghitung luas persegi
    public static double luas(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling persegi
    public static double keliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input panjang dan lebar persegi
        System.out.print("Masukkan panjang persegi : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi   : ");
        double lebar = input.nextDouble();

        // Menghitung dan menampilkan luas dan keliling
        System.out.println("Luas Persegi     : " + luas(panjang, lebar));
        System.out.println("Keliling Persegi : " + keliling(panjang, lebar));

        input.close();
    }
}