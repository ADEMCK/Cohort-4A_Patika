package week2;

import java.util.Arrays;

public class minMaxValuofArray {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};
        int newElement = 5;
        // 1 eleman daha arttırıp listeyi kopyala.
        int[] newList = Arrays.copyOf(list, list.length + 1);

        // Son eleman olarak 5'i ekle
        newList[newList.length - 1] = newElement;
        System.out.println("Yeni dizi: " + Arrays.toString(newList));

        // Yeni listeyi kücükten buyuge sirala
        Arrays.sort(newList);
        System.out.print("Yeni dizinin sirali hali : ");
        System.out.println(Arrays.toString(newList));

        // 5'in solu ve sagini bulmak icin indexini bul.
        int index = Arrays.binarySearch(newList, newElement);
        System.out.println("Hedef elemanın indeksi: " + index);

        System.out.println("5'e en yakin kücük sayi : \n" + newList[4] + "\n5'e en yakin buyuk sayi : \n" + newList[6]);
    }
}