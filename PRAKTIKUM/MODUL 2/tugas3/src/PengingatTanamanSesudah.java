// File: PengingatTanamanSesudah.java
import java.util.Scanner;

// Refactoring 1: Membuat class Tanaman agar data lebih terorganisir(extract class)
class Tanaman {
    private String nama;
    private int intervalSiram;
    private int intervalPupuk;
    private int jamCahaya;

    // Refactoring 2: Menambahkan konstruktor untuk inisialisasi data(extract constructor)
    public Tanaman(String nama, int intervalSiram, int intervalPupuk, int jamCahaya) {
        this.nama = nama;
        this.intervalSiram = intervalSiram;
        this.intervalPupuk = intervalPupuk;
        this.jamCahaya = jamCahaya;
    }

    // Refactoring 3: Menambahkan getter (enkapsulasi data) (encapsulate field)
    public String getNama() { return nama; }
    public int getIntervalSiram() { return intervalSiram; }
    public int getIntervalPupuk() { return intervalPupuk; }
    public int getJamCahaya() { return jamCahaya; }

    // Refactoring 4: Metode khusus untuk menampilkan perawatan tanaman (extrct method)
    public void tampilkanPerawatan() {
        System.out.println("\n=== Rincian Perawatan Tanaman ===");
        System.out.println("Nama Tanaman       : " + nama);
        System.out.println("Penyiraman setiap  : " + intervalSiram + " hari");
        System.out.println("Pemupukan setiap   : " + intervalPupuk + " hari");
        System.out.println("Butuh sinar matahari: " + jamCahaya + " jam/hari");

        System.out.println("\nSaran Perawatan:");
        System.out.println(saranPenyiraman());
        System.out.println(saranCahaya());
    }

    // Refactoring 5: Pisahkan logika kondisi ke dalam metode tersendiri (extra conditional logic)
    private String saranPenyiraman() {
        return intervalSiram <= 2 ? "Perlu disiram cukup sering." : "Tahan terhadap kekeringan.";
    }

    private String saranCahaya() {
        return jamCahaya >= 6 ? "Tempatkan di area yang sangat terang." : "Cukup cahaya sedang saja.";
    }
}

public class PengingatTanamanSesudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama tanaman: ");
        String nama = input.nextLine();

        System.out.print("Berapa hari sekali disiram: ");
        int siram = input.nextInt();

        System.out.print("Berapa hari sekali diberi pupuk: ");
        int pupuk = input.nextInt();

        System.out.print("Berapa jam butuh sinar matahari per hari: ");
        int cahaya = input.nextInt();

        // Refactoring 6: Gunakan objek untuk menyimpan dan menampilkan data tanaman (use object composition)
        Tanaman tanamanSaya = new Tanaman(nama, siram, pupuk, cahaya);
        tanamanSaya.tampilkanPerawatan();
    }
}
