package Week1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        // Faktoriyel hesaplarken başta 1 tanımlıyoruz
        Scanner scanner = new Scanner(System.in);
        int n, r, x, y, z;
        int nFac = 1;
        int rFac = 1;
        int NminRfac = 1;
        int combination = 0;

        // n ve r faktoriyel icin giris
        System.out.print("N sayı giriniz: ");
        n = scanner.nextInt();

        System.out.print("R sayı giriniz: ");
        r = scanner.nextInt();

        for (x = 1; x <= n; x++) {
            nFac *= x;
            // System.out.println("n faktoriyel : "+nFac);
        }
        // r Faktoriyel hesaplama
        for (y = 1; y <= r; y++) {
            rFac *= y;
            // System.out.println("r faktoriyel : "+rFac);
        }
        // n-r faktoriyeli.
        for (z = 1; z <= n - r; z++) {
            NminRfac *= z;
        }
        // Kombinasyon islemi
        combination = (nFac) / (rFac * (NminRfac));
        System.out.println("n ve r sayılarının kombinasyonu : " + combination);
    }
}