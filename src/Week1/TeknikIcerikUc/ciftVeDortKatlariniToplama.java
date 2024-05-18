package Week1.TeknikIcerikUc;

import java.util.Scanner;

public class ciftVeDortKatlariniToplama {
    public static void main(String[] args) {
        int userNumber, total = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Bir sayı giriniz: ");
            userNumber = scanner.nextInt();

            // Yalnızca 4 kontrol edilir çünkü 4'e bölünüyorsa zaten çift sayıdır.
            if (userNumber % 4 == 0) {
                total += userNumber;
            }
            // Tek sayı girilene kadar devam eder.
        } while (userNumber % 2 == 0);
        System.out.println("Toplam : " + total);
    }
}