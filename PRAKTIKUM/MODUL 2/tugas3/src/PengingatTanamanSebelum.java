// File: PengingatTanamanSebelum.java
import java.util.Scanner;

public class PengingatTanamanSebelum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //kode disimpan sbg variabel terpisah
        String namaTanaman;
        int hariPenyiraman;
        int hariPemupukan;
        int jamCahaya;

        //nilai variabel dimasukkan satu persatu melalui input
        System.out.print("Masukkan nama tanaman: ");
        namaTanaman = input.nextLine();

        System.out.print("Berapa hari sekali disiram: ");
        hariPenyiraman = input.nextInt();

        System.out.print("Berapa hari sekali diberi pupuk: ");
        hariPemupukan = input.nextInt();

        System.out.print("Berapa jam butuh sinar matahari per hari: ");
        jamCahaya = input.nextInt();

    //data diakses langsung melalui variabel publik tnpa perlindungan -baris ke 2
    //kode untuk menampilkan perawatan ditulis langsung di main
        //semua ditampilan dicetak di main
        System.out.println("=== Rincian Perawatan Tanaman ===");
        System.out.println("Nama tanaman: " + namaTanaman); //dio;ah semua tanpa objek
        System.out.println("Penyiraman setiap " + hariPenyiraman + " hari");
        System.out.println("Pemupukan setiap " + hariPemupukan + " hari");
        System.out.println("Butuh sinar matahari " + jamCahaya + " jam per hari");

//kondisi logika ditulis langsung di main
        if (hariPenyiraman <= 2) {
            System.out.println("Tanaman ini perlu disiram cukup sering.");
        } else {
            System.out.println("Tanaman ini tahan terhadap kekeringan.");
        }

        if (jamCahaya >= 6) {
            System.out.println("Tempatkan di area yang sangat terang.");
        } else {
            System.out.println("Cukup cahaya sedang saja.");
        }
    }
}
