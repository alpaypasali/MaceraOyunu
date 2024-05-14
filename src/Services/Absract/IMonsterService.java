package Services.Absract;


import Game.Monster;

import java.util.List;

public interface IMonsterService {
    void CreateMonster();
    List<Monster> GetListMonster();
    Monster GetMonster(int id);

}
