package Game;

public abstract class GameArea {

    private  String Name;

    public GameArea(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
