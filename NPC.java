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

    public Item dropItem() {
        Item droppedItem = inventory[0]; // Drop the first item in the inventory.
        inventory[0] = null; // Remove the item from inventory
        System.out.println(name + " dropped " + droppedItem.getName() + ".");
        return droppedItem;
    }

    public void transferLoot(Player player) {
        System.out.println(name + " has dropped some loot!");
        for (Item item : inventory) {
            if (item != null) {
                player.addItem(item);
                System.out.println("You picked up " + item.getName() + ".");
            }
        }
    }

    public void setCurHealth(int i) {
        this.curHealth = i;
        if (this.curHealth > maxHealth) {
            this.curHealth = maxHealth;
        }
    }


}
