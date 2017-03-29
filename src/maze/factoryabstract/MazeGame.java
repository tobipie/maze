package maze.factoryabstract;

import maze.base.Direction;
import maze.base.Door;
import maze.base.Maze;
import maze.base.Room;

public class MazeGame {
	Maze createMaze (FactoryMaze fm) {
		Maze aMaze = fm.makeMaze();
		Room r1 = fm.makeRoom(1);
		Room r2 = fm.makeRoom(2);
		Door aDoor = fm.makeDoor(r1, r2);
		
		aMaze.addRoom(r1);
		aMaze.addRoom(r2);
		
		r1.setSide(Direction.NORTH, fm.makeWall());
		r1.setSide(Direction.EAST, aDoor);
		r1.setSide(Direction.SOUTH, fm.makeWall());
		r1.setSide(Direction.WEST, fm.makeWall());
		r2.setSide(Direction.NORTH, fm.makeWall());
		r2.setSide(Direction.EAST, fm.makeWall());
		r2.setSide(Direction.SOUTH, fm.makeWall());
		r2.setSide(Direction.WEST, aDoor);
		
		return aMaze;
	}
}
