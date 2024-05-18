package Week1.TeknikIcerikIki;

import java.util.Scanner;

public class kullanicigiris {
    public static void main(String[] args) {
        String userName, password;
        // Scanner class
        Scanner scanner = new Scanner(System.in);
        // Kullanıcı ID'si
        System.out.print("Kullanıcı Adınız : ");
        userName = scanner.nextLine();

        System.out.print("Şifreniz :");
        password = scanner.nextLine();

        // if-else kontrol :
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.print("Yanlış Şifre, Şifrenizi sıfırlamak ister misiniz ? ");
            String resetPassword = scanner.nextLine();
            if (resetPassword.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Şifre: ");
                String newPassword = scanner.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}

