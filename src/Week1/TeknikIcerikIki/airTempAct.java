package Week1.TeknikIcerikIki;

import java.util.Scanner;

public class airTempAct {
    public static void main(String[] args) {
        // Değişken
        int heat;
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = scanner.nextInt();
        // if-else
        if (heat < 5) {
            System.out.println("Kayak yapabilirsin");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
            if (heat >= 15) {
                System.out.println("Ayrıca pikniğe de gidebilirsiniz.");
            }
        } else if (heat == 25) {
            System.out.println("Pikniğe gidebilirsiniz. Ayrıca yüzmeye de gidebilirsiniz.");
        } else if (heat > 15 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz. ");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}