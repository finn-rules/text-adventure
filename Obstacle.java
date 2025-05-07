public class Obstacle {
    private String name;
    private String description;
    private boolean canHideIn;
    private boolean breakable;
    private boolean exists;

    public Obstacle(String name, String description, boolean canHideIn, boolean moveable, boolean breakable) {
        this.name = name;
        this.description = description;
        this.canHideIn = canHideIn;
        this.breakable = breakable;
        this.exists = true; // Assuming the obstacle exists when created
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean attemptHide() {
        if (canHideIn) {
            System.out.println("You hide behind the " + name + ".");
            // Set the player's hidden status to true? how?
            return true;
        } else {
            System.out.println("You can't hide behind the " + name + ".");
            return false;
        }
    }
}

