package Week2.TeknikIcerikUc.ogrenciBilgiSistemi;


public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        // Öğretmen bilgileri
        Teacher teacher1 = new Teacher("Bayram", "05359876543", "MAT");
        teacher1.printInfo();
        Teacher teacher2 = new Teacher("Sabri", "05358765432", "FZK");
        teacher2.printInfo();
        Teacher teacher3 = new Teacher("Sedef", "05357654321", "KMYA");
        teacher3.printInfo();

        // Ders bilgileri
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMYA101", "KMYA");

        // Öğrenci bilgileri
        Student student1 = new Student("Adem Onur", "444", 4, mat, fizik, kimya);
        student1.addBulkExamNote(90, 60, 80);
        student1.addVerbalNote(60, 55, 45);
        student1.isPass();

        Student student2 = new Student("Burak", "445", 3, mat, fizik, kimya);
        student2.addBulkExamNote(10, 60, 45);
        student2.addVerbalNote(15, 54, 45);
        student2.isPass();

        Student student3 = new Student("Gökhan", "446", 4, mat, fizik, kimya);
        student3.addBulkExamNote(55, 60, 75);
        student3.isPass();
    }
}