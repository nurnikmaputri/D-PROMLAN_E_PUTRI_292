import java.util.ArrayList;

public class Order {
    private ArrayList<OrderItem> items = new ArrayList<>();
    private double discountPercent;
    private double taxPercent;

    public void addItem(MenuItem menu, int qty) {
        items.add(new OrderItem(menu, qty));
    }

    public ArrayList<OrderItem> getItems() { return items; }

    public void setDiscountPercent(double discountPercent) { this.discountPercent = discountPercent; }
    public void setTaxPercent(double taxPercent) { this.taxPercent = taxPercent; }

    public double getSubtotal() {
        double subtotal = 0;
        for (OrderItem item : items) {
            subtotal += item.getSubtotal();
        }
        return subtotal;
    }

    public double getTotal() {
        double discount = getSubtotal() * (discountPercent / 100);
        double tax = (getSubtotal() - discount) * (taxPercent / 100);
        return getSubtotal() - discount + tax;
    }
}
