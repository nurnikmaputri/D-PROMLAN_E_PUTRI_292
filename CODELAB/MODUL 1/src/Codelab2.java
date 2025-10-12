import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Codelab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan usia Anda: ");
            int usia = input.nextInt();

            if (usia <= 0 || usia >= 120) {
                throw new InvalidAgeException("Usia tidak valid! Harus lebih dari 0 dan kurang dari 120.");
            }

            System.out.println("Usia Anda adalah: " + usia + " tahun. Data valid.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harus berupa angka.");
        }

        input.close();
    }
}