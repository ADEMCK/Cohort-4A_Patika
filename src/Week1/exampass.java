package Week1;

import java.util.Scanner;

public class exampass {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        matematik = scanner.nextInt();
        if (matematik < 0 || matematik > 100) {
            System.out.println("Matematik puanı geçersiz. Lütfen 0 ile 100 arasında bir puan girin.");
            return;
        }

        System.out.print("Fizik Notu : ");
        fizik = scanner.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Fizik puanı geçersiz. Lütfen 0 ile 100 arasında bir puan girin.");
            return;
        }

        System.out.print("Türkçe Notu : ");
        turkce = scanner.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Türkçe puanı geçersiz. Lütfen 0 ile 100 arasında bir puan girin.");
            return;
        }

        System.out.print("Kimya Notu : ");
        kimya = scanner.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Kimya puanı geçersiz. Lütfen 0 ile 100 arasında bir puan girin.");
            return;
        }

        System.out.print("Müzik Notu : ");
        muzik = scanner.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Müzik puanı geçersiz. Lütfen 0 ile 100 arasında bir puan girin.");
            return;
        }

        // average and passing score :
        int average = (matematik + fizik + turkce + kimya + muzik) / 5;
        int passingScore = 55;
        // output:
        if (average >= passingScore) {
            System.out.println("Sınıfı geçtiniz, tebrikler !");
        } else {
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere !");
        }

        System.out.println("Ortalamanız : " + average);
    }
}
