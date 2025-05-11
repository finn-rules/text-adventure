/**
 * obstacle
 */
public class Obstacle {
    private String name;
    private String description;
    private boolean canHideIn;
    private boolean breakable;
    private boolean exists;

    /**
     * Constructor for Obstacle class
     * @param name Name of the obstacle
     * @param description Description of the obstacle
     * @param canHideIn Whether the player can hide in the obstacle
     * @param moveable Whether the obstacle is moveable
     * @param breakable Whether the obstacle is breakable
     */
    public Obstacle(String name, String description, boolean canHideIn, boolean moveable, boolean breakable) {
        this.name = name;
        this.description = description;
        this.canHideIn = canHideIn;
        this.breakable = breakable;
        this.exists = true; // the obstacle exists when created
    }

    /**
     * gets name of obstacle
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets description of obstacle
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * attempts to hide behind the obstacle
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

    public boolean isHideable() {
        return canHideIn;
    }

    public boolean isBreakable() {
        return breakable;
    }
}

