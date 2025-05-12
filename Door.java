public class Door extends Obstacle {
    private boolean locked;
    private boolean encoded;
    private String keyName;
    private String code;

    /**
     * Constructor for Door class
     * 
     * @param name        Name of the door
     * @param description Description of the door
     * @param canHideIn   Whether the player can hide in the door
     * @param breakable   Whether the door is breakable
     * @param locked      Whether the door is locked
     * @param keyName     Name of the key to unlock the door
     */
    public Door(String name, String description, boolean canHideIn, boolean breakable, boolean locked, boolean encoded,
            String keyName, String codeString) {
        super(name, description, false, false, false);
        this.locked = locked;
        this.encoded = encoded;
        this.keyName = keyName;
        this.code = codeString;
    }

    public Door(String name, String description, boolean canHideIn, boolean breakable, boolean locked,
            String keyName) {
        super(name, description, false, false, false);
        this.locked = locked;
        this.encoded = false;
        this.keyName = keyName;
        this.code = null;
    }

    /**
     * gets if door is locked
     * 
     * @return if door is locked
     */
    public boolean isLocked() {
        return locked;
    }

    public boolean isEncoded() {
        return encoded;
    }

    public String getCode() {
        return code;
    }

    /**
     * gets name of key to unlock door
     * 
     * @return name of key to unlock door
     */
    public String getKeyName() {
        return keyName;
    }

    public void compareCodes(String codeAtt) {
        if (this.code.equals(codeAtt)) {
            this.encoded = false;
        }
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
    public void unlockAtt() {
        if (!encoded) {
            this.locked = false;
            System.out.println("The " + getName() + " has been unlocked.");
        } else {
            System.out.println("Though the key worked, you haven't tried the code of this door yet!");
        }
    }
}
