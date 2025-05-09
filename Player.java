/**
 * player class 
 */
public class Player {
    int maxHealth;
    int curHealth;
    int effectiveHallwayPosition;

    boolean hidden;
    String[] inventory;

    /**
     * Constructor for Player class
     * @param health health of the player
     * @param inventory inventory of the player
     */
    public Player(int health, String[] inventory) {
        this.curHealth = health;
        this.maxHealth = health;
        this.effectiveHallwayPosition = 0; // starting position is 0
        this.hidden = false;
        this.inventory = inventory;
    }

    /**
     * gets current health of player
     * @return current health of player
     */
    public int getCurHealth() {
        return curHealth;
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
    public String[] getInventory() {
        return inventory;
    }

    /**
     * get inventory index of player
     * @param index index of inventory
     * @return inventory at index
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public String getInventoryIndex(int index) {
        if (index < 0 || index >= inventory.length) {
            throw new IndexOutOfBoundsException("you did not choose an index in inventory the array!"); // or throw an exception
        }
        return inventory[index];
    }
}

