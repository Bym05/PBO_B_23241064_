package com.tutorial;

import com.terminal.Console;

import static com.terminal.Console.log;

class Main {
    public static void main(String[] args) {
        // membuat objek
        System.out.println("Hello Bim");

        Player player1 = new Player("BimBim");
        Player player2 = new Player("Bima");
        player1.cetak();
        player2.cetak();

        Console.log("Menampilkan data dari console");
        Console.log("Player Name : " + player1.getName());
        Console.log("Player Name : " + player2.getName());

        log("Menampilkan data dari console");
        log(player1.getName());
    }
}
