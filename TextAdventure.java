import java.util.Scanner;

/*
 * text adventure 
 */
public class TextAdventure {

    /**
     * Displays a help message with the available commands in the game.
     * 
     * @throws InterruptedException if the thread is interrupted
     */
    public static void helpMessage() throws InterruptedException {
        System.out.println("Wait: wait in the room for one turn\n" +
                "Go <direction>: go in the given cardinal direction, e.g., north, south, east, west.\n" +
                "Pick up <item>: pick up the given item found in the room\n" +
                "Use <item>: use the given item found in the player's inventory\n" +
                "Attack <object>: attack the given object found in the room\n" +
                "Look at <object>: look at the given object found in the room\n" +
                "Check pocket/pockets/inventory: check the player's inventory for items\n" +
                "Hide behind <object>: attempt to hide behind the given object found in the room\n" +
                "help: show this help message\n" +
                "quit: quit the game.\n");
        Thread.sleep(2000);
    }

    /**
     * Message to display when the player wakes up in the game.
     * 
     * @throws InterruptedException if the thread is interrupted
     */
    public static void wakeupMessage() throws InterruptedException {
        System.out.println("Dazed and confused, you find yourself in a dark hallway.");
        Thread.sleep(2000);
        System.out.println(
                "You try to remember how you got here, but your mind is blanking. What's my name...? Where am I...?");
        Thread.sleep(2000);
        System.out.println("Damn it, what's going on? Why don't I remember anything?");
        Thread.sleep(2000);
        System.out.println("You hear a faint sound coming from the end of the hallway.");
        Thread.sleep(2000);
        System.out
                .println("It's ominous, almost sounding like heavy footsteps. Heavy breathing echoes in the distance.");
        Thread.sleep(2000);
        System.out.println("You feel a chill down your spine.");
        Thread.sleep(2000);
        System.out.println(
                "Every instinct in your memory-lacking body is telling you to run, or hide, or take some kind of action.");
        Thread.sleep(2000);
        System.out.println("What do you want to do?\n");
        Thread.sleep(2000);
        System.out.println("Welcome to the text adventure! Recognized commands are:\n");
        Thread.sleep(2000);
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway1Description() {
        return ("\nYou look around the hallway. To your right, you see a whiteboard, with what looks like writing on it as well as "
                +
                "a terrifying, horror looking drawing and some discourse about the ethics of using AI generated art. To your left there is an odd plant, "
                +
                "seemingly out of place as no computer science student even goes outside to know what a plant would look like. In front of you the hallway "
                +
                "stretches on, and you can hear noises coming from the dark abyss.\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway2Description() {
        return ("\nYou look around this hallway. To your right, you see a door with a locked code on it. Through the window you can see many computers. "
                +
                "Further down the hallway, it is still too dark to see, and ominous noises are still coming from down there.\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway3Description() {
        return ("\nYou look around this hallway. To your left, you can see the cs commons, this door does not appear to need a code to get in."
                +
                "Further down the hallway, it is still dark, but you start to see a human looking fuigure with a bald head.\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway4Description() {
        return ("\nYou look around this hallway. To your right, you can see a locked door that needs a code for entry, "
                +
                "You can start to see the human fuigure now, he appears to be wearing a blue raincoat, shorts, and sandals.\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway5Description() {
        return ("\nThe figure is right in front of you now! It is professor Osera, and he looks upset! He yells at you that you must become a computer science major "
                +
                "and turn in your declearation now! He starts to run at you, and just behind him you can see the stairs to leave this frightening floor. "
                +
                "Professor Osera is the only thing in your way from the escape! All you want to do is become a humanities major and spend the rest of your time at Grinnell in the "
                +
                "HSSC! In order to escape, you must defeat Osera! You must attack him to leave this nightmare!\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String commonsDescription() {
        return ("The commons are considerably more welcoming and well lit than the hallway.\n The veil of mist that seperates the commons from the hallway "
                +
                "humms behind you, a cool breeze on your back.\n A desk lies right next to you, filled with unfinished homework. There's a strange lump under the homework.\n"
                +
                "There are some health packs in the corner, and a marble statue of a long-forgotten professor. ");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String thirteenDescription() {
        return (" ");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String eighteenDescription() {
        return (" ");
    }

    /**
     * Main method to run the text adventure game.
     * 
     * @param args command line arguments
     * @throws InterruptedException if the thread is interrupted
     */
    public static void main(String[] args) throws InterruptedException {
        // wakeupMessage();
        // helpMessage();
        boolean hasKey = false;
        int waitStatus = 0;
        Room hallway1 = null, hallway2 = null, hallway3 = null, hallway4 = null, hallway5 = null, commons = null,
                thirty_eight_thirteen = null, thirty_eight_eighteen = null;
        hallway1 = new hallway1("hallway 1", null, new Room[] { hallway2 }, hallway1Description(), waitStatus,
                new Obstacle[] {}, null);
        hallway2 = new hallway2("hallway 2", null, new Room[] { hallway1, thirty_eight_thirteen, hallway3 },
                hallway2Description(), waitStatus, new Obstacle[] {}, null);
        hallway3 = new hallway3("hallway 3", null, new Room[] { hallway2, commons, hallway4 }, hallway3Description(),
                waitStatus, new Obstacle[] {}, null);
        hallway4 = new hallway4("hallway 4", null, new Room[] { hallway3, thirty_eight_eighteen, hallway5 },
                hallway4Description(), waitStatus, new Obstacle[] {}, null);
        hallway5 = new hallway5("hallway 5", null, new Room[] { hallway4 }, hallway5Description(), waitStatus,
                new Obstacle[] {}, null);
        commons = new commons("the commons", null, new Room[] { hallway3 }, commonsDescription(), waitStatus,
                new Obstacle[] {}, null);
        thirty_eight_thirteen = new thirty_eight_thirteen("3813", null, new Room[] { hallway2 }, thirteenDescription(),
                waitStatus, new Obstacle[] {}, null);
        thirty_eight_eighteen = new thirty_eight_eightteen("3818", null, new Room[] { hallway4 }, eighteenDescription(),
                waitStatus, new Obstacle[] {}, null);

        hallway1.setAdjacentRooms(new Room[] {hallway2, null, null, null});
        hallway2.setAdjacentRooms(new Room[] {hallway3, hallway1, null, thirty_eight_thirteen});
        hallway3.setAdjacentRooms(new Room[] {hallway4, hallway2, commons, null});
        hallway4.setAdjacentRooms(new Room[] {hallway5, hallway3, null, thirty_eight_eighteen});
        hallway5.setAdjacentRooms(new Room[] {null, hallway4, null, null});
        commons.setAdjacentRooms(new Room[] {null, hallway3, null, null});
        thirty_eight_thirteen.setAdjacentRooms(new Room[] {null, hallway2, null, null});
        thirty_eight_eighteen.setAdjacentRooms(new Room[] {null, hallway4, null, null});
        boolean running = true;

        String[] inventory = new String[20];
        int inventorySize = 0;
        Player player = new Player(100, inventory);
        Room currentRoom = hallway1;
        System.out.println(currentRoom.getLookAroundDescription());

        while (running) {
            System.out.println("current room:" + currentRoom.getName() + "\n");
                    currentRoom.printAdjacentRooms();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toLowerCase();
            if(inventorySize >= 18) {
                if (inventorySize >= 20) {
                    System.out.println("You feel the floor rumbling beneath you, but your pockets are somehow holding strong.\n");
                    Thread.sleep(2000);
                    System.out.println("The universe questions how you are even able to carry this much.");
                    Thread.sleep(2000);
                    System.out.println("Nevertheless, it tried to warn you... but you didn't listen.\n");
                    Thread.sleep(2000);
                    System.out.println("The floor instantly collapses beneath you, and you fall into an endless void.\n");
                    Thread.sleep(2000);
                    System.out.println("You are dead! or... you will be? Doesn't matter, GAME OVER!");
                    System.exit(0);
                }
                System.out.println("Your pockets are absolutely stuffed - how did you even get this much?");
                System.out.println("You can only pick up " + (19 - inventorySize) + " more item(s).");
                System.out.println("You have a strange feeling that if you pick up more than 19 items, " +
                        "you will fall through the floor and die. Just a hunch. I wouldn't test it.");
            }
            if (input.contains("wait")) {
                System.out.println("Waiting...");
                waitStatus++;
            } else if (input.contains("help")) {
                helpMessage();   
            } else if (input.contains("check") || input.contains("pocket") || input.contains("inventory")) {
                System.out.println("You check your pockets. You have the following items:");
                for (int i = 0; i < inventory.length; i++) {
                    if (inventory[i] != null) {
                        System.out.println(inventory[i]);
                    } 
                }
             } else if (input.contains("go")) {
                if (input.contains("forward") && currentRoom.getAdjacentRoomsIndex(0) != null) {
                    currentRoom = currentRoom.getAdjacentRoomsIndex(0);
                    System.out.println("\nYou are now in " + currentRoom.getName() + "\n");
                } else if (input.contains("backward") && currentRoom.getAdjacentRoomsIndex(1) != null) {
                    currentRoom = currentRoom.getAdjacentRoomsIndex(1);
                    System.out.println("\nYou are now in " + currentRoom.getName() + "\n");
                } else if (input.contains("right") && currentRoom.getAdjacentRoomsIndex(2) != null) {
                    currentRoom = currentRoom.getAdjacentRoomsIndex(2);
                    System.out.println("\nYou are now in " + currentRoom.getName() + "\n");
                } else if (input.contains("left") && currentRoom.getName().equals("hallway 3")) {
                    currentRoom = currentRoom.getAdjacentRoomsIndex(3);
                    System.out.println("\nYou are now in " + currentRoom.getName() + "\n");
                } else {
                    System.out.println("You can't go that way!");
                }
                System.out.println(currentRoom.getLookAroundDescription());
            } else if (input.contains("look")) {
                if (input.contains("whiteboard") && currentRoom.getName().equals("hallway")) {
                    System.out.println("A surpisingly clean whiteboard. It seems to be " +
                            "covered in some kind of unintelligible writing.\n It mentions something about " +
                            "how terrible and annoying documentation is. There's also a sequence of letters...?\n " +
                            "It reads 'IV, IX, VII, II'. Who left this here? It looks like a code of some kind.\n " +
                            "It also says 'If you haven't already, check your pockets!'\n This seems a lot less vague. " +
                            "If you haven't already, You can check your pockets by typing inventory!\n");
                }
                else if (input.contains("homework") && currentRoom.getName().equals("commons")) {
                    System.out.println("The homework is blank, but underneath is is something shiny! its a key!\n");
                }
                else if (input.contains("chalkboard") && currentRoom.getName().equals("hallway")) {
                    System.out.println("looking at chalkboard.");
                }
                else {
                    System.out.println("You look at it. It doesn't seem to be anything special. Or it doesn't exists in this room, maybe you made it up.\n");
                }
            } else if(input.contains("pick up")){
                if (input.contains("key") && currentRoom.getName().equals("commons")) {
                    System.out.println("You picked up the key!\n");
                    hasKey = true;
                    inventory[inventorySize] = "key";
                }
                else {

                }
            } else if (input.contains("attack")) {
                if (currentRoom.getName().equals("hallway5")) {
                    System.out.println("You attack the professor!\n");
                }
            }
            else {
                System.out.println("Invalid command! Type 'help' for a list of commands!");
            }
            
            // What should we do here? Are we going to give the user the freedom to go
            // back to any room?

            // Ideas: "patrolling professor" will patrol down the hallway, moving between
            // the squares in the room.
            // When you have reached a point of "confidence" you can win in a fight against
            // the professor, you will be
            // prompted. Maybe we can include a "confidence" mechanic? A funny play on stats
            // homework where you have a
            // confidence interval you can check to see if you can win the fight. You could
            // theoretically win at any point,
            // but it's beneficial to wait until you have a higher confidence level (as
            // stats improve).

            // The player can also hide behind objects in the room, which will give them a
            // chance to avoid being seen by the
            // professor. If the player waits a move when hidden, they can get a "sneak
            // attack" bonus when they attack the
            // professor. Or, they can wait a turn to see if the professor will leave the
            // room, which will give them a chance to escape.
            /*
             * Obstacle pottedPlant = new Obstacle("potted plant",
             * "A semi-large, potted plant. " +
             * "It's taller than you are, and covered in dirt. Its leaves are wilted," +
             * " but massive. You definitely could hide behind it.", true, false, true);
             * 
             * Obstacle whiteboard = new Obstacle("whiteboard",
             * "A surpisingly clean whiteboard. It seems to be " +
             * "covered in some kind of unintelligible writing.\n It mentions something about "
             * +
             * "how terrible and annoying documentation is. There's also a sequence of letters...?\n "
             * +
             * "It reads 'IV, IX, VII, II'. Who left this here? It looks like a code of some kind.\n "
             * +
             * "It also says 'If you haven't already, check your pockets!'\n This seems a lot less vague. "
             * +
             * "If you haven't already, I'd do that!",
             * false, false, false);
             * 
             * Obstacle hallway2door = new Obstacle("door",
             * "You look at the door a little more closely.\n" +
             * "It looks sturdy - breaking it would be impossible. There's a 3 by 3 keypad on the door, with numbers 1-9.\n"
             * +
             * "You feel like you've been in this room before. You've been through this door! Why? It feels familiar.\n"
             * +
             * "You feel like you should know the code to this door. Maybe someone left a clue?"
             * ,
             * false, false, false); // TODO: add a way to open the door - prompt the user
             * to enter a code?
             * 
             * Obstacle hallway4door = new Obstacle("lab door",
             * "You notice a door to your right. You feel an overwhelming sense of dread.\n"
             * +
             * "This one has a keypad too. However, it's a little different. There are two parts to the keypad, and a note on the door.\n"
             * +
             * "The note reads: 'I expect my research students to be the cream of the crop - this problem should be easy for you.\n"
             * +
             * "Crap... I don't remember being a research student. I don't even remember my name! But I know I want to get out of here.\n"
             * +
             * "You read the note more carefully. It says:" +
             * "" +
             * "Under the keypad, there's also what appears to be a coin slot. Interesting... do I have a coin?\n"
             * ,
             * false, false, false);
             * 
             * public void pickUpItem(Player player, String item) {
             * String[] items = getItems();
             * for (int i = 0; i < items.length; i++) {
             * if (items[i].equals(item)) {
             * System.out.println("You picked up " + item + ".");
             * this.removeItem(item); // Remove the item from the room
             * return;
             * }
             * }
             * System.out.println("Item not found in this room.");
             * }
             */
        }
    }
}
