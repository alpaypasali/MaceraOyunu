package Services.Absract;

import Game.Player;

public interface IPlayerService {

    void CreatePlayer(String name);
    void PrintPlayer();
    boolean BuyCharacter(int id);
    boolean SelectCharacter(int id);
    void OurCharacter();
}
