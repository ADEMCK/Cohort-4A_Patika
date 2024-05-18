package Week1.TeknikIcerikBir;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, total, startPrice = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz : ");
        km = scanner.nextInt();
        total = km * perKM;
        total += startPrice;
        total = (total < 20) ? 20 : total;

        System.out.println("Toplam Tutar : " + total);
    }
}