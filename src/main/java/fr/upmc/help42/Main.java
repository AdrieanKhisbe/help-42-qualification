package fr.upmc.help42;


import fr.upmc.help42.io.InputParser;
import fr.upmc.help42.io.SolutionSerializer;
import fr.upmc.help42.problem.DatacenterAllocation;
import fr.upmc.help42.problem.DatacenterAllocator;
import fr.upmc.help42.problem.DatacenterRepresentation;
import fr.upmc.help42.problem.solution1.Algo1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Main classe pour lancer EVERYTHING 
 */
public class Main {

	public static DatacenterRepresentation problem;
    
    private static final Logger log = LoggerFactory.getLogger(Main.class);


    public static final String DEF_IN = "src/main/resources/data/dc.in", DEF_OUT = "res";

    public static void main(String args[]) throws Exception {

        String inPath = args.length > 0 && args[0] != null ? args[0] : DEF_IN;
        String outPath = args.length > 1 && args[1] != null ? args[1] : DEF_OUT;

        problem = InputParser.readInput(inPath);

        DatacenterAllocator resolver = new Algo1(); //

        DatacenterAllocation solution = resolver.resolve(problem);

        SolutionSerializer.serialize(outPath, solution);
        log.info("PROBLEM SOLVED :D");
        log.debug("see file {}, code {}", outPath, solution.getScore());

	}
}
