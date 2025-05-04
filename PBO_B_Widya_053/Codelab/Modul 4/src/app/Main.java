package app;

import perpustakaan.Anggota;

public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Budi");

        anggota1.pinjamBuku("Pemrograman Java");
        anggota1.pinjamBuku("Struktur Data", 7);
        anggota1.kembalikanBuku("Pemrograman Java");
    }
}
