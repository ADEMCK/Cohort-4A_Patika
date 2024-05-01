package Week1;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        // Scanner sınıfını tanımla ve kullanıcıdan değerleri al.
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = scanner.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = scanner.nextInt();

        // EBOB hesaplamak için işlemler20
        int ebob = 1;
        int k = n1;
        while (k >= 1) {
            if ((n1 % k == 0 && n2 % k == 0)) {
                ebob = k;
                break;
            }
            k--;
        }
        System.out.println("EBOB: " + ebob);

        // EKOK hesaplamak için işlemler
        int ekok = (n1 * n2) / ebob;
        System.out.println("EKOK: " + ekok);
    }
}