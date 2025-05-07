public abstract class Room {
    private String name; // Name of the room
    private String[] items;
    private Room[] adjacentRooms; // Also a proxy for valid directions
    private String lookAroundDescription;
    private int waitStatus; // 0 : no wait.
    private Obstacle[] obstacles;
    private NPC npc;
    public Room(String name, String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        this.name = name;
        this.items = items;
        this.adjacentRooms = adjacentRooms;
        this.lookAroundDescription = lookAroundDescription;
        this.waitStatus = waitStatus;
        this.obstacles = obstacles;
        this.npc = npc;
    }
    public String getName() {
        return name;
    }
    public String[] getItems() {
        return items;
    }

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

    public Room[] getAdjacentRooms() {
        return adjacentRooms;
    }
    public Room getAdjacentRoomsIndex(int index) {
        if (index < 0 || index >= adjacentRooms.length) {
            throw new IndexOutOfBoundsException("you did not choose an index in inventory the array!"); // or throw an exception
        }
        return adjacentRooms[index];
    }
    public void setAdjacentRooms(Room[] adjacentRooms) {
        this.adjacentRooms = adjacentRooms;
    }
    public String getLookAroundDescription() {
        return lookAroundDescription;
    }
    public int getWaitStatus() {
        return waitStatus;
    }
    public Obstacle[] getObstacles() {
        return obstacles;
    }
    public NPC getNpc() {
        return npc;
    }
}
