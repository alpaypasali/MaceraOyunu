package Services.Concract;

import Game.GameCharacter;
import Game.Player;
import Services.Absract.IArmorService;
import Services.Absract.IGameCharacterManager;
import Services.Absract.IPlayerService;
import Services.Absract.IWeaponService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PlayerManager implements IPlayerService {

    private Player player;
    private  List<GameCharacter> newCharPlayer;
    private IGameCharacterManager characherManager;

    // Kurucu metod, dışarıdan bir IGameCharacterManager nesnesi alır
    public PlayerManager(IGameCharacterManager characherManager) {
        this.characherManager = characherManager;
        this.player = new Player();
        newCharPlayer  = new LinkedList<>();
    }



    @Override
    public void CreatePlayer(String name) {
        player.setName(name);
        player.setMoney(100);

    }

    @Override
    public void PrintPlayer() {
        System.out.println(player.getName() + " Welcome to this adventure");
        System.out.println("Owned gold: " + player.getMoney());
    }

    @Override
    public boolean BuyCharacter(int id) {
        GameCharacter selectedCharacter = characherManager.GetCharById(id);
        if (selectedCharacter != null) {
            // selectedCharacter'ı yeni bir liste içine ekleyerek
            int money = player.getMoney();
            if(money < selectedCharacter.getPrice()){
                System.out.println("Insufficient balance");
                return  false;

            }
            if(isPlayerAlreadyHas(selectedCharacter)){
                System.out.println("You already have");
                return false;

            }
            if(newCharPlayer.isEmpty()){

                player.setSelectedChar(selectedCharacter);
                player.setDamage(player.getDamage() + selectedCharacter.getDamage());
                player.setHealth(player.getHealth() + selectedCharacter.getHealth());
            }
            newCharPlayer.add(selectedCharacter);


            money = money - selectedCharacter.getPrice();
            player.setMoney(money);

            // Oyuncunun charPlayer listesini set et
            player.setCharPlayer(newCharPlayer);


            return true;
        }
        return false;
    }

    @Override
    public boolean SelectCharacter(int id) {
        GameCharacter selectedCharacter = characherManager.GetCharById(id);
        if (selectedCharacter != null) {
            player.setSelectedChar(selectedCharacter);
            player.setDamage(player.getDamage() + selectedCharacter.getDamage());
            player.setHealth(player.getHealth() + selectedCharacter.getHealth());
            return  true;
        }

        return false;
    }

    @Override
    public void OurCharacter() {

        if (newCharPlayer.isEmpty()) {
            System.out.println("Player has no characters.");
        } else {
            System.out.println("Player's characters:");

            System.out.println("ID\tCharacter\tDamage\tHealth");
            System.out.println("------------------------------------");
            for (GameCharacter gameCharacter : newCharPlayer) {
                System.out.println(gameCharacter.getId() + "\t" + gameCharacter.getCharName() + "\t\t" + gameCharacter.getDamage() +"\t\t" + gameCharacter.getHealth());
            }
            System.out.println("------------------------------------");
        }
    }

    @Override
    public void PlayerInfo() {

    }

    private  boolean isPlayerAlreadyHas(GameCharacter character){
        return newCharPlayer.contains(character);

    }





}
