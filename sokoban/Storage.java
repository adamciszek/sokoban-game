package sokoban;

/**
 * A class that represents the location of a storage spot in the
 * game Sokoban.
 */
public class Storage {
	private Location loc;

	/**
	 * Initialize a storage spot with the specified location.
	 * 
	 * @param loc the location of this storage spot
	 */
	public Storage(Location loc) {
		this.loc = loc;
	}
	
	/**
	 * Returns the location of this storage spot.
	 * 
	 * @return the location of this storage spot
	 */
	public Location location() {
		return this.loc;
	}
}
