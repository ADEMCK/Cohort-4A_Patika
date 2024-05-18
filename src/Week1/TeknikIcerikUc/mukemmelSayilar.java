package Week1.TeknikIcerikUc;

import java.util.Scanner;

public class mukemmelSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Kullanıcıdan değer alma
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        // Sayının kendisine kadar olan tüm bölenlerini kontrol et.
        int toplam = 0;
        for (int i = 1; i < n; i++) {

            // Eğer i, sayıya tam bölünüyorsa, i'yi toplam değişkenine ekle.
            if (n % i == 0) {
                toplam += i;
            }
        }
        //Toplam girilen sayıya eşitse mükemmel bir sayıdır.
        if (toplam == n) {
            System.out.print(n + " Mükemmel bir sayıdır.");
        } else {
            System.out.print(n + " Mükemmel bir sayı değildir.");
        }
    }
}