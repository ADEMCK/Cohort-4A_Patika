package Week5.PatikaStore;

// Ana sınıf, programın çalıştırılacağı sınıf
public class Main {
    public static void main (String[] args) {
        Store store = new Store();
        store.stockInventory(); // Mağaza envanterini oluşturur
        store.run(); // Mağaza işlemlerini başlatır
    }
}
