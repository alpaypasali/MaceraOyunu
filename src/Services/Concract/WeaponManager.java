package Services.Concract;

import Enums.Weapons;
import Game.Weapon;
import Services.Absract.IWeaponService;

import java.util.LinkedList;
import java.util.List;

public class WeaponManager implements IWeaponService {

    private  List<Weapon> weaponList;

    public WeaponManager() {
        this.weaponList = new LinkedList<>();
        CreateWeapon();
    }

    @Override
    public void CreateWeapon() {
        weaponList.add(new Weapon(1, Weapons.Gun,2,25));
        weaponList.add(new Weapon(2, Weapons.Sword,3,35));
        weaponList.add(new Weapon(3, Weapons.Rifle,7,45));
    }

    @Override
    public List<Weapon> GetListWeapon() {
        return weaponList;
    }


    @Override
    public Weapon GetWeapon(int id) {
        weaponList = GetListWeapon();
        for (Weapon weapon : weaponList) {
            if (weapon.getId() == id) {
                return weapon;
            }
        }
        return null;
    }

    @Override
    public void PrintWeapons() {
        System.out.println("Weapon List:");
        System.out.println("ID\tWeapon\tDamage\tPrice");
        System.out.println("------------------------------------");
        for (Weapon weapon : weaponList) {
            System.out.println(weapon.getId() + "\t" + weapon.getWeapon() + "\t\t" + weapon.getDamage() + "\t\t" + weapon.getPrice());
        }
        System.out.println("------------------------------------");
    }
    public int GetWeaponsCount(){


        return weaponList.size();
    }

}
