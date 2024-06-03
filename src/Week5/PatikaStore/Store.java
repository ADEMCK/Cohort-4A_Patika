package Week5.PatikaStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Mağaza sınıfı, ürünlerin envanterini ve işlemlerini yönetir
public class Store {
    Scanner input = new Scanner(System.in);
    ArrayList<Product> notebooks;
    ArrayList<Product> phones;
    Brand[] brands;

    public static int notebookCounter = 0;
    public static int phoneCounter = 0;

    // Mağaza envanterini oluşturur
    public void stockInventory () {
        String[] brandNames = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        Arrays.sort(brandNames);

        brands = new Brand[brandNames.length];

        for (int i = 0; i < brandNames.length; i++) {
            brands[i] = new Brand(i + 1, brandNames[i]); // ID'leri 1'den başlayarak atama
        }

        notebooks = new ArrayList<>();
        notebooks.add(new Notebook(++notebookCounter, 7000.0, 10.0, 50, "HUAWEI Matebook 14", brands[0], 512, 14, 16));
        notebooks.add(new Notebook(++notebookCounter, 3699.0, 15.0, 30, "LENOVO V14 IGL", brands[5], 1024, 14, 8));
        notebooks.add(new Notebook(++notebookCounter, 8199.0, 5.0, 40, "ASUS Tuf Gaming", brands[3],2048, (int) 15.6, 32));

        phones = new ArrayList<>();
        phones.add(new MobilePhone(++phoneCounter, 3199.0, 20.0, 100, "SAMSUNG GALAXY A51", brands[0], 128, (int) 6.5, 6, 4000, "Siyah"));
        phones.add(new MobilePhone(++phoneCounter, 7379.0, 25.0, 80, "iPhone 11 64 GB", brands[7], 64, (int) 6.1, 8, 3046, "Mavi"));
        phones.add(new MobilePhone(++phoneCounter, 4012.0, 10.0, 60, "Redmi Note 10 Pro 8GB", brands[8], 128, (int) 6.5, 8, 4000, "Beyaz"));

        printNotebooks();
        printPhones();
    }

