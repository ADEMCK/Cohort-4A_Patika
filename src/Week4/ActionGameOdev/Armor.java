package Week4.ActionGameOdev;

public class Armor {
    private String name;
    private int id;
    private int block;
    private int price;

    public Armor(String name, int id, int block, int price) {
        this.name = name;
        this.id = id;
        this.block = block;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorsList = new Armor[3];
        armorsList[0] = new Armor("Hafif", 1, 1, 15);
        armorsList[1] = new Armor("Orta", 2, 3, 25);
        armorsList[2] = new Armor("Ağır", 3, 5, 40);
        return armorsList;
    }


    public static Armor getArmorObjById(int id) {
        for (Armor a : Armor.armors()) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}