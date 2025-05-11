import java.util.ArrayList;
import java.util.Scanner;

/*
 * text adventure 
 */
public class TextAdventure {

    /**
     * Returns the index of the pattern based on the given integer.
     * Allows for Osera to patrol the hallway in a specific pattern, since there are
     * 5 hallway "tiles".
     * 
     * @param i : the index to return in the sequence
     * @return : the index of the pattern
     */
    public static int patternIndex(int i) {
        int pos = i % 8;
        int[] sequenceElts = { 0, 1, 2, 3, 4, 3, 2, 1 };
        return sequenceElts[pos];
    }

    /**
     * Displays a help message with the available commands in the game.
     * 
     * @throws InterruptedException if the thread is interrupted
     */
    public static void helpMessage() throws InterruptedException {
        System.out.println("Wait: wait in the room for one turn\n" +
                "Go <direction>: go in the given cardinal direction, e.g., forward, backward, left, right.\n" +
                "Pick up <item>: pick up the given item found in the room\n" +
                "Use <item>: use the given item found in the player's inventory\n" +
                "Attack <object>: attack the given object found in the room\n" +
                "Look around: look around the room.\n" +
                "Look at <object>: look at the given object found in the room\n" +
                "Check pocket/pockets/inventory: check the player's inventory for items\n" +
                "Hide behind <object>: attempt to hide behind the given object found in the room\n" +
                "help: show this help message\n" +
                "quit: quit the game.\n");
        Thread.sleep(2000);
    }

    /**
     * Prints the position of Osera in the hallway.
     * 
     * @param position the position of Osera (0-4, representing distance from
     *                 player)
     */
    public static void printHallOseraPos(int position) {
        if (position == 0) {
            System.out.println("The foreboding figure is right in front of you... prepare for combat, or flee!\n" +
                    "Professor Osera lets out a deafening roar... 'I know Jiu Jitsu!'\n");
        } else if (position == 1) {
            System.out.println("The foreboding figure is close... you can see his bald head, and sandals.\n" +
                    "He exclaims 'you WILL be a CS major! Over my (or your) dead body!'");
        } else if (position == 2) {
            System.out.println("The foreboding figure is two squares away from you.");
        } else if (position == 3) {
            System.out.println("The foreboding figure is towards the other end of the hallway.");
        } else if (position == 4) {
            System.out.println(
                    "The foreboding figure is at the other end of the hallway. You feel like you're safe... for now.");
        }
    }

