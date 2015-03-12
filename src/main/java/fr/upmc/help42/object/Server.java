package fr.upmc.help42.object;

public class Server {
	
	private int size;
	private int capacity;
	private int id;
	private Row myRow;
	private Pool myPool;

	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Row getMyRow() {
		return myRow;
	}
	public void setMyRow(Row myRow) {
		this.myRow = myRow;
	}
	public Pool getMyPool() {
		return myPool;
	}
	public void setMyPool(Pool myPool) {
		this.myPool = myPool;
	}
}
