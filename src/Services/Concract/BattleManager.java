package Services.Concract;

import Game.Monster;
import Game.Player;
import Services.Absract.IBattleService;
import Services.Absract.IMonsterService;
import Services.Absract.IPlayerService;

import java.util.Random;

public class BattleManager implements IBattleService {

    IMonsterService monsterService;
    IPlayerService playerService;
    public  BattleManager(){
        monsterService = new MonsterManager();
        playerService = new PlayerManager();

    }
    private boolean decideStarter() {
        Random random = new Random();
        return random.nextBoolean(); // Returns true or false randomly
    }
    @Override
    public boolean battle(Player player, Monster monster) {
        boolean playerStarts = decideStarter();

        if (playerStarts) {
            System.out.println("Player attacks first!");
        } else {
            System.out.println("Monster attacks first!");
        }

        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            if (playerStarts) {
                if (!playerService.Atack(monster, player)) {
                    System.out.println("Monster Died");
                    return true; // Oyuncu kazandığında true döndürülür
                }
                if (!monsterService.MonsterAtack(monster, player)) {
                    System.out.println("Player Died");
                    return false; // Oyuncu öldüğünde false döndürülür
                }
            } else {
                if (!monsterService.MonsterAtack(monster, player)) {
                    System.out.println("Player Died");
                    return false; // Oyuncu öldüğünde false döndürülür
                }
                if (!playerService.Atack(monster, player)) {
                    System.out.println("Monster Died");
                    return true; // Oyuncu kazandığında true döndürülür
                }
            }


            System.out.println("Monster Health: " + monster.getHealth());
            System.out.println("Player Health: " + player.getHealth());
        }


        return player.getHealth() > 0;
    }
}
