package fr.upmc.help42.object;

import java.util.Arrays;

public class Row {

	private int nbFree;

	private Location[] servers;

	public Row(int nbCases) {
		servers = new Location[nbCases];
		nbFree = nbCases;
	}

	public int getNbFree() {
		return nbFree;
	}

	public void setNbFree(int nbFree) {
		this.nbFree = nbFree;
	}

	public Location[] getServers() {
		return servers;
	}

	public void setUnavailable(int index, UnavailableLocation uL)
			throws Exception {
		servers[index] = uL;
		nbFree--;
		if (nbFree < 0)
			throw new Exception("More free spaces than cases");
	}

	public void addServer(int indexServer, Server serv) throws Exception {
		boolean b = indexServer + serv.getSize() < servers.length;

		for (int i = indexServer; i < serv.getSize() && b; i++) {
			if (servers[i] != null && servers[i] instanceof UnavailableLocation)
				b = false;
		}

		if (!b)
			throw new Exception("No space left for the server");

		for (int i = indexServer; i < serv.getSize(); i++) {
			servers[i] = serv;
		}
		nbFree -= serv.getSize();

	}

	@Override
	public String toString() {
		return "Row [nbFree=" + nbFree + ", servers="
				+ Arrays.toString(servers) + "]";
	}

}
