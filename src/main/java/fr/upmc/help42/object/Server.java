package fr.upmc.help42.object;

/**
 * @author Adriean Khisbe
 */
public class Server {

    private int id;
    private int size;
    private int capacity;


    public Server(int id, int size, int capacity) {
        this.id = id;
        this.size = size;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
