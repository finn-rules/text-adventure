/**
 * player class 
 */
public class Player {
    private int maxHealth;
    private int curHealth;
    private int effectiveHallwayPosition;
    private int damage;

    private boolean hidden;
    private Item[] inventory;

    /**
     * Constructor for Player class
     * @param health health of the player
     * @param inventory inventory of the player
     */
    public Player(int health, int damage, Item[] inventory) {
        this.curHealth = health;
        this.maxHealth = health;
        this.damage = damage;
        this.effectiveHallwayPosition = 0; // starting position is 0
        this.hidden = false;
        this.inventory = inventory;
    }

    public void setPlayerHidden(boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * sets the current health of player
     * @param curHealth current health of player
     */
    public void setCurHealth(int curHealth) {
        this.curHealth = curHealth;
    }

    /**
     * gets current health of player
     * @return current health of player
     */
    public int getCurHealth() {
        return curHealth;
    }

    /**
     * sets max health of player
     * @return max health of player
     */
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    /**
     * gets max health of player
     * @return max health of player
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    public int getEffectiveHallwayPosition() {
        return effectiveHallwayPosition;
    }

    public void setEffectiveHallwayPosition(int effectiveHallwayPosition) {
        this.effectiveHallwayPosition = effectiveHallwayPosition;
    }

    /**
     * applies damage to player
     * @param damage damage to apply to player
     */
    public void takeDamage(int damage) {
        this.curHealth -= damage;
        if (this.curHealth <= 0) {
            this.curHealth = 0;
            System.out.println("You have been defeated!");
            System.exit(0); // End the game
        } else if (this.curHealth < this.maxHealth / 4) { 
            System.out.println("That one hurt... your health is low! Stay strong, maybe consider fleeing!");
        }
    }

    /**
     * gets inventory of player
     * @return inventory
     */
    public Item[] getInventory() {
        return inventory;
    }

    public void increaseDamage(int damage) {
        this.damage = this.damage + damage;
    }

    /**
     * gets damage of player
     * @return damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * get inventory index of player
     * @param index index of inventory
     * @return inventory at index
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public Item getInventoryIndex(int index) {
        if (index < 0 || index >= inventory.length) {
            throw new IndexOutOfBoundsException("you did not choose an index in inventory the array!"); // or throw an exception
        }
        return inventory[index];
    }
}

