package Week4.ActionGame;

import java.util.Scanner;

public class Player {
    private int damage, healty, money, rHealty;
    private String name, cName;
    private Inventory inv;
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inv = new Inventory();
    }

    public void selectCha() {
        switch (chaMenu()) {
            // Samuray Seçildi
            case 1:
                initPlayer("Samuray", 5, 21, 15);
                break;
            case 2:
                initPlayer("Okçu", 7, 18, 20);
                break;
            case 3:
                initPlayer("Şövalye", 8, 24, 5);
                break;
            default:
                initPlayer("Samuray", 5, 21, 15);
                break;
        }
        System.out.println("Karakter Oluşturuldu ! Adı = " + getcName() + " \t Hasar :" + getDamage() + " \t Sağlık :" + getHealty() + " \t Para :" + getMoney());
    }

    public int chaMenu() {
        System.out.println("Lütfen bir karakter seçiniz:");
        System.out.println("1- Samuray, \tHasar: 5, \tSağlık: 21, \tPara: 15");
        System.out.println("2- Okçu,    \tHasar: 7, \tSağlık: 18, \tPara: 20");
        System.out.println("3- Şövalye, \tHasar: 8, \tSağlık: 24, \tPara: 5");
        System.out.print("Karakter Seçiminiz : ");
        int chaID = scanner.nextInt();

        while (chaID < 1 || chaID > 3) {
            System.out.print("Lütfen geçerli bir karakter seçiniz. ");
            chaID = scanner.nextInt();
        }
        return chaID;
    }

    public int getTotalDamage() {
        return this.getDamage() + this.getInv().getDamage();
    }

    public void initPlayer(String cName, int dmg, int hlthy, int mny) {
        setcName(cName);
        setDamage(dmg);
        setHealty(hlthy);
        setMoney(mny);
        setrHealty(hlthy);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealty() {
        return rHealty;
    }

    public void setrHealty(int rHealty) {
        this.rHealty = rHealty;
    }
}

