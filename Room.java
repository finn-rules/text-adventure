/**
 * makes room
 */
public abstract class Room {
    private String name; // Name of the room
    private Item[] items;
    private Room[] adjacentRooms; // Also a proxy for valid directions
    private String lookAroundDescription;
    private int waitStatus; // 0 : no wait.
    private Obstacle[] obstacles;
    private NPC npc;
    private boolean hasDoor;
    private Door door;
    /**
     * Constructor for the Room class.
     *
     * @param name                 The name of the room.
     * @param items                The items in the room.
     * @param adjacentRooms        The adjacent rooms (valid directions).
     * @param lookAroundDescription The description when looking around the room.
     * @param waitStatus           The wait status of the room (0: no wait).
     * @param obstacles            The obstacles in the room.
     * @param npc                 The NPC in the room.
     * @param door                The door in the room.
     */
    public Room(String name, Item[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc, Door door) {
        this.name = name;
        this.items = items;
        this.adjacentRooms = adjacentRooms;
        this.lookAroundDescription = lookAroundDescription;
        this.waitStatus = waitStatus;
        this.obstacles = obstacles;
        this.npc = npc;
        if (door != null) {
            this.hasDoor = true;
            this.door = door;
        } else {
            this.hasDoor = false;
            this.door = null;
        }
    }

    public Room(String name, Item[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        this.name = name;
        this.items = items;
        this.adjacentRooms = adjacentRooms;
        this.lookAroundDescription = lookAroundDescription;
        this.waitStatus = waitStatus;
        this.obstacles = obstacles;
        this.npc = npc;
        this.hasDoor = false;
        this.door = null;
    }


    /**
     * gets name of room
     * @return name of room
     */
    public String getName() {
        return name;
    }

    /**
     * gets items in room
     * @return items in room
     */
    public Item[] getItems() {
        return items;
    }

    /**
     * set items in room
     * @param items : the items to place in the room
     */
    public void setItems(Item[] items) {
        this.items = items;
    }

    /**
     * removes item from room
     * @param item item to remove
     */
    public void removeItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                items[i] = null; // Remove the item
                System.out.println("You removed " + item + " from the room.");
                return;
            }
        }
        System.out.println("Item not found in this room. Maybe you already picked it up, or removed it?");
    }

    /**
     * gets the adjacent rooms
     * @return adjacent rooms
     */
    public Room[] getAdjacentRooms() {
        return adjacentRooms;
    }

    /**
     * gets the name of the adjacent rooms
     * @return names of adjacent rooms
     */
    public void printAdjacentRooms() {
        System.out.println("Adjacent rooms:");
        for (int i = 0; i < adjacentRooms.length; i++) {
            if (adjacentRooms[i] == null) {
                System.out.println("Index " + i + " has no room!");
                continue;
            }
            System.out.println((i + 1) + ": " + adjacentRooms[i].getName());
        }
    }

    /**
     * gets the adjacent rooms index
     * @param index index of adjacent room
     * @return adjacent room at index
     */
    public Room getAdjacentRoomsIndex(int index) {
        if (index < 0 || index >= adjacentRooms.length) {
            throw new IndexOutOfBoundsException("you did not choose an index in inventory the array!"); // or throw an exception
        }
        return adjacentRooms[index];
    }

    /**
     * sets the adjacent rooms
     * @param adjacentRooms array of adjacent rooms
     */
    public void setAdjacentRooms(Room[] adjacentRooms) {
        this.adjacentRooms = adjacentRooms;
    }

    /**
     * gets the description for the room when looking around
     * @return description
     */
    public String getLookAroundDescription() {
        return lookAroundDescription;
    }

    /**
     * gets the wait status
     * @return wait status
     */
    public int getWaitStatus() {
        return waitStatus;
    }

    /**
     * gets the obstacles in the room
     * @return obstacles in the room
     */
    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }


    public NPC getNpc() {
        return npc;
    }
    public void setNpc(NPC npc) {
        this.npc = npc;
    }

    /**
     * examines the target
     * @param parsedInput the string to investigate
     */
    public void examineTarget(String parsedInput) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equalsIgnoreCase(parsedInput)) {
                System.out.println(items[i].getDescription());
                // In the classes, we may want to override this method to add more functionality
                return;
            }
        }
        for (int i = 0; i < obstacles.length; i++) {
            if (obstacles[i] != null && obstacles[i].getName().equalsIgnoreCase(parsedInput)) {
                System.out.println(obstacles[i].getDescription());
                return;
            }
        }
        if (npc != null && npc.getName().equalsIgnoreCase(parsedInput)) {
            System.out.println(npc.getDescription());
            return;
        }
        System.out.println("You don't see that here. Maybe check your spelling?");
    }

    public void pickUpItem(String itemName, Player player) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equalsIgnoreCase(itemName)) {
                System.out.println("You picked up " + items[i].getName() + ".");
                items[i] = null; // Remove the item from the room's item array
                return;
            }
        }
        System.out.println("Item not found in this room. Maybe you already picked it up, or mistyped?");
    }

    public boolean hasDoor() {
        return hasDoor;
    }
    public Door getDoor() {
        return door;
    }
    public void unlockDoor() {
        if (hasDoor) {
            door.unlockAtt();
        } else {
            System.out.println("There is no door in this room.");
        }
    }

}
