// ======= CLASS MAIN (4️⃣ Move Method) =======
public class MainApp {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 10.0, 2);
        Library lib = new Library(book1, "Perpustakaan Kota");

        System.out.println("--- Initial Book Information ---");
        lib.showLibraryInfo();
        System.out.println();

        book1.adjustStock(5);
        System.out.println();

        System.out.println("--- Updated Book Information ---");
        lib.showLibraryInfo();
    }
}
