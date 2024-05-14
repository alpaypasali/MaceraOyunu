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
    Scanner scanner = new Scanner(System.in);
    private  Player player;
    private boolean gameRunning = true;
    public Game() {

        System.out.println("Are You Ready for an Exciting Adventure? Open the doors because we're inviting you into a fantastic journey!\tAre you ready for adrenaline-filled moments, mysterious discoveries, and unforgettable experiences?");

        armorService = new ArmorManager();
        monsterService = new MonsterManager();

        this.weaponService = new WeaponManager();
        this.gameCharacterManager = new GameCharacterManager();
        this.armorService.CreateArmor();
        this.monsterService.CreateMonster();;
        this.weaponService.CreateWeapon();;
        this.gameCharacterManager.CreateGameChar();
        this.playerService = new PlayerManager(gameCharacterManager);

        this.storeService = new ToolStoreManager(player);
        this.safeHouseService = new SafeHouseManager(player);

    }
    public void Run(){
        System.out.println("Let's get started!");
        System.out.println("Enter a name:");
        String name = scanner.nextLine();
        playerService.CreatePlayer(name);
        playerService.PrintPlayer();
        gameCharacterManager.PrintCharacter();
        System.out.println("Please select a character:");
        int id = scanner.nextInt();
        playerService.BuyCharacter(id);
        playerService.OurCharacter();
        while (isGameRunning()) {

        }


    }
    public boolean isGameRunning() {
        return gameRunning;
    }


}
