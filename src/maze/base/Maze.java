package maze.base;

import java.util.HashMap;
import java.util.Map;

public class Maze{
	Map<Integer, Room> roomsMap = new HashMap<Integer, Room>();
	
	public Maze() {}
	public void addRoom (Room room) {
		this.roomsMap.put(room.getRoomNumber(), room);
	}
	Room RoomNumber(int n) { 
		return this.roomsMap.get(n);
	}
}
