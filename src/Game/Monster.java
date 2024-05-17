package Game;


import Enums.Monsters;

public class Monster {
    private  int id;
    private Monsters monster;
    private int damage;
    private int health;
    private  int price;
    private  int maxNumber;



    public Monster(){


    }
    public Monster(int id, int health, Monsters monster, int price, int damage , int maxNumber) {
        this.price = price;
        this.health = health;
        this.monster = monster;
        this.id = id;
        this.damage = damage;
        this.maxNumber = maxNumber;

    }
    public Monster(int id, int damage, int health,int maxNumber ,Monsters monster) {
        this.id = id;
        this.monster = monster;
        this.damage = damage;
        this.health = health;
        this.maxNumber = maxNumber;
    }
    public Monster(int id, Monsters monster, int health, int maxNumber , int price) {

        this.health = health;
        this.monster = monster;
        this.id = id;
        this.maxNumber = maxNumber;
        this.price = price;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
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
