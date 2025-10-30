import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, MenuItem> menu = new HashMap<>();
        menu.put("M01", new MenuItem("M01", "Nasi Goreng", 25000));
        menu.put("M02", new MenuItem("M02", "Mie Ayam", 20000));
        menu.put("M03", new MenuItem("M03", "Es Teh", 5000));

        Order order = new Order();
        System.out.print("Masukkan diskon (%): ");
        order.setDiscountPercent(Double.parseDouble(sc.nextLine()));
        System.out.print("Masukkan pajak (%): ");
        order.setTaxPercent(Double.parseDouble(sc.nextLine()));

        System.out.println("Masukkan pesanan (ID dan jumlah): ");
        String id = sc.nextLine().trim().toUpperCase();
        int qty = Integer.parseInt(sc.nextLine());
        order.addItem(menu.get(id), qty);

        Receipt.print(order);
    }
}
