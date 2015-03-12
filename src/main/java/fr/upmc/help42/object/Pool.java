package fr.upmc.help42.object;

import java.util.ArrayList;
import java.util.List;

public class Pool {
	private int id;
	private int minCapacity;
	private List<Server> servers;
	
	public Pool(int id){
		this.id = id;
		servers = new ArrayList<Server>();
		minCapacity = Integer.MAX_VALUE;
	}

	public int getId() {
		return id;
	}

	public int getMinCapacity() {
		return minCapacity;
	}

	public List<Server> getServers() {
		return servers;
	}
	
	public void addServer(Server serv) {
		servers.add(serv);
		
		if (minCapacity > serv.getCapacity())
			minCapacity = serv.getCapacity();
	}
}
