package Services.Concract;

import Enums.Armors;
import Game.Armor;
import Services.Absract.IArmorService;

import java.util.ArrayList;
import java.util.List;

public class ArmorManager implements IArmorService {
    private List<Armor> armorList;

    public ArmorManager() {
        armorList = new ArrayList<>();
    }

    @Override
    public void CreateArmor() {

        armorList.add(new Armor(1,15, Armors.Light, 1));
        armorList.add(new Armor(2,25, Armors.Medium, 3));
        armorList.add(new Armor(3,40, Armors.Heavy, 5));

    }

    @Override
    public List<Armor> GetListArmor() {
        return armorList;
    }

    @Override
    public Armor GetArmor(int id) {
        for (Armor armor : armorList) {
            if (armor.getId() == id) {
                return armor;
            }
        }
        return null;
    }
}
