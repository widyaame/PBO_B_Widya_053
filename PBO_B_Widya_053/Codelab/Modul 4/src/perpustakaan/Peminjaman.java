package perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judul);
    void pinjamBuku(String judul, int durasiHari);
    void kembalikanBuku(String judul);
}
