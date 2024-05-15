package Services.Absract;

import Game.Monster;
import Game.Player;

public interface IPlayerService {

    Player CreatePlayer(String name);
    void  PrintPlayer(Player player);
    boolean BuyCharacter(int id , Player player);
    boolean SelectCharacter(int id , Player player);
    void OurCharacter();
    void PlayerInfo(Player player);
    boolean Atack(Monster monster,Player player);
}
