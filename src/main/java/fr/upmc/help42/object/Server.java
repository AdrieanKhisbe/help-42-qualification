package fr.upmc.help42.object;

public class Server extends Location {
	
	private int id;
	private int size;
	private int capacity;
	private Row myRow;
	private Pool myPool;
	
	public Server(int id, int cap, int size){
		this.id = id;
		this.capacity = cap;
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getId() {
		return id;
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
