package week2;

public class palindromSayi {
    // Boolean değere sayının palindrom olup olmadığı atandı.
    static boolean isPalindrom(int number) {

        // Değişkenler tanımlandı.
        int temp = number, reverseNumber = 0, lastNumber;

        // While döngüsünde sayıyı basamaklarına ayırıp yeni sayıyı oluşturuldu.
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        System.out.println("Sayı : " + number);
        System.out.println("Sayının ters hali: " + reverseNumber);

        // Eğer sayı yeni sayıyla aynıysa palindrom sayıdır.
        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(9889));
        System.out.println(isPalindrom(9888));
    }
}