package Week2;

import java.util.Scanner;

public class deseneGoreMetotOlusturma {
    public static void nDegerineGoreRecursive(int n) {
        // Eğer sayı 0 veya negatifse işlemi sonlandır
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        nDegerineGoreRecursive(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N değerini giriniz : ");
        int n = sc.nextInt();
        nDegerineGoreRecursive(n);
    }
}