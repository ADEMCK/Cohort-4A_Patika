package week2;

public class PalindromeWords {

    // Bu fonksiyon, verilen bir string'in palindrom olup olmadığını kontrol eder.
    static boolean isPalindrome(String str) {
        int i = 0; // Kelimenin başlangıç indeksi
        int j = str.length() - 1; // Kelimenin bitiş indeksi

        // Başlangıç indeksi bitiş indeksinden küçük olduğu sürece döngüye gir.
        while (i < j) {
            // Başlangıç ve bitiş indekslerindeki karakterler eşleşmiyorsa,
            // bu kelimenin palindrom olmadığını belirtir ve false döndür.
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++; // Başlangıç indeksini artır
            j--; // Bitiş indeksini azalt
        }

        // Yukarıdaki koşullar sağlanmıyorsa, kelime palindromdur ve true döndür.
        return true;
    }

    public static void main(String[] args) {
        // Test için "kayak" kelimesini kontrol et ve sonucu yazdır.
        System.out.println(isPalindrome("kayak"));
    }
}