package Week5.TeknikIcerikIki;

import java.util.*;

// Book sınıfı, Comparable arayüzünden kalıtım alır ve kitapları isme göre sıralar
class Book implements Comparable<Book> {
    private String kitapAdi;
    private int sayfaSayisi;
    private String yazarAdi;
    private String yayinTarihi;

    // Constructor - Kitap nesnesi oluşturulurken kullanılacak
    public Book(String kitapAdi, int sayfaSayisi, String yazarAdi, String yayinTarihi) {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.yazarAdi = yazarAdi;
        this.yayinTarihi = yayinTarihi;
    }

    // Kitapları isme göre sıralamak için compareTo metodu kullanılır
    @Override
    public int compareTo(Book digerKitap) {
        return this.kitapAdi.compareTo(digerKitap.kitapAdi);
    }

    // Getter metotları
    public String getKitapAdi() {
        return kitapAdi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public String getYayinTarihi() {
        return yayinTarihi;
    }

    // Kitap bilgilerini güzel bir şekilde yazdırmak için toString metodu kullanılır
    public String toString() {
        return "Kitap: " + kitapAdi + ", Yazar: " + yazarAdi + ", Sayfalar: " + sayfaSayisi + ", Yayın Tarihi: " + yayinTarihi;
    }
}

public class Main {
    public static void main(String[] args) {
        // Book sınıfından nesneler oluşturulur
        Book kitap1 = new Book("Java Programlama", 400, "John Doe", "2020-01-01");
        Book kitap2 = new Book("Python Temelleri", 300, "Jane Smith", "2019-12-15");
        Book kitap3 = new Book("C++ Temel Bilgiler", 350, "Mike Johnson", "2021-03-10");
        Book kitap4 = new Book("JavaScript Uzmanlığı", 250, "Emily Brown", "2022-02-20");
        Book kitap5 = new Book("HTML & CSS", 200, "David Miller", "2020-08-05");

        // Kitapları isme göre sıralamak için TreeSet kullanılır
        Set<Book> kitapSetiIsmeGore = new TreeSet<>(Arrays.asList(kitap1, kitap2, kitap3, kitap4, kitap5));
        System.out.println("Kitaplar isme göre sıralandı:");
        for (Book kitap : kitapSetiIsmeGore) {
            System.out.println(kitap);
        }

        // Sayfa sayısına göre sıralamak için Comparator kullanılır
        Comparator<Book> sayfaSayisiKarsilastirici = Comparator.comparing(Book::getSayfaSayisi);
        // Kitapları sayfa sayısına göre sıralamak için TreeSet ve özel bir Comparator kullanılır
        Set<Book> kitapSetiSayfaSayisinaGore = new TreeSet<>(sayfaSayisiKarsilastirici);
        kitapSetiSayfaSayisinaGore.addAll(Arrays.asList(kitap1, kitap2, kitap3, kitap4, kitap5));
        System.out.println("\nKitaplar sayfa sayısına göre sıralandı:");
        for (Book kitap : kitapSetiSayfaSayisinaGore) {
            System.out.println(kitap);
        }
    }
}
