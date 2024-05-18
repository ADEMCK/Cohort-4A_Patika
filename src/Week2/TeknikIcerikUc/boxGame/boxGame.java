package Week2.TeknikIcerikUc.boxGame;

// Box Oyunu
public class boxGame {
    public static void main(String[] args) {

        // Dövüşçü Bilgileri
        Fighter f1 = new Fighter("Kendrick Lamar", 15, 100, 95, 40);
        Fighter f2 = new Fighter("Drake", 10, 95, 85, 40);

        Match match = new Match(f1, f2, 60, 95);
        match.whichFighter();
        match.run();
    }
}