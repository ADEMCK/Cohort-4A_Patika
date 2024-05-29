package Week4.ActionGame;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player,"Güvenli Ev");
    }
    public boolean getLocation(){
        player.setHealty(player.getrHealty());
        System.out.println("İyileştiniz...");
        System.out.println("Şu an Güvenli Evdesiniz.");
        return true;
    }
}
