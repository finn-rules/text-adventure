/**
 * makes room
 */
public abstract class Room {
    private String name; // Name of the room
    private String[] items;
    private Room[] adjacentRooms; // Also a proxy for valid directions
    private String lookAroundDescription;
    private int waitStatus; // 0 : no wait.
    private Obstacle[] obstacles;
    private NPC npc;
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
     */
    public Room(String name, String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        this.name = name;
        this.items = items;
        this.adjacentRooms = adjacentRooms;
        this.lookAroundDescription = lookAroundDescription;
        this.waitStatus = waitStatus;
        this.obstacles = obstacles;
        this.npc = npc;
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
    public String[] getItems() {
        return items;
    }

    /**
     * removes item from room
     * @param item item to remove
     */
    public void removeItem(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                items[i] = null; // Remove the item
                System.out.println("You removed " + item + " from the room.");
                return;
            }
        }
        System.out.println("Item not found in this room.");
    }

    /**
     * gets the adjacent rooms
     * @return adjacent rooms
     */
    public Room[] getAdjacentRooms() {
        return adjacentRooms;
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
    public NPC getNpc() {
        return npc;
    }
}
