import Game.Game;
import Game.GameCharacter;
import Services.Absract.IGameCharacterManager;
import Services.Absract.IPlayerService;
import Services.Absract.IWeaponService;
import Services.Concract.GameCharacterManager;
import Services.Concract.PlayerManager;
import Services.Concract.WeaponManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // GameCharacterManager örneği oluştur
         Game game = new Game();
         game.Run();







    }
}
