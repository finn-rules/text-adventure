/**
 * obstacle
 */
public class Obstacle {
    private String name;
    private String description;
    private boolean canHideIn;
    private boolean breakable;
    private boolean exists;
    private int breakDamage;
    private Item breakItem;

    /**
     * Constructor for Obstacle class
     * 
     * @param name        Name of the obstacle
     * @param description Description of the obstacle
     * @param canHideIn   Whether the player can hide in the obstacle
     * @param moveable    Whether the obstacle is moveable
     * @param breakable   Whether the obstacle is breakable
     */
    public Obstacle(String name, String description, boolean canHideIn, boolean moveable, boolean breakable) {
        this.name = name;
        this.description = description;
        this.canHideIn = canHideIn;
        this.breakable = breakable;
        this.exists = true; // the obstacle exists when created
        this.breakDamage = 100; // default break damage (player damage should never get this high)
        this.breakItem = null; // default break item
    }

    /**
     * Alternate constructor for Obstacle class
     * 
     * @param name        Name of the obstacle
     * @param description Description of the obstacle
     * @param canHideIn   Whether the player can hide in the obstacle
     * @param moveable    Whether the obstacle is moveable
     * @param breakable   Whether the obstacle is breakable
     * @param breakDamage The damage needed to "break" the obstacle
     * @param breakItem   The item obtained from breaking the obstacle
     * 
     */
    public Obstacle(String name, String description, boolean canHideIn, boolean moveable, boolean breakable,
            int breakDamage, Item breakItem) {
        this.name = name;
        this.description = description;
        this.canHideIn = canHideIn;
        this.breakable = breakable;
        this.exists = true; // the obstacle exists when created
        this.breakDamage = breakDamage; // default break damage
        this.breakItem = breakItem; // default break item
    }

    /**
     * gets name of obstacle
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets description of obstacle
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * attempts to hide behind the obstacle
     * 
     * @return if the player can hide behind the obstacle
     */
    public boolean attemptHide(Player player) {
        if (canHideIn) {
            System.out.println("You hide behind the " + name + ".");
            player.setPlayerHidden(true);
            return true;
        } else {
            System.out.println("You can't hide behind the " + name + ".");
            return false;
        }
    }

    /**
     * whether or not you can hide in the obstacle
     * 
     * @return whether or not you can hide in the obstacle
     */
    public boolean isHideable() {
        return canHideIn;
    }

    /**
     * whether or not you can break the obstacle
     * 
     * @return whether or not you can break the obstacle
     */
    public boolean isBreakable() {
        return breakable;
    }

    /**
     * gets the item you get from breaking the obstacle
     * 
     * @return the Item you get from breaking the obstacle
     */
    public Item getBreakItem() {
        return breakItem;
    }

    /**
     * gets the damage you need to break the obstacle
     * 
     * @return the damage you need to break the obstacle
     */
    public int getBreakDamage() {
        return breakDamage;
    }
}
