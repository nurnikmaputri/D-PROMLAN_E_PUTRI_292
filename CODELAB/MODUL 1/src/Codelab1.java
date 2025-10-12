import java.util.ArrayList;

public class Codelab1 {
    public static void main(String[] args) {
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        ArrayList<String> namaTerpanjang = cariNamaTerpanjang(nama);

        System.out.println("Nama terpanjang adalah: " + namaTerpanjang);
    }

    public static ArrayList<String> cariNamaTerpanjang(String[] array) {
        ArrayList<String> hasil = new ArrayList<>();
        int panjangMax = 0;

        for (String nama : array) {
            if (nama.length() > panjangMax) {
                panjangMax = nama.length();
            }
        }

        for (String nama : array) {
            if (nama.length() == panjangMax) {
                hasil.add(nama);
            }
        }

        return hasil;
    }
}