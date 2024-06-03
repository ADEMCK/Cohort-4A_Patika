package Week5.PatikaStore;

// Ürün sınıfı, genel ürün özelliklerini tutar ve soyut bir sınıftır
public abstract class Product {
    private int id; // Ürün ID'si
    private double price; // Ürün fiyatı
    private double discountRate; // İndirim oranı
    private int stockAmount; // Stok adedi
    private String name; // Ürün ismi
    private Brand brand; // Marka bilgisi
    private int storage; // Depolama kapasitesi (GB)
    private int screenSize; // Ekran boyutu (inç)
    private int ram; // RAM kapasitesi (GB)

    public Product (int id, double price, double discountRate, int stockAmount, String name, Brand brand, int storage, int screenSize, int ram) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Product () {
    }

    public int getId () {
        return id;
    }

    public double getPrice () {
        return price;
    }

    public double getDiscountRate () {
        return discountRate;
    }

    public int getStockAmount () {
        return stockAmount;
    }

    public String getName () {
        return name;
    }

    public Brand getBrand () {
        return brand;
    }

    public int getStorage () {
        return storage;
    }

    public int getScreenSize () {
        return screenSize;
    }

    public int getRam () {
        return ram;
    }

    @Override
    public String toString() {
        return String.format("| %2d | %-8s | %-18s | %-6.1f TL | %-6.1f %% | %-5d | %-4d GB | %-4d inches | %-2d GB |",
                id, brand.getName(), name, price, discountRate, stockAmount, storage, screenSize, ram);
    }
}
