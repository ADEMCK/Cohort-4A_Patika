package Week1.TeknikIcerikUc;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        // Variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin : ");
        int elemanSayisi = scanner.nextInt();

        // İlk iki eleman sabit olduğu için onları doğrudan yazdırıyoruz.
        int fib1 = 0;
        int fib2 = 1;
        System.out.print("Fibonacci Serisi: " + fib1 + " " + fib2);

        // Fibonacci serisini hesaplamak için döngü kullanıyoruz.
        for (int i = 2; i < elemanSayisi; i++) {
            int yeniFib = fib1 + fib2;
            System.out.print(" " + yeniFib);
            fib1 = fib2;
            fib2 = yeniFib;
        }
    }
}