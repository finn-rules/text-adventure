/**
 * represents commons
 */
public class commons extends Room {
    public commons(String name, Item[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc, Door door) {
        super(name, items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc, door);
    }
}
