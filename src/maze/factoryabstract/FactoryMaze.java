package maze.factoryabstract;

import maze.base.Door;
import maze.base.Maze;
import maze.base.Room;
import maze.base.Wall;

public class FactoryMaze {
	Maze makeMaze () { return new Maze(); }
	Wall makeWall () { return new Wall(); }
	Room makeRoom (int n) { return new Room(n); }
	Door makeDoor (Room r1, Room r2) { return new Door(r1, r2); }
}
