import java.util.Scanner;

// Kelas Admin
class Admin {
    private String username;
    private String password;

    // Constructor
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Metode login untuk Admin
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    private String nama;
    private String nim;

    // Constructor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Metode login untuk Mahasiswa
    public boolean login(String inputNama, String inputNim) {
        return this.nama.equals(inputNama) && this.nim.equals(inputNim);
    }

    // Metode untuk menampilkan informasi mahasiswa setelah login berhasil
    public void displayInfo() {
        System.out.println("\n===== Informasi Mahasiswa =====");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

// Kelas LoginSystem (kelas utama)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data admin dan mahasiswa yang sudah ada
        Admin admin = new Admin("admin123", "password123");
        Mahasiswa mahasiswa = new Mahasiswa("Budi", "220123456");

        while (true) {
            // Menampilkan menu login
            System.out.println("\n===== SISTEM LOGIN =====");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih jenis login: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            if (pilihan == 1) {
                // Login sebagai Admin
                System.out.print("Masukkan Username: ");
                String inputUsername = scanner.nextLine();
                System.out.print("Masukkan Password: ");
                String inputPassword = scanner.nextLine();

                if (admin.login(inputUsername, inputPassword)) {
                    System.out.println("\nLogin Admin berhasil! Selamat datang, Admin.");
                } else {
                    System.out.println("\nLogin gagal! Username atau password salah.");
                }

            } else if (pilihan == 2) {
                // Login sebagai Mahasiswa
                System.out.print("Masukkan Nama: ");
                String inputNama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String inputNim = scanner.nextLine();

                if (mahasiswa.login(inputNama, inputNim)) {
                    System.out.println("\nLogin Mahasiswa berhasil!");
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("\nLogin gagal! Nama atau NIM salah.");
                }

            } else if (pilihan == 3) {
                // Keluar dari program
                System.out.println("\nTerima kasih! Program selesai.");
                scanner.close();
                break;
            } else {
                System.out.println("\nPilihan tidak valid! Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}
