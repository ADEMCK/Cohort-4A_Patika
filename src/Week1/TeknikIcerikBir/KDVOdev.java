package Week1.TeknikIcerikBir;

import java.util.Scanner;
public class KDVOdev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        double tutar = scanner.nextDouble();
        //KDV ORANI BELIRLEME
        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        //KDV'LI FIYAT
        double kdvliFiyat = tutar * (1 + kdvOrani);
        //KDV TUTARI HESAPLAMA
        double kdvTutari = tutar * kdvOrani;
        String kdvOraniMetni = (tutar > 1000) ? "KDV Oranı (%8) " : "KDV Oranı (%18) ";

        System.out.println("KDV'siz Fiyat : " + tutar);

        System.out.println(kdvOraniMetni + "KDV Tutarı : " + kdvTutari);

        System.out.println(kdvOraniMetni + "KDV'li Fiyat : " + kdvliFiyat);

    }
}