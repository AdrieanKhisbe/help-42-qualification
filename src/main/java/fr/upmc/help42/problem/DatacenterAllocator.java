package fr.upmc.help42.problem;

/**
 * Contract of the algorithms.
 *
 * @author Adriean Khisbe
 */
public interface DatacenterAllocator {
    
    DatacenterAllocation resolve(DatacenterRepresentation dc) throws Exception;
    
}
