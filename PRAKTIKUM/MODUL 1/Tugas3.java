import java.util.ArrayList;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaList = new ArrayList<>();
        ArrayList<Integer> nilaiList = new ArrayList<>();
        ArrayList<String> statusList = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Nilai ujian akhir: ");
            int nilai = scanner.nextInt();
            scanner.nextLine(); // bersihkan newline

            // validasi nilai
            if (nilai < 0 || nilai > 100) {
                System.out.println("⚠ Error: Nilai harus dalam rentang 0 - 100. Data dilewati.");
                continue;
            }

            // tentukan status
            String status = (nilai >= 60) ? "Lulus" : "Tidak Lulus";

            // simpan data
            namaList.add(nama);
            nilaiList.add(nilai);
            statusList.add(status);
        }

        // tampilkan hasil
        System.out.println("\n===== HASIL KELULUSAN =====");
        for (int i = 0; i < namaList.size(); i++) {
            System.out.println("Nama: " + namaList.get(i) +
                    " | Nilai: " + nilaiList.get(i) +
                    " | Status: " + statusList.get(i));
        }
    }
}

//Deskripsi Formal (Spesifikasi Program)
//Menggunakan pendekatan Hoare Triple (P, C, Q)
//Precondition (P):
//Input berupa jumlah mahasiswa (bilangan bulat positif).
//Setiap mahasiswa memiliki nama (String, tidak kosong) dan nilai ujian akhir (bilangan bulat dalam rentang 0–100).
//Command (C):
//Program membaca data setiap mahasiswa.
//Program memvalidasi nilai ujian (jika nilai < 0 atau > 100 → data dilewati).
//Program menentukan status kelulusan:
//Jika nilai ≥ 60 → status = "Lulus".
//Jika nilai < 60 → status = "Tidak Lulus".
//Program menyimpan data mahasiswa, nilai, dan status ke dalam daftar (ArrayList).
//Postcondition (Q):
//Program menampilkan daftar mahasiswa yang valid dengan format:

//Deskripsi Informal

//Program ini digunakan untuk membantu guru menentukan kelulusan mahasiswa berdasarkan nilai ujian akhir.
// Pertama, program akan meminta jumlah mahasiswa yang ingin dimasukkan.
// Kemudian, pengguna menginput nama dan nilai ujian akhir untuk setiap mahasiswa.
// Jika nilai ujian berada di luar rentang 0–100, maka data tersebut dianggap tidak valid dan dilewati.
// Setelah semua data dimasukkan, program akan menampilkan daftar mahasiswa lengkap dengan nama, nilai, dan status kelulusannya.
// Mahasiswa dengan nilai ≥ 60 dinyatakan lulus, sedangkan yang nilainya di bawah 60 dinyatakan tidak lulus.