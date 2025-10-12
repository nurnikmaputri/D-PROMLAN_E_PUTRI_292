// ======= CLASS BOOK =======
class Book {
    // 1️⃣ Encapsulate Field: ubah semua atribut menjadi private
    private String title;
    private String author;
    private double price;
    private int stock;

    // 2️⃣ Introduce Constant: ganti magic number dengan konstanta
    private static final double DISCOUNT_RATE = 0.1;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // 3️⃣ Extract Method: pisahkan perhitungan diskon
    public double calculateDiscount() {
        return price - (price * DISCOUNT_RATE);
    }

    // Getter & Setter (Encapsulation)
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Method untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Discounted Price: $" + calculateDiscount());
        System.out.println("Stock: " + stock);
    }

    public void adjustStock(int adjustment) {
        stock += adjustment;
        System.out.println("Stock adjusted.");
        System.out.println("Current stock: " + stock);
    }
}
