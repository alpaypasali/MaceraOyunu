package Game;

import java.util.LinkedList;
import java.util.List;

public class Player {
    private String name;
    private int damage;
    private int health;
    private int money;
    private GameCharacter selectedChar;

    private Inventory inventory;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.money = 100;
        this.selectedChar = new GameCharacter();
        this.inventory = new Inventory(); // Initialize inventory
    }

    // Default constructor
    public Player() {
        this.money = 100;
        this.selectedChar = new GameCharacter();
        this.inventory = new Inventory(); // Initialize inventory
    }

    // Getters and Setters
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



    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
