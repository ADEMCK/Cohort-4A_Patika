package Week1;

import java.util.Scanner;

public class ciftSayilariBulma {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        inputNumber = scanner.nextInt();

        // Bundan sonra yalnızca çift sayı basılacağını bildiğimiz için ön bilgiyi burada veriyoruz.
        System.out.println("Girdiğiniz sayıya kadar olan tüm çift sayılar: ");

        // 0'dan başlayarak girdiğimiz sayıya kadar her sayıyı işliyoruz.
        for (int i = 0; i <= inputNumber; i++) {

            // Bu sayılardan yalnızca 2'ye tam bölünebilenlerini print alıyoruz.
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Bonus içerik. Patika ödevinde istenen fonksiyonu sonradan ekliyorum:
        int total = 0, counter = 0;
        for (int i = 0; i <= inputNumber; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                counter++;
            }
        }
        System.out.println("Girdiğiniz sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: " + total / counter);
    }
}