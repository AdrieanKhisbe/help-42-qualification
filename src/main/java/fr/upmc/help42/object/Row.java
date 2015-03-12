package fr.upmc.help42.object;

public class Row {
	
	private int nbFree;
    private Server[] servers;
	
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

	
}
