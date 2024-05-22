package Week5;

public class ArrayElementRetriever {
    // 10 elemanlı tek boyutlu dizi
    private static int[] dizi = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public static void main(String[] args) {
        // Örnek kullanım
        int indeks = 5; // Kullanıcıdan alınan indeks (örnek olarak 5 verilmiştir)
        System.out.println(indekstekiElemaniGetir(indeks));

        indeks = 15; // Kullanıcıdan alınan indeks (örnek olarak 15 verilmiştir, bu da geçersiz bir indeks)
        System.out.println(indekstekiElemaniGetir(indeks));
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