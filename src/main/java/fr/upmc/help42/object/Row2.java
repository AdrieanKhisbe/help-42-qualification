package fr.upmc.help42.object;


import com.google.common.collect.Maps;

import java.util.Map;

public class Row2 {
    
    
    static enum Status {
        FREE, BUSY, DEAD
    }
	
	private final int size;
    private final Status[] status;
    
    private final Map<Server, Integer> servers;
    // private final MultiMap<Integer, Integer> index; // id: size, indexes

    public Row2(int size) {
        this.size = size;
        this.status = new Status[size];
        this.servers = Maps.newHashMap();
        
    }
    
    
    
    
    
}
