package Game;


import Enums.Monsters;

public class Monster {
    private  int id;
    private Monsters monster;
    private int damage;
    private int health;
    private  int price;

    public Monster(int id, int health, Monsters monster, int price, int damage) {
        this.price = price;
        this.health = health;
        this.monster = monster;
        this.id = id;
        this.damage = damage;
    }
    public Monster(int id, int health, Monsters monster, int damage) {

        this.health = health;
        this.monster = monster;
        this.id = id;
        this.damage = damage;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Monsters getMonster() {
        return monster;
    }

    public void setMonster(Monsters monster) {
        this.monster = monster;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
