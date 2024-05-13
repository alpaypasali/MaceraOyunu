package Game;

import java.util.LinkedList;

public class Player {
    private String name ;
    private  int damage;
    private  int health;
    private LinkedList<Integer> charPlayer;
    private  Inventory Inventory;

    public Inventory getInventory() {
        return Inventory;
    }

    public void setInventory(Inventory inventory) {
        Inventory = inventory;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Integer> getCharPlayer() {
        return charPlayer;
    }

    public void setCharPlayer(LinkedList<Integer> charPlayer) {
        this.charPlayer = charPlayer;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
