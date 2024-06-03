package Week5.PatikaStore;

// Cep telefonu sınıfı, ürün sınıfından türetilmiştir
public class MobilePhone extends Product {
    private int batteryCapacityInMah; // Batarya kapasitesi (mAh)
    private String color; // Cihaz rengi

    public MobilePhone(int id, double price, double discountRate, int stock, String name, Brand brand, int storage, int screenSize, int ram, int batteryCapacityInMah, String color) {
        super(id, price, discountRate, stock, name, brand, storage, screenSize, ram);
        this.batteryCapacityInMah = batteryCapacityInMah;
        this.color = color;
    }

    public MobilePhone() {
    }

    public int getBatteryCapacityInMah() {
        return batteryCapacityInMah;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-5d mAh | %-12s |", batteryCapacityInMah, color);
    }
}
