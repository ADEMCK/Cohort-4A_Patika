package Week2.TeknikIcerikDort;

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {

        // Sınıf belirleme ve kullanıcıdan verileri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        int min = Integer.MAX_VALUE; // Başlangıçta minimum değer en büyük olmalı
        int max = Integer.MIN_VALUE; // Başlangıçta maksimum değer en küçük olmalı

        for (int i : list) {
            if (i < n && i > max) {
                max = i;
            }
            if (i > n && i < min) {
                min = i;
            }
        }

        // Eğer hiçbir sayı bulunamazsa, kullanıcıya bilgi verilir
        if (max == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + max);
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + min);
        }
    }
}
