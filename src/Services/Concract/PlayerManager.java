package Services.Concract;

import Game.*;
import Services.Absract.IArmorService;
import Services.Absract.IGameCharacterManager;
import Services.Absract.IPlayerService;
import Services.Absract.IWeaponService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PlayerManager implements IPlayerService {


    private  List<GameCharacter> newCharPlayer;
    private IGameCharacterManager characherManager;
    private  IArmorService armorService;
    private  IWeaponService weaponService;

    // Kurucu metod, dışarıdan bir IGameCharacterManager nesnesi alır
    public PlayerManager() {
        this.characherManager = new GameCharacterManager();

        newCharPlayer  = new LinkedList<>();
        armorService = new ArmorManager();
        weaponService = new WeaponManager();
    }



    @Override
    public Player CreatePlayer(String name) {
        Player player = new Player();
        player.setName(name);
        player.setMoney(100);
        return  player;

    }

    @Override
    public void PrintPlayer(Player player) {
        System.out.println(player.getName() + " Welcome to this adventure");
        System.out.println("Owned gold: " + player.getMoney());
    }

    @Override
    public boolean BuyCharacter(int id , Player player) {
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




            return true;
        }
        return false;
    }

    @Override
    public boolean SelectCharacter(int id , Player player) {
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
    public void PlayerInfo(Player player) {
        System.out.println("Weapon\tArmor\tDamage\tHealth\tMoney");
        System.out.println("------------------------------------");

            System.out.println(GetWeapon(player.getInventory().getWeapon())  + "\t" + GetArmor(player.getInventory().getArmor()) + "\t\t" + player.getDamage() +"\t\t" + player.getHealth() +"\t\t" + player.getMoney());

        System.out.println("------------------------------------");

    }

    @Override
    public boolean Atack(Monster monster ,Player player) {
        int a = player.getDamage();
       monster.setHealth( monster.getHealth() - player.getDamage());
       if(monster.getHealth() <= 0){
           return  false;
       }
       return  true;
    }

    private  boolean isPlayerAlreadyHas(GameCharacter character){
        return newCharPlayer.contains(character);

    }
    private  String GetWeapon(int id){
        if(id == 0){
            return  "Punch";
        }
        else{
            return weaponService.GetWeapon(id).getWeapon().name();
        }

    }
    private String GetArmor(int id){

        if(id == 0) {
            return "Rag";
        }
        else{
            return armorService.GetArmor(id).getArmor().name();

        }




    }





}
