// Kelas KarakterGame (Superclass)
class KarakterGame {
    private String nama;
    private int kesehatan;

    // Constructor
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk kesehatan
    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Method serang yang akan di-override oleh subclass
    public void serang(KarakterGame target) {
        // Method ini akan di-override oleh subclass
    }
}

// Kelas Pahlawan (Subclass dari KarakterGame)
class Pahlawan extends KarakterGame {
    // Constructor
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        target.setKesehatan(target.getKesehatan() - 20); // Kurangi kesehatan target
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Kelas Musuh (Subclass dari KarakterGame)
class Musuh extends KarakterGame {
    // Constructor
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15); // Kurangi kesehatan target
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Kelas Main (Kelas Utama)
public class Main {
    public static void main(String[] args) {
        // Membuat objek-objek
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal kesehatan Pahlawan dan Musuh
        System.out.println("Status awal:");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());

        // Mensimulasikan pertarungan
        brimstone.serang(viper); // Brimstone menyerang Viper
        viper.serang(brimstone); // Viper menyerang Brimstone
    }
}