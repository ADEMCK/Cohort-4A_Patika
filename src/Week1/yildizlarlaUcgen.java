package Week1;

import java.util.Scanner;

public class yildizlarlaUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int n = scanner.nextInt();

        // Yıldızlarla artan üçgen
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < (n - i - 1); x++) {
                // Yıldızların yan yana yazılması gerekir.
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Yıldızlarla azalan üçgen (ters üçgen)
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

