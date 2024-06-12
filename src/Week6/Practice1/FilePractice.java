package Week6.Practice1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) {
        // Dosya yolu (path)
        String path = "./src/Week6/Practice1/patika.txt";

        // Sayıların toplamını tutmak için değişken
        int totalSum = 0;

        try ( // Try-with-resources yapısı kullanarak kaynakları otomatik kapatmayı sağlayın
              FileReader fileReader = new FileReader(path);
              BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;

            // Dosya satır satır okunurken döngü
            while ((line = bufferedReader.readLine()) != null) {
                // Satırdaki sayıyı oku ve toplama ekle
                int currentNumber = Integer.parseInt(line);
                totalSum += currentNumber;
            }
        } catch (FileNotFoundException e) {
            // Dosya bulunamadığında hata mesajı yazdır
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        } catch (IOException e) {
            // Dosya okuma işlemi sırasında başka bir hata oluşursa hata mesajı yazdır
            System.err.println("Genel okuma hatası: " + e.getMessage());
        }

        // Toplam sayıyı yazdır
        System.out.println("Sayıların toplamı: " + totalSum);
    }
}