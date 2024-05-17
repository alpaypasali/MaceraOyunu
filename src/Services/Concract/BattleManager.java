package Services.Concract;

import Enums.Monsters;
import Game.Armor;
import Game.Monster;
import Game.Player;
import Game.Weapon;
import Services.Absract.*;

import java.util.Random;

public class BattleManager implements IBattleService {

    IMonsterService monsterService;
    IPlayerService playerService;
    IArmorService armorService;
    IWeaponService weaponService;
    public  BattleManager(){
        monsterService = new MonsterManager();
        playerService = new PlayerManager();
        armorService = new ArmorManager();
        weaponService = new WeaponManager();
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
                        checkPrize(player ,monster);
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
                    checkPrize(player,monster);
                    return true; // Oyuncu kazandığında true döndürülür
                }
            }
            System.out.println("Monster Health: " + monster.getHealth());
            System.out.println("Player Health: " + player.getHealth());
        }
        return player.getHealth() > 0;
    }
    private void checkPrize(Player player , Monster monster) {
        if(monster.getMonster() == Monsters.Snake) {
            Random rand = new Random();
            int id=0;
            double randomValue = rand.nextDouble(1); // generates a random value between 0.0 (inclusive) and 1.0 (exclusive)
            if (randomValue < 0.15) {
                System.out.println("You won a Gun!");
                double randomGun = rand.nextDouble(1);


                if(randomGun < 0.20){
                    System.out.println("You won a Rifle!");
                   id = 3;
                } else if (randomGun > 0.20 && randomGun < 0.50) {
                    System.out.println("You won a Sword!");
                    id =2;
                }
                else{
                    System.out.println("You won a Pistol!");
                    id=1;
                }
              Weapon  weapon = weaponService.GetWeapon(id);
                player.getInventory().setWeapon(weapon.getId());
                if(player.getInventory().getWeapon() < weapon.getId())
                    player.setDamage(player.getDamage() + weapon.getDamage());
                    
            } else if (randomValue > 0.15 && randomValue < 0.30) {
                System.out.println("You won Armor!");
                double randoma = rand.nextDouble(1);
                if(randoma < 0.20){
                    System.out.println("You won Heavy Armor!");
                    id =3;
                } else if (randoma > 0.20 && randoma < 0.50) {
                    System.out.println("You won Medium Armor!");
                    id=2;
                }
                else{
                    System.out.println("You won Light Armor!");
                    id=1;
                }
                Armor armor = armorService.GetArmor(id);
                if(player.getInventory().getArmor() < armor.getId())
                 player.getInventory().setArmor(armor.getId());

            } else if (randomValue > 0.30 && randomValue < 0.55 ) {
                System.out.println("You won Money!");
                double randoma = rand.nextDouble(1);
                if(randoma < 0.20){
                    System.out.println("You won 10 Money!");
                    player.setMoney(player.getMoney() + 10);
                } else if (randoma > 0.20 && randoma < 0.50) {
                    System.out.println("You won 5 Money!");
                    player.setMoney(player.getMoney() + 5);
                }
                else{
                    System.out.println("You won 1 Money!");
                    player.setMoney(player.getMoney() + 1);
                }

            } else {
                System.out.println("You didn't win anything.");
            }
        }
        else {
            player.setMoney(player.getMoney() + monster.getPrice());
        }
    }

}
