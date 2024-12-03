package com.tutorial;

// digunakan untuk keyword dan untuk impor package eksternal
import com.terminal.Console;

class Main {
    public static void main(String[] args) {
        // membuat objek
        player player1 = new player("Ahing Gank");
        player player2 = new player("Goging");
        player player3 = new player("Agung");
        player1.cetak();
        player2.cetak();
        player3.cetak();

        Console.log("Hallo");
        Console.log("APA YANG KAMU LIHAT ?? BELAJAR !!!!");
    }  
}