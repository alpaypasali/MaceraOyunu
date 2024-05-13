package Services.Concract;

import Enums.Monsters;
import Game.Armor;
import Game.Monster;
import Services.Absract.IMonsterService;

import java.util.List;
import java.util.Random;

public class MonsterManager implements IMonsterService {

    private List<Monster> mosnterList;
    private Random random;

    public MonsterManager(List<Monster> mosnterList, Random random) {
        this.mosnterList = mosnterList;

        this.random = random;
    }

    @Override
    public void CreateMonster() {
        mosnterList.add(new Monster(1 ,10 , Monsters.Zombie , 4 ,3));
        mosnterList.add(new Monster(1 ,10 , Monsters.Vampire , 4 ,3));
        mosnterList.add(new Monster(1 ,10 , Monsters.Bear , 4 ,3));
        mosnterList.add(new Monster(1 ,10 , Monsters.Snake  ,random.nextInt(3,6)));
    }

    @Override
    public List<Monster> GetListMonster() {
        return List.of();
    }

    @Override
    public Monster GetMonster(int id) {
        return null;
    }
}
