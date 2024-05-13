package Game;

public class BattleArea{
    private String Name;
    private  Monster monster;

    public BattleArea(Monster monster, String name) {
        this.monster = monster;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
