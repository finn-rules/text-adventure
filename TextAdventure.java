import java.util.Scanner;

public class TextAdventure {

    public static void helpMessage() {
        System.out.println("Wait: wait in the room for one turn\n" +
                        "Go <direction>: go in the given cardinal direction, e.g., north or south\n" +
                        "Talk to <object>: talk to the given object found in the room\n" +
                        "Pick up <item>: pick up the given item found in the room\n" +
                        "Use <item>: use the given item found in the player's inventory\n" +
                        "Attack <object>: attack the given object found in the room\n" +
                        "Look at <object>: look at the given object found in the room\n" +
                        "Check pocket/pockets/inventory: check the player's inventory for items\n" +
                        "Hide behind <object>: attempt to hide behind the given object found in the room\n" +
                        "help: show this help message\n" +
                        "quit: quit the game.");
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Dazed and confused, you find yourself in a dark hallway.");
        Thread.sleep(2500);
        System.out.println("You try to remember how you got here, but your mind is blanking. What's my name...? Where am I...?");
        Thread.sleep(2500);
        System.out.println("Damn it, what's going on? Why don't I remember anything?");
        Thread.sleep(2500);
        System.out.println("You hear a faint sound coming from the end of the hallway.");
        Thread.sleep(2500);
        System.out.println("It's ominous, almost sounding like heavy footsteps. Heavy breathing echoes in the distance.");
        Thread.sleep(2500);
        System.out.println("You feel a chill down your spine.");
        System.out.println("Every instinct in your memory-lacking body is telling you to run, or hide, or take some kind of action.");
        Thread.sleep(2500);
        System.out.println("What do you want to do?");
        System.out.println("Welcome to the text adventure! Recognized commands are:");
        Thread.sleep(2500);
        helpMessage();
        boolean running = true;
        while (running) {
            Scanner scanner = new Scanner(System.in);

        }

    }   
}
