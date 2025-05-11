import java.util.Scanner;

public class CombatSituation {
    private Player player;
    private NPC npc;

    /**
     * Constructor for CombatSituation class
     * 
     * @param player the player in the combat situation
     * @param npc    the npc in the combat situation
     * @throws InterruptedException 
     */
    public CombatSituation(Player player, NPC npc) throws InterruptedException {
        this.player = player;
        this.npc = npc;
        startCombat();
    }

    /**
     * gets the player in the combat situation
     * @throws InterruptedException 
     */
    private void startCombat() throws InterruptedException {
        System.out.println("You are in combat with " + npc.getName() + "!");
        System.out.println("You have " + player.getCurHealth() + " health.");
        System.out.println(npc.getName() + " has " + npc.getCurHealth() + " health.");
        Thread.sleep(2000);
        System.out.println("You currently deal " + player.getDamage() + " damage.");
        System.out.println(npc.getName() + " currently deals " + npc.getDamage() + " damage.");
        Thread.sleep(2000);
        System.out.println("What would you like to do?");
        Thread.sleep(2000);
        System.out.println("Commands: 'attack', 'use <item>', 'assess situation', 'flee', 'check pockets'");
        Thread.sleep(2000);
        System.out.println("Combat is turn based, and every action will take one of your turns.");
        Thread.sleep(2000);
        System.out.println(npc.getName() + " is ruthless, and will only choose to attack you.");
        while(player.getCurHealth() > 0 && npc.getCurHealth() > 0) {
            System.out.println("Your turn! What would you like to do?");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equals("attack")) {
                npc.takeDamage(player.getDamage());
            } else if (command.startsWith("use ")) {
                String itemName = command.substring(4);
                Item item = player.getItem(itemName);
                if (item != null) {
                    player.useItem(itemName);
                } else {
                    System.out.println("You don't have that item.");
                }
            } else if (command.equals("flee")) {
                System.out.println("You fled from the battle!");
                Thread.sleep(2000);
                System.out.println("I wouldn't say you took the coward's way out.");
                Thread.sleep(2000);
                System.out.println("If " + npc.getName() + " takes a stabs at you and kills you, maybe you did though.");
                break;
            } else if (command.equals("check pockets")) {
                player.printInventory();
            } else if (command.equals("assess situation")) {
                System.out.println("You take a moment to assess the situation and collect your thoughts.");
                Thread.sleep(2000);
                System.out.println("You are in combat with " + npc.getName() + ".");
                Thread.sleep(2000);
                System.out.println("You have " + player.getCurHealth() + " health.");
                Thread.sleep(2000);
                System.out.println(npc.getName() + " has " + npc.getCurHealth() + " health.");
                Thread.sleep(2000);
                System.out.println("You currently deal " + player.getDamage() + " damage.");
                Thread.sleep(2000);
                System.out.println(npc.getName() + " currently deals " + npc.getDamage() + " damage.");
                Thread.sleep(2000);
                System.out.println("You have " + player.getInventory().size() + " items in your inventory.");
                Thread.sleep(2000);
                System.out.println("You have " + player.getMaxHealth() + " max health.");
                Thread.sleep(2000);          
            } else {
                System.out.println("Invalid command. You shout out something illegible - " + command + " and " + npc.getName() + " scoffs at you.\n");
                Thread.sleep(2000);
                System.out.println("You lose a turn, and " + npc.getName() + " takes a stab at you.");
            }
            if (npc.getCurHealth() > 0) {
                System.out.println(npc.getName() + " attacks you!");
                player.takeDamage(npc.getDamage());
            } else {
                System.out.println(npc.getName() + " has been defeated!");
                npc.transferLoot(player);
            }
        }
        if (player.getCurHealth() <= 0) {
            System.out.println("You have been defeated! Valiant effort, but you were no match for " + npc.getName() + ".");
            Thread.sleep(2000);
            System.out.println("You have died.");
            Thread.sleep(2000);
            System.out.println("Tip - Osera paces the hallway, looking for a fight.");
            System.out.println("Try to assess your situation frequently and 'look around' to be aware of his position.");
            Thread.sleep(2000);
            System.out.println("There is no shame in fleeing, and you start with a few health packs.");
            System.out.println("You can use health packs either in or out of combat if you're feeling hurt.");
            Thread.sleep(2000);
            System.out.println("Try to keep track of how healthy you are.");
            System.out.println("Game over.");
            Thread.sleep(2000);
            System.out.println("The hallways of Noyce will forget you, as they have forgotten many before you.");
            Thread.sleep(2000);
            System.exit(0); // End the game
        } else {
            System.out.println("You have escaped from combat!");
        }
    }

}
