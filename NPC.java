public class NPC {
    private String name;
    private int maxHealth;
    private int curHealth;
    private String[] inventory;
    private String description;

    public NPC(String name, int health, String[] inventory, String description) {
        this.name = name;
        this.maxHealth = health;
        this.curHealth = health;
        this.inventory = inventory;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getCurHealth() {
        return curHealth;
    }

    public String[] getInventory() {
        return inventory;
    }

    public String getDescription() {
        return description;
    }

    public void takeDamage(int damage) {
        this.curHealth -= damage;
        if (this.curHealth <= 0) {
            this.curHealth = 0;
            System.out.println(name + " has been defeated!");
        } else if (this.curHealth < this.maxHealth / 2) {
            System.out.println(name + " looks injured! Stay strong!");
        }
    }
    
}
