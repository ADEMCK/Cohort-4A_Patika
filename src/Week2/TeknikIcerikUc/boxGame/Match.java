package Week2.TeknikIcerikUc.boxGame;

public class Match {
    // Değişkenler
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    // Constructor metot :
    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    // Sağlık puanı kontrolü
    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("----NEW ROUND----");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                    break;
                }

                this.f1.health = this.f2.hit((this.f1));
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " kalan canı : " + this.f1.health);
                System.out.println(this.f2.name + " kalan canı: " + this.f2.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor !");
        }
    }
    // Kazananı belirleme
    public boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;

        }
        return false;
    }

    // Dövüşçüler için %50 rastgele şans ihtimali
    public void whichFighter() {
        if (Math.random() < 0.50) {
            System.out.println(this.f1.name + " ilk dövüşe başlıyor..");
        } else {
            System.out.println(this.f2.name + " ilk dövüşe başlıyor..");
            Fighter temp = this.f1;
            this.f1 = this.f2;
            this.f2 = temp;
            run();

        }
    }
}