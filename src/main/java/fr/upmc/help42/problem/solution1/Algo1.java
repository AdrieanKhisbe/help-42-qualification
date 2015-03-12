package fr.upmc.help42.problem.solution1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.upmc.help42.object.Row;
import fr.upmc.help42.object.Server;
import fr.upmc.help42.object.UnavailableLocation;
import fr.upmc.help42.problem.DatacenterAllocation;
import fr.upmc.help42.problem.DatacenterAllocator;
import fr.upmc.help42.problem.DatacenterRepresentation;

public class Algo1 implements DatacenterAllocator {

	private Row[] rows;
	private Pool[] pools;

	@Override
	public DatacenterAllocation resolve(DatacenterRepresentation dc) throws Exception {
		initRow(dc.R, dc.S, dc.unavailableCases);
		locate(dc.servers);
		
		return null;
	}

	private void initRow(int R, int S,
			List<UnavailableLocation> unavailableLocations) {
		rows = new Row[R];
		for (int i = 0; i < R; i++)
			rows[i] = new Row(S);

		for (UnavailableLocation uL : unavailableLocations)
			
			;
	}

	private void locate(List<Server> servers) throws Exception {
		Collections.sort(servers, new Comparator<Server>() {

			@Override
			public int compare(Server o1, Server o2) {
				return (o1.getCapacity() > o2.getCapacity()
						|| o1.getCapacity() == o2.getCapacity()
						&& o1.getSize() > o2.getSize() ? 1 : 0);
			}
		});

		int indexRow = 0;
		for (int i = 0; i < servers.size(); i++) {
			Row row = rows[indexRow];
			Server server = servers.get(i);

			if (row.getNbFree() < server.getSize()) {
				continue;
				// TODO
			} else {
				for (int j = 0; j < row.getServers().length - server.getSize(); j++) {
					boolean possible = true;
					for (int k = j; k < j + server.getSize() && possible; k++) {
						possible &= row.getServers()[k] == null;
					}
					if (possible) {
						row.addServer(j, server);
						indexRow = indexRow++ % rows.length;
						break;
					}
				}
			}
		}
	}
	
	private void createGroup() {
		
	}

}
