import java.util.Scanner;
import java.time.LocalDate;

public class Codelab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inputan nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // inputan jenis laki laki
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // inputan tanggal lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // menghitung umur menggunakan local date
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // tentuan jenis kelamin
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-Laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        } else {
            jenisKelaminStr = "Tidak Diketahui";
        }

        // output
        System.out.println("\nData Diri:");
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + jenisKelaminStr);
        System.out.println("Umur           : " + umur + " tahun");


        scanner.close();
    }
}