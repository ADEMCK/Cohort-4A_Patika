package Week1;

import java.util.Scanner;
public class Aritmetik1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 2;
        int c = 3;
        int sonuc = (a + (b * c) - b);
        System.out.println(sonuc);
    }
}