package Services.Absract;

import Game.Armor;

import java.util.List;

public interface IArmorService {
    void CreateArmor();
    List<Armor> GetListArmor();
    Armor GetArmor(int id);
}
