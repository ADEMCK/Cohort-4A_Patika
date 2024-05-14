package Week2;

public class harmonicArrays {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15, 25, 35, -45, 55, -65};

        // Dizinin eleman sayısını bulmak için dizinin lengthine eşitledik.
        int arrayLength = numbers.length;
        System.out.println("Eleman sayısı: " + arrayLength);

        // Dizideki elemanları (1/a+1/b) şeklinde yazarak toplamını bulduk.
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }
        System.out.println("Harmonik seri formülüne göre toplamı: " + sum);

        // Eleman sayısına toplamı bölerek harmonik ortalamayı bulduk.
        double harmonicAvarage = arrayLength / sum;
        System.out.println("Harmonik Ortalama: " + harmonicAvarage);
    }
}