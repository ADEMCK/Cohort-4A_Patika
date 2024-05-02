package week2;

import java.util.Scanner;

public class gelismisHesapMakinesi {
    // Toplama işleminin metodunu yazıyoruz.
    static int plus(int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    // Çıkarma işleminin metodunu yazıyoruz.
    static void minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
    }

    // Çarpma işleminin metodunu yazıyoruz.
    static void times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
    }

    // Bölme işleminin metodunu yazıyoruz. 0'ın bölen olmayacağını yazıyoruz.
    static void divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalı.");
        }
        double result = a / b;
        System.out.println("Bölüm: " + result);
    }

    // Üst alma işlemini çıkan sonucu kendisiyle çarparak metodunu yazıyoruz.
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Üst alma işlemi: " + result);
        return result;
    }

    // Mod alma işleminin metodunu yazıyoruz.
    static void mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod alma işlemi: " + result);
    }

    // Faktöriyel almak için metodunu yazıyoruz.
    static void factorial(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= i;
        }
        System.out.println("Faktöriyel alma işlemi: " + result);
    }

    // Dikdörtgen alan ve çevre hesabı için metodu yazıyoruz.
    static void rectangle(int a, int b) {
        int result1 = a + b;
        int result2 = a * b;
        System.out.println("Dikdörtgenin Çevresi: " + result1);
        System.out.println("Dikdörtgenin Alanı: " + result2);
    }

    public static void main(String[] args) {
        // Menüyü kullanıcının seçeceği şekilde Scanner sınıfına yazıyoruz.
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma İşlemi\n"
                + "7- Faktöriyel Alma İşlemi\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        do {
            System.out.print("Bir işlem seçiniz: ");
            select = inp.nextInt();
            // Kullanıcının 0'ı seçmesiyle sistemden çıkış yapılması için yazıldı.
            if (select == 0) {
                System.out.println("Güle Güle");
                break;
            }
            System.out.print("İlk sayıyı giriniz: ");
            int a = inp.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = inp.nextInt();

            // Switch case metoduyla caselerde yukarıdaki yazmış olduğumuz metotları çağırıyoruz.
            switch (select) {
                case 1:
                    plus(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    factorial(a, b);
                    break;
                case 8:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz, başka işlem seçiniz.");
            }
        } while (select != 0);
    }
}