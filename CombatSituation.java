import java.util.Scanner;

public class CombatSituation {
    private Player player;
    private NPC npc;

    /**
     * Constructor for CombatSituation class
     * 
     * @param player the player in the combat situation
     * @param npc    the npc in the combat situation
     */
    public CombatSituation(Player player, NPC npc) {
        this.player = player;
        this.npc = npc;
        startCombat();
    }

    /**
     * gets the player in the combat situation
     * 
     */
    private void startCombat() {
        System.out.println("You are in combat with " + npc.getName() + "!");
        System.out.println("You have " + player.getCurHealth() + " health.");
        System.out.println(npc.getName() + " has " + npc.getCurHealth() + " health.");
        System.out.println("You currently deal " + player.getDamage() + " damage.");
        System.out.println(npc.getName() + " currently deals " + npc.getDamage() + " damage.");
        System.out.println("What would you like to do?");
        System.out.println("Commands: 'attack', 'use <item>', 'flee', 'check pockets'");
        System.out.println("Combat is turn based, and every action will take one of your turns.");
        System.out.println(npc.getName() + " is ruthless, and will only choose to attack you.");
        while(player.getCurHealth() > 0 && npc.getCurHealth() > 0) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equals("attack")) {
                npc.takeDamage(player.getDamage());
            } else if (command.startsWith("use ")) {
                String itemName = command.substring(4);
                Item item = player.getItem(itemName);
                if (item != null) {
                    item.use(player);
                } else {
                    System.out.println("You don't have that item.");
                }
            } else if (command.equals("flee")) {
                System.out.println("You fled from the battle!");
                break;
            } else if (command.equals("check pockets")) {
                player.printInventory();
            } else {
                System.out.println("Invalid command.");
            }
            if (npc.getCurHealth() > 0) {
                player.takeDamage(npc.getDamage());
            } else {
                System.out.println(npc.getName() + " has been defeated!");
                npc.transferLoot(player);
            }
        }
    }

}
