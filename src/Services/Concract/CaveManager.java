package Services.Concract;

import Game.Monster;
import Game.Player;
import Services.Absract.IBattleService;
import Services.Absract.ICaveService;
import Services.Absract.IMonsterService;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CaveManager implements ICaveService {
    private IMonsterService monsterService ;
    private IBattleService battleService;
    Scanner scanner = new Scanner(System.in);

    public CaveManager(){
        monsterService = new MonsterManager();
        battleService = new BattleManager();
    }

    @Override
    public boolean onLocation(Player player, Monster monster) {
        List<Monster> monsters = monsterService.GetCount(monster);
        System.out.println("Be careful! There are " + monsters.size() + " " + monster.getMonster() + " living here!");

        while (!monsters.isEmpty()) {
            System.out.print("<F>ight or <R>un: ");
            String selCase = scanner.nextLine().toUpperCase();

            switch (selCase) {
                case "F":
                    if (battleService.battle(player, monsters.get(0))) {
                        monsters.remove(0);
                    } else {
                        System.out.println("You Died, Game Over!");
                        return false;
                    }
                    break;
                case "R":
                    System.out.println("YOU RAN AWAY");

                    return false;
                default:
                    break;
            }
        }

        System.out.println("All monsters defeated");
        player.getInventory().setFood(true);
        return true;
    }




}
