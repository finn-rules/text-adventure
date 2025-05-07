import java.util.Scanner;

public class TextAdventure {

    public static void helpMessage() throws InterruptedException {
        System.out.println("Wait: wait in the room for one turn\n" +
                        "Go <direction>: go in the given cardinal direction, e.g., north, south, east, west.\n" +
                        "Talk to <object>: talk to the given object found in the room\n" +
                        "Pick up <item>: pick up the given item found in the room\n" +
                        "Use <item>: use the given item found in the player's inventory\n" +
                        "Attack <object>: attack the given object found in the room\n" +
                        "Look at <object>: look at the given object found in the room\n" +
                        "Check pocket/pockets/inventory: check the player's inventory for items\n" +
                        "Hide behind <object>: attempt to hide behind the given object found in the room\n" +
                        "help: show this help message\n" +
                        "quit: quit the game.");
                        Thread.sleep(2000);
    }

    public static void wakeupMessage() throws InterruptedException {
        System.out.println("Dazed and confused, you find yourself in a dark hallway.");
        Thread.sleep(2000);
        System.out.println("You try to remember how you got here, but your mind is blanking. What's my name...? Where am I...?");
        Thread.sleep(2000);
        System.out.println("Damn it, what's going on? Why don't I remember anything?");
        Thread.sleep(2000);
        System.out.println("You hear a faint sound coming from the end of the hallway.");
        Thread.sleep(2000);
        System.out.println("It's ominous, almost sounding like heavy footsteps. Heavy breathing echoes in the distance.");
        Thread.sleep(2000);
        System.out.println("You feel a chill down your spine.");
        Thread.sleep(2000);
        System.out.println("Every instinct in your memory-lacking body is telling you to run, or hide, or take some kind of action.");
        Thread.sleep(2000);
        System.out.println("What do you want to do?");
        Thread.sleep(2000);
        System.out.println("Welcome to the text adventure! Recognized commands are:");
        Thread.sleep(2000);
    }

    public static String hallway1Description() {
        return("/nYou look around the hallway. To your right, you see a whiteboard, with what looks like writing on it as well as " +
        "a terrifying, horror looking drawing and some discourse about the ethics of using AI generated art. To your left there is an odd plant, " +
        "seemingly out of place as no computer science student even goes outside to know what a plant would look like. In front of you the hallway " +
        "stretches on, and you can hear noises coming from the dark abyss./n");
    }
    public static String hallway2Description() {
        return("/nYou look around this hallway. To your right, you see a door with a locked code on it. Through the window you can see many computers. " + 
        "Further down the hallway, it is still too dark to see, and ominous noises are still coming from down there./n");
    }
    public static String hallway3Description() {
        return("/nYou look around this hallway. To your left, you can see the cs commons, this door does not appear to need a code to get in." + 
        "Further down the hallway, it is still dark, but you start to see a human looking fuigure with a bald head./n");
    }
    public static String hallway4Description() {
        return("/nYou look around this hallway. To your right, you can see a locked door that needs a code for entry, " + 
        "You can start to see the human fuigure now, he appears to be wearing a blue raincoat, shorts, and sandals./n");
    }
    public static String hallway5Description() {
        return("/nThe figure is right in front of you now! It is professor Osera, and he looks upset! He yells at you that you must become a computer science major " + 
        "and turn in your declearation now! He starts to run at you, and just behind him you can see the stairs to leave this frightening floor. " + 
        "Professor Osera is the only thing in your way from the escape! All you want to do is become a humanities major and spend the rest of your time at Grinnell in the " + 
        "HSSC! In order to escape, you must defeat Osera! You must attack him to leave this nightmare!/n");
    }
    public static String commonsDescription() {
        return(" ");
    }
    public static String thirteenDescription() {
        return(" ");
    }
    public static String eighteenDescription() {
        return(" ");
    }

    public static void main(String[] args) throws InterruptedException {
        wakeupMessage();
        helpMessage();

        int waitStatus = 0;
        Room hallway1 = null, hallway2 = null, hallway3 = null, hallway4 = null, hallway5 = null, commons = null, thirty_eight_thirteen = null, thirty_eight_eighteen = null;
        hallway1 = new hallway1(null, new Room[]{hallway2}, hallway1Description(), waitStatus, new Obstacle[]{}, null);
        hallway2 = new hallway2(null, new Room[]{hallway1, thirty_eight_thirteen, hallway3}, hallway2Description(), waitStatus, new Obstacle[]{}, null);
        hallway3 = new hallway3(null, new Room[]{hallway2, commons, hallway4}, hallway3Description(), waitStatus, new Obstacle[]{}, null);
        hallway4 = new hallway4(null, new Room[]{hallway3, thirty_eight_eighteen, hallway5}, hallway4Description(), waitStatus, new Obstacle[]{}, null);
        hallway5 = new hallway5(null, new Room[]{hallway4}, hallway5Description(), waitStatus, new Obstacle[]{}, null);
        commons = new commons(null, new Room[]{hallway3}, commonsDescription(), waitStatus, new Obstacle[]{}, null);
        thirty_eight_thirteen = new thirty_eight_thirteen(null, new Room[]{hallway2}, thirteenDescription(), waitStatus, new Obstacle[]{}, null);
        thirty_eight_eighteen = new thirty_eight_eightteen(null, new Room[]{hallway4}, eighteenDescription(), waitStatus, new Obstacle[]{}, null);
        
        boolean running = true;

        Room currentRoom = hallway1; 
        System.out.println(currentRoom.getLookAroundDescription());

        while (running) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            

            // What should we do here? Are we going to give the user the freedom to go
            // back to any room?

            // Ideas: "patrolling professor" will patrol down the hallway, moving between the squares in the room.
            // When you have reached a point of "confidence" you can win in a fight against the professor, you will be
            // prompted. Maybe we can include a "confidence" mechanic? A funny play on stats homework where you have a
            // confidence interval you can check to see if you can win the fight. You could theoretically win at any point,
            // but it's beneficial to wait until you have a higher confidence level (as stats improve). 

            // The player can also hide behind objects in the room, which will give them a chance to avoid being seen by the
            // professor. If the player waits a move when hidden, they can get a "sneak attack" bonus when they attack the
            // professor. Or, they can wait a turn to see if the professor will leave the room, which will give them a chance to escape.
            
    }   
}
}
