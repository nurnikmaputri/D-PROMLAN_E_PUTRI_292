import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka positif: ");

        try {
            double num = scanner.nextDouble();
            if (num <= 0) {
                throw new InvalidNumberException("Error: Angka harus lebih besar dari 0!");
            }
            System.out.println("Angka valid: " + num);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid, harus berupa angka!");
        }
    }
}
