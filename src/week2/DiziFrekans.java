package week2;

import java.util.Arrays;

public class DiziFrekans {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] repeats = new int[list.length];

        System.out.println(Arrays.toString(list));

        // Her elemanın tekrar sayısını sıfırdan başlat
        for (int i = 0; i < list.length; i++) {
            int repeatN = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    repeatN++; // Tekrar sayısını artır
                }
            }
            repeats[i] = repeatN; // Tekrar sayısını diziye kaydet.
        }
        //  Tekrar edenleri bulunur ve ekrana bastırılmaz.
        for (int i = 0; i < list.length; i++) {
            boolean isCounted = false;
            for (int j = 0; j < i; j++) { // j den i ye kadar kontrolun sebebi tekrarı kontrol etmek.
                if (list[i] == list[j]) {
                    isCounted = true;
                    break;
                }
            }
            // Tekrar eden kayıtlar hariç ekrana bastıralım.
            if (!isCounted) {
                System.out.println(list[i] + " sayısı  " + repeats[i] + " kere tekrar edildi. ");
            }
        }
    }
}