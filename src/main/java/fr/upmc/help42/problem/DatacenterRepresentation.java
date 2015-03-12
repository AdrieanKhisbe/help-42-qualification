package fr.upmc.help42.problem;

import com.google.common.collect.Lists;
import fr.upmc.help42.object.Server;
import fr.upmc.help42.object.UnavailableCase;

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
    
    public final List<UnavailableCase> unavailableCases;
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
    
    
    
    
}
