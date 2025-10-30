public class Receipt {
    public static void print(Order order) {
        System.out.println("====== NOTA PEMESANAN ======");
        for (OrderItem item : order.getItems()) {
            System.out.println(item);
        }
        System.out.println("-----------------------------");
        System.out.println("Subtotal : Rp " + order.getSubtotal());
        System.out.println("Total Bayar : Rp " + order.getTotal());
        System.out.println("=============================");
    }
}
