/**
 * NPC
 */
public class NPC {
    private String name;
    private int maxHealth;
    private int curHealth;
    private Item[] inventory; // Not applicable necessarily, but might be good if we grow our game
    private String description;
    private int damage;

    /**
     * Constructor for NPC class
     * @param name Name of the NPC
     * @param health Maximum health of the NPC
     * @param inventory Inventory items of the NPC
     * @param description Description of the NPC
     * @param damage Damage dealt by the NPC
     */
    public NPC(String name, int health, Item[] inventory, String description, int damage) {
        this.name = name;
        this.maxHealth = health;
        this.curHealth = health;
        this.inventory = inventory;
        this.description = description;
        this.damage = damage;
    }

    /**
     * gets the name of the npc
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets the current health of the npc
     * @return health
     */
    public int getCurHealth() {
        return curHealth;
    }

    /**
     * gets the inventory of the npc
     * @return inventory
     */
    public Item[] getInventory() {
        return inventory;
    }

    /**
     * gets the description of the npc
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * has the npc take damage
     * @param damage damage
     */
    public void takeDamage(int damage) {
        this.curHealth -= damage;
        if (this.curHealth <= 0) {
            this.curHealth = 0;
            System.out.println(name + " has been defeated!");
        } else if (this.curHealth < this.maxHealth / 2) {
            System.out.println(name + " looks injured! Stay strong!");
        }
    }

    /**
     * gets the damage of the npc
     * @return damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Make the NPC drop a single item
     * @return the dropped item
     */
    public Item dropItem() {
        Item droppedItem = inventory[0]; // Drop the first item in the inventory. (only one in our game)
        inventory[0] = null;
        System.out.println(name + " dropped " + droppedItem.getName() + ".");
        return droppedItem;
    }

    /**
     * Transfer all of the loot from the NPC to the player. Should be used on kills.
     * @param player the player
     */
    public void transferLoot(Player player) {
        System.out.println(name + " has dropped some loot!");
        for (Item item : inventory) {
            if (item != null) {
                player.addItem(item);
                System.out.println("You picked up " + item.getName() + ".");
            }
        }
    }

    /**
     * Set the health of the NPC - useful for combat
     * @param hp : the hitpoints to set the health to.
     */
    public void setCurHealth(int hp) {
        this.curHealth = hp;
        if (this.curHealth > maxHealth) { // don't let it exceed NPC max health.
            this.curHealth = maxHealth; // especially useful b/c natural regen
        }
    }
}
