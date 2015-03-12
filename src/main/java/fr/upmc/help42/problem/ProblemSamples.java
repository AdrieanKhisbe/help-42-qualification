package fr.upmc.help42.problem;

/**
 * @author Adriean Khisbe
 */
public class ProblemSamples {

    public static final DatacenterRepresentation SIMPLE;


    static {
        SIMPLE = new DatacenterRepresentation(2, 5, 1, 2, 5);
        SIMPLE.addServer(0, 3, 10);
        SIMPLE.addServer(1, 3, 10);
        SIMPLE.addServer(2, 2, 5);
        SIMPLE.addServer(3, 1, 5);
        SIMPLE.addServer(4, 1, 1);
        SIMPLE.addUnavailableLocation(0, 0);

    }

}
