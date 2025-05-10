/**
 * npc
 */
public class NPC {
    private String name;
    private int maxHealth;
    private int curHealth;
    private String[] inventory;
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
    public NPC(String name, int health, String[] inventory, String description, int damage) {
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
    public String[] getInventory() {
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
}
