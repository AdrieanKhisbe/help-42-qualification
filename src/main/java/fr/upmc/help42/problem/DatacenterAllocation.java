package fr.upmc.help42.problem;

import com.google.common.primitives.Ints;
import fr.upmc.help42.object.ServerAllocation;

import java.util.Collections;
import java.util.List;

/**
 * @author Adriean Khisbe
 */
public class DatacenterAllocation {

	List<ServerAllocation> servers;

	public DatacenterAllocation(List<ServerAllocation> servers) {
		this.servers = servers;
	}

	// FIXME: eval method
	private int score;

	public int getScore() {
		return score;
	}

	public List<ServerAllocation> getServers() {
		return servers;
	}

	public void sort() {
		Collections.sort(servers,
				(ServerAllocation x, ServerAllocation y) -> Ints.compare(x
						.getServer().getId(), y.getServer().getId()));
	}

}
