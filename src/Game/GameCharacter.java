package Game;

import Enums.Characters;

public  class GameCharacter {
    private int id;
    private Characters charName;
    private int damage;
    private int health;
    private int price; // Integer türünde değişken
    public GameCharacter(int id, Characters charName, int damage, int health, int price) {
        this.id = id;
        this.charName = charName;
        this.damage = damage;
        this.health = health;
        this.price = price;
    }
    public GameCharacter(int id, Characters charName, int damage, int health) {
        this.id = id;
        this.charName = charName;
        this.damage = damage;
        this.health = health;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Characters getCharName() {
        return charName;
    }

    public void setCharName(Characters charName) {
        this.charName = charName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
