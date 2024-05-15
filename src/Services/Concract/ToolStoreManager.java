package Services.Concract;

import Game.Player;
import Services.Absract.IArmorService;
import Services.Absract.IToolStoreService;
import Services.Absract.IWeaponService;

public class ToolStoreManager implements IToolStoreService {


    private IWeaponService _weaponService;
    private IArmorService _armorService;

    public ToolStoreManager( ) {

    }
    public void initializeServices(IWeaponService weaponService, IArmorService armorService) {
        this._weaponService = weaponService;
        this._armorService = armorService;
    }

    @Override
    public boolean onLocation( ) {
      System.out.println("Welcome to the store!");

      return true;
    }

    @Override
    public void storeMenu() {
            _armorService.PrintArmors();
            _weaponService.PrintWeapons();
    }
}
