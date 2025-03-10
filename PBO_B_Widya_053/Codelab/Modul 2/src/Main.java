import java.util.ArrayList;
import java.util.Scanner;

// Kelas RekeningBank
class RekeningBank {
    // Atribut
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Constructor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("\nNomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
    }

    // Metode untuk setor uang
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0!");
        }
    }

    // Metode untuk tarik uang
    public void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0!");
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RekeningBank> daftarRekening = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MENU BANK ===");
            System.out.println("1. Buat Rekening Baru");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Lihat Daftar Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    // Buat rekening baru
                    System.out.print("Masukkan Nomor Rekening: ");
                    String noRek = scanner.nextLine();
                    System.out.print("Masukkan Nama Pemilik: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Saldo Awal: Rp");
                    double saldoAwal = scanner.nextDouble();

                    daftarRekening.add(new RekeningBank(noRek, nama, saldoAwal));
                    System.out.println("Rekening berhasil dibuat!");
                    break;

                case 2:
                    // Setor tunai
                    System.out.print("Masukkan Nomor Rekening untuk setor tunai: ");
                    String rekSetor = scanner.nextLine();
                    RekeningBank rekeningSetor = cariRekening(daftarRekening, rekSetor);

                    if (rekeningSetor != null) {
                        System.out.print("Masukkan jumlah yang ingin disetor: Rp");
                        double jumlahSetor = scanner.nextDouble();
                        rekeningSetor.setorUang(jumlahSetor);
                    } else {
                        System.out.println("Rekening tidak ditemukan!");
                    }
                    break;

                case 3:
                    // Tarik tunai
                    System.out.print("Masukkan Nomor Rekening untuk tarik tunai: ");
                    String rekTarik = scanner.nextLine();
                    RekeningBank rekeningTarik = cariRekening(daftarRekening, rekTarik);

                    if (rekeningTarik != null) {
                        System.out.print("Masukkan jumlah yang ingin ditarik: Rp");
                        double jumlahTarik = scanner.nextDouble();
                        rekeningTarik.tarikUang(jumlahTarik);
                    } else {
                        System.out.println("Rekening tidak ditemukan!");
                    }
                    break;

                case 4:
                    // Lihat daftar rekening
                    if (daftarRekening.isEmpty()) {
                        System.out.println("Belum ada rekening yang terdaftar.");
                    } else {
                        System.out.println("\n=== DAFTAR REKENING ===");
                        for (RekeningBank rekening : daftarRekening) {
                            rekening.tampilkanInfo();
                        }
                    }
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan layanan bank.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang tersedia.");
            }
        }
    }

    // Metode untuk mencari rekening berdasarkan nomor rekening
    public static RekeningBank cariRekening(ArrayList<RekeningBank> daftarRekening, String nomorRekening) {
        for (RekeningBank rekening : daftarRekening) {
            if (rekening.nomorRekening.equals(nomorRekening)) {
                return rekening;
            }
        }
        return null;
    }
}
