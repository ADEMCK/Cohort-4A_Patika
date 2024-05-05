package week2.maasHesaplama;

public class Employee {
    // Bu sınıflar, bir çalışanın adını, maaşını, günlük çalışma saatlerini, işe alındığı yılı ve mevcut yılı depolamak için kullanılır.
    String name;
    double salary;
    int workHours;
    int hireYear;
    int currentYear = 2021;

    // Yapıcı method :
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi metodu
    public double tax() {
        if (this.salary > 1000.0) {
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    // bonus() metodu
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    // raiseSalary() :
    public double raiseSalary() {
        int yearsWorked = currentYear - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked > 9 && yearsWorked < 20) {
            return salary * 0.10;
        } else if (yearsWorked > 19) {
            return salary * 0.15;
        }
        return 0;
    }

    // Toplam maaş metodu
    public double totalSalary() {
        return (this.salary + bonus() + raiseSalary() - tax());
    }

    // Vergi ve ikramiyeli maaş hesabı
    public double taxAndBonusSalary() {
        return (this.salary + bonus() - tax());
    }

    @Override
    public String toString() {
        return "Employee {" +
                "Adı : '" + name + '\'' + "\n" +
                ", Maaşı : " + salary + "\n" +
                ", Çalışma Saati : " + workHours + "\n" +
                ", Başlangıç yılı : " + hireYear + "\n" +
                ", Vergi : " + tax() + "\n" +
                ", Bonus : " + bonus() + "\n" +
                ", Maaş Artışı : " + raiseSalary() + "\n" +
                ", Vergi ve Bonuslar : " + taxAndBonusSalary() + "\n" +
                ", Toplam Maaş : " + totalSalary() + " TL";
    }
}