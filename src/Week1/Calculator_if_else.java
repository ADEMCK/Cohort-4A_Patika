package Week1;

import java.util.Scanner;

public class Calculator_if_else {
    public static void main(String[] args) {
        // Değişkenler :
        int n1, n2, select;

        // Scanner Class :
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("İlk Sayıyı Giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        n2 = input.nextInt();

        // Seçme Aşaması
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        // switch-case
        if (select == 1) {
            System.out.println("Toplama : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkarma : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpma : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Bölme : " + (n1 / n2));
            } else {
                System.out.println("Bir sayı sıfıra bölünemez !");
            }
        } else {
            System.out.println("Hatalı sayı girdiniz.Lütfen tekrar deneyiniz.");
        }
    }
}
