package maze;

public class Door extends MapSite {
	private Room room1;
	private Room room2;
	private boolean isOpen;
	
	Door (Room r1, Room r2) {}
	
	Room otherSideFrom (Room room) {
		if(room.equals(this.room1)){
			return this.room2;
		}else if(room.equals(this.room2)){
			return this.room1;
		}else{
			return null;
		}
	}
	
	@Override
	void enter() {
		// TODO Auto-generated method stub

	}

}
