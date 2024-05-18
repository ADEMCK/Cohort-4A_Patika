package Week1.TeknikIcerikIki;

import java.util.Scanner;

public class chinaZodiac {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scanner = new Scanner(System.in);
        int birthYear, birthYearMod;
        String zodiac = "";

        // Dogum Tarihi Alma
        System.out.print("Lutfen doğum yılınızı giriniz:");
        birthYear = scanner.nextInt();

        // Dogum Tarihinin Modu
        birthYearMod = (birthYear % 12);

        // 12 Durum
        switch (birthYearMod) {
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
        }
        System.out.println("Çin zodyaği burcunuz : " + zodiac);
    }
}
