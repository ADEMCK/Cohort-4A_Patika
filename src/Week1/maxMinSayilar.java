package Week1;

import java.util.Scanner;

public class maxMinSayilar {
    public static void main(String[] args) {
        // Scanner sınıfı ve kullanıcıdan değerleri alma.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n = scanner.nextInt();

        // Sınırlar
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // For-if döngüleri
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = scanner.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}