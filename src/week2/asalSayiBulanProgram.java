package week2;

import java.util.Scanner;

public class asalSayiBulanProgram {
    // Asal sayıları bulmak için boolean yöntemini kullanıyoruz.
    static boolean primeNumber(int n) {
        // 1'den küçük sayıların asal sayı olmamasını oluşturuyoruz.
        if (n <= 1) {
            return false;
        }
        // Asal sayıları bulmak için formülü yazıyoruz.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        // Üstteki metot çağırılarak sayının asal olup olmadığının çıktısını alıyoruz.
        if (primeNumber(n)) {
            System.out.println(n + " asal sayıdır.");
        } else {
            System.out.println(n + " asal sayı değildir.");
        }
    }
}