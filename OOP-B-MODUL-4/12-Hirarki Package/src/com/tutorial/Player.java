package com.tutorial;

import com.terminal.Console;

// visibiliti default hanya bisa diakses oleh package
// yang sama
class Player {
    // variabel objek
    private String nama;

    // konstruktor
    Player(String nama){
        this.nama = nama;
    }

    // method cetak
    void cetak(){
        Console.log("Menggunakan console");
        Console.log("Nama : " + this.nama);
    }

    // method getter
    String getName(){
        return this.nama;
    }
}
