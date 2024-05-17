package Services.Concract;

import Game.Armor;
import Game.Player;
import Game.Weapon;
import Services.Absract.IArmorService;
import Services.Absract.IToolStoreService;
import Services.Absract.IWeaponService;

public class ToolStoreManager implements IToolStoreService {


    private IWeaponService _weaponService;
    private IArmorService _armorService;

    public ToolStoreManager( ) {
        _armorService = new ArmorManager();
        _weaponService = new WeaponManager();
    }


    @Override
    public void onLocation( ) {
        System.out.println("");
        System.out.println("#######     Store       #######");
        System.out.println("1. Armors --> Your own safe place, no enemies!");
        System.out.println("2. Weapons --> You might encounter a zombie!");
        System.out.println("3. Exit --> You might encounter a zombie!");


    }
    public boolean BuyArmor(int id ,Player player){
        Armor armor = _armorService.GetArmor(id);
        if(!CheckMoney(armor.getPrice() , player.getMoney())){

            player.getInventory().setArmor(armor.getId());
            player.setMoney(player.getMoney() - armor.getPrice());
            return  true;
        }
        System.out.println("You do not have enough money!");
        return  false;
    }
    public boolean BuyWeapon(int id , Player player){

        Weapon weapon = _weaponService.GetWeapon(id);
        if(!CheckMoney(weapon.getPrice() , player.getMoney())){

            player.getInventory().setWeapon(weapon.getId());
            player.setMoney(player.getMoney() - weapon.getPrice());
            player.setDamage(player.getDamage() + weapon.getDamage());
            return  true;
        }
        System.out.println("You do not have enough money!");
        return  false;
    }
    private  boolean CheckMoney(int productMoney , int playerMoney){
        return productMoney > playerMoney;

    }

}
