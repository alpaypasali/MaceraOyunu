package Services.Absract;

import Game.Weapon;

import java.util.List;

public interface IWeaponService {

    void CreateWeapon();
    List<Weapon> GetListWeapon();
    Weapon GetWeapon(int id);
    void PrintWeapons();
    int GetWeaponsCount();
}
