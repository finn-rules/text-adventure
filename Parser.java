public class Parser {
    private static final String[] VALID_COMMANDS = {
        "go", "pick up", "use", "attack", "look around", "look at", "check", "hide behind", "help", "quit"
    };

    public static boolean isValidCommand(String command) {
        for (String validCommand : VALID_COMMANDS) {
            if (validCommand.equalsIgnoreCase(command)) {
                return true;
            }
        }
        return false;
    }

    public static String getCommand(String input) {
        String[] parts = input.split(" ");
        return parts[0];
    }

    public static String getArgument(String input) {
        String[] parts = input.split(" ");
        if(parts[1].equalsIgnoreCase("at") || parts[1].equalsIgnoreCase("behind")) {
            return parts[2];
        }
        if (parts.length > 1) {
            return parts[1];
        }
        return null;
    }
}
