package Services.Absract;

import Game.GameCharacter;

import java.util.List;

public interface IGameCharacterManager {
     void CreateGameChar();
    List<GameCharacter> listGameCharacters();
    GameCharacter GetCharById(int id);
    void PrintCharacter();
    int CountCharacters();
}
