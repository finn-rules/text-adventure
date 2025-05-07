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

Obstacle pottedPlant = new Obstacle("potted plant", "A semi-large, potted plant. " +
        "It's taller than you are, and covered in dirt. Its leaves are wilted," +
        " but massive. You definitely could hide behind it.", true, false, true);

Obstacle whiteboard = new Obstacle("whiteboard", "A surpisingly clean whiteboard. It seems to be " +
        "covered in some kind of unintelligible writing.\n It mentions something about " +
        "how terrible and annoying documentation is. There's also a sequence of letters...?\n " +
        "It reads 'IV, IX, VII, II'. Who left this here? It looks like a code of some kind.\n " +
        "It also says 'If you haven't already, check your pockets!'\n This seems a lot less vague. " +
        "If you haven't already, I'd do that!",
        false, false, false); 

Obstacle hallway2door = new Obstacle("door", "You look at the door a little more closely.\n" +
        "It looks sturdy - breaking it would be impossible. There's a 3 by 3 keypad on the door, with numbers 1-9.\n" +
        "You feel like you've been in this room before. You've been through this door! Why? It feels familiar.\n" +
        "You feel like you should know the code to this door. Maybe someone left a clue?",
        false, false, false); // TODO: add a way to open the door - prompt the user to enter a code?

Obstacle hallway4door = new Obstacle("lab door", "You notice a door to your right. You feel an overwhelming sense of dread.\n" +
        "This one has a keypad too. However, it's a little different. There are two parts to the keypad, and a note on the door.\n" +
        "The note reads: 'I expect my research students to be the cream of the crop - this problem should be easy for you.\n" +
        "Crap... I don't remember being a research student. I don't even remember my name! But I know I want to get out of here.\n" +
        "You read the note more carefully. It says:" +
        "" +
        "Under the keypad, there's also what appears to be a coin slot. Interesting... do I have a coin?\n",
        false, false, false); 