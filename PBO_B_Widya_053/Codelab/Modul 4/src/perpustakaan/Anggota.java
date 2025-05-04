package perpustakaan;

public class Anggota implements Peminjaman {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    @Override
    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku: " + judul);
    }

    @Override
    public void pinjamBuku(String judul, int durasiHari) {
        System.out.println(nama + " meminjam buku: " + judul + " selama " + durasiHari + " hari");
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku: " + judul);
    }
}
