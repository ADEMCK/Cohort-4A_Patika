package Week1;

import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) {
        // Scanner + intager Class
        Scanner scanner = new Scanner(System.in);
        int num1, num2, i;
        int calc = 1;

        // n faktoriyel için giriş
        System.out.print("ilk sayıyı giriniz : ");
        num1 = scanner.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        num2 = scanner.nextInt();

        // Üssü kadar for döngüsü
        for (i = 1; i <= num2; i++) {
            calc *= num1;
        }
        System.out.println("Sonuç : " + calc);
    }
}
