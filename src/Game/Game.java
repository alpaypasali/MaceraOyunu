package Game;

import Services.Absract.*;
import Services.Concract.*;

import java.util.Scanner;

public class Game {

    private IPlayerService playerService;
    private IArmorService armorService;
    private IMonsterService monsterService;
    private ISafeHouseService safeHouseService;
    private IToolStoreService storeService;
    private  IWeaponService weaponService;
    private  IGameCharacterManager gameCharacterManager;
    private  IForestService forestService;
    private  ICaveService caveService;
    private  IRiverService riverService;
    Scanner scanner = new Scanner(System.in);
    private  Player player;
    private  Monster monster ;
    private boolean gameRunning = true;
    public Game() {
        this.caveService = new CaveManager();
        this.forestService = new ForestManager();
        this.riverService = new RiverManager();

        System.out.println("Are You Ready for an Exciting Adventure? Open the doors because we're inviting you into a fantastic journey!\tAre you ready for adrenaline-filled moments, mysterious discoveries, and unforgettable experiences?");

        armorService = new ArmorManager();
        monsterService = new MonsterManager();
        monster =  monsterService.CreateMonster();


        this.weaponService = new WeaponManager();
        this.gameCharacterManager = new GameCharacterManager();
        this.armorService.CreateArmor();

        this.weaponService.CreateWeapon();;

        this.playerService = new PlayerManager();

        this.storeService = new ToolStoreManager();
        this.safeHouseService = new SafeHouseManager();
        Starter();



    }
    public  void Starter(){

        System.out.println("Let's get started!");
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        player = playerService.CreatePlayer(name);
        playerService.PrintPlayer(player);
        gameCharacterManager.PrintCharacter();
        int id;
        do {
            System.out.println("Please select a character:");
            id = scanner.nextInt();
        }while (id >= gameCharacterManager.CountCharacters() + 1);

        playerService.BuyCharacter(id,player);
        playerService.OurCharacter();
        System.out.println("Your character has been selected:");
        playerService.PlayerInfo(player);


    }
    public void Run(){

        while (isGameRunning()) {
            ChooseArea();
            if(!gameRunning)
                System.out.println("Game Over");
        }


    }
    public boolean isGameRunning() {
        return gameRunning;
    }

    private void ChooseArea(){
        System.out.println("");
        System.out.println("#######     Areas       #######");
        System.out.println("1. Safe House --> Your own safe place, no enemies!");
        System.out.println("2. Cave --> You might encounter a zombie!");
        System.out.println("3. Forest --> You might encounter a vampire!");
        System.out.println("4. River --> You might encounter a bear!");
        System.out.println("5. Mine --> You might encounter a snake!");
        System.out.println("6. Store --> You can buy weapons or armor!");
        System.out.print("Enter the place you want to go: ");
        int select = scanner.nextInt();
        while (select < 0 || select > 6) {
            System.out.print("Please select a valid place: ");
            select = scanner.nextInt();
        }
        switch (select) {

            case 1:
                safeHouseService.onLacation(player);
                playerService.PlayerInfo(player);
                break;
            case 2:
                if(player.getInventory().isFood()){
                    System.out.println("You have defeated all zombies!");
                    break;
                }
                monster = monsterService.GetMonster(1);

                if(!caveService.onLocation(player,monster))
                    gameRunning =false;

                playerService.PlayerInfo(player);
                break;
            case 3:
                if(player.getInventory().isFirewoord()){
                    System.out.println("You have defeated all vampire!");
                    break;
                }
                monster = monsterService.GetMonster(2);

                if(!forestService.onLocation(player,monster))
                    gameRunning = false;

                playerService.PlayerInfo(player);
                break;
            case 4:
                if(player.getInventory().isWater()){
                    System.out.println("You have defeated all bear!");
                    break;
                }
                monster = monsterService.GetMonster(3);

                if(!riverService.onLocation(player,monster))
                    gameRunning = false;

                playerService.PlayerInfo(player);
                break;

            default:
                break;
        }


    }



}
