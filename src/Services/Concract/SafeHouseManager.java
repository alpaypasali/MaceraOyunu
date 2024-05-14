package Services.Concract;


import Game.Player;
import Services.Absract.ISafeHouseService;



public class SafeHouseManager implements ISafeHouseService {

    private Player player;

    // Yapıcı metod
    public SafeHouseManager(Player player) {
        this.player = player;
    }

    @Override
    public boolean onLacation(Player player) {
        System.out.println("You are in a safe house");
        System.out.println("Health replenished");
        return false;
    }
}
