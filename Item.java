public class Item {
    private String name;
    private String description;
    private boolean useable;
    private String useDesciption;
    private int healthBuff;
    private int damageBuff;

    public Item(String name, String description, boolean useable, String useDesciption, int healthBuff, int damageBuff) {
        this.name = name;
        this.description = description;
        this.useable = useable;
        this.useDesciption = useDesciption;
        this.healthBuff = healthBuff;
        this.damageBuff = damageBuff;
    }

    /**
     * gets name of item
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets description of item
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * gets if item is useable
     * @return if item is useable
     */
    public boolean isUseable() {
        return useable;
    }

    /**
     * gets use description of item
     * @return use description
     */
    public String getUseDesciption() {
        return useDesciption;
    }

    /**
     * gets health buff of item
     * @return health buff
     */
    public int getHealthBuff() {
        return healthBuff;
    }

    /**
     * gets damage buff of item
     * @return damage buff
     */
    public int getDamageBuff() {
        return damageBuff;
    }

    public void use(Player player) {
        if (this.isUseable()) {
            System.out.println(this.getUseDesciption());
            if (healthBuff > 0) {
                player.curHealth += healthBuff;
                System.out.println("You gained " + healthBuff + " health!");
            }
            if (damageBuff > 0) {
                player.
                System.out.println("You gained " + damageBuff + " damage!");
            }
        } else {
            System.out.println("This item cannot be used.");
        }
    }
}
