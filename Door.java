public class Door extends Obstacle {
    private boolean locked;
    private String keyName;

    /**
     * Constructor for Door class
     * @param name Name of the door
     * @param description Description of the door
     * @param canHideIn Whether the player can hide in the door
     * @param breakable Whether the door is breakable
     * @param locked Whether the door is locked
     * @param keyName Name of the key to unlock the door
     */
    public Door(String name, String description, boolean canHideIn, boolean breakable, boolean locked, String keyName) {
        super(name, description, false, false, false);
        this.locked = locked;
        this.keyName = keyName;
    }

    /**
     * gets if door is locked
     * @return if door is locked
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * gets name of key to unlock door
     * @return name of key to unlock door
     */
    public String getKeyName() {
        return keyName;
    }

    public boolean compareKey(KeyItem key) {
        if (key.getName().equals(keyName)) {
            System.out.println("The key fits the door. You can unlock it.");
            System.out.println("You used the " + key.getName() + " to unlock the " + getName() + ".");
            return true;
        } else {
            System.out.println("The key does not fit the door.");
            return false;
        }
    }

    /**
     * unlocks the door
     */
    public void unlock() {
        this.locked = false;
        System.out.println("The " + getName() + " has been unlocked.");
    }
    
}
