package Game;

import Enums.Armors;

public class Armor {
    private  int id;
    private Armors armor;
    private int shield;
    private  int price;

    public Armor(int id, int price, Armors armor, int shield) {
        this.id = id;
        this.price = price;
        this.armor = armor;
        this.shield = shield;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public Armors getArmor() {
        return armor;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }
}
