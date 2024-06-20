package Week6.Practice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; // Corrected import statement
import java.io.PrintWriter;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz :");
        String text = scanner.nextLine();

        String filePath = "./src/Week6/Practice2/note.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(text);
            printWriter.close();

            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            bufferedReader.close();

            System.out.println("Son kaydedilen metin: " + line);

        } catch (IOException e) { // Corrected exception type
            System.out.println("Dosya okuma hatası : " + e.getMessage());
        }
    }
}
