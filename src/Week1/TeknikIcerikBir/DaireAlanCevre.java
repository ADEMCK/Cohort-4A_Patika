package Week1.TeknikIcerikBir;

import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = scanner.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

    }
}