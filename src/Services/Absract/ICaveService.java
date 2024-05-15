package Services.Absract;

import Game.Monster;
import Game.Player;

public interface ICaveService {

    boolean onLocation(Player player , Monster monster);
}
