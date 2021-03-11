package sokoban;

public class Box {
	private Location loc;

	/**
	 * Initialize a box with the specified location.
	 * 
	 * @param loc the location of this box
	 */
	public Box(Location loc) {
		this.loc = loc;
	}

	/**
	 * Returns the location of this box.
	 * 
	 * @return the location of this box
	 */
	public Location location() {
		return this.loc;
	}

	/**
	 * Move the box to the specified location, changing the box's location,
	 * only if the specified location is adjacent to the box's current location.
	 * If the specified location is not adjacent to the box's current location
	 * then the box's location does not change and false is returned.
	 * 
	 * @param to a location to move the box to
	 * @return true if the box moves to the specified location, false otherwise
	 */
	public boolean moveTo(Location to) {
		if (this.loc.isAdjacentTo(to)) {
			this.loc = to;
			return true;
		}
		return false;
	}

	/**
	 * Move the box to the adjacent location to the left, changing
	 * the box's location.
	 */
	public void moveLeft() {
		this.loc = this.loc.left();
	}

	/**
	 * Move the box to the adjacent location to the right, changing
	 * the box's location.
	 */
	public void moveRight() {
		this.loc = this.loc.right();
	}

	/**
	 * Move the box to the adjacent location above, changing
	 * the box's location.
	 */
	public void moveUp() {
		this.loc = this.loc.up();
	}

	/**
	 * Move the box to the adjacent location below, changing
	 * the box's location.
	 */
	public void moveDown() {
		this.loc = this.loc.down();
	}
}
