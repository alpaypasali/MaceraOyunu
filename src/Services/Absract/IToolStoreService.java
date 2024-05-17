package Services.Absract;

import Game.Armor;
import Game.Player;

public interface IToolStoreService {

    void onLocation();
    boolean BuyArmor(int id ,Player player);
    boolean BuyWeapon(int id , Player player);


}
