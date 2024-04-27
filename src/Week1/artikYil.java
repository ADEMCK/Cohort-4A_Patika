package Week1;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scanner = new Scanner(System.in);

        int year;
        System.out.println("Lütfen bir yıl giriniz :");
        year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " bir artık yıldır !");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(+year + " bir artik yil degildir.");
        }
    }
}
