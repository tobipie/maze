package maze.base;



public class MazeGame {
	Maze createMaze () {
		Maze aMaze = new Maze();
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door aDoor = new Door(r1, r2);
		
		aMaze.addRoom(r1);
		aMaze.addRoom(r2);
		
		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.EAST, aDoor);
		r1.setSide(Direction.SOUTH, new Wall());
		r1.setSide(Direction.WEST, new Wall());
		r2.setSide(Direction.NORTH, new Wall());
		r2.setSide(Direction.EAST, new Wall());
		r2.setSide(Direction.SOUTH, new Wall());
		r2.setSide(Direction.WEST, aDoor);
		
		return aMaze;
	}
}
