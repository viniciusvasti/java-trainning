package vas.book.effectivejava.creatingobjects.autoclose;

/**
 *
 * @author vinicius
 */
public class Door implements AutoCloseable {
    
    public void passThrough() {
        System.out.println("passing through the door");
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing the door");
    }
    
}
