package Services.Concract;

import Enums.Characters;
import Game.GameCharacter;
import Services.Absract.IGameCharacterManager;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GameCharacterManager implements IGameCharacterManager {


    private List<GameCharacter> characters;
    private Random random;
    // Kurucu metot
    public GameCharacterManager() {
        // Karakterler listesini başlat
        characters = new LinkedList<>();
         random = new Random();
    }

    @Override
    public void CreateGameChar() {
        // Karakterleri ekle
        characters.add(new GameCharacter(1, Characters.Samurai, 5, 21, 15));
        characters.add(new GameCharacter(2, Characters.Archer, 7, 18, 20));
        characters.add(new GameCharacter(3, Characters.Knight, 8, 24, 5));

    }

    @Override
    public List<GameCharacter> listGameCharacters() {
        return characters;
    }
}
