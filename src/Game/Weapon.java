package Game;

import Enums.Weapons;

public class Weapon {

    public Weapon(int id, Weapons weapon, int damage, int price) {
        this.id = id;
        this.weapon = weapon;
        this.damage = damage;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private  int id;
    private Weapons weapon;
    private int damage;
    private  int price;
}
