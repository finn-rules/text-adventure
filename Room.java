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

class thirty_eight_thirteen  extends Room {
    public thirty_eight_thirteen(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        super(items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc);
    }
}

class thirty_eight_eightteen  extends Room {
    public thirty_eight_eightteen(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        super(items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc);
    }
}

class commons extends Room {
    public commons(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        super(items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc);
    }
}

class hallway1 extends Room {
    public hallway1(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        super(items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc);
    }
}

class hallway2 extends Room {
    public hallway2(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        super(items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc);
    }
}

class hallway3 extends Room {
    public hallway3(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        super(items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc);
    }
}

class hallway4 extends Room {
    public hallway4(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        super(items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc);
    }
}

class hallway5 extends Room {
    public hallway5(String[] items, Room[] adjacentRooms, String lookAroundDescription, int waitStatus, Obstacle[] obstacles, NPC npc) {
        super(items, adjacentRooms, lookAroundDescription, waitStatus, obstacles, npc);
    }
}