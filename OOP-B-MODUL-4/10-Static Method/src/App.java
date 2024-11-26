import java.util.ArrayList;

class Player{
    // variabel objek
    private String nama;

    // variabel static
    private static int numberOfPlayer;

    // array variabel
    private static ArrayList<String> namaList = new ArrayList<String>();

    // konstruktor
    Player(String nama){
        this.nama = nama;
        Player.numberOfPlayer++;
        Player.namaList.add(this.nama);
    }

    // method static cetak numberOfPlayer
    static void showNumberOfplayer(){
        System.out.println("Number of Player : " + Player.numberOfPlayer);
    }

    // method cetak
    void cetak(){
        System.out.println("Player name : " + this.nama);
    }

    // method static getter
    static ArrayList<String> getName(){
        return Player.namaList;
    }
}



public class App {
    public static void main(String[] args) throws Exception {
        // membuat objek
        Player player1 = new Player("Bung Binder");
        Player player2 = new Player("Shin Tae Young");
        Player player3 = new Player("Coach Justin");
        Player player4 = new Player("Bung Towel");
        Player player5 = new Player("Jebret");
        Player player6 = new Player("Egy Messi");

        Player.showNumberOfplayer();
        player1.cetak();

        // panggil nama array
        System.out.println("Nama: " + Player.getName());
    }
}
