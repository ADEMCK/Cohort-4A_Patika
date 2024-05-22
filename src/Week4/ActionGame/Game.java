package Week4.ActionGame;

import javax.xml.stream.Location;
import java.util.Scanner;

public class Game {
    Player player;
   Location location;


    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Macera Oyununa Hoşgeldiniz ! ");
        System.out.println("Oyuna başlamadan önce isminizi giriniz : a");
        //String playerName = scanner.nextLine();
        player = new Player("a");
        player.selectCha();
    }
}
