package Services.Absract;

import Game.Monster;
import Game.Player;

public interface IMineService {
    boolean onLocation(Player player, Monster monster);
}
