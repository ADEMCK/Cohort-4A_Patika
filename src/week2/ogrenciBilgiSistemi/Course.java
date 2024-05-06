package week2.ogrenciBilgiSistemi;

public class Course {
    // Değişkenler
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;
    double verbalNote;
    double verbalPercent;

    // Constructor metod
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }
    // İşlemin başarılı mi yoksa akademisyenin bu dersi verebileceği bilgisi
    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(teacher.name + " Akademisyen bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}