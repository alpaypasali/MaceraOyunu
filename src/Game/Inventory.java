package Game;

import java.util.List;

public class Inventory {

    private boolean water;
    private boolean food;
    private boolean firewoord;
    private List<Weapon> Weapons;
    private  List<Armor> Armors;

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewoord() {
        return firewoord;
    }

    public void setFirewoord(boolean firewoord) {
        this.firewoord = firewoord;
    }

    public List<Weapon> getWeapons() {
        return Weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        Weapons = weapons;
    }

    public List<Armor> getArmors() {
        return Armors;
    }

    public void setArmors(List<Armor> armors) {
        Armors = armors;
    }
}
