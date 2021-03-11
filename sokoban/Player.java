package sokoban;

/**
 * A class that represents the location of the player in the game Sokoban.
 * 
 * <p>
 * The player can move to one of the four locations that are immediately
 * adjacent to the current location.
 */
public class Player {
	private Location loc;

	/**
	 * Initialize a player with the specified location.
	 * 
	 * @param loc the location of this player
	 */
	public Player(Location loc) {
		this.loc = loc;
	}

	/**
	 * Returns the location of this player.
	 * 
	 * @return the location of this player
	 */
	public Location location() {
		return this.loc;
	}

	/**
	 * Move the player to the specified location, changing the player's location,
	 * only if the specified location is adjacent to the player's current location.
	 * If the specified location is not adjacent to the player's current location
	 * then the player's location does not change and false is returned.
	 * 
	 * @param to a location to move the player to
	 * @return true if the player moves to the specified location, false otherwise
	 */
	public boolean moveTo(Location to) {
		if (this.loc.isAdjacentTo(to)) {
			this.loc = to;
			return true;
		}
		return false;
	}

	/**
	 * Move the player to the adjacent location to the left, changing
	 * the player's location.
	 */
	public void moveLeft() {
		this.loc = this.loc.left();
	}

	/**
	 * Move the player to the adjacent location to the right, changing
	 * the player's location.
	 */
	public void moveRight() {
		this.loc = this.loc.right();
	}

	/**
	 * Move the player to the adjacent location above, changing
	 * the player's location.
	 */
	public void moveUp() {
		this.loc = this.loc.up();
	}

	/**
	 * Move the player to the adjacent location below, changing
	 * the player's location.
	 */
	public void moveDown() {
		this.loc = this.loc.down();
	}
}
