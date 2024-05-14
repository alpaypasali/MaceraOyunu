package Services.Concract;

import Enums.Monsters;
import Game.Monster;
import Services.Absract.IMonsterService;

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
    public void CreateMonster() {
        mosnterList.add(new Monster(1 ,10 , Monsters.Zombie , 4 ,3));
        mosnterList.add(new Monster(2 ,14 , Monsters.Vampire , 7 ,4));
        mosnterList.add(new Monster(3 ,20 , Monsters.Bear , 12 ,7));
        mosnterList.add(new Monster(4 ,10 , Monsters.Snake  ,random.nextInt(3,6)));
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
}
