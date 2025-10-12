import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> angkaList = new ArrayList<>();

        System.out.println("Masukkan angka (ketik 'q' untuk selesai):");

        while (true) {
            System.out.print("Input angka: ");
            try {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    break; // keluar dari loop jika user ketik 'q'
                }
                double angka = Double.parseDouble(input);
                angkaList.add(angka);
            } catch (NumberFormatException e) {
                System.out.println("⚠ Input tidak valid! Harus berupa angka atau 'q' untuk selesai.");
            }
        }

        if (angkaList.isEmpty()) {
            System.out.println("Tidak ada angka yang dimasukkan.");
        } else {
            double total = 0;
            for (double angka : angkaList) {
                total += angka;
            }
            double rataRata = total / angkaList.size();
            System.out.println("\n✅ Rata-rata adalah: " + rataRata);
        }

        scanner.close();
    }
}
