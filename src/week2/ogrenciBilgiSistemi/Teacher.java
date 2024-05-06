package week2.ogrenciBilgiSistemi;

public class Teacher {
    // Değişkenler
    String name;
    String mpno;
    String branch;

    // Constructor metod:
    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }
    // Print Class
    void printInfo() {
        System.out.println("-----------------------");
        System.out.println("Akademisyenin Adı : " + this.name);
        System.out.println("Akademisyenin Telefonu : " + this.mpno);
        System.out.println("Akademisyenin Branşı : " + this.branch);
    }
}