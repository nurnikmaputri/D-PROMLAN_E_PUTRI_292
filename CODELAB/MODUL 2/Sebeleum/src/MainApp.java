class MainApp {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 10.0, 5);
        Library lib = new Library(book1, "Perpustakaan Kota");

        // Display initial information
        System.out.println("--- Initial Book Information ---");
        lib.showLibraryInfo();
        System.out.println();

        // Add more stock
        book1.adjustStock(5);
        System.out.println();

        // Display updated information
        System.out.println("--- Updated Book Information ---");
        lib.showLibraryInfo();
    }
}