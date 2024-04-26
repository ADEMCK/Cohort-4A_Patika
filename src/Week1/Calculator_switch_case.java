import java.util.Scanner;

public class Calculator_switch_case {
    public static void main(String[] args) {
        // Değişkenler :
        int n1, n2, select;

        // Scanner Class :
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("İlk Sayıyı Giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        n2 = input.nextInt();

        // Seçme Aşaması
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        // switch-case
        switch (select) {
            case 1:
                System.out.println("Toplama : " + n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme: " + n1 + " / " + n2 + " = " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez !");
                }
                break;

            default:
                System.out.println("Hatalı sayı girdiniz. Lütfen tekrar deneyiniz!");
                break;
        }
    }
}