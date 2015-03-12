package fr.upmc.help42.object;

/**
 * @author Adriean Khisbe
 */
public class UnavailableLocation extends Location {

	public final int row, irow;

	public UnavailableLocation(int row, int irow) {
		this.row = row;
		this.irow = irow;
	}

	public int getIrow() {
		return irow;
	}

	public int getRow() {
		return row;
	}
}
