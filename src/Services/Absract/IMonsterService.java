package Services.Absract;


import Game.Monster;
import Game.Player;

import java.util.List;

public interface IMonsterService {
    Monster CreateMonster();
    List<Monster> GetListMonster();
    Monster GetMonster(int id);
    List<Monster> GetCount(Monster monster);
    boolean MonsterAtack(Monster monster ,Player player);

}
