package fr.upmc.help42.problem;

import fr.upmc.help42.object.ServerAllocation;

import java.util.List;

/**
 * @author Adriean Khisbe
 */
public class DatacenterAllocation {

    List<ServerAllocation> servers;
    
    
    //FIXME: eval method
    private int score;

    public int getScore() {
        return score;
    }

    public List<ServerAllocation> getServers() {
        return servers;
    }
}
