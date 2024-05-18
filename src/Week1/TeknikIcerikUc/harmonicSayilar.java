package Week1.TeknikIcerikUc;

import java.util.Scanner;

public class harmonicSayilar {
    public static void main(String[] args) {
        // Değişkenler
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        System.out.print("Lutfen bir sayı giriniz: ");
        int n = scanner.nextInt();
        for (double i = 1; i <= n; i++) {
            result = result + (1 / i);
        }
        System.out.println("Harmonik sayılar toplamı: " + result);
    }
}