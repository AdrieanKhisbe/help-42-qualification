package fr.upmc.help42.object;


public class Row {
	
	private int nbFree;

	private Server[] servers;
	
	public Row(int nbCases){
		servers = new Server[nbCases];
		nbFree = nbCases;
	}
	
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

	public void setUnavailable(int index) throws Exception{
		servers[index] = new UnavailableCase();
		nbFree--;
		if (nbFree < 0)
			throw new Exception("More free spaces than cases");
	}
	
	public void addServer(int indexServer, Server serv) throws Exception{
		boolean b = indexServer + serv.getSize() < servers.length;
		
		for(int i = indexServer; i < serv.getSize() && b; i++){
			if (servers[i] != null
					&& servers[i] instanceof UnavailableCase)
				b = false;
		}
		
		if (!b) throw new Exception("No space left for the server");
		
		for(int i = indexServer; i < serv.getSize(); i++){
			servers[i] = serv;
		}
		serv.setMyRow(this);
		nbFree -= serv.getSize();
		
	}

}
