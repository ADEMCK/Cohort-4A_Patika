package Week2.TeknikIcerikBes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        // Rastgele bir sayı oluşturmak için Random sınıfını kullanıyoruz.
        Random rand = new Random();
        int number = rand.nextInt(100); // 0 ile 99 arasında rastgele bir sayı seçiyoruz.

        // Kullanıcıdan giriş almak için Scanner sınıfını kullanıyoruz.
        Scanner inp = new Scanner(System.in);
        int right = 0; // Doğru tahmin sayısını takip etmek için değişken.
        int selected; // Kullanıcının girdiği sayıyı saklamak için değişken.
        int[] wrong = new int[5]; // Hatalı tahminleri saklamak için dizi.
        boolean isWin = false; // Oyunun kazanılıp kazanılmadığını kontrol etmek için değişken.
        boolean isWrong = false; // Hatalı giriş durumunu kontrol etmek için değişken.

        // Kullanıcının 5 hakkı var. Doğru tahmin yapana ya da hakları bitene kadar döngü devam eder.
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = inp.nextInt();

            // Kullanıcının girdiği sayının geçerli bir aralıkta olduğunu kontrol ediyoruz.
            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");

                // Eğer kullanıcı hatalı giriş yapıyorsa, hakkından düşme işlemi yapılır.
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue; // Döngünün başına geri dönerek yeni bir tahmin istenir.
            }
            // Kullanıcının girdiği sayı doğruysa, oyun kazanılır ve döngüden çıkılır.
            if (selected == number) {
                System.out.println("Tebrikler! Tahmininiz doğru! Gizli sayı:  " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Tahmininiz yanlış! ");

                // Kullanıcının girdiği sayının, gizli sayıya göre durumunu bildiririz.
                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                wrong[right] = selected; // Hatalı tahmini dizide saklarız.
                right++; // Doğru tahmin sayısını artırırız.
                System.out.println("Kalan Hakkınız: " + (5 - right));
            }
        }
        // Oyunun sonunda kazanılıp kazanılmadığını kontrol ederek sonuçları yazdırırız.
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            System.out.println("Gizli sayı: " + number);
        }
    }
}