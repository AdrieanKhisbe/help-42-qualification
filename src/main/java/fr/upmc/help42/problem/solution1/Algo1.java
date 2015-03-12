package fr.upmc.help42.problem.solution1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.upmc.help42.object.Location;
import fr.upmc.help42.object.Pool;
import fr.upmc.help42.object.Row;
import fr.upmc.help42.object.Server;
import fr.upmc.help42.object.ServerAllocation;
import fr.upmc.help42.object.UnavailableLocation;
import fr.upmc.help42.problem.DatacenterAllocation;
import fr.upmc.help42.problem.DatacenterAllocator;
import fr.upmc.help42.problem.DatacenterRepresentation;

public class Algo1 implements DatacenterAllocator {

	private Row[] rows;
	private Pool[] pools;
	private List<ServerAllocation> serverAlloc;

	@Override
	public DatacenterAllocation resolve(DatacenterRepresentation dc)
			throws Exception {
		serverAlloc = new ArrayList<ServerAllocation>();
		for (Server s : dc.servers)
			serverAlloc.add(new ServerAllocation(s, -1, -1, -1));

		initRow(dc.R, dc.S, dc.unavailableCases);
		locate(serverAlloc);
		createGroup(dc.P);
		return new DatacenterAllocation(serverAlloc);
	}

	private void initRow(int R, int S,
			List<UnavailableLocation> unavailableLocations) throws Exception {
		rows = new Row[R];
		for (int i = 0; i < R; i++)
			rows[i] = new Row(S);

		for (UnavailableLocation uL : unavailableLocations)
			rows[uL.row].setUnavailable(uL.irow, uL);
	}

	private void locate(List<ServerAllocation> servers) throws Exception {
		Collections.sort(servers, new Comparator<ServerAllocation>() {

			@Override
			public int compare(ServerAllocation o1, ServerAllocation o2) {
				return (o1.getServer().getCapacity() > o2.getServer()
						.getCapacity()
						|| o1.getServer().getCapacity() == o2.getServer()
								.getCapacity()
						&& o1.getServer().getSize() > o2.getServer().getSize() ? 1
						: 0);
			}
		});

		int indexRow = 0;
		for (int i = 0; i < servers.size(); i++) {
			Row row = rows[indexRow];
			ServerAllocation server = servers.get(i);

			if (row.getNbFree() < server.getServer().getSize()) {
				continue;
				// TODO
			} else {
				for (int j = 0; j < row.getServers().length
						- server.getServer().getSize(); j++) {
					boolean possible = true;
					for (int k = j; k < j + server.getServer().getSize()
							&& possible; k++) {
						possible &= row.getServers()[k] == null;
					}
					if (possible) {
						row.addServer(j, server.getServer());
						server.setRow(indexRow);
						server.setIrow(j);
						indexRow = indexRow++ % rows.length;
						break;
					}
				}
			}
		}
	}

	private void createGroup(int P) {
		pools = new Pool[P];
		for (int i = 0; i < P; i++)
			pools[i] = new Pool(i);
		int indexPools = 0;
		for (Row row : rows) {
			int i = 0;
			while (i < row.getServers().length) {
				Location location = row.getServers()[i];
				if (location != null && location instanceof Server) {
					pools[indexPools].addServer((Server) location);
					ServerAllocation serverAllocation = null;
					for (ServerAllocation serverA : serverAlloc) {
						if (serverA.getServer().equals(location))
							serverAllocation = serverA;
					}
					if (serverAllocation != null)
						serverAllocation.setGroup(indexPools);
					indexPools = indexPools++ % pools.length;
					i += ((Server) location).getSize();
				} else {
					i++;
				}
			}
		}
	}

}
