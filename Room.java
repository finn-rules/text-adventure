public abstract class Room {
    private String[] items;
    private Room[] adjacentRooms; // Also a proxy for valid directions
    private String lookAroundDescription;
    private int waitStatus; // 0 : no wait.
    private Obstacle[] obstacles;
    private NPC npc;

    public Room(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        this.items = items;
        this.adjacentRooms = adjacentRooms;
        this.lookAroundDescription = lookAroundDescription;
        this.waitStatus = waitStatus;
        this.obstacles = obstacles;
        this.npc = npc;
    }
    public String[] getItems() {
        return items;
    }
    public Room[] getAdjacentRooms() {
        return adjacentRooms;
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
