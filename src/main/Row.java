package main;

public class Row {
	
	private int nbFree;
	
	public int getNbFree() {
		return nbFree;
	}
	public void setNbFree(int nbFree) {
		this.nbFree = nbFree;
	}
	public Server[] getServers() {
		return servers;
	}
	public void setServers(Server[] servers) {
		this.servers = servers;
	}
	private Server[] servers;
	
}
