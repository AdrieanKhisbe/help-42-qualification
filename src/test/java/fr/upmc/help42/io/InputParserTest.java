package fr.upmc.help42.io;

import fr.upmc.help42.problem.DatacenterRepresentation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Adriean Khisbe
 */
public class InputParserTest {


    private DatacenterRepresentation representation;
    
    @Test
    public void testBasicInputOk() throws Exception {


        representation = InputParser.readInput("classpath:/data/simple.in");

        assertEquals("good Representation basic", representation, new DatacenterRepresentation(2, 5, 1, 2, 5));

    }
}
