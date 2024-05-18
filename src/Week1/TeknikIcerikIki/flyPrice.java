package Week1.TeknikIcerikIki;

import java.util.Scanner;

public class flyPrice {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scanner = new Scanner(System.in);
        double km, Ucret, indirimliUcret, yasindirimi = 0, ciftyonIndirimi;
        int yolculukTipi, yas;

        // Yas, Mesafe - Yolculuk Tipi
        System.out.println("Mesafeyi km türünden giriniz : ");
        km = scanner.nextDouble();

        System.out.println("Yaşınızı giriniz : ");
        yas = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) :");
        yolculukTipi = scanner.nextInt();

        // İndirimsiz Ücret
        Ucret = km * 0.10;

        // Yaş İndirimi
        if (km > 0 && yas > 0) {
            if (yas < 12) {
                yasindirimi = Ucret * 0.50;

            } else if (yas >= 12 && yas <= 24) {
                yasindirimi = Ucret * 0.10;

            } else if (yas >= 65) {
                yasindirimi = Ucret * 0.30;
            }
            indirimliUcret = Ucret - yasindirimi;

            // Switch Class
            switch (yolculukTipi) {
                case 1:
                    System.out.println("Tek yon seçtiniz. ");
                    System.out.println("Toplam tutar : " + indirimliUcret + "TL");
                    break;
                case 2:
                    System.out.println("Çift yön seçtiniz. ");
                    ciftyonIndirimi = indirimliUcret * 0.2;
                    indirimliUcret = (indirimliUcret - ciftyonIndirimi) * 2;
                    System.out.println("Toplam tutar : " + indirimliUcret + "TL");
                    break;
                default:
                    System.out.println("Hatalı yolculuk tipi girişi yaptınız. ");
            }
        } else {
            System.out.println("Hatalı yaş ya da mesafe girişi yaptınız.");
        }
    }
}
