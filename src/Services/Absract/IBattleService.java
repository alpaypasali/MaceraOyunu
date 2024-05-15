package Services.Absract;

import Game.Monster;
import Game.Player;

public interface IBattleService {
    boolean battle(Player player , Monster monster);
}
