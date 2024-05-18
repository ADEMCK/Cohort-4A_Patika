package Week1.TeknikIcerikBir;

import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin 1. Kenar Uzunluğunu Giriniz : ");
        double a = scanner.nextDouble();

        System.out.print("Üçgenin 2. Kenar Uzunluğunu Giriniz : ");
        double b = scanner.nextDouble();

        System.out.print("Üçgenin 3. Kenar Uzunluğunu Giriniz : ");
        double c = scanner.nextDouble();

        double u = (a + b + c) / 2;

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı : " + alan);
    }
}