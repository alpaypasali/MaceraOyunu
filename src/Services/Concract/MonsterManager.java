package Services.Concract;

import Enums.Monsters;
import Game.Monster;
import Game.Player;
import Services.Absract.IMonsterService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MonsterManager implements IMonsterService {

    private List<Monster> mosnterList;

    private Random random;

    public MonsterManager() {
        this.mosnterList = new LinkedList<>();;

        this.random = new Random();
    }

    @Override
    public Monster CreateMonster() {
        mosnterList.add(new Monster(1 ,10 , Monsters.Zombie , 4,3 ,3));
        mosnterList.add(new Monster(2 ,14 , Monsters.Vampire , 7 ,4 ,3));
        mosnterList.add(new Monster(3 ,20 , Monsters.Bear , 12 ,7 ,3));
        mosnterList.add(new Monster(4 ,10 , Monsters.Snake  ,5));

        return  mosnterList.getFirst();
    }

    @Override
    public List<Monster> GetListMonster() {
        return mosnterList;
    }

    @Override
    public Monster GetMonster(int id) {
        for (Monster monster : mosnterList) {
            if (monster.getId() == id) {
                return monster;
            }
        }
        return null;
    }

    @Override
    public int GetDamage(Monster monster) {
       return random.nextInt(3 , 6);
    }

    @Override
    public List<Monster> GetCount(Monster monster) {
        List<Monster> monsters = new ArrayList<>();
        int count = random.nextInt(1,monster.getMaxNumber() + 1); // Belirli bir maksimum sayıya kadar rastgele bir sayı oluşturur

        // Belirtilen sayı kadar canavar oluşturulur
        for (int i = 0; i < count; i++) {
            Monster newMonster = new Monster(monster.getId(),  monster.getMonster(), monster.getDamage(), monster.getHealth());
            monsters.add(newMonster);
        }

        return monsters;
    }


    @Override
    public boolean MonsterAtack(Monster monster ,Player player) {

        int randomNumber = random.nextInt(100);


        if (randomNumber < player.getInventory().getArmor()) {
            System.out.println("The monster's attack missed!");
            return true;
        }



            int damage = monster.getDamage();
            player.setHealth(player.getHealth() - damage);

            if(player.getHealth() <= 0) {
                return false;
            }

            return  true;
    }


}
