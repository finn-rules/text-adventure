public abstract class Room {
    private String[] items;
    private Room[] adjacentRooms; // Also a proxy for valid directions
    private String lookAroundDescription;
    private int waitStatus; // 0 : no wait.
    private Obstacle[] obstacles;
    private NPC npc;
}
