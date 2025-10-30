public class OrderItem {
    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return menuItem.getPrice() * quantity;
    }

    public MenuItem getMenuItem() { return menuItem; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return menuItem.getName() + " x" + quantity + " = Rp " + getSubtotal();
    }
}
