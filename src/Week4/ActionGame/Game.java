package Week4.ActionGame;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scanner = new Scanner(System.in);

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Macera Oyununa Hoşgeldiniz ! ");
        System.out.println("Oyuna başlamadan önce isminizi giriniz : ");
        // String playerName = scanner.nextLine();
        player = new Player("");
        player.selectCha();
        start();
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("=============================================");
            System.out.println();
            System.out.println("Eylem gerçekleştirmek için bir yer seçiniz : ");
            System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan, düşman yok ! ");
            System.out.println("2. Mağara --> Karşınıza belki zombi çıkabilir ! ");
            System.out.println("3. Orman --> Karşınıza belki vampir çıkabilir ! ");
            System.out.println("4. Nehir --> Karşınıza belki ayı çıkabilir ! ");
            System.out.println("5. Mağaza --> Silah veya zırh alabilirsiniz ! ");
            System.out.print("Gitmek istediğiniz yer :");
            int selLoc = scanner.nextInt();
            while (selLoc < 0 || selLoc > 5) {
                System.out.println("Lütfen geçerli bir yer giriniz : ");
                selLoc = scanner.nextInt();
            }
            switch (selLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Cave(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new River(player);
                    break;
                case 5:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (location.getName() == "Güvenli Ev") {
                if (player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
                    System.out.println("Tebrikler Oyunu Kazandınız !");
                    break;
                }
            }

            if (!location.getLocation()) {
                System.out.println("Oyun Bitti !");
                break;
            }
        }
    }
}


