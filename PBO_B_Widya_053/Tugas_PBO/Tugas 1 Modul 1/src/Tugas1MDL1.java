import java.util.Scanner;

public class Tugas1MDL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loginBerhasil = false;

        while (!loginBerhasil) {
            System.out.println("Pilih jenis login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan buffer


            if (pilihan == 1) {
                // Login Admin
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();

                if (username.equals("admin") && password.equals("1234")) {
                    System.out.println("Login Admin berhasil!");
                    loginBerhasil = true;
                } else {
                    System.out.println("Login gagal! Username atau password salah. Silakan coba lagi.\n");
                }

            } else if (pilihan == 2) {
                // Login Mahasiswa
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (username.equals("yaya") && nim.equals("248")) {
                    System.out.println("Login Mahasiswa berhasil!");
                    System.out.println("Username: " + username);
                    System.out.println("NIM: " + nim);
                    loginBerhasil = true;
                } else {
                    System.out.println("Login gagal! Username atau NIM salah. Silakan coba lagi.\n");
                }

            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
            }
        }

        scanner.close();
    }
}