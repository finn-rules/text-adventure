import java.util.ArrayList;

/**
 * player class
 */
public class Player {
    private int maxHealth;
    private int curHealth;
    private int effectiveHallwayPosition;
    private int damage;

    private boolean hidden;
    private ArrayList<Item> inventory;
    private int inventoryCap = 20; // default size of inventory
    private int inventorySize = 0; // we didn't end up using this.

    /**
     * Constructor for Player class
     * 
     * @param health    health of the player
     * @param inventory inventory of the player
     */
    public Player(int health, int damage, ArrayList<Item> inventory, int inventoryCap) {
        this.curHealth = health;
        this.maxHealth = health;
        this.damage = damage;
        this.effectiveHallwayPosition = 0; // starting position is 0
        this.hidden = false;
        this.inventory = inventory;
        this.inventoryCap = inventoryCap;
        this.inventorySize = 0;
    }

    /**
     * set the player's hidden status
     * @param hidden whether or not the player is hidden
     */
    public void setPlayerHidden(boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * get whether or not the player is hidden
     * @return whether or not the player is hidden
     */
    public boolean getPlayerHidden() {
        return hidden;
    }

    /**
     * sets the current health of player
     * 
     * @param curHealth current health of player
     */
    public void setCurHealth(int curHealth) {
        this.curHealth = curHealth;
        if (this.curHealth > this.maxHealth) {
            this.curHealth = this.maxHealth;
        }
    }

    /**
     * gets current health of player
     * 
     * @return current health of player
     */
    public int getCurHealth() {
        return curHealth;
    }

    /**
     * sets max health of player
     * 
     * @return max health of player
     */
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    /**
     * gets max health of player
     * 
     * @return max health of player
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * get where the user is poised in the hallway : useful for printing osera distance.
     * @return where the user is poised in the hallway (in or out)
     */
    public int getEffectiveHallwayPosition() {
        return effectiveHallwayPosition;
    }

    /**
     * place the player at the hallway's index
     * @param effectiveHallwayPosition : where we want to place the player
     */
    public void setEffectiveHallwayPosition(int effectiveHallwayPosition) {
        this.effectiveHallwayPosition = effectiveHallwayPosition;
    }

    /**
     * Print the player's inventory item names.
     */
    public void printInventory() {
        System.out.println("Your inventory:");
        for (int i = 0; i < inventory.size(); i++) {
            Item item = inventory.get(i);
            if (item != null) {
                System.out.println("Slot " + (i + 1) + ": " + item.getName());
            } else {
                System.out.println("Slot " + (i + 1) + ": Empty slot");
            }
        }
    }

    /**
     * applies damage to player
     * 
     * @param damage damage to apply to player
     */
    public void takeDamage(int damage) {
        this.curHealth -= damage;
        if (this.curHealth <= 0) {
            this.curHealth = 0;
        } else if (this.curHealth < this.maxHealth / 4) {
            System.out.println("That one hurt... your health is low! Stay strong, maybe consider fleeing!");
        }
    }

    /**
     * gets inventory of player
     * 
     * @return inventory
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    /**
     * Boost the player's damage.
     * @param damage : the damage to add.
     */
    public void increaseDamage(int damage) {
        this.damage = this.damage + damage;
    }

    /**
     * gets the item that the player types from their inventory.
     * 
     * @param itemName : the name of the item, as a string.
     * @return the item (if it was in the inventory)
     */
    public Item getItem(String itemName) {
        for (Item item : inventory) {
            if (item != null && item.getName().split(" ")[0].equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    /**
     * gets damage of player
     * 
     * @return damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * get inventory index of player
     * 
     * @param index index of inventory
     * @return inventory at index
     * @throws IndexOutOfBoundsException if index is out of bounds
     */
    public Item getInventoryIndex(int index) {
        if (index < 0 || index >= inventory.size()) {
            throw new IndexOutOfBoundsException("you did not choose an index in inventory the array!"); // or throw an
                                                                                                        // exception
        }
        return inventory.get(index);
    }

    /**
     * Add an item to the player's inventory
     * @param item the item to add
     */
    public void addItem(Item item) {
        inventory.add(item);
        System.out.println("You picked up " + item.getName() + ".");
    }

    /**
     * use an item. 
     * @param itemName the item to use
     */
    public void useItem(String itemName) {
        Item item = getItem(itemName);
        if (item == null) {
            System.out.println("You don't have that item (yet?).");
            return;
        }
        if (item.isUseable()) {
            System.out.println(item.getUseDescription());
            if (item.getHealthBuff() > 0) {
                this.setMaxHealth(item.getHealthBuff() + this.getMaxHealth());
                System.out.println("You gained " + item.getHealthBuff() + " max health!");
            }
            if (item.getDamageBuff() > 0) {
                this.increaseDamage(item.getDamageBuff());
                System.out.println("You gained " + item.getDamageBuff() + " damage!\n" +
                        "Your now will deal " + this.getDamage() + " damage!");
            }
            if (item.getHealingValue() > 0) {
                this.setCurHealth(item.getHealingValue() + this.getCurHealth());
                System.out.println("You healed " + item.getHealingValue() + " health!");
            }
        } else {
            System.out.println("This item cannot be used.");
        }
        inventory.remove(item);
    }
}
