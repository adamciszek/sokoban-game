package sokoban;

/**
 * A class that represents a location using a pair of integer coordinates
 * {@code (x, y)}. A {@code Location} object is immutable.
 * 
 * <p>
 * The positive x-direction points to the right and the positive y-direction
 * points downwards.
 */
public class Location {

	private int x;
	private int y;

	/**
	 * Initializes this location to (0, 0).
	 */
	public Location() {
		this.x = 0;
		this.y = 0;
		
	}

	/**
	 * Initializes this location to (x, y).
	 * 
	 * @param x the x-coordinate of this location
	 * @param y the y-coordinate of this location
	 */
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Initializes this location by copying the coordinates of another location.
	 * 
	 * @param other the location to copy
	 */
	public Location(Location other) {
		this.x = other.x;
		this.y = other.y;
	}

	/**
	 * Return the x-coordinate of this location.
	 * 
	 * @return the x-coordinate of this location
	 */
	public int x() {
		// ALREADY DONE FOR YOU
		return this.x;
	}

	/**
	 * Return the y-coordinate of this location.
	 * 
	 * @return the y-coordinate of this location
	 */
	public int y() {
		// ALREADY DONE FOR YOU
		return this.y;
	}

	/**
	 * Return the location immediately to the left of this location.
	 * 
	 * @return the location immediately to the left of this location
	 */
	public Location left() {
		Location leftOf = new Location((this.x)-1, this.y);
		return leftOf;
	}

	/**
	 * Return the location immediately to the right of this location.
	 * 
	 * @return the location immediately to the right of this location
	 */
	public Location right() {
		Location rightOf = new Location((this.x)+1, this.y);
		return rightOf;
	}

	/**
	 * Return the location immediately above this location.
	 * 
	 * @return the location immediately above this location
	 */
	public Location up() {
		Location above = new Location((this.x), (this.y)-1);
		return above;
	}

	/**
	 * Return the location immediately below this location.
	 * 
	 * @return the location immediately below this location
	 */
	public Location down() {
		Location below = new Location((this.x), (this.y)+1);
		return below;
	}

	/**
	 * Returns {@code true} if this location is immediately to the left, right,
	 * above, or below another location, {@code false} otherwise. Diagonally
	 * adjacent locations are considered to be not adjacent by this method.
	 * 
	 * @param other the location to test for adjacency
	 * @return true if this location is adjacent to a second location, false
	 *         otherwise
	 */
	public boolean isAdjacentTo(Location other) {
		if ((this.x()-other.x) == 1 || (this.x()-other.x) == -1) {
			if ((this.y()-other.y) == 1 || (this.y()-other.y) == -1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Compares this location to another location for equality. Two locations are
	 * equal if and only if they are {@code Location} objects having equal
	 * coordinates.
	 * 
	 * @param obj the object to test for equality
	 * @return true if this location has the same coordinates as the other location,
	 *         false otherwise
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Location other = (Location) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	/**
	 * Returns a hash code for this location.
	 * 
	 * @return a hash code for this location
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	/**
	 * Returns a string representation for this location. The returned string is the
	 * x-coordinate of this location inside a pair of square brackets followed by
	 * the the x-coordinate of this location inside a pair of square brackets.
	 * For example, the location with coordinates (-5, 10) has a string
	 * representation equal to {@code "[-5][10]"}.
	 * 
	 * @return a string representation of this location
	 */
	@Override
	public String toString() {
		String toReturn = "[" + this.x() + "]" + " " + "[" + this.y() +"]";
		return toReturn;
	}
}
