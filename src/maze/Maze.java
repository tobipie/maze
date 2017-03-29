package maze;

import java.util.HashMap;
import java.util.Map;

public class Maze{
	Map<Integer, Room> roomsMap = new HashMap<Integer, Room>();
	
	Maze() {}
	void addRoom (Room room) {
		this.roomsMap.put(room.getRoomNumber(), room);
	}
	Room RoomNumber(int n) { 
		return this.roomsMap.get(n);
	}
}
