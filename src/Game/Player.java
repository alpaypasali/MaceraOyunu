package Game;

import java.util.LinkedList;
import java.util.List;

public class Player {
    private String name ;
    private  int damage;
    private  int health;
    private  int money ;
    private  GameCharacter selectedChar;

    public GameCharacter getSelectedChar() {
        return selectedChar;
    }

    public void setSelectedChar(GameCharacter selectedChar) {
        this.selectedChar = selectedChar;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public List<GameCharacter> getCharPlayer() {
        return charPlayer;
    }

    public void setCharPlayer(List<GameCharacter> charPlayer) {
        this.charPlayer = charPlayer;
    }

    private List<GameCharacter> charPlayer;
    private  Inventory Inventory;

    public Inventory getInventory() {
        return Inventory;
    }

    public void setInventory(Inventory inventory) {
        Inventory = inventory;
    }

    public Player(String name) {
        this.name = name;
        this.money = 100;
        this.charPlayer = new LinkedList<>();
    }
    public Player(){


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getHealth() {
        return this.health;
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
