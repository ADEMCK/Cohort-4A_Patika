package Week2.TeknikIcerikUc.boxGame;

public class Fighter {
    // Değişkenler
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    // Constructor metod
    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    // Hasar alıp verme ya da bloklkama durumu
    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + "  hasar verdi.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            System.out.println("-----------------");
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    // Rastgele Bloklama
    public boolean isDodge() {
        // random number
        double randomNumberb = Math.random() * 100;
        return randomNumberb <= dodge;
    }
}