package Week5;
import java.util.Scanner;

public class ArrayElementRetriever {

    // 10 elemanlı tek boyutlu dizi
    private static int[] dizi = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public static void main(String[] args) {
        // Scanner sınıfı ile kullanıcıdan indeks bilgisini al
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir indeks girin: ");
        int indeks = scanner.nextInt();

        // Girilen indeksteki elemanı veya hata mesajını yazdır
        System.out.println(indekstekiElemaniGetir(indeks));

        scanner.close();
    }

    public static String indekstekiElemaniGetir(int indeks) {
        try {
            // Diziden belirtilen indeksteki elemanı döndür
            return "Indeks " + indeks + " içindeki eleman: " + dizi[indeks];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hata durumunda bir hata mesajı döndür
            return "Hata: Indeks " + indeks + " geçersiz. Geçerli indeksler 0 ile " + (dizi.length - 1) + " arasındadır.";
        }
    }
}