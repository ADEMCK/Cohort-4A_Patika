package Week1;

import java.util.Scanner;

public class recursiveUsluSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        double tabanDegeri = scanner.nextInt();
        System.out.print("Üs değeri giriniz : ");
        double usDegeriGiriniz = scanner.nextInt();
        double result = power(tabanDegeri, usDegeriGiriniz);

        // Sonucu yazdır
        System.out.println(tabanDegeri + " üzeri " + usDegeriGiriniz + " = " + result);
    }
    // Recursive üs alma fonksiyonu
    public static double power(double base, double exponent) {
        // Eğer üs 0 ise sonuç 1'dir.
        if (exponent == 0) {
            return 1;
        }
        // Eğer üs negatif ise, pozitif yapılır ve taban ters çevrilir.
        else if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        // Recursive hesaplama
        else {
            return  (base * power(base, exponent - 1));
        }
    }
}