    /**
     * Prints the position of Osera when the player is safe in a side room.
     * 
     * @param position the position of Osera (0-4, representing distance from
     *                 player)
     */
    public static void printRoomOseraPos(int position) {
        if (position == 0) {
            System.out.println("You don't even have to peek out the door's window. Osera's face is right outside!\n" +
                    "You can hear his yell through the door, my goodness!\n" +
                    "He says 'If you step outside, you will be in a world of pain!'\n" +
                    "'I haven't drop kicked a humanities major in a week!'\n" +
                    "You have a feeling that if you wait a few turns, he will probably continue to pace.\n" +
                    "You can hear him mumbling about how he needs to get a new pair of sandals.\n");
        } else if (position == 1) {
            System.out.println(
                    "The foreboding figure is close, you can see him about to step outside the room you're hiding in.\n"
                            +
                            "He know's you're in here! But you feel like you might be able to make a break for it.\n" +
                            "(If you're a risk taker). You're safe for now if you stay in the room.\n");
        } else if (position == 2) {
            System.out.println("You can hear the foreboding figure getting closer to your room.\n" +
                    "However, you feel safe for now. You might be able to make a break for it.\n");
        } else if (position == 3) {
            System.out.println("You can just barely hear the foreboding figure's footsteps.\n" +
                    "You feel like you're safe to step out of the room, if you're done here.");
        } else if (position == 4) { // This case won't happen rooms for now are only a max of 3 away from Osera.
            System.out.println(
                    "How did you get to this room? That's weird. Whatever cheating you're doing, the universe doesn't like it.\n"
                            +
                            "Something called the 'programmer' is going to be very upset.\n" +
                            "It's not your fault, but the choices you made lead to your demise.\n");
            System.out.println("GAME OVER (bugged ending).");
            System.exit(0);
        }
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
        return ("\nYou look around the hallway.\n To your right, you see a whiteboard, with what looks like writing on it\n as well as "
                +
                "a terrifying, horror looking drawing and some discourse about the ethics of using AI generated art.\n To your left there is an odd potted plant, "
                +
                "seemingly out of place...\n as no computer science student even goes outside to know what a plant would look like.\n In front of you the hallway "
                +
                "stretches on, and you can hear noises coming from the dark abyss.\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway2Description() {
        return ("\nYou look around this hallway. To your right, you see a door with a locked code on it. Through the window you can see many computers.\n " +
                "Other than that, there's nothing special. The hallway stretches on, and is dark and ominous.\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway3Description() {
        return ("\nYou look around this hallway.\n To your left, you can see the cs commons, with a veil of mist separating the two rooms.\n " +
                "You feel warm, and safe to enter the commons if you want.\nThere's a health pack in the corner.");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway4Description() {
        return ("\nYou look around this hallway.\n To your right, you can see a locked door that also needs a code for entry, and a key.\n" +
                "The door has a post it note? It might be worth investigating.\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String hallway5Description() {
        return ("You've finally reached the end of the hallway. A golden, familiar looking head statue sits in front of you.\n" +
                "On it, there's a plaque that reads 'The Head of the CS department'.\n" +
                "...really? It's Osera's head. He's got a good sense of humor, but is this really where our tuition money is going?\n" +
                "You can see a door to your left! It's the exit! It's locked, with a massive golden padlock.\n" +
                "Certainly a massive golden padlock needs a massive golden key.\n" +
                "Golden statue... golden padlock... golden key... oh god, do I need to defeat Osera to get out of here?\n");
    }

    /**
     * Description of the rooms in the game.
     * 
     * @return description of the room
     */
    public static String commonsDescription() {
        return ("The commons are considerably more welcoming and well lit than the hallway.\n The veil of mist that seperates the commons from the hallway "
                +
                "humms behind you, a cool breeze on your back.\n A desk lies right next to you, filled with unfinished homework.\n There's a strange lump under the homework.\n"
                +
                "There are two health packs in the corner, and a marble statue of a long-forgotten professor.\n");
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

    public static String oseraDescription() {
        return ("You finally get a good glimpse at this figure that has been haunting you.\n" +
                "It is a professor, named Professor Osera. He is wearing a bright blue raincoat, shorts, and sandals.\n"
                +
                "He looks like he is about to attack you, and you can see a glint of something in his hand.\n" +
                "It's a sword from a game called Diablo 3. You can see the name 'Osera' engraved on the blade.\n" +
                "You know you have to defeat him to escape this nightmare, " +
                "but you feel like you should prepare and get stronger. Are you strong enough to defeat him?\n");
    }

    /**
     * Main method to run the text adventure game.
     * 
     * @param args command line arguments
     * @throws InterruptedException if the thread is interrupted
     */
    public static void main(String[] args) throws InterruptedException {
        // wakeupMessage();
        helpMessage();
        boolean hasKey = false;
        int waitStatus = 4;
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

        hallway1.setAdjacentRooms(new Room[] { hallway2, null, null, null });
        hallway2.setAdjacentRooms(new Room[] { hallway3, hallway1, null, thirty_eight_thirteen });
        hallway3.setAdjacentRooms(new Room[] { hallway4, hallway2, commons, null });
        hallway4.setAdjacentRooms(new Room[] { hallway5, hallway3, null, thirty_eight_eighteen });
        hallway5.setAdjacentRooms(new Room[] { null, hallway4, null, null });
        commons.setAdjacentRooms(new Room[] { null, hallway3, null, null });
        thirty_eight_thirteen.setAdjacentRooms(new Room[] { null, hallway2, null, null });
        thirty_eight_eighteen.setAdjacentRooms(new Room[] { null, hallway4, null, null });

        Obstacle pottedPlant = new Obstacle("potted plant",
                "A semi-large, potted plant. " +
                        "It's taller than you are, and covered in dirt. Its leaves are wilted," +
                        " but massive. You definitely could hide behind it.",
                true, false, false);

        Obstacle marbleStatue = new Obstacle("marble statue",
                "A marble statue of a long-forgotten professor. You inspect it closer...\nBut you have no idea who this is.\n They are, after all, a CS professor. What do they even do?\n",
                false, false, false);
        Obstacle desk = new Obstacle("desk",
                "A desk filled with unfinished homework. You can see a strange lump under the homework.\n" +
                        "It's... key shaped, if that helps. Maybe pick up the homework?\n",
                false, false, false);
        Obstacle whiteboard = new Obstacle("whiteboard",
                "A surpisingly clean whiteboard. It seems to be " +
                        "covered in some kind of unintelligible writing.\n It mentions something about "
                        +
                        "how terrible and annoying documentation is. There's also a sequence of letters...?\n "
                        +
                        "It reads 'IV, IX, VII, II'. Who left this here? It looks like a code of some kind.\n "
                        +
                        "It also says 'If you haven't already, check your pockets!'\n This seems a lot less vague. "
                        +
                        "If you haven't already, I'd do that!",
                false, false, false);
        Door hallway2door = new Door("door",
                "You look at the door a little more closely.\n" +
                        "It looks sturdy - breaking it would be impossible. There's a 3 by 3 keypad on the door, with numbers 1-9.\n"
                        +
                        "You feel like you've been in this room before. You've been through this door! Why? It feels familiar.\n"
                        +
                        "You feel like you should know the code to this door. Maybe someone left a clue?",
                 false, false, true, "4972");
        Door hallway4door = new Door("lab door",
                "You notice a door to your right. You feel an overwhelming sense of dread.\n"
                        +
                        "This one has a keypad too. However, it's a little different. There are two parts to the keypad, and there's a note on the door.\n"
                        +
                        "The note reads: 'I expect my research students to be the cream of the crop - this problem should be easy for you.\n"
                        +
                        "Crap... I don't remember being a research student. I don't even remember my name! But I know I want to get out of here.\n"
                        +
                        "You read the note more carefully. It says: the code for the door is the amount of bits a character normally takes, 4 times.\n"
                        +
                        "Under the keypad, there's also what appears to be a key. Interesting... do I have a key? There must be one somewhere...\n",
                false, false, true, "key");

        Door exitDoor = new Door("exit door",
                "You look at the exit door. It looks like it could be opened with a golden key.\n" +
                "So close... maybe Osera has the key?\n",
                false, false, true, "golden key");   
        KeyItem key = new KeyItem("key",
                "A key that looks like it could open a lab door. It has a strange symbol on it.\n It looks like a sideways infinity symbol... and a C?",
                true, "You put the key in the keyhole of the lab door, turn, and hear a click. Nice!",
                0, 0, 0, false, hallway4);

        KeyItem goldenKey = new KeyItem("golden key",
                "A golden key that looks like it can open the exit door.\nIt has some blood on it. You feel guilty... but this was the only way, right?",
                true, "You put the golden key in the keyhole of the exit door, turn, and hear a click. Nice!",
                0, 0, 0, false, hallway5);

        Item healthPack = new Item("health pack",
                "A health pack that looks like it could heal you. There's a smiley face, with words of affirmation written in binary. How can I read this?",
                true, "You feel warmth fall over you as you devour the health pack.", 0, 50, 0, true);

        NPC osera = new NPC("Osera", 100, new Item[] { key }, oseraDescription(), 10);
        // Set items, obstacles and the NPC here.

        boolean running = true;

        ArrayList<Item> inventory = new ArrayList<>();
        Player player = new Player(100, 0, inventory, 20);
        Room currentRoom = hallway1;
        Room[] hallwayRooms = { hallway1, hallway2, hallway3, hallway4, hallway5 };

        while (running) {
            System.out.println("Current room:" + currentRoom.getName() + "\n");
            int effectiveOseraPosition = patternIndex(waitStatus);
            currentRoom.printAdjacentRooms();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toLowerCase();
            hallwayRooms[patternIndex(waitStatus)].setNpc(osera); // Set the NPC in the current waitstatus's room
            System.out.println("You are currently at " + player.getEffectiveHallwayPosition() + "\n" +
                    "Osera is currently at " + effectiveOseraPosition + "\n");
            if (input.contains("quit")) {
                System.out.println("Thanks for playing! Goodbye!");
                running = false;
                scanner.close();
                System.exit(0);
            }
            if (waitStatus == player.getEffectiveHallwayPosition()) {
                System.out.println("You have encountered Professor Osera!\n" +
                        "Misstep or not, he's ready to fight... this will be hard to avoid!\n");
                System.out.println("You can attack him! But do you feel strong enough? That's your call!\n");
                System.out.println("Would you rather be dead, or a CS major? That's a tough question.\n");
                CombatSituation combat = new CombatSituation(player, osera);
            }
            if (player.getInventory().size() >= 18) {
                if (player.getInventory().size() >= 20) {
                    System.out.println(
                            "You feel the floor rumbling beneath you, but your pockets are somehow holding strong.\n");
                    Thread.sleep(2000);
                    System.out.println("The universe questions how you are even able to carry this much.");
                    Thread.sleep(2000);
                    System.out.println("Nevertheless, it tried to warn you... but you didn't listen.\n");
                    Thread.sleep(2000);
                    System.out
                            .println("The floor instantly collapses beneath you, and you fall into an endless void.\n");
                    Thread.sleep(2000);
                    System.out.println("You are dead! Or... you will be? Doesn't matter, GAME OVER!");
                    System.exit(0);
                }
                System.out.println("Your pockets are absolutely stuffed - how did you even get this much?");
                System.out.println("You can only pick up " + (19 - player.getInventory().size()) + " more item(s).");
                System.out.println("You have a strange feeling that if you pick up more than 19 items, " +
                        "you will fall through the floor and die. Just a hunch. I wouldn't test it.");
            }
            if (input.contains("wait")) {
                System.out.println("Waiting...");
                hallwayRooms[patternIndex(waitStatus)].setNpc(null); // Clear the NPC from the current waitstatus's room, 
                // it'll move in a new iteration of the loop
                waitStatus++; // we need a way to track Osera's position.
                player.setCurHealth(player.getCurHealth() + 5);
                osera.setCurHealth(osera.getCurHealth() + 5);
                continue;
            } else if (input.contains("help")) {
                helpMessage();
                continue;
            } else if (input.contains("check") || input.contains("pocket") || input.contains("inventory")) {
                System.out.println("You check your pockets. You have the following items:");
                for (int i = 0; i < inventory.size(); i++) {
                    if (inventory.get(i) != null) {
                        System.out.println(inventory.get(i).getName());
                    }
                }
            } else if (input.contains("go")) {
                player.setPlayerHidden(false);
                if (input.contains("forward") && currentRoom.getAdjacentRoomsIndex(0) != null) {
                    currentRoom = currentRoom.getAdjacentRoomsIndex(0);
                    System.out.println("\nYou are now in " + currentRoom.getName() + "\n");
                } else if (input.contains("backward") && currentRoom.getAdjacentRoomsIndex(1) != null) {
                    currentRoom = currentRoom.getAdjacentRoomsIndex(1);
                    System.out.println("\nYou are now in " + currentRoom.getName() + "\n");
                } else if (input.contains("right") && currentRoom.getAdjacentRoomsIndex(2) != null) {
                    currentRoom = currentRoom.getAdjacentRoomsIndex(2);
                    System.out.println("\nYou are now in " + currentRoom.getName() + "\n");
                } else if (input.contains("left") && currentRoom.getAdjacentRoomsIndex(3) != null) {
                    currentRoom = currentRoom.getAdjacentRoomsIndex(3);
                    System.out.println("\nYou are now in " + currentRoom.getName() + "\n");
                } else {
                    System.out.println(
                            "You can't go that way! If you were hidden, your attempt to go somewhere ruined your hiding spot!\n");
                }
                System.out.println(currentRoom.getLookAroundDescription());
                continue;
            } else if (input.contains("look")) { // how can I change this to a more abstract version?
                if (input.contains("around")) {
                    System.out.println(currentRoom.getLookAroundDescription());
                    if (currentRoom.getName().contains("hallway")) {
                        printHallOseraPos(Math.abs(player.getEffectiveHallwayPosition() - waitStatus));
                        continue;
                    } else {
                        printRoomOseraPos(Math.abs(player.getEffectiveHallwayPosition() - waitStatus));
                        continue;
                    }
                }
                String inputItem = input.split(" ")[2]; // Parser here?
                for (int i = 0; i < currentRoom.getItems().length; i++) {
                    if (currentRoom.getItems()[i].getDescription().contains(inputItem)) {
                        System.out.print("You look at the " + inputItem + ". ");
                        System.out.println(currentRoom.getItems()[i].getDescription());
                        break;
                    }
                }
            } else if (input.contains("pick up")) {
                if (input.contains("key") && currentRoom.getName().equals("commons")) {
                    System.out.println("You picked up the key!\n");
                    hasKey = true;
                    // inventory[inventorySize] = "placeholder"; // for now , will fix
                } else {

                }
            } else if (input.contains("attack")) {
                if (currentRoom.getName().equals("hallway5")) {
                    System.out.println("You attack the professor!\n");
                }
            } else {
                System.out.println("Invalid command! Type 'help' for a list of commands!");
            }

            // What should we do here? Are we going to give the user the freedom to go
            // back to any room?

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
