package fr.upmc.help42.problem;

import java.util.List;

/**
 * Lance plusieur allocation, récupère la meilleure
 *
 * @author Adriean Khisbe
 */
public class AllocatorMaximizer implements DatacenterAllocator {

    List<DatacenterAllocator> allocations;


    @Override
    public DatacenterAllocation resolve(DatacenterRepresentation dc) {
        //allocations.stream().map(DatacenterAllocator::resolve).

        return null;
    }
}
