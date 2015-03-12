package fr.upmc.help42.object;

/**
 * @author Adriean Khisbe
 */
public class ServerAllocation {

	private Server server;
	private int group;
	private int row;
	private int irow;

	public ServerAllocation(Server server, int group, int row, int irow) {
		this.server = server;
		this.group = group;
		this.row = row;
		this.irow = irow;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getIrow() {
		return irow;
	}

	public void setIrow(int irow) {
		this.irow = irow;
	}

	@Override
	public String toString() {
		return "ServerAllocation [server=" + server + ", group=" + group
				+ ", row=" + row + ", irow=" + irow + "]";
	}

}
