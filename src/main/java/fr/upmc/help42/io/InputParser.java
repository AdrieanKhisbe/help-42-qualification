package fr.upmc.help42.io;

import fr.upmc.help42.problem.DatacenterRepresentation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Class to parse the input received
 *
 * @author Adriean Khisbe
 */
public class InputParser {

    private static final Logger log = LoggerFactory.getLogger(InputParser.class);


    public static DatacenterRepresentation readInput(String path) throws IOException {

        DatacenterRepresentation repr;

        Path p = Paths.get(path);
        try (InputStream is = Files.newInputStream(p);
             Scanner sc = new Scanner(is);) {

            int R, S, U, P, M;
            R = sc.nextInt();
            S = sc.nextInt();
            U = sc.nextInt();
            P = sc.nextInt();
            M = sc.nextInt();

            repr = new DatacenterRepresentation(R, S, U, P, M);

            sc.nextLine();
            for (int i = 0; i < U; i++) {
                int r = sc.nextInt(), ir = sc.nextInt();
                repr.addUnavailableLocation(r, ir);
                sc.nextLine();
            }

            for (int i = 0; i < U; i++) {
                int nbEmp = sc.nextInt(), cap = sc.nextInt();
                repr.addServer(i, nbEmp, cap);
                sc.nextLine();
            }


        } catch (Exception e) {
            throw new IOException(e);
        }

        return repr;
    }
    
    
}
