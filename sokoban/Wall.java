package sokoban;

/**
 * A class that represents the location of a wall in the
 * game Sokoban.
 */
public class Wall {
	private Location loc;

	/**
	 * Initialize a wall with the specified location.
	 * 
	 * @param loc the location of this wall
	 */
	public Wall(Location loc) {
		this.loc = loc;
	}
	
	/**
	 * Returns the location of this wall.
	 * 
	 * @return the location of this wall
	 */
	public Location location() {
		return this.loc;
	}
}
