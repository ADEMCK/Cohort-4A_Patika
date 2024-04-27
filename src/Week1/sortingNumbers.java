package Week1;

import java.util.Scanner;

public class sortingNumbers {
    public static void main(String[] args) {
        // Değişkenler
        int a, b, c;

        // Scanner Sınıfı
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Sayı :");
        a = scanner.nextInt();
        System.out.print("2.Sayı :");
        b = scanner.nextInt();
        System.out.print("3.Sayı :");
        c = scanner.nextInt();

        // If - else
        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < b < c");
            }

        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}