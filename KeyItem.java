public class KeyItem extends Item {
    private boolean isKeyItem;
    private Room useRoom;

    /**
     * Constructor for KeyItem class
     * 
     * @param name          Name of the key item
     * @param description   Description of the key item
     * @param useable       Whether the key item is usable
     * @param useDesciption Description of how to use the key item
     * @param healthBuff    Health buff provided by the key item
     * @param healingValue  Healing value provided by the key item
     * @param damageBuff    Damage buff provided by the key item
     * @param spottable     Whether the key item is spottable
     * @param useRoom       Room where the key item can be used
     */
    public KeyItem(String name, String description, boolean useable, String useDesciption, int healthBuff,
            int healingValue, int damageBuff, boolean spottable, Room useRoom) {
        super(name, description, useable, useDesciption, healthBuff, healingValue, damageBuff, spottable);
        this.isKeyItem = true;
        this.useRoom = useRoom;
    }

    /**
     * gets if item is a key item
     * 
     * @return if item is a key item
     */
    public boolean isKeyItem() {
        return isKeyItem;
    }

    /**
     * Attempt to use a key, and unlock a door in the current room if needed.
     * @param player : the player.
     * @param curRoom : current room.
     * @param door : door to attempt to unlock
     */
    public void attemptUse(Player player, Room curRoom, Door door) {
        if (curRoom.equals(useRoom)) {
            System.out.println("You used the " + getName() + " in the " + curRoom.getName() + ".");
            door.unlockAtt();
            player.useItem(getDescription());
            System.out.println("The " + door.getName() + " has been unlocked.");
        } else {
            System.out.println("You can't use the " + getName() + " here.");
        }
    }

}
