import Game.GameCharacter;
import Services.Concract.GameCharacterManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // GameCharacterManager örneği oluştur
        GameCharacterManager characterManager = new GameCharacterManager();

        // Karakterleri oluştur
        characterManager.CreateGameChar();

        // Oluşturulan karakterleri listeleyerek ekrana yazdır
        List<GameCharacter> characters = characterManager.listGameCharacters();
        for (GameCharacter character : characters) {
            System.out.println(character.getCharName() + " - Damage: " + character.getDamage() + " - Health: " + character.getHealth() + " - Price: " + character.getPrice());
        }
    }
}
