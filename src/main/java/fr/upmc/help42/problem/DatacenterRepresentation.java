package fr.upmc.help42.problem;

import com.google.common.collect.Lists;
import fr.upmc.help42.object.tmp.Server;
import fr.upmc.help42.object.tmp.UnavailableLocation;

import java.util.List;

/**
 * Problem representation
 *
 * @author Adriean Khisbe
 */
public class DatacenterRepresentation {

    //FIXME DOC
    
    public  final Integer R;
    public  final Integer S;
    public  final Integer U;
    public  final Integer P;
    public  final Integer M;
    
    public final List<UnavailableLocation> unavailableCases;
    public final List<Server> servers;

    
    public DatacenterRepresentation(Integer r, Integer s, Integer u, Integer p, Integer m) {
        R = r;
        S = s;
        U = u;
        P = p;
        M = m;
        unavailableCases = Lists.newArrayList();
        servers = Lists.newArrayList();
    }


    public void addUnavailableLocation(int r, int s) {
        unavailableCases.add(new UnavailableLocation(r, s));

    }


    public void addServer(int id, int capacity, int size) {
        Server s = new Server(id, capacity, size);
        addServer(s);
    }

    public void addServer(Server s) {
        servers.add(s);
    }
    
    
}
