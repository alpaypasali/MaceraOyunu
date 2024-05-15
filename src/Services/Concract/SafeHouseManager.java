package Services.Concract;


import Game.Player;
import Services.Absract.ISafeHouseService;



public class SafeHouseManager implements ISafeHouseService {



    // Yapıcı metod
    public SafeHouseManager() {
;
    }

    @Override
    public boolean onLacation(Player player) {
        System.out.println("You are in a safe house");
        System.out.println("Health replenished");
        player.setHealth(player.getSelectedChar().getHealth());

        return true;
    }
}
