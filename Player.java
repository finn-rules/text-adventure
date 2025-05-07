public class Player {
    int health;
    String[] inventory;

    public Player(int health, String[] inventory) {
        this.health = health;
        this.inventory = inventory;
    }
    public int getHealth() {
        return health;
    }
    public String[] getInventory() {
        return inventory;
    }
    public String getInventoryIndex(int index) {
        if (index < 0 || index >= inventory.length) {
            throw new IndexOutOfBoundsException("you did not choose an index in inventory the array!"); // or throw an exception
        }
        return inventory[index];
    }
}
