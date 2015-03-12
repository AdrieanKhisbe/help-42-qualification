package fr.upmc.help42.io;

import com.google.common.primitives.Ints;
import fr.upmc.help42.object.ServerAllocation;
import fr.upmc.help42.problem.DatacenterAllocation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Class to serialize our solution
 *
 * @author Adriean Khisbe
 */
public class SolutionSerializer {
    
    public static void serialize(String path, DatacenterAllocation solution) throws IOException{
        Path outPath = Paths.get(path);

        try (BufferedWriter bw = Files.newBufferedWriter(outPath);
             PrintWriter pw = new PrintWriter(bw);) {
            List<ServerAllocation> servers = solution.getServers();
            Collections.sort(servers, (ServerAllocation x, ServerAllocation y) -> {
                return Ints.compare(x.getServer().getId(), y.getServer().getId());
            });
            for (ServerAllocation serv : servers) {
                if (serv.getGroup() < 0) {
                    pw.println("x");
                } else {
                    pw.format("%d %d %d", serv.getRow(), serv.getIrow(), serv.getGroup());
                }
            }
        }
        
    }
    
}
