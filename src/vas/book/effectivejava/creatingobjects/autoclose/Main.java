package vas.book.effectivejava.creatingobjects.autoclose;

/**
 *
 * @author vinicius
 */
public class Main {

    public static void main(String[] args) {
        try (Door door = new Door()) {
            door.passThrough();
        } catch (Exception ex) {
        }
    }

}
