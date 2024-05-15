package Services.Absract;

import Game.Monster;
import Game.Player;

public interface IRiverService{
    boolean onLocation(Player player , Monster monster);
}
