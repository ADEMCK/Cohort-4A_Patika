package Week1;

import java.util.Scanner;

public class ikininKuvvetiDortBes {
    public static void main(String[] args) {
        //Scanner sınıfını ve değişkenleri
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        number = scanner.nextInt();

        // For kullanarak 4 ve 5'in kuvvetlerini gösteriyoruz
        for (int a = 1; a <= number; a *= 4) {
            System.out.println(a + " 4'ün kuvvetidir.");
        }
        for (int a = 1; a <= number; a *= 5) {
            System.out.println(a + " 5'ün kuvvetidir.");
        }
    }
}
