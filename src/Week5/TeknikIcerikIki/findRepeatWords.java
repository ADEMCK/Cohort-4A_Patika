package Week5.TeknikIcerikIki;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findRepeatWords {
    public static void main(String[] args) {
        // Kullanıcıdan bir metin girmesini isteyen Scanner oluşturuluyor.
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Bir metin giriniz:");
        str = scanner.nextLine();

        // Metin, boşluklara göre parçalanarak bir diziye atılıyor.
        String[] s = str.split(" ");

        // Kelimelerin tekrar sayılarını saklamak için bir HashMap oluşturuluyor.
        HashMap<String, Integer> word = new HashMap<>();

        // Her kelimenin tekrar sayısını HashMap'te tutuyoruz.
        for (String s2 : s) {
            // Küçük harfe dönüştürerek aynı kelimenin farklı formatlardaki görünümlerini birleştiriyoruz.
            s2 = s2.toLowerCase();
            if (word.containsKey(s2)) {
                // Kelime HashMap'te zaten varsa, tekrar sayısını artırıyoruz.
                word.put(s2, word.get(s2) + 1);
            } else {
                // Kelime ilk kez görülüyorsa, tekrar sayısını 1 yapıyoruz.
                word.put(s2, 1);
            }
        }

        // En çok tekrar eden kelimeyi ve tekrar sayısını saklamak için değişkenler oluşturuluyor.
        String mostFrequentWord = null;
        int maxCount = 0;

        // HashMap'teki her kelimenin tekrar sayısını kontrol ederek en çok tekrar eden kelimeyi buluyoruz.
        for (Map.Entry<String, Integer> entry : word.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // En çok geçen kelimeyi ekrana yazdırıyoruz.
        System.out.println();
        System.out.println("En çok geçen kelime: " + mostFrequentWord);
    }
}
