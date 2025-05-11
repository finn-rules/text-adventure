public class Item {
    private String name;
    private String description;
    private boolean useable;
    private String useDescription;
    private int healthBuff;
    private int healingValue;
    private int damageBuff;
    private boolean spottable;

    public Item(String name, String description, boolean useable, String useDescription, int healthBuff, int healingValue, int damageBuff, boolean spottable) {
        this.name = name;
        this.description = description;
        this.useable = useable;
        this.useDescription = useDescription;
        this.healthBuff = healthBuff;
        this.healingValue = healingValue;
        this.damageBuff = damageBuff;
        this.spottable = spottable;
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
    public String getUseDescription() {
        return useDescription;
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

    /**
     * gets if item is spottable
     * @return if item is spottable
     */
    public boolean isSpottable() {
        return spottable;
    }

    /**
     * sets if item is spottable
     * @param spottable if item is spottable
     */
    public void setSpottable(boolean spottable) {
        this.spottable = spottable;
    }
}
