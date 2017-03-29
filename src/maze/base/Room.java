package maze.base;

public class Room extends MapSite {
	private int roomNumber;
	private MapSite sides[]=new MapSite[4];
	
	Room () {}
	public Room (int n) { 
		this.roomNumber = n; 
	}
	public int getRoomNumber(){
		return this.roomNumber;
	}
	MapSite getSide (Direction dir) {
		return this.sides[dir.ordinal()];
	}
	
	public void setSide (Direction dir, MapSite s){}
	
	@Override
	void enter() {
		// TODO Auto-generated method stub

	}

}
