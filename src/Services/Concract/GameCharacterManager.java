package Services.Concract;

import Enums.Characters;
import Game.GameCharacter;
import Game.Weapon;
import Services.Absract.IGameCharacterManager;

import java.util.LinkedList;
import java.util.List;

public class GameCharacterManager implements IGameCharacterManager {


    private List<GameCharacter> characters;

    // Kurucu metot
    public GameCharacterManager() {
        // Karakterler listesini başlat
        characters = new LinkedList<>();

    }

    @Override
    public void CreateGameChar() {
        // Karakterleri ekle
        characters.add(new GameCharacter(1, Characters.Samurai, 5, 21, 15));
        characters.add(new GameCharacter(2, Characters.Archer, 7, 18, 20));
        characters.add(new GameCharacter(3, Characters.Knight, 8, 24, 35));

    }

    @Override
    public List<GameCharacter> listGameCharacters() {
        return characters;
    }

    @Override
    public GameCharacter GetCharById(int id) {
        for (GameCharacter gameCharacter : characters) {
            if (gameCharacter.getId() == id) {
                return gameCharacter;
            }
        }
        return null;
    }

    @Override
    public void PrintCharacter() {
        System.out.println("Character List:");
        System.out.println("ID\tCharacter\tDamage\tHealth\tPrice");
        System.out.println("------------------------------------");
        for (GameCharacter gameCharacter : characters) {
            System.out.println(gameCharacter.getId() + "\t" + gameCharacter.getCharName() + "\t\t" + gameCharacter.getDamage() +"\t\t" + gameCharacter.getHealth() + "\t\t" + gameCharacter.getPrice());
        }
        System.out.println("------------------------------------");
    }
}