    // Mağaza işlemlerini başlatır
    public void run () {
        while (true) {
            printMenu();
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    notebookOperations();
                    break;
                case 2:
                    phoneOperations();
                    break;
                case 3:
                    printBrands();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Yanlış seçim. Tekrar giriniz!");
            }
        }
    }

    // Dizüstü bilgisayar işlemleri menüsünü gösterir
    public void notebookOperations () {
        while (true) {
            printSubMenu();
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addNotebook();
                    break;
                case 2:
                    deleteNotebook();
                    break;
                case 3:
                    printNotebooks();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Yanlış seçim. Tekrar giriniz!");
            }
        }
    }

    // Cep telefonu işlemleri menüsünü gösterir
    public void phoneOperations () {
        while (true) {
            printSubMenu();
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addPhone();
                    break;
                case 2:
                    deletePhone();
                    break;
                case 3:
                    printPhones();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Yanlış seçim. Tekrar giriniz!");
            }
        }
    }

    // Dizüstü bilgisayar ekler
    public void addNotebook () {
        for (Brand brand : brands) {
            System.out.println(brand.getId() + " - " + brand.getName());
        }
        System.out.print("Marka ID'sini girin: ");
        int brandId = input.nextInt();
        input.nextLine(); // yeni satırı tüket
        System.out.print("Dizüstü bilgisayar adını girin: ");
        String name = input.nextLine();
        System.out.print("Dizüstü bilgisayar fiyatını (USD) girin: ");
        double price = input.nextDouble();
        System.out.print("İndirim oranını girin: ");
        double discountRate = input.nextDouble();
        System.out.print("Stok miktarını girin: ");
        int stockAmount = input.nextInt();
        System.out.print("Depolama kapasitesini (GB) girin: ");
        int storage = input.nextInt();
        System.out.print("Ekran boyutunu (inç) girin: ");
        int screenSize = input.nextInt();
        System.out.print("RAM kapasitesini (GB) girin: ");
        int ram = input.nextInt();

        Product newProduct = new Notebook(++notebookCounter, price, discountRate, stockAmount, name, brands[brandId - 1], storage, screenSize, ram);
        notebooks.add(newProduct);
        System.out.println(newProduct + " başarıyla eklendi.");
    }

    // Cep telefonu ekler
    public void addPhone () {
        for (Brand brand : brands) {
            System.out.println(brand.getId() + " - " + brand.getName());
        }
        System.out.print("Marka ID'sini girin: ");
        int brandId = input.nextInt();
        input.nextLine(); // yeni satırı tüket
        System.out.print("Telefon adını girin: ");
        String name = input.nextLine();
        System.out.print("Telefon fiyatını (USD) girin: ");
        double price = input.nextDouble();
        System.out.print("İndirim oranını girin: ");
        double discountRate = input.nextDouble();
        System.out.print("Stok miktarını girin: ");
        int stockAmount = input.nextInt();
        System.out.print("Depolama kapasitesini (GB) girin: ");
        int storage = input.nextInt();
        System.out.print("Ekran boyutunu (inç) girin: ");
        int screenSize = input.nextInt();
        System.out.print("RAM kapasitesini (GB) girin: ");
        int ram = input.nextInt();
        System.out.print("Pil kapasitesini (mAh) girin: ");
        int batteryCapacity = input.nextInt();
        input.nextLine(); // yeni satırı tüket
        System.out.print("Telefon rengini girin: ");
        String color = input.nextLine();

        Product newProduct = new MobilePhone(++phoneCounter, price, discountRate, stockAmount, name, brands[brandId - 1], storage, screenSize, ram, batteryCapacity, color);
        phones.add(newProduct);
        System.out.println(newProduct + " başarıyla eklendi.");
    }

    // Cep telefonu siler
    public void deletePhone () {
        printPhones();
        System.out.println("Silmek istediğiniz telefonun ID'sini girin:");
        int removeId = input.nextInt();
        Product toRemove = null;

        for (Product phone : phones) {
            if (phone.getId() == removeId) {
                toRemove = phone;
            }
        }
        phones.remove(toRemove);
        System.out.println(toRemove + " başarıyla kaldırıldı!");
    }

    // Dizüstü bilgisayar siler
    public void deleteNotebook () {
        printNotebooks();
        System.out.println("Silmek istediğiniz dizüstü bilgisayarın ID'sini girin:");
        int removeId = input.nextInt();
        Product toRemove = null;

        for (Product notebook : notebooks) {
            if (notebook.getId() == removeId) {
                toRemove = notebook;
            }
        }
        notebooks.remove(toRemove);
        System.out.println(toRemove + " başarıyla kaldırıldı!");
    }

    // Dizüstü bilgisayarları listeler
    public void printNotebooks () {
        System.out.println("\nDizüstü Bilgisayarlar");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %-8s | %-18s | %-10s | %-6s | %-3s | %-7s | %-10s | %-5s |\n", "ID", "Marka", "Ad", "Fiyat", "İndirim", "Stok", "Depolama", "Ekran Boyutu", "RAM");
        System.out.println("------------------------------------------------------------------------------------------------------");
        notebooks.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    // Cep telefonlarını listeler
    public void printPhones () {
        System.out.println("\nCep Telefonları");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %2s | %-8s | %-18s | %-10s | %-6s | %-3s | %-7s | %-10s | %-5s | %-9s | %-12s |\n", "ID", "Marka", "Ad", "Fiyat", "İndirim", "Stok", "Depolama", "Ekran Boyutu", "RAM", "Pil", "Renk");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        phones.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }

    // Markaları listeler
    public void printBrands () {
        for (Brand brand : brands) {
            System.out.println(brand);
        }
    }

    // Ana menüyü yazdırır
    public void printMenu () {
        System.out.println("""
				\nPatika Mağaza Stok Sistemi
				1. Dizüstü Bilgisayarlar
				2. Cep Telefonları
				3. Tüm Markaları Listele
				4. Çıkış
				""");
    }

    // Alt menüyü yazdırır
    public void printSubMenu () {
        System.out.println("""
				\n1. Ekle
				2. Sil
				3. Tümünü Listele
				4. Çıkış
				""");
    }
